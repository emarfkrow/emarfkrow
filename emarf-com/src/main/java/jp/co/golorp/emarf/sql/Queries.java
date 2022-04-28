package jp.co.golorp.emarf.sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.exception.NoDataError;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.util.MapList;

/**
 * SQL実行クラス
 *
 * @author toshiyuki
 *
 */
public final class Queries {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Queries.class);

    private Queries() {
    }

    /**
     * 名前パラメータSQLで１件取得
     *
     * @param <T>
     * @param namedSql
     * @param params
     * @param c
     * @return T
     */
    public static <T> T get(final String namedSql, final Map<String, Object> params, final Class<?> c) {

        List<T> list = Queries.select(namedSql, params, c);

        if (list != null && list.size() == 1) {
            T t = (T) list.get(0);
            return t;
        }

        throw new NoDataError("info.nodata");
    }

    /**
     * 名前パラメータSQLで検索
     *
     * @param namedSql
     * @return MapList
     */
    public static MapList select(final String namedSql) {
        return Queries.select(namedSql, null, null);
    }

    /**
     * 名前パラメータSQLで検索
     *
     * @param namedSql
     * @param params
     * @return MapList
     */
    public static MapList select(final String namedSql, final Map<String, Object> params) {
        return Queries.select(namedSql, params, null);
    }

    /**
     * 名前パラメータSQLで検索
     *
     * @param <T>
     * @param namedSql
     * @param params
     * @param c
     * @return List<c>
     */
    public static <T> T select(final String namedSql, final Map<String, Object> params, final Class<?> c) {

        Map<String, Object> newParams = new HashMap<String, Object>();

        // 参照系のSQLはparamsの値が""ならキー自体を消し込む
        if (params != null) {
            for (Entry<String, Object> entry : params.entrySet()) {
                String k = entry.getKey();
                Object v = entry.getValue();
                if (!StringUtil.isNullOrBlank(v)) {
                    // 参照系のSQLは「モデル名.フィールド名」をフィールド名だけにする
                    k = k.replaceAll("^.+\\.", "");
                    newParams.put(k, v);
                }
            }
        }

        List<Object> args = new ArrayList<Object>();

        String sql = convRawSql(namedSql, newParams, args);

        return selectByRawSql(sql, args, c);
    }

    /**
     * 名前付きパラメータをプレースホルダに変換し、プレースホルダの出現箇所に応じて、パラメータのMapをList化
     *
     * @param namedSql
     * @param params
     * @param args
     * @return プレースホルダに変換後のSQL
     */
    private static String convRawSql(final String namedSql, final Map<String, Object> params, final List<Object> args) {

        Map<String, Object> snakes = new HashMap<String, Object>();

        // paramsのキーをsnake化
        for (Entry<String, Object> e : params.entrySet()) {
            String k = e.getKey();
            Object v = e.getValue();
            snakes.put(StringUtil.toSnakeCase(k), v);
        }

        // SQL
        String rawSql = namedSql;
        String logSql = namedSql;

        // SQL内の名前付きパラメータ「:***」が、パラメータのキーに含まれない場合は、SQLから行削除
        Matcher m = Pattern.compile("(?<=:)[A-Za-z][0-9A-Z\\_a-z]+").matcher(rawSql);
        while (m.find()) {
            String parameterName = m.group();
            if (!snakes.containsKey(parameterName)) {
                rawSql = rawSql.replaceFirst(".*:" + parameterName + ".*[\r\n]+", "");
                logSql = logSql.replaceFirst(".*:" + parameterName + ".*[\r\n]+", "");
            }
        }

        // SQLコメント内の名前付きパラメータ「-- :***」を、パラメータ値で置換
        m = Pattern.compile("(?<=--) *:[A-Za-z][0-9A-Z\\_a-z]+").matcher(rawSql);
        while (m.find()) {
            String namedParameter = m.group();
            String parameterName = namedParameter.replaceAll("^ *:", "");
            Object o = snakes.get(parameterName);

            String parameterValue = "";
            if (o != null) {
                parameterValue = o.toString();
            }

            rawSql = rawSql.replaceFirst(":" + parameterName, parameterValue);
            logSql = logSql.replaceFirst(":" + parameterName, parameterValue);
        }

        // SQL内の名前付きパラメータ「:***」をプレースホルダ「?」に置換して、出現箇所に応じてパラメータを追加
        m = Pattern.compile("(?<=:)[A-Za-z][0-9A-Z\\_a-z]+").matcher(rawSql);
        while (m.find()) {
            String parameterName = m.group();
            Object o = snakes.get(parameterName);

            if (o instanceof List) {

                @SuppressWarnings("unchecked")
                List<String> list = (List<String>) o;
                String s = String.join(", ", list);
                rawSql = rawSql.replaceFirst(":" + parameterName, s);
                logSql = logSql.replaceFirst(":" + parameterName, s);

            } else {

                // 実行用SQLとログ用SQLの名前付きパラメータ「:***」をプレースホルダ「?」に置換
                rawSql = rawSql.replaceFirst(":" + parameterName, "?");
                logSql = logSql.replaceFirst(":" + parameterName, "'" + o.toString() + "'");

                // 出現箇所に応じてパラメータを追加
                args.add(o);
            }
        }

        // ログ用SQLを出力
        LOG.debug("\r\n\r\n" + logSql + "\r\n");
        return rawSql;
    }

    /**
     * プレースホルダのSQLを実行
     *
     * @param <T>
     * @param sql
     * @param args
     * @param c
     * @return List<c>
     */
    private static <T> T selectByRawSql(final String sql, final List<Object> args, final Class<?> c) {

        // コネクションを取得
        Connection cn = Connections.get();

        // プリペアードステートメント取得
        try (PreparedStatement ps = cn.prepareStatement(sql);) {

            // パラメータを設定
            for (int i = 0; i < args.size(); i++) {
                ps.setObject(i + 1, args.get(i));
            }

            // 戻り値の型指定があり、ResultSetが複数件の場合の返却値
            List<Object> objectList = new ArrayList<Object>();

            // 戻り値の型指定がない場合の返却値
            MapList mapList = new MapList();

            // SQLを発行してResultSetを取得
            ResultSet rs = ps.executeQuery();

            // カラム名取得用にメタデータを取得
            ResultSetMetaData metaData = rs.getMetaData();

            // ResultSetでループ
            while (rs.next()) {
                if (c != null) {
                    // 戻り値の型指定がある場合
                    objectList.add(rs2Entity(rs, c));
                } else {
                    // 戻り値の方指定がない場合
                    Map<String, Object> map = new HashMap<String, Object>();
                    int columnCount = metaData.getColumnCount();
                    for (int i = 0; i < columnCount; i++) {
                        String columnName = metaData.getColumnName(i + 1);
                        Object value = rs.getObject(i + 1);
                        map.put(columnName, value);
                    }
                    mapList.add(map);
                }
            }

            if (!objectList.isEmpty()) {
                @SuppressWarnings("unchecked")
                T t = (T) objectList;
                return t;
            }

            if (!mapList.isEmpty()) {
                @SuppressWarnings("unchecked")
                T t = (T) mapList;
                return t;
            }

            return null;

        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    /**
     * ResultSetをEntityに変換
     *
     * @param <T>
     * @param rs
     * @param c
     * @return T
     * @throws Exception
     */
    private static <T> T rs2Entity(final ResultSet rs, final Class<?> c) throws Exception {

        // エンティティのインスタンスを取得
        @SuppressWarnings("unchecked")
        T t = (T) c.newInstance();

        // エンティティのフィールドを取得してループ
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {

            // フィールドを書き込み可に設定
            field.setAccessible(true);

            // フィールド名からカラム名を取得
            String columnName = StringUtil.toSnakeCase(field.getName());

            // キャストが必要な場合は各タイプごとに対応して値を設定
            Type fieldType = field.getType();
            if (fieldType == List.class) {
                continue;
            }

            Class<?> fieldClass = Class.forName(fieldType.getTypeName());
            Class<?>[] interfaces = fieldClass.getInterfaces();
            if (interfaces.length > 0 && interfaces[0] == IEntity.class) {
                continue;
            }

            Class<?> columnClass = null;
            if (rs.getObject(columnName) != null) {
                columnClass = rs.getObject(columnName).getClass();
            }

            if (fieldType == LocalDateTime.class && columnClass == Timestamp.class) {
                field.set(t, ((Timestamp) rs.getObject(columnName)).toLocalDateTime());
            } else {
                field.set(t, rs.getObject(columnName));
            }
        }

        return t;
    }

    /**
     * @param sqlPathes 相対パスでsqlファイルを探す場合に使用
     * @param c         クラスローダでsqlファイルを探す場合に使用
     * @param sqlName
     * @return sql
     */
    public static String loadSqlFile(final List<String> sqlPathes, final Class<?> c, final String sqlName) {
        try {
            // サーブレットのsqlフォルダからの相対パスで取得
            return Queries.loadSqlFile(sqlPathes, sqlName);
        } catch (Exception e) {
            // 参照jarを含め、クラスパス内のsqlフォルダからのパッケージ相対位置で取得
            return Queries.loadSqlFile(c, sqlName);
        }
    }

    /**
     * クラスパス内のSQLファイルをロード
     *
     * @param c
     * @param sqlName
     * @return SQL
     */
    private static String loadSqlFile(final Class<?> c, final String sqlName) {

        // スレッドのクラスローダー
        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        // 自クラスのクラスローダー
        if (cl == null) {
            cl = c.getClassLoader();
        }

        // システムクラスローダー
        if (cl == null) {
            cl = ClassLoader.getSystemClassLoader();
        }

        URL url = seekSqlFile(cl, c.getPackage().getName(), sqlName);
        if (url != null) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\r\n");
                }
                return sb.toString();
            } catch (IOException e) {
                LOG.trace(e.getMessage());
            }
        }

        throw new SysError("error.notexist.file", sqlName + ".sql");
    }

    /**
     * クラスパス内のSQLファイルを再帰して検索
     *
     * @param cl
     * @param packageName
     * @param sqlName
     * @return SQLファイルのURL
     */
    private static URL seekSqlFile(final ClassLoader cl, final String packageName, final String sqlName) {

        String[] packages = packageName.split("\\.");

        String packagePath = String.join(File.separator, packages);

        String resourcePath = "sql" + File.separator + packagePath + File.separator + sqlName + ".sql";

        URL url = cl.getResource(resourcePath);

        if (url == null && packages[0].length() > 0) {
            List<String> packageList = new ArrayList<>(Arrays.asList(packages));
            packageList.remove(0);
            packages = packageList.toArray(new String[packageList.size()]);
            url = seekSqlFile(cl, String.join(".", packages), sqlName);
        }

        return url;
    }

    /**
     * サーブレットコンテキスト内のSQLファイルをロード
     *
     * @param sqlPathes
     * @param sqlName
     * @return SQL
     */
    private static String loadSqlFile(final List<String> sqlPathes, final String sqlName) {

        File file = seekSqlFile(sqlPathes, sqlName);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\r\n");
                }
                return sb.toString();
            } catch (IOException e) {
                LOG.trace(e.getMessage());
            }
        }

        throw new SysError("error.notexist.file", sqlName + ".sql");
    }

    /**
     * サーブレットコンテキスト内のSQLファイルを再帰して検索
     *
     * @param sqlPathes
     * @param sqlName
     * @return SQLファイルのURL
     */
    private static File seekSqlFile(final List<String> sqlPathes, final String sqlName) {

        String sqlPath = String.join(File.separator, sqlPathes);
        String filePath = App.get("context.path.sql") + File.separator + sqlPath + File.separator + sqlName
                + ".sql";
        File file = FileUtil.get(filePath);

        if (!file.exists() && sqlPathes.size() > 0) {
            sqlPathes.remove(0);
            file = seekSqlFile(sqlPathes, sqlName);
        }

        return file;
    }

    /**
     * 名前付きパラメータのSQLで登録
     *
     * @param namedSql
     * @param params
     * @return 登録件数
     */
    public static int regist(final String namedSql, final Map<String, Object> params) {

        // パラメータ
        List<Object> args = new ArrayList<Object>();

        String sql = Queries.convRawSql(namedSql, params, args);

        return Queries.registByRawSql(sql, args);
    }

    /**
     * プレースホルダのSQLを実行
     *
     * @param sql
     * @param args
     * @return 登録件数
     */
    private static int registByRawSql(final String sql, final List<Object> args) {

        // コネクションを取得
        Connection cn = Connections.get();

        // プリペアードステートメント取得
        try (PreparedStatement ps = cn.prepareStatement(sql);) {

            // パラメータを設定
            for (int i = 0; i < args.size(); i++) {
                ps.setObject(i + 1, args.get(i));
            }

            // SQLを発行して登録件数を取得
            return ps.executeUpdate();

        } catch (SQLIntegrityConstraintViolationException e) {
            throw new OptLockError("error.cant.insert");
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

}
