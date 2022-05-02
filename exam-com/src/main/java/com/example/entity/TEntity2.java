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
    private String checkF;

    /**
     * @return チェックフラグ
     */
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
    private String deleteF;

    /**
     * @return 削除フラグ
     */
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
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");

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
        nameList.add("sosen_id -- :sosen_id");
        nameList.add("oya_sn -- :oya_sn");
        nameList.add("entity_sn -- :entity_sn");
        nameList.add("null_entity2_mei -- :null_entity2_mei");
        nameList.add("entity2_mei -- :entity2_mei");
        nameList.add("check_f -- :check_f");
        nameList.add("radio_kb -- :radio_kb");
        nameList.add("pulldown_kb -- :pulldown_kb");
        nameList.add("memo_tx -- :memo_tx");
        nameList.add("hiduke_ymd -- :hiduke_ymd");
        nameList.add("nengetsu_ym -- :nengetsu_ym");
        nameList.add("sample_y -- :sample_y");
        nameList.add("sample_m -- :sample_m");
        nameList.add("nichiji_dt -- :nichiji_dt");
        nameList.add("jikoku_hm -- :jikoku_hm");
        nameList.add("jikan_tm -- :jikan_tm");
        nameList.add("suryo_qt -- :suryo_qt");
        nameList.add("tanka_am -- :tanka_am");
        nameList.add("kingaku_am -- :kingaku_am");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO t_entity2(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n); ";

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

        String sql = "SELECT CASE WHEN MAX(e.ENTITY_SN) IS NULL THEN 0 ELSE MAX(e.ENTITY_SN) END + 1 AS ENTITY_SN FROM t_entity2 e";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.SOSEN_ID = :sosen_id");
        whereList.add("e.OYA_SN = :oya_sn");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("sosenId", this.sosenId);
        params.put("oyaSn", this.oyaSn);

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
        List<String> setList = new ArrayList<String>();
        setList.add("sosen_id = :sosen_id");
        setList.add("oya_sn = :oya_sn");
        setList.add("entity_sn = :entity_sn");
        setList.add("null_entity2_mei = :null_entity2_mei");
        setList.add("entity2_mei = :entity2_mei");
        setList.add("check_f = :check_f");
        setList.add("radio_kb = :radio_kb");
        setList.add("pulldown_kb = :pulldown_kb");
        setList.add("memo_tx = :memo_tx");
        setList.add("hiduke_ymd = :hiduke_ymd");
        setList.add("nengetsu_ym = :nengetsu_ym");
        setList.add("sample_y = :sample_y");
        setList.add("sample_m = :sample_m");
        setList.add("nichiji_dt = :nichiji_dt");
        setList.add("jikoku_hm = :jikoku_hm");
        setList.add("jikan_tm = :jikan_tm");
        setList.add("suryo_qt = :suryo_qt");
        setList.add("tanka_am = :tanka_am");
        setList.add("kingaku_am = :kingaku_am");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);

        String sql = "UPDATE t_entity2\r\nSET\r\n      " + set + "\r\nWHERE\r\n    " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
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
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SOSEN_ID", this.sosenId);
        params.put("OYA_SN", this.oyaSn);
        params.put("ENTITY_SN", this.entitySn);
        params.put("NULL_ENTITY2_MEI", this.nullEntity2Mei);
        params.put("ENTITY2_MEI", this.entity2Mei);
        params.put("CHECK_F", this.checkF);
        params.put("RADIO_KB", this.radioKb);
        params.put("PULLDOWN_KB", this.pulldownKb);
        params.put("MEMO_TX", this.memoTx);
        params.put("HIDUKE_YMD", this.hidukeYmd);
        params.put("NENGETSU_YM", this.nengetsuYm);
        params.put("SAMPLE_Y", this.sampleY);
        params.put("SAMPLE_M", this.sampleM);
        params.put("NICHIJI_DT", this.nichijiDt);
        params.put("JIKOKU_HM", this.jikokuHm);
        params.put("JIKAN_TM", this.jikanTm);
        params.put("SURYO_QT", this.suryoQt);
        params.put("TANKA_AM", this.tankaAm);
        params.put("KINGAKU_AM", this.kingakuAm);
        params.put("DELETE_F", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
