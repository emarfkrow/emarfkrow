package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_STORE_MAINTE
 *
 * @author emarfkrow
 */
public class PrdStoreMainte implements IEntity {

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return this.yyyy;
    }

    /**
     * @param o YYYY
     */
    public void setYyyy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yyyy = String.valueOf(o.toString());
        } else {
            this.yyyy = null;
        }
    }

    /** MM */
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return this.mm;
    }

    /**
     * @param o MM
     */
    public void setMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mm = String.valueOf(o.toString());
        } else {
            this.mm = null;
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

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
    public java.math.BigDecimal getRouting() {
        return this.routing;
    }

    /**
     * @param o ROUTING
     */
    public void setRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing = new java.math.BigDecimal(o.toString());
        } else {
            this.routing = null;
        }
    }

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return this.wcCode;
    }

    /**
     * @param o WC_CODE
     */
    public void setWcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcCode = String.valueOf(o.toString());
        } else {
            this.wcCode = null;
        }
    }

    /** LOCATION_CODE */
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * @param o LOCATION_CODE
     */
    public void setLocationCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locationCode = String.valueOf(o.toString());
        } else {
            this.locationCode = null;
        }
    }

    /** LOT_SIZE */
    private java.math.BigDecimal lotSize;

    /**
     * @return LOT_SIZE
     */
    public java.math.BigDecimal getLotSize() {
        return this.lotSize;
    }

    /**
     * @param o LOT_SIZE
     */
    public void setLotSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lotSize = new java.math.BigDecimal(o.toString());
        } else {
            this.lotSize = null;
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

    /** PL_COUNTS */
    private java.math.BigDecimal plCounts;

    /**
     * @return PL_COUNTS
     */
    public java.math.BigDecimal getPlCounts() {
        return this.plCounts;
    }

    /**
     * @param o PL_COUNTS
     */
    public void setPlCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.plCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.plCounts = null;
        }
    }

    /** KANBAN_COUNTS */
    private java.math.BigDecimal kanbanCounts;

    /**
     * @return KANBAN_COUNTS
     */
    public java.math.BigDecimal getKanbanCounts() {
        return this.kanbanCounts;
    }

    /**
     * @param o KANBAN_COUNTS
     */
    public void setKanbanCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.kanbanCounts = null;
        }
    }

    /** FIT_POS */
    private java.math.BigDecimal fitPos;

    /**
     * @return FIT_POS
     */
    public java.math.BigDecimal getFitPos() {
        return this.fitPos;
    }

    /**
     * @param o FIT_POS
     */
    public void setFitPos(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fitPos = new java.math.BigDecimal(o.toString());
        } else {
            this.fitPos = null;
        }
    }

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

    /** TIME_STAMP_CREATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampCreate;

    /**
     * @return TIME_STAMP_CREATE
     */
    public java.time.LocalDateTime getTimeStampCreate() {
        return this.timeStampCreate;
    }

    /**
     * @param o TIME_STAMP_CREATE
     */
    public void setTimeStampCreate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampCreate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampCreate = null;
        }
    }

    /** TIME_STAMP_CHANGE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampChange;

    /**
     * @return TIME_STAMP_CHANGE
     */
    public java.time.LocalDateTime getTimeStampChange() {
        return this.timeStampChange;
    }

    /**
     * @param o TIME_STAMP_CHANGE
     */
    public void setTimeStampChange(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampChange = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampChange = null;
        }
    }

    /** USER_ID_CREATE */
    private String userIdCreate;

    /**
     * @return USER_ID_CREATE
     */
    public String getUserIdCreate() {
        return this.userIdCreate;
    }

    /**
     * @param o USER_ID_CREATE
     */
    public void setUserIdCreate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdCreate = String.valueOf(o.toString());
        } else {
            this.userIdCreate = null;
        }
    }

    /** USER_ID_CHANGE */
    private String userIdChange;

    /**
     * @return USER_ID_CHANGE
     */
    public String getUserIdChange() {
        return this.userIdChange;
    }

    /**
     * @param o USER_ID_CHANGE
     */
    public void setUserIdChange(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdChange = String.valueOf(o.toString());
        } else {
            this.userIdChange = null;
        }
    }

    /**
     * PRD_STORE_MAINTE照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @param param3 HINBAN
     * @param param4 ROUTING
     * @return PRD_STORE_MAINTE
     */
    public static PrdStoreMainte get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"ROUTING\" = :routing");

        String sql = "SELECT * FROM PRD_STORE_MAINTE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("hinban", param3);
        params.put("routing", param4);

        return Queries.get(sql, params, PrdStoreMainte.class);
    }

    /**
     * PRD_STORE_MAINTE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_Y_SUP_BUDGET_OUTの登録
        if (this.prdYSupBudgetOut != null) {
            this.prdYSupBudgetOut.setYyyy(this.getYyyy());
            this.prdYSupBudgetOut.setMm(this.getMm());
            this.prdYSupBudgetOut.setHinban(this.getHinban());
            this.prdYSupBudgetOut.setRouting(this.getRouting());
            this.prdYSupBudgetOut.insert(now, id);
        }

        // PRD_STORE_MAINTEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("hinban -- :hinban");
        nameList.add("routing -- :routing");
        nameList.add("wc_code -- :wc_code");
        nameList.add("location_code -- :location_code");
        nameList.add("lot_size -- :lot_size");
        nameList.add("kanban_acc_counts -- :kanban_acc_counts");
        nameList.add("pl_counts -- :pl_counts");
        nameList.add("kanban_counts -- :kanban_counts");
        nameList.add("fit_pos -- :fit_pos");
        nameList.add("kanban_id -- :kanban_id");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_STORE_MAINTE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":hinban");
        valueList.add(":routing");
        valueList.add(":wc_code");
        valueList.add(":location_code");
        valueList.add(":lot_size");
        valueList.add(":kanban_acc_counts");
        valueList.add(":pl_counts");
        valueList.add(":kanban_counts");
        valueList.add(":fit_pos");
        valueList.add(":kanban_id");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_STORE_MAINTE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_Y_SUP_BUDGET_OUTの登録
        if (this.prdYSupBudgetOut != null) {
            prdYSupBudgetOut.setYyyy(this.getYyyy());
            prdYSupBudgetOut.setMm(this.getMm());
            prdYSupBudgetOut.setHinban(this.getHinban());
            prdYSupBudgetOut.setRouting(this.getRouting());
            try {
                prdYSupBudgetOut.insert(now, id);
            } catch (Exception e) {
                prdYSupBudgetOut.update(now, id);
            }
        }

        // PRD_STORE_MAINTEの登録
        String sql = "UPDATE PRD_STORE_MAINTE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("hinban = :hinban");
        setList.add("routing = :routing");
        setList.add("wc_code = :wc_code");
        setList.add("location_code = :location_code");
        setList.add("lot_size = :lot_size");
        setList.add("kanban_acc_counts = :kanban_acc_counts");
        setList.add("pl_counts = :pl_counts");
        setList.add("kanban_counts = :kanban_counts");
        setList.add("fit_pos = :fit_pos");
        setList.add("kanban_id = :kanban_id");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_STORE_MAINTE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_Y_SUP_BUDGET_OUTの削除
        if (this.prdYSupBudgetOut != null) {
            this.prdYSupBudgetOut.delete();
        }

        // PRD_STORE_MAINTEの削除
        String sql = "DELETE FROM PRD_STORE_MAINTE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("routing = :routing");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("HINBAN", this.hinban);
        params.put("ROUTING", this.routing);
        params.put("WC_CODE", this.wcCode);
        params.put("LOCATION_CODE", this.locationCode);
        params.put("LOT_SIZE", this.lotSize);
        params.put("KANBAN_ACC_COUNTS", this.kanbanAccCounts);
        params.put("PL_COUNTS", this.plCounts);
        params.put("KANBAN_COUNTS", this.kanbanCounts);
        params.put("FIT_POS", this.fitPos);
        params.put("KANBAN_ID", this.kanbanId);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_Y_SUP_BUDGET_OUT
     */
    private PrdYSupBudgetOut prdYSupBudgetOut;

    /**
     * @return PRD_Y_SUP_BUDGET_OUT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdYSupBudgetOut")
    public PrdYSupBudgetOut getPrdYSupBudgetOut() {
        return this.prdYSupBudgetOut;
    }

    /**
     * @param p PRD_Y_SUP_BUDGET_OUT
     */
    public void setPrdYSupBudgetOut(final PrdYSupBudgetOut p) {
        this.prdYSupBudgetOut = p;
    }

    /**
     * @return PRD_Y_SUP_BUDGET_OUT
     */
    public PrdYSupBudgetOut referPrdYSupBudgetOut() {
        if (this.prdYSupBudgetOut == null) {
            try {
                this.prdYSupBudgetOut = PrdYSupBudgetOut.get(this.yyyy, this.mm, this.hinban, this.routing);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdYSupBudgetOut;
    }
}
