package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * WK_INSPECTION_LIST1
 *
 * @author emarfkrow
 */
public class WkInspectionList1 implements IEntity {

    /**
     * WK_INSPECTION_LIST1照会
     *
     * @return WK_INSPECTION_LIST1
     */
    public static WkInspectionList1 get() {

        List<String> whereList = new ArrayList<String>();

        String sql = "SELECT * FROM WK_INSPECTION_LIST1 WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();

        return Queries.get(sql, params, WkInspectionList1.class);
    }

    /**
     * WK_INSPECTION_LIST1追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // WK_INSPECTION_LIST1の登録
        List<String> nameList = new ArrayList<String>();
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO WK_INSPECTION_LIST1(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        return String.join("\r\n    , ", valueList);
    }

    /**
     * WK_INSPECTION_LIST1更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // WK_INSPECTION_LIST1の登録
        String sql = "UPDATE WK_INSPECTION_LIST1\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * WK_INSPECTION_LIST1削除
     *
     * @return 削除件数
     */
    public int delete() {

        // WK_INSPECTION_LIST1の削除
        String sql = "DELETE FROM WK_INSPECTION_LIST1 WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
