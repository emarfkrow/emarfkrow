package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_TEMP_SUPPLIER
 *
 * @author emarfkrow
 */
public class MstTempSupplier implements IEntity {

    /** TEMP_SUP_CODE */
    private String tempSupCode;

    /**
     * @return TEMP_SUP_CODE
     */
    public String getTempSupCode() {
        return this.tempSupCode;
    }

    /**
     * @param o TEMP_SUP_CODE
     */
    public void setTempSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempSupCode = String.valueOf(o.toString());
        } else {
            this.tempSupCode = null;
        }
    }

    /** TEMP_SUP_NAME */
    private String tempSupName;

    /**
     * @return TEMP_SUP_NAME
     */
    public String getTempSupName() {
        return this.tempSupName;
    }

    /**
     * @param o TEMP_SUP_NAME
     */
    public void setTempSupName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempSupName = String.valueOf(o.toString());
        } else {
            this.tempSupName = null;
        }
    }

    /** TEMP_SUP_STAFF_NAME */
    private String tempSupStaffName;

    /**
     * @return TEMP_SUP_STAFF_NAME
     */
    public String getTempSupStaffName() {
        return this.tempSupStaffName;
    }

    /**
     * @param o TEMP_SUP_STAFF_NAME
     */
    public void setTempSupStaffName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempSupStaffName = String.valueOf(o.toString());
        } else {
            this.tempSupStaffName = null;
        }
    }

    /** TEMP_SUP_TEL_NO */
    private String tempSupTelNo;

    /**
     * @return TEMP_SUP_TEL_NO
     */
    public String getTempSupTelNo() {
        return this.tempSupTelNo;
    }

    /**
     * @param o TEMP_SUP_TEL_NO
     */
    public void setTempSupTelNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempSupTelNo = String.valueOf(o.toString());
        } else {
            this.tempSupTelNo = null;
        }
    }

    /** TEMP_SUP_FAX_NO */
    private String tempSupFaxNo;

    /**
     * @return TEMP_SUP_FAX_NO
     */
    public String getTempSupFaxNo() {
        return this.tempSupFaxNo;
    }

    /**
     * @param o TEMP_SUP_FAX_NO
     */
    public void setTempSupFaxNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempSupFaxNo = String.valueOf(o.toString());
        } else {
            this.tempSupFaxNo = null;
        }
    }

    /** TEMP_SUP_DIV_CODE */
    private String tempSupDivCode;

    /**
     * @return TEMP_SUP_DIV_CODE
     */
    public String getTempSupDivCode() {
        return this.tempSupDivCode;
    }

    /**
     * @param o TEMP_SUP_DIV_CODE
     */
    public void setTempSupDivCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempSupDivCode = String.valueOf(o.toString());
        } else {
            this.tempSupDivCode = null;
        }
    }

    /** TEMP_KOZA_NO */
    private String tempKozaNo;

    /**
     * @return TEMP_KOZA_NO
     */
    public String getTempKozaNo() {
        return this.tempKozaNo;
    }

    /**
     * @param o TEMP_KOZA_NO
     */
    public void setTempKozaNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempKozaNo = String.valueOf(o.toString());
        } else {
            this.tempKozaNo = null;
        }
    }

    /** TEMP_KOZA_MEIGI */
    private String tempKozaMeigi;

    /**
     * @return TEMP_KOZA_MEIGI
     */
    public String getTempKozaMeigi() {
        return this.tempKozaMeigi;
    }

    /**
     * @param o TEMP_KOZA_MEIGI
     */
    public void setTempKozaMeigi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempKozaMeigi = String.valueOf(o.toString());
        } else {
            this.tempKozaMeigi = null;
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
     * MST_TEMP_SUPPLIER照会
     *
     * @param param1 TEMP_SUP_CODE
     * @return MST_TEMP_SUPPLIER
     */
    public static MstTempSupplier get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TEMP_SUP_CODE\" = :temp_sup_code");

        String sql = "SELECT * FROM MST_TEMP_SUPPLIER WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("temp_sup_code", param1);

        return Queries.get(sql, params, MstTempSupplier.class);
    }

    /**
     * MST_TEMP_SUPPLIER追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_TEMP_SUPPLIERの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"TEMP_SUP_CODE\" -- :temp_sup_code");
        nameList.add("\"TEMP_SUP_NAME\" -- :temp_sup_name");
        nameList.add("\"TEMP_SUP_STAFF_NAME\" -- :temp_sup_staff_name");
        nameList.add("\"TEMP_SUP_TEL_NO\" -- :temp_sup_tel_no");
        nameList.add("\"TEMP_SUP_FAX_NO\" -- :temp_sup_fax_no");
        nameList.add("\"TEMP_SUP_DIV_CODE\" -- :temp_sup_div_code");
        nameList.add("\"TEMP_KOZA_NO\" -- :temp_koza_no");
        nameList.add("\"TEMP_KOZA_MEIGI\" -- :temp_koza_meigi");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_TEMP_SUPPLIER(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":temp_sup_code");
        valueList.add(":temp_sup_name");
        valueList.add(":temp_sup_staff_name");
        valueList.add(":temp_sup_tel_no");
        valueList.add(":temp_sup_fax_no");
        valueList.add(":temp_sup_div_code");
        valueList.add(":temp_koza_no");
        valueList.add(":temp_koza_meigi");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_TEMP_SUPPLIER更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_TEMP_SUPPLIERの登録
        String sql = "UPDATE MST_TEMP_SUPPLIER\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"TEMP_SUP_CODE\" = :temp_sup_code");
        setList.add("\"TEMP_SUP_NAME\" = :temp_sup_name");
        setList.add("\"TEMP_SUP_STAFF_NAME\" = :temp_sup_staff_name");
        setList.add("\"TEMP_SUP_TEL_NO\" = :temp_sup_tel_no");
        setList.add("\"TEMP_SUP_FAX_NO\" = :temp_sup_fax_no");
        setList.add("\"TEMP_SUP_DIV_CODE\" = :temp_sup_div_code");
        setList.add("\"TEMP_KOZA_NO\" = :temp_koza_no");
        setList.add("\"TEMP_KOZA_MEIGI\" = :temp_koza_meigi");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_TEMP_SUPPLIER削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_TEMP_SUPPLIERの削除
        String sql = "DELETE FROM MST_TEMP_SUPPLIER WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TEMP_SUP_CODE\" = :temp_sup_code");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("temp_sup_code", this.tempSupCode);
        params.put("temp_sup_name", this.tempSupName);
        params.put("temp_sup_staff_name", this.tempSupStaffName);
        params.put("temp_sup_tel_no", this.tempSupTelNo);
        params.put("temp_sup_fax_no", this.tempSupFaxNo);
        params.put("temp_sup_div_code", this.tempSupDivCode);
        params.put("temp_koza_no", this.tempKozaNo);
        params.put("temp_koza_meigi", this.tempKozaMeigi);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
