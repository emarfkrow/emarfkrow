package jp.co.golorp.emarf.report;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.time.LocalDateTime;
import jp.co.golorp.emarf.util.Messages;

public final class XlsxUtil {

    /** プライベートコンストラクタ */
    private XlsxUtil() {
    }

    /**
     * 帳票エクセルを一時ディレクトリに作成し、パスを返す.
     * @param pathes
     * @param layoutFileName レイアウトファイル名
     * @param layoutSheetMap   Map<レイアウトシート名, Map<追加するシート名, Map<データの名称, Object>>>
     * @param baseMei        保存ファイル接頭辞
     * @return 保存ファイルパス
     */
    public static String getGeneratedPath(final List<String> pathes, final String layoutFileName,
            final Map<String, Map<String, Map<String, Object>>> layoutSheetMap, final String baseMei) {

        // テンプレートファイルのロック防止のため、テンプレートファイルを作業用ファイルにコピー
        String layoutFilePath = App.get("context.path.layouts") + File.separator + String.join(File.separator, pathes)
                + File.separator + layoutFileName;
        File layoutFile = FileUtil.get(layoutFilePath);

        if (!layoutFile.exists()) {
            return getGeneratedPath(pathes, layoutFileName, layoutSheetMap, baseMei);
        }

        Workbook layoutBook = XlsxUtil.getWorkbook(layoutFile);
        String extension = layoutFile.getName().replaceAll("^.+\\.", "");
        File workFile = XlsxUtil.write(layoutBook, baseMei, extension);

        // 作業用ファイルをワークブックとして取得
        Workbook workbook = XlsxUtil.getWorkbook(workFile);
        // シーケンシャルアクセス専用のチューニング
        // workbook = new SXSSFWorkbook((XSSFWorkbook) workbook);

        // ワークブック用データjsonでループ
        for (Entry<String, Map<String, Map<String, Object>>> layoutSheet : layoutSheetMap.entrySet()) {

            // レイアウトシート名
            String layoutSheetName = layoutSheet.getKey();

            // 追加シートデータ
            Map<String, Map<String, Object>> addSheetMap = layoutSheet.getValue();

            // 作業用ファイルにシート追加
            addSheets(workbook, layoutSheetName, addSheetMap);
        }

        // 作業用ファイルを別名で保管して作業用ファイルを削除
        File file = XlsxUtil.write(workbook, baseMei, extension);
        workFile.delete();

        // 保管したファイルパスを返す
        return file.getAbsolutePath();
    }

    /**
     * @param workbook        作業用ファイル
     * @param layoutSheetName レイアウトシート名
     * @param addSheetMap     Map<追加するシート名, Map<データの名称, Object>>
     */
    private static void addSheets(final Workbook workbook, final String layoutSheetName,
            final Map<String, Map<String, Object>> addSheetMap) {

        // レイアウトシートを取得
        Sheet layoutSheet = workbook.getSheet(layoutSheetName);

        // タイトル項目のプレースホルダのアドレスを初期化
        Map<String, CellAddress> titleAddresses = new HashMap<String, CellAddress>();

        // レイアウトシートの使用範囲内で、行・列ループして、タイトル項目のアドレスを取得
        for (int r = 0; r <= layoutSheet.getLastRowNum(); r++) {
            Row row = layoutSheet.getRow(r);
            if (row == null) {
                continue;
            }
            for (int c = 0; c < row.getLastCellNum(); c++) {
                Cell cell = CellUtil.getCell(row, c);
                Object o = XlsxUtil.getCellValue(cell);
                if (o == null) {
                    continue;
                }

                String s = String.valueOf(o);
                if (s.matches("^#\\{.+\\}$")) {
                    String key = s.replaceAll("^#\\{|\\}$", "");
                    titleAddresses.put(key, new CellAddress(r, c));
                }
            }
        }

        for (Entry<String, CellAddress> address : titleAddresses.entrySet()) {
            setCellValue(layoutSheet, address.getValue(), Messages.get(address.getKey()));
        }

        // addSheetMapでループ
        for (Entry<String, Map<String, Object>> addSheet : addSheetMap.entrySet()) {

            // 追加するシート名
            String addSheetName = addSheet.getKey();

            // 追加するシートの内容
            Map<String, Object> sheetDataMap = addSheet.getValue();

            // レイアウトシートをコピーしてシート名を変更
            int layoutSheetIndex = workbook.getSheetIndex(layoutSheet);
            Sheet newSheet = workbook.cloneSheet(layoutSheetIndex);
            workbook.setSheetName(workbook.getSheetIndex(newSheet), addSheetName);

            print(newSheet, sheetDataMap);
        }

        // レイアウトシートを削除
        workbook.removeSheetAt(workbook.getSheetIndex(layoutSheet));
    }

