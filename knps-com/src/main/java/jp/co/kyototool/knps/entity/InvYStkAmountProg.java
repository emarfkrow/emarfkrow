package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_Y_STK_AMOUNT_PROG
 *
 * @author emarfkrow
 */
public class InvYStkAmountProg implements IEntity {

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

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
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

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
    public java.math.BigDecimal getRouting() {
        return this.routing;
    }

    /**
     * @param o ROUTING
     */
    public void setRouting(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routing = new java.math.BigDecimal(o.toString());
        } else {
            this.routing = null;
        }
    }

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
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

    /** OPE_DETAIL */
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return this.opeDetail;
    }

    /**
     * @param o OPE_DETAIL
     */
    public void setOpeDetail(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeDetail = String.valueOf(o.toString());
        } else {
            this.opeDetail = null;
        }
    }

    /** NES_COUNTS */
    private java.math.BigDecimal nesCounts;

    /**
     * @return NES_COUNTS
     */
    public java.math.BigDecimal getNesCounts() {
        return this.nesCounts;
    }

    /**
     * @param o NES_COUNTS
     */
    public void setNesCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nesCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.nesCounts = null;
        }
    }

    /** ROU_AMOUNT */
    private java.math.BigDecimal rouAmount;

    /**
     * @return ROU_AMOUNT
     */
    public java.math.BigDecimal getRouAmount() {
        return this.rouAmount;
    }

    /**
     * @param o ROU_AMOUNT
     */
    public void setRouAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rouAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.rouAmount = null;
        }
    }

    /** ROU_LT */
    private java.math.BigDecimal rouLt;

    /**
     * @return ROU_LT
     */
    public java.math.BigDecimal getRouLt() {
        return this.rouLt;
    }

    /**
     * @param o ROU_LT
     */
    public void setRouLt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rouLt = new java.math.BigDecimal(o.toString());
        } else {
            this.rouLt = null;
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
     * INV_Y_STK_AMOUNT_PROG照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @param param3 HINBAN
     * @param param4 ROUTING
     * @return INV_Y_STK_AMOUNT_PROG
     */
    public static InvYStkAmountProg get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("routing = :routing");

        String sql = "SELECT * FROM INV_Y_STK_AMOUNT_PROG WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("hinban", param3);
        params.put("routing", param4);

        return Queries.get(sql, params, InvYStkAmountProg.class);
    }

    /**
     * INV_Y_STK_AMOUNT_PROG追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_M_SUP_BUDGET_OUTの登録
        if (this.prdMSupBudgetOut != null) {
            this.prdMSupBudgetOut.setYyyy(this.getYyyy());
            this.prdMSupBudgetOut.setMm(this.getMm());
            this.prdMSupBudgetOut.setHinban(this.getHinban());
            this.prdMSupBudgetOut.setRouting(this.getRouting());
            this.prdMSupBudgetOut.insert(now, id);
        }

        // PRD_STORE_MAINTEの登録
        if (this.prdStoreMainte != null) {
            this.prdStoreMainte.setYyyy(this.getYyyy());
            this.prdStoreMainte.setMm(this.getMm());
            this.prdStoreMainte.setHinban(this.getHinban());
            this.prdStoreMainte.setRouting(this.getRouting());
            this.prdStoreMainte.insert(now, id);
        }

        // PRD_Y_SUP_BUDGET_OUTの登録
        if (this.prdYSupBudgetOut != null) {
            this.prdYSupBudgetOut.setYyyy(this.getYyyy());
            this.prdYSupBudgetOut.setMm(this.getMm());
            this.prdYSupBudgetOut.setHinban(this.getHinban());
            this.prdYSupBudgetOut.setRouting(this.getRouting());
            this.prdYSupBudgetOut.insert(now, id);
        }

        // INV_Y_STK_AMOUNT_PROGの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("hinban -- :hinban");
        nameList.add("routing -- :routing");
        nameList.add("wc_code -- :wc_code");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("nes_counts -- :nes_counts");
        nameList.add("rou_amount -- :rou_amount");
        nameList.add("rou_lt -- :rou_lt");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_Y_STK_AMOUNT_PROG(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":hinban");
        valueList.add(":routing");
        valueList.add(":wc_code");
        valueList.add(":ope_detail");
        valueList.add(":nes_counts");
        valueList.add(":rou_amount");
        valueList.add(":rou_lt");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_Y_STK_AMOUNT_PROG更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_M_SUP_BUDGET_OUTの登録
        if (this.prdMSupBudgetOut != null) {
            prdMSupBudgetOut.setYyyy(this.getYyyy());
            prdMSupBudgetOut.setMm(this.getMm());
            prdMSupBudgetOut.setHinban(this.getHinban());
            prdMSupBudgetOut.setRouting(this.getRouting());
            try {
                prdMSupBudgetOut.insert(now, id);
            } catch (Exception e) {
                prdMSupBudgetOut.update(now, id);
            }
        }

        // PRD_STORE_MAINTEの登録
        if (this.prdStoreMainte != null) {
            prdStoreMainte.setYyyy(this.getYyyy());
            prdStoreMainte.setMm(this.getMm());
            prdStoreMainte.setHinban(this.getHinban());
            prdStoreMainte.setRouting(this.getRouting());
            try {
                prdStoreMainte.insert(now, id);
            } catch (Exception e) {
                prdStoreMainte.update(now, id);
            }
        }

        // PRD_Y_SUP_BUDGET_OUTの登録
        if (this.prdYSupBudgetOut != null) {
            prdYSupBudgetOut.setYyyy(this.getYyyy());
            prdYSupBudgetOut.setMm(this.getMm());
            prdYSupBudgetOut.setHinban(this.getHinban());
            prdYSupBudgetOut.setRouting(this.getRouting());
            try {
                prdYSupBudgetOut.insert(now, id);
            } catch (Exception e) {
                prdYSupBudgetOut.update(now, id);
            }
        }

        // INV_Y_STK_AMOUNT_PROGの登録
        String sql = "UPDATE INV_Y_STK_AMOUNT_PROG\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("hinban = :hinban");
        setList.add("routing = :routing");
        setList.add("wc_code = :wc_code");
        setList.add("ope_detail = :ope_detail");
        setList.add("nes_counts = :nes_counts");
        setList.add("rou_amount = :rou_amount");
        setList.add("rou_lt = :rou_lt");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_Y_STK_AMOUNT_PROG削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_M_SUP_BUDGET_OUTの削除
        if (this.prdMSupBudgetOut != null) {
            this.prdMSupBudgetOut.delete();
        }

        // PRD_STORE_MAINTEの削除
        if (this.prdStoreMainte != null) {
            this.prdStoreMainte.delete();
        }

        // PRD_Y_SUP_BUDGET_OUTの削除
        if (this.prdYSupBudgetOut != null) {
            this.prdYSupBudgetOut.delete();
        }

        // INV_Y_STK_AMOUNT_PROGの削除
        String sql = "DELETE FROM INV_Y_STK_AMOUNT_PROG WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("routing = :routing");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("HINBAN", this.hinban);
        params.put("ROUTING", this.routing);
        params.put("WC_CODE", this.wcCode);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("NES_COUNTS", this.nesCounts);
        params.put("ROU_AMOUNT", this.rouAmount);
        params.put("ROU_LT", this.rouLt);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_M_SUP_BUDGET_OUT
     */
    private PrdMSupBudgetOut prdMSupBudgetOut;

    /**
     * @return PRD_M_SUP_BUDGET_OUT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdMSupBudgetOut")
    public PrdMSupBudgetOut getPrdMSupBudgetOut() {
        return this.prdMSupBudgetOut;
    }

    /**
     * @param p PRD_M_SUP_BUDGET_OUT
     */
    public void setPrdMSupBudgetOut(final PrdMSupBudgetOut p) {
        this.prdMSupBudgetOut = p;
    }

    /**
     * @return PRD_M_SUP_BUDGET_OUT
     */
    public PrdMSupBudgetOut referPrdMSupBudgetOut() {
        if (this.prdMSupBudgetOut == null) {
            try {
                this.prdMSupBudgetOut = PrdMSupBudgetOut.get(this.yyyy, this.mm, this.hinban, this.routing);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdMSupBudgetOut;
    }

    /**
     * PRD_STORE_MAINTE
     */
    private PrdStoreMainte prdStoreMainte;

    /**
     * @return PRD_STORE_MAINTE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdStoreMainte")
    public PrdStoreMainte getPrdStoreMainte() {
        return this.prdStoreMainte;
    }

    /**
     * @param p PRD_STORE_MAINTE
     */
    public void setPrdStoreMainte(final PrdStoreMainte p) {
        this.prdStoreMainte = p;
    }

    /**
     * @return PRD_STORE_MAINTE
     */
    public PrdStoreMainte referPrdStoreMainte() {
        if (this.prdStoreMainte == null) {
            try {
                this.prdStoreMainte = PrdStoreMainte.get(this.yyyy, this.mm, this.hinban, this.routing);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdStoreMainte;
    }

    /**
     * PRD_Y_SUP_BUDGET_OUT
     */
    private PrdYSupBudgetOut prdYSupBudgetOut;

    /**
     * @return PRD_Y_SUP_BUDGET_OUT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdYSupBudgetOut")
    public PrdYSupBudgetOut getPrdYSupBudgetOut() {
        return this.prdYSupBudgetOut;
    }

    /**
     * @param p PRD_Y_SUP_BUDGET_OUT
     */
    public void setPrdYSupBudgetOut(final PrdYSupBudgetOut p) {
        this.prdYSupBudgetOut = p;
    }

    /**
     * @return PRD_Y_SUP_BUDGET_OUT
     */
    public PrdYSupBudgetOut referPrdYSupBudgetOut() {
        if (this.prdYSupBudgetOut == null) {
            try {
                this.prdYSupBudgetOut = PrdYSupBudgetOut.get(this.yyyy, this.mm, this.hinban, this.routing);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdYSupBudgetOut;
    }
}
