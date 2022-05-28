package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_KANBAN_SHIPPING
 *
 * @author emarfkrow
 */
public class MfgKanbanShipping implements IEntity {

    /** KANBAN_ID */
    private String kanbanId;

    /**
     * @return KANBAN_ID
     */
    public String getKanbanId() {
        return this.kanbanId;
    }

    /**
     * @param o KANBAN_ID
     */
    public void setKanbanId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanId = String.valueOf(o.toString());
        } else {
            this.kanbanId = null;
        }
    }

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o HINBAN
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** FOR_PRO_CODE */
    private String forProCode;

    /**
     * @return FOR_PRO_CODE
     */
    public String getForProCode() {
        return this.forProCode;
    }

    /**
     * @param o FOR_PRO_CODE
     */
    public void setForProCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.forProCode = String.valueOf(o.toString());
        } else {
            this.forProCode = null;
        }
    }

    /** FOR_PRO_LOCATION_CODE */
    private String forProLocationCode;

    /**
     * @return FOR_PRO_LOCATION_CODE
     */
    public String getForProLocationCode() {
        return this.forProLocationCode;
    }

    /**
     * @param o FOR_PRO_LOCATION_CODE
     */
    public void setForProLocationCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.forProLocationCode = String.valueOf(o.toString());
        } else {
            this.forProLocationCode = null;
        }
    }

    /** KANBAN_ACC_COUNTS */
    private java.math.BigDecimal kanbanAccCounts;

    /**
     * @return KANBAN_ACC_COUNTS
     */
    public java.math.BigDecimal getKanbanAccCounts() {
        return this.kanbanAccCounts;
    }

    /**
     * @param o KANBAN_ACC_COUNTS
     */
    public void setKanbanAccCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanAccCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.kanbanAccCounts = null;
        }
    }

    /** COUNTS */
    private java.math.BigDecimal counts;

    /**
     * @return COUNTS
     */
    public java.math.BigDecimal getCounts() {
        return this.counts;
    }

    /**
     * @param o COUNTS
     */
    public void setCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.counts = new java.math.BigDecimal(o.toString());
        } else {
            this.counts = null;
        }
    }

    /**
     * MFG_KANBAN_SHIPPING照会
     *
     * @param param1 KANBAN_ID
     * @param param2 HINBAN
     * @return MFG_KANBAN_SHIPPING
     */
    public static MfgKanbanShipping get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (kanban_id) = TRIM (:kanban_id)");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");

        String sql = "SELECT * FROM MFG_KANBAN_SHIPPING WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_id", param1);
        params.put("hinban", param2);

        return Queries.get(sql, params, MfgKanbanShipping.class);
    }

    /**
     * MFG_KANBAN_SHIPPING追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // HINBANの採番処理
        numbering();

        // MFG_KANBAN_SHIPPINGの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("kanban_id -- :kanban_id");
        nameList.add("hinban -- :hinban");
        nameList.add("for_pro_code -- :for_pro_code");
        nameList.add("for_pro_location_code -- :for_pro_location_code");
        nameList.add("kanban_acc_counts -- :kanban_acc_counts");
        nameList.add("counts -- :counts");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_KANBAN_SHIPPING(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kanban_id");
        valueList.add(":hinban");
        valueList.add(":for_pro_code");
        valueList.add(":for_pro_location_code");
        valueList.add(":kanban_acc_counts");
        valueList.add(":counts");
        return String.join("\r\n    , ", valueList);
    }

    /** HINBANの採番処理 */
    private void numbering() {

        if (this.hinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HINBAN) IS NULL THEN 0 ELSE MAX(e.HINBAN) * 1 END + 1, 25, '0') AS HINBAN FROM MFG_KANBAN_SHIPPING e WHERE e.HINBAN < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.KANBAN_ID = :kanban_id");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("kanbanId", this.kanbanId);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HINBAN");

        this.setHinban(o);
    }

    /**
     * MFG_KANBAN_SHIPPING更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_KANBAN_SHIPPINGの登録
        String sql = "UPDATE MFG_KANBAN_SHIPPING\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("kanban_id = :kanban_id");
        setList.add("hinban = :hinban");
        setList.add("for_pro_code = :for_pro_code");
        setList.add("for_pro_location_code = :for_pro_location_code");
        setList.add("kanban_acc_counts = :kanban_acc_counts");
        setList.add("counts = :counts");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_KANBAN_SHIPPING削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_KANBAN_SHIPPINGの削除
        String sql = "DELETE FROM MFG_KANBAN_SHIPPING WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (kanban_id) = TRIM (:kanban_id)");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("KANBAN_ID", this.kanbanId);
        params.put("HINBAN", this.hinban);
        params.put("FOR_PRO_CODE", this.forProCode);
        params.put("FOR_PRO_LOCATION_CODE", this.forProLocationCode);
        params.put("KANBAN_ACC_COUNTS", this.kanbanAccCounts);
        params.put("COUNTS", this.counts);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
