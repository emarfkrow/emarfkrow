package jp.co.golorp.emarf.sql;

/**
 * Oracle用データソース実装
 * @author toshiyuki
 *
 */
public final class DataSourcesAssistOracle extends DataSourcesAssist {

    @Override
    protected String getTableComment(final String tableName) {
        return null;
    }

    @Override
    public String join(final String[] array) {
        return String.join(" || ", array);
    }

    @Override
    public String toTimestamp(final String s) {
        return "TO_TIMESTAMP (" + s + ", 'YYYY-MM-DD\\\"T\\\"HH24:MI:SS.FF3')";
    }

}
