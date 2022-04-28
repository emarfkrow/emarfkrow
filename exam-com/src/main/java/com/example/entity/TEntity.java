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
 * t_entity
 *
 * @author generator
 *
 */
public class TEntity implements IEntity {

    /**
     * 祖先ID
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.sosenId = Integer.valueOf(o.toString());
        } else {
            this.sosenId = null;
        }
    }

    /**
     * 親連番
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.oyaSn = Integer.valueOf(o.toString());
        } else {
            this.oyaSn = null;
        }
    }

    /**
     * エンティティ連番
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.entitySn = Integer.valueOf(o.toString());
        } else {
            this.entitySn = null;
        }
    }

    /**
     * エンティティ名
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.entityMei = String.valueOf(o.toString());
        } else {
            this.entityMei = null;
        }
    }

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
     * 参照２ID
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.sansho2Id = Integer.valueOf(o.toString());
        } else {
            this.sansho2Id = null;
        }
    }

    /**
     * 参照２名
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.sansho2Mei = String.valueOf(o.toString());
        } else {
            this.sansho2Mei = null;
        }
    }

    /**
     * 別参照１ID
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.betsuSansho1Id = Integer.valueOf(o.toString());
        } else {
            this.betsuSansho1Id = null;
        }
    }

    /**
     * 別参照１名
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.betsuSansho1Mei = String.valueOf(o.toString());
        } else {
            this.betsuSansho1Mei = null;
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
     * @param param1 sosenId
     * @param param2 oyaSn
     * @param param3 entitySn
     * @return TEntity
     */
    public static TEntity get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");

        String sql = "SELECT * FROM t_entity WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);
        params.put("entity_sn", param3);

