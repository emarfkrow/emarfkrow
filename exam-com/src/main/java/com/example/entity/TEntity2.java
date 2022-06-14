package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * エンティティ２
 *
 * @author emarfkrow
 */
public class TEntity2 implements IEntity {

    /** 祖先ID */
    private Integer sosenId;

    /**
     * @return 祖先ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SOSEN_ID")
    public Integer getSosenId() {
        return this.sosenId;
    }

    /**
     * @param o 祖先ID
     */
    public void setSosenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sosenId = Integer.valueOf(o.toString());
        } else {
            this.sosenId = null;
        }
    }

    /** 親連番 */
    private Integer oyaSn;

    /**
     * @return 親連番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_SN")
    public Integer getOyaSn() {
        return this.oyaSn;
    }

    /**
     * @param o 親連番
     */
    public void setOyaSn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaSn = Integer.valueOf(o.toString());
        } else {
            this.oyaSn = null;
        }
    }

    /** エンティティ連番 */
    private Integer entitySn;

    /**
     * @return エンティティ連番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_SN")
    public Integer getEntitySn() {
        return this.entitySn;
    }

    /**
     * @param o エンティティ連番
     */
    public void setEntitySn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entitySn = Integer.valueOf(o.toString());
        } else {
            this.entitySn = null;
        }
    }

    /** 任意エンティティ２名 */
    private String nullEntity2Mei;

    /**
     * @return 任意エンティティ２名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NULL_ENTITY2_MEI")
    public String getNullEntity2Mei() {
        return this.nullEntity2Mei;
    }

    /**
     * @param o 任意エンティティ２名
     */
    public void setNullEntity2Mei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nullEntity2Mei = String.valueOf(o.toString());
        } else {
            this.nullEntity2Mei = null;
        }
    }

    /** エンティティ２名 */
    private String entity2Mei;

    /**
     * @return エンティティ２名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY2_MEI")
    public String getEntity2Mei() {
        return this.entity2Mei;
    }

    /**
     * @param o エンティティ２名
     */
    public void setEntity2Mei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entity2Mei = String.valueOf(o.toString());
        } else {
            this.entity2Mei = null;
        }
    }

    /** チェックフラグ */
    private String checkF = "0";

    /**
     * @return チェックフラグ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHECK_F")
    public String getCheckF() {
        return this.checkF;
    }

    /**
     * @param o チェックフラグ
     */
    public void setCheckF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.checkF = String.valueOf(o.toString());
        } else {
            this.checkF = null;
        }
    }

    /** ラジオ区分 */
    private String radioKb;

    /**
     * @return ラジオ区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RADIO_KB")
    public String getRadioKb() {
        return this.radioKb;
    }

    /**
     * @param o ラジオ区分
     */
    public void setRadioKb(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.radioKb = String.valueOf(o.toString());
        } else {
            this.radioKb = null;
        }
    }

    /** プルダウン区分 */
    private String pulldownKb;

    /**
     * @return プルダウン区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PULLDOWN_KB")
    public String getPulldownKb() {
        return this.pulldownKb;
    }

    /**
     * @param o プルダウン区分
     */
    public void setPulldownKb(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.pulldownKb = String.valueOf(o.toString());
        } else {
            this.pulldownKb = null;
        }
    }

    /** メモ */
    private String memoTx;

    /**
     * @return メモ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MEMO_TX")
    public String getMemoTx() {
        return this.memoTx;
    }

    /**
     * @param o メモ
     */
    public void setMemoTx(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.memoTx = String.valueOf(o.toString());
        } else {
            this.memoTx = null;
        }
    }

    /** 日付 */
    private String hidukeYmd;

    /**
     * @return 日付
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HIDUKE_YMD")
    public String getHidukeYmd() {
        return this.hidukeYmd;
    }

    /**
     * @param o 日付
     */
    public void setHidukeYmd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hidukeYmd = String.valueOf(o.toString());
        } else {
            this.hidukeYmd = null;
        }
    }

    /** 年月 */
    private String nengetsuYm;

    /**
     * @return 年月
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NENGETSU_YM")
    public String getNengetsuYm() {
        return this.nengetsuYm;
    }

    /**
     * @param o 年月
     */
    public void setNengetsuYm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nengetsuYm = String.valueOf(o.toString());
        } else {
            this.nengetsuYm = null;
        }
    }

    /** 年 */
    private String sampleY;

    /**
     * @return 年
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SAMPLE_Y")
    public String getSampleY() {
        return this.sampleY;
    }

    /**
     * @param o 年
     */
    public void setSampleY(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sampleY = String.valueOf(o.toString());
        } else {
            this.sampleY = null;
        }
    }

    /** 月 */
    private String sampleM;

    /**
     * @return 月
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SAMPLE_M")
    public String getSampleM() {
        return this.sampleM;
    }

    /**
     * @param o 月
     */
    public void setSampleM(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sampleM = String.valueOf(o.toString());
        } else {
            this.sampleM = null;
        }
    }

    /** 日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime nichijiDt;

    /**
     * @return 日時
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NICHIJI_DT")
    public java.time.LocalDateTime getNichijiDt() {
        return this.nichijiDt;
    }

    /**
     * @param o 日時
     */
    public void setNichijiDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.nichijiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.nichijiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nichijiDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.nichijiDt = null;
        }
    }

    /** 時刻 */
    private String jikokuHm;

    /**
     * @return 時刻
     */
    @com.fasterxml.jackson.annotation.JsonProperty("JIKOKU_HM")
    public String getJikokuHm() {
        return this.jikokuHm;
    }

    /**
     * @param o 時刻
     */
    public void setJikokuHm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jikokuHm = String.valueOf(o.toString());
        } else {
            this.jikokuHm = null;
        }
    }

    /** 時間 */
    private String jikanTm;

    /**
     * @return 時間
     */
    @com.fasterxml.jackson.annotation.JsonProperty("JIKAN_TM")
    public String getJikanTm() {
        return this.jikanTm;
    }

    /**
     * @param o 時間
     */
    public void setJikanTm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jikanTm = String.valueOf(o.toString());
        } else {
            this.jikanTm = null;
        }
    }

    /** 数量 */
    private java.math.BigDecimal suryoQt;

    /**
     * @return 数量
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SURYO_QT")
    public java.math.BigDecimal getSuryoQt() {
        return this.suryoQt;
    }

    /**
     * @param o 数量
     */
    public void setSuryoQt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.suryoQt = new java.math.BigDecimal(o.toString());
        } else {
            this.suryoQt = null;
        }
    }

    /** 単価 */
    private java.math.BigDecimal tankaAm;

    /**
     * @return 単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TANKA_AM")
    public java.math.BigDecimal getTankaAm() {
        return this.tankaAm;
    }

    /**
     * @param o 単価
     */
    public void setTankaAm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tankaAm = new java.math.BigDecimal(o.toString());
        } else {
            this.tankaAm = null;
        }
    }

    /** 金額 */
    private java.math.BigDecimal kingakuAm;

    /**
     * @return 金額
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KINGAKU_AM")
    public java.math.BigDecimal getKingakuAm() {
        return this.kingakuAm;
    }

    /**
     * @param o 金額
     */
    public void setKingakuAm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kingakuAm = new java.math.BigDecimal(o.toString());
        } else {
            this.kingakuAm = null;
        }
    }

    /** 登録日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertDt;

    /**
     * @return 登録日時
     */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_DT")
    public java.time.LocalDateTime getInsertDt() {
        return this.insertDt;
    }

    /**
     * @param o 登録日時
     */
    public void setInsertDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.insertDt = null;
        }
    }

    /** 登録者 */
    private String insertBy;

    /**
     * @return 登録者
     */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_BY")
    public String getInsertBy() {
        return this.insertBy;
    }

    /**
     * @param o 登録者
     */
    public void setInsertBy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertBy = String.valueOf(o.toString());
        } else {
            this.insertBy = null;
        }
    }

    /** 更新日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime updateDt;

    /**
     * @return 更新日時
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_DT")
    public java.time.LocalDateTime getUpdateDt() {
        return this.updateDt;
    }

    /**
     * @param o 更新日時
     */
    public void setUpdateDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.updateDt = null;
        }
    }

    /** 更新者 */
    private String updateBy;

    /**
     * @return 更新者
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_BY")
    public String getUpdateBy() {
        return this.updateBy;
    }

    /**
     * @param o 更新者
     */
    public void setUpdateBy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateBy = String.valueOf(o.toString());
        } else {
            this.updateBy = null;
        }
    }

    /** 削除フラグ */
    private String deleteF = "0";

    /**
     * @return 削除フラグ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_F")
    public String getDeleteF() {
        return this.deleteF;
    }

    /**
     * @param o 削除フラグ
     */
    public void setDeleteF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteF = String.valueOf(o.toString());
        } else {
            this.deleteF = null;
        }
    }

    /**
     * エンティティ２照会
     *
     * @param param1 祖先ID
     * @param param2 親連番
     * @param param3 エンティティ連番
     * @return エンティティ２
     */
    public static TEntity2 get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        whereList.add("`ENTITY_SN` = :entity_sn");

        String sql = "SELECT * FROM t_entity2 WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);
        params.put("entity_sn", param3);

        return Queries.get(sql, params, TEntity2.class);
    }

    /**
     * エンティティ２追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // エンティティ連番の採番処理
        numbering();

        // エンティティ２の登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_SN` -- :oya_sn");
        nameList.add("`ENTITY_SN` -- :entity_sn");
        nameList.add("`NULL_ENTITY2_MEI` -- :null_entity2_mei");
        nameList.add("`ENTITY2_MEI` -- :entity2_mei");
        nameList.add("`CHECK_F` -- :check_f");
        nameList.add("`RADIO_KB` -- :radio_kb");
        nameList.add("`PULLDOWN_KB` -- :pulldown_kb");
        nameList.add("`MEMO_TX` -- :memo_tx");
        nameList.add("`HIDUKE_YMD` -- :hiduke_ymd");
        nameList.add("`NENGETSU_YM` -- :nengetsu_ym");
        nameList.add("`SAMPLE_Y` -- :sample_y");
        nameList.add("`SAMPLE_M` -- :sample_m");
        nameList.add("`NICHIJI_DT` -- :nichiji_dt");
        nameList.add("`JIKOKU_HM` -- :jikoku_hm");
        nameList.add("`JIKAN_TM` -- :jikan_tm");
        nameList.add("`SURYO_QT` -- :suryo_qt");
        nameList.add("`TANKA_AM` -- :tanka_am");
        nameList.add("`KINGAKU_AM` -- :kingaku_am");
        nameList.add("`INSERT_DT` -- :insert_dt");
        nameList.add("`INSERT_BY` -- :insert_by");
        nameList.add("`UPDATE_DT` -- :update_dt");
        nameList.add("`UPDATE_BY` -- :update_by");
        nameList.add("`DELETE_F` -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO t_entity2(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_sn");
        valueList.add(":entity_sn");
        valueList.add(":null_entity2_mei");
        valueList.add(":entity2_mei");
        valueList.add(":check_f");
        valueList.add(":radio_kb");
        valueList.add(":pulldown_kb");
        valueList.add(":memo_tx");
        valueList.add(":hiduke_ymd");
        valueList.add(":nengetsu_ym");
        valueList.add(":sample_y");
        valueList.add(":sample_m");
        valueList.add(":nichiji_dt");
        valueList.add(":jikoku_hm");
        valueList.add(":jikan_tm");
        valueList.add(":suryo_qt");
        valueList.add(":tanka_am");
        valueList.add(":kingaku_am");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** エンティティ連番の採番処理 */
    private void numbering() {

        if (this.entitySn != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.`ENTITY_SN`) IS NULL THEN 0 ELSE MAX(e.`ENTITY_SN`) * 1 END + 1 AS `ENTITY_SN` FROM t_entity2 e";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        whereList.add("e.`OYA_SN` = :oya_sn");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("sosen_id", this.sosenId);
        params.put("oya_sn", this.oyaSn);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("ENTITY_SN");

        this.setEntitySn(o);
    }

    /**
     * エンティティ２更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // エンティティ２の登録
        String sql = "UPDATE t_entity2\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_SN` = :oya_sn");
        setList.add("`ENTITY_SN` = :entity_sn");
        setList.add("`NULL_ENTITY2_MEI` = :null_entity2_mei");
        setList.add("`ENTITY2_MEI` = :entity2_mei");
        setList.add("`CHECK_F` = :check_f");
        setList.add("`RADIO_KB` = :radio_kb");
        setList.add("`PULLDOWN_KB` = :pulldown_kb");
        setList.add("`MEMO_TX` = :memo_tx");
        setList.add("`HIDUKE_YMD` = :hiduke_ymd");
        setList.add("`NENGETSU_YM` = :nengetsu_ym");
        setList.add("`SAMPLE_Y` = :sample_y");
        setList.add("`SAMPLE_M` = :sample_m");
        setList.add("`NICHIJI_DT` = :nichiji_dt");
        setList.add("`JIKOKU_HM` = :jikoku_hm");
        setList.add("`JIKAN_TM` = :jikan_tm");
        setList.add("`SURYO_QT` = :suryo_qt");
        setList.add("`TANKA_AM` = :tanka_am");
        setList.add("`KINGAKU_AM` = :kingaku_am");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * エンティティ２削除
     *
     * @return 削除件数
     */
    public int delete() {

        // エンティティ２の削除
        String sql = "DELETE FROM t_entity2 WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        whereList.add("`ENTITY_SN` = :entity_sn");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", this.sosenId);
        params.put("oya_sn", this.oyaSn);
        params.put("entity_sn", this.entitySn);
        params.put("null_entity2_mei", this.nullEntity2Mei);
        params.put("entity2_mei", this.entity2Mei);
        params.put("check_f", this.checkF);
        params.put("radio_kb", this.radioKb);
        params.put("pulldown_kb", this.pulldownKb);
        params.put("memo_tx", this.memoTx);
        params.put("hiduke_ymd", this.hidukeYmd);
        params.put("nengetsu_ym", this.nengetsuYm);
        params.put("sample_y", this.sampleY);
        params.put("sample_m", this.sampleM);
        params.put("nichiji_dt", this.nichijiDt);
        params.put("jikoku_hm", this.jikokuHm);
        params.put("jikan_tm", this.jikanTm);
        params.put("suryo_qt", this.suryoQt);
        params.put("tanka_am", this.tankaAm);
        params.put("kingaku_am", this.kingakuAm);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
