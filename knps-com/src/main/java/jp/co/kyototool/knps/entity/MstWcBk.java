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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
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
    private String nichijiShimeF;

    /**
     * @return NICHIJI_SHIME_F
     */
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
        whereList.add("TRIM (wc_code) = TRIM (:wc_code)");
        whereList.add("TRIM (yy) = TRIM (:yy)");

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
        nameList.add("yy -- :yy");
        nameList.add("wc_code -- :wc_code");
        nameList.add("wc_name -- :wc_name");
        nameList.add("norm_lt -- :norm_lt");
        nameList.add("mac_norm_ability -- :mac_norm_ability");
        nameList.add("mac_max_ability -- :mac_max_ability");
        nameList.add("mac_counts -- :mac_counts");
        nameList.add("act_gather_pat_no -- :act_gather_pat_no");
        nameList.add("ope_form_pat_no -- :ope_form_pat_no");
        nameList.add("delay_alert_days -- :delay_alert_days");
        nameList.add("ato_control -- :ato_control");
        nameList.add("routing_code -- :routing_code");
        nameList.add("in_out_kbn -- :in_out_kbn");
        nameList.add("ws_code -- :ws_code");
        nameList.add("cost_center_code -- :cost_center_code");
        nameList.add("neck_kbn -- :neck_kbn");
        nameList.add("sub_inv_code -- :sub_inv_code");
        nameList.add("stock_control -- :stock_control");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        nameList.add("st_alert_ratio -- :st_alert_ratio");
        nameList.add("act_input_type -- :act_input_type");
        nameList.add("nichiji_shime_f -- :nichiji_shime_f");
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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.YY) IS NULL THEN 0 ELSE MAX(e.YY) * 1 END + 1, 4, '0') AS YY FROM MST_WC_BK e WHERE e.YY < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.WC_CODE = :wc_code");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("wcCode", this.wcCode);

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
        setList.add("yy = :yy");
        setList.add("wc_code = :wc_code");
        setList.add("wc_name = :wc_name");
        setList.add("norm_lt = :norm_lt");
        setList.add("mac_norm_ability = :mac_norm_ability");
        setList.add("mac_max_ability = :mac_max_ability");
        setList.add("mac_counts = :mac_counts");
        setList.add("act_gather_pat_no = :act_gather_pat_no");
        setList.add("ope_form_pat_no = :ope_form_pat_no");
        setList.add("delay_alert_days = :delay_alert_days");
        setList.add("ato_control = :ato_control");
        setList.add("routing_code = :routing_code");
        setList.add("in_out_kbn = :in_out_kbn");
        setList.add("ws_code = :ws_code");
        setList.add("cost_center_code = :cost_center_code");
        setList.add("neck_kbn = :neck_kbn");
        setList.add("sub_inv_code = :sub_inv_code");
        setList.add("stock_control = :stock_control");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        setList.add("st_alert_ratio = :st_alert_ratio");
        setList.add("act_input_type = :act_input_type");
        setList.add("nichiji_shime_f = :nichiji_shime_f");
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
        whereList.add("TRIM (wc_code) = TRIM (:wc_code)");
        whereList.add("TRIM (yy) = TRIM (:yy)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YY", this.yy);
        params.put("WC_CODE", this.wcCode);
        params.put("WC_NAME", this.wcName);
        params.put("NORM_LT", this.normLt);
        params.put("MAC_NORM_ABILITY", this.macNormAbility);
        params.put("MAC_MAX_ABILITY", this.macMaxAbility);
        params.put("MAC_COUNTS", this.macCounts);
        params.put("ACT_GATHER_PAT_NO", this.actGatherPatNo);
        params.put("OPE_FORM_PAT_NO", this.opeFormPatNo);
        params.put("DELAY_ALERT_DAYS", this.delayAlertDays);
        params.put("ATO_CONTROL", this.atoControl);
        params.put("ROUTING_CODE", this.routingCode);
        params.put("IN_OUT_KBN", this.inOutKbn);
        params.put("WS_CODE", this.wsCode);
        params.put("COST_CENTER_CODE", this.costCenterCode);
        params.put("NECK_KBN", this.neckKbn);
        params.put("SUB_INV_CODE", this.subInvCode);
        params.put("STOCK_CONTROL", this.stockControl);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("ST_ALERT_RATIO", this.stAlertRatio);
        params.put("ACT_INPUT_TYPE", this.actInputType);
        params.put("NICHIJI_SHIME_F", this.nichijiShimeF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
