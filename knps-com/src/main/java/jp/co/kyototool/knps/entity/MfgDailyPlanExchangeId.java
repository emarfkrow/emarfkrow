package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_DAILY_PLAN_EXCHANGE_ID
 *
 * @author emarfkrow
 */
public class MfgDailyPlanExchangeId implements IEntity {

    /** EXCHANGE_ID */
    private String exchangeId;

    /**
     * @return EXCHANGE_ID
     */
    public String getExchangeId() {
        return this.exchangeId;
    }

    /**
     * @param o EXCHANGE_ID
     */
    public void setExchangeId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.exchangeId = String.valueOf(o.toString());
        } else {
            this.exchangeId = null;
        }
    }

    /** PRO_NO */
    private String proNo;

    /**
     * @return PRO_NO
     */
    public String getProNo() {
        return this.proNo;
    }

    /**
     * @param o PRO_NO
     */
    public void setProNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNo = String.valueOf(o.toString());
        } else {
            this.proNo = null;
        }
    }

    /** ID_TYPE */
    private String idType;

    /**
     * @return ID_TYPE
     */
    public String getIdType() {
        return this.idType;
    }

    /**
     * @param o ID_TYPE
     */
    public void setIdType(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idType = String.valueOf(o.toString());
        } else {
            this.idType = null;
        }
    }

    /**
     * MFG_DAILY_PLAN_EXCHANGE_ID照会
     *
     * @param param1 EXCHANGE_ID
     * @return MFG_DAILY_PLAN_EXCHANGE_ID
     */
    public static MfgDailyPlanExchangeId get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"EXCHANGE_ID\") = TRIM (:exchange_id)");

        String sql = "SELECT * FROM MFG_DAILY_PLAN_EXCHANGE_ID WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("exchange_id", param1);

        return Queries.get(sql, params, MfgDailyPlanExchangeId.class);
    }

    /**
     * MFG_DAILY_PLAN_EXCHANGE_ID追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // EXCHANGE_IDの採番処理
        numbering();

        // MFG_DAILY_PLAN_EXCHANGE_IDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"EXCHANGE_ID\" -- :exchange_id");
        nameList.add("\"PRO_NO\" -- :pro_no");
        nameList.add("\"ID_TYPE\" -- :id_type");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_DAILY_PLAN_EXCHANGE_ID(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":exchange_id");
        valueList.add(":pro_no");
        valueList.add(":id_type");
        return String.join("\r\n    , ", valueList);
    }

    /** EXCHANGE_IDの採番処理 */
    private void numbering() {

        if (this.exchangeId != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"EXCHANGE_ID\") IS NULL THEN 0 ELSE MAX(e.\"EXCHANGE_ID\") * 1 END + 1, 7, '0') AS \"EXCHANGE_ID\" FROM MFG_DAILY_PLAN_EXCHANGE_ID e WHERE e.\"EXCHANGE_ID\" < '9999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("EXCHANGE_ID");

        this.setExchangeId(o);
    }

    /**
     * MFG_DAILY_PLAN_EXCHANGE_ID更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_DAILY_PLAN_EXCHANGE_IDの登録
        String sql = "UPDATE MFG_DAILY_PLAN_EXCHANGE_ID\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"EXCHANGE_ID\" = :exchange_id");
        setList.add("\"PRO_NO\" = :pro_no");
        setList.add("\"ID_TYPE\" = :id_type");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_DAILY_PLAN_EXCHANGE_ID削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_DAILY_PLAN_EXCHANGE_IDの削除
        String sql = "DELETE FROM MFG_DAILY_PLAN_EXCHANGE_ID WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"EXCHANGE_ID\") = TRIM (:exchange_id)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("exchange_id", this.exchangeId);
        params.put("pro_no", this.proNo);
        params.put("id_type", this.idType);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
