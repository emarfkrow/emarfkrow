package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * エンティティ履歴
 *
 * @author emarfkrow
 */
public class TEntityHis implements IEntity {

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

    /** 履歴連番 */
    private Integer historySn;

    /**
     * @return 履歴連番
     */
    public Integer getHistorySn() {
        return this.historySn;
    }

    /**
     * @param o 履歴連番
     */
    public void setHistorySn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.historySn = Integer.valueOf(o.toString());
        } else {
            this.historySn = null;
        }
    }

    /** エンティティ名 */
    private String entityMei;

    /**
     * @return エンティティ名
     */
    public String getEntityMei() {
        return this.entityMei;
    }

    /**
     * @param o エンティティ名
     */
    public void setEntityMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entityMei = String.valueOf(o.toString());
        } else {
            this.entityMei = null;
        }
    }

    /** 参照１ID */
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
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho1Id = Integer.valueOf(o.toString());
        } else {
            this.sansho1Id = null;
        }
    }

    /** 参照１名 */
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
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho1Mei = String.valueOf(o.toString());
        } else {
            this.sansho1Mei = null;
        }
    }

    /** 参照２ID */
    private Integer sansho2Id;

    /**
     * @return 参照２ID
     */
    public Integer getSansho2Id() {
        return this.sansho2Id;
    }

    /**
     * @param o 参照２ID
     */
    public void setSansho2Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho2Id = Integer.valueOf(o.toString());
        } else {
            this.sansho2Id = null;
        }
    }

    /** 参照２名 */
    private String sansho2Mei;

    /**
     * @return 参照２名
     */
    public String getSansho2Mei() {
        return this.sansho2Mei;
    }

    /**
     * @param o 参照２名
     */
    public void setSansho2Mei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho2Mei = String.valueOf(o.toString());
        } else {
            this.sansho2Mei = null;
        }
    }

    /** 別参照１ID */
    private Integer betsuSansho1Id;

    /**
     * @return 別参照１ID
     */
    public Integer getBetsuSansho1Id() {
        return this.betsuSansho1Id;
    }

    /**
     * @param o 別参照１ID
     */
    public void setBetsuSansho1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.betsuSansho1Id = Integer.valueOf(o.toString());
        } else {
            this.betsuSansho1Id = null;
        }
    }

    /** 別参照１名 */
    private String betsuSansho1Mei;

    /**
     * @return 別参照１名
     */
    public String getBetsuSansho1Mei() {
        return this.betsuSansho1Mei;
    }

    /**
     * @param o 別参照１名
     */
    public void setBetsuSansho1Mei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.betsuSansho1Mei = String.valueOf(o.toString());
        } else {
            this.betsuSansho1Mei = null;
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
     * エンティティ履歴照会
     *
     * @param param1 祖先ID
     * @param param2 親連番
     * @param param3 エンティティ連番
     * @param param4 履歴連番
     * @return エンティティ履歴
     */
    public static TEntityHis get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        whereList.add("history_sn = :history_sn");

        String sql = "SELECT * FROM t_entity_his WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);
        params.put("entity_sn", param3);
        params.put("history_sn", param4);

        return Queries.get(sql, params, TEntityHis.class);
    }

    /**
     * エンティティ履歴追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 履歴連番の採番処理
        numbering();

        // エンティティ履歴の登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sosen_id -- :sosen_id");
        nameList.add("oya_sn -- :oya_sn");
        nameList.add("entity_sn -- :entity_sn");
        nameList.add("history_sn -- :history_sn");
        nameList.add("entity_mei -- :entity_mei");
        nameList.add("sansho1_id -- :sansho1_id");
        nameList.add("sansho1_mei -- :sansho1_mei");
        nameList.add("sansho2_id -- :sansho2_id");
        nameList.add("sansho2_mei -- :sansho2_mei");
        nameList.add("betsu_sansho1_id -- :betsu_sansho1_id");
        nameList.add("betsu_sansho1_mei -- :betsu_sansho1_mei");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO t_entity_his(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_sn");
        valueList.add(":entity_sn");
        valueList.add(":history_sn");
        valueList.add(":entity_mei");
        valueList.add(":sansho1_id");
        valueList.add(":sansho1_mei");
        valueList.add(":sansho2_id");
        valueList.add(":sansho2_mei");
        valueList.add(":betsu_sansho1_id");
        valueList.add(":betsu_sansho1_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** 履歴連番の採番処理 */
    private void numbering() {

        if (this.historySn != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.HISTORY_SN) IS NULL THEN 0 ELSE MAX(e.HISTORY_SN) END + 1 AS HISTORY_SN FROM t_entity_his e";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.SOSEN_ID = :sosen_id");
        whereList.add("e.OYA_SN = :oya_sn");
        whereList.add("e.ENTITY_SN = :entity_sn");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("sosenId", this.sosenId);
        params.put("oyaSn", this.oyaSn);
        params.put("entitySn", this.entitySn);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HISTORY_SN");

        this.setHistorySn(o);
    }

    /**
     * エンティティ履歴更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // エンティティ履歴の登録
        List<String> setList = new ArrayList<String>();
        setList.add("sosen_id = :sosen_id");
        setList.add("oya_sn = :oya_sn");
        setList.add("entity_sn = :entity_sn");
        setList.add("history_sn = :history_sn");
        setList.add("entity_mei = :entity_mei");
        setList.add("sansho1_id = :sansho1_id");
        setList.add("sansho1_mei = :sansho1_mei");
        setList.add("sansho2_id = :sansho2_id");
        setList.add("sansho2_mei = :sansho2_mei");
        setList.add("betsu_sansho1_id = :betsu_sansho1_id");
        setList.add("betsu_sansho1_mei = :betsu_sansho1_mei");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);

        String sql = "UPDATE t_entity_his\r\nSET\r\n      " + set + "\r\nWHERE\r\n    " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * エンティティ履歴削除
     *
     * @return 削除件数
     */
    public int delete() {

        // エンティティ履歴の削除
        String sql = "DELETE FROM t_entity_his WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        whereList.add("history_sn = :history_sn");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SOSEN_ID", this.sosenId);
        params.put("OYA_SN", this.oyaSn);
        params.put("ENTITY_SN", this.entitySn);
        params.put("HISTORY_SN", this.historySn);
        params.put("ENTITY_MEI", this.entityMei);
        params.put("SANSHO1_ID", this.sansho1Id);
        params.put("SANSHO1_MEI", this.sansho1Mei);
        params.put("SANSHO2_ID", this.sansho2Id);
        params.put("SANSHO2_MEI", this.sansho2Mei);
        params.put("BETSU_SANSHO1_ID", this.betsuSansho1Id);
        params.put("BETSU_SANSHO1_MEI", this.betsuSansho1Mei);
        params.put("DELETE_F", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
