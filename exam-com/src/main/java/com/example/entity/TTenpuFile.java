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
 * 添付ファイル
 *
 * @author emarfkrow
 */
public class TTenpuFile implements IEntity {

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
        if (!StringUtil.isNullOrBlank(o)) {
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
        if (!StringUtil.isNullOrBlank(o)) {
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.entitySn = Integer.valueOf(o.toString());
        } else {
            this.entitySn = null;
        }
    }

    /** 添付ファイル連番 */
    private Integer tenpuFileSn;

    /**
     * @return 添付ファイル連番
     */
    public Integer getTenpuFileSn() {
        return this.tenpuFileSn;
    }

    /**
     * @param o 添付ファイル連番
     */
    public void setTenpuFileSn(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.tenpuFileSn = Integer.valueOf(o.toString());
        } else {
            this.tenpuFileSn = null;
        }
    }

    /** 添付ファイル名 */
    private String tenpuFileMei;

    /**
     * @return 添付ファイル名
     */
    public String getTenpuFileMei() {
        return this.tenpuFileMei;
    }

    /**
     * @param o 添付ファイル名
     */
    public void setTenpuFileMei(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.tenpuFileMei = String.valueOf(o.toString());
        } else {
            this.tenpuFileMei = null;
        }
    }

    /** 添付ファイル */
    private String tenpuFile;

    /**
     * @return 添付ファイル
     */
    public String getTenpuFile() {
        return this.tenpuFile;
    }

    /**
     * @param o 添付ファイル
     */
    public void setTenpuFile(final Object o) {
        if (!StringUtil.isNullOrBlank(o)) {
            this.tenpuFile = String.valueOf(o.toString());
        } else {
            this.tenpuFile = null;
        }
    }

    /** 登録日時 */
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.insertBy = String.valueOf(o.toString());
        } else {
            this.insertBy = null;
        }
    }

    /** 更新日時 */
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
        if (!StringUtil.isNullOrBlank(o)) {
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
        if (!StringUtil.isNullOrBlank(o)) {
            this.deleteF = String.valueOf(o.toString());
        } else {
            this.deleteF = null;
        }
    }

    /**
     * 添付ファイル照会
     *
     * @param param1 祖先ID
     * @param param2 親連番
     * @param param3 エンティティ連番
     * @param param4 添付ファイル連番
     * @return 添付ファイル
     */
    public static TTenpuFile get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        whereList.add("tenpu_file_sn = :tenpu_file_sn");

        String sql = "SELECT * FROM t_tenpu_file WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", param1);
        params.put("oya_sn", param2);
        params.put("entity_sn", param3);
        params.put("tenpu_file_sn", param4);

        return Queries.get(sql, params, TTenpuFile.class);
    }

    /**
     * 添付ファイル追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 添付ファイル連番の採番処理
        numbering();

        // 添付ファイルの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sosen_id -- :sosen_id");
        nameList.add("oya_sn -- :oya_sn");
        nameList.add("entity_sn -- :entity_sn");
        nameList.add("tenpu_file_sn -- :tenpu_file_sn");
        nameList.add("tenpu_file_mei -- :tenpu_file_mei");
        nameList.add("tenpu_file -- :tenpu_file");
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
        valueList.add(":tenpu_file_sn");
        valueList.add(":tenpu_file_mei");
        valueList.add(":tenpu_file");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        String value = String.join("\r\n    , ", valueList);

        String sql = "INSERT INTO t_tenpu_file(\r\n      " + name + "\r\n) VALUES (\r\n      " + value + "\r\n); ";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /** 添付ファイル連番の採番処理 */
    private void numbering() {

        if (this.tenpuFileSn != null) {
            return;
        }

        String sql = "SELECT CASE WHEN MAX(e.TENPU_FILE_SN) IS NULL THEN 0 ELSE MAX(e.TENPU_FILE_SN) END + 1 AS TENPU_FILE_SN FROM t_tenpu_file e";

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
        Object o = mapList.get(0).get("TENPU_FILE_SN");

        this.setTenpuFileSn(o);
    }

    /**
     * 添付ファイル更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 添付ファイルの登録
        List<String> setList = new ArrayList<String>();
        setList.add("sosen_id = :sosen_id");
        setList.add("oya_sn = :oya_sn");
        setList.add("entity_sn = :entity_sn");
        setList.add("tenpu_file_sn = :tenpu_file_sn");
        setList.add("tenpu_file_mei = :tenpu_file_mei");
        setList.add("tenpu_file = :tenpu_file");
        setList.add("update_dt = :update_dt");
        setList.add("update_by = :update_by");
        setList.add("delete_f = :delete_f");
        String set = String.join("\r\n    , ", setList);

        String sql = "UPDATE t_tenpu_file\r\nSET\r\n      " + set + "\r\nWHERE\r\n    " + getWhere();

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    /**
     * 添付ファイル削除
     *
     * @return 削除件数
     */
    public int delete() {

        TTenpuFile tTenpuFile = TTenpuFile.get(this.sosenId, this.oyaSn, this.entitySn, this.tenpuFileSn);
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get(tTenpuFile.tenpuFile));
        } catch (Exception e) {
            throw new jp.co.golorp.emarf.exception.SysError(e);
        }

        // 添付ファイルの削除
        String sql = "DELETE FROM t_tenpu_file WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("sosen_id = :sosen_id");
        whereList.add("oya_sn = :oya_sn");
        whereList.add("entity_sn = :entity_sn");
        whereList.add("tenpu_file_sn = :tenpu_file_sn");
        whereList.add("update_dt = '" + this.updateDt + "'");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sosen_id", this.sosenId);
        params.put("oya_sn", this.oyaSn);
        params.put("entity_sn", this.entitySn);
        params.put("tenpu_file_sn", this.tenpuFileSn);
        params.put("tenpu_file_mei", this.tenpuFileMei);
        params.put("tenpu_file", this.tenpuFile);
        params.put("delete_f", this.deleteF);
        params.put("insert_dt", now);
        params.put("insert_by", id);
        params.put("update_dt", now);
        params.put("update_by", id);
        return params;
    }
}
