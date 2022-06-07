package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_STK_PLAN_BK
 *
 * @author emarfkrow
 */
public class InvStkPlanBk implements IEntity {

    /** PRO_HINBAN */
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_HINBAN")
    public String getProHinban() {
        return this.proHinban;
    }

    /**
     * @param o PRO_HINBAN
     */
    public void setProHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proHinban = String.valueOf(o.toString());
        } else {
            this.proHinban = null;
        }
    }

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YYYY")
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
    @com.fasterxml.jackson.annotation.JsonProperty("MM")
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

    /** PAP_KAN_AMT_SCH */
    private java.math.BigDecimal papKanAmtSch;

    /**
     * @return PAP_KAN_AMT_SCH
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAP_KAN_AMT_SCH")
    public java.math.BigDecimal getPapKanAmtSch() {
        return this.papKanAmtSch;
    }

    /**
     * @param o PAP_KAN_AMT_SCH
     */
    public void setPapKanAmtSch(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.papKanAmtSch = new java.math.BigDecimal(o.toString());
        } else {
            this.papKanAmtSch = null;
        }
    }

    /** PAP_KAN_AMT_SCH_FST */
    private java.math.BigDecimal papKanAmtSchFst;

    /**
     * @return PAP_KAN_AMT_SCH_FST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAP_KAN_AMT_SCH_FST")
    public java.math.BigDecimal getPapKanAmtSchFst() {
        return this.papKanAmtSchFst;
    }

    /**
     * @param o PAP_KAN_AMT_SCH_FST
     */
    public void setPapKanAmtSchFst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.papKanAmtSchFst = new java.math.BigDecimal(o.toString());
        } else {
            this.papKanAmtSchFst = null;
        }
    }

    /** PAP_KAN_AMT_SCH_MID */
    private java.math.BigDecimal papKanAmtSchMid;

    /**
     * @return PAP_KAN_AMT_SCH_MID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAP_KAN_AMT_SCH_MID")
    public java.math.BigDecimal getPapKanAmtSchMid() {
        return this.papKanAmtSchMid;
    }

    /**
     * @param o PAP_KAN_AMT_SCH_MID
     */
    public void setPapKanAmtSchMid(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.papKanAmtSchMid = new java.math.BigDecimal(o.toString());
        } else {
            this.papKanAmtSchMid = null;
        }
    }

    /** PAP_KAN_AMT_SCH_LST */
    private java.math.BigDecimal papKanAmtSchLst;

    /**
     * @return PAP_KAN_AMT_SCH_LST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAP_KAN_AMT_SCH_LST")
    public java.math.BigDecimal getPapKanAmtSchLst() {
        return this.papKanAmtSchLst;
    }

    /**
     * @param o PAP_KAN_AMT_SCH_LST
     */
    public void setPapKanAmtSchLst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.papKanAmtSchLst = new java.math.BigDecimal(o.toString());
        } else {
            this.papKanAmtSchLst = null;
        }
    }

    /** PAP_KAN_AMT_ACT_FST */
    private java.math.BigDecimal papKanAmtActFst;

    /**
     * @return PAP_KAN_AMT_ACT_FST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAP_KAN_AMT_ACT_FST")
    public java.math.BigDecimal getPapKanAmtActFst() {
        return this.papKanAmtActFst;
    }

    /**
     * @param o PAP_KAN_AMT_ACT_FST
     */
    public void setPapKanAmtActFst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.papKanAmtActFst = new java.math.BigDecimal(o.toString());
        } else {
            this.papKanAmtActFst = null;
        }
    }

    /** PAP_KAN_AMT_ACT_MID */
    private java.math.BigDecimal papKanAmtActMid;

    /**
     * @return PAP_KAN_AMT_ACT_MID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAP_KAN_AMT_ACT_MID")
    public java.math.BigDecimal getPapKanAmtActMid() {
        return this.papKanAmtActMid;
    }

    /**
     * @param o PAP_KAN_AMT_ACT_MID
     */
    public void setPapKanAmtActMid(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.papKanAmtActMid = new java.math.BigDecimal(o.toString());
        } else {
            this.papKanAmtActMid = null;
        }
    }

    /** PAP_KAN_AMT_ACT_LST */
    private java.math.BigDecimal papKanAmtActLst;

    /**
     * @return PAP_KAN_AMT_ACT_LST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAP_KAN_AMT_ACT_LST")
    public java.math.BigDecimal getPapKanAmtActLst() {
        return this.papKanAmtActLst;
    }

    /**
     * @param o PAP_KAN_AMT_ACT_LST
     */
    public void setPapKanAmtActLst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.papKanAmtActLst = new java.math.BigDecimal(o.toString());
        } else {
            this.papKanAmtActLst = null;
        }
    }

    /** PAP_KAN_AMT_ACT */
    private java.math.BigDecimal papKanAmtAct;

    /**
     * @return PAP_KAN_AMT_ACT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAP_KAN_AMT_ACT")
    public java.math.BigDecimal getPapKanAmtAct() {
        return this.papKanAmtAct;
    }

    /**
     * @param o PAP_KAN_AMT_ACT
     */
    public void setPapKanAmtAct(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.papKanAmtAct = new java.math.BigDecimal(o.toString());
        } else {
            this.papKanAmtAct = null;
        }
    }

    /** REQ_COUNTS */
    private java.math.BigDecimal reqCounts;

    /**
     * @return REQ_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_COUNTS")
    public java.math.BigDecimal getReqCounts() {
        return this.reqCounts;
    }

    /**
     * @param o REQ_COUNTS
     */
    public void setReqCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.reqCounts = null;
        }
    }

    /** REQ_NES_COUNTS */
    private java.math.BigDecimal reqNesCounts;

    /**
     * @return REQ_NES_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_NES_COUNTS")
    public java.math.BigDecimal getReqNesCounts() {
        return this.reqNesCounts;
    }

    /**
     * @param o REQ_NES_COUNTS
     */
    public void setReqNesCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqNesCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.reqNesCounts = null;
        }
    }

    /** REQ_PAP_KAN_AMT_SCH */
    private java.math.BigDecimal reqPapKanAmtSch;

    /**
     * @return REQ_PAP_KAN_AMT_SCH
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_PAP_KAN_AMT_SCH")
    public java.math.BigDecimal getReqPapKanAmtSch() {
        return this.reqPapKanAmtSch;
    }

    /**
     * @param o REQ_PAP_KAN_AMT_SCH
     */
    public void setReqPapKanAmtSch(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPapKanAmtSch = new java.math.BigDecimal(o.toString());
        } else {
            this.reqPapKanAmtSch = null;
        }
    }

    /** REQ_PAP_KAN_AMT_SCH_FST */
    private java.math.BigDecimal reqPapKanAmtSchFst;

    /**
     * @return REQ_PAP_KAN_AMT_SCH_FST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_PAP_KAN_AMT_SCH_FST")
    public java.math.BigDecimal getReqPapKanAmtSchFst() {
        return this.reqPapKanAmtSchFst;
    }

    /**
     * @param o REQ_PAP_KAN_AMT_SCH_FST
     */
    public void setReqPapKanAmtSchFst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPapKanAmtSchFst = new java.math.BigDecimal(o.toString());
        } else {
            this.reqPapKanAmtSchFst = null;
        }
    }

    /** REQ_PAP_KAN_AMT_SCH_MID */
    private java.math.BigDecimal reqPapKanAmtSchMid;

    /**
     * @return REQ_PAP_KAN_AMT_SCH_MID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_PAP_KAN_AMT_SCH_MID")
    public java.math.BigDecimal getReqPapKanAmtSchMid() {
        return this.reqPapKanAmtSchMid;
    }

    /**
     * @param o REQ_PAP_KAN_AMT_SCH_MID
     */
    public void setReqPapKanAmtSchMid(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPapKanAmtSchMid = new java.math.BigDecimal(o.toString());
        } else {
            this.reqPapKanAmtSchMid = null;
        }
    }

    /** REQ_PAP_KAN_AMT_SCH_LST */
    private java.math.BigDecimal reqPapKanAmtSchLst;

    /**
     * @return REQ_PAP_KAN_AMT_SCH_LST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_PAP_KAN_AMT_SCH_LST")
    public java.math.BigDecimal getReqPapKanAmtSchLst() {
        return this.reqPapKanAmtSchLst;
    }

    /**
     * @param o REQ_PAP_KAN_AMT_SCH_LST
     */
    public void setReqPapKanAmtSchLst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPapKanAmtSchLst = new java.math.BigDecimal(o.toString());
        } else {
            this.reqPapKanAmtSchLst = null;
        }
    }

    /** REQ_PAP_KAN_AMT_ACT_FST */
    private java.math.BigDecimal reqPapKanAmtActFst;

    /**
     * @return REQ_PAP_KAN_AMT_ACT_FST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_PAP_KAN_AMT_ACT_FST")
    public java.math.BigDecimal getReqPapKanAmtActFst() {
        return this.reqPapKanAmtActFst;
    }

    /**
     * @param o REQ_PAP_KAN_AMT_ACT_FST
     */
    public void setReqPapKanAmtActFst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPapKanAmtActFst = new java.math.BigDecimal(o.toString());
        } else {
            this.reqPapKanAmtActFst = null;
        }
    }

    /** REQ_PAP_KAN_AMT_ACT_MID */
    private java.math.BigDecimal reqPapKanAmtActMid;

    /**
     * @return REQ_PAP_KAN_AMT_ACT_MID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_PAP_KAN_AMT_ACT_MID")
    public java.math.BigDecimal getReqPapKanAmtActMid() {
        return this.reqPapKanAmtActMid;
    }

    /**
     * @param o REQ_PAP_KAN_AMT_ACT_MID
     */
    public void setReqPapKanAmtActMid(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPapKanAmtActMid = new java.math.BigDecimal(o.toString());
        } else {
            this.reqPapKanAmtActMid = null;
        }
    }

    /** REQ_PAP_KAN_AMT_ACT_LST */
    private java.math.BigDecimal reqPapKanAmtActLst;

    /**
     * @return REQ_PAP_KAN_AMT_ACT_LST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_PAP_KAN_AMT_ACT_LST")
    public java.math.BigDecimal getReqPapKanAmtActLst() {
        return this.reqPapKanAmtActLst;
    }

    /**
     * @param o REQ_PAP_KAN_AMT_ACT_LST
     */
    public void setReqPapKanAmtActLst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPapKanAmtActLst = new java.math.BigDecimal(o.toString());
        } else {
            this.reqPapKanAmtActLst = null;
        }
    }

    /** REQ_PAP_KAN_AMT_ACT */
    private java.math.BigDecimal reqPapKanAmtAct;

    /**
     * @return REQ_PAP_KAN_AMT_ACT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REQ_PAP_KAN_AMT_ACT")
    public java.math.BigDecimal getReqPapKanAmtAct() {
        return this.reqPapKanAmtAct;
    }

    /**
     * @param o REQ_PAP_KAN_AMT_ACT
     */
    public void setReqPapKanAmtAct(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reqPapKanAmtAct = new java.math.BigDecimal(o.toString());
        } else {
            this.reqPapKanAmtAct = null;
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

    /**
     * INV_STK_PLAN_BK照会
     *
     * @return INV_STK_PLAN_BK
     */
    public static InvStkPlanBk get() {

        List<String> whereList = new ArrayList<String>();

        String sql = "SELECT * FROM INV_STK_PLAN_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();

        return Queries.get(sql, params, InvStkPlanBk.class);
    }

    /**
     * INV_STK_PLAN_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_STK_PLAN_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PRO_HINBAN\" -- :pro_hinban");
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"PAP_KAN_AMT_SCH\" -- :pap_kan_amt_sch");
        nameList.add("\"PAP_KAN_AMT_SCH_FST\" -- :pap_kan_amt_sch_fst");
        nameList.add("\"PAP_KAN_AMT_SCH_MID\" -- :pap_kan_amt_sch_mid");
        nameList.add("\"PAP_KAN_AMT_SCH_LST\" -- :pap_kan_amt_sch_lst");
        nameList.add("\"PAP_KAN_AMT_ACT_FST\" -- :pap_kan_amt_act_fst");
        nameList.add("\"PAP_KAN_AMT_ACT_MID\" -- :pap_kan_amt_act_mid");
        nameList.add("\"PAP_KAN_AMT_ACT_LST\" -- :pap_kan_amt_act_lst");
        nameList.add("\"PAP_KAN_AMT_ACT\" -- :pap_kan_amt_act");
        nameList.add("\"REQ_COUNTS\" -- :req_counts");
        nameList.add("\"REQ_NES_COUNTS\" -- :req_nes_counts");
        nameList.add("\"REQ_PAP_KAN_AMT_SCH\" -- :req_pap_kan_amt_sch");
        nameList.add("\"REQ_PAP_KAN_AMT_SCH_FST\" -- :req_pap_kan_amt_sch_fst");
        nameList.add("\"REQ_PAP_KAN_AMT_SCH_MID\" -- :req_pap_kan_amt_sch_mid");
        nameList.add("\"REQ_PAP_KAN_AMT_SCH_LST\" -- :req_pap_kan_amt_sch_lst");
        nameList.add("\"REQ_PAP_KAN_AMT_ACT_FST\" -- :req_pap_kan_amt_act_fst");
        nameList.add("\"REQ_PAP_KAN_AMT_ACT_MID\" -- :req_pap_kan_amt_act_mid");
        nameList.add("\"REQ_PAP_KAN_AMT_ACT_LST\" -- :req_pap_kan_amt_act_lst");
        nameList.add("\"REQ_PAP_KAN_AMT_ACT\" -- :req_pap_kan_amt_act");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_STK_PLAN_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pro_hinban");
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":pap_kan_amt_sch");
        valueList.add(":pap_kan_amt_sch_fst");
        valueList.add(":pap_kan_amt_sch_mid");
        valueList.add(":pap_kan_amt_sch_lst");
        valueList.add(":pap_kan_amt_act_fst");
        valueList.add(":pap_kan_amt_act_mid");
        valueList.add(":pap_kan_amt_act_lst");
        valueList.add(":pap_kan_amt_act");
        valueList.add(":req_counts");
        valueList.add(":req_nes_counts");
        valueList.add(":req_pap_kan_amt_sch");
        valueList.add(":req_pap_kan_amt_sch_fst");
        valueList.add(":req_pap_kan_amt_sch_mid");
        valueList.add(":req_pap_kan_amt_sch_lst");
        valueList.add(":req_pap_kan_amt_act_fst");
        valueList.add(":req_pap_kan_amt_act_mid");
        valueList.add(":req_pap_kan_amt_act_lst");
        valueList.add(":req_pap_kan_amt_act");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_STK_PLAN_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STK_PLAN_BKの登録
        String sql = "UPDATE INV_STK_PLAN_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PRO_HINBAN\" = :pro_hinban");
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"PAP_KAN_AMT_SCH\" = :pap_kan_amt_sch");
        setList.add("\"PAP_KAN_AMT_SCH_FST\" = :pap_kan_amt_sch_fst");
        setList.add("\"PAP_KAN_AMT_SCH_MID\" = :pap_kan_amt_sch_mid");
        setList.add("\"PAP_KAN_AMT_SCH_LST\" = :pap_kan_amt_sch_lst");
        setList.add("\"PAP_KAN_AMT_ACT_FST\" = :pap_kan_amt_act_fst");
        setList.add("\"PAP_KAN_AMT_ACT_MID\" = :pap_kan_amt_act_mid");
        setList.add("\"PAP_KAN_AMT_ACT_LST\" = :pap_kan_amt_act_lst");
        setList.add("\"PAP_KAN_AMT_ACT\" = :pap_kan_amt_act");
        setList.add("\"REQ_COUNTS\" = :req_counts");
        setList.add("\"REQ_NES_COUNTS\" = :req_nes_counts");
        setList.add("\"REQ_PAP_KAN_AMT_SCH\" = :req_pap_kan_amt_sch");
        setList.add("\"REQ_PAP_KAN_AMT_SCH_FST\" = :req_pap_kan_amt_sch_fst");
        setList.add("\"REQ_PAP_KAN_AMT_SCH_MID\" = :req_pap_kan_amt_sch_mid");
        setList.add("\"REQ_PAP_KAN_AMT_SCH_LST\" = :req_pap_kan_amt_sch_lst");
        setList.add("\"REQ_PAP_KAN_AMT_ACT_FST\" = :req_pap_kan_amt_act_fst");
        setList.add("\"REQ_PAP_KAN_AMT_ACT_MID\" = :req_pap_kan_amt_act_mid");
        setList.add("\"REQ_PAP_KAN_AMT_ACT_LST\" = :req_pap_kan_amt_act_lst");
        setList.add("\"REQ_PAP_KAN_AMT_ACT\" = :req_pap_kan_amt_act");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_STK_PLAN_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STK_PLAN_BKの削除
        String sql = "DELETE FROM INV_STK_PLAN_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_hinban", this.proHinban);
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("pap_kan_amt_sch", this.papKanAmtSch);
        params.put("pap_kan_amt_sch_fst", this.papKanAmtSchFst);
        params.put("pap_kan_amt_sch_mid", this.papKanAmtSchMid);
        params.put("pap_kan_amt_sch_lst", this.papKanAmtSchLst);
        params.put("pap_kan_amt_act_fst", this.papKanAmtActFst);
        params.put("pap_kan_amt_act_mid", this.papKanAmtActMid);
        params.put("pap_kan_amt_act_lst", this.papKanAmtActLst);
        params.put("pap_kan_amt_act", this.papKanAmtAct);
        params.put("req_counts", this.reqCounts);
        params.put("req_nes_counts", this.reqNesCounts);
        params.put("req_pap_kan_amt_sch", this.reqPapKanAmtSch);
        params.put("req_pap_kan_amt_sch_fst", this.reqPapKanAmtSchFst);
        params.put("req_pap_kan_amt_sch_mid", this.reqPapKanAmtSchMid);
        params.put("req_pap_kan_amt_sch_lst", this.reqPapKanAmtSchLst);
        params.put("req_pap_kan_amt_act_fst", this.reqPapKanAmtActFst);
        params.put("req_pap_kan_amt_act_mid", this.reqPapKanAmtActMid);
        params.put("req_pap_kan_amt_act_lst", this.reqPapKanAmtActLst);
        params.put("req_pap_kan_amt_act", this.reqPapKanAmtAct);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
