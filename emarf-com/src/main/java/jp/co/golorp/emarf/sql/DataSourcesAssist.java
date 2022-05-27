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
     * @param array
     * @return String
     */
    public abstract String join(String[] array);

    /**
     * @param s
     * @return yyyy/mm/dd hh:mm:ss.SSS
     */
    public abstract String toTimestamp(String s);

}
