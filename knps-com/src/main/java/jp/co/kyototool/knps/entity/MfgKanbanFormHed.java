package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_KANBAN_FORM_HED
 *
 * @author emarfkrow
 */
public class MfgKanbanFormHed implements IEntity {

    /** KANBAN_FORM_DEF_NAME */
    private String kanbanFormDefName;

    /**
     * @return KANBAN_FORM_DEF_NAME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANBAN_FORM_DEF_NAME")
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

    /** KANBAN_TEMPLATE_NAME */
    private String kanbanTemplateName;

    /**
     * @return KANBAN_TEMPLATE_NAME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANBAN_TEMPLATE_NAME")
    public String getKanbanTemplateName() {
        return this.kanbanTemplateName;
    }

    /**
     * @param o KANBAN_TEMPLATE_NAME
     */
    public void setKanbanTemplateName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanTemplateName = String.valueOf(o.toString());
        } else {
            this.kanbanTemplateName = null;
        }
    }

    /** SELF_PROC_AFTER_TUNNEL_FLG */
    private String selfProcAfterTunnelFlg = "0";

    /**
     * @return SELF_PROC_AFTER_TUNNEL_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SELF_PROC_AFTER_TUNNEL_FLG")
    public String getSelfProcAfterTunnelFlg() {
        return this.selfProcAfterTunnelFlg;
    }

    /**
     * @param o SELF_PROC_AFTER_TUNNEL_FLG
     */
    public void setSelfProcAfterTunnelFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.selfProcAfterTunnelFlg = String.valueOf(o.toString());
        } else {
            this.selfProcAfterTunnelFlg = null;
        }
    }

    /** OUTPUT_PER_PAGE */
    private java.math.BigDecimal outputPerPage;

    /**
     * @return OUTPUT_PER_PAGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OUTPUT_PER_PAGE")
    public java.math.BigDecimal getOutputPerPage() {
        return this.outputPerPage;
    }

    /**
     * @param o OUTPUT_PER_PAGE
     */
    public void setOutputPerPage(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.outputPerPage = new java.math.BigDecimal(o.toString());
        } else {
            this.outputPerPage = null;
        }
    }

    /** AUTO_SHAPE_FLG */
    private String autoShapeFlg = "0";

    /**
     * @return AUTO_SHAPE_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("AUTO_SHAPE_FLG")
    public String getAutoShapeFlg() {
        return this.autoShapeFlg;
    }

    /**
     * @param o AUTO_SHAPE_FLG
     */
    public void setAutoShapeFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.autoShapeFlg = String.valueOf(o.toString());
        } else {
            this.autoShapeFlg = null;
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

    /**
     * MFG_KANBAN_FORM_HED照会
     *
     * @param param1 KANBAN_FORM_DEF_NAME
     * @return MFG_KANBAN_FORM_HED
     */
    public static MfgKanbanFormHed get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"KANBAN_FORM_DEF_NAME\" = :kanban_form_def_name");

        String sql = "SELECT * FROM MFG_KANBAN_FORM_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_form_def_name", param1);

        return Queries.get(sql, params, MfgKanbanFormHed.class);
    }

    /**
     * MFG_KANBAN_FORM_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MFG_KANBAN_FORM_DETの登録
        if (this.mfgKanbanFormDets != null) {
            for (MfgKanbanFormDet mfgKanbanFormDet : this.mfgKanbanFormDets) {
                mfgKanbanFormDet.setKanbanFormDefName(this.getKanbanFormDefName());
                mfgKanbanFormDet.insert(now, id);
            }
        }

        // MFG_KANBAN_FORM_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"KANBAN_FORM_DEF_NAME\" -- :kanban_form_def_name");
        nameList.add("\"KANBAN_TEMPLATE_NAME\" -- :kanban_template_name");
        nameList.add("\"SELF_PROC_AFTER_TUNNEL_FLG\" -- :self_proc_after_tunnel_flg");
        nameList.add("\"OUTPUT_PER_PAGE\" -- :output_per_page");
        nameList.add("\"AUTO_SHAPE_FLG\" -- :auto_shape_flg");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_KANBAN_FORM_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kanban_form_def_name");
        valueList.add(":kanban_template_name");
        valueList.add(":self_proc_after_tunnel_flg");
        valueList.add(":output_per_page");
        valueList.add(":auto_shape_flg");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MFG_KANBAN_FORM_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_KANBAN_FORM_DETの登録
        if (this.mfgKanbanFormDets != null) {
            for (MfgKanbanFormDet mfgKanbanFormDet : this.mfgKanbanFormDets) {
                mfgKanbanFormDet.setKanbanFormDefName(this.kanbanFormDefName);
                try {
                    mfgKanbanFormDet.insert(now, id);
                } catch (Exception e) {
                    mfgKanbanFormDet.update(now, id);
                }
            }
            this.mfgKanbanFormDets = null;
            this.referMfgKanbanFormDets();
            if (this.mfgKanbanFormDets != null) {
                for (MfgKanbanFormDet mfgKanbanFormDet : this.mfgKanbanFormDets) {
                    if (!mfgKanbanFormDet.getTimeStampChange().equals(now)) {
                        mfgKanbanFormDet.delete();
                    }
                }
            }
        }

        // MFG_KANBAN_FORM_HEDの登録
        String sql = "UPDATE MFG_KANBAN_FORM_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"KANBAN_FORM_DEF_NAME\" = :kanban_form_def_name");
        setList.add("\"KANBAN_TEMPLATE_NAME\" = :kanban_template_name");
        setList.add("\"SELF_PROC_AFTER_TUNNEL_FLG\" = :self_proc_after_tunnel_flg");
        setList.add("\"OUTPUT_PER_PAGE\" = :output_per_page");
        setList.add("\"AUTO_SHAPE_FLG\" = :auto_shape_flg");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_KANBAN_FORM_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_KANBAN_FORM_DETの削除
        if (this.mfgKanbanFormDets != null) {
            for (MfgKanbanFormDet mfgKanbanFormDet : this.mfgKanbanFormDets) {
                mfgKanbanFormDet.delete();
            }
        }

        // MFG_KANBAN_FORM_HEDの削除
        String sql = "DELETE FROM MFG_KANBAN_FORM_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"KANBAN_FORM_DEF_NAME\" = :kanban_form_def_name");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_form_def_name", this.kanbanFormDefName);
        params.put("kanban_template_name", this.kanbanTemplateName);
        params.put("self_proc_after_tunnel_flg", this.selfProcAfterTunnelFlg);
        params.put("output_per_page", this.outputPerPage);
        params.put("auto_shape_flg", this.autoShapeFlg);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_KANBAN_FORM_DETのリスト
     */
    private List<MfgKanbanFormDet> mfgKanbanFormDets;

    /**
     * @return MFG_KANBAN_FORM_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgKanbanFormDets")
    public List<MfgKanbanFormDet> getMfgKanbanFormDets() {
        return this.mfgKanbanFormDets;
    }

    /**
     * @param list MFG_KANBAN_FORM_DETのリスト
     */
    public void setMfgKanbanFormDets(final List<MfgKanbanFormDet> list) {
        this.mfgKanbanFormDets = list;
    }

    /**
     * @param mfgKanbanFormDet
     */
    public void addMfgKanbanFormDets(final MfgKanbanFormDet mfgKanbanFormDet) {
        if (this.mfgKanbanFormDets == null) {
            this.mfgKanbanFormDets = new ArrayList<MfgKanbanFormDet>();
        }
        this.mfgKanbanFormDets.add(mfgKanbanFormDet);
    }

    /**
     * @return MFG_KANBAN_FORM_DETのリスト
     */
    public List<MfgKanbanFormDet> referMfgKanbanFormDets() {
        if (this.mfgKanbanFormDets == null) {
            this.mfgKanbanFormDets = MfgKanbanFormHed.referMfgKanbanFormDets(this.kanbanFormDefName);
        }
        return this.mfgKanbanFormDets;
    }

    /**
     * @param param1 kanbanFormDefName
     * @return List<MfgKanbanFormDet>
     */
    public static List<MfgKanbanFormDet> referMfgKanbanFormDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("kanban_form_def_name = :kanban_form_def_name");

        String sql = "SELECT * FROM MFG_KANBAN_FORM_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_form_def_name", param1);

        return Queries.select(sql, params, MfgKanbanFormDet.class);
    }
}
