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
 * m_ninka
 *
 * @author generator
 *
 */
public class MNinka implements IEntity {

    /**
     * 部署ID
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.bushoId = Integer.valueOf(o.toString());
        } else {
            this.bushoId = null;
        }
    }

    /**
     * 職位ID
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.shokuiId = Integer.valueOf(o.toString());
        } else {
            this.shokuiId = null;
        }
    }

    /**
     * 画面名
     */
    private String gamenNm;

    /**
     * @return 画面名
     */
    public String getGamenNm() {
        return this.gamenNm;
    }

    /**
     * @param o 画面名
     */
    public void setGamenNm(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.gamenNm = String.valueOf(o.toString());
        } else {
            this.gamenNm = null;
        }
    }

    /**
     * 権限区分
     */
    private String kengenKb;

    /**
     * @return 権限区分
     */
    public String getKengenKb() {
        return this.kengenKb;
    }

    /**
     * @param o 権限区分
     */
    public void setKengenKb(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.kengenKb = String.valueOf(o.toString());
        } else {
            this.kengenKb = null;
        }
    }

    /**
     * 開始日
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.kaishiYmd = String.valueOf(o.toString());
        } else {
            this.kaishiYmd = null;
        }
    }

    /**
     * 終了日
     */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.shuryoYmd = String.valueOf(o.toString());
        } else {
            this.shuryoYmd = null;
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
     * @param param1 bushoId
     * @param param2 shokuiId
     * @param param3 gamenNm
     * @return MNinka
     */
    public static MNinka get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("busho_id = :busho_id");
        whereList.add("shokui_id = :shokui_id");
        whereList.add("gamen_nm = :gamen_nm");

        String sql = "SELECT * FROM m_ninka WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("busho_id", param1);
        params.put("shokui_id", param2);
        params.put("gamen_nm", param3);

        return Queries.get(sql, params, MNinka.class);
    }

    /**
     * @param now
     * @param id
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 認可マスタテーブルの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("busho_id -- :busho_id");
        nameList.add("shokui_id -- :shokui_id");
        nameList.add("gamen_nm -- :gamen_nm");
        nameList.add("kengen_kb -- :kengen_kb");
        nameList.add("kaishi_ymd -- :kaishi_ymd");
        nameList.add("shuryo_ymd -- :shuryo_ymd");
        nameList.add("insert_dt -- :insert_dt");
        nameList.add("insert_by -- :insert_by");
        nameList.add("update_dt -- :update_dt");
        nameList.add("update_by -- :update_by");
        nameList.add("delete_f -- :delete_f");
        String name = String.join("\r\n    , ", nameList);

        List<String> valueList = new ArrayList<String>();
        valueList.add(":busho_id");
        valueList.add(":shokui_id");
        valueList.add(":gamen_nm");
        valueList.add(":kengen_kb");
        valueList.add(":kaishi_ymd");
        valueList.add(":shuryo_ymd");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        String value = String.join("\r\n    , ", valueList);

        String sql = "INSERT INTO m_ninka(\r\n      " + name + "\r\n) VALUES (\r\n      " + value + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @param now
     * @param id
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 認可マスタテーブルの登録
        List<String> setList = new ArrayList<String>();
        setList.add("busho_id = :busho_id");
        setList.add("shokui_id = :shokui_id");
        setList.add("gamen_nm = :gamen_nm");
        setList.add("kengen_kb = :kengen_kb");
        setList.add("kaishi_ymd = :kaishi_ymd");
        setList.add("shuryo_ymd = :shuryo_ymd");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);

        String sql = "UPDATE m_ninka\r\nSET\r\n      " + set + "\r\nWHERE\r\n    " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * @return 削除件数
     */
    public int delete() {

        String sql = "DELETE FROM m_ninka WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("busho_id = :busho_id");
        whereList.add("shokui_id = :shokui_id");
        whereList.add("gamen_nm = :gamen_nm");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("busho_id", this.bushoId);
        params.put("shokui_id", this.shokuiId);
        params.put("gamen_nm", this.gamenNm);
        params.put("kengen_kb", this.kengenKb);
        params.put("kaishi_ymd", this.kaishiYmd);
        params.put("shuryo_ymd", this.shuryoYmd);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
