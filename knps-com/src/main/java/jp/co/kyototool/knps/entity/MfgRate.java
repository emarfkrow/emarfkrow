package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_RATE
 *
 * @author emarfkrow
 */
public class MfgRate implements IEntity {

    /** RATE_CODE */
    private String rateCode;

    /**
     * @return RATE_CODE
     */
    public String getRateCode() {
        return this.rateCode;
    }

    /**
     * @param o RATE_CODE
     */
    public void setRateCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rateCode = String.valueOf(o.toString());
        } else {
            this.rateCode = null;
        }
    }

    /** IN_OUT_KBN */
    private java.math.BigDecimal inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    public java.math.BigDecimal getInOutKbn() {
        return this.inOutKbn;
    }

    /**
     * @param o IN_OUT_KBN
     */
    public void setInOutKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inOutKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.inOutKbn = null;
        }
    }

    /** RATE_KBN */
    private java.math.BigDecimal rateKbn;

    /**
     * @return RATE_KBN
     */
    public java.math.BigDecimal getRateKbn() {
        return this.rateKbn;
    }

    /**
     * @param o RATE_KBN
     */
    public void setRateKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rateKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.rateKbn = null;
        }
    }

    /** HUM_LABOR_COST_FIRST */
    private java.math.BigDecimal humLaborCostFirst;

    /**
     * @return HUM_LABOR_COST_FIRST
     */
    public java.math.BigDecimal getHumLaborCostFirst() {
        return this.humLaborCostFirst;
    }

    /**
     * @param o HUM_LABOR_COST_FIRST
     */
    public void setHumLaborCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humLaborCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.humLaborCostFirst = null;
        }
    }

    /** HUM_EXPENSES_FIRST */
    private java.math.BigDecimal humExpensesFirst;

    /**
     * @return HUM_EXPENSES_FIRST
     */
    public java.math.BigDecimal getHumExpensesFirst() {
        return this.humExpensesFirst;
    }

    /**
     * @param o HUM_EXPENSES_FIRST
     */
    public void setHumExpensesFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humExpensesFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.humExpensesFirst = null;
        }
    }

    /** HUM_LABOR_COST_SECOND */
    private java.math.BigDecimal humLaborCostSecond;

    /**
     * @return HUM_LABOR_COST_SECOND
     */
    public java.math.BigDecimal getHumLaborCostSecond() {
        return this.humLaborCostSecond;
    }

    /**
     * @param o HUM_LABOR_COST_SECOND
     */
    public void setHumLaborCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humLaborCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.humLaborCostSecond = null;
        }
    }

    /** HUM_EXPENSES_SECOND */
    private java.math.BigDecimal humExpensesSecond;

    /**
     * @return HUM_EXPENSES_SECOND
     */
    public java.math.BigDecimal getHumExpensesSecond() {
        return this.humExpensesSecond;
    }

    /**
     * @param o HUM_EXPENSES_SECOND
     */
    public void setHumExpensesSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humExpensesSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.humExpensesSecond = null;
        }
    }

    /** MAC_LABOR_COST_FIRST */
    private java.math.BigDecimal macLaborCostFirst;

    /**
     * @return MAC_LABOR_COST_FIRST
     */
    public java.math.BigDecimal getMacLaborCostFirst() {
        return this.macLaborCostFirst;
    }

    /**
     * @param o MAC_LABOR_COST_FIRST
     */
    public void setMacLaborCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macLaborCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.macLaborCostFirst = null;
        }
    }

    /** MAC_EXPENSES_FIRST */
    private java.math.BigDecimal macExpensesFirst;

    /**
     * @return MAC_EXPENSES_FIRST
     */
    public java.math.BigDecimal getMacExpensesFirst() {
        return this.macExpensesFirst;
    }

    /**
     * @param o MAC_EXPENSES_FIRST
     */
    public void setMacExpensesFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macExpensesFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.macExpensesFirst = null;
        }
    }

    /** MAC_LABOR_COST_SECOND */
    private java.math.BigDecimal macLaborCostSecond;

    /**
     * @return MAC_LABOR_COST_SECOND
     */
    public java.math.BigDecimal getMacLaborCostSecond() {
        return this.macLaborCostSecond;
    }

    /**
     * @param o MAC_LABOR_COST_SECOND
     */
    public void setMacLaborCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macLaborCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.macLaborCostSecond = null;
        }
    }

    /** MAC_EXPENSES_SECOND */
    private java.math.BigDecimal macExpensesSecond;

    /**
     * @return MAC_EXPENSES_SECOND
     */
    public java.math.BigDecimal getMacExpensesSecond() {
        return this.macExpensesSecond;
    }

    /**
     * @param o MAC_EXPENSES_SECOND
     */
    public void setMacExpensesSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macExpensesSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.macExpensesSecond = null;
        }
    }

    /** OUT_COST_SECOND */
    private java.math.BigDecimal outCostSecond;

    /**
     * @return OUT_COST_SECOND
     */
    public java.math.BigDecimal getOutCostSecond() {
        return this.outCostSecond;
    }

    /**
     * @param o OUT_COST_SECOND
     */
    public void setOutCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.outCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.outCostSecond = null;
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
     * MFG_RATE照会
     *
     * @param param1 RATE_CODE
     * @return MFG_RATE
     */
    public static MfgRate get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"RATE_CODE\") = TRIM (:rate_code)");

        String sql = "SELECT * FROM MFG_RATE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("rate_code", param1);

        return Queries.get(sql, params, MfgRate.class);
    }

    /**
     * MFG_RATE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // RATE_CODEの採番処理
        numbering();

        // MFG_RATE_Qの登録
        if (this.mfgRateQ != null) {
            this.mfgRateQ.setRateCode(this.getRateCode());
            this.mfgRateQ.insert(now, id);
        }

        // MFG_RATEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"RATE_CODE\" -- :rate_code");
        nameList.add("\"IN_OUT_KBN\" -- :in_out_kbn");
        nameList.add("\"RATE_KBN\" -- :rate_kbn");
        nameList.add("\"HUM_LABOR_COST_FIRST\" -- :hum_labor_cost_first");
        nameList.add("\"HUM_EXPENSES_FIRST\" -- :hum_expenses_first");
        nameList.add("\"HUM_LABOR_COST_SECOND\" -- :hum_labor_cost_second");
        nameList.add("\"HUM_EXPENSES_SECOND\" -- :hum_expenses_second");
        nameList.add("\"MAC_LABOR_COST_FIRST\" -- :mac_labor_cost_first");
        nameList.add("\"MAC_EXPENSES_FIRST\" -- :mac_expenses_first");
        nameList.add("\"MAC_LABOR_COST_SECOND\" -- :mac_labor_cost_second");
        nameList.add("\"MAC_EXPENSES_SECOND\" -- :mac_expenses_second");
        nameList.add("\"OUT_COST_SECOND\" -- :out_cost_second");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_RATE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":rate_code");
        valueList.add(":in_out_kbn");
        valueList.add(":rate_kbn");
        valueList.add(":hum_labor_cost_first");
        valueList.add(":hum_expenses_first");
        valueList.add(":hum_labor_cost_second");
        valueList.add(":hum_expenses_second");
        valueList.add(":mac_labor_cost_first");
        valueList.add(":mac_expenses_first");
        valueList.add(":mac_labor_cost_second");
        valueList.add(":mac_expenses_second");
        valueList.add(":out_cost_second");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** RATE_CODEの採番処理 */
    private void numbering() {

        if (this.rateCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"RATE_CODE\") IS NULL THEN 0 ELSE MAX(e.\"RATE_CODE\") * 1 END + 1, 10, '0') AS \"RATE_CODE\" FROM MFG_RATE e WHERE e.\"RATE_CODE\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("RATE_CODE");

        this.setRateCode(o);
    }

    /**
     * MFG_RATE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_RATE_Qの登録
        if (this.mfgRateQ != null) {
            mfgRateQ.setRateCode(this.getRateCode());
            try {
                mfgRateQ.insert(now, id);
            } catch (Exception e) {
                mfgRateQ.update(now, id);
            }
        }

        // MFG_RATEの登録
        String sql = "UPDATE MFG_RATE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"RATE_CODE\" = :rate_code");
        setList.add("\"IN_OUT_KBN\" = :in_out_kbn");
        setList.add("\"RATE_KBN\" = :rate_kbn");
        setList.add("\"HUM_LABOR_COST_FIRST\" = :hum_labor_cost_first");
        setList.add("\"HUM_EXPENSES_FIRST\" = :hum_expenses_first");
        setList.add("\"HUM_LABOR_COST_SECOND\" = :hum_labor_cost_second");
        setList.add("\"HUM_EXPENSES_SECOND\" = :hum_expenses_second");
        setList.add("\"MAC_LABOR_COST_FIRST\" = :mac_labor_cost_first");
        setList.add("\"MAC_EXPENSES_FIRST\" = :mac_expenses_first");
        setList.add("\"MAC_LABOR_COST_SECOND\" = :mac_labor_cost_second");
        setList.add("\"MAC_EXPENSES_SECOND\" = :mac_expenses_second");
        setList.add("\"OUT_COST_SECOND\" = :out_cost_second");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_RATE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_RATE_Qの削除
        if (this.mfgRateQ != null) {
            this.mfgRateQ.delete();
        }

        // MFG_RATEの削除
        String sql = "DELETE FROM MFG_RATE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"RATE_CODE\") = TRIM (:rate_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("rate_code", this.rateCode);
        params.put("in_out_kbn", this.inOutKbn);
        params.put("rate_kbn", this.rateKbn);
        params.put("hum_labor_cost_first", this.humLaborCostFirst);
        params.put("hum_expenses_first", this.humExpensesFirst);
        params.put("hum_labor_cost_second", this.humLaborCostSecond);
        params.put("hum_expenses_second", this.humExpensesSecond);
        params.put("mac_labor_cost_first", this.macLaborCostFirst);
        params.put("mac_expenses_first", this.macExpensesFirst);
        params.put("mac_labor_cost_second", this.macLaborCostSecond);
        params.put("mac_expenses_second", this.macExpensesSecond);
        params.put("out_cost_second", this.outCostSecond);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_RATE_Q
     */
    private MfgRateQ mfgRateQ;

    /**
     * @return MFG_RATE_Q
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgRateQ")
    public MfgRateQ getMfgRateQ() {
        return this.mfgRateQ;
    }

    /**
     * @param p MFG_RATE_Q
     */
    public void setMfgRateQ(final MfgRateQ p) {
        this.mfgRateQ = p;
    }

    /**
     * @return MFG_RATE_Q
     */
    public MfgRateQ referMfgRateQ() {
        if (this.mfgRateQ == null) {
            try {
                this.mfgRateQ = MfgRateQ.get(this.rateCode);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mfgRateQ;
    }
}