    private static void print(final Sheet sheet, final Map<String, Object> sheetDataMap) {

        for (Entry<String, Object> sheetData : sheetDataMap.entrySet()) {

            // アクション名かエンティティ名（TEntitySearchかTEntity）
            String dataName = sheetData.getKey();

            Object data = sheetData.getValue();

            if (data instanceof List) {
                // 一覧系エクセル

                // レイアウトシートの使用範囲内で、行・列ループして、各プレースホルダのアドレスを取得
                Map<String, CellAddress> meisaiAddresses = new HashMap<String, CellAddress>();
                Range range = getRange(sheet, meisaiAddresses, dataName);

                @SuppressWarnings("unchecked")
                List<Map<String, Object>> list = (List<Map<String, Object>>) data;

                // 明細行インデクス
                int meisaiIndex = 0;

                // 使用行数
                int rowHeight = range.getEoR() - range.getBoR() + 1;

                for (Map<String, Object> meisaiJson : list) {

                    // 明細段組み１行目
                    int currentFirstRowIndex = range.getBoR() + meisaiIndex * rowHeight;

                    // 明細２行目以降ならレイアウトをコピー
                    if (meisaiIndex > 0) {
                        copyRange(sheet, range, currentFirstRowIndex);
                    }

                    // 明細行を処理
                    for (Entry<String, Object> itemJson : meisaiJson.entrySet()) {
                        String k = itemJson.getKey();
                        Object v = itemJson.getValue();

                        // プレースホルダを退避済みならセル値を設定
                        CellAddress address = meisaiAddresses.get(k);
                        if (address == null) {
                            address = meisaiAddresses.get(StringUtil.toCamelCase(k));
                        }
                        if (address == null) {
                            address = meisaiAddresses.get(dataName + "." + k);
                        }
                        if (address != null) {
                            int r = currentFirstRowIndex + address.getRow() - range.getBoR();
                            setCellValue(sheet, r, address.getColumn(), v);
                        }
                    }

                    ++meisaiIndex;
                }

            } else if (data instanceof Map) {
                // 単票系エクセル

                @SuppressWarnings("unchecked")
                Map<String, Object> map = (Map<String, Object>) data;

                for (Entry<String, Object> field : map.entrySet()) {
                    String fieldName = field.getKey();
                    Object fieldValue = field.getValue();

                    if (fieldValue instanceof List) {
                        // Listがネストしている場合

                        Map<String, Object> nestMap = new HashMap<String, Object>();
                        nestMap.put(fieldName, fieldValue);
                        print(sheet, nestMap);

                    } else if (fieldValue instanceof Map) {
                        // Mapがネストしている場合

                        Map<String, Object> nestMap = new HashMap<String, Object>();
                        nestMap.put(fieldName, fieldValue);
                        print(sheet, nestMap);

                    } else {
                        // ListでもMapでもない場合

                        // ヘッダ項目と明細項目のプレースホルダのアドレスを初期化
                        Map<String, CellAddress> headerAddresses = new HashMap<String, CellAddress>();

                        // レイアウトシートの使用範囲内で、行・列ループして、各プレースホルダのアドレスを取得
                        for (int r = 0; r <= sheet.getLastRowNum(); r++) {
                            Row row = sheet.getRow(r);
                            if (row == null) {
                                continue;
                            }
                            for (int c = 0; c < row.getLastCellNum(); c++) {
                                Cell cell = CellUtil.getCell(row, c);
                                Object o = XlsxUtil.getCellValue(cell);
                                if (o == null) {
                                    continue;
                                }

                                String s = String.valueOf(o);
                                if (s.matches("^\\{\\{.+\\}\\}$")) {

                                    // ヘッダ項目の座標を退避
                                    String key = s.replaceAll("^\\{\\{|\\}\\}$", "");
                                    headerAddresses.put(key, new CellAddress(r, c));
                                }
                            }
                        }

                        CellAddress address = headerAddresses.get(fieldName);
                        if (address == null) {
                            address = headerAddresses.get(dataName + "." + fieldName);
                        }
                        if (address != null) {
                            setCellValue(sheet, address, fieldValue);
                        }
                    }
                }
            }
        }
    }

