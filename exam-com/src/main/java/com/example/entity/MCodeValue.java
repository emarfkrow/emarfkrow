package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * コード値マスタ
 *
 * @author emarfkrow
 */
public class MCodeValue implements IEntity {

    /** コード名称 */
    private String codeNm;

    /**
     * @return コード名称
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CODE_NM")
    public String getCodeNm() {
        return this.codeNm;
    }

    /**
     * @param o コード名称
     */
    public void setCodeNm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeNm = String.valueOf(o.toString());
        } else {
            this.codeNm = null;
        }
    }

    /** コード値 */
    private String codeValue;

    /**
     * @return コード値
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CODE_VALUE")
    public String getCodeValue() {
        return this.codeValue;
    }

    /**
     * @param o コード値
     */
    public void setCodeValue(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeValue = String.valueOf(o.toString());
        } else {
            this.codeValue = null;
        }
    }

    /** コード値名 */
    private String codeValueMei;

    /**
     * @return コード値名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CODE_VALUE_MEI")
    public String getCodeValueMei() {
        return this.codeValueMei;
    }

    /**
     * @param o コード値名
     */
    public void setCodeValueMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeValueMei = String.valueOf(o.toString());
        } else {
            this.codeValueMei = null;
        }
    }

    /** 表示順 */
    private Integer hyojiJun;

    /**
     * @return 表示順
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HYOJI_JUN")
    public Integer getHyojiJun() {
        return this.hyojiJun;
    }

    /**
     * @param o 表示順
     */
    public void setHyojiJun(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hyojiJun = Integer.valueOf(o.toString());
        } else {
            this.hyojiJun = null;
        }
    }

    /** 取得条件 */
    private String criteria;

    /**
     * @return 取得条件
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CRITERIA")
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @param o 取得条件
     */
    public void setCriteria(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.criteria = String.valueOf(o.toString());
        } else {
            this.criteria = null;
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
     * コード値マスタ照会
     *
     * @param param1 コード名称
     * @param param2 コード値
     * @return コード値マスタ
     */
    public static MCodeValue get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("`CODE_NM` = :code_nm");
        whereList.add("`CODE_VALUE` = :code_value");

        String sql = "SELECT * FROM m_code_value WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", param1);
        params.put("code_value", param2);

        return Queries.get(sql, params, MCodeValue.class);
    }

    /**
     * コード値マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // コード値マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("`CODE_NM` -- :code_nm");
        nameList.add("`CODE_VALUE` -- :code_value");
        nameList.add("`CODE_VALUE_MEI` -- :code_value_mei");
        nameList.add("`HYOJI_JUN` -- :hyoji_jun");
        nameList.add("`CRITERIA` -- :criteria");
        nameList.add("`INSERT_DT` -- :insert_dt");
        nameList.add("`INSERT_BY` -- :insert_by");
        nameList.add("`UPDATE_DT` -- :update_dt");
        nameList.add("`UPDATE_BY` -- :update_by");
        nameList.add("`DELETE_F` -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO m_code_value(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return insert用のvalue句
     */
    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":code_nm");
        valueList.add(":code_value");
        valueList.add(":code_value_mei");
        valueList.add(":hyoji_jun");
        valueList.add(":criteria");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * コード値マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // コード値マスタの登録
        String sql = "UPDATE m_code_value\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    /**
     * @return update用のset句
     */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`CODE_NM` = :code_nm");
        setList.add("`CODE_VALUE` = :code_value");
        setList.add("`CODE_VALUE_MEI` = :code_value_mei");
        setList.add("`HYOJI_JUN` = :hyoji_jun");
        setList.add("`CRITERIA` = :criteria");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * コード値マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // コード値マスタの削除
        String sql = "DELETE FROM m_code_value WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    /**
     * @return where句
     */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`CODE_NM` = :code_nm");
        whereList.add("`CODE_VALUE` = :code_value");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param id 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", this.codeNm);
        params.put("code_value", this.codeValue);
        params.put("code_value_mei", this.codeValueMei);
        params.put("hyoji_jun", this.hyojiJun);
        params.put("criteria", this.criteria);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
