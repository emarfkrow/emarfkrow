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
 *
 * @author emarfkrow
 */
public class MCode implements IEntity {

    /** コード名称 */
    private String codeNm;

    /**
     * @return コード名称
     */
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

    /** コード名 */
    private String codeMei;

    /**
     * @return コード名
     */
    public String getCodeMei() {
        return this.codeMei;
    }

    /**
     * @param o コード名
     */
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
     * コードマスタ照会
     *
     * @param param1 コード名称
     * @return コードマスタ
     */
    public static MCode get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("code_nm = :code_nm");

        String sql = "SELECT * FROM m_code WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", param1);

        return Queries.get(sql, params, MCode.class);
    }

    /**
     * コードマスタ追加
     *
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
        List<String> nameList = new ArrayList<String>();
        nameList.add("code_nm -- :code_nm");
        nameList.add("code_mei -- :code_mei");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO m_code(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
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
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // コード値マスタの登録
        if (this.mCodeValues != null) {
            for (MCodeValue mCodeValue : this.mCodeValues) {
                mCodeValue.setCodeNm(this.codeNm);
                try {
                    mCodeValue.insert(now, id);
                } catch (Exception e) {
                    mCodeValue.update(now, id);
                }
            }
            this.mCodeValues = null;
            this.referMCodeValues();
            if (this.mCodeValues != null) {
                for (MCodeValue mCodeValue : this.mCodeValues) {
                    if (!mCodeValue.getUpdateDt().equals(now)) {
                        mCodeValue.delete();
                    }
                }
            }
        }

        // コードマスタの登録
        String sql = "UPDATE m_code\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("code_nm = :code_nm");
        setList.add("code_mei = :code_mei");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * コードマスタ削除
     *
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

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("code_nm = :code_nm");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("CODE_NM", this.codeNm);
        params.put("CODE_MEI", this.codeMei);
        params.put("DELETE_F", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }

    /**
     * コード値マスタのリスト
     */
    private List<MCodeValue> mCodeValues;

    /**
     * @return コード値マスタのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MCodeValues")
    public List<MCodeValue> getMCodeValues() {
        return this.mCodeValues;
    }

    /**
     * @param list コード値マスタのリスト
     */
    public void setMCodeValues(final List<MCodeValue> list) {
        this.mCodeValues = list;
    }

    /**
     * @param mCodeValue
     */
    public void addMCodeValues(final MCodeValue mCodeValue) {
        if (this.mCodeValues == null) {
            this.mCodeValues = new ArrayList<MCodeValue>();
        }
        this.mCodeValues.add(mCodeValue);
    }

    /**
     * @return コード値マスタのリスト
     */
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

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", param1);

        return Queries.select(sql, params, MCodeValue.class);
    }
}
