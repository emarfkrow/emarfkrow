package jp.co.golorp.emarf.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.sql.Queries;
import jp.co.golorp.emarf.util.MapList;
import jp.co.golorp.emarf.util.Messages;

public class BaseProcess {

    /** リクエストのパス構成 */
    private List<String> pathes = new ArrayList<String>();

    /**
     * @return List
     */
    public List<String> getPathes() {
        return pathes;
    }

    /**
     * @param strings
     */
    public void setPathes(final List<String> strings) {
        this.pathes = strings;
    }

    /**
     * @param sqlName
     * @return sql
     */
    public String loadSqlFile(final String sqlName) {
        return Queries.loadSqlFile(this.getPathes(), this.getClass(), sqlName);
    }

    /**
     * @param errors
     * @param sqlName
     * @param itemName
     * @param itemValue
     * @param itemMei
     */
    public void masterCheck(final Map<String, String> errors, final String sqlName, final String itemName,
            final String itemValue, final String itemMei) {

        if (!StringUtil.isNullOrBlank(itemValue)) {

            String namedSql = this.loadSqlFile(sqlName);

            Map<String, Object> params = new HashMap<String, Object>();
            params.put(itemName, itemValue);

            MapList mapList = Queries.select(namedSql, params);

            if (mapList == null) {

                String processName = this.getClass().getSimpleName();
                String formName = processName.replaceFirst("Action$", "Form");
                errors.put(formName + "." + itemName, Messages.get("error.notexist", itemMei));
            }
        }
    }

}
