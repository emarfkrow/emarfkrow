package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * エンティティ
 * @author emarfkrow
 */
public class TEntity implements IEntity {

    /** 祖先ID */
    private Integer sosenId;

    /** @return 祖先ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SOSEN_ID")
    public Integer getSosenId() {
        return this.sosenId;
    }

    /** @param o 祖先ID */
    public void setSosenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sosenId = Integer.valueOf(o.toString());
        } else {
            this.sosenId = null;
        }
    }

    /** 親連番 */
    private Integer oyaSn;

    /** @return 親連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_SN")
    public Integer getOyaSn() {
        return this.oyaSn;
    }

    /** @param o 親連番 */
    public void setOyaSn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaSn = Integer.valueOf(o.toString());
        } else {
            this.oyaSn = null;
        }
    }

    /** エンティティ連番 */
    private Integer entitySn;

    /** @return エンティティ連番 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_SN")
    public Integer getEntitySn() {
        return this.entitySn;
    }

    /** @param o エンティティ連番 */
    public void setEntitySn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entitySn = Integer.valueOf(o.toString());
        } else {
            this.entitySn = null;
        }
    }

    /** エンティティ名 */
    private String entityMei;

    /** @return エンティティ名 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_MEI")
    public String getEntityMei() {
        return this.entityMei;
    }

    /** @param o エンティティ名 */
    public void setEntityMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entityMei = String.valueOf(o.toString());
        } else {
            this.entityMei = null;
        }
    }

    /** 参照１ID */
    private Integer sansho1Id;

    /** @return 参照１ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO1_ID")
    public Integer getSansho1Id() {
        return this.sansho1Id;
    }

    /** @param o 参照１ID */
    public void setSansho1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho1Id = Integer.valueOf(o.toString());
        } else {
            this.sansho1Id = null;
        }
    }

    /** 参照１名 */
    private String sansho1Mei;

    /** @return 参照１名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO1_MEI")
    public String getSansho1Mei() {
        return this.sansho1Mei;
    }

    /** @param o 参照１名 */
    public void setSansho1Mei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho1Mei = String.valueOf(o.toString());
        } else {
            this.sansho1Mei = null;
        }
    }

    /** 参照２ID */
    private Integer sansho2Id;

    /** @return 参照２ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO2_ID")
    public Integer getSansho2Id() {
        return this.sansho2Id;
    }

    /** @param o 参照２ID */
    public void setSansho2Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho2Id = Integer.valueOf(o.toString());
        } else {
            this.sansho2Id = null;
        }
    }

    /** 参照２名 */
    private String sansho2Mei;

    /** @return 参照２名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO2_MEI")
    public String getSansho2Mei() {
        return this.sansho2Mei;
    }

    /** @param o 参照２名 */
    public void setSansho2Mei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho2Mei = String.valueOf(o.toString());
        } else {
            this.sansho2Mei = null;
        }
    }

    /** 別参照１ID */
    private Integer betsuSansho1Id;

    /** @return 別参照１ID */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_SANSHO1_ID")
    public Integer getBetsuSansho1Id() {
        return this.betsuSansho1Id;
    }

    /** @param o 別参照１ID */
    public void setBetsuSansho1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.betsuSansho1Id = Integer.valueOf(o.toString());
        } else {
            this.betsuSansho1Id = null;
        }
    }

    /** 別参照１名 */
    private String betsuSansho1Mei;

    /** @return 別参照１名 */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_SANSHO1_MEI")
    public String getBetsuSansho1Mei() {
        return this.betsuSansho1Mei;
    }

    /** @param o 別参照１名 */
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
     * エンティティ照会
     * @param param1 祖先ID
     * @param param2 親連番
     * @param param3 エンティティ連番
     * @return エンティティ
     */
    public static TEntity get(final Object param1, final Object param2, final Object param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        whereList.add("`ENTITY_SN` = :entity_sn");
        String sql = "SELECT * FROM t_entity WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        map.put("entity_sn", param3);
        return Queries.get(sql, map, TEntity.class);
    }

    /**
     * エンティティ追加
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // エンティティ連番の採番処理
        numbering();

        // 子の登録
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.setSosenId(this.getSosenId());
                tKo.setOyaSn(this.getOyaSn());
                tKo.setEntitySn(this.getEntitySn());
                tKo.insert(now, id);
            }
        }

        // 添付ファイルの登録
        if (this.tTenpuFiles != null) {
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                tTenpuFile.setSosenId(this.getSosenId());
                tTenpuFile.setOyaSn(this.getOyaSn());
                tTenpuFile.setEntitySn(this.getEntitySn());
                tTenpuFile.insert(now, id);
            }
        }

        // エンティティ２の登録
        if (this.tEntity2 != null) {
            this.tEntity2.setSosenId(this.getSosenId());
            this.tEntity2.setOyaSn(this.getOyaSn());
            this.tEntity2.setEntitySn(this.getEntitySn());
            this.tEntity2.insert(now, id);
        }

        // エンティティ履歴の登録
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

        // エンティティの登録
        String sql = "INSERT INTO t_entity(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, id));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_SN` -- :oya_sn");
        nameList.add("`ENTITY_SN` -- :entity_sn");
        nameList.add("`ENTITY_MEI` -- :entity_mei");
        nameList.add("`SANSHO1_ID` -- :sansho1_id");
        nameList.add("`SANSHO1_MEI` -- :sansho1_mei");
        nameList.add("`SANSHO2_ID` -- :sansho2_id");
        nameList.add("`SANSHO2_MEI` -- :sansho2_mei");
        nameList.add("`BETSU_SANSHO1_ID` -- :betsu_sansho1_id");
        nameList.add("`BETSU_SANSHO1_MEI` -- :betsu_sansho1_mei");
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
        return String.join("\r\n    , ", valueList);
    }

    /** エンティティ連番の採番処理 */
    private void numbering() {
        if (this.entitySn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`ENTITY_SN`) IS NULL THEN 0 ELSE MAX(e.`ENTITY_SN`) * 1 END + 1 AS `ENTITY_SN` FROM t_entity e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        whereList.add("e.`OYA_SN` = :oya_sn");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        map.put("oya_sn", this.oyaSn);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map);
        Object o = mapList.get(0).get("ENTITY_SN");
        this.setEntitySn(o);
    }

    /**
     * エンティティ更新
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 子の登録
        if (this.tKos != null) {
            Queries.regist("DELETE FROM t_ko WHERE `SOSEN_ID` = :sosen_id AND `OYA_SN` = :oya_sn AND `ENTITY_SN` = :entity_sn AND `KO_SN` = :ko_sn", toMap(now, id));
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
        }

        // 添付ファイルの登録
        if (this.tTenpuFiles != null) {
            Queries.regist("DELETE FROM t_tenpu_file WHERE `SOSEN_ID` = :sosen_id AND `OYA_SN` = :oya_sn AND `ENTITY_SN` = :entity_sn AND `TENPU_FILE_SN` = :tenpu_file_sn", toMap(now, id));
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                tTenpuFile.setSosenId(this.sosenId);
                tTenpuFile.setOyaSn(this.oyaSn);
                tTenpuFile.setEntitySn(this.entitySn);
                try {
                    tTenpuFile.insert(now, id);
                } catch (Exception e) {
                    tTenpuFile.update(now, id);
                }
            }
        }

        // エンティティ２の登録
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

        // エンティティ履歴の登録
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

        // エンティティの登録
        String sql = "UPDATE t_entity\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, id));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_SN` = :oya_sn");
        setList.add("`ENTITY_SN` = :entity_sn");
        setList.add("`ENTITY_MEI` = :entity_mei");
        setList.add("`SANSHO1_ID` = :sansho1_id");
        setList.add("`SANSHO1_MEI` = :sansho1_mei");
        setList.add("`SANSHO2_ID` = :sansho2_id");
        setList.add("`SANSHO2_MEI` = :sansho2_mei");
        setList.add("`BETSU_SANSHO1_ID` = :betsu_sansho1_id");
        setList.add("`BETSU_SANSHO1_MEI` = :betsu_sansho1_mei");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * エンティティ削除
     * @return 削除件数
     */
    public int delete() {

        // 子の削除
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.delete();
            }
        }

        // 添付ファイルの削除
        if (this.tTenpuFiles != null) {
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                tTenpuFile.delete();
            }
        }

        // エンティティ２の削除
        if (this.tEntity2 != null) {
            this.tEntity2.delete();
        }

        // エンティティの削除
        String sql = "DELETE FROM t_entity WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_SN` = :oya_sn");
        whereList.add("`ENTITY_SN` = :entity_sn");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param id 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", this.sosenId);
        map.put("oya_sn", this.oyaSn);
        map.put("entity_sn", this.entitySn);
        map.put("entity_mei", this.entityMei);
        map.put("sansho1_id", this.sansho1Id);
        map.put("sansho1_mei", this.sansho1Mei);
        map.put("sansho2_id", this.sansho2Id);
        map.put("sansho2_mei", this.sansho2Mei);
        map.put("betsu_sansho1_id", this.betsuSansho1Id);
        map.put("betsu_sansho1_mei", this.betsuSansho1Mei);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", id);
        map.put("update_dt", now);
        map.put("update_by", id);
        return map;
    }

    /** エンティティ２ */
    private TEntity2 tEntity2;

    /** @return エンティティ２ */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntity2")
    public TEntity2 getTEntity2() {
        return this.tEntity2;
    }

    /** @param p エンティティ２ */
    public void setTEntity2(final TEntity2 p) {
        this.tEntity2 = p;
    }

    /** @return エンティティ２ */
    public TEntity2 referTEntity2() {
        if (this.tEntity2 == null) {
            try {
                this.tEntity2 = TEntity2.get(this.sosenId, this.oyaSn, this.entitySn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tEntity2;
    }

    /** 子のリスト */
    private List<TKo> tKos;

    /** @return 子のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("TKos")
    public List<TKo> getTKos() {
        return this.tKos;
    }

    /** @param list 子のリスト */
    public void setTKos(final List<TKo> list) {
        this.tKos = list;
    }

    /** @param tKo */
    public void addTKos(final TKo tKo) {
        if (this.tKos == null) {
            this.tKos = new ArrayList<TKo>();
        }
        this.tKos.add(tKo);
    }

    /** @return 子のリスト */
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
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        map.put("entity_sn", param3);
        return Queries.select(sql, map, TKo.class);
    }

    /** 添付ファイルのリスト */
    private List<TTenpuFile> tTenpuFiles;

    /** @return 添付ファイルのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("TTenpuFiles")
    public List<TTenpuFile> getTTenpuFiles() {
        return this.tTenpuFiles;
    }

    /** @param list 添付ファイルのリスト */
    public void setTTenpuFiles(final List<TTenpuFile> list) {
        this.tTenpuFiles = list;
    }

    /** @param tTenpuFile */
    public void addTTenpuFiles(final TTenpuFile tTenpuFile) {
        if (this.tTenpuFiles == null) {
            this.tTenpuFiles = new ArrayList<TTenpuFile>();
        }
        this.tTenpuFiles.add(tTenpuFile);
    }

    /** @return 添付ファイルのリスト */
    public List<TTenpuFile> referTTenpuFiles() {
        if (this.tTenpuFiles == null) {
            this.tTenpuFiles = TEntity.referTTenpuFiles(this.sosenId, this.oyaSn, this.entitySn);
        }
        return this.tTenpuFiles;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaSn
     * @param param3 entitySn
     * @return List<TTenpuFile>
     */
    public static List<TTenpuFile> referTTenpuFiles(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        String sql = "SELECT * FROM t_tenpu_file WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_sn", param2);
        map.put("entity_sn", param3);
        return Queries.select(sql, map, TTenpuFile.class);
    }
}
