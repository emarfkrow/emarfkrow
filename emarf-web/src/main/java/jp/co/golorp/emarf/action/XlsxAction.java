package jp.co.golorp.emarf.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.servlet.http.ServletUtil;

public class XlsxAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> xlsxMap = new HashMap<String, Object>();

        // レイアウトファイル名
        String layoutFileName = this.getBaseName() + ".xlsx";
        xlsxMap.put("layoutFileName", layoutFileName);

        // 追加シートマップを設定
        Map<String, Map<String, Object>> addSheetMap = new HashMap<String, Map<String, Object>>();
        addSheetMap.put(this.getBaseName(), ServletUtil.toSimpleMap(postJson));

        // レイアウトマップを設定
        Map<String, Map<String, Map<String, Object>>> layoutSheetMap = new HashMap<String, Map<String, Map<String, Object>>>();
        layoutSheetMap.put("layout", addSheetMap);

        xlsxMap.put("layoutSheetMap", layoutSheetMap);

        return xlsxMap;
    }

}
