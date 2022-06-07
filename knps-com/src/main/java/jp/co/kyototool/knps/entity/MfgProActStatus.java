package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_PRO_ACT_STATUS
 *
 * @author emarfkrow
 */
public class MfgProActStatus implements IEntity {

    /** CHILD_PLAN_NO */
    private String childPlanNo;

    /**
     * @return CHILD_PLAN_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHILD_PLAN_NO")
    public String getChildPlanNo() {
        return this.childPlanNo;
    }

    /**
     * @param o CHILD_PLAN_NO
     */
    public void setChildPlanNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.childPlanNo = String.valueOf(o.toString());
        } else {
            this.childPlanNo = null;
        }
    }

    /** PRO_NO */
    private String proNo;

    /**
     * @return PRO_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_NO")
    public String getProNo() {
        return this.proNo;
    }

    /**
     * @param o PRO_NO
     */
    public void setProNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proNo = String.valueOf(o.toString());
        } else {
            this.proNo = null;
        }
    }

    /** ACT_STATUS */
    private java.math.BigDecimal actStatus;

    /**
     * @return ACT_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_STATUS")
    public java.math.BigDecimal getActStatus() {
        return this.actStatus;
    }

    /**
     * @param o ACT_STATUS
     */
    public void setActStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.actStatus = null;
        }
    }

    /** USER_ID */
    private String userId;

    /**
     * @return USER_ID
     */
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID")
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param o USER_ID
     */
    public void setUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userId = String.valueOf(o.toString());
        } else {
            this.userId = null;
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

    /**
     * MFG_PRO_ACT_STATUS照会
     *
     * @param param1 CHILD_PLAN_NO
     * @return MFG_PRO_ACT_STATUS
     */
    public static MfgProActStatus get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"CHILD_PLAN_NO\") = TRIM (:child_plan_no)");

        String sql = "SELECT * FROM MFG_PRO_ACT_STATUS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("child_plan_no", param1);

        return Queries.get(sql, params, MfgProActStatus.class);
    }

    /**
     * MFG_PRO_ACT_STATUS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // CHILD_PLAN_NOの採番処理
        numbering();

        // PRD_DAILY_PRO_PLAN_DETAILの登録
        if (this.prdDailyProPlanDetail != null) {
            this.prdDailyProPlanDetail.setChildPlanNo(this.getChildPlanNo());
            this.prdDailyProPlanDetail.insert(now, id);
        }

        // MFG_PRO_ACT_STATUSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"CHILD_PLAN_NO\" -- :child_plan_no");
        nameList.add("\"PRO_NO\" -- :pro_no");
        nameList.add("\"ACT_STATUS\" -- :act_status");
        nameList.add("\"USER_ID\" -- :user_id");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_PRO_ACT_STATUS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":child_plan_no");
        valueList.add(":pro_no");
        valueList.add(":act_status");
        valueList.add(":user_id");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join("\r\n    , ", valueList);
    }

    /** CHILD_PLAN_NOの採番処理 */
    private void numbering() {

        if (this.childPlanNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"CHILD_PLAN_NO\") IS NULL THEN 0 ELSE MAX(e.\"CHILD_PLAN_NO\") * 1 END + 1, 12, '0') AS \"CHILD_PLAN_NO\" FROM MFG_PRO_ACT_STATUS e WHERE e.\"CHILD_PLAN_NO\" < '999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("CHILD_PLAN_NO");

        this.setChildPlanNo(o);
    }

    /**
     * MFG_PRO_ACT_STATUS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_DAILY_PRO_PLAN_DETAILの登録
        if (this.prdDailyProPlanDetail != null) {
            prdDailyProPlanDetail.setChildPlanNo(this.getChildPlanNo());
            try {
                prdDailyProPlanDetail.insert(now, id);
            } catch (Exception e) {
                prdDailyProPlanDetail.update(now, id);
            }
        }

        // MFG_PRO_ACT_STATUSの登録
        String sql = "UPDATE MFG_PRO_ACT_STATUS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"CHILD_PLAN_NO\" = :child_plan_no");
        setList.add("\"PRO_NO\" = :pro_no");
        setList.add("\"ACT_STATUS\" = :act_status");
        setList.add("\"USER_ID\" = :user_id");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_PRO_ACT_STATUS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_DAILY_PRO_PLAN_DETAILの削除
        if (this.prdDailyProPlanDetail != null) {
            this.prdDailyProPlanDetail.delete();
        }

        // MFG_PRO_ACT_STATUSの削除
        String sql = "DELETE FROM MFG_PRO_ACT_STATUS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"CHILD_PLAN_NO\") = TRIM (:child_plan_no)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("child_plan_no", this.childPlanNo);
        params.put("pro_no", this.proNo);
        params.put("act_status", this.actStatus);
        params.put("user_id", this.userId);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_DAILY_PRO_PLAN_DETAIL
     */
    private PrdDailyProPlanDetail prdDailyProPlanDetail;

    /**
     * @return PRD_DAILY_PRO_PLAN_DETAIL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdDailyProPlanDetail")
    public PrdDailyProPlanDetail getPrdDailyProPlanDetail() {
        return this.prdDailyProPlanDetail;
    }

    /**
     * @param p PRD_DAILY_PRO_PLAN_DETAIL
     */
    public void setPrdDailyProPlanDetail(final PrdDailyProPlanDetail p) {
        this.prdDailyProPlanDetail = p;
    }

    /**
     * @return PRD_DAILY_PRO_PLAN_DETAIL
     */
    public PrdDailyProPlanDetail referPrdDailyProPlanDetail() {
        if (this.prdDailyProPlanDetail == null) {
            try {
                this.prdDailyProPlanDetail = PrdDailyProPlanDetail.get(this.childPlanNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdDailyProPlanDetail;
    }
}
