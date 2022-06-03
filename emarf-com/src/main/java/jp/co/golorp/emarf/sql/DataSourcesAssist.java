package jp.co.golorp.emarf.sql;

/**
 * データソース毎実装のインタフェース
 *
 * @author toshiyuki
 *
 */
public abstract class DataSourcesAssist {

    /**
     * @param tableName テーブル名
     * @return テーブルコメント
     */
    protected abstract String getTableComment(String tableName);

    /**
     * @param tableName テーブル名
     * @param columnName カラム名
     * @return カラムコメント
     */
    protected abstract String getColumnComment(String tableName, String columnName);

    /**
     * @param array
     * @return 文字列を結合するSQL
     */
    public abstract String join(String[] array);

    /**
     * @param s
     * @return yyyy/mm/dd hh:mm:ss.SSSにキャストするSQL
     */
    public abstract String toTimestamp(String s);

}
