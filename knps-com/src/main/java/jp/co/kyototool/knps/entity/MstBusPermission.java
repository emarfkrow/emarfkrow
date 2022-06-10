package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_BUS_PERMISSION
 *
 * @author emarfkrow
 */
public class MstBusPermission implements IEntity {

    /** COMP_CODE */
    private java.math.BigDecimal compCode;

    /**
     * @return COMP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMP_CODE")
    public java.math.BigDecimal getCompCode() {
        return this.compCode;
    }

    /**
     * @param o COMP_CODE
     */
    public void setCompCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.compCode = new java.math.BigDecimal(o.toString());
        } else {
            this.compCode = null;
        }
    }

    /** BUSINESS_NO */
    private java.math.BigDecimal businessNo;

    /**
     * @return BUSINESS_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BUSINESS_NO")
    public java.math.BigDecimal getBusinessNo() {
        return this.businessNo;
    }

    /**
     * @param o BUSINESS_NO
     */
    public void setBusinessNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.businessNo = new java.math.BigDecimal(o.toString());
        } else {
            this.businessNo = null;
        }
    }

    /** PERMISSION */
    private java.math.BigDecimal permission;

    /**
     * @return PERMISSION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PERMISSION")
    public java.math.BigDecimal getPermission() {
        return this.permission;
    }

    /**
     * @param o PERMISSION
     */
    public void setPermission(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.permission = new java.math.BigDecimal(o.toString());
        } else {
            this.permission = null;
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CHANGE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CHANGE")
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag = new java.math.BigDecimal(0);

    /**
     * @return DELETE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_FLAG")
    public java.math.BigDecimal getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * @param o DELETE_FLAG
     */
    public void setDeleteFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.deleteFlag = null;
        }
    }

    /**
     * MST_BUS_PERMISSION照会
     *
     * @param param1 COMP_CODE
     * @param param2 BUSINESS_NO
     * @return MST_BUS_PERMISSION
     */
    public static MstBusPermission get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"COMP_CODE\" = :comp_code");
        whereList.add("\"BUSINESS_NO\" = :business_no");

        String sql = "SELECT * FROM MST_BUS_PERMISSION WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("comp_code", param1);
        params.put("business_no", param2);

        return Queries.get(sql, params, MstBusPermission.class);
    }

    /**
     * MST_BUS_PERMISSION追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_GAMEN_PERMISSIONの登録
        if (this.mstGamenPermissions != null) {
            for (MstGamenPermission mstGamenPermission : this.mstGamenPermissions) {
                mstGamenPermission.setCompCode(this.getCompCode());
                mstGamenPermission.setBusinessNo(this.getBusinessNo());
                mstGamenPermission.insert(now, id);
            }
        }

        // MST_BUS_PERMISSIONの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"COMP_CODE\" -- :comp_code");
        nameList.add("\"BUSINESS_NO\" -- :business_no");
        nameList.add("\"PERMISSION\" -- :permission");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_BUS_PERMISSION(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":comp_code");
        valueList.add(":business_no");
        valueList.add(":permission");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_BUS_PERMISSION更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_GAMEN_PERMISSIONの登録
        if (this.mstGamenPermissions != null) {
            for (MstGamenPermission mstGamenPermission : this.mstGamenPermissions) {
                mstGamenPermission.setCompCode(this.compCode);
                mstGamenPermission.setBusinessNo(this.businessNo);
                try {
                    mstGamenPermission.insert(now, id);
                } catch (Exception e) {
                    mstGamenPermission.update(now, id);
                }
            }
            this.mstGamenPermissions = null;
            this.referMstGamenPermissions();
            if (this.mstGamenPermissions != null) {
                for (MstGamenPermission mstGamenPermission : this.mstGamenPermissions) {
                    if (!mstGamenPermission.getTimeStampChange().equals(now)) {
                        mstGamenPermission.delete();
                    }
                }
            }
        }

        // MST_BUS_PERMISSIONの登録
        String sql = "UPDATE MST_BUS_PERMISSION\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"COMP_CODE\" = :comp_code");
        setList.add("\"BUSINESS_NO\" = :business_no");
        setList.add("\"PERMISSION\" = :permission");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_BUS_PERMISSION削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_GAMEN_PERMISSIONの削除
        if (this.mstGamenPermissions != null) {
            for (MstGamenPermission mstGamenPermission : this.mstGamenPermissions) {
                mstGamenPermission.delete();
            }
        }

        // MST_BUS_PERMISSIONの削除
        String sql = "DELETE FROM MST_BUS_PERMISSION WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"COMP_CODE\" = :comp_code");
        whereList.add("\"BUSINESS_NO\" = :business_no");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("comp_code", this.compCode);
        params.put("business_no", this.businessNo);
        params.put("permission", this.permission);
        params.put("delete_flag", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_GAMEN_PERMISSIONのリスト
     */
    private List<MstGamenPermission> mstGamenPermissions;

    /**
     * @return MST_GAMEN_PERMISSIONのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstGamenPermissions")
    public List<MstGamenPermission> getMstGamenPermissions() {
        return this.mstGamenPermissions;
    }

    /**
     * @param list MST_GAMEN_PERMISSIONのリスト
     */
    public void setMstGamenPermissions(final List<MstGamenPermission> list) {
        this.mstGamenPermissions = list;
    }

    /**
     * @param mstGamenPermission
     */
    public void addMstGamenPermissions(final MstGamenPermission mstGamenPermission) {
        if (this.mstGamenPermissions == null) {
            this.mstGamenPermissions = new ArrayList<MstGamenPermission>();
        }
        this.mstGamenPermissions.add(mstGamenPermission);
    }

    /**
     * @return MST_GAMEN_PERMISSIONのリスト
     */
    public List<MstGamenPermission> referMstGamenPermissions() {
        if (this.mstGamenPermissions == null) {
            this.mstGamenPermissions = MstBusPermission.referMstGamenPermissions(this.compCode, this.businessNo);
        }
        return this.mstGamenPermissions;
    }

    /**
     * @param param1 compCode
     * @param param2 businessNo
     * @return List<MstGamenPermission>
     */
    public static List<MstGamenPermission> referMstGamenPermissions(final java.math.BigDecimal param1, final java.math.BigDecimal param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("comp_code = :comp_code");
        whereList.add("business_no = :business_no");

        String sql = "SELECT * FROM MST_GAMEN_PERMISSION WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("comp_code", param1);
        params.put("business_no", param2);

        return Queries.select(sql, params, MstGamenPermission.class);
    }
}
