package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_TEHAI_FLOW
 *
 * @author emarfkrow
 */
public class PrdTehaiFlow implements IEntity {

    /** PRD_TEHAI_NO */
    private String prdTehaiNo;

    /**
     * @return PRD_TEHAI_NO
     */
    public String getPrdTehaiNo() {
        return this.prdTehaiNo;
    }

    /**
     * @param o PRD_TEHAI_NO
     */
    public void setPrdTehaiNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.prdTehaiNo = String.valueOf(o.toString());
        } else {
            this.prdTehaiNo = null;
        }
    }

    /** TEHAI_FLOW_SEQ */
    private java.math.BigDecimal tehaiFlowSeq;

    /**
     * @return TEHAI_FLOW_SEQ
     */
    public java.math.BigDecimal getTehaiFlowSeq() {
        return this.tehaiFlowSeq;
    }

    /**
     * @param o TEHAI_FLOW_SEQ
     */
    public void setTehaiFlowSeq(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tehaiFlowSeq = new java.math.BigDecimal(o.toString());
        } else {
            this.tehaiFlowSeq = null;
        }
    }

    /** TEHAI_JOKYO_KB */
    private String tehaiJokyoKb;

    /**
     * @return TEHAI_JOKYO_KB
     */
    public String getTehaiJokyoKb() {
        return this.tehaiJokyoKb;
    }

    /**
     * @param o TEHAI_JOKYO_KB
     */
    public void setTehaiJokyoKb(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tehaiJokyoKb = String.valueOf(o.toString());
        } else {
            this.tehaiJokyoKb = null;
        }
    }

    /** KAITEI_JOKYO_KB */
    private String kaiteiJokyoKb;

    /**
     * @return KAITEI_JOKYO_KB
     */
    public String getKaiteiJokyoKb() {
        return this.kaiteiJokyoKb;
    }

    /**
     * @param o KAITEI_JOKYO_KB
     */
    public void setKaiteiJokyoKb(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaiteiJokyoKb = String.valueOf(o.toString());
        } else {
            this.kaiteiJokyoKb = null;
        }
    }

    /** SHORISHA_CD */
    private String shorishaCd;

    /**
     * @return SHORISHA_CD
     */
    public String getShorishaCd() {
        return this.shorishaCd;
    }

    /**
     * @param o SHORISHA_CD
     */
    public void setShorishaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shorishaCd = String.valueOf(o.toString());
        } else {
            this.shorishaCd = null;
        }
    }

    /** SHORI_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime shoriDt;

    /**
     * @return SHORI_DT
     */
    public java.time.LocalDateTime getShoriDt() {
        return this.shoriDt;
    }

    /**
     * @param o SHORI_DT
     */
    public void setShoriDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.shoriDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.shoriDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shoriDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.shoriDt = null;
        }
    }

    /** SHORI_CMT */
    private String shoriCmt;

    /**
     * @return SHORI_CMT
     */
    public String getShoriCmt() {
        return this.shoriCmt;
    }

    /**
     * @param o SHORI_CMT
     */
    public void setShoriCmt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shoriCmt = String.valueOf(o.toString());
        } else {
            this.shoriCmt = null;
        }
    }

    /** AITESAKI_CD */
    private String aitesakiCd;

    /**
     * @return AITESAKI_CD
     */
    public String getAitesakiCd() {
        return this.aitesakiCd;
    }

    /**
     * @param o AITESAKI_CD
     */
    public void setAitesakiCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.aitesakiCd = String.valueOf(o.toString());
        } else {
            this.aitesakiCd = null;
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
     * PRD_TEHAI_FLOW照会
     *
     * @param param1 PRD_TEHAI_NO
     * @param param2 TEHAI_FLOW_SEQ
     * @return PRD_TEHAI_FLOW
     */
    public static PrdTehaiFlow get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRD_TEHAI_NO\") = TRIM (:prd_tehai_no)");
        whereList.add("\"TEHAI_FLOW_SEQ\" = :tehai_flow_seq");

        String sql = "SELECT * FROM PRD_TEHAI_FLOW WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);
        params.put("tehai_flow_seq", param2);

        return Queries.get(sql, params, PrdTehaiFlow.class);
    }

    /**
     * PRD_TEHAI_FLOW追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_TEHAI_FLOWの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("prd_tehai_no -- :prd_tehai_no");
        nameList.add("tehai_flow_seq -- :tehai_flow_seq");
        nameList.add("tehai_jokyo_kb -- :tehai_jokyo_kb");
        nameList.add("kaitei_jokyo_kb -- :kaitei_jokyo_kb");
        nameList.add("shorisha_cd -- :shorisha_cd");
        nameList.add("shori_dt -- :shori_dt");
        nameList.add("shori_cmt -- :shori_cmt");
        nameList.add("aitesaki_cd -- :aitesaki_cd");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_TEHAI_FLOW(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":prd_tehai_no");
        valueList.add(":tehai_flow_seq");
        valueList.add(":tehai_jokyo_kb");
        valueList.add(":kaitei_jokyo_kb");
        valueList.add(":shorisha_cd");
        valueList.add("TO_TIMESTAMP (:shori_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":shori_cmt");
        valueList.add(":aitesaki_cd");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_TEHAI_FLOW更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_TEHAI_FLOWの登録
        String sql = "UPDATE PRD_TEHAI_FLOW\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("prd_tehai_no = :prd_tehai_no");
        setList.add("tehai_flow_seq = :tehai_flow_seq");
        setList.add("tehai_jokyo_kb = :tehai_jokyo_kb");
        setList.add("kaitei_jokyo_kb = :kaitei_jokyo_kb");
        setList.add("shorisha_cd = :shorisha_cd");
        setList.add("shori_dt = TO_TIMESTAMP (:shori_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("shori_cmt = :shori_cmt");
        setList.add("aitesaki_cd = :aitesaki_cd");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_TEHAI_FLOW削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_TEHAI_FLOWの削除
        String sql = "DELETE FROM PRD_TEHAI_FLOW WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (prd_tehai_no) = TRIM (:prd_tehai_no)");
        whereList.add("tehai_flow_seq = :tehai_flow_seq");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PRD_TEHAI_NO", this.prdTehaiNo);
        params.put("TEHAI_FLOW_SEQ", this.tehaiFlowSeq);
        params.put("TEHAI_JOKYO_KB", this.tehaiJokyoKb);
        params.put("KAITEI_JOKYO_KB", this.kaiteiJokyoKb);
        params.put("SHORISHA_CD", this.shorishaCd);
        params.put("SHORI_DT", this.shoriDt);
        params.put("SHORI_CMT", this.shoriCmt);
        params.put("AITESAKI_CD", this.aitesakiCd);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
