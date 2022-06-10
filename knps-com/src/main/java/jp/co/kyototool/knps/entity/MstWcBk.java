package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_WC_BK
 *
 * @author emarfkrow
 */
public class MstWcBk implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YY")
    public String getYy() {
        return this.yy;
    }

    /**
     * @param o YY
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = String.valueOf(o.toString());
        } else {
            this.yy = null;
        }
    }

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("WC_CODE")
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

    /** WC_NAME */
    private String wcName;

    /**
     * @return WC_NAME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("WC_NAME")
    public String getWcName() {
        return this.wcName;
    }

    /**
     * @param o WC_NAME
     */
    public void setWcName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcName = String.valueOf(o.toString());
        } else {
            this.wcName = null;
        }
    }

    /** NORM_LT */
    private java.math.BigDecimal normLt;

    /**
     * @return NORM_LT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORM_LT")
    public java.math.BigDecimal getNormLt() {
        return this.normLt;
    }

    /**
     * @param o NORM_LT
     */
    public void setNormLt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normLt = new java.math.BigDecimal(o.toString());
        } else {
            this.normLt = null;
        }
    }

    /** MAC_NORM_ABILITY */
    private java.math.BigDecimal macNormAbility;

    /**
     * @return MAC_NORM_ABILITY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_NORM_ABILITY")
    public java.math.BigDecimal getMacNormAbility() {
        return this.macNormAbility;
    }

    /**
     * @param o MAC_NORM_ABILITY
     */
    public void setMacNormAbility(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macNormAbility = new java.math.BigDecimal(o.toString());
        } else {
            this.macNormAbility = null;
        }
    }

    /** MAC_MAX_ABILITY */
    private java.math.BigDecimal macMaxAbility;

    /**
     * @return MAC_MAX_ABILITY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_MAX_ABILITY")
    public java.math.BigDecimal getMacMaxAbility() {
        return this.macMaxAbility;
    }

    /**
     * @param o MAC_MAX_ABILITY
     */
    public void setMacMaxAbility(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macMaxAbility = new java.math.BigDecimal(o.toString());
        } else {
            this.macMaxAbility = null;
        }
    }

    /** MAC_COUNTS */
    private java.math.BigDecimal macCounts;

    /**
     * @return MAC_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_COUNTS")
    public java.math.BigDecimal getMacCounts() {
        return this.macCounts;
    }

    /**
     * @param o MAC_COUNTS
     */
    public void setMacCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.macCounts = null;
        }
    }

    /** ACT_GATHER_PAT_NO */
    private String actGatherPatNo;

    /**
     * @return ACT_GATHER_PAT_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_GATHER_PAT_NO")
    public String getActGatherPatNo() {
        return this.actGatherPatNo;
    }

    /**
     * @param o ACT_GATHER_PAT_NO
     */
    public void setActGatherPatNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actGatherPatNo = String.valueOf(o.toString());
        } else {
            this.actGatherPatNo = null;
        }
    }

    /** OPE_FORM_PAT_NO */
    private String opeFormPatNo;

    /**
     * @return OPE_FORM_PAT_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_FORM_PAT_NO")
    public String getOpeFormPatNo() {
        return this.opeFormPatNo;
    }

    /**
     * @param o OPE_FORM_PAT_NO
     */
    public void setOpeFormPatNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeFormPatNo = String.valueOf(o.toString());
        } else {
            this.opeFormPatNo = null;
        }
    }

    /** DELAY_ALERT_DAYS */
    private java.math.BigDecimal delayAlertDays;

    /**
     * @return DELAY_ALERT_DAYS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELAY_ALERT_DAYS")
    public java.math.BigDecimal getDelayAlertDays() {
        return this.delayAlertDays;
    }

    /**
     * @param o DELAY_ALERT_DAYS
     */
    public void setDelayAlertDays(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.delayAlertDays = new java.math.BigDecimal(o.toString());
        } else {
            this.delayAlertDays = null;
        }
    }

    /** ATO_CONTROL */
    private String atoControl;

    /**
     * @return ATO_CONTROL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ATO_CONTROL")
    public String getAtoControl() {
        return this.atoControl;
    }

    /**
     * @param o ATO_CONTROL
     */
    public void setAtoControl(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.atoControl = String.valueOf(o.toString());
        } else {
            this.atoControl = null;
        }
    }

    /** ROUTING_CODE */
    private String routingCode;

    /**
     * @return ROUTING_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING_CODE")
    public String getRoutingCode() {
        return this.routingCode;
    }

    /**
     * @param o ROUTING_CODE
     */
    public void setRoutingCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingCode = String.valueOf(o.toString());
        } else {
            this.routingCode = null;
        }
    }

    /** IN_OUT_KBN */
    private java.math.BigDecimal inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("IN_OUT_KBN")
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

    /** WS_CODE */
    private String wsCode;

    /**
     * @return WS_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("WS_CODE")
    public String getWsCode() {
        return this.wsCode;
    }

    /**
     * @param o WS_CODE
     */
    public void setWsCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wsCode = String.valueOf(o.toString());
        } else {
            this.wsCode = null;
        }
    }

    /** COST_CENTER_CODE */
    private String costCenterCode;

    /**
     * @return COST_CENTER_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COST_CENTER_CODE")
    public String getCostCenterCode() {
        return this.costCenterCode;
    }

    /**
     * @param o COST_CENTER_CODE
     */
    public void setCostCenterCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costCenterCode = String.valueOf(o.toString());
        } else {
            this.costCenterCode = null;
        }
    }

    /** NECK_KBN */
    private java.math.BigDecimal neckKbn;

    /**
     * @return NECK_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NECK_KBN")
    public java.math.BigDecimal getNeckKbn() {
        return this.neckKbn;
    }

    /**
     * @param o NECK_KBN
     */
    public void setNeckKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.neckKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.neckKbn = null;
        }
    }

    /** SUB_INV_CODE */
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUB_INV_CODE")
    public String getSubInvCode() {
        return this.subInvCode;
    }

    /**
     * @param o SUB_INV_CODE
     */
    public void setSubInvCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.subInvCode = String.valueOf(o.toString());
        } else {
            this.subInvCode = null;
        }
    }

    /** STOCK_CONTROL */
    private java.math.BigDecimal stockControl;

    /**
     * @return STOCK_CONTROL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STOCK_CONTROL")
    public java.math.BigDecimal getStockControl() {
        return this.stockControl;
    }

    /**
     * @param o STOCK_CONTROL
     */
    public void setStockControl(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stockControl = new java.math.BigDecimal(o.toString());
        } else {
            this.stockControl = null;
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CHANGE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CHANGE")
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag = new java.math.BigDecimal(0);

    /**
     * @return DELETE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_FLAG")
    public java.math.BigDecimal getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * @param o DELETE_FLAG
     */
    public void setDeleteFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.deleteFlag = null;
        }
    }

    /** ST_ALERT_RATIO */
    private java.math.BigDecimal stAlertRatio;

    /**
     * @return ST_ALERT_RATIO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ST_ALERT_RATIO")
    public java.math.BigDecimal getStAlertRatio() {
        return this.stAlertRatio;
    }

    /**
     * @param o ST_ALERT_RATIO
     */
    public void setStAlertRatio(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stAlertRatio = new java.math.BigDecimal(o.toString());
        } else {
            this.stAlertRatio = null;
        }
    }

    /** ACT_INPUT_TYPE */
    private java.math.BigDecimal actInputType;

    /**
     * @return ACT_INPUT_TYPE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_INPUT_TYPE")
    public java.math.BigDecimal getActInputType() {
        return this.actInputType;
    }

    /**
     * @param o ACT_INPUT_TYPE
     */
    public void setActInputType(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actInputType = new java.math.BigDecimal(o.toString());
        } else {
            this.actInputType = null;
        }
    }

    /** NICHIJI_SHIME_F */
    private String nichijiShimeF = "0";

    /**
     * @return NICHIJI_SHIME_F
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NICHIJI_SHIME_F")
    public String getNichijiShimeF() {
        return this.nichijiShimeF;
    }

    /**
     * @param o NICHIJI_SHIME_F
     */
    public void setNichijiShimeF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nichijiShimeF = String.valueOf(o.toString());
        } else {
            this.nichijiShimeF = null;
        }
    }

    /**
     * MST_WC_BK照会
     *
     * @param param1 WC_CODE
     * @param param2 YY
     * @return MST_WC_BK
     */
    public static MstWcBk get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM MST_WC_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("wc_code", param1);
        params.put("yy", param2);

        return Queries.get(sql, params, MstWcBk.class);
    }

    /**
     * MST_WC_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MST_WC_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"WC_NAME\" -- :wc_name");
        nameList.add("\"NORM_LT\" -- :norm_lt");
        nameList.add("\"MAC_NORM_ABILITY\" -- :mac_norm_ability");
        nameList.add("\"MAC_MAX_ABILITY\" -- :mac_max_ability");
        nameList.add("\"MAC_COUNTS\" -- :mac_counts");
        nameList.add("\"ACT_GATHER_PAT_NO\" -- :act_gather_pat_no");
        nameList.add("\"OPE_FORM_PAT_NO\" -- :ope_form_pat_no");
        nameList.add("\"DELAY_ALERT_DAYS\" -- :delay_alert_days");
        nameList.add("\"ATO_CONTROL\" -- :ato_control");
        nameList.add("\"ROUTING_CODE\" -- :routing_code");
        nameList.add("\"IN_OUT_KBN\" -- :in_out_kbn");
        nameList.add("\"WS_CODE\" -- :ws_code");
        nameList.add("\"COST_CENTER_CODE\" -- :cost_center_code");
        nameList.add("\"NECK_KBN\" -- :neck_kbn");
        nameList.add("\"SUB_INV_CODE\" -- :sub_inv_code");
        nameList.add("\"STOCK_CONTROL\" -- :stock_control");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"ST_ALERT_RATIO\" -- :st_alert_ratio");
        nameList.add("\"ACT_INPUT_TYPE\" -- :act_input_type");
        nameList.add("\"NICHIJI_SHIME_F\" -- :nichiji_shime_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_WC_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":wc_code");
        valueList.add(":wc_name");
        valueList.add(":norm_lt");
        valueList.add(":mac_norm_ability");
        valueList.add(":mac_max_ability");
        valueList.add(":mac_counts");
        valueList.add(":act_gather_pat_no");
        valueList.add(":ope_form_pat_no");
        valueList.add(":delay_alert_days");
        valueList.add(":ato_control");
        valueList.add(":routing_code");
        valueList.add(":in_out_kbn");
        valueList.add(":ws_code");
        valueList.add(":cost_center_code");
        valueList.add(":neck_kbn");
        valueList.add(":sub_inv_code");
        valueList.add(":stock_control");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":st_alert_ratio");
        valueList.add(":act_input_type");
        valueList.add(":nichiji_shime_f");
        return String.join("\r\n    , ", valueList);
    }

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"YY\") IS NULL THEN 0 ELSE MAX(e.\"YY\") * 1 END + 1, 4, '0') AS \"YY\" FROM MST_WC_BK e WHERE e.\"YY\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"WC_CODE\" = :wc_code");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("wc_code", this.wcCode);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * MST_WC_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_WC_BKの登録
        String sql = "UPDATE MST_WC_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"WC_NAME\" = :wc_name");
        setList.add("\"NORM_LT\" = :norm_lt");
        setList.add("\"MAC_NORM_ABILITY\" = :mac_norm_ability");
        setList.add("\"MAC_MAX_ABILITY\" = :mac_max_ability");
        setList.add("\"MAC_COUNTS\" = :mac_counts");
        setList.add("\"ACT_GATHER_PAT_NO\" = :act_gather_pat_no");
        setList.add("\"OPE_FORM_PAT_NO\" = :ope_form_pat_no");
        setList.add("\"DELAY_ALERT_DAYS\" = :delay_alert_days");
        setList.add("\"ATO_CONTROL\" = :ato_control");
        setList.add("\"ROUTING_CODE\" = :routing_code");
        setList.add("\"IN_OUT_KBN\" = :in_out_kbn");
        setList.add("\"WS_CODE\" = :ws_code");
        setList.add("\"COST_CENTER_CODE\" = :cost_center_code");
        setList.add("\"NECK_KBN\" = :neck_kbn");
        setList.add("\"SUB_INV_CODE\" = :sub_inv_code");
        setList.add("\"STOCK_CONTROL\" = :stock_control");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"ST_ALERT_RATIO\" = :st_alert_ratio");
        setList.add("\"ACT_INPUT_TYPE\" = :act_input_type");
        setList.add("\"NICHIJI_SHIME_F\" = :nichiji_shime_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_WC_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_WC_BKの削除
        String sql = "DELETE FROM MST_WC_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("wc_code", this.wcCode);
        params.put("wc_name", this.wcName);
        params.put("norm_lt", this.normLt);
        params.put("mac_norm_ability", this.macNormAbility);
        params.put("mac_max_ability", this.macMaxAbility);
        params.put("mac_counts", this.macCounts);
        params.put("act_gather_pat_no", this.actGatherPatNo);
        params.put("ope_form_pat_no", this.opeFormPatNo);
        params.put("delay_alert_days", this.delayAlertDays);
        params.put("ato_control", this.atoControl);
        params.put("routing_code", this.routingCode);
        params.put("in_out_kbn", this.inOutKbn);
        params.put("ws_code", this.wsCode);
        params.put("cost_center_code", this.costCenterCode);
        params.put("neck_kbn", this.neckKbn);
        params.put("sub_inv_code", this.subInvCode);
        params.put("stock_control", this.stockControl);
        params.put("delete_flag", this.deleteFlag);
        params.put("st_alert_ratio", this.stAlertRatio);
        params.put("act_input_type", this.actInputType);
        params.put("nichiji_shime_f", this.nichijiShimeF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
