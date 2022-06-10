package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_TEHAI_KAITO_DET_HIS
 *
 * @author emarfkrow
 */
public class PrdTehaiKaitoDetHis implements IEntity {

    /** PRD_TEHAI_NO */
    private String prdTehaiNo;

    /**
     * @return PRD_TEHAI_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRD_TEHAI_NO")
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

    /** KAITO_DET_HIS_SEQ */
    private java.math.BigDecimal kaitoDetHisSeq;

    /**
     * @return KAITO_DET_HIS_SEQ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAITO_DET_HIS_SEQ")
    public java.math.BigDecimal getKaitoDetHisSeq() {
        return this.kaitoDetHisSeq;
    }

    /**
     * @param o KAITO_DET_HIS_SEQ
     */
    public void setKaitoDetHisSeq(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoDetHisSeq = new java.math.BigDecimal(o.toString());
        } else {
            this.kaitoDetHisSeq = null;
        }
    }

    /** KAITO_DET_SEQ */
    private java.math.BigDecimal kaitoDetSeq;

    /**
     * @return KAITO_DET_SEQ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAITO_DET_SEQ")
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
    @com.fasterxml.jackson.annotation.JsonProperty("IRAI_DET_SEQ")
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
    @com.fasterxml.jackson.annotation.JsonProperty("ID")
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
    @com.fasterxml.jackson.annotation.JsonProperty("PARENT_ID")
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
    @com.fasterxml.jackson.annotation.JsonProperty("KAITO_HINBAN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("KAITO_QT")
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
    private String fumeihinF = "0";

    /**
     * @return FUMEIHIN_F
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FUMEIHIN_F")
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
    private String sethinF = "0";

    /**
     * @return SETHIN_F
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SETHIN_F")
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
    @com.fasterxml.jackson.annotation.JsonProperty("KIBO_NOKI_YMD")
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
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN_TANTOSHA_CD")
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
    private String setNokiTuchiF = "0";

    /**
     * @return SET_NOKI_TUCHI_F
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SET_NOKI_TUCHI_F")
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
    @com.fasterxml.jackson.annotation.JsonProperty("KAITO_NOKI_YMD")
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
    @com.fasterxml.jackson.annotation.JsonProperty("KAITO_NOKI_CMT")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOKI_KAITOSHA_CD")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOKI_KAITO_DT")
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
    private String kaitoNokiHininF = "0";

    /**
     * @return KAITO_NOKI_HININ_F
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAITO_NOKI_HININ_F")
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
     * PRD_TEHAI_KAITO_DET_HIS照会
     *
     * @param param1 PRD_TEHAI_NO
     * @param param2 KAITO_DET_HIS_SEQ
     * @param param3 KAITO_DET_SEQ
     * @return PRD_TEHAI_KAITO_DET_HIS
     */
    public static PrdTehaiKaitoDetHis get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRD_TEHAI_NO\") = TRIM (:prd_tehai_no)");
        whereList.add("\"KAITO_DET_HIS_SEQ\" = :kaito_det_his_seq");
        whereList.add("\"KAITO_DET_SEQ\" = :kaito_det_seq");

        String sql = "SELECT * FROM PRD_TEHAI_KAITO_DET_HIS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);
        params.put("kaito_det_his_seq", param2);
        params.put("kaito_det_seq", param3);

        return Queries.get(sql, params, PrdTehaiKaitoDetHis.class);
    }

    /**
     * PRD_TEHAI_KAITO_DET_HIS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_TEHAI_KAITO_DET_HISの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PRD_TEHAI_NO\" -- :prd_tehai_no");
        nameList.add("\"KAITO_DET_HIS_SEQ\" -- :kaito_det_his_seq");
        nameList.add("\"KAITO_DET_SEQ\" -- :kaito_det_seq");
        nameList.add("\"IRAI_DET_SEQ\" -- :irai_det_seq");
        nameList.add("\"ID\" -- :id");
        nameList.add("\"PARENT_ID\" -- :parent_id");
        nameList.add("\"KAITO_HINBAN\" -- :kaito_hinban");
        nameList.add("\"KAITO_QT\" -- :kaito_qt");
        nameList.add("\"FUMEIHIN_F\" -- :fumeihin_f");
        nameList.add("\"SETHIN_F\" -- :sethin_f");
        nameList.add("\"KIBO_NOKI_YMD\" -- :kibo_noki_ymd");
        nameList.add("\"HINBAN_TANTOSHA_CD\" -- :hinban_tantosha_cd");
        nameList.add("\"SET_NOKI_TUCHI_F\" -- :set_noki_tuchi_f");
        nameList.add("\"KAITO_NOKI_YMD\" -- :kaito_noki_ymd");
        nameList.add("\"KAITO_NOKI_CMT\" -- :kaito_noki_cmt");
        nameList.add("\"NOKI_KAITOSHA_CD\" -- :noki_kaitosha_cd");
        nameList.add("\"NOKI_KAITO_DT\" -- :noki_kaito_dt");
        nameList.add("\"KAITO_NOKI_HININ_F\" -- :kaito_noki_hinin_f");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_TEHAI_KAITO_DET_HIS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":prd_tehai_no");
        valueList.add(":kaito_det_his_seq");
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
     * PRD_TEHAI_KAITO_DET_HIS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_TEHAI_KAITO_DET_HISの登録
        String sql = "UPDATE PRD_TEHAI_KAITO_DET_HIS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PRD_TEHAI_NO\" = :prd_tehai_no");
        setList.add("\"KAITO_DET_HIS_SEQ\" = :kaito_det_his_seq");
        setList.add("\"KAITO_DET_SEQ\" = :kaito_det_seq");
        setList.add("\"IRAI_DET_SEQ\" = :irai_det_seq");
        setList.add("\"ID\" = :id");
        setList.add("\"PARENT_ID\" = :parent_id");
        setList.add("\"KAITO_HINBAN\" = :kaito_hinban");
        setList.add("\"KAITO_QT\" = :kaito_qt");
        setList.add("\"FUMEIHIN_F\" = :fumeihin_f");
        setList.add("\"SETHIN_F\" = :sethin_f");
        setList.add("\"KIBO_NOKI_YMD\" = :kibo_noki_ymd");
        setList.add("\"HINBAN_TANTOSHA_CD\" = :hinban_tantosha_cd");
        setList.add("\"SET_NOKI_TUCHI_F\" = :set_noki_tuchi_f");
        setList.add("\"KAITO_NOKI_YMD\" = :kaito_noki_ymd");
        setList.add("\"KAITO_NOKI_CMT\" = :kaito_noki_cmt");
        setList.add("\"NOKI_KAITOSHA_CD\" = :noki_kaitosha_cd");
        setList.add("\"NOKI_KAITO_DT\" = TO_TIMESTAMP (:noki_kaito_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"KAITO_NOKI_HININ_F\" = :kaito_noki_hinin_f");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_TEHAI_KAITO_DET_HIS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_TEHAI_KAITO_DET_HISの削除
        String sql = "DELETE FROM PRD_TEHAI_KAITO_DET_HIS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRD_TEHAI_NO\") = TRIM (:prd_tehai_no)");
        whereList.add("\"KAITO_DET_HIS_SEQ\" = :kaito_det_his_seq");
        whereList.add("\"KAITO_DET_SEQ\" = :kaito_det_seq");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", this.prdTehaiNo);
        params.put("kaito_det_his_seq", this.kaitoDetHisSeq);
        params.put("kaito_det_seq", this.kaitoDetSeq);
        params.put("irai_det_seq", this.iraiDetSeq);
        params.put("id", this.id);
        params.put("parent_id", this.parentId);
        params.put("kaito_hinban", this.kaitoHinban);
        params.put("kaito_qt", this.kaitoQt);
        params.put("fumeihin_f", this.fumeihinF);
        params.put("sethin_f", this.sethinF);
        params.put("kibo_noki_ymd", this.kiboNokiYmd);
        params.put("hinban_tantosha_cd", this.hinbanTantoshaCd);
        params.put("set_noki_tuchi_f", this.setNokiTuchiF);
        params.put("kaito_noki_ymd", this.kaitoNokiYmd);
        params.put("kaito_noki_cmt", this.kaitoNokiCmt);
        params.put("noki_kaitosha_cd", this.nokiKaitoshaCd);
        params.put("noki_kaito_dt", this.nokiKaitoDt);
        params.put("kaito_noki_hinin_f", this.kaitoNokiHininF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
