package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_TEHAI_IRAI_DET
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiDet implements IEntity {

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

    /** IRAI_HINBAN */
    private String iraiHinban;

    /**
     * @return IRAI_HINBAN
     */
    public String getIraiHinban() {
        return this.iraiHinban;
    }

    /**
     * @param o IRAI_HINBAN
     */
    public void setIraiHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.iraiHinban = String.valueOf(o.toString());
        } else {
            this.iraiHinban = null;
        }
    }

    /** IRAI_QT */
    private java.math.BigDecimal iraiQt;

    /**
     * @return IRAI_QT
     */
    public java.math.BigDecimal getIraiQt() {
        return this.iraiQt;
    }

    /**
     * @param o IRAI_QT
     */
    public void setIraiQt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.iraiQt = new java.math.BigDecimal(o.toString());
        } else {
            this.iraiQt = null;
        }
    }

    /** SHINSETSUHIN_F */
    private String shinsetsuhinF;

    /**
     * @return SHINSETSUHIN_F
     */
    public String getShinsetsuhinF() {
        return this.shinsetsuhinF;
    }

    /**
     * @param o SHINSETSUHIN_F
     */
    public void setShinsetsuhinF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shinsetsuhinF = String.valueOf(o.toString());
        } else {
            this.shinsetsuhinF = null;
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

    /** HANMOKUGAI_F */
    private String hanmokugaiF;

    /**
     * @return HANMOKUGAI_F
     */
    public String getHanmokugaiF() {
        return this.hanmokugaiF;
    }

    /**
     * @param o HANMOKUGAI_F
     */
    public void setHanmokugaiF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hanmokugaiF = String.valueOf(o.toString());
        } else {
            this.hanmokugaiF = null;
        }
    }

    /** CHUMON_NYURYOKU_ZUMI_F */
    private String chumonNyuryokuZumiF;

    /**
     * @return CHUMON_NYURYOKU_ZUMI_F
     */
    public String getChumonNyuryokuZumiF() {
        return this.chumonNyuryokuZumiF;
    }

    /**
     * @param o CHUMON_NYURYOKU_ZUMI_F
     */
    public void setChumonNyuryokuZumiF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chumonNyuryokuZumiF = String.valueOf(o.toString());
        } else {
            this.chumonNyuryokuZumiF = null;
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

    /** SHUKKA_ZUMI_F */
    private String shukkaZumiF;

    /**
     * @return SHUKKA_ZUMI_F
     */
    public String getShukkaZumiF() {
        return this.shukkaZumiF;
    }

    /**
     * @param o SHUKKA_ZUMI_F
     */
    public void setShukkaZumiF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shukkaZumiF = String.valueOf(o.toString());
        } else {
            this.shukkaZumiF = null;
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

    /** IRAI_INZU_QT */
    private java.math.BigDecimal iraiInzuQt;

    /**
     * @return IRAI_INZU_QT
     */
    public java.math.BigDecimal getIraiInzuQt() {
        return this.iraiInzuQt;
    }

    /**
     * @param o IRAI_INZU_QT
     */
    public void setIraiInzuQt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.iraiInzuQt = new java.math.BigDecimal(o.toString());
        } else {
            this.iraiInzuQt = null;
        }
    }

    /**
     * PRD_TEHAI_IRAI_DET照会
     *
     * @param param1 PRD_TEHAI_NO
     * @param param2 IRAI_DET_SEQ
     * @return PRD_TEHAI_IRAI_DET
     */
    public static PrdTehaiIraiDet get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRD_TEHAI_NO\") = TRIM (:prd_tehai_no)");
        whereList.add("\"IRAI_DET_SEQ\" = :irai_det_seq");

        String sql = "SELECT * FROM PRD_TEHAI_IRAI_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);
        params.put("irai_det_seq", param2);

        return Queries.get(sql, params, PrdTehaiIraiDet.class);
    }

    /**
     * PRD_TEHAI_IRAI_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_TEHAI_IRAI_DET_HISの登録
        if (this.prdTehaiIraiDetHiss != null) {
            for (PrdTehaiIraiDetHis prdTehaiIraiDetHis : this.prdTehaiIraiDetHiss) {
                prdTehaiIraiDetHis.setPrdTehaiNo(this.getPrdTehaiNo());
                prdTehaiIraiDetHis.setIraiDetSeq(this.getIraiDetSeq());
                prdTehaiIraiDetHis.insert(now, id);
            }
        }

        // PRD_TEHAI_IRAI_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PRD_TEHAI_NO\" -- :prd_tehai_no");
        nameList.add("\"IRAI_DET_SEQ\" -- :irai_det_seq");
        nameList.add("\"ID\" -- :id");
        nameList.add("\"PARENT_ID\" -- :parent_id");
        nameList.add("\"IRAI_HINBAN\" -- :irai_hinban");
        nameList.add("\"IRAI_QT\" -- :irai_qt");
        nameList.add("\"SHINSETSUHIN_F\" -- :shinsetsuhin_f");
        nameList.add("\"SETHIN_F\" -- :sethin_f");
        nameList.add("\"HANMOKUGAI_F\" -- :hanmokugai_f");
        nameList.add("\"CHUMON_NYURYOKU_ZUMI_F\" -- :chumon_nyuryoku_zumi_f");
        nameList.add("\"KIBO_NOKI_YMD\" -- :kibo_noki_ymd");
        nameList.add("\"SHUKKA_ZUMI_F\" -- :shukka_zumi_f");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"IRAI_INZU_QT\" -- :irai_inzu_qt");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_TEHAI_IRAI_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":prd_tehai_no");
        valueList.add(":irai_det_seq");
        valueList.add(":id");
        valueList.add(":parent_id");
        valueList.add(":irai_hinban");
        valueList.add(":irai_qt");
        valueList.add(":shinsetsuhin_f");
        valueList.add(":sethin_f");
        valueList.add(":hanmokugai_f");
        valueList.add(":chumon_nyuryoku_zumi_f");
        valueList.add(":kibo_noki_ymd");
        valueList.add(":shukka_zumi_f");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":irai_inzu_qt");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PRD_TEHAI_IRAI_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_TEHAI_IRAI_DET_HISの登録
        if (this.prdTehaiIraiDetHiss != null) {
            for (PrdTehaiIraiDetHis prdTehaiIraiDetHis : this.prdTehaiIraiDetHiss) {
                prdTehaiIraiDetHis.setPrdTehaiNo(this.prdTehaiNo);
                prdTehaiIraiDetHis.setIraiDetSeq(this.iraiDetSeq);
                try {
                    prdTehaiIraiDetHis.insert(now, id);
                } catch (Exception e) {
                    prdTehaiIraiDetHis.update(now, id);
                }
            }
            this.prdTehaiIraiDetHiss = null;
            this.referPrdTehaiIraiDetHiss();
            if (this.prdTehaiIraiDetHiss != null) {
                for (PrdTehaiIraiDetHis prdTehaiIraiDetHis : this.prdTehaiIraiDetHiss) {
                    if (!prdTehaiIraiDetHis.getTimeStampChange().equals(now)) {
                        prdTehaiIraiDetHis.delete();
                    }
                }
            }
        }

        // PRD_TEHAI_IRAI_DETの登録
        String sql = "UPDATE PRD_TEHAI_IRAI_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PRD_TEHAI_NO\" = :prd_tehai_no");
        setList.add("\"IRAI_DET_SEQ\" = :irai_det_seq");
        setList.add("\"ID\" = :id");
        setList.add("\"PARENT_ID\" = :parent_id");
        setList.add("\"IRAI_HINBAN\" = :irai_hinban");
        setList.add("\"IRAI_QT\" = :irai_qt");
        setList.add("\"SHINSETSUHIN_F\" = :shinsetsuhin_f");
        setList.add("\"SETHIN_F\" = :sethin_f");
        setList.add("\"HANMOKUGAI_F\" = :hanmokugai_f");
        setList.add("\"CHUMON_NYURYOKU_ZUMI_F\" = :chumon_nyuryoku_zumi_f");
        setList.add("\"KIBO_NOKI_YMD\" = :kibo_noki_ymd");
        setList.add("\"SHUKKA_ZUMI_F\" = :shukka_zumi_f");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"IRAI_INZU_QT\" = :irai_inzu_qt");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_TEHAI_IRAI_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_TEHAI_IRAI_DET_HISの削除
        if (this.prdTehaiIraiDetHiss != null) {
            for (PrdTehaiIraiDetHis prdTehaiIraiDetHis : this.prdTehaiIraiDetHiss) {
                prdTehaiIraiDetHis.delete();
            }
        }

        // PRD_TEHAI_IRAI_DETの削除
        String sql = "DELETE FROM PRD_TEHAI_IRAI_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRD_TEHAI_NO\") = TRIM (:prd_tehai_no)");
        whereList.add("\"IRAI_DET_SEQ\" = :irai_det_seq");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", this.prdTehaiNo);
        params.put("irai_det_seq", this.iraiDetSeq);
        params.put("id", this.id);
        params.put("parent_id", this.parentId);
        params.put("irai_hinban", this.iraiHinban);
        params.put("irai_qt", this.iraiQt);
        params.put("shinsetsuhin_f", this.shinsetsuhinF);
        params.put("sethin_f", this.sethinF);
        params.put("hanmokugai_f", this.hanmokugaiF);
        params.put("chumon_nyuryoku_zumi_f", this.chumonNyuryokuZumiF);
        params.put("kibo_noki_ymd", this.kiboNokiYmd);
        params.put("shukka_zumi_f", this.shukkaZumiF);
        params.put("irai_inzu_qt", this.iraiInzuQt);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_TEHAI_IRAI_DET_HISのリスト
     */
    private List<PrdTehaiIraiDetHis> prdTehaiIraiDetHiss;

    /**
     * @return PRD_TEHAI_IRAI_DET_HISのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdTehaiIraiDetHiss")
    public List<PrdTehaiIraiDetHis> getPrdTehaiIraiDetHiss() {
        return this.prdTehaiIraiDetHiss;
    }

    /**
     * @param list PRD_TEHAI_IRAI_DET_HISのリスト
     */
    public void setPrdTehaiIraiDetHiss(final List<PrdTehaiIraiDetHis> list) {
        this.prdTehaiIraiDetHiss = list;
    }

    /**
     * @param prdTehaiIraiDetHis
     */
    public void addPrdTehaiIraiDetHiss(final PrdTehaiIraiDetHis prdTehaiIraiDetHis) {
        if (this.prdTehaiIraiDetHiss == null) {
            this.prdTehaiIraiDetHiss = new ArrayList<PrdTehaiIraiDetHis>();
        }
        this.prdTehaiIraiDetHiss.add(prdTehaiIraiDetHis);
    }

    /**
     * @return PRD_TEHAI_IRAI_DET_HISのリスト
     */
    public List<PrdTehaiIraiDetHis> referPrdTehaiIraiDetHiss() {
        if (this.prdTehaiIraiDetHiss == null) {
            this.prdTehaiIraiDetHiss = PrdTehaiIraiDet.referPrdTehaiIraiDetHiss(this.prdTehaiNo, this.iraiDetSeq);
        }
        return this.prdTehaiIraiDetHiss;
    }

    /**
     * @param param1 prdTehaiNo
     * @param param2 iraiDetSeq
     * @return List<PrdTehaiIraiDetHis>
     */
    public static List<PrdTehaiIraiDetHis> referPrdTehaiIraiDetHiss(final String param1, final java.math.BigDecimal param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("prd_tehai_no = :prd_tehai_no");
        whereList.add("irai_det_seq = :irai_det_seq");

        String sql = "SELECT * FROM PRD_TEHAI_IRAI_DET_HIS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prd_tehai_no", param1);
        params.put("irai_det_seq", param2);

        return Queries.select(sql, params, PrdTehaiIraiDetHis.class);
    }
}
