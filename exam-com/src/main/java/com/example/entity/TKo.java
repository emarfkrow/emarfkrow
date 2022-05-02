package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 子
 *
 * @author emarfkrow
 */
public class TKo implements IEntity {

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

    /** 子連番 */
    private Integer koSn;

    /**
     * @return 子連番
     */
    public Integer getKoSn() {
        return this.koSn;
    }

    /**
     * @param o 子連番
     */
    public void setKoSn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koSn = Integer.valueOf(o.toString());
        } else {
            this.koSn = null;
        }
    }

    /** 子名 */
    private String koMei;

    /**
     * @return 子名
     */
    public String getKoMei() {
        return this.koMei;
    }

    /**
     * @param o 子名
     */
    public void setKoMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koMei = String.valueOf(o.toString());
        } else {
            this.koMei = null;
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
     * 子照会
     *
     * @param param1 祖先ID
     * @param param2 親連番
     * @param param3 エンティティ連番
     * @param param4 子連番
     * @return 子
     */
    public static TKo get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        whereList.add("ko_sn = :ko_sn");

        String sql = "SELECT * FROM t_ko WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);
        params.put("entity_sn", param3);
        params.put("ko_sn", param4);

        return Queries.get(sql, params, TKo.class);
    }

    /**
     * 子追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 子連番の採番処理
        numbering();

        // 子孫の登録
        if (this.tShisons != null) {
            for (TShison tShison : this.tShisons) {
                tShison.setSosenId(this.getSosenId());
                tShison.setOyaSn(this.getOyaSn());
                tShison.setEntitySn(this.getEntitySn());
                tShison.setKoSn(this.getKoSn());
                tShison.insert(now, id);
            }
        }

        // 子の登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sosen_id -- :sosen_id");
        nameList.add("oya_sn -- :oya_sn");
        nameList.add("entity_sn -- :entity_sn");
        nameList.add("ko_sn -- :ko_sn");
        nameList.add("ko_mei -- :ko_mei");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO t_ko(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_sn");
        valueList.add(":entity_sn");
        valueList.add(":ko_sn");
        valueList.add(":ko_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** 子連番の採番処理 */
    private void numbering() {

        if (this.koSn != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.KO_SN) IS NULL THEN 0 ELSE MAX(e.KO_SN) END + 1 AS KO_SN FROM t_ko e";

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
        Object o = mapList.get(0).get("KO_SN");

        this.setKoSn(o);
    }

    /**
     * 子更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 子孫の登録
        if (this.tShisons != null) {
            for (TShison tShison : this.tShisons) {
                tShison.setSosenId(this.sosenId);
                tShison.setOyaSn(this.oyaSn);
                tShison.setEntitySn(this.entitySn);
                tShison.setKoSn(this.koSn);
                try {
                    tShison.insert(now, id);
                } catch (Exception e) {
                    tShison.update(now, id);
                }
            }
            this.tShisons = null;
            this.referTShisons();
            if (this.tShisons != null) {
                for (TShison tShison : this.tShisons) {
                    if (!tShison.getUpdateDt().equals(now)) {
                        tShison.delete();
                    }
                }
            }
        }

        String sql = "UPDATE t_ko\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("sosen_id = :sosen_id");
        setList.add("oya_sn = :oya_sn");
        setList.add("entity_sn = :entity_sn");
        setList.add("ko_sn = :ko_sn");
        setList.add("ko_mei = :ko_mei");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 子削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 子孫の削除
        if (this.tShisons != null) {
            for (TShison tShison : this.tShisons) {
                tShison.delete();
            }
        }

        // 子の削除
        String sql = "DELETE FROM t_ko WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        whereList.add("ko_sn = :ko_sn");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SOSEN_ID", this.sosenId);
        params.put("OYA_SN", this.oyaSn);
        params.put("ENTITY_SN", this.entitySn);
        params.put("KO_SN", this.koSn);
        params.put("KO_MEI", this.koMei);
        params.put("DELETE_F", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }

    /**
     * 子孫のリスト
     */
    private List<TShison> tShisons;

    /**
     * @return 子孫のリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TShisons")
    public List<TShison> getTShisons() {
        return this.tShisons;
    }

    /**
     * @param list 子孫のリスト
     */
    public void setTShisons(final List<TShison> list) {
        this.tShisons = list;
    }

    /**
     * @param tShison
     */
    public void addTShisons(final TShison tShison) {
        if (this.tShisons == null) {
            this.tShisons = new ArrayList<TShison>();
        }
        this.tShisons.add(tShison);
    }

    /**
     * @return 子孫のリスト
     */
    public List<TShison> referTShisons() {
        if (this.tShisons == null) {
            this.tShisons = TKo.referTShisons(this.sosenId, this.oyaSn, this.entitySn, this.koSn);
        }
        return this.tShisons;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaSn
     * @param param3 entitySn
     * @param param4 koSn
     * @return List<TShison>
     */
    public static List<TShison> referTShisons(final Integer param1, final Integer param2, final Integer param3, final Integer param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        whereList.add("ko_sn = :ko_sn");

        String sql = "SELECT * FROM t_shison WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);
        params.put("entity_sn", param3);
        params.put("ko_sn", param4);

        return Queries.select(sql, params, TShison.class);
    }
}
