package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_KANBAN_ACT
 *
 * @author emarfkrow
 */
public class MfgKanbanAct implements IEntity {

    /** ACT_NO */
    private String actNo;

    /**
     * @return ACT_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_NO")
    public String getActNo() {
        return this.actNo;
    }

    /**
     * @param o ACT_NO
     */
    public void setActNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actNo = String.valueOf(o.toString());
        } else {
            this.actNo = null;
        }
    }

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

    /** SERIAL_NO */
    private java.math.BigDecimal serialNo;

    /**
     * @return SERIAL_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SERIAL_NO")
    public java.math.BigDecimal getSerialNo() {
        return this.serialNo;
    }

    /**
     * @param o SERIAL_NO
     */
    public void setSerialNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.serialNo = new java.math.BigDecimal(o.toString());
        } else {
            this.serialNo = null;
        }
    }

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("WC_CODE")
    public String getWcCode() {
        return this.wcCode;
    }

    /**
     * @param o WC_CODE
     */
    public void setWcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcCode = String.valueOf(o.toString());
        } else {
            this.wcCode = null;
        }
    }

    /** ACT_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime actDate;

    /**
     * @return ACT_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_DATE")
    public java.time.LocalDateTime getActDate() {
        return this.actDate;
    }

    /**
     * @param o ACT_DATE
     */
    public void setActDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.actDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.actDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.actDate = null;
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
     * MFG_KANBAN_ACT照会
     *
     * @param param1 ACT_NO
     * @return MFG_KANBAN_ACT
     */
    public static MfgKanbanAct get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ACT_NO\") = TRIM (:act_no)");

        String sql = "SELECT * FROM MFG_KANBAN_ACT WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("act_no", param1);

        return Queries.get(sql, params, MfgKanbanAct.class);
    }

    /**
     * MFG_KANBAN_ACT追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // ACT_NOの採番処理
        numbering();

        // PCH_ACCEPT_ACT_DETの登録
        if (this.pchAcceptActDets != null) {
            for (PchAcceptActDet pchAcceptActDet : this.pchAcceptActDets) {
                pchAcceptActDet.setActNo(this.getActNo());
                pchAcceptActDet.insert(now, id);
            }
        }

        // PCH_ACCEPT_ACT_HEDの登録
        if (this.pchAcceptActHed != null) {
            this.pchAcceptActHed.setActNo(this.getActNo());
            this.pchAcceptActHed.insert(now, id);
        }

        // MFG_KANBAN_ACTの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"ACT_NO\" -- :act_no");
        nameList.add("\"KANBAN_ID\" -- :kanban_id");
        nameList.add("\"SERIAL_NO\" -- :serial_no");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"ACT_DATE\" -- :act_date");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_KANBAN_ACT(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":act_no");
        valueList.add(":kanban_id");
        valueList.add(":serial_no");
        valueList.add(":wc_code");
        valueList.add("TO_TIMESTAMP (:act_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** ACT_NOの採番処理 */
    private void numbering() {

        if (this.actNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"ACT_NO\") IS NULL THEN 0 ELSE MAX(e.\"ACT_NO\") * 1 END + 1, 12, '0') AS \"ACT_NO\" FROM MFG_KANBAN_ACT e WHERE e.\"ACT_NO\" < '999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("ACT_NO");

        this.setActNo(o);
    }

    /**
     * MFG_KANBAN_ACT更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_ACCEPT_ACT_DETの登録
        if (this.pchAcceptActDets != null) {
            for (PchAcceptActDet pchAcceptActDet : this.pchAcceptActDets) {
                pchAcceptActDet.setActNo(this.actNo);
                try {
                    pchAcceptActDet.insert(now, id);
                } catch (Exception e) {
                    pchAcceptActDet.update(now, id);
                }
            }
            this.pchAcceptActDets = null;
            this.referPchAcceptActDets();
            if (this.pchAcceptActDets != null) {
                for (PchAcceptActDet pchAcceptActDet : this.pchAcceptActDets) {
                    if (!pchAcceptActDet.getTimeStampChange().equals(now)) {
                        pchAcceptActDet.delete();
                    }
                }
            }
        }

        // PCH_ACCEPT_ACT_HEDの登録
        if (this.pchAcceptActHed != null) {
            pchAcceptActHed.setActNo(this.getActNo());
            try {
                pchAcceptActHed.insert(now, id);
            } catch (Exception e) {
                pchAcceptActHed.update(now, id);
            }
        }

        // MFG_KANBAN_ACTの登録
        String sql = "UPDATE MFG_KANBAN_ACT\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"ACT_NO\" = :act_no");
        setList.add("\"KANBAN_ID\" = :kanban_id");
        setList.add("\"SERIAL_NO\" = :serial_no");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"ACT_DATE\" = TO_TIMESTAMP (:act_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_KANBAN_ACT削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_ACCEPT_ACT_DETの削除
        if (this.pchAcceptActDets != null) {
            for (PchAcceptActDet pchAcceptActDet : this.pchAcceptActDets) {
                pchAcceptActDet.delete();
            }
        }

        // PCH_ACCEPT_ACT_HEDの削除
        if (this.pchAcceptActHed != null) {
            this.pchAcceptActHed.delete();
        }

        // MFG_KANBAN_ACTの削除
        String sql = "DELETE FROM MFG_KANBAN_ACT WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"ACT_NO\") = TRIM (:act_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("act_no", this.actNo);
        params.put("kanban_id", this.kanbanId);
        params.put("serial_no", this.serialNo);
        params.put("wc_code", this.wcCode);
        params.put("act_date", this.actDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PCH_ACCEPT_ACT_HED
     */
    private PchAcceptActHed pchAcceptActHed;

    /**
     * @return PCH_ACCEPT_ACT_HED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PchAcceptActHed")
    public PchAcceptActHed getPchAcceptActHed() {
        return this.pchAcceptActHed;
    }

    /**
     * @param p PCH_ACCEPT_ACT_HED
     */
    public void setPchAcceptActHed(final PchAcceptActHed p) {
        this.pchAcceptActHed = p;
    }

    /**
     * @return PCH_ACCEPT_ACT_HED
     */
    public PchAcceptActHed referPchAcceptActHed() {
        if (this.pchAcceptActHed == null) {
            try {
                this.pchAcceptActHed = PchAcceptActHed.get(this.actNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.pchAcceptActHed;
    }

    /**
     * PCH_ACCEPT_ACT_DETのリスト
     */
    private List<PchAcceptActDet> pchAcceptActDets;

    /**
     * @return PCH_ACCEPT_ACT_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PchAcceptActDets")
    public List<PchAcceptActDet> getPchAcceptActDets() {
        return this.pchAcceptActDets;
    }

    /**
     * @param list PCH_ACCEPT_ACT_DETのリスト
     */
    public void setPchAcceptActDets(final List<PchAcceptActDet> list) {
        this.pchAcceptActDets = list;
    }

    /**
     * @param pchAcceptActDet
     */
    public void addPchAcceptActDets(final PchAcceptActDet pchAcceptActDet) {
        if (this.pchAcceptActDets == null) {
            this.pchAcceptActDets = new ArrayList<PchAcceptActDet>();
        }
        this.pchAcceptActDets.add(pchAcceptActDet);
    }

    /**
     * @return PCH_ACCEPT_ACT_DETのリスト
     */
    public List<PchAcceptActDet> referPchAcceptActDets() {
        if (this.pchAcceptActDets == null) {
            this.pchAcceptActDets = MfgKanbanAct.referPchAcceptActDets(this.actNo);
        }
        return this.pchAcceptActDets;
    }

    /**
     * @param param1 actNo
     * @return List<PchAcceptActDet>
     */
    public static List<PchAcceptActDet> referPchAcceptActDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("act_no = :act_no");

        String sql = "SELECT * FROM PCH_ACCEPT_ACT_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("act_no", param1);

        return Queries.select(sql, params, PchAcceptActDet.class);
    }
}
