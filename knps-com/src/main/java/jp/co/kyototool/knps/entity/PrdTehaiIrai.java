package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_TEHAI_IRAI
 *
 * @author emarfkrow
 */
public class PrdTehaiIrai implements IEntity {

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

    /** TEHAI_JOKYO_KB */
    private String tehaiJokyoKb;

    /**
     * @return TEHAI_JOKYO_KB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TEHAI_JOKYO_KB")
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
    @com.fasterxml.jackson.annotation.JsonProperty("KAITEI_JOKYO_KB")
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

    /** IRAI_BUSHO_CD */
    private String iraiBushoCd;

    /**
     * @return IRAI_BUSHO_CD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("IRAI_BUSHO_CD")
    public String getIraiBushoCd() {
        return this.iraiBushoCd;
    }

    /**
     * @param o IRAI_BUSHO_CD
     */
    public void setIraiBushoCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.iraiBushoCd = String.valueOf(o.toString());
        } else {
            this.iraiBushoCd = null;
        }
    }

    /** DAIRITEN_MEI */
    private String dairitenMei;

    /**
     * @return DAIRITEN_MEI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DAIRITEN_MEI")
    public String getDairitenMei() {
        return this.dairitenMei;
    }

    /**
     * @param o DAIRITEN_MEI
     */
    public void setDairitenMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dairitenMei = String.valueOf(o.toString());
        } else {
            this.dairitenMei = null;
        }
    }

    /** NONYUSAKI_MEI */
    private String nonyusakiMei;

    /**
     * @return NONYUSAKI_MEI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NONYUSAKI_MEI")
    public String getNonyusakiMei() {
        return this.nonyusakiMei;
    }

    /**
     * @param o NONYUSAKI_MEI
     */
    public void setNonyusakiMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nonyusakiMei = String.valueOf(o.toString());
        } else {
            this.nonyusakiMei = null;
        }
    }

    /** KIHYOSHA_CD */
    private String kihyoshaCd;

    /**
     * @return KIHYOSHA_CD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KIHYOSHA_CD")
    public String getKihyoshaCd() {
        return this.kihyoshaCd;
    }

    /**
     * @param o KIHYOSHA_CD
     */
    public void setKihyoshaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kihyoshaCd = String.valueOf(o.toString());
        } else {
            this.kihyoshaCd = null;
        }
    }

    /** KIHYO_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime kihyoDt;

    /**
     * @return KIHYO_DT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KIHYO_DT")
    public java.time.LocalDateTime getKihyoDt() {
        return this.kihyoDt;
    }

    /**
     * @param o KIHYO_DT
     */
    public void setKihyoDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.kihyoDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.kihyoDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kihyoDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.kihyoDt = null;
        }
    }

    /** SHINSEISHA_CD */
    private String shinseishaCd;

    /**
     * @return SHINSEISHA_CD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHINSEISHA_CD")
    public String getShinseishaCd() {
        return this.shinseishaCd;
    }

    /**
     * @param o SHINSEISHA_CD
     */
    public void setShinseishaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shinseishaCd = String.valueOf(o.toString());
        } else {
            this.shinseishaCd = null;
        }
    }

    /** SHINSEI_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime shinseiDt;

    /**
     * @return SHINSEI_DT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHINSEI_DT")
    public java.time.LocalDateTime getShinseiDt() {
        return this.shinseiDt;
    }

    /**
     * @param o SHINSEI_DT
     */
    public void setShinseiDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.shinseiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.shinseiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shinseiDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.shinseiDt = null;
        }
    }

    /** SHINSEI_CMT */
    private String shinseiCmt;

    /**
     * @return SHINSEI_CMT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHINSEI_CMT")
    public String getShinseiCmt() {
        return this.shinseiCmt;
    }

    /**
     * @param o SHINSEI_CMT
     */
    public void setShinseiCmt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shinseiCmt = String.valueOf(o.toString());
        } else {
            this.shinseiCmt = null;
        }
    }

    /** SHINSEISAKI_CD */
    private String shinseisakiCd;

    /**
     * @return SHINSEISAKI_CD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHINSEISAKI_CD")
    public String getShinseisakiCd() {
        return this.shinseisakiCd;
    }

    /**
     * @param o SHINSEISAKI_CD
     */
    public void setShinseisakiCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shinseisakiCd = String.valueOf(o.toString());
        } else {
            this.shinseisakiCd = null;
        }
    }

    /** SHONINSHA_CD */
    private String shoninshaCd;

    /**
     * @return SHONINSHA_CD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHONINSHA_CD")
    public String getShoninshaCd() {
        return this.shoninshaCd;
    }

    /**
     * @param o SHONINSHA_CD
     */
    public void setShoninshaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shoninshaCd = String.valueOf(o.toString());
        } else {
            this.shoninshaCd = null;
        }
    }

    /** SHONIN_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime shoninDt;

    /**
     * @return SHONIN_DT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHONIN_DT")
    public java.time.LocalDateTime getShoninDt() {
        return this.shoninDt;
    }

    /**
     * @param o SHONIN_DT
     */
    public void setShoninDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.shoninDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.shoninDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shoninDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.shoninDt = null;
        }
    }

    /** UKETSUKESHA_CD */
    private String uketsukeshaCd;

    /**
     * @return UKETSUKESHA_CD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UKETSUKESHA_CD")
    public String getUketsukeshaCd() {
        return this.uketsukeshaCd;
    }

    /**
     * @param o UKETSUKESHA_CD
     */
    public void setUketsukeshaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.uketsukeshaCd = String.valueOf(o.toString());
        } else {
            this.uketsukeshaCd = null;
        }
    }

    /** UKETSUKE_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime uketsukeDt;

    /**
     * @return UKETSUKE_DT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UKETSUKE_DT")
    public java.time.LocalDateTime getUketsukeDt() {
        return this.uketsukeDt;
    }

    /**
     * @param o UKETSUKE_DT
     */
    public void setUketsukeDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.uketsukeDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.uketsukeDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.uketsukeDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.uketsukeDt = null;
        }
    }

    /** KAITOSHA_CD */
    private String kaitoshaCd;

    /**
     * @return KAITOSHA_CD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAITOSHA_CD")
    public String getKaitoshaCd() {
        return this.kaitoshaCd;
    }

    /**
     * @param o KAITOSHA_CD
     */
    public void setKaitoshaCd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoshaCd = String.valueOf(o.toString());
        } else {
            this.kaitoshaCd = null;
        }
    }

    /** KAITO_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime kaitoDt;

    /**
     * @return KAITO_DT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAITO_DT")
    public java.time.LocalDateTime getKaitoDt() {
        return this.kaitoDt;
    }

    /**
     * @param o KAITO_DT
     */
    public void setKaitoDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.kaitoDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.kaitoDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaitoDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.kaitoDt = null;
        }
    }

    /** JUCHUNO_CSV */
    private String juchunoCsv;

    /**
     * @return JUCHUNO_CSV
     */
    @com.fasterxml.jackson.annotation.JsonProperty("JUCHUNO_CSV")
    public String getJuchunoCsv() {
        return this.juchunoCsv;
    }

    /**
     * @param o JUCHUNO_CSV
     */
    public void setJuchunoCsv(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.juchunoCsv = String.valueOf(o.toString());
        } else {
            this.juchunoCsv = null;
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
     * PRD_TEHAI_IRAI照会
     *
     * @param param1 PRD_TEHAI_NO
     * @return PRD_TEHAI_IRAI
     */
    public static PrdTehaiIrai get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRD_TEHAI_NO\") = TRIM (:prd_tehai_no)");

        String sql = "SELECT * FROM PRD_TEHAI_IRAI WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);

        return Queries.get(sql, params, PrdTehaiIrai.class);
    }

    /**
     * PRD_TEHAI_IRAI追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_TEHAI_NOの採番処理
        numbering();

        // PRD_TEHAI_FLOWの登録
        if (this.prdTehaiFlows != null) {
            for (PrdTehaiFlow prdTehaiFlow : this.prdTehaiFlows) {
                prdTehaiFlow.setPrdTehaiNo(this.getPrdTehaiNo());
                prdTehaiFlow.insert(now, id);
            }
        }

        // PRD_TEHAI_IRAI_DETの登録
        if (this.prdTehaiIraiDets != null) {
            for (PrdTehaiIraiDet prdTehaiIraiDet : this.prdTehaiIraiDets) {
                prdTehaiIraiDet.setPrdTehaiNo(this.getPrdTehaiNo());
                prdTehaiIraiDet.insert(now, id);
            }
        }

        // PRD_TEHAI_KAITO_DETの登録
        if (this.prdTehaiKaitoDets != null) {
            for (PrdTehaiKaitoDet prdTehaiKaitoDet : this.prdTehaiKaitoDets) {
                prdTehaiKaitoDet.setPrdTehaiNo(this.getPrdTehaiNo());
                prdTehaiKaitoDet.insert(now, id);
            }
        }

        // PRD_TEHAI_IRAIの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PRD_TEHAI_NO\" -- :prd_tehai_no");
        nameList.add("\"TEHAI_JOKYO_KB\" -- :tehai_jokyo_kb");
        nameList.add("\"KAITEI_JOKYO_KB\" -- :kaitei_jokyo_kb");
        nameList.add("\"IRAI_BUSHO_CD\" -- :irai_busho_cd");
        nameList.add("\"DAIRITEN_MEI\" -- :dairiten_mei");
        nameList.add("\"NONYUSAKI_MEI\" -- :nonyusaki_mei");
        nameList.add("\"KIHYOSHA_CD\" -- :kihyosha_cd");
        nameList.add("\"KIHYO_DT\" -- :kihyo_dt");
        nameList.add("\"SHINSEISHA_CD\" -- :shinseisha_cd");
        nameList.add("\"SHINSEI_DT\" -- :shinsei_dt");
        nameList.add("\"SHINSEI_CMT\" -- :shinsei_cmt");
        nameList.add("\"SHINSEISAKI_CD\" -- :shinseisaki_cd");
        nameList.add("\"SHONINSHA_CD\" -- :shoninsha_cd");
        nameList.add("\"SHONIN_DT\" -- :shonin_dt");
        nameList.add("\"UKETSUKESHA_CD\" -- :uketsukesha_cd");
        nameList.add("\"UKETSUKE_DT\" -- :uketsuke_dt");
        nameList.add("\"KAITOSHA_CD\" -- :kaitosha_cd");
        nameList.add("\"KAITO_DT\" -- :kaito_dt");
        nameList.add("\"JUCHUNO_CSV\" -- :juchuno_csv");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_TEHAI_IRAI(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":prd_tehai_no");
        valueList.add(":tehai_jokyo_kb");
        valueList.add(":kaitei_jokyo_kb");
        valueList.add(":irai_busho_cd");
        valueList.add(":dairiten_mei");
        valueList.add(":nonyusaki_mei");
        valueList.add(":kihyosha_cd");
        valueList.add("TO_TIMESTAMP (:kihyo_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":shinseisha_cd");
        valueList.add("TO_TIMESTAMP (:shinsei_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":shinsei_cmt");
        valueList.add(":shinseisaki_cd");
        valueList.add(":shoninsha_cd");
        valueList.add("TO_TIMESTAMP (:shonin_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":uketsukesha_cd");
        valueList.add("TO_TIMESTAMP (:uketsuke_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":kaitosha_cd");
        valueList.add("TO_TIMESTAMP (:kaito_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":juchuno_csv");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** PRD_TEHAI_NOの採番処理 */
    private void numbering() {

        if (this.prdTehaiNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"PRD_TEHAI_NO\") IS NULL THEN 0 ELSE MAX(e.\"PRD_TEHAI_NO\") * 1 END + 1, 10, '0') AS \"PRD_TEHAI_NO\" FROM PRD_TEHAI_IRAI e WHERE e.\"PRD_TEHAI_NO\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PRD_TEHAI_NO");

        this.setPrdTehaiNo(o);
    }

    /**
     * PRD_TEHAI_IRAI更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_TEHAI_FLOWの登録
        if (this.prdTehaiFlows != null) {
            for (PrdTehaiFlow prdTehaiFlow : this.prdTehaiFlows) {
                prdTehaiFlow.setPrdTehaiNo(this.prdTehaiNo);
                try {
                    prdTehaiFlow.insert(now, id);
                } catch (Exception e) {
                    prdTehaiFlow.update(now, id);
                }
            }
            this.prdTehaiFlows = null;
            this.referPrdTehaiFlows();
            if (this.prdTehaiFlows != null) {
                for (PrdTehaiFlow prdTehaiFlow : this.prdTehaiFlows) {
                    if (!prdTehaiFlow.getTimeStampChange().equals(now)) {
                        prdTehaiFlow.delete();
                    }
                }
            }
        }

        // PRD_TEHAI_IRAI_DETの登録
        if (this.prdTehaiIraiDets != null) {
            for (PrdTehaiIraiDet prdTehaiIraiDet : this.prdTehaiIraiDets) {
                prdTehaiIraiDet.setPrdTehaiNo(this.prdTehaiNo);
                try {
                    prdTehaiIraiDet.insert(now, id);
                } catch (Exception e) {
                    prdTehaiIraiDet.update(now, id);
                }
            }
            this.prdTehaiIraiDets = null;
            this.referPrdTehaiIraiDets();
            if (this.prdTehaiIraiDets != null) {
                for (PrdTehaiIraiDet prdTehaiIraiDet : this.prdTehaiIraiDets) {
                    if (!prdTehaiIraiDet.getTimeStampChange().equals(now)) {
                        prdTehaiIraiDet.delete();
                    }
                }
            }
        }

        // PRD_TEHAI_KAITO_DETの登録
        if (this.prdTehaiKaitoDets != null) {
            for (PrdTehaiKaitoDet prdTehaiKaitoDet : this.prdTehaiKaitoDets) {
                prdTehaiKaitoDet.setPrdTehaiNo(this.prdTehaiNo);
                try {
                    prdTehaiKaitoDet.insert(now, id);
                } catch (Exception e) {
                    prdTehaiKaitoDet.update(now, id);
                }
            }
            this.prdTehaiKaitoDets = null;
            this.referPrdTehaiKaitoDets();
            if (this.prdTehaiKaitoDets != null) {
                for (PrdTehaiKaitoDet prdTehaiKaitoDet : this.prdTehaiKaitoDets) {
                    if (!prdTehaiKaitoDet.getTimeStampChange().equals(now)) {
                        prdTehaiKaitoDet.delete();
                    }
                }
            }
        }

        // PRD_TEHAI_IRAIの登録
        String sql = "UPDATE PRD_TEHAI_IRAI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PRD_TEHAI_NO\" = :prd_tehai_no");
        setList.add("\"TEHAI_JOKYO_KB\" = :tehai_jokyo_kb");
        setList.add("\"KAITEI_JOKYO_KB\" = :kaitei_jokyo_kb");
        setList.add("\"IRAI_BUSHO_CD\" = :irai_busho_cd");
        setList.add("\"DAIRITEN_MEI\" = :dairiten_mei");
        setList.add("\"NONYUSAKI_MEI\" = :nonyusaki_mei");
        setList.add("\"KIHYOSHA_CD\" = :kihyosha_cd");
        setList.add("\"KIHYO_DT\" = TO_TIMESTAMP (:kihyo_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"SHINSEISHA_CD\" = :shinseisha_cd");
        setList.add("\"SHINSEI_DT\" = TO_TIMESTAMP (:shinsei_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"SHINSEI_CMT\" = :shinsei_cmt");
        setList.add("\"SHINSEISAKI_CD\" = :shinseisaki_cd");
        setList.add("\"SHONINSHA_CD\" = :shoninsha_cd");
        setList.add("\"SHONIN_DT\" = TO_TIMESTAMP (:shonin_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"UKETSUKESHA_CD\" = :uketsukesha_cd");
        setList.add("\"UKETSUKE_DT\" = TO_TIMESTAMP (:uketsuke_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"KAITOSHA_CD\" = :kaitosha_cd");
        setList.add("\"KAITO_DT\" = TO_TIMESTAMP (:kaito_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"JUCHUNO_CSV\" = :juchuno_csv");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_TEHAI_IRAI削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_TEHAI_FLOWの削除
        if (this.prdTehaiFlows != null) {
            for (PrdTehaiFlow prdTehaiFlow : this.prdTehaiFlows) {
                prdTehaiFlow.delete();
            }
        }

        // PRD_TEHAI_IRAI_DETの削除
        if (this.prdTehaiIraiDets != null) {
            for (PrdTehaiIraiDet prdTehaiIraiDet : this.prdTehaiIraiDets) {
                prdTehaiIraiDet.delete();
            }
        }

        // PRD_TEHAI_KAITO_DETの削除
        if (this.prdTehaiKaitoDets != null) {
            for (PrdTehaiKaitoDet prdTehaiKaitoDet : this.prdTehaiKaitoDets) {
                prdTehaiKaitoDet.delete();
            }
        }

        // PRD_TEHAI_IRAIの削除
        String sql = "DELETE FROM PRD_TEHAI_IRAI WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRD_TEHAI_NO\") = TRIM (:prd_tehai_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", this.prdTehaiNo);
        params.put("tehai_jokyo_kb", this.tehaiJokyoKb);
        params.put("kaitei_jokyo_kb", this.kaiteiJokyoKb);
        params.put("irai_busho_cd", this.iraiBushoCd);
        params.put("dairiten_mei", this.dairitenMei);
        params.put("nonyusaki_mei", this.nonyusakiMei);
        params.put("kihyosha_cd", this.kihyoshaCd);
        params.put("kihyo_dt", this.kihyoDt);
        params.put("shinseisha_cd", this.shinseishaCd);
        params.put("shinsei_dt", this.shinseiDt);
        params.put("shinsei_cmt", this.shinseiCmt);
        params.put("shinseisaki_cd", this.shinseisakiCd);
        params.put("shoninsha_cd", this.shoninshaCd);
        params.put("shonin_dt", this.shoninDt);
        params.put("uketsukesha_cd", this.uketsukeshaCd);
        params.put("uketsuke_dt", this.uketsukeDt);
        params.put("kaitosha_cd", this.kaitoshaCd);
        params.put("kaito_dt", this.kaitoDt);
        params.put("juchuno_csv", this.juchunoCsv);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_TEHAI_FLOWのリスト
     */
    private List<PrdTehaiFlow> prdTehaiFlows;

    /**
     * @return PRD_TEHAI_FLOWのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdTehaiFlows")
    public List<PrdTehaiFlow> getPrdTehaiFlows() {
        return this.prdTehaiFlows;
    }

    /**
     * @param list PRD_TEHAI_FLOWのリスト
     */
    public void setPrdTehaiFlows(final List<PrdTehaiFlow> list) {
        this.prdTehaiFlows = list;
    }

    /**
     * @param prdTehaiFlow
     */
    public void addPrdTehaiFlows(final PrdTehaiFlow prdTehaiFlow) {
        if (this.prdTehaiFlows == null) {
            this.prdTehaiFlows = new ArrayList<PrdTehaiFlow>();
        }
        this.prdTehaiFlows.add(prdTehaiFlow);
    }

    /**
     * @return PRD_TEHAI_FLOWのリスト
     */
    public List<PrdTehaiFlow> referPrdTehaiFlows() {
        if (this.prdTehaiFlows == null) {
            this.prdTehaiFlows = PrdTehaiIrai.referPrdTehaiFlows(this.prdTehaiNo);
        }
        return this.prdTehaiFlows;
    }

    /**
     * @param param1 prdTehaiNo
     * @return List<PrdTehaiFlow>
     */
    public static List<PrdTehaiFlow> referPrdTehaiFlows(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("prd_tehai_no = :prd_tehai_no");

        String sql = "SELECT * FROM PRD_TEHAI_FLOW WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);

        return Queries.select(sql, params, PrdTehaiFlow.class);
    }

    /**
     * PRD_TEHAI_IRAI_DETのリスト
     */
    private List<PrdTehaiIraiDet> prdTehaiIraiDets;

    /**
     * @return PRD_TEHAI_IRAI_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdTehaiIraiDets")
    public List<PrdTehaiIraiDet> getPrdTehaiIraiDets() {
        return this.prdTehaiIraiDets;
    }

    /**
     * @param list PRD_TEHAI_IRAI_DETのリスト
     */
    public void setPrdTehaiIraiDets(final List<PrdTehaiIraiDet> list) {
        this.prdTehaiIraiDets = list;
    }

    /**
     * @param prdTehaiIraiDet
     */
    public void addPrdTehaiIraiDets(final PrdTehaiIraiDet prdTehaiIraiDet) {
        if (this.prdTehaiIraiDets == null) {
            this.prdTehaiIraiDets = new ArrayList<PrdTehaiIraiDet>();
        }
        this.prdTehaiIraiDets.add(prdTehaiIraiDet);
    }

    /**
     * @return PRD_TEHAI_IRAI_DETのリスト
     */
    public List<PrdTehaiIraiDet> referPrdTehaiIraiDets() {
        if (this.prdTehaiIraiDets == null) {
            this.prdTehaiIraiDets = PrdTehaiIrai.referPrdTehaiIraiDets(this.prdTehaiNo);
        }
        return this.prdTehaiIraiDets;
    }

    /**
     * @param param1 prdTehaiNo
     * @return List<PrdTehaiIraiDet>
     */
    public static List<PrdTehaiIraiDet> referPrdTehaiIraiDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("prd_tehai_no = :prd_tehai_no");

        String sql = "SELECT * FROM PRD_TEHAI_IRAI_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);

        return Queries.select(sql, params, PrdTehaiIraiDet.class);
    }

    /**
     * PRD_TEHAI_KAITO_DETのリスト
     */
    private List<PrdTehaiKaitoDet> prdTehaiKaitoDets;

    /**
     * @return PRD_TEHAI_KAITO_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdTehaiKaitoDets")
    public List<PrdTehaiKaitoDet> getPrdTehaiKaitoDets() {
        return this.prdTehaiKaitoDets;
    }

    /**
     * @param list PRD_TEHAI_KAITO_DETのリスト
     */
    public void setPrdTehaiKaitoDets(final List<PrdTehaiKaitoDet> list) {
        this.prdTehaiKaitoDets = list;
    }

    /**
     * @param prdTehaiKaitoDet
     */
    public void addPrdTehaiKaitoDets(final PrdTehaiKaitoDet prdTehaiKaitoDet) {
        if (this.prdTehaiKaitoDets == null) {
            this.prdTehaiKaitoDets = new ArrayList<PrdTehaiKaitoDet>();
        }
        this.prdTehaiKaitoDets.add(prdTehaiKaitoDet);
    }

    /**
     * @return PRD_TEHAI_KAITO_DETのリスト
     */
    public List<PrdTehaiKaitoDet> referPrdTehaiKaitoDets() {
        if (this.prdTehaiKaitoDets == null) {
            this.prdTehaiKaitoDets = PrdTehaiIrai.referPrdTehaiKaitoDets(this.prdTehaiNo);
        }
        return this.prdTehaiKaitoDets;
    }

    /**
     * @param param1 prdTehaiNo
     * @return List<PrdTehaiKaitoDet>
     */
    public static List<PrdTehaiKaitoDet> referPrdTehaiKaitoDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("prd_tehai_no = :prd_tehai_no");

        String sql = "SELECT * FROM PRD_TEHAI_KAITO_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);

        return Queries.select(sql, params, PrdTehaiKaitoDet.class);
    }
}
