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
 * m_sansho1
 *
 * @author generator
 *
 */
public class MSansho1 implements IEntity {

    /**
     * 参照１ID
     */
    private Integer sansho1Id;

    /**
     * @return 参照１ID
     */
    public Integer getSansho1Id() {
        return this.sansho1Id;
    }

    /**
     * @param o 参照１ID
     */
    public void setSansho1Id(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.sansho1Id = Integer.valueOf(o.toString());
        } else {
            this.sansho1Id = null;
        }
    }

    /**
     * 参照１名
     */
    private String sansho1Mei;

    /**
     * @return 参照１名
     */
    public String getSansho1Mei() {
        return this.sansho1Mei;
    }

    /**
     * @param o 参照１名
     */
    public void setSansho1Mei(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.sansho1Mei = String.valueOf(o.toString());
        } else {
            this.sansho1Mei = null;
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
     * @param param1 sansho1Id
     * @return MSansho1
     */
    public static MSansho1 get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sansho1_id = :sansho1_id");

        String sql = "SELECT * FROM m_sansho1 WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sansho1_id", param1);

        return Queries.get(sql, params, MSansho1.class);
    }

    /**
     * @param now
     * @param id
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 採番処理
        numbering();

        // 参照１マスタテーブルの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sansho1_id -- :sansho1_id");
        nameList.add("sansho1_mei -- :sansho1_mei");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n, ", nameList);

        List<String> valueList = new ArrayList<String>();
        valueList.add(":sansho1_id");
        valueList.add(":sansho1_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        String value = String.join("\r\n, ", valueList);

        String sql = "INSERT INTO m_sansho1(\r\n" + name + "\r\n) VALUES (\r\n" + value + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     *
     */
    protected void numbering() {

        if (this.sansho1Id != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.SANSHO1_ID) IS NULL THEN 0 ELSE MAX(e.SANSHO1_ID) END + 1 AS SANSHO1_ID FROM m_sansho1 e";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SANSHO1_ID");

        this.setSansho1Id(o);
    }

    /**
     * @param now
     * @param id
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 参照１マスタテーブルの登録
        List<String> setList = new ArrayList<String>();
        setList.add("sansho1_id = :sansho1_id");
        setList.add("sansho1_mei = :sansho1_mei");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join(", ", setList);

        String sql = "UPDATE m_sansho1 SET " + set + " WHERE " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return 削除件数
     */
    public int delete() {
        String sql = "DELETE FROM m_sansho1 WHERE " + getWhere();
        Map<String, Object> params = toMap(null, null);
        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("sansho1_id = :sansho1_id");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sansho1_id", this.sansho1Id);
        params.put("sansho1_mei", this.sansho1Mei);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
