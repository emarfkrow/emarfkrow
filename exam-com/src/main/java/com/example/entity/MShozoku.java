package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 所属マスタ
 *
 * @author emarfkrow
 */
public class MShozoku implements IEntity {

    /** 部署ID */
    private Integer bushoId;

    /**
     * @return 部署ID
     */
    public Integer getBushoId() {
        return this.bushoId;
    }

    /**
     * @param o 部署ID
     */
    public void setBushoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bushoId = Integer.valueOf(o.toString());
        } else {
            this.bushoId = null;
        }
    }

    /** 職位ID */
    private Integer shokuiId;

    /**
     * @return 職位ID
     */
    public Integer getShokuiId() {
        return this.shokuiId;
    }

    /**
     * @param o 職位ID
     */
    public void setShokuiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shokuiId = Integer.valueOf(o.toString());
        } else {
            this.shokuiId = null;
        }
    }

    /** ユーザID */
    private Integer userId;

    /**
     * @return ユーザID
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * @param o ユーザID
     */
    public void setUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userId = Integer.valueOf(o.toString());
        } else {
            this.userId = null;
        }
    }

    /** 開始日 */
    private String kaishiYmd;

    /**
     * @return 開始日
     */
    public String getKaishiYmd() {
        return this.kaishiYmd;
    }

    /**
     * @param o 開始日
     */
    public void setKaishiYmd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaishiYmd = String.valueOf(o.toString());
        } else {
            this.kaishiYmd = null;
        }
    }

    /** 終了日 */
    private String shuryoYmd;

    /**
     * @return 終了日
     */
    public String getShuryoYmd() {
        return this.shuryoYmd;
    }

    /**
     * @param o 終了日
     */
    public void setShuryoYmd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuryoYmd = String.valueOf(o.toString());
        } else {
            this.shuryoYmd = null;
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
     * 所属マスタ照会
     *
     * @param param1 部署ID
     * @param param2 職位ID
     * @param param3 ユーザID
     * @return 所属マスタ
     */
    public static MShozoku get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("busho_id = :busho_id");
        whereList.add("shokui_id = :shokui_id");
        whereList.add("user_id = :user_id");

        String sql = "SELECT * FROM m_shozoku WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("busho_id", param1);
        params.put("shokui_id", param2);
        params.put("user_id", param3);

        return Queries.get(sql, params, MShozoku.class);
    }

    /**
     * 所属マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // ユーザIDの採番処理
        numbering();

        // 所属マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("busho_id -- :busho_id");
        nameList.add("shokui_id -- :shokui_id");
        nameList.add("user_id -- :user_id");
        nameList.add("kaishi_ymd -- :kaishi_ymd");
        nameList.add("shuryo_ymd -- :shuryo_ymd");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO m_shozoku(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":busho_id");
        valueList.add(":shokui_id");
        valueList.add(":user_id");
        valueList.add(":kaishi_ymd");
        valueList.add(":shuryo_ymd");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** ユーザIDの採番処理 */
    private void numbering() {

        if (this.userId != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.USER_ID) IS NULL THEN 0 ELSE MAX(e.USER_ID) * 1 END + 1 AS USER_ID FROM m_shozoku e";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.BUSHO_ID = :busho_id");
        whereList.add("e.SHOKUI_ID = :shokui_id");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("bushoId", this.bushoId);
        params.put("shokuiId", this.shokuiId);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("USER_ID");

        this.setUserId(o);
    }

    /**
     * 所属マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 所属マスタの登録
        String sql = "UPDATE m_shozoku\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("busho_id = :busho_id");
        setList.add("shokui_id = :shokui_id");
        setList.add("user_id = :user_id");
        setList.add("kaishi_ymd = :kaishi_ymd");
        setList.add("shuryo_ymd = :shuryo_ymd");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 所属マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 所属マスタの削除
        String sql = "DELETE FROM m_shozoku WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("busho_id = :busho_id");
        whereList.add("shokui_id = :shokui_id");
        whereList.add("user_id = :user_id");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("BUSHO_ID", this.bushoId);
        params.put("SHOKUI_ID", this.shokuiId);
        params.put("USER_ID", this.userId);
        params.put("KAISHI_YMD", this.kaishiYmd);
        params.put("SHURYO_YMD", this.shuryoYmd);
        params.put("DELETE_F", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
