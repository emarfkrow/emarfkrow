package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_COMPONENT_SALES
 *
 * @author emarfkrow
 */
public class MstComponentSales implements IEntity {

    /** COMP_HINBAN_PARENT */
    private String compHinbanParent;

    /**
     * @return COMP_HINBAN_PARENT
     */
    public String getCompHinbanParent() {
        return this.compHinbanParent;
    }

    /**
     * @param o COMP_HINBAN_PARENT
     */
    public void setCompHinbanParent(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.compHinbanParent = String.valueOf(o.toString());
        } else {
            this.compHinbanParent = null;
        }
    }

    /** COMP_HINBAN_CHILD */
    private String compHinbanChild;

    /**
     * @return COMP_HINBAN_CHILD
     */
    public String getCompHinbanChild() {
        return this.compHinbanChild;
    }

    /**
     * @param o COMP_HINBAN_CHILD
     */
    public void setCompHinbanChild(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.compHinbanChild = String.valueOf(o.toString());
        } else {
            this.compHinbanChild = null;
        }
    }

    /** SET_NUMBER */
    private java.math.BigDecimal setNumber;

    /**
     * @return SET_NUMBER
     */
    public java.math.BigDecimal getSetNumber() {
        return this.setNumber;
    }

    /**
     * @param o SET_NUMBER
     */
    public void setSetNumber(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setNumber = new java.math.BigDecimal(o.toString());
        } else {
            this.setNumber = null;
        }
    }

    /** BOTTOM_FLAG */
    private java.math.BigDecimal bottomFlag;

    /**
     * @return BOTTOM_FLAG
     */
    public java.math.BigDecimal getBottomFlag() {
        return this.bottomFlag;
    }

    /**
     * @param o BOTTOM_FLAG
     */
    public void setBottomFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bottomFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.bottomFlag = null;
        }
    }

    /** PROVISIONS_KBN */
    private java.math.BigDecimal provisionsKbn;

    /**
     * @return PROVISIONS_KBN
     */
    public java.math.BigDecimal getProvisionsKbn() {
        return this.provisionsKbn;
    }

    /**
     * @param o PROVISIONS_KBN
     */
    public void setProvisionsKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.provisionsKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.provisionsKbn = null;
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
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
     * MST_COMPONENT_SALES照会
     *
     * @param param1 COMP_HINBAN_PARENT
     * @param param2 COMP_HINBAN_CHILD
     * @return MST_COMPONENT_SALES
     */
    public static MstComponentSales get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (comp_hinban_parent) = TRIM (:comp_hinban_parent)");
        whereList.add("TRIM (comp_hinban_child) = TRIM (:comp_hinban_child)");

        String sql = "SELECT * FROM MST_COMPONENT_SALES WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("comp_hinban_parent", param1);
        params.put("comp_hinban_child", param2);

        return Queries.get(sql, params, MstComponentSales.class);
    }

    /**
     * MST_COMPONENT_SALES追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // COMP_HINBAN_CHILDの採番処理
        numbering();

        // MST_COMPONENT_SALESの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("comp_hinban_parent -- :comp_hinban_parent");
        nameList.add("comp_hinban_child -- :comp_hinban_child");
        nameList.add("set_number -- :set_number");
        nameList.add("bottom_flag -- :bottom_flag");
        nameList.add("provisions_kbn -- :provisions_kbn");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_COMPONENT_SALES(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":comp_hinban_parent");
        valueList.add(":comp_hinban_child");
        valueList.add(":set_number");
        valueList.add(":bottom_flag");
        valueList.add(":provisions_kbn");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** COMP_HINBAN_CHILDの採番処理 */
    private void numbering() {

        if (this.compHinbanChild != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.COMP_HINBAN_CHILD) IS NULL THEN 0 ELSE MAX(e.COMP_HINBAN_CHILD) * 1 END + 1, 20, '0') AS COMP_HINBAN_CHILD FROM MST_COMPONENT_SALES e WHERE e.COMP_HINBAN_CHILD < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.COMP_HINBAN_PARENT = :comp_hinban_parent");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("compHinbanParent", this.compHinbanParent);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("COMP_HINBAN_CHILD");

        this.setCompHinbanChild(o);
    }

    /**
     * MST_COMPONENT_SALES更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_COMPONENT_SALESの登録
        String sql = "UPDATE MST_COMPONENT_SALES\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("comp_hinban_parent = :comp_hinban_parent");
        setList.add("comp_hinban_child = :comp_hinban_child");
        setList.add("set_number = :set_number");
        setList.add("bottom_flag = :bottom_flag");
        setList.add("provisions_kbn = :provisions_kbn");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_COMPONENT_SALES削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_COMPONENT_SALESの削除
        String sql = "DELETE FROM MST_COMPONENT_SALES WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (comp_hinban_parent) = TRIM (:comp_hinban_parent)");
        whereList.add("TRIM (comp_hinban_child) = TRIM (:comp_hinban_child)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("COMP_HINBAN_PARENT", this.compHinbanParent);
        params.put("COMP_HINBAN_CHILD", this.compHinbanChild);
        params.put("SET_NUMBER", this.setNumber);
        params.put("BOTTOM_FLAG", this.bottomFlag);
        params.put("PROVISIONS_KBN", this.provisionsKbn);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
