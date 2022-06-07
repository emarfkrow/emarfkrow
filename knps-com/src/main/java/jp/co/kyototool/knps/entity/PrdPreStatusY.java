package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_PRE_STATUS_Y
 *
 * @author emarfkrow
 */
public class PrdPreStatusY implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YY")
    public String getYy() {
        return this.yy;
    }

    /**
     * @param o YY
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = String.valueOf(o.toString());
        } else {
            this.yy = null;
        }
    }

    /** SALES_TARGET_STATUS */
    private java.math.BigDecimal salesTargetStatus;

    /**
     * @return SALES_TARGET_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SALES_TARGET_STATUS")
    public java.math.BigDecimal getSalesTargetStatus() {
        return this.salesTargetStatus;
    }

    /**
     * @param o SALES_TARGET_STATUS
     */
    public void setSalesTargetStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.salesTargetStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.salesTargetStatus = null;
        }
    }

    /** PRD_PLAN_MAKE_STATUS */
    private java.math.BigDecimal prdPlanMakeStatus;

    /**
     * @return PRD_PLAN_MAKE_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRD_PLAN_MAKE_STATUS")
    public java.math.BigDecimal getPrdPlanMakeStatus() {
        return this.prdPlanMakeStatus;
    }

    /**
     * @param o PRD_PLAN_MAKE_STATUS
     */
    public void setPrdPlanMakeStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.prdPlanMakeStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.prdPlanMakeStatus = null;
        }
    }

    /** PRD_PLAN_FIXED_STATUS */
    private java.math.BigDecimal prdPlanFixedStatus;

    /**
     * @return PRD_PLAN_FIXED_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRD_PLAN_FIXED_STATUS")
    public java.math.BigDecimal getPrdPlanFixedStatus() {
        return this.prdPlanFixedStatus;
    }

    /**
     * @param o PRD_PLAN_FIXED_STATUS
     */
    public void setPrdPlanFixedStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.prdPlanFixedStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.prdPlanFixedStatus = null;
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
     * PRD_PRE_STATUS_Y照会
     *
     * @param param1 YY
     * @return PRD_PRE_STATUS_Y
     */
    public static PrdPreStatusY get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM PRD_PRE_STATUS_Y WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", param1);

        return Queries.get(sql, params, PrdPreStatusY.class);
    }

    /**
     * PRD_PRE_STATUS_Y追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MFG_RATE_BKの登録
        if (this.mfgRateBks != null) {
            for (MfgRateBk mfgRateBk : this.mfgRateBks) {
                mfgRateBk.setYy(this.getYy());
                mfgRateBk.insert(now, id);
            }
        }

        // PRD_PRE_STATUS_Mの登録
        if (this.prdPreStatusMs != null) {
            for (PrdPreStatusM prdPreStatusM : this.prdPreStatusMs) {
                prdPreStatusM.setYy(this.getYy());
                prdPreStatusM.insert(now, id);
            }
        }

        // PRD_PRE_STATUS_Yの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"SALES_TARGET_STATUS\" -- :sales_target_status");
        nameList.add("\"PRD_PLAN_MAKE_STATUS\" -- :prd_plan_make_status");
        nameList.add("\"PRD_PLAN_FIXED_STATUS\" -- :prd_plan_fixed_status");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_PRE_STATUS_Y(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":sales_target_status");
        valueList.add(":prd_plan_make_status");
        valueList.add(":prd_plan_fixed_status");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"YY\") IS NULL THEN 0 ELSE MAX(e.\"YY\") * 1 END + 1, 4, '0') AS \"YY\" FROM PRD_PRE_STATUS_Y e WHERE e.\"YY\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * PRD_PRE_STATUS_Y更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_RATE_BKの登録
        if (this.mfgRateBks != null) {
            for (MfgRateBk mfgRateBk : this.mfgRateBks) {
                mfgRateBk.setYy(this.yy);
                try {
                    mfgRateBk.insert(now, id);
                } catch (Exception e) {
                    mfgRateBk.update(now, id);
                }
            }
            this.mfgRateBks = null;
            this.referMfgRateBks();
            if (this.mfgRateBks != null) {
                for (MfgRateBk mfgRateBk : this.mfgRateBks) {
                    if (!mfgRateBk.getTimeStampChange().equals(now)) {
                        mfgRateBk.delete();
                    }
                }
            }
        }

        // PRD_PRE_STATUS_Mの登録
        if (this.prdPreStatusMs != null) {
            for (PrdPreStatusM prdPreStatusM : this.prdPreStatusMs) {
                prdPreStatusM.setYy(this.yy);
                try {
                    prdPreStatusM.insert(now, id);
                } catch (Exception e) {
                    prdPreStatusM.update(now, id);
                }
            }
            this.prdPreStatusMs = null;
            this.referPrdPreStatusMs();
            if (this.prdPreStatusMs != null) {
                for (PrdPreStatusM prdPreStatusM : this.prdPreStatusMs) {
                    if (!prdPreStatusM.getTimeStampChange().equals(now)) {
                        prdPreStatusM.delete();
                    }
                }
            }
        }

        // PRD_PRE_STATUS_Yの登録
        String sql = "UPDATE PRD_PRE_STATUS_Y\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"SALES_TARGET_STATUS\" = :sales_target_status");
        setList.add("\"PRD_PLAN_MAKE_STATUS\" = :prd_plan_make_status");
        setList.add("\"PRD_PLAN_FIXED_STATUS\" = :prd_plan_fixed_status");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_PRE_STATUS_Y削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_RATE_BKの削除
        if (this.mfgRateBks != null) {
            for (MfgRateBk mfgRateBk : this.mfgRateBks) {
                mfgRateBk.delete();
            }
        }

        // PRD_PRE_STATUS_Mの削除
        if (this.prdPreStatusMs != null) {
            for (PrdPreStatusM prdPreStatusM : this.prdPreStatusMs) {
                prdPreStatusM.delete();
            }
        }

        // PRD_PRE_STATUS_Yの削除
        String sql = "DELETE FROM PRD_PRE_STATUS_Y WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("sales_target_status", this.salesTargetStatus);
        params.put("prd_plan_make_status", this.prdPlanMakeStatus);
        params.put("prd_plan_fixed_status", this.prdPlanFixedStatus);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_RATE_BKのリスト
     */
    private List<MfgRateBk> mfgRateBks;

    /**
     * @return MFG_RATE_BKのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgRateBks")
    public List<MfgRateBk> getMfgRateBks() {
        return this.mfgRateBks;
    }

    /**
     * @param list MFG_RATE_BKのリスト
     */
    public void setMfgRateBks(final List<MfgRateBk> list) {
        this.mfgRateBks = list;
    }

    /**
     * @param mfgRateBk
     */
    public void addMfgRateBks(final MfgRateBk mfgRateBk) {
        if (this.mfgRateBks == null) {
            this.mfgRateBks = new ArrayList<MfgRateBk>();
        }
        this.mfgRateBks.add(mfgRateBk);
    }

    /**
     * @return MFG_RATE_BKのリスト
     */
    public List<MfgRateBk> referMfgRateBks() {
        if (this.mfgRateBks == null) {
            this.mfgRateBks = PrdPreStatusY.referMfgRateBks(this.yy);
        }
        return this.mfgRateBks;
    }

    /**
     * @param param1 yy
     * @return List<MfgRateBk>
     */
    public static List<MfgRateBk> referMfgRateBks(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("yy = :yy");

        String sql = "SELECT * FROM MFG_RATE_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", param1);

        return Queries.select(sql, params, MfgRateBk.class);
    }

    /**
     * PRD_PRE_STATUS_Mのリスト
     */
    private List<PrdPreStatusM> prdPreStatusMs;

    /**
     * @return PRD_PRE_STATUS_Mのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdPreStatusMs")
    public List<PrdPreStatusM> getPrdPreStatusMs() {
        return this.prdPreStatusMs;
    }

    /**
     * @param list PRD_PRE_STATUS_Mのリスト
     */
    public void setPrdPreStatusMs(final List<PrdPreStatusM> list) {
        this.prdPreStatusMs = list;
    }

    /**
     * @param prdPreStatusM
     */
    public void addPrdPreStatusMs(final PrdPreStatusM prdPreStatusM) {
        if (this.prdPreStatusMs == null) {
            this.prdPreStatusMs = new ArrayList<PrdPreStatusM>();
        }
        this.prdPreStatusMs.add(prdPreStatusM);
    }

    /**
     * @return PRD_PRE_STATUS_Mのリスト
     */
    public List<PrdPreStatusM> referPrdPreStatusMs() {
        if (this.prdPreStatusMs == null) {
            this.prdPreStatusMs = PrdPreStatusY.referPrdPreStatusMs(this.yy);
        }
        return this.prdPreStatusMs;
    }

    /**
     * @param param1 yy
     * @return List<PrdPreStatusM>
     */
    public static List<PrdPreStatusM> referPrdPreStatusMs(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("yy = :yy");

        String sql = "SELECT * FROM PRD_PRE_STATUS_M WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", param1);

        return Queries.select(sql, params, PrdPreStatusM.class);
    }
}
