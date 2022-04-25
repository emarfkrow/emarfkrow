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
 * m_code_value
 *
 * @author generator
 *
 */
public class MCodeValue implements IEntity {

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
     * コード値
     */
    private String codeValue;

    /**
     * @return コード値
     */
    public String getCodeValue() {
        return this.codeValue;
    }

    /**
     * @param o コード値
     */
    public void setCodeValue(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.codeValue = String.valueOf(o.toString());
        } else {
            this.codeValue = null;
        }
    }

    /**
     * コード値名
     */
    private String codeValueMei;

    /**
     * @return コード値名
     */
    public String getCodeValueMei() {
        return this.codeValueMei;
    }

    /**
     * @param o コード値名
     */
    public void setCodeValueMei(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.codeValueMei = String.valueOf(o.toString());
        } else {
            this.codeValueMei = null;
        }
    }

    /**
     * 表示順
     */
    private Integer hyojiJun;

    /**
     * @return 表示順
     */
    public Integer getHyojiJun() {
        return this.hyojiJun;
    }

    /**
     * @param o 表示順
     */
    public void setHyojiJun(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.hyojiJun = Integer.valueOf(o.toString());
        } else {
            this.hyojiJun = null;
        }
    }

    /**
     * 取得条件
     */
    private String criteria;

    /**
     * @return 取得条件
     */
    public String getCriteria() {
        return this.criteria;
    }

    /**
     * @param o 取得条件
     */
    public void setCriteria(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.criteria = String.valueOf(o.toString());
        } else {
            this.criteria = null;
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
     * @param param2 codeValue
     * @return MCodeValue
     */
    public static MCodeValue get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("code_nm = :code_nm");
        whereList.add("code_value = :code_value");

        String sql = "SELECT * FROM m_code_value WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", param1);
        params.put("code_value", param2);

        return Queries.get(sql, params, MCodeValue.class);
    }

    /**
     * @param now
     * @param id
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // コード値マスタテーブルの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("code_nm -- :code_nm");
        nameList.add("code_value -- :code_value");
        nameList.add("code_value_mei -- :code_value_mei");
        nameList.add("hyoji_jun -- :hyoji_jun");
        nameList.add("criteria -- :criteria");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n, ", nameList);

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
        String value = String.join("\r\n, ", valueList);

        String sql = "INSERT INTO m_code_value(\r\n" + name + "\r\n) VALUES (\r\n" + value + "\r\n); ";

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
        List<String> setList = new ArrayList<String>();
        setList.add("code_nm = :code_nm");
        setList.add("code_value = :code_value");
        setList.add("code_value_mei = :code_value_mei");
        setList.add("hyoji_jun = :hyoji_jun");
        setList.add("criteria = :criteria");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join(", ", setList);

        String sql = "UPDATE m_code_value SET " + set + " WHERE " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return 削除件数
     */
    public int delete() {
        String sql = "DELETE FROM m_code_value WHERE " + getWhere();
        Map<String, Object> params = toMap(null, null);
        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("code_nm = :code_nm");
        whereList.add("code_value = :code_value");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

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
