package com.example.entity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.sql.Queries;

/**
 * m_code
 *
 * @author generator
 *
 */
public class MCode implements IEntity {

    /**
     * コード名称
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.codeNm = String.valueOf(o.toString());
        } else {
            this.codeNm = null;
        }
    }

    /**
     * コード名
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.codeMei = String.valueOf(o.toString());
        } else {
            this.codeMei = null;
        }
    }

    /**
     * 登録日時
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
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
            Date d = new Date((Long) o);
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            Date d = new Date(Long.valueOf(o.toString()));
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
        } else if (!StringUtil.isNullOrBlank(o)) {
            this.insertDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.insertDt = null;
        }
    }

    /**
     * 登録者
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.insertBy = String.valueOf(o.toString());
        } else {
            this.insertBy = null;
        }
    }

    /**
     * 更新日時
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
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
            Date d = new Date((Long) o);
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            Date d = new Date(Long.valueOf(o.toString()));
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
        } else if (!StringUtil.isNullOrBlank(o)) {
            this.updateDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.updateDt = null;
        }
    }

    /**
     * 更新者
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.updateBy = String.valueOf(o.toString());
        } else {
            this.updateBy = null;
        }
    }

    /**
     * 削除フラグ
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.deleteF = String.valueOf(o.toString());
        } else {
            this.deleteF = null;
        }
    }

    /**
     * @param param1 codeNm
     * @return MCode
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
     * @param now
     * @param id
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // コード値マスタテーブルの登録
        if (this.mCodeValues != null) {
            for (MCodeValue mCodeValue : this.mCodeValues) {
                mCodeValue.setCodeNm(this.getCodeNm());
                mCodeValue.insert(now, id);
            }
        }

        // コードマスタテーブルの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("code_nm -- :code_nm");
        nameList.add("code_mei -- :code_mei");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n, ", nameList);

        List<String> valueList = new ArrayList<String>();
        valueList.add(":code_nm");
        valueList.add(":code_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        String value = String.join("\r\n, ", valueList);

        String sql = "INSERT INTO m_code(\r\n" + name + "\r\n) VALUES (\r\n" + value + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @param now
     * @param id
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // コード値マスタテーブルの登録
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
            this.getMCodeValues();
            if (this.mCodeValues != null) {
                for (MCodeValue mCodeValue : this.mCodeValues) {
                    if (!mCodeValue.getUpdateDt().equals(now)) {
                        mCodeValue.delete();
                    }
                }
            }
        }

        // コードマスタテーブルの登録
        List<String> setList = new ArrayList<String>();
        setList.add("code_nm = :code_nm");
        setList.add("code_mei = :code_mei");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join(", ", setList);

        String sql = "UPDATE m_code SET " + set + " WHERE " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return 削除件数
     */
    public int delete() {

        if (this.mCodeValues != null) {
            for (MCodeValue mCodeValue : this.mCodeValues) {
                mCodeValue.delete();
            }
        }

        String sql = "DELETE FROM t_entity WHERE " + getWhere();

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
        params.put("code_nm", this.codeNm);
        params.put("code_mei", this.codeMei);
        params.put("delete_f", this.deleteF);
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
