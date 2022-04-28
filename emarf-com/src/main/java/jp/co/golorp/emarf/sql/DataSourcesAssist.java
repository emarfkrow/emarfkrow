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
    protected String getTableComment(final String tableName) {
        return null;
    };

}
