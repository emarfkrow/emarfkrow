package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_KANBAN_FORM_DET
 *
 * @author emarfkrow
 */
public class MfgKanbanFormDet implements IEntity {

    /** KANBAN_FORM_DEF_NAME */
    private String kanbanFormDefName;

    /**
     * @return KANBAN_FORM_DEF_NAME
     */
    public String getKanbanFormDefName() {
        return this.kanbanFormDefName;
    }

    /**
     * @param o KANBAN_FORM_DEF_NAME
     */
    public void setKanbanFormDefName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanFormDefName = String.valueOf(o.toString());
        } else {
            this.kanbanFormDefName = null;
        }
    }

    /** EXCEL_CELL_NAME */
    private String excelCellName;

    /**
     * @return EXCEL_CELL_NAME
     */
    public String getExcelCellName() {
        return this.excelCellName;
    }

    /**
     * @param o EXCEL_CELL_NAME
     */
    public void setExcelCellName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.excelCellName = String.valueOf(o.toString());
        } else {
            this.excelCellName = null;
        }
    }

    /** BASIC_OR_TUNNNEL_FLG */
    private String basicOrTunnnelFlg;

    /**
     * @return BASIC_OR_TUNNNEL_FLG
     */
    public String getBasicOrTunnnelFlg() {
        return this.basicOrTunnnelFlg;
    }

    /**
     * @param o BASIC_OR_TUNNNEL_FLG
     */
    public void setBasicOrTunnnelFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.basicOrTunnnelFlg = String.valueOf(o.toString());
        } else {
            this.basicOrTunnnelFlg = null;
        }
    }

    /** DISP_ORDER */
    private java.math.BigDecimal dispOrder;

    /**
     * @return DISP_ORDER
     */
    public java.math.BigDecimal getDispOrder() {
        return this.dispOrder;
    }

    /**
     * @param o DISP_ORDER
     */
    public void setDispOrder(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dispOrder = new java.math.BigDecimal(o.toString());
        } else {
            this.dispOrder = null;
        }
    }

    /** ITEM_CODE */
    private String itemCode;

    /**
     * @return ITEM_CODE
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * @param o ITEM_CODE
     */
    public void setItemCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.itemCode = String.valueOf(o.toString());
        } else {
            this.itemCode = null;
        }
    }

    /** VALID_FLG */
    private String validFlg;

    /**
     * @return VALID_FLG
     */
    public String getValidFlg() {
        return this.validFlg;
    }

    /**
     * @param o VALID_FLG
     */
    public void setValidFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.validFlg = String.valueOf(o.toString());
        } else {
            this.validFlg = null;
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
     * MFG_KANBAN_FORM_DET照会
     *
     * @param param1 KANBAN_FORM_DEF_NAME
     * @param param2 EXCEL_CELL_NAME
     * @return MFG_KANBAN_FORM_DET
     */
    public static MfgKanbanFormDet get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("kanban_form_def_name = :kanban_form_def_name");
        whereList.add("excel_cell_name = :excel_cell_name");

        String sql = "SELECT * FROM MFG_KANBAN_FORM_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_form_def_name", param1);
        params.put("excel_cell_name", param2);

        return Queries.get(sql, params, MfgKanbanFormDet.class);
    }

    /**
     * MFG_KANBAN_FORM_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MFG_KANBAN_FORM_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("kanban_form_def_name -- :kanban_form_def_name");
        nameList.add("excel_cell_name -- :excel_cell_name");
        nameList.add("basic_or_tunnnel_flg -- :basic_or_tunnnel_flg");
        nameList.add("disp_order -- :disp_order");
        nameList.add("item_code -- :item_code");
        nameList.add("valid_flg -- :valid_flg");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_KANBAN_FORM_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kanban_form_def_name");
        valueList.add(":excel_cell_name");
        valueList.add(":basic_or_tunnnel_flg");
        valueList.add(":disp_order");
        valueList.add(":item_code");
        valueList.add(":valid_flg");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MFG_KANBAN_FORM_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_KANBAN_FORM_DETの登録
        String sql = "UPDATE MFG_KANBAN_FORM_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("kanban_form_def_name = :kanban_form_def_name");
        setList.add("excel_cell_name = :excel_cell_name");
        setList.add("basic_or_tunnnel_flg = :basic_or_tunnnel_flg");
        setList.add("disp_order = :disp_order");
        setList.add("item_code = :item_code");
        setList.add("valid_flg = :valid_flg");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_KANBAN_FORM_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_KANBAN_FORM_DETの削除
        String sql = "DELETE FROM MFG_KANBAN_FORM_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("kanban_form_def_name = :kanban_form_def_name");
        whereList.add("excel_cell_name = :excel_cell_name");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("KANBAN_FORM_DEF_NAME", this.kanbanFormDefName);
        params.put("EXCEL_CELL_NAME", this.excelCellName);
        params.put("BASIC_OR_TUNNNEL_FLG", this.basicOrTunnnelFlg);
        params.put("DISP_ORDER", this.dispOrder);
        params.put("ITEM_CODE", this.itemCode);
        params.put("VALID_FLG", this.validFlg);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