        return Queries.get(sql, params, TEntity.class);
    }

    /**
     * @param now
     * @param id
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 採番処理
        numbering();

        // 子テーブルの登録
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.setSosenId(this.getSosenId());
                tKo.setOyaSn(this.getOyaSn());
                tKo.setEntitySn(this.getEntitySn());
                tKo.insert(now, id);
            }
        }

        if (this.tEntity2 != null) {
            this.tEntity2.setSosenId(this.getSosenId());
            this.tEntity2.setOyaSn(this.getOyaSn());
            this.tEntity2.setEntitySn(this.getEntitySn());
            this.tEntity2.insert(now, id);
        }

        // エンティティ履歴テーブルの登録
        TEntityHis tEntityHis = new TEntityHis();
        tEntityHis.setSosenId(this.sosenId);
        tEntityHis.setOyaSn(this.oyaSn);
        tEntityHis.setEntitySn(this.entitySn);
        tEntityHis.setEntityMei(this.entityMei);
        tEntityHis.setSansho1Id(this.sansho1Id);
        tEntityHis.setSansho1Mei(this.sansho1Mei);
        tEntityHis.setSansho2Id(this.sansho2Id);
        tEntityHis.setSansho2Mei(this.sansho2Mei);
        tEntityHis.setBetsuSansho1Id(this.betsuSansho1Id);
        tEntityHis.setBetsuSansho1Mei(this.betsuSansho1Mei);
        tEntityHis.setInsertDt(this.insertDt);
        tEntityHis.setInsertBy(this.insertBy);
        tEntityHis.setUpdateDt(this.updateDt);
        tEntityHis.setUpdateBy(this.updateBy);
        tEntityHis.setDeleteF(this.deleteF);
        tEntityHis.insert(now, id);

        // エンティティテーブルの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sosen_id -- :sosen_id");
        nameList.add("oya_sn -- :oya_sn");
        nameList.add("entity_sn -- :entity_sn");
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

        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_sn");
        valueList.add(":entity_sn");
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
        String value = String.join("\r\n    , ", valueList);

        String sql = "INSERT INTO t_entity(\r\n      " + name + "\r\n) VALUES (\r\n      " + value + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     *
     */
    protected void numbering() {

        if (this.entitySn != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.ENTITY_SN) IS NULL THEN 0 ELSE MAX(e.ENTITY_SN) END + 1 AS ENTITY_SN FROM t_entity e";

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
     * @param now
     * @param id
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 子テーブルの登録
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.setSosenId(this.sosenId);
                tKo.setOyaSn(this.oyaSn);
                tKo.setEntitySn(this.entitySn);
                try {
                    tKo.insert(now, id);
                } catch (Exception e) {
                    tKo.update(now, id);
                }
            }
            this.tKos = null;
            this.getTKos();
            if (this.tKos != null) {
                for (TKo tKo : this.tKos) {
                    if (!tKo.getUpdateDt().equals(now)) {
                        tKo.delete();
                    }
                }
            }
        }

        if (this.tEntity2 != null) {
            tEntity2.setSosenId(this.getSosenId());
            tEntity2.setOyaSn(this.getOyaSn());
            tEntity2.setEntitySn(this.getEntitySn());
            try {
                tEntity2.insert(now, id);
            } catch (Exception e) {
                tEntity2.update(now, id);
            }
        }

        // エンティティ履歴テーブルの登録
        TEntityHis tEntityHis = new TEntityHis();
        tEntityHis.setSosenId(this.sosenId);
        tEntityHis.setOyaSn(this.oyaSn);
        tEntityHis.setEntitySn(this.entitySn);
        tEntityHis.setEntityMei(this.entityMei);
        tEntityHis.setSansho1Id(this.sansho1Id);
        tEntityHis.setSansho1Mei(this.sansho1Mei);
        tEntityHis.setSansho2Id(this.sansho2Id);
        tEntityHis.setSansho2Mei(this.sansho2Mei);
        tEntityHis.setBetsuSansho1Id(this.betsuSansho1Id);
        tEntityHis.setBetsuSansho1Mei(this.betsuSansho1Mei);
        tEntityHis.setInsertDt(this.insertDt);
        tEntityHis.setInsertBy(this.insertBy);
        tEntityHis.setUpdateDt(this.updateDt);
        tEntityHis.setUpdateBy(this.updateBy);
        tEntityHis.setDeleteF(this.deleteF);
        tEntityHis.insert(now, id);

        // エンティティテーブルの登録
        List<String> setList = new ArrayList<String>();
        setList.add("sosen_id = :sosen_id");
        setList.add("oya_sn = :oya_sn");
        setList.add("entity_sn = :entity_sn");
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

        String sql = "UPDATE t_entity\r\nSET\r\n      " + set + "\r\nWHERE\r\n    " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return 削除件数
     */
    public int delete() {

        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.delete();
            }
        }

        if (this.tEntity2 != null) {
            this.tEntity2.delete();
        }

        String sql = "DELETE FROM t_entity WHERE " + getWhere();

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
        params.put("sosen_id", this.sosenId);
        params.put("oya_sn", this.oyaSn);
        params.put("entity_sn", this.entitySn);
        params.put("entity_mei", this.entityMei);
        params.put("sansho1_id", this.sansho1Id);
        params.put("sansho1_mei", this.sansho1Mei);
        params.put("sansho2_id", this.sansho2Id);
        params.put("sansho2_mei", this.sansho2Mei);
        params.put("betsu_sansho1_id", this.betsuSansho1Id);
        params.put("betsu_sansho1_mei", this.betsuSansho1Mei);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }

    /**
     * エンティティ２
     */
    private TEntity2 tEntity2;

    /**
     * @return エンティティ２
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntity2")
    public TEntity2 getTEntity2() {
        return this.tEntity2;
    }

    /**
     * @param p エンティティ２
     */
    public void setTEntity2(final TEntity2 p) {
        this.tEntity2 = p;
    }

    /**
     * @return エンティティ２
     */
    public TEntity2 referTEntity2() {
        if (this.tEntity2 == null) {
            try {
                this.tEntity2 = TEntity2.get(this.sosenId, this.oyaSn, this.entitySn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tEntity2;
    }

    /**
     * 子のリスト
     */
    private List<TKo> tKos;

    /**
     * @return 子のリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TKos")
    public List<TKo> getTKos() {
        return this.tKos;
    }

    /**
     * @param list 子のリスト
     */
    public void setTKos(final List<TKo> list) {
        this.tKos = list;
    }

    /**
     * @return 子のリスト
     */
    public List<TKo> referTKos() {
        if (this.tKos == null) {
            this.tKos = TEntity.referTKos(this.sosenId, this.oyaSn, this.entitySn);
        }
        return this.tKos;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaSn
     * @param param3 entitySn
     * @return List<TKo>
     */
    public static List<TKo> referTKos(final Integer param1, final Integer param2, final Integer param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");

        String sql = "SELECT * FROM t_ko WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);
        params.put("entity_sn", param3);

        return Queries.select(sql, params, TKo.class);
    }
}
