package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 親
 *
 * @author emarfkrow
 */
public class TOya implements IEntity {

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

    /** 親名 */
    private String oyaMei;

    /**
     * @return 親名
     */
    public String getOyaMei() {
        return this.oyaMei;
    }

    /**
     * @param o 親名
     */
    public void setOyaMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaMei = String.valueOf(o.toString());
        } else {
            this.oyaMei = null;
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
     * 親照会
     *
     * @param param1 祖先ID
     * @param param2 親連番
     * @return 親
     */
    public static TOya get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");

        String sql = "SELECT * FROM t_oya WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);

        return Queries.get(sql, params, TOya.class);
    }

    /**
     * 親追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 親連番の採番処理
        numbering();

        // エンティティの登録
        if (this.tEntitys != null) {
            for (TEntity tEntity : this.tEntitys) {
                tEntity.setSosenId(this.getSosenId());
                tEntity.setOyaSn(this.getOyaSn());
                tEntity.insert(now, id);
            }
        }

        // 親の登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sosen_id -- :sosen_id");
        nameList.add("oya_sn -- :oya_sn");
        nameList.add("oya_mei -- :oya_mei");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO t_oya(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_sn");
        valueList.add(":oya_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** 親連番の採番処理 */
    private void numbering() {

        if (this.oyaSn != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.OYA_SN) IS NULL THEN 0 ELSE MAX(e.OYA_SN) END + 1 AS OYA_SN FROM t_oya e";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.SOSEN_ID = :sosen_id");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("sosenId", this.sosenId);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("OYA_SN");

        this.setOyaSn(o);
    }

    /**
     * 親更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // エンティティの登録
        if (this.tEntitys != null) {
            for (TEntity tEntity : this.tEntitys) {
                tEntity.setSosenId(this.sosenId);
                tEntity.setOyaSn(this.oyaSn);
                try {
                    tEntity.insert(now, id);
                } catch (Exception e) {
                    tEntity.update(now, id);
                }
            }
            this.tEntitys = null;
            this.referTEntitys();
            if (this.tEntitys != null) {
                for (TEntity tEntity : this.tEntitys) {
                    if (!tEntity.getUpdateDt().equals(now)) {
                        tEntity.delete();
                    }
                }
            }
        }

        // 親の登録
        List<String> setList = new ArrayList<String>();
        setList.add("sosen_id = :sosen_id");
        setList.add("oya_sn = :oya_sn");
        setList.add("oya_mei = :oya_mei");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);

        String sql = "UPDATE t_oya\r\nSET\r\n      " + set + "\r\nWHERE\r\n    " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * 親削除
     *
     * @return 削除件数
     */
    public int delete() {

        // エンティティの削除
        if (this.tEntitys != null) {
            for (TEntity tEntity : this.tEntitys) {
                tEntity.delete();
            }
        }

        // 親の削除
        String sql = "DELETE FROM t_oya WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SOSEN_ID", this.sosenId);
        params.put("OYA_SN", this.oyaSn);
        params.put("OYA_MEI", this.oyaMei);
        params.put("DELETE_F", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }

    /**
     * エンティティのリスト
     */
    private List<TEntity> tEntitys;

    /**
     * @return エンティティのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntitys")
    public List<TEntity> getTEntitys() {
        return this.tEntitys;
    }

    /**
     * @param list エンティティのリスト
     */
    public void setTEntitys(final List<TEntity> list) {
        this.tEntitys = list;
    }

    /**
     * @param tEntity
     */
    public void addTEntitys(final TEntity tEntity) {
        if (this.tEntitys == null) {
            this.tEntitys = new ArrayList<TEntity>();
        }
        this.tEntitys.add(tEntity);
    }

    /**
     * @return エンティティのリスト
     */
    public List<TEntity> referTEntitys() {
        if (this.tEntitys == null) {
            this.tEntitys = TOya.referTEntitys(this.sosenId, this.oyaSn);
        }
        return this.tEntitys;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaSn
     * @return List<TEntity>
     */
    public static List<TEntity> referTEntitys(final Integer param1, final Integer param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");

        String sql = "SELECT * FROM t_entity WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);

        return Queries.select(sql, params, TEntity.class);
    }
}
