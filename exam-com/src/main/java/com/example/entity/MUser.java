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
 * m_user
 *
 * @author generator
 *
 */
public class MUser implements IEntity {

    /**
     * ユーザID
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.userId = Integer.valueOf(o.toString());
        } else {
            this.userId = null;
        }
    }

    /**
     * ユーザ姓
     */
    private String userSei;

    /**
     * @return ユーザ姓
     */
    public String getUserSei() {
        return this.userSei;
    }

    /**
     * @param o ユーザ姓
     */
    public void setUserSei(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.userSei = String.valueOf(o.toString());
        } else {
            this.userSei = null;
        }
    }

    /**
     * ユーザ名
     */
    private String userMei;

    /**
     * @return ユーザ名
     */
    public String getUserMei() {
        return this.userMei;
    }

    /**
     * @param o ユーザ名
     */
    public void setUserMei(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.userMei = String.valueOf(o.toString());
        } else {
            this.userMei = null;
        }
    }

    /**
     * メールアドレス
     */
    private String email;

    /**
     * @return メールアドレス
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param o メールアドレス
     */
    public void setEmail(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.email = String.valueOf(o.toString());
        } else {
            this.email = null;
        }
    }

    /**
     * パスワード
     */
    private String password;

    /**
     * @return パスワード
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @param o パスワード
     */
    public void setPassword(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.password = String.valueOf(o.toString());
        } else {
            this.password = null;
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
     * @param param1 userId
     * @return MUser
     */
    public static MUser get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("user_id = :user_id");

        String sql = "SELECT * FROM m_user WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("user_id", param1);

        return Queries.get(sql, params, MUser.class);
    }

    /**
     * @param now
     * @param id
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 採番処理
        numbering();

        // ユーザマスタテーブルの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("user_id -- :user_id");
        nameList.add("user_sei -- :user_sei");
        nameList.add("user_mei -- :user_mei");
        nameList.add("email -- :email");
        nameList.add("password -- :password");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        List<String> valueList = new ArrayList<String>();
        valueList.add(":user_id");
        valueList.add(":user_sei");
        valueList.add(":user_mei");
        valueList.add(":email");
        valueList.add(":password");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        String value = String.join("\r\n    , ", valueList);

        String sql = "INSERT INTO m_user(\r\n      " + name + "\r\n) VALUES (\r\n      " + value + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     *
     */
    protected void numbering() {

        if (this.userId != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.USER_ID) IS NULL THEN 0 ELSE MAX(e.USER_ID) END + 1 AS USER_ID FROM m_user e";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("USER_ID");

        this.setUserId(o);
    }

    /**
     * @param now
     * @param id
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // ユーザマスタテーブルの登録
        List<String> setList = new ArrayList<String>();
        setList.add("user_id = :user_id");
        setList.add("user_sei = :user_sei");
        setList.add("user_mei = :user_mei");
        setList.add("email = :email");
        setList.add("password = :password");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);

        String sql = "UPDATE m_user\r\nSET\r\n      " + set + "\r\nWHERE\r\n    " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return 削除件数
     */
    public int delete() {

        String sql = "DELETE FROM m_user WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("user_id = :user_id");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("user_id", this.userId);
        params.put("user_sei", this.userSei);
        params.put("user_mei", this.userMei);
        params.put("email", this.email);
        params.put("password", this.password);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