    private static Range getRange(final Sheet sheet, final Map<String, CellAddress> meisaiAddresses,
            final String prefix) {

        String prefixText = "";
        if (prefix != null) {
            prefixText = prefix + "\\.";
        }

        Range range = new Range();

        for (Integer r = 0; r <= sheet.getLastRowNum(); r++) {

            Row row = sheet.getRow(r);
            if (row == null) {
                continue;
            }

            for (int c = 0; c < row.getLastCellNum(); c++) {
                Cell cell = CellUtil.getCell(row, c);
                Object o = XlsxUtil.getCellValue(cell);
                if (o == null) {
                    continue;
                }

                String s = String.valueOf(o);
                if (s.matches("^\\[\\[" + prefixText + ".+\\]\\]$") || s.matches("^\\[\\[.+\\]\\]$")) {

                    // 明細項目の座標を退避
                    String key = s.replaceAll("^\\[\\[|\\]\\]$", "");
                    meisaiAddresses.put(key, new CellAddress(r, c));

                    // 明細定義域を更新
                    range.setBoR(r);
                    range.setEoR(r);
                    range.setBoC(c);
                    range.setEoC(c);
                }
            }
        }

        return range;
    }

    /**
     * エクセルファイルを保管してファイルパスを返す
     *
     * @param workbook
     * @param fileBaseMei
     * @param extension
     * @return 作成したファイルパス
     */
    private static File write(final Workbook workbook, final String fileBaseMei, final String extension) {

        // 保存ファイルパス
        String saveDir = App.get("context.path.temp");
        String timestamp = LocalDateTime.ymdhmsS();
        String writeFileName = fileBaseMei + "." + timestamp + "." + extension;
        String writeFilePath = saveDir + File.separator + writeFileName;
        File file = FileUtil.get(writeFilePath);

        // エクセルファイルを保管
        try (FileOutputStream fos = new FileOutputStream(file)) {
            workbook.write(fos);
        } catch (Exception e) {
            throw new SysError(e);
        }

        return file;
    }

    /**
     * エクセルファイルを取得
     *
     * @param file
     * @return ワークブックインスタンス
     */
    private static Workbook getWorkbook(final File file) {
        try {
            return new XSSFWorkbook(file);
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    /**
     * セル値の取得
     *
     * @param cell
     * @return セル値
     */
    private static Object getCellValue(final Cell cell) {
        return getCellValue(cell, cell.getCellType());
    }

    /**
     * セル値の取得
     *
     * @param cell
     * @param type
     * @return セル値
     */
    private static Object getCellValue(final Cell cell, final CellType type) {
        switch (type) {
        case BLANK:
            return null;
        case BOOLEAN:
            return cell.getBooleanCellValue();
        case ERROR:
            return null;
        case FORMULA:
            return getCellValue(cell, cell.getCachedFormulaResultType());
        case NUMERIC:
            if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell)) {
                return cell.getDateCellValue();
            } else {
                return cell.getNumericCellValue();
            }
        default:
            return cell.getRichStringCellValue().getString();
        }
    }

    /**
     * セル値の設定
     *
     * @param sheet
     * @param address
     * @param o
     */
    private static void setCellValue(final Sheet sheet, final CellAddress address, final Object o) {
        setCellValue(sheet, address.getRow(), address.getColumn(), o);
    }

    /**
     * セル値の設定
     *
     * @param sheet
     * @param r
     * @param c
     * @param o
     */
    private static void setCellValue(final Sheet sheet, final int r, final int c, final Object o) {
        Cell cell = sheet.getRow(r).getCell(c);
        setCellValue(cell, o);
    }

    /**
     * セル値の設定
     *
     * @param cell
     * @param o
     */
    private static void setCellValue(final Cell cell, final Object o) {
        if (Objects.nonNull(o)) {
            if (o instanceof Number) {
                cell.setCellValue(Double.valueOf(o.toString()));
            } else if (o instanceof Date) {
                cell.setCellValue((Date) o);
            } else {
                cell.setCellValue(o.toString());
            }
        } else {
            cell.setCellValue("");
        }
    }

    /**
     * セル範囲のコピー
     *
     * @param sheet
     * @param range
     * @param destRowIndex
     */
    private static void copyRange(final Sheet sheet, final Range range, final int destRowIndex) {
        for (int r = range.getBoR(); r <= range.getEoR(); r++) {
            int rownum = destRowIndex + r - range.getBoR();
            sheet.shiftRows(rownum, rownum, 1, true, true);
            Row destRow = sheet.createRow(rownum);
            for (int c = range.getBoC(); c <= range.getEoC(); c++) {
                Cell srcCell = sheet.getRow(r).getCell(c);
                Cell destCell = destRow.createCell(c);
                destCell.setCellStyle(srcCell.getCellStyle());
            }
        }
    }

}
