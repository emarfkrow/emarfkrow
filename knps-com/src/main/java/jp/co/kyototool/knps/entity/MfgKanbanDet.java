package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_KANBAN_DET
 *
 * @author emarfkrow
 */
public class MfgKanbanDet implements IEntity {

    /** KANBAN_ID */
    private String kanbanId;

    /**
     * @return KANBAN_ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANBAN_ID")
    public String getKanbanId() {
        return this.kanbanId;
    }

    /**
     * @param o KANBAN_ID
     */
    public void setKanbanId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanId = String.valueOf(o.toString());
        } else {
            this.kanbanId = null;
        }
    }

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN")
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o HINBAN
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** NECK_ROUTING_CODE */
    private String neckRoutingCode;

    /**
     * @return NECK_ROUTING_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NECK_ROUTING_CODE")
    public String getNeckRoutingCode() {
        return this.neckRoutingCode;
    }

    /**
     * @param o NECK_ROUTING_CODE
     */
    public void setNeckRoutingCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.neckRoutingCode = String.valueOf(o.toString());
        } else {
            this.neckRoutingCode = null;
        }
    }

    /** FOR_PRO_CODE */
    private String forProCode;

    /**
     * @return FOR_PRO_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FOR_PRO_CODE")
    public String getForProCode() {
        return this.forProCode;
    }

    /**
     * @param o FOR_PRO_CODE
     */
    public void setForProCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.forProCode = String.valueOf(o.toString());
        } else {
            this.forProCode = null;
        }
    }

    /** FOR_PRO_LOCATION_CODE */
    private String forProLocationCode;

    /**
     * @return FOR_PRO_LOCATION_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FOR_PRO_LOCATION_CODE")
    public String getForProLocationCode() {
        return this.forProLocationCode;
    }

    /**
     * @param o FOR_PRO_LOCATION_CODE
     */
    public void setForProLocationCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.forProLocationCode = String.valueOf(o.toString());
        } else {
            this.forProLocationCode = null;
        }
    }

    /** PRO_CODE */
    private String proCode;

    /**
     * @return PRO_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_CODE")
    public String getProCode() {
        return this.proCode;
    }

    /**
     * @param o PRO_CODE
     */
    public void setProCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proCode = String.valueOf(o.toString());
        } else {
            this.proCode = null;
        }
    }

    /** PRO_LOCATION_CODE */
    private String proLocationCode;

    /**
     * @return PRO_LOCATION_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_LOCATION_CODE")
    public String getProLocationCode() {
        return this.proLocationCode;
    }

    /**
     * @param o PRO_LOCATION_CODE
     */
    public void setProLocationCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proLocationCode = String.valueOf(o.toString());
        } else {
            this.proLocationCode = null;
        }
    }

    /** COMMENT1 */
    private String comment1;

    /**
     * @return COMMENT1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMMENT1")
    public String getComment1() {
        return this.comment1;
    }

    /**
     * @param o COMMENT1
     */
    public void setComment1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.comment1 = String.valueOf(o.toString());
        } else {
            this.comment1 = null;
        }
    }

    /** COMMENT2 */
    private String comment2;

    /**
     * @return COMMENT2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMMENT2")
    public String getComment2() {
        return this.comment2;
    }

    /**
     * @param o COMMENT2
     */
    public void setComment2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.comment2 = String.valueOf(o.toString());
        } else {
            this.comment2 = null;
        }
    }

    /** ROUTING1 */
    private java.math.BigDecimal routing1;

    /**
     * @return ROUTING1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING1")
    public java.math.BigDecimal getRouting1() {
        return this.routing1;
    }

    /**
     * @param o ROUTING1
     */
    public void setRouting1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing1 = new java.math.BigDecimal(o.toString());
        } else {
            this.routing1 = null;
        }
    }

    /** TUNNEL_PRO_CODE1 */
    private String tunnelProCode1;

    /**
     * @return TUNNEL_PRO_CODE1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TUNNEL_PRO_CODE1")
    public String getTunnelProCode1() {
        return this.tunnelProCode1;
    }

    /**
     * @param o TUNNEL_PRO_CODE1
     */
    public void setTunnelProCode1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tunnelProCode1 = String.valueOf(o.toString());
        } else {
            this.tunnelProCode1 = null;
        }
    }

    /** ROUTING2 */
    private java.math.BigDecimal routing2;

    /**
     * @return ROUTING2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING2")
    public java.math.BigDecimal getRouting2() {
        return this.routing2;
    }

    /**
     * @param o ROUTING2
     */
    public void setRouting2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing2 = new java.math.BigDecimal(o.toString());
        } else {
            this.routing2 = null;
        }
    }

    /** TUNNEL_PRO_CODE2 */
    private String tunnelProCode2;

    /**
     * @return TUNNEL_PRO_CODE2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TUNNEL_PRO_CODE2")
    public String getTunnelProCode2() {
        return this.tunnelProCode2;
    }

    /**
     * @param o TUNNEL_PRO_CODE2
     */
    public void setTunnelProCode2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tunnelProCode2 = String.valueOf(o.toString());
        } else {
            this.tunnelProCode2 = null;
        }
    }

    /** ROUTING3 */
    private java.math.BigDecimal routing3;

    /**
     * @return ROUTING3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING3")
    public java.math.BigDecimal getRouting3() {
        return this.routing3;
    }

    /**
     * @param o ROUTING3
     */
    public void setRouting3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing3 = new java.math.BigDecimal(o.toString());
        } else {
            this.routing3 = null;
        }
    }

    /** TUNNEL_PRO_CODE3 */
    private String tunnelProCode3;

    /**
     * @return TUNNEL_PRO_CODE3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TUNNEL_PRO_CODE3")
    public String getTunnelProCode3() {
        return this.tunnelProCode3;
    }

    /**
     * @param o TUNNEL_PRO_CODE3
     */
    public void setTunnelProCode3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tunnelProCode3 = String.valueOf(o.toString());
        } else {
            this.tunnelProCode3 = null;
        }
    }

    /** ROUTING4 */
    private java.math.BigDecimal routing4;

    /**
     * @return ROUTING4
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING4")
    public java.math.BigDecimal getRouting4() {
        return this.routing4;
    }

    /**
     * @param o ROUTING4
     */
    public void setRouting4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing4 = new java.math.BigDecimal(o.toString());
        } else {
            this.routing4 = null;
        }
    }

    /** TUNNEL_PRO_CODE4 */
    private String tunnelProCode4;

    /**
     * @return TUNNEL_PRO_CODE4
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TUNNEL_PRO_CODE4")
    public String getTunnelProCode4() {
        return this.tunnelProCode4;
    }

    /**
     * @param o TUNNEL_PRO_CODE4
     */
    public void setTunnelProCode4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tunnelProCode4 = String.valueOf(o.toString());
        } else {
            this.tunnelProCode4 = null;
        }
    }

    /** ROUTING5 */
    private java.math.BigDecimal routing5;

    /**
     * @return ROUTING5
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING5")
    public java.math.BigDecimal getRouting5() {
        return this.routing5;
    }

    /**
     * @param o ROUTING5
     */
    public void setRouting5(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing5 = new java.math.BigDecimal(o.toString());
        } else {
            this.routing5 = null;
        }
    }

    /** TUNNEL_PRO_CODE5 */
    private String tunnelProCode5;

    /**
     * @return TUNNEL_PRO_CODE5
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TUNNEL_PRO_CODE5")
    public String getTunnelProCode5() {
        return this.tunnelProCode5;
    }

    /**
     * @param o TUNNEL_PRO_CODE5
     */
    public void setTunnelProCode5(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tunnelProCode5 = String.valueOf(o.toString());
        } else {
            this.tunnelProCode5 = null;
        }
    }

    /** KANBAN_ACC_COUNTS */
    private java.math.BigDecimal kanbanAccCounts;

    /**
     * @return KANBAN_ACC_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANBAN_ACC_COUNTS")
    public java.math.BigDecimal getKanbanAccCounts() {
        return this.kanbanAccCounts;
    }

    /**
     * @param o KANBAN_ACC_COUNTS
     */
    public void setKanbanAccCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanbanAccCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.kanbanAccCounts = null;
        }
    }

    /** LOT_SIZE */
    private java.math.BigDecimal lotSize;

    /**
     * @return LOT_SIZE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOT_SIZE")
    public java.math.BigDecimal getLotSize() {
        return this.lotSize;
    }

    /**
     * @param o LOT_SIZE
     */
    public void setLotSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lotSize = new java.math.BigDecimal(o.toString());
        } else {
            this.lotSize = null;
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
     * MFG_KANBAN_DET照会
     *
     * @param param1 KANBAN_ID
     * @return MFG_KANBAN_DET
     */
    public static MfgKanbanDet get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"KANBAN_ID\") = TRIM (:kanban_id)");

        String sql = "SELECT * FROM MFG_KANBAN_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_id", param1);

        return Queries.get(sql, params, MfgKanbanDet.class);
    }

    /**
     * MFG_KANBAN_DET追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // KANBAN_IDの採番処理
        numbering();

        // MFG_KANBAN_SHIPPINGの登録
        if (this.mfgKanbanShippings != null) {
            for (MfgKanbanShipping mfgKanbanShipping : this.mfgKanbanShippings) {
                mfgKanbanShipping.setKanbanId(this.getKanbanId());
                mfgKanbanShipping.insert(now, id);
            }
        }

        // MFG_KANBAN_STATUSの登録
        if (this.mfgKanbanStatuss != null) {
            for (MfgKanbanStatus mfgKanbanStatus : this.mfgKanbanStatuss) {
                mfgKanbanStatus.setKanbanId(this.getKanbanId());
                mfgKanbanStatus.insert(now, id);
            }
        }

        // MFG_KANBAN_DETの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"KANBAN_ID\" -- :kanban_id");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"NECK_ROUTING_CODE\" -- :neck_routing_code");
        nameList.add("\"FOR_PRO_CODE\" -- :for_pro_code");
        nameList.add("\"FOR_PRO_LOCATION_CODE\" -- :for_pro_location_code");
        nameList.add("\"PRO_CODE\" -- :pro_code");
        nameList.add("\"PRO_LOCATION_CODE\" -- :pro_location_code");
        nameList.add("\"COMMENT1\" -- :comment1");
        nameList.add("\"COMMENT2\" -- :comment2");
        nameList.add("\"ROUTING1\" -- :routing1");
        nameList.add("\"TUNNEL_PRO_CODE1\" -- :tunnel_pro_code1");
        nameList.add("\"ROUTING2\" -- :routing2");
        nameList.add("\"TUNNEL_PRO_CODE2\" -- :tunnel_pro_code2");
        nameList.add("\"ROUTING3\" -- :routing3");
        nameList.add("\"TUNNEL_PRO_CODE3\" -- :tunnel_pro_code3");
        nameList.add("\"ROUTING4\" -- :routing4");
        nameList.add("\"TUNNEL_PRO_CODE4\" -- :tunnel_pro_code4");
        nameList.add("\"ROUTING5\" -- :routing5");
        nameList.add("\"TUNNEL_PRO_CODE5\" -- :tunnel_pro_code5");
        nameList.add("\"KANBAN_ACC_COUNTS\" -- :kanban_acc_counts");
        nameList.add("\"LOT_SIZE\" -- :lot_size");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_KANBAN_DET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kanban_id");
        valueList.add(":hinban");
        valueList.add(":neck_routing_code");
        valueList.add(":for_pro_code");
        valueList.add(":for_pro_location_code");
        valueList.add(":pro_code");
        valueList.add(":pro_location_code");
        valueList.add(":comment1");
        valueList.add(":comment2");
        valueList.add(":routing1");
        valueList.add(":tunnel_pro_code1");
        valueList.add(":routing2");
        valueList.add(":tunnel_pro_code2");
        valueList.add(":routing3");
        valueList.add(":tunnel_pro_code3");
        valueList.add(":routing4");
        valueList.add(":tunnel_pro_code4");
        valueList.add(":routing5");
        valueList.add(":tunnel_pro_code5");
        valueList.add(":kanban_acc_counts");
        valueList.add(":lot_size");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** KANBAN_IDの採番処理 */
    private void numbering() {

        if (this.kanbanId != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"KANBAN_ID\") IS NULL THEN 0 ELSE MAX(e.\"KANBAN_ID\") * 1 END + 1, 9, '0') AS \"KANBAN_ID\" FROM MFG_KANBAN_DET e WHERE e.\"KANBAN_ID\" < '999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("KANBAN_ID");

        this.setKanbanId(o);
    }

    /**
     * MFG_KANBAN_DET更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_KANBAN_SHIPPINGの登録
        if (this.mfgKanbanShippings != null) {
            Queries.regist("DELETE FROM MFG_KANBAN_SHIPPING WHERE \"KANBAN_ID\" = :kanban_id AND \"HINBAN\" = :hinban", toMap(now, id));
            for (MfgKanbanShipping mfgKanbanShipping : this.mfgKanbanShippings) {
                mfgKanbanShipping.setKanbanId(this.kanbanId);
                try {
                    mfgKanbanShipping.insert(now, id);
                } catch (Exception e) {
                    mfgKanbanShipping.update(now, id);
                }
            }
        }

        // MFG_KANBAN_STATUSの登録
        if (this.mfgKanbanStatuss != null) {
            for (MfgKanbanStatus mfgKanbanStatus : this.mfgKanbanStatuss) {
                mfgKanbanStatus.setKanbanId(this.kanbanId);
                try {
                    mfgKanbanStatus.insert(now, id);
                } catch (Exception e) {
                    mfgKanbanStatus.update(now, id);
                }
            }
            this.mfgKanbanStatuss = null;
            this.referMfgKanbanStatuss();
            if (this.mfgKanbanStatuss != null) {
                for (MfgKanbanStatus mfgKanbanStatus : this.mfgKanbanStatuss) {
                    if (!mfgKanbanStatus.getTimeStampChange().equals(now)) {
                        mfgKanbanStatus.delete();
                    }
                }
            }
        }

        // MFG_KANBAN_DETの登録
        String sql = "UPDATE MFG_KANBAN_DET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"KANBAN_ID\" = :kanban_id");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"NECK_ROUTING_CODE\" = :neck_routing_code");
        setList.add("\"FOR_PRO_CODE\" = :for_pro_code");
        setList.add("\"FOR_PRO_LOCATION_CODE\" = :for_pro_location_code");
        setList.add("\"PRO_CODE\" = :pro_code");
        setList.add("\"PRO_LOCATION_CODE\" = :pro_location_code");
        setList.add("\"COMMENT1\" = :comment1");
        setList.add("\"COMMENT2\" = :comment2");
        setList.add("\"ROUTING1\" = :routing1");
        setList.add("\"TUNNEL_PRO_CODE1\" = :tunnel_pro_code1");
        setList.add("\"ROUTING2\" = :routing2");
        setList.add("\"TUNNEL_PRO_CODE2\" = :tunnel_pro_code2");
        setList.add("\"ROUTING3\" = :routing3");
        setList.add("\"TUNNEL_PRO_CODE3\" = :tunnel_pro_code3");
        setList.add("\"ROUTING4\" = :routing4");
        setList.add("\"TUNNEL_PRO_CODE4\" = :tunnel_pro_code4");
        setList.add("\"ROUTING5\" = :routing5");
        setList.add("\"TUNNEL_PRO_CODE5\" = :tunnel_pro_code5");
        setList.add("\"KANBAN_ACC_COUNTS\" = :kanban_acc_counts");
        setList.add("\"LOT_SIZE\" = :lot_size");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_KANBAN_DET削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_KANBAN_SHIPPINGの削除
        if (this.mfgKanbanShippings != null) {
            for (MfgKanbanShipping mfgKanbanShipping : this.mfgKanbanShippings) {
                mfgKanbanShipping.delete();
            }
        }

        // MFG_KANBAN_STATUSの削除
        if (this.mfgKanbanStatuss != null) {
            for (MfgKanbanStatus mfgKanbanStatus : this.mfgKanbanStatuss) {
                mfgKanbanStatus.delete();
            }
        }

        // MFG_KANBAN_DETの削除
        String sql = "DELETE FROM MFG_KANBAN_DET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"KANBAN_ID\") = TRIM (:kanban_id)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_id", this.kanbanId);
        params.put("hinban", this.hinban);
        params.put("neck_routing_code", this.neckRoutingCode);
        params.put("for_pro_code", this.forProCode);
        params.put("for_pro_location_code", this.forProLocationCode);
        params.put("pro_code", this.proCode);
        params.put("pro_location_code", this.proLocationCode);
        params.put("comment1", this.comment1);
        params.put("comment2", this.comment2);
        params.put("routing1", this.routing1);
        params.put("tunnel_pro_code1", this.tunnelProCode1);
        params.put("routing2", this.routing2);
        params.put("tunnel_pro_code2", this.tunnelProCode2);
        params.put("routing3", this.routing3);
        params.put("tunnel_pro_code3", this.tunnelProCode3);
        params.put("routing4", this.routing4);
        params.put("tunnel_pro_code4", this.tunnelProCode4);
        params.put("routing5", this.routing5);
        params.put("tunnel_pro_code5", this.tunnelProCode5);
        params.put("kanban_acc_counts", this.kanbanAccCounts);
        params.put("lot_size", this.lotSize);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_KANBAN_SHIPPINGのリスト
     */
    private List<MfgKanbanShipping> mfgKanbanShippings;

    /**
     * @return MFG_KANBAN_SHIPPINGのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgKanbanShippings")
    public List<MfgKanbanShipping> getMfgKanbanShippings() {
        return this.mfgKanbanShippings;
    }

    /**
     * @param list MFG_KANBAN_SHIPPINGのリスト
     */
    public void setMfgKanbanShippings(final List<MfgKanbanShipping> list) {
        this.mfgKanbanShippings = list;
    }

    /**
     * @param mfgKanbanShipping
     */
    public void addMfgKanbanShippings(final MfgKanbanShipping mfgKanbanShipping) {
        if (this.mfgKanbanShippings == null) {
            this.mfgKanbanShippings = new ArrayList<MfgKanbanShipping>();
        }
        this.mfgKanbanShippings.add(mfgKanbanShipping);
    }

    /**
     * @return MFG_KANBAN_SHIPPINGのリスト
     */
    public List<MfgKanbanShipping> referMfgKanbanShippings() {
        if (this.mfgKanbanShippings == null) {
            this.mfgKanbanShippings = MfgKanbanDet.referMfgKanbanShippings(this.kanbanId);
        }
        return this.mfgKanbanShippings;
    }

    /**
     * @param param1 kanbanId
     * @return List<MfgKanbanShipping>
     */
    public static List<MfgKanbanShipping> referMfgKanbanShippings(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("kanban_id = :kanban_id");

        String sql = "SELECT * FROM MFG_KANBAN_SHIPPING WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_id", param1);

        return Queries.select(sql, params, MfgKanbanShipping.class);
    }

    /**
     * MFG_KANBAN_STATUSのリスト
     */
    private List<MfgKanbanStatus> mfgKanbanStatuss;

    /**
     * @return MFG_KANBAN_STATUSのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgKanbanStatuss")
    public List<MfgKanbanStatus> getMfgKanbanStatuss() {
        return this.mfgKanbanStatuss;
    }

    /**
     * @param list MFG_KANBAN_STATUSのリスト
     */
    public void setMfgKanbanStatuss(final List<MfgKanbanStatus> list) {
        this.mfgKanbanStatuss = list;
    }

    /**
     * @param mfgKanbanStatus
     */
    public void addMfgKanbanStatuss(final MfgKanbanStatus mfgKanbanStatus) {
        if (this.mfgKanbanStatuss == null) {
            this.mfgKanbanStatuss = new ArrayList<MfgKanbanStatus>();
        }
        this.mfgKanbanStatuss.add(mfgKanbanStatus);
    }

    /**
     * @return MFG_KANBAN_STATUSのリスト
     */
    public List<MfgKanbanStatus> referMfgKanbanStatuss() {
        if (this.mfgKanbanStatuss == null) {
            this.mfgKanbanStatuss = MfgKanbanDet.referMfgKanbanStatuss(this.kanbanId);
        }
        return this.mfgKanbanStatuss;
    }

    /**
     * @param param1 kanbanId
     * @return List<MfgKanbanStatus>
     */
    public static List<MfgKanbanStatus> referMfgKanbanStatuss(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("kanban_id = :kanban_id");

        String sql = "SELECT * FROM MFG_KANBAN_STATUS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kanban_id", param1);

        return Queries.select(sql, params, MfgKanbanStatus.class);
    }
}
