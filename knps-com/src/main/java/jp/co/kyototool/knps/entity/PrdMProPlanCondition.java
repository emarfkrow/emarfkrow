package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_M_PRO_PLAN_CONDITION
 *
 * @author emarfkrow
 */
public class PrdMProPlanCondition implements IEntity {

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return this.yyyy;
    }

    /**
     * @param o YYYY
     */
    public void setYyyy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yyyy = String.valueOf(o.toString());
        } else {
            this.yyyy = null;
        }
    }

    /** MM */
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return this.mm;
    }

    /**
     * @param o MM
     */
    public void setMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mm = String.valueOf(o.toString());
        } else {
            this.mm = null;
        }
    }

    /** OPE_DAYS */
    private java.math.BigDecimal opeDays;

    /**
     * @return OPE_DAYS
     */
    public java.math.BigDecimal getOpeDays() {
        return this.opeDays;
    }

    /**
     * @param o OPE_DAYS
     */
    public void setOpeDays(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeDays = new java.math.BigDecimal(o.toString());
        } else {
            this.opeDays = null;
        }
    }

    /** FIXED_STATUS */
    private java.math.BigDecimal fixedStatus;

    /**
     * @return FIXED_STATUS
     */
    public java.math.BigDecimal getFixedStatus() {
        return this.fixedStatus;
    }

    /**
     * @param o FIXED_STATUS
     */
    public void setFixedStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fixedStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.fixedStatus = null;
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
     * PRD_M_PRO_PLAN_CONDITION照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @return PRD_M_PRO_PLAN_CONDITION
     */
    public static PrdMProPlanCondition get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");

        String sql = "SELECT * FROM PRD_M_PRO_PLAN_CONDITION WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);

        return Queries.get(sql, params, PrdMProPlanCondition.class);
    }

    /**
     * PRD_M_PRO_PLAN_CONDITION追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MMの採番処理
        numbering();

        // MFG_OBSERVANCE_RATE_INの登録
        if (this.mfgObservanceRateIns != null) {
            for (MfgObservanceRateIn mfgObservanceRateIn : this.mfgObservanceRateIns) {
                mfgObservanceRateIn.setYyyy(this.getYyyy());
                mfgObservanceRateIn.setMm(this.getMm());
                mfgObservanceRateIn.insert(now, id);
            }
        }

        // PRD_MATE_NES_COUNTSの登録
        if (this.prdMateNesCountss != null) {
            for (PrdMateNesCounts prdMateNesCounts : this.prdMateNesCountss) {
                prdMateNesCounts.setYyyy(this.getYyyy());
                prdMateNesCounts.setMm(this.getMm());
                prdMateNesCounts.insert(now, id);
            }
        }

        // PRD_RACK_MAINTEの登録
        if (this.prdRackMaintes != null) {
            for (PrdRackMainte prdRackMainte : this.prdRackMaintes) {
                prdRackMainte.setYyyy(this.getYyyy());
                prdRackMainte.setMm(this.getMm());
                prdRackMainte.insert(now, id);
            }
        }

        // PRD_Y_PRO_PLAN_CONDITIONの登録
        if (this.prdYProPlanCondition != null) {
            this.prdYProPlanCondition.setYyyy(this.getYyyy());
            this.prdYProPlanCondition.setMm(this.getMm());
            this.prdYProPlanCondition.insert(now, id);
        }

        // PRD_M_PRO_PLAN_CONDITIONの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("ope_days -- :ope_days");
        nameList.add("fixed_status -- :fixed_status");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_M_PRO_PLAN_CONDITION(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":ope_days");
        valueList.add(":fixed_status");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** MMの採番処理 */
    private void numbering() {

        if (this.mm != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.MM) IS NULL THEN 0 ELSE MAX(e.MM) * 1 END + 1, 2, '0') AS MM FROM PRD_M_PRO_PLAN_CONDITION e WHERE e.MM < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.YYYY = :yyyy");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yyyy", this.yyyy);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MM");

        this.setMm(o);
    }

    /**
     * PRD_M_PRO_PLAN_CONDITION更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_OBSERVANCE_RATE_INの登録
        if (this.mfgObservanceRateIns != null) {
            for (MfgObservanceRateIn mfgObservanceRateIn : this.mfgObservanceRateIns) {
                mfgObservanceRateIn.setYyyy(this.yyyy);
                mfgObservanceRateIn.setMm(this.mm);
                try {
                    mfgObservanceRateIn.insert(now, id);
                } catch (Exception e) {
                    mfgObservanceRateIn.update(now, id);
                }
            }
            this.mfgObservanceRateIns = null;
            this.referMfgObservanceRateIns();
            if (this.mfgObservanceRateIns != null) {
                for (MfgObservanceRateIn mfgObservanceRateIn : this.mfgObservanceRateIns) {
                    if (!mfgObservanceRateIn.getTimeStampChange().equals(now)) {
                        mfgObservanceRateIn.delete();
                    }
                }
            }
        }

        // PRD_MATE_NES_COUNTSの登録
        if (this.prdMateNesCountss != null) {
            for (PrdMateNesCounts prdMateNesCounts : this.prdMateNesCountss) {
                prdMateNesCounts.setYyyy(this.yyyy);
                prdMateNesCounts.setMm(this.mm);
                try {
                    prdMateNesCounts.insert(now, id);
                } catch (Exception e) {
                    prdMateNesCounts.update(now, id);
                }
            }
            this.prdMateNesCountss = null;
            this.referPrdMateNesCountss();
            if (this.prdMateNesCountss != null) {
                for (PrdMateNesCounts prdMateNesCounts : this.prdMateNesCountss) {
                    if (!prdMateNesCounts.getTimeStampChange().equals(now)) {
                        prdMateNesCounts.delete();
                    }
                }
            }
        }

        // PRD_RACK_MAINTEの登録
        if (this.prdRackMaintes != null) {
            for (PrdRackMainte prdRackMainte : this.prdRackMaintes) {
                prdRackMainte.setYyyy(this.yyyy);
                prdRackMainte.setMm(this.mm);
                try {
                    prdRackMainte.insert(now, id);
                } catch (Exception e) {
                    prdRackMainte.update(now, id);
                }
            }
            this.prdRackMaintes = null;
            this.referPrdRackMaintes();
            if (this.prdRackMaintes != null) {
                for (PrdRackMainte prdRackMainte : this.prdRackMaintes) {
                    if (!prdRackMainte.getTimeStampChange().equals(now)) {
                        prdRackMainte.delete();
                    }
                }
            }
        }

        // PRD_Y_PRO_PLAN_CONDITIONの登録
        if (this.prdYProPlanCondition != null) {
            prdYProPlanCondition.setYyyy(this.getYyyy());
            prdYProPlanCondition.setMm(this.getMm());
            try {
                prdYProPlanCondition.insert(now, id);
            } catch (Exception e) {
                prdYProPlanCondition.update(now, id);
            }
        }

        // PRD_M_PRO_PLAN_CONDITIONの登録
        String sql = "UPDATE PRD_M_PRO_PLAN_CONDITION\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("ope_days = :ope_days");
        setList.add("fixed_status = :fixed_status");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_M_PRO_PLAN_CONDITION削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_OBSERVANCE_RATE_INの削除
        if (this.mfgObservanceRateIns != null) {
            for (MfgObservanceRateIn mfgObservanceRateIn : this.mfgObservanceRateIns) {
                mfgObservanceRateIn.delete();
            }
        }

        // PRD_MATE_NES_COUNTSの削除
        if (this.prdMateNesCountss != null) {
            for (PrdMateNesCounts prdMateNesCounts : this.prdMateNesCountss) {
                prdMateNesCounts.delete();
            }
        }

        // PRD_RACK_MAINTEの削除
        if (this.prdRackMaintes != null) {
            for (PrdRackMainte prdRackMainte : this.prdRackMaintes) {
                prdRackMainte.delete();
            }
        }

        // PRD_Y_PRO_PLAN_CONDITIONの削除
        if (this.prdYProPlanCondition != null) {
            this.prdYProPlanCondition.delete();
        }

        // PRD_M_PRO_PLAN_CONDITIONの削除
        String sql = "DELETE FROM PRD_M_PRO_PLAN_CONDITION WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("OPE_DAYS", this.opeDays);
        params.put("FIXED_STATUS", this.fixedStatus);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_Y_PRO_PLAN_CONDITION
     */
    private PrdYProPlanCondition prdYProPlanCondition;

    /**
     * @return PRD_Y_PRO_PLAN_CONDITION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdYProPlanCondition")
    public PrdYProPlanCondition getPrdYProPlanCondition() {
        return this.prdYProPlanCondition;
    }

    /**
     * @param p PRD_Y_PRO_PLAN_CONDITION
     */
    public void setPrdYProPlanCondition(final PrdYProPlanCondition p) {
        this.prdYProPlanCondition = p;
    }

    /**
     * @return PRD_Y_PRO_PLAN_CONDITION
     */
    public PrdYProPlanCondition referPrdYProPlanCondition() {
        if (this.prdYProPlanCondition == null) {
            try {
                this.prdYProPlanCondition = PrdYProPlanCondition.get(this.yyyy, this.mm);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdYProPlanCondition;
    }

    /**
     * MFG_OBSERVANCE_RATE_INのリスト
     */
    private List<MfgObservanceRateIn> mfgObservanceRateIns;

    /**
     * @return MFG_OBSERVANCE_RATE_INのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgObservanceRateIns")
    public List<MfgObservanceRateIn> getMfgObservanceRateIns() {
        return this.mfgObservanceRateIns;
    }

    /**
     * @param list MFG_OBSERVANCE_RATE_INのリスト
     */
    public void setMfgObservanceRateIns(final List<MfgObservanceRateIn> list) {
        this.mfgObservanceRateIns = list;
    }

    /**
     * @param mfgObservanceRateIn
     */
    public void addMfgObservanceRateIns(final MfgObservanceRateIn mfgObservanceRateIn) {
        if (this.mfgObservanceRateIns == null) {
            this.mfgObservanceRateIns = new ArrayList<MfgObservanceRateIn>();
        }
        this.mfgObservanceRateIns.add(mfgObservanceRateIn);
    }

    /**
     * @return MFG_OBSERVANCE_RATE_INのリスト
     */
    public List<MfgObservanceRateIn> referMfgObservanceRateIns() {
        if (this.mfgObservanceRateIns == null) {
            this.mfgObservanceRateIns = PrdMProPlanCondition.referMfgObservanceRateIns(this.yyyy, this.mm);
        }
        return this.mfgObservanceRateIns;
    }

    /**
     * @param param1 yyyy
     * @param param2 mm
     * @return List<MfgObservanceRateIn>
     */
    public static List<MfgObservanceRateIn> referMfgObservanceRateIns(final String param1, final String param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("yyyy = :yyyy");
        whereList.add("mm = :mm");

        String sql = "SELECT * FROM MFG_OBSERVANCE_RATE_IN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);

        return Queries.select(sql, params, MfgObservanceRateIn.class);
    }

    /**
     * PRD_MATE_NES_COUNTSのリスト
     */
    private List<PrdMateNesCounts> prdMateNesCountss;

    /**
     * @return PRD_MATE_NES_COUNTSのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdMateNesCountss")
    public List<PrdMateNesCounts> getPrdMateNesCountss() {
        return this.prdMateNesCountss;
    }

    /**
     * @param list PRD_MATE_NES_COUNTSのリスト
     */
    public void setPrdMateNesCountss(final List<PrdMateNesCounts> list) {
        this.prdMateNesCountss = list;
    }

    /**
     * @param prdMateNesCounts
     */
    public void addPrdMateNesCountss(final PrdMateNesCounts prdMateNesCounts) {
        if (this.prdMateNesCountss == null) {
            this.prdMateNesCountss = new ArrayList<PrdMateNesCounts>();
        }
        this.prdMateNesCountss.add(prdMateNesCounts);
    }

    /**
     * @return PRD_MATE_NES_COUNTSのリスト
     */
    public List<PrdMateNesCounts> referPrdMateNesCountss() {
        if (this.prdMateNesCountss == null) {
            this.prdMateNesCountss = PrdMProPlanCondition.referPrdMateNesCountss(this.yyyy, this.mm);
        }
        return this.prdMateNesCountss;
    }

    /**
     * @param param1 yyyy
     * @param param2 mm
     * @return List<PrdMateNesCounts>
     */
    public static List<PrdMateNesCounts> referPrdMateNesCountss(final String param1, final String param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("yyyy = :yyyy");
        whereList.add("mm = :mm");

        String sql = "SELECT * FROM PRD_MATE_NES_COUNTS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);

        return Queries.select(sql, params, PrdMateNesCounts.class);
    }

    /**
     * PRD_RACK_MAINTEのリスト
     */
    private List<PrdRackMainte> prdRackMaintes;

    /**
     * @return PRD_RACK_MAINTEのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdRackMaintes")
    public List<PrdRackMainte> getPrdRackMaintes() {
        return this.prdRackMaintes;
    }

    /**
     * @param list PRD_RACK_MAINTEのリスト
     */
    public void setPrdRackMaintes(final List<PrdRackMainte> list) {
        this.prdRackMaintes = list;
    }

    /**
     * @param prdRackMainte
     */
    public void addPrdRackMaintes(final PrdRackMainte prdRackMainte) {
        if (this.prdRackMaintes == null) {
            this.prdRackMaintes = new ArrayList<PrdRackMainte>();
        }
        this.prdRackMaintes.add(prdRackMainte);
    }

    /**
     * @return PRD_RACK_MAINTEのリスト
     */
    public List<PrdRackMainte> referPrdRackMaintes() {
        if (this.prdRackMaintes == null) {
            this.prdRackMaintes = PrdMProPlanCondition.referPrdRackMaintes(this.yyyy, this.mm);
        }
        return this.prdRackMaintes;
    }

    /**
     * @param param1 yyyy
     * @param param2 mm
     * @return List<PrdRackMainte>
     */
    public static List<PrdRackMainte> referPrdRackMaintes(final String param1, final String param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("yyyy = :yyyy");
        whereList.add("mm = :mm");

        String sql = "SELECT * FROM PRD_RACK_MAINTE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);

        return Queries.select(sql, params, PrdRackMainte.class);
    }
}
