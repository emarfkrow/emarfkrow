package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_TEMP_ORDER_EST_FILE
 *
 * @author emarfkrow
 */
public class PchTempOrderEstFile implements IEntity {

    /** TEMP_ORDER_NO */
    private String tempOrderNo;

    /**
     * @return TEMP_ORDER_NO
     */
    public String getTempOrderNo() {
        return this.tempOrderNo;
    }

    /**
     * @param o TEMP_ORDER_NO
     */
    public void setTempOrderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempOrderNo = String.valueOf(o.toString());
        } else {
            this.tempOrderNo = null;
        }
    }

    /** EST_FILE_SEQ */
    private java.math.BigDecimal estFileSeq;

    /**
     * @return EST_FILE_SEQ
     */
    public java.math.BigDecimal getEstFileSeq() {
        return this.estFileSeq;
    }

    /**
     * @param o EST_FILE_SEQ
     */
    public void setEstFileSeq(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.estFileSeq = new java.math.BigDecimal(o.toString());
        } else {
            this.estFileSeq = null;
        }
    }

    /** UPLOAD_FILE_NM */
    private String uploadFileNm;

    /**
     * @return UPLOAD_FILE_NM
     */
    public String getUploadFileNm() {
        return this.uploadFileNm;
    }

    /**
     * @param o UPLOAD_FILE_NM
     */
    public void setUploadFileNm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.uploadFileNm = String.valueOf(o.toString());
        } else {
            this.uploadFileNm = null;
        }
    }

    /** SAVE_FILE_PATH */
    private String saveFilePath;

    /**
     * @return SAVE_FILE_PATH
     */
    public String getSaveFilePath() {
        return this.saveFilePath;
    }

    /**
     * @param o SAVE_FILE_PATH
     */
    public void setSaveFilePath(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.saveFilePath = String.valueOf(o.toString());
        } else {
            this.saveFilePath = null;
        }
    }

    /** TIME_STAMP_CREATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampCreate;

    /**
     * @return TIME_STAMP_CREATE
     */
    public java.time.LocalDateTime getTimeStampCreate() {
        return this.timeStampCreate;
    }

    /**
     * @param o TIME_STAMP_CREATE
     */
    public void setTimeStampCreate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampCreate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampCreate = null;
        }
    }

    /** TIME_STAMP_CHANGE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampChange;

    /**
     * @return TIME_STAMP_CHANGE
     */
    public java.time.LocalDateTime getTimeStampChange() {
        return this.timeStampChange;
    }

    /**
     * @param o TIME_STAMP_CHANGE
     */
    public void setTimeStampChange(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampChange = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampChange = null;
        }
    }

    /** USER_ID_CREATE */
    private String userIdCreate;

    /**
     * @return USER_ID_CREATE
     */
    public String getUserIdCreate() {
        return this.userIdCreate;
    }

    /**
     * @param o USER_ID_CREATE
     */
    public void setUserIdCreate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdCreate = String.valueOf(o.toString());
        } else {
            this.userIdCreate = null;
        }
    }

    /** USER_ID_CHANGE */
    private String userIdChange;

    /**
     * @return USER_ID_CHANGE
     */
    public String getUserIdChange() {
        return this.userIdChange;
    }

    /**
     * @param o USER_ID_CHANGE
     */
    public void setUserIdChange(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdChange = String.valueOf(o.toString());
        } else {
            this.userIdChange = null;
        }
    }

    /**
     * PCH_TEMP_ORDER_EST_FILE照会
     *
     * @param param1 TEMP_ORDER_NO
     * @param param2 EST_FILE_SEQ
     * @return PCH_TEMP_ORDER_EST_FILE
     */
    public static PchTempOrderEstFile get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"TEMP_ORDER_NO\") = TRIM (:temp_order_no)");
        whereList.add("\"EST_FILE_SEQ\" = :est_file_seq");

        String sql = "SELECT * FROM PCH_TEMP_ORDER_EST_FILE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("temp_order_no", param1);
        params.put("est_file_seq", param2);

        return Queries.get(sql, params, PchTempOrderEstFile.class);
    }

    /**
     * PCH_TEMP_ORDER_EST_FILE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PCH_TEMP_ORDER_EST_FILEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("temp_order_no -- :temp_order_no");
        nameList.add("est_file_seq -- :est_file_seq");
        nameList.add("upload_file_nm -- :upload_file_nm");
        nameList.add("save_file_path -- :save_file_path");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_TEMP_ORDER_EST_FILE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":temp_order_no");
        valueList.add(":est_file_seq");
        valueList.add(":upload_file_nm");
        valueList.add(":save_file_path");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * PCH_TEMP_ORDER_EST_FILE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_TEMP_ORDER_EST_FILEの登録
        String sql = "UPDATE PCH_TEMP_ORDER_EST_FILE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("temp_order_no = :temp_order_no");
        setList.add("est_file_seq = :est_file_seq");
        setList.add("upload_file_nm = :upload_file_nm");
        setList.add("save_file_path = :save_file_path");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_TEMP_ORDER_EST_FILE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_TEMP_ORDER_EST_FILEの削除
        String sql = "DELETE FROM PCH_TEMP_ORDER_EST_FILE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (temp_order_no) = TRIM (:temp_order_no)");
        whereList.add("est_file_seq = :est_file_seq");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("TEMP_ORDER_NO", this.tempOrderNo);
        params.put("EST_FILE_SEQ", this.estFileSeq);
        params.put("UPLOAD_FILE_NM", this.uploadFileNm);
        params.put("SAVE_FILE_PATH", this.saveFilePath);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
