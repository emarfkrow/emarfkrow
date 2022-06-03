package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_W_WC_MCN_LOAD_PLAN
 *
 * @author emarfkrow
 */
public class PrdWWcMcnLoadPlan implements IEntity {

    /** W_PLAN_ID */
    private java.math.BigDecimal wPlanId;

    /**
     * @return W_PLAN_ID
     */
    public java.math.BigDecimal getWPlanId() {
        return this.wPlanId;
    }

    /**
     * @param o W_PLAN_ID
     */
    public void setWPlanId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wPlanId = new java.math.BigDecimal(o.toString());
        } else {
            this.wPlanId = null;
        }
    }

    /** MAN_HINBAN */
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    public String getManHinban() {
        return this.manHinban;
    }

    /**
     * @param o MAN_HINBAN
     */
    public void setManHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.manHinban = String.valueOf(o.toString());
        } else {
            this.manHinban = null;
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

    /** WS_NAME */
    private String wsName;

    /**
     * @return WS_NAME
     */
    public String getWsName() {
        return this.wsName;
    }

    /**
     * @param o WS_NAME
     */
    public void setWsName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wsName = String.valueOf(o.toString());
        } else {
            this.wsName = null;
        }
    }

    /** OPE_DETAIL */
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return this.opeDetail;
    }

    /**
     * @param o OPE_DETAIL
     */
    public void setOpeDetail(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeDetail = String.valueOf(o.toString());
        } else {
            this.opeDetail = null;
        }
    }

    /** HUM_PRE_TIME */
    private java.math.BigDecimal humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    public java.math.BigDecimal getHumPreTime() {
        return this.humPreTime;
    }

    /**
     * @param o HUM_PRE_TIME
     */
    public void setHumPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humPreTime = null;
        }
    }

    /** HUM_ACT_TIME */
    private java.math.BigDecimal humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    public java.math.BigDecimal getHumActTime() {
        return this.humActTime;
    }

    /**
     * @param o HUM_ACT_TIME
     */
    public void setHumActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humActTime = null;
        }
    }

    /** HUM_TOTAL_TIME */
    private java.math.BigDecimal humTotalTime;

    /**
     * @return HUM_TOTAL_TIME
     */
    public java.math.BigDecimal getHumTotalTime() {
        return this.humTotalTime;
    }

    /**
     * @param o HUM_TOTAL_TIME
     */
    public void setHumTotalTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humTotalTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humTotalTime = null;
        }
    }

    /** MAC_PRE_TIME */
    private java.math.BigDecimal macPreTime;

    /**
     * @return MAC_PRE_TIME
     */
    public java.math.BigDecimal getMacPreTime() {
        return this.macPreTime;
    }

    /**
     * @param o MAC_PRE_TIME
     */
    public void setMacPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macPreTime = null;
        }
    }

    /** MAC_ACT_TIME */
    private java.math.BigDecimal macActTime;

    /**
     * @return MAC_ACT_TIME
     */
    public java.math.BigDecimal getMacActTime() {
        return this.macActTime;
    }

    /**
     * @param o MAC_ACT_TIME
     */
    public void setMacActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macActTime = null;
        }
    }

    /** MAC_TOTAL_TIME */
    private java.math.BigDecimal macTotalTime;

    /**
     * @return MAC_TOTAL_TIME
     */
    public java.math.BigDecimal getMacTotalTime() {
        return this.macTotalTime;
    }

    /**
     * @param o MAC_TOTAL_TIME
     */
    public void setMacTotalTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macTotalTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macTotalTime = null;
        }
    }

    /** PRO_NES_COUNTS */
    private java.math.BigDecimal proNesCounts;

    /**
     * @return PRO_NES_COUNTS
     */
    public java.math.BigDecimal getProNesCounts() {
        return this.proNesCounts;
    }

    /**
     * @param o PRO_NES_COUNTS
     */
    public void setProNesCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNesCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.proNesCounts = null;
        }
    }

    /** PRO_NES_WEIGHT */
    private java.math.BigDecimal proNesWeight;

    /**
     * @return PRO_NES_WEIGHT
     */
    public java.math.BigDecimal getProNesWeight() {
        return this.proNesWeight;
    }

    /**
     * @param o PRO_NES_WEIGHT
     */
    public void setProNesWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNesWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.proNesWeight = null;
        }
    }

    /** DATA_SOURCE_KBN */
    private java.math.BigDecimal dataSourceKbn;

    /**
     * @return DATA_SOURCE_KBN
     */
    public java.math.BigDecimal getDataSourceKbn() {
        return this.dataSourceKbn;
    }

    /**
     * @param o DATA_SOURCE_KBN
     */
    public void setDataSourceKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dataSourceKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.dataSourceKbn = null;
        }
    }

    /** PERIOD */
    private java.math.BigDecimal period;

    /**
     * @return PERIOD
     */
    public java.math.BigDecimal getPeriod() {
        return this.period;
    }

    /**
     * @param o PERIOD
     */
    public void setPeriod(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.period = new java.math.BigDecimal(o.toString());
        } else {
            this.period = null;
        }
    }

    /** PLAN_NO */
    private String planNo;

    /**
     * @return PLAN_NO
     */
    public String getPlanNo() {
        return this.planNo;
    }

    /**
     * @param o PLAN_NO
     */
    public void setPlanNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.planNo = String.valueOf(o.toString());
        } else {
            this.planNo = null;
        }
    }

    /** BEG_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime begDate;

    /**
     * @return BEG_DATE
     */
    public java.time.LocalDateTime getBegDate() {
        return this.begDate;
    }

    /**
     * @param o BEG_DATE
     */
    public void setBegDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.begDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.begDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.begDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.begDate = null;
        }
    }

    /** END_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime endDate;

    /**
     * @return END_DATE
     */
    public java.time.LocalDateTime getEndDate() {
        return this.endDate;
    }

    /**
     * @param o END_DATE
     */
    public void setEndDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.endDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.endDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.endDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.endDate = null;
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
     * PRD_W_WC_MCN_LOAD_PLAN照会
     *
     * @param param1 W_PLAN_ID
     * @param param2 MAN_HINBAN
     * @param param3 WC_CODE
     * @param param4 DATA_SOURCE_KBN
     * @param param5 PERIOD
     * @param param6 PLAN_NO
     * @return PRD_W_WC_MCN_LOAD_PLAN
     */
    public static PrdWWcMcnLoadPlan get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5, final Object param6) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"W_PLAN_ID\" = :w_plan_id");
        whereList.add("TRIM (\"MAN_HINBAN\") = TRIM (:man_hinban)");
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");
        whereList.add("\"DATA_SOURCE_KBN\" = :data_source_kbn");
        whereList.add("\"PERIOD\" = :period");
        whereList.add("TRIM (\"PLAN_NO\") = TRIM (:plan_no)");

        String sql = "SELECT * FROM PRD_W_WC_MCN_LOAD_PLAN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("w_plan_id", param1);
        params.put("man_hinban", param2);
        params.put("wc_code", param3);
        params.put("data_source_kbn", param4);
        params.put("period", param5);
        params.put("plan_no", param6);

        return Queries.get(sql, params, PrdWWcMcnLoadPlan.class);
    }

    /**
     * PRD_W_WC_MCN_LOAD_PLAN追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PLAN_NOの採番処理
        numbering();

        // PRD_W_WC_MCN_LOAD_PLANの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("w_plan_id -- :w_plan_id");
        nameList.add("man_hinban -- :man_hinban");
        nameList.add("wc_code -- :wc_code");
        nameList.add("wc_name -- :wc_name");
        nameList.add("ws_code -- :ws_code");
        nameList.add("ws_name -- :ws_name");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("hum_pre_time -- :hum_pre_time");
        nameList.add("hum_act_time -- :hum_act_time");
        nameList.add("hum_total_time -- :hum_total_time");
        nameList.add("mac_pre_time -- :mac_pre_time");
        nameList.add("mac_act_time -- :mac_act_time");
        nameList.add("mac_total_time -- :mac_total_time");
        nameList.add("pro_nes_counts -- :pro_nes_counts");
        nameList.add("pro_nes_weight -- :pro_nes_weight");
        nameList.add("data_source_kbn -- :data_source_kbn");
        nameList.add("period -- :period");
        nameList.add("plan_no -- :plan_no");
        nameList.add("beg_date -- :beg_date");
        nameList.add("end_date -- :end_date");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_W_WC_MCN_LOAD_PLAN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":w_plan_id");
        valueList.add(":man_hinban");
        valueList.add(":wc_code");
        valueList.add(":wc_name");
        valueList.add(":ws_code");
        valueList.add(":ws_name");
        valueList.add(":ope_detail");
        valueList.add(":hum_pre_time");
        valueList.add(":hum_act_time");
        valueList.add(":hum_total_time");
        valueList.add(":mac_pre_time");
        valueList.add(":mac_act_time");
        valueList.add(":mac_total_time");
        valueList.add(":pro_nes_counts");
        valueList.add(":pro_nes_weight");
        valueList.add(":data_source_kbn");
        valueList.add(":period");
        valueList.add(":plan_no");
        valueList.add("TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** PLAN_NOの採番処理 */
    private void numbering() {

        if (this.planNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.PLAN_NO) IS NULL THEN 0 ELSE MAX(e.PLAN_NO) * 1 END + 1, 12, '0') AS PLAN_NO FROM PRD_W_WC_MCN_LOAD_PLAN e WHERE e.PLAN_NO < '999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.W_PLAN_ID = :w_plan_id");
        whereList.add("e.MAN_HINBAN = :man_hinban");
        whereList.add("e.WC_CODE = :wc_code");
        whereList.add("e.DATA_SOURCE_KBN = :data_source_kbn");
        whereList.add("e.PERIOD = :period");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("wPlanId", this.wPlanId);
        params.put("manHinban", this.manHinban);
        params.put("wcCode", this.wcCode);
        params.put("dataSourceKbn", this.dataSourceKbn);
        params.put("period", this.period);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PLAN_NO");

        this.setPlanNo(o);
    }

    /**
     * PRD_W_WC_MCN_LOAD_PLAN更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_W_WC_MCN_LOAD_PLANの登録
        String sql = "UPDATE PRD_W_WC_MCN_LOAD_PLAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("w_plan_id = :w_plan_id");
        setList.add("man_hinban = :man_hinban");
        setList.add("wc_code = :wc_code");
        setList.add("wc_name = :wc_name");
        setList.add("ws_code = :ws_code");
        setList.add("ws_name = :ws_name");
        setList.add("ope_detail = :ope_detail");
        setList.add("hum_pre_time = :hum_pre_time");
        setList.add("hum_act_time = :hum_act_time");
        setList.add("hum_total_time = :hum_total_time");
        setList.add("mac_pre_time = :mac_pre_time");
        setList.add("mac_act_time = :mac_act_time");
        setList.add("mac_total_time = :mac_total_time");
        setList.add("pro_nes_counts = :pro_nes_counts");
        setList.add("pro_nes_weight = :pro_nes_weight");
        setList.add("data_source_kbn = :data_source_kbn");
        setList.add("period = :period");
        setList.add("plan_no = :plan_no");
        setList.add("beg_date = TO_TIMESTAMP (:beg_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("end_date = TO_TIMESTAMP (:end_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_W_WC_MCN_LOAD_PLAN削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_W_WC_MCN_LOAD_PLANの削除
        String sql = "DELETE FROM PRD_W_WC_MCN_LOAD_PLAN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("w_plan_id = :w_plan_id");
        whereList.add("TRIM (man_hinban) = TRIM (:man_hinban)");
        whereList.add("TRIM (wc_code) = TRIM (:wc_code)");
        whereList.add("data_source_kbn = :data_source_kbn");
        whereList.add("period = :period");
        whereList.add("TRIM (plan_no) = TRIM (:plan_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("W_PLAN_ID", this.wPlanId);
        params.put("MAN_HINBAN", this.manHinban);
        params.put("WC_CODE", this.wcCode);
        params.put("WC_NAME", this.wcName);
        params.put("WS_CODE", this.wsCode);
        params.put("WS_NAME", this.wsName);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("HUM_PRE_TIME", this.humPreTime);
        params.put("HUM_ACT_TIME", this.humActTime);
        params.put("HUM_TOTAL_TIME", this.humTotalTime);
        params.put("MAC_PRE_TIME", this.macPreTime);
        params.put("MAC_ACT_TIME", this.macActTime);
        params.put("MAC_TOTAL_TIME", this.macTotalTime);
        params.put("PRO_NES_COUNTS", this.proNesCounts);
        params.put("PRO_NES_WEIGHT", this.proNesWeight);
        params.put("DATA_SOURCE_KBN", this.dataSourceKbn);
        params.put("PERIOD", this.period);
        params.put("PLAN_NO", this.planNo);
        params.put("BEG_DATE", this.begDate);
        params.put("END_DATE", this.endDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
