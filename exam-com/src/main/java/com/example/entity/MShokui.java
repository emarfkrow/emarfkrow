package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 職位マスタ
 *
 * @author emarfkrow
 */
public class MShokui implements IEntity {

    /** 職位ID */
    private Integer shokuiId;

    /**
     * @return 職位ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHOKUI_ID")
    public Integer getShokuiId() {
        return this.shokuiId;
    }

    /**
     * @param o 職位ID
     */
    public void setShokuiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shokuiId = Integer.valueOf(o.toString());
        } else {
            this.shokuiId = null;
        }
    }

    /** 職位名 */
    private String shokuiMei;

    /**
     * @return 職位名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHOKUI_MEI")
    public String getShokuiMei() {
        return this.shokuiMei;
    }

    /**
     * @param o 職位名
     */
    public void setShokuiMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shokuiMei = String.valueOf(o.toString());
        } else {
            this.shokuiMei = null;
        }
    }

    /** 職位順 */
    private Integer orderId;

    /**
     * @return 職位順
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ORDER_ID")
    public Integer getOrderId() {
        return this.orderId;
    }

    /**
     * @param o 職位順
     */
    public void setOrderId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderId = Integer.valueOf(o.toString());
        } else {
            this.orderId = null;
        }
    }

    /** 開始日 */
    private String kaishiYmd;

    /**
     * @return 開始日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAISHI_YMD")
    public String getKaishiYmd() {
        return this.kaishiYmd;
    }

    /**
     * @param o 開始日
     */
    public void setKaishiYmd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaishiYmd = String.valueOf(o.toString());
        } else {
            this.kaishiYmd = null;
        }
    }

    /** 終了日 */
    private String shuryoYmd;

    /**
     * @return 終了日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHURYO_YMD")
    public String getShuryoYmd() {
        return this.shuryoYmd;
    }

    /**
     * @param o 終了日
     */
    public void setShuryoYmd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuryoYmd = String.valueOf(o.toString());
        } else {
            this.shuryoYmd = null;
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
     * 職位マスタ照会
     *
     * @param param1 職位ID
     * @return 職位マスタ
     */
    public static MShokui get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("`SHOKUI_ID` = :shokui_id");

        String sql = "SELECT * FROM m_shokui WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("shokui_id", param1);

        return Queries.get(sql, params, MShokui.class);
    }

    /**
     * 職位マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 職位IDの採番処理
        numbering();

        // 職位マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SHOKUI_ID` -- :shokui_id");
        nameList.add("`SHOKUI_MEI` -- :shokui_mei");
        nameList.add("`ORDER_ID` -- :order_id");
        nameList.add("`KAISHI_YMD` -- :kaishi_ymd");
        nameList.add("`SHURYO_YMD` -- :shuryo_ymd");
        nameList.add("`INSERT_DT` -- :insert_dt");
        nameList.add("`INSERT_BY` -- :insert_by");
        nameList.add("`UPDATE_DT` -- :update_dt");
        nameList.add("`UPDATE_BY` -- :update_by");
        nameList.add("`DELETE_F` -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO m_shokui(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return insert用のvalue句
     */
    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":shokui_id");
        valueList.add(":shokui_mei");
        valueList.add(":order_id");
        valueList.add(":kaishi_ymd");
        valueList.add(":shuryo_ymd");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** 職位IDの採番処理 */
    private void numbering() {

        if (this.shokuiId != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.`SHOKUI_ID`) IS NULL THEN 0 ELSE MAX(e.`SHOKUI_ID`) * 1 END + 1 AS `SHOKUI_ID` FROM m_shokui e";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SHOKUI_ID");

        this.setShokuiId(o);
    }

    /**
     * 職位マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 職位マスタの登録
        String sql = "UPDATE m_shokui\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    /**
     * @return update用のset句
     */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SHOKUI_ID` = :shokui_id");
        setList.add("`SHOKUI_MEI` = :shokui_mei");
        setList.add("`ORDER_ID` = :order_id");
        setList.add("`KAISHI_YMD` = :kaishi_ymd");
        setList.add("`SHURYO_YMD` = :shuryo_ymd");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 職位マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 職位マスタの削除
        String sql = "DELETE FROM m_shokui WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    /**
     * @return where句
     */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SHOKUI_ID` = :shokui_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param id 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("shokui_id", this.shokuiId);
        params.put("shokui_mei", this.shokuiMei);
        params.put("order_id", this.orderId);
        params.put("kaishi_ymd", this.kaishiYmd);
        params.put("shuryo_ymd", this.shuryoYmd);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
