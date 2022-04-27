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
 * t_sosen
 *
 * @author generator
 *
 */
public class TSosen implements IEntity {

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
     * 祖先名
     */
    private String sosenMei;

    /**
     * @return 祖先名
     */
    public String getSosenMei() {
        return this.sosenMei;
    }

    /**
     * @param o 祖先名
     */
    public void setSosenMei(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.sosenMei = String.valueOf(o.toString());
        } else {
            this.sosenMei = null;
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
     * @return TSosen
     */
    public static TSosen get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");

        String sql = "SELECT * FROM t_sosen WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);

        return Queries.get(sql, params, TSosen.class);
    }

    /**
     * @param now
     * @param id
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 採番処理
        numbering();

        // 親テーブルの登録
        if (this.tOyas != null) {
            for (TOya tOya : this.tOyas) {
                tOya.setSosenId(this.getSosenId());
                tOya.insert(now, id);
            }
        }

        // 祖先テーブルの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sosen_id -- :sosen_id");
        nameList.add("sosen_mei -- :sosen_mei");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n, ", nameList);

        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":sosen_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        String value = String.join("\r\n, ", valueList);

        String sql = "INSERT INTO t_sosen(\r\n" + name + "\r\n) VALUES (\r\n" + value + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     *
     */
    protected void numbering() {

        if (this.sosenId != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.SOSEN_ID) IS NULL THEN 0 ELSE MAX(e.SOSEN_ID) END + 1 AS SOSEN_ID FROM t_sosen e";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SOSEN_ID");

        this.setSosenId(o);
    }

    /**
     * @param now
     * @param id
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 親テーブルの登録
        if (this.tOyas != null) {
            for (TOya tOya : this.tOyas) {
                tOya.setSosenId(this.sosenId);
                try {
                    tOya.insert(now, id);
                } catch (Exception e) {
                    tOya.update(now, id);
                }
            }
            this.tOyas = null;
            this.getTOyas();
            if (this.tOyas != null) {
                for (TOya tOya : this.tOyas) {
                    if (!tOya.getUpdateDt().equals(now)) {
                        tOya.delete();
                    }
                }
            }
        }

        // 祖先テーブルの登録
        List<String> setList = new ArrayList<String>();
        setList.add("sosen_id = :sosen_id");
        setList.add("sosen_mei = :sosen_mei");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join(", ", setList);

        String sql = "UPDATE t_sosen SET " + set + " WHERE " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return 削除件数
     */
    public int delete() {

        if (this.tOyas != null) {
            for (TOya tOya : this.tOyas) {
                tOya.delete();
            }
        }

        String sql = "DELETE FROM t_entity WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", this.sosenId);
        params.put("sosen_mei", this.sosenMei);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }

    /**
     * 親のリスト
     */
    private List<TOya> tOyas;

    /**
     * @return 親のリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOyas")
    public List<TOya> getTOyas() {
        return this.tOyas;
    }

    /**
     * @param list 親のリスト
     */
    public void setTOyas(final List<TOya> list) {
        this.tOyas = list;
    }

    /**
     * @return 親のリスト
     */
    public List<TOya> referTOyas() {
        if (this.tOyas == null) {
            this.tOyas = TSosen.referTOyas(this.sosenId);
        }
        return this.tOyas;
    }

    /**
     * @param param1 sosenId
     * @return List<TOya>
     */
    public static List<TOya> referTOyas(final Integer param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");

        String sql = "SELECT * FROM t_oya WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);

        return Queries.select(sql, params, TOya.class);
    }
}
