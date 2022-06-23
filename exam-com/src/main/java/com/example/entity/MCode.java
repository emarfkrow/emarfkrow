package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * コードマスタ
 * @author emarfkrow
 */
public class MCode implements IEntity {

    /** コード名称 */
    private String codeNm;

    /** @return コード名称 */
    @com.fasterxml.jackson.annotation.JsonProperty("CODE_NM")
    public String getCodeNm() {
        return this.codeNm;
    }

    /** @param o コード名称 */
    public void setCodeNm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeNm = String.valueOf(o.toString());
        } else {
            this.codeNm = null;
        }
    }

    /** コード名 */
    private String codeMei;

    /** @return コード名 */
    @com.fasterxml.jackson.annotation.JsonProperty("CODE_MEI")
    public String getCodeMei() {
        return this.codeMei;
    }

    /** @param o コード名 */
    public void setCodeMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeMei = String.valueOf(o.toString());
        } else {
            this.codeMei = null;
        }
    }

    /** 登録日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertDt;

    /** @return 登録日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_DT")
    public java.time.LocalDateTime getInsertDt() {
        return this.insertDt;
    }

    /** @param o 登録日時 */
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

    /** @return 登録者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_BY")
    public String getInsertBy() {
        return this.insertBy;
    }

    /** @param o 登録者 */
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

    /** @return 更新日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_DT")
    public java.time.LocalDateTime getUpdateDt() {
        return this.updateDt;
    }

    /** @param o 更新日時 */
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

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_BY")
    public String getUpdateBy() {
        return this.updateBy;
    }

    /** @param o 更新者 */
    public void setUpdateBy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateBy = String.valueOf(o.toString());
        } else {
            this.updateBy = null;
        }
    }

    /** 削除フラグ */
    private String deleteF = "0";

    /** @return 削除フラグ */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_F")
    public String getDeleteF() {
        return this.deleteF;
    }

    /** @param o 削除フラグ */
    public void setDeleteF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteF = String.valueOf(o.toString());
        } else {
            this.deleteF = null;
        }
    }

    /**
     * コードマスタ照会
     * @param param1 コード名称
     * @return コードマスタ
     */
    public static MCode get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`CODE_NM` = :code_nm");
        String sql = "SELECT * FROM m_code WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code_nm", param1);
        return Queries.get(sql, map, MCode.class);
    }

    /**
     * コードマスタ追加
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // コード値マスタの登録
        if (this.mCodeValues != null) {
            for (MCodeValue mCodeValue : this.mCodeValues) {
                mCodeValue.setCodeNm(this.getCodeNm());
                mCodeValue.insert(now, id);
            }
        }

        // コードマスタの登録
        String sql = "INSERT INTO m_code(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, id));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`CODE_NM` -- :code_nm");
        nameList.add("`CODE_MEI` -- :code_mei");
        nameList.add("`INSERT_DT` -- :insert_dt");
        nameList.add("`INSERT_BY` -- :insert_by");
        nameList.add("`UPDATE_DT` -- :update_dt");
        nameList.add("`UPDATE_BY` -- :update_by");
        nameList.add("`DELETE_F` -- :delete_f");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":code_nm");
        valueList.add(":code_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * コードマスタ更新
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // コード値マスタの登録
        if (this.mCodeValues != null) {
            Queries.regist("DELETE FROM m_code_value WHERE `CODE_NM` = :code_nm AND `CODE_VALUE` = :code_value", toMap(now, id));
            for (MCodeValue mCodeValue : this.mCodeValues) {
                mCodeValue.setCodeNm(this.codeNm);
                try {
                    mCodeValue.insert(now, id);
                } catch (Exception e) {
                    mCodeValue.update(now, id);
                }
            }
        }

        // コードマスタの登録
        String sql = "UPDATE m_code\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, id));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`CODE_NM` = :code_nm");
        setList.add("`CODE_MEI` = :code_mei");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * コードマスタ削除
     * @return 削除件数
     */
    public int delete() {

        // コード値マスタの削除
        if (this.mCodeValues != null) {
            for (MCodeValue mCodeValue : this.mCodeValues) {
                mCodeValue.delete();
            }
        }

        // コードマスタの削除
        String sql = "DELETE FROM m_code WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`CODE_NM` = :code_nm");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param id 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code_nm", this.codeNm);
        map.put("code_mei", this.codeMei);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", id);
        map.put("update_dt", now);
        map.put("update_by", id);
        return map;
    }

    /** コード値マスタのリスト */
    private List<MCodeValue> mCodeValues;

    /** @return コード値マスタのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("MCodeValues")
    public List<MCodeValue> getMCodeValues() {
        return this.mCodeValues;
    }

    /** @param list コード値マスタのリスト */
    public void setMCodeValues(final List<MCodeValue> list) {
        this.mCodeValues = list;
    }

    /** @param mCodeValue */
    public void addMCodeValues(final MCodeValue mCodeValue) {
        if (this.mCodeValues == null) {
            this.mCodeValues = new ArrayList<MCodeValue>();
        }
        this.mCodeValues.add(mCodeValue);
    }

    /** @return コード値マスタのリスト */
    public List<MCodeValue> referMCodeValues() {
        if (this.mCodeValues == null) {
            this.mCodeValues = MCode.referMCodeValues(this.codeNm);
        }
        return this.mCodeValues;
    }

    /**
     * @param param1 codeNm
     * @return List<MCodeValue>
     */
    public static List<MCodeValue> referMCodeValues(final String param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("code_nm = :code_nm");
        String sql = "SELECT * FROM m_code_value WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code_nm", param1);
        return Queries.select(sql, map, MCodeValue.class);
    }
}
