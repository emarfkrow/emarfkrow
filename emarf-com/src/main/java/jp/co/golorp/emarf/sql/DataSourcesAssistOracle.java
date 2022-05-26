package jp.co.golorp.emarf.sql;

/**
 * Oracle用データソース実装
 * @author toshiyuki
 *
 */
public class DataSourcesAssistOracle extends DataSourcesAssist {

    /**
     * @param array
     * @return String
     */
    public String join(final String[] array) {
        return String.join(" || ", array);
    }

}
