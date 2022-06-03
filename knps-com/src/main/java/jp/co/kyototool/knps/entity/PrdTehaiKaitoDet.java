package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_TEHAI_KAITO_DET
 *
 * @author emarfkrow
 */
public class PrdTehaiKaitoDet implements IEntity {

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

    /** KAITO_DET_SEQ */
    private java.math.BigDecimal kaitoDetSeq;

    /**
     * @return KAITO_DET_SEQ
     */
    public java.math.BigDecimal getKaitoDetSeq() {
        return this.kaitoDetSeq;
    }

    /**
     * @param o KAITO_DET_SEQ
     */
    public void setKaitoDetSeq(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoDetSeq = new java.math.BigDecimal(o.toString());
        } else {
            this.kaitoDetSeq = null;
        }
    }

    /** IRAI_DET_SEQ */
    private java.math.BigDecimal iraiDetSeq;

    /**
     * @return IRAI_DET_SEQ
     */
    public java.math.BigDecimal getIraiDetSeq() {
        return this.iraiDetSeq;
    }

    /**
     * @param o IRAI_DET_SEQ
     */
    public void setIraiDetSeq(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.iraiDetSeq = new java.math.BigDecimal(o.toString());
        } else {
            this.iraiDetSeq = null;
        }
    }

    /** ID */
    private java.math.BigDecimal id;

    /**
     * @return ID
     */
    public java.math.BigDecimal getId() {
        return this.id;
    }

    /**
     * @param o ID
     */
    public void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.id = new java.math.BigDecimal(o.toString());
        } else {
            this.id = null;
        }
    }

    /** PARENT_ID */
    private java.math.BigDecimal parentId;

    /**
     * @return PARENT_ID
     */
    public java.math.BigDecimal getParentId() {
        return this.parentId;
    }

    /**
     * @param o PARENT_ID
     */
    public void setParentId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.parentId = new java.math.BigDecimal(o.toString());
        } else {
            this.parentId = null;
        }
    }

    /** KAITO_HINBAN */
    private String kaitoHinban;

    /**
     * @return KAITO_HINBAN
     */
    public String getKaitoHinban() {
        return this.kaitoHinban;
    }

    /**
     * @param o KAITO_HINBAN
     */
    public void setKaitoHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoHinban = String.valueOf(o.toString());
        } else {
            this.kaitoHinban = null;
        }
    }

    /** KAITO_QT */
    private java.math.BigDecimal kaitoQt;

    /**
     * @return KAITO_QT
     */
    public java.math.BigDecimal getKaitoQt() {
        return this.kaitoQt;
    }

    /**
     * @param o KAITO_QT
     */
    public void setKaitoQt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoQt = new java.math.BigDecimal(o.toString());
        } else {
            this.kaitoQt = null;
        }
    }

    /** FUMEIHIN_F */
    private String fumeihinF;

    /**
     * @return FUMEIHIN_F
     */
    public String getFumeihinF() {
        return this.fumeihinF;
    }

    /**
     * @param o FUMEIHIN_F
     */
    public void setFumeihinF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fumeihinF = String.valueOf(o.toString());
        } else {
            this.fumeihinF = null;
        }
    }

    /** SETHIN_F */
    private String sethinF;

    /**
     * @return SETHIN_F
     */
    public String getSethinF() {
        return this.sethinF;
    }

    /**
     * @param o SETHIN_F
     */
    public void setSethinF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sethinF = String.valueOf(o.toString());
        } else {
            this.sethinF = null;
        }
    }

    /** KIBO_NOKI_YMD */
    private String kiboNokiYmd;

    /**
     * @return KIBO_NOKI_YMD
     */
    public String getKiboNokiYmd() {
        return this.kiboNokiYmd;
    }

    /**
     * @param o KIBO_NOKI_YMD
     */
    public void setKiboNokiYmd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kiboNokiYmd = String.valueOf(o.toString());
        } else {
            this.kiboNokiYmd = null;
        }
    }

    /** HINBAN_TANTOSHA_CD */
    private String hinbanTantoshaCd;

    /**
     * @return HINBAN_TANTOSHA_CD
     */
    public String getHinbanTantoshaCd() {
        return this.hinbanTantoshaCd;
    }

    /**
     * @param o HINBAN_TANTOSHA_CD
     */
    public void setHinbanTantoshaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinbanTantoshaCd = String.valueOf(o.toString());
        } else {
            this.hinbanTantoshaCd = null;
        }
    }

    /** SET_NOKI_TUCHI_F */
    private String setNokiTuchiF;

    /**
     * @return SET_NOKI_TUCHI_F
     */
    public String getSetNokiTuchiF() {
        return this.setNokiTuchiF;
    }

    /**
     * @param o SET_NOKI_TUCHI_F
     */
    public void setSetNokiTuchiF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setNokiTuchiF = String.valueOf(o.toString());
        } else {
            this.setNokiTuchiF = null;
        }
    }

    /** KAITO_NOKI_YMD */
    private String kaitoNokiYmd;

    /**
     * @return KAITO_NOKI_YMD
     */
    public String getKaitoNokiYmd() {
        return this.kaitoNokiYmd;
    }

    /**
     * @param o KAITO_NOKI_YMD
     */
    public void setKaitoNokiYmd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoNokiYmd = String.valueOf(o.toString());
        } else {
            this.kaitoNokiYmd = null;
        }
    }

    /** KAITO_NOKI_CMT */
    private String kaitoNokiCmt;

    /**
     * @return KAITO_NOKI_CMT
     */
    public String getKaitoNokiCmt() {
        return this.kaitoNokiCmt;
    }

    /**
     * @param o KAITO_NOKI_CMT
     */
    public void setKaitoNokiCmt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoNokiCmt = String.valueOf(o.toString());
        } else {
            this.kaitoNokiCmt = null;
        }
    }

    /** NOKI_KAITOSHA_CD */
    private String nokiKaitoshaCd;

    /**
     * @return NOKI_KAITOSHA_CD
     */
    public String getNokiKaitoshaCd() {
        return this.nokiKaitoshaCd;
    }

    /**
     * @param o NOKI_KAITOSHA_CD
     */
    public void setNokiKaitoshaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nokiKaitoshaCd = String.valueOf(o.toString());
        } else {
            this.nokiKaitoshaCd = null;
        }
    }

    /** NOKI_KAITO_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime nokiKaitoDt;

    /**
     * @return NOKI_KAITO_DT
     */
    public java.time.LocalDateTime getNokiKaitoDt() {
        return this.nokiKaitoDt;
    }

    /**
     * @param o NOKI_KAITO_DT
     */
    public void setNokiKaitoDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.nokiKaitoDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.nokiKaitoDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nokiKaitoDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.nokiKaitoDt = null;
        }
    }

    /** KAITO_NOKI_HININ_F */
    private String kaitoNokiHininF;

    /**
     * @return KAITO_NOKI_HININ_F
     */
    public String getKaitoNokiHininF() {
        return this.kaitoNokiHininF;
    }

    /**
     * @param o KAITO_NOKI_HININ_F
     */
    public void setKaitoNokiHininF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoNokiHininF = String.valueOf(o.toString());
        } else {
            this.kaitoNokiHininF = null;
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
     * PRD_TEHAI_KAITO_DET照会
     *
     * @param param1 PRD_TEHAI_NO
     * @param param2 KAITO_DET_SEQ
     * @return PRD_TEHAI_KAITO_DET
     */
    public static PrdTehaiKaitoDet get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRD_TEHAI_NO\") = TRIM (:prd_tehai_no)");
        whereList.add("\"KAITO_DET_SEQ\" = :kaito_det_seq");

        String sql = "SELECT * FROM PRD_TEHAI_KAITO_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);
        params.put("kaito_det_seq", param2);

        return Queries.get(sql, params, PrdTehaiKaitoDet.class);
    }

    /**
     * PRD_TEHAI_KAITO_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_TEHAI_KAITO_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("prd_tehai_no -- :prd_tehai_no");
        nameList.add("kaito_det_seq -- :kaito_det_seq");
        nameList.add("irai_det_seq -- :irai_det_seq");
        nameList.add("id -- :id");
        nameList.add("parent_id -- :parent_id");
        nameList.add("kaito_hinban -- :kaito_hinban");
        nameList.add("kaito_qt -- :kaito_qt");
        nameList.add("fumeihin_f -- :fumeihin_f");
        nameList.add("sethin_f -- :sethin_f");
        nameList.add("kibo_noki_ymd -- :kibo_noki_ymd");
        nameList.add("hinban_tantosha_cd -- :hinban_tantosha_cd");
        nameList.add("set_noki_tuchi_f -- :set_noki_tuchi_f");
        nameList.add("kaito_noki_ymd -- :kaito_noki_ymd");
        nameList.add("kaito_noki_cmt -- :kaito_noki_cmt");
        nameList.add("noki_kaitosha_cd -- :noki_kaitosha_cd");
        nameList.add("noki_kaito_dt -- :noki_kaito_dt");
        nameList.add("kaito_noki_hinin_f -- :kaito_noki_hinin_f");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_TEHAI_KAITO_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":prd_tehai_no");
        valueList.add(":kaito_det_seq");
        valueList.add(":irai_det_seq");
        valueList.add(":id");
        valueList.add(":parent_id");
        valueList.add(":kaito_hinban");
        valueList.add(":kaito_qt");
        valueList.add(":fumeihin_f");
        valueList.add(":sethin_f");
        valueList.add(":kibo_noki_ymd");
        valueList.add(":hinban_tantosha_cd");
        valueList.add(":set_noki_tuchi_f");
        valueList.add(":kaito_noki_ymd");
        valueList.add(":kaito_noki_cmt");
        valueList.add(":noki_kaitosha_cd");
        valueList.add("TO_TIMESTAMP (:noki_kaito_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":kaito_noki_hinin_f");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_TEHAI_KAITO_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_TEHAI_KAITO_DETの登録
        String sql = "UPDATE PRD_TEHAI_KAITO_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("prd_tehai_no = :prd_tehai_no");
        setList.add("kaito_det_seq = :kaito_det_seq");
        setList.add("irai_det_seq = :irai_det_seq");
        setList.add("id = :id");
        setList.add("parent_id = :parent_id");
        setList.add("kaito_hinban = :kaito_hinban");
        setList.add("kaito_qt = :kaito_qt");
        setList.add("fumeihin_f = :fumeihin_f");
        setList.add("sethin_f = :sethin_f");
        setList.add("kibo_noki_ymd = :kibo_noki_ymd");
        setList.add("hinban_tantosha_cd = :hinban_tantosha_cd");
        setList.add("set_noki_tuchi_f = :set_noki_tuchi_f");
        setList.add("kaito_noki_ymd = :kaito_noki_ymd");
        setList.add("kaito_noki_cmt = :kaito_noki_cmt");
        setList.add("noki_kaitosha_cd = :noki_kaitosha_cd");
        setList.add("noki_kaito_dt = TO_TIMESTAMP (:noki_kaito_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("kaito_noki_hinin_f = :kaito_noki_hinin_f");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_TEHAI_KAITO_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_TEHAI_KAITO_DETの削除
        String sql = "DELETE FROM PRD_TEHAI_KAITO_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (prd_tehai_no) = TRIM (:prd_tehai_no)");
        whereList.add("kaito_det_seq = :kaito_det_seq");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PRD_TEHAI_NO", this.prdTehaiNo);
        params.put("KAITO_DET_SEQ", this.kaitoDetSeq);
        params.put("IRAI_DET_SEQ", this.iraiDetSeq);
        params.put("ID", this.id);
        params.put("PARENT_ID", this.parentId);
        params.put("KAITO_HINBAN", this.kaitoHinban);
        params.put("KAITO_QT", this.kaitoQt);
        params.put("FUMEIHIN_F", this.fumeihinF);
        params.put("SETHIN_F", this.sethinF);
        params.put("KIBO_NOKI_YMD", this.kiboNokiYmd);
        params.put("HINBAN_TANTOSHA_CD", this.hinbanTantoshaCd);
        params.put("SET_NOKI_TUCHI_F", this.setNokiTuchiF);
        params.put("KAITO_NOKI_YMD", this.kaitoNokiYmd);
        params.put("KAITO_NOKI_CMT", this.kaitoNokiCmt);
        params.put("NOKI_KAITOSHA_CD", this.nokiKaitoshaCd);
        params.put("NOKI_KAITO_DT", this.nokiKaitoDt);
        params.put("KAITO_NOKI_HININ_F", this.kaitoNokiHininF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
