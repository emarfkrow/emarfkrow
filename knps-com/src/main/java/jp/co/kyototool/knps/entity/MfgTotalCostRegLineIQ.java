package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_TOTAL_COST_REG_LINE_I_Q
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineIQ implements IEntity {

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

    /** MM */
    private String mm;

    /**
     * @return MM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MM")
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

    /** PRO_GROUP_NO */
    private java.math.BigDecimal proGroupNo;

    /**
     * @return PRO_GROUP_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_GROUP_NO")
    public java.math.BigDecimal getProGroupNo() {
        return this.proGroupNo;
    }

    /**
     * @param o PRO_GROUP_NO
     */
    public void setProGroupNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proGroupNo = new java.math.BigDecimal(o.toString());
        } else {
            this.proGroupNo = null;
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

    /** ROUTING */
    private java.math.BigDecimal routing;

    /**
     * @return ROUTING
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING")
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

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_CODE")
    public String getSupCode() {
        return this.supCode;
    }

    /**
     * @param o SUP_CODE
     */
    public void setSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supCode = String.valueOf(o.toString());
        } else {
            this.supCode = null;
        }
    }

    /** OPE_DETAIL */
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_DETAIL")
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

    /** LAST_ROUTING_KBN */
    private java.math.BigDecimal lastRoutingKbn;

    /**
     * @return LAST_ROUTING_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LAST_ROUTING_KBN")
    public java.math.BigDecimal getLastRoutingKbn() {
        return this.lastRoutingKbn;
    }

    /**
     * @param o LAST_ROUTING_KBN
     */
    public void setLastRoutingKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lastRoutingKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.lastRoutingKbn = null;
        }
    }

    /** TOTAL_COST_TARGET_FLAG */
    private java.math.BigDecimal totalCostTargetFlag;

    /**
     * @return TOTAL_COST_TARGET_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOTAL_COST_TARGET_FLAG")
    public java.math.BigDecimal getTotalCostTargetFlag() {
        return this.totalCostTargetFlag;
    }

    /**
     * @param o TOTAL_COST_TARGET_FLAG
     */
    public void setTotalCostTargetFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.totalCostTargetFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.totalCostTargetFlag = null;
        }
    }

    /** COST_RATE_KBN */
    private java.math.BigDecimal costRateKbn;

    /**
     * @return COST_RATE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COST_RATE_KBN")
    public java.math.BigDecimal getCostRateKbn() {
        return this.costRateKbn;
    }

    /**
     * @param o COST_RATE_KBN
     */
    public void setCostRateKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costRateKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.costRateKbn = null;
        }
    }

    /** UNIT_COST_FIRST */
    private java.math.BigDecimal unitCostFirst;

    /**
     * @return UNIT_COST_FIRST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_COST_FIRST")
    public java.math.BigDecimal getUnitCostFirst() {
        return this.unitCostFirst;
    }

    /**
     * @param o UNIT_COST_FIRST
     */
    public void setUnitCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.unitCostFirst = null;
        }
    }

    /** UNIT_COST_SECOND */
    private java.math.BigDecimal unitCostSecond;

    /**
     * @return UNIT_COST_SECOND
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_COST_SECOND")
    public java.math.BigDecimal getUnitCostSecond() {
        return this.unitCostSecond;
    }

    /**
     * @param o UNIT_COST_SECOND
     */
    public void setUnitCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.unitCostSecond = null;
        }
    }

    /** TOTAL_UNIT_COST */
    private java.math.BigDecimal totalUnitCost;

    /**
     * @return TOTAL_UNIT_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOTAL_UNIT_COST")
    public java.math.BigDecimal getTotalUnitCost() {
        return this.totalUnitCost;
    }

    /**
     * @param o TOTAL_UNIT_COST
     */
    public void setTotalUnitCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.totalUnitCost = new java.math.BigDecimal(o.toString());
        } else {
            this.totalUnitCost = null;
        }
    }

    /** SUM_COST_FIRST */
    private java.math.BigDecimal sumCostFirst;

    /**
     * @return SUM_COST_FIRST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUM_COST_FIRST")
    public java.math.BigDecimal getSumCostFirst() {
        return this.sumCostFirst;
    }

    /**
     * @param o SUM_COST_FIRST
     */
    public void setSumCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.sumCostFirst = null;
        }
    }

    /** SUM_COST_SECOND */
    private java.math.BigDecimal sumCostSecond;

    /**
     * @return SUM_COST_SECOND
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUM_COST_SECOND")
    public java.math.BigDecimal getSumCostSecond() {
        return this.sumCostSecond;
    }

    /**
     * @param o SUM_COST_SECOND
     */
    public void setSumCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.sumCostSecond = null;
        }
    }

    /** TOTAL_SUM_COST */
    private java.math.BigDecimal totalSumCost;

    /**
     * @return TOTAL_SUM_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOTAL_SUM_COST")
    public java.math.BigDecimal getTotalSumCost() {
        return this.totalSumCost;
    }

    /**
     * @param o TOTAL_SUM_COST
     */
    public void setTotalSumCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.totalSumCost = new java.math.BigDecimal(o.toString());
        } else {
            this.totalSumCost = null;
        }
    }

    /** OPE_COUNTS */
    private java.math.BigDecimal opeCounts;

    /**
     * @return OPE_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_COUNTS")
    public java.math.BigDecimal getOpeCounts() {
        return this.opeCounts;
    }

    /**
     * @param o OPE_COUNTS
     */
    public void setOpeCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.opeCounts = null;
        }
    }

    /** OPE_AMOUNTS */
    private java.math.BigDecimal opeAmounts;

    /**
     * @return OPE_AMOUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_AMOUNTS")
    public java.math.BigDecimal getOpeAmounts() {
        return this.opeAmounts;
    }

    /**
     * @param o OPE_AMOUNTS
     */
    public void setOpeAmounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeAmounts = new java.math.BigDecimal(o.toString());
        } else {
            this.opeAmounts = null;
        }
    }

    /** UNIT_WEIGHT */
    private java.math.BigDecimal unitWeight;

    /**
     * @return UNIT_WEIGHT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_WEIGHT")
    public java.math.BigDecimal getUnitWeight() {
        return this.unitWeight;
    }

    /**
     * @param o UNIT_WEIGHT
     */
    public void setUnitWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.unitWeight = null;
        }
    }

    /** OPE_TIME */
    private java.math.BigDecimal opeTime;

    /**
     * @return OPE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OPE_TIME")
    public java.math.BigDecimal getOpeTime() {
        return this.opeTime;
    }

    /**
     * @param o OPE_TIME
     */
    public void setOpeTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.opeTime = new java.math.BigDecimal(o.toString());
        } else {
            this.opeTime = null;
        }
    }

    /** HUM_PRE_TIME */
    private java.math.BigDecimal humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_PRE_TIME")
    public java.math.BigDecimal getHumPreTime() {
        return this.humPreTime;
    }

    /**
     * @param o HUM_PRE_TIME
     */
    public void setHumPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humPreTime = null;
        }
    }

    /** HUM_ACT_TIME */
    private java.math.BigDecimal humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_ACT_TIME")
    public java.math.BigDecimal getHumActTime() {
        return this.humActTime;
    }

    /**
     * @param o HUM_ACT_TIME
     */
    public void setHumActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.humActTime = null;
        }
    }

    /** MAC_PRE_TIME */
    private java.math.BigDecimal macPreTime;

    /**
     * @return MAC_PRE_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_PRE_TIME")
    public java.math.BigDecimal getMacPreTime() {
        return this.macPreTime;
    }

    /**
     * @param o MAC_PRE_TIME
     */
    public void setMacPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macPreTime = null;
        }
    }

    /** MAC_ACT_TIME */
    private java.math.BigDecimal macActTime;

    /**
     * @return MAC_ACT_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_ACT_TIME")
    public java.math.BigDecimal getMacActTime() {
        return this.macActTime;
    }

    /**
     * @param o MAC_ACT_TIME
     */
    public void setMacActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.macActTime = null;
        }
    }

    /** SUM_UNIT_SUPPLY */
    private java.math.BigDecimal sumUnitSupply;

    /**
     * @return SUM_UNIT_SUPPLY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUM_UNIT_SUPPLY")
    public java.math.BigDecimal getSumUnitSupply() {
        return this.sumUnitSupply;
    }

    /**
     * @param o SUM_UNIT_SUPPLY
     */
    public void setSumUnitSupply(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sumUnitSupply = new java.math.BigDecimal(o.toString());
        } else {
            this.sumUnitSupply = null;
        }
    }

    /** MATERIALS_COST */
    private java.math.BigDecimal materialsCost;

    /**
     * @return MATERIALS_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MATERIALS_COST")
    public java.math.BigDecimal getMaterialsCost() {
        return this.materialsCost;
    }

    /**
     * @param o MATERIALS_COST
     */
    public void setMaterialsCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.materialsCost = new java.math.BigDecimal(o.toString());
        } else {
            this.materialsCost = null;
        }
    }

    /** HUM_LABOR_COST_FIRST */
    private java.math.BigDecimal humLaborCostFirst;

    /**
     * @return HUM_LABOR_COST_FIRST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_LABOR_COST_FIRST")
    public java.math.BigDecimal getHumLaborCostFirst() {
        return this.humLaborCostFirst;
    }

    /**
     * @param o HUM_LABOR_COST_FIRST
     */
    public void setHumLaborCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humLaborCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.humLaborCostFirst = null;
        }
    }

    /** HUM_EXPENSES_FIRST */
    private java.math.BigDecimal humExpensesFirst;

    /**
     * @return HUM_EXPENSES_FIRST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_EXPENSES_FIRST")
    public java.math.BigDecimal getHumExpensesFirst() {
        return this.humExpensesFirst;
    }

    /**
     * @param o HUM_EXPENSES_FIRST
     */
    public void setHumExpensesFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humExpensesFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.humExpensesFirst = null;
        }
    }

    /** HUM_LABOR_COST_SECOND */
    private java.math.BigDecimal humLaborCostSecond;

    /**
     * @return HUM_LABOR_COST_SECOND
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_LABOR_COST_SECOND")
    public java.math.BigDecimal getHumLaborCostSecond() {
        return this.humLaborCostSecond;
    }

    /**
     * @param o HUM_LABOR_COST_SECOND
     */
    public void setHumLaborCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humLaborCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.humLaborCostSecond = null;
        }
    }

    /** HUM_EXPENSES_SECOND */
    private java.math.BigDecimal humExpensesSecond;

    /**
     * @return HUM_EXPENSES_SECOND
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUM_EXPENSES_SECOND")
    public java.math.BigDecimal getHumExpensesSecond() {
        return this.humExpensesSecond;
    }

    /**
     * @param o HUM_EXPENSES_SECOND
     */
    public void setHumExpensesSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.humExpensesSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.humExpensesSecond = null;
        }
    }

    /** MAC_LABOR_COST_FIRST */
    private java.math.BigDecimal macLaborCostFirst;

    /**
     * @return MAC_LABOR_COST_FIRST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_LABOR_COST_FIRST")
    public java.math.BigDecimal getMacLaborCostFirst() {
        return this.macLaborCostFirst;
    }

    /**
     * @param o MAC_LABOR_COST_FIRST
     */
    public void setMacLaborCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macLaborCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.macLaborCostFirst = null;
        }
    }

    /** MAC_EXPENSES_FIRST */
    private java.math.BigDecimal macExpensesFirst;

    /**
     * @return MAC_EXPENSES_FIRST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_EXPENSES_FIRST")
    public java.math.BigDecimal getMacExpensesFirst() {
        return this.macExpensesFirst;
    }

    /**
     * @param o MAC_EXPENSES_FIRST
     */
    public void setMacExpensesFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macExpensesFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.macExpensesFirst = null;
        }
    }

    /** MAC_LABOR_COST_SECOND */
    private java.math.BigDecimal macLaborCostSecond;

    /**
     * @return MAC_LABOR_COST_SECOND
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_LABOR_COST_SECOND")
    public java.math.BigDecimal getMacLaborCostSecond() {
        return this.macLaborCostSecond;
    }

    /**
     * @param o MAC_LABOR_COST_SECOND
     */
    public void setMacLaborCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macLaborCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.macLaborCostSecond = null;
        }
    }

    /** MAC_EXPENSES_SECOND */
    private java.math.BigDecimal macExpensesSecond;

    /**
     * @return MAC_EXPENSES_SECOND
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAC_EXPENSES_SECOND")
    public java.math.BigDecimal getMacExpensesSecond() {
        return this.macExpensesSecond;
    }

    /**
     * @param o MAC_EXPENSES_SECOND
     */
    public void setMacExpensesSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.macExpensesSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.macExpensesSecond = null;
        }
    }

    /** DATA_SOURCE_KBN */
    private java.math.BigDecimal dataSourceKbn;

    /**
     * @return DATA_SOURCE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DATA_SOURCE_KBN")
    public java.math.BigDecimal getDataSourceKbn() {
        return this.dataSourceKbn;
    }

    /**
     * @param o DATA_SOURCE_KBN
     */
    public void setDataSourceKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dataSourceKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.dataSourceKbn = null;
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
     * MFG_TOTAL_COST_REG_LINE_I_Q照会
     *
     * @param param1 HINBAN
     * @param param2 PRO_GROUP_NO
     * @param param3 ROUTING
     * @param param4 YY
     * @param param5 MM
     * @return MFG_TOTAL_COST_REG_LINE_I_Q
     */
    public static MfgTotalCostRegLineIQ get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"PRO_GROUP_NO\" = :pro_group_no");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");

        String sql = "SELECT * FROM MFG_TOTAL_COST_REG_LINE_I_Q WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("pro_group_no", param2);
        params.put("routing", param3);
        params.put("yy", param4);
        params.put("mm", param5);

        return Queries.get(sql, params, MfgTotalCostRegLineIQ.class);
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_I_Q追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MMの採番処理
        numbering();

        // MFG_TOTAL_COST_REG_LINE_Mの登録
        if (this.mfgTotalCostRegLineM != null) {
            this.mfgTotalCostRegLineM.setHinban(this.getHinban());
            this.mfgTotalCostRegLineM.setProGroupNo(this.getProGroupNo());
            this.mfgTotalCostRegLineM.setRouting(this.getRouting());
            this.mfgTotalCostRegLineM.setYy(this.getYy());
            this.mfgTotalCostRegLineM.setMm(this.getMm());
            this.mfgTotalCostRegLineM.insert(now, id);
        }

        // MFG_TOTAL_COST_REG_LINE_M_Qの登録
        if (this.mfgTotalCostRegLineMQ != null) {
            this.mfgTotalCostRegLineMQ.setHinban(this.getHinban());
            this.mfgTotalCostRegLineMQ.setProGroupNo(this.getProGroupNo());
            this.mfgTotalCostRegLineMQ.setRouting(this.getRouting());
            this.mfgTotalCostRegLineMQ.setYy(this.getYy());
            this.mfgTotalCostRegLineMQ.setMm(this.getMm());
            this.mfgTotalCostRegLineMQ.insert(now, id);
        }

        // MFG_TOTAL_COST_REG_LINE_I_Qの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"PRO_GROUP_NO\" -- :pro_group_no");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"ROUTING\" -- :routing");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"OPE_DETAIL\" -- :ope_detail");
        nameList.add("\"LAST_ROUTING_KBN\" -- :last_routing_kbn");
        nameList.add("\"TOTAL_COST_TARGET_FLAG\" -- :total_cost_target_flag");
        nameList.add("\"COST_RATE_KBN\" -- :cost_rate_kbn");
        nameList.add("\"UNIT_COST_FIRST\" -- :unit_cost_first");
        nameList.add("\"UNIT_COST_SECOND\" -- :unit_cost_second");
        nameList.add("\"TOTAL_UNIT_COST\" -- :total_unit_cost");
        nameList.add("\"SUM_COST_FIRST\" -- :sum_cost_first");
        nameList.add("\"SUM_COST_SECOND\" -- :sum_cost_second");
        nameList.add("\"TOTAL_SUM_COST\" -- :total_sum_cost");
        nameList.add("\"OPE_COUNTS\" -- :ope_counts");
        nameList.add("\"OPE_AMOUNTS\" -- :ope_amounts");
        nameList.add("\"UNIT_WEIGHT\" -- :unit_weight");
        nameList.add("\"OPE_TIME\" -- :ope_time");
        nameList.add("\"HUM_PRE_TIME\" -- :hum_pre_time");
        nameList.add("\"HUM_ACT_TIME\" -- :hum_act_time");
        nameList.add("\"MAC_PRE_TIME\" -- :mac_pre_time");
        nameList.add("\"MAC_ACT_TIME\" -- :mac_act_time");
        nameList.add("\"SUM_UNIT_SUPPLY\" -- :sum_unit_supply");
        nameList.add("\"MATERIALS_COST\" -- :materials_cost");
        nameList.add("\"HUM_LABOR_COST_FIRST\" -- :hum_labor_cost_first");
        nameList.add("\"HUM_EXPENSES_FIRST\" -- :hum_expenses_first");
        nameList.add("\"HUM_LABOR_COST_SECOND\" -- :hum_labor_cost_second");
        nameList.add("\"HUM_EXPENSES_SECOND\" -- :hum_expenses_second");
        nameList.add("\"MAC_LABOR_COST_FIRST\" -- :mac_labor_cost_first");
        nameList.add("\"MAC_EXPENSES_FIRST\" -- :mac_expenses_first");
        nameList.add("\"MAC_LABOR_COST_SECOND\" -- :mac_labor_cost_second");
        nameList.add("\"MAC_EXPENSES_SECOND\" -- :mac_expenses_second");
        nameList.add("\"DATA_SOURCE_KBN\" -- :data_source_kbn");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_TOTAL_COST_REG_LINE_I_Q(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":mm");
        valueList.add(":pro_group_no");
        valueList.add(":hinban");
        valueList.add(":routing");
        valueList.add(":wc_code");
        valueList.add(":sup_code");
        valueList.add(":ope_detail");
        valueList.add(":last_routing_kbn");
        valueList.add(":total_cost_target_flag");
        valueList.add(":cost_rate_kbn");
        valueList.add(":unit_cost_first");
        valueList.add(":unit_cost_second");
        valueList.add(":total_unit_cost");
        valueList.add(":sum_cost_first");
        valueList.add(":sum_cost_second");
        valueList.add(":total_sum_cost");
        valueList.add(":ope_counts");
        valueList.add(":ope_amounts");
        valueList.add(":unit_weight");
        valueList.add(":ope_time");
        valueList.add(":hum_pre_time");
        valueList.add(":hum_act_time");
        valueList.add(":mac_pre_time");
        valueList.add(":mac_act_time");
        valueList.add(":sum_unit_supply");
        valueList.add(":materials_cost");
        valueList.add(":hum_labor_cost_first");
        valueList.add(":hum_expenses_first");
        valueList.add(":hum_labor_cost_second");
        valueList.add(":hum_expenses_second");
        valueList.add(":mac_labor_cost_first");
        valueList.add(":mac_expenses_first");
        valueList.add(":mac_labor_cost_second");
        valueList.add(":mac_expenses_second");
        valueList.add(":data_source_kbn");
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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"MM\") IS NULL THEN 0 ELSE MAX(e.\"MM\") * 1 END + 1, 2, '0') AS \"MM\" FROM MFG_TOTAL_COST_REG_LINE_I_Q e WHERE e.\"MM\" < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"HINBAN\" = :hinban");
        whereList.add("e.\"PRO_GROUP_NO\" = :pro_group_no");
        whereList.add("e.\"ROUTING\" = :routing");
        whereList.add("e.\"YY\" = :yy");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hinban", this.hinban);
        params.put("pro_group_no", this.proGroupNo);
        params.put("routing", this.routing);
        params.put("yy", this.yy);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MM");

        this.setMm(o);
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_I_Q更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_TOTAL_COST_REG_LINE_Mの登録
        if (this.mfgTotalCostRegLineM != null) {
            mfgTotalCostRegLineM.setHinban(this.getHinban());
            mfgTotalCostRegLineM.setProGroupNo(this.getProGroupNo());
            mfgTotalCostRegLineM.setRouting(this.getRouting());
            mfgTotalCostRegLineM.setYy(this.getYy());
            mfgTotalCostRegLineM.setMm(this.getMm());
            try {
                mfgTotalCostRegLineM.insert(now, id);
            } catch (Exception e) {
                mfgTotalCostRegLineM.update(now, id);
            }
        }

        // MFG_TOTAL_COST_REG_LINE_M_Qの登録
        if (this.mfgTotalCostRegLineMQ != null) {
            mfgTotalCostRegLineMQ.setHinban(this.getHinban());
            mfgTotalCostRegLineMQ.setProGroupNo(this.getProGroupNo());
            mfgTotalCostRegLineMQ.setRouting(this.getRouting());
            mfgTotalCostRegLineMQ.setYy(this.getYy());
            mfgTotalCostRegLineMQ.setMm(this.getMm());
            try {
                mfgTotalCostRegLineMQ.insert(now, id);
            } catch (Exception e) {
                mfgTotalCostRegLineMQ.update(now, id);
            }
        }

        // MFG_TOTAL_COST_REG_LINE_I_Qの登録
        String sql = "UPDATE MFG_TOTAL_COST_REG_LINE_I_Q\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"MM\" = :mm");
        setList.add("\"PRO_GROUP_NO\" = :pro_group_no");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"ROUTING\" = :routing");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"OPE_DETAIL\" = :ope_detail");
        setList.add("\"LAST_ROUTING_KBN\" = :last_routing_kbn");
        setList.add("\"TOTAL_COST_TARGET_FLAG\" = :total_cost_target_flag");
        setList.add("\"COST_RATE_KBN\" = :cost_rate_kbn");
        setList.add("\"UNIT_COST_FIRST\" = :unit_cost_first");
        setList.add("\"UNIT_COST_SECOND\" = :unit_cost_second");
        setList.add("\"TOTAL_UNIT_COST\" = :total_unit_cost");
        setList.add("\"SUM_COST_FIRST\" = :sum_cost_first");
        setList.add("\"SUM_COST_SECOND\" = :sum_cost_second");
        setList.add("\"TOTAL_SUM_COST\" = :total_sum_cost");
        setList.add("\"OPE_COUNTS\" = :ope_counts");
        setList.add("\"OPE_AMOUNTS\" = :ope_amounts");
        setList.add("\"UNIT_WEIGHT\" = :unit_weight");
        setList.add("\"OPE_TIME\" = :ope_time");
        setList.add("\"HUM_PRE_TIME\" = :hum_pre_time");
        setList.add("\"HUM_ACT_TIME\" = :hum_act_time");
        setList.add("\"MAC_PRE_TIME\" = :mac_pre_time");
        setList.add("\"MAC_ACT_TIME\" = :mac_act_time");
        setList.add("\"SUM_UNIT_SUPPLY\" = :sum_unit_supply");
        setList.add("\"MATERIALS_COST\" = :materials_cost");
        setList.add("\"HUM_LABOR_COST_FIRST\" = :hum_labor_cost_first");
        setList.add("\"HUM_EXPENSES_FIRST\" = :hum_expenses_first");
        setList.add("\"HUM_LABOR_COST_SECOND\" = :hum_labor_cost_second");
        setList.add("\"HUM_EXPENSES_SECOND\" = :hum_expenses_second");
        setList.add("\"MAC_LABOR_COST_FIRST\" = :mac_labor_cost_first");
        setList.add("\"MAC_EXPENSES_FIRST\" = :mac_expenses_first");
        setList.add("\"MAC_LABOR_COST_SECOND\" = :mac_labor_cost_second");
        setList.add("\"MAC_EXPENSES_SECOND\" = :mac_expenses_second");
        setList.add("\"DATA_SOURCE_KBN\" = :data_source_kbn");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_I_Q削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_TOTAL_COST_REG_LINE_Mの削除
        if (this.mfgTotalCostRegLineM != null) {
            this.mfgTotalCostRegLineM.delete();
        }

        // MFG_TOTAL_COST_REG_LINE_M_Qの削除
        if (this.mfgTotalCostRegLineMQ != null) {
            this.mfgTotalCostRegLineMQ.delete();
        }

        // MFG_TOTAL_COST_REG_LINE_I_Qの削除
        String sql = "DELETE FROM MFG_TOTAL_COST_REG_LINE_I_Q WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"PRO_GROUP_NO\" = :pro_group_no");
        whereList.add("\"ROUTING\" = :routing");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("mm", this.mm);
        params.put("pro_group_no", this.proGroupNo);
        params.put("hinban", this.hinban);
        params.put("routing", this.routing);
        params.put("wc_code", this.wcCode);
        params.put("sup_code", this.supCode);
        params.put("ope_detail", this.opeDetail);
        params.put("last_routing_kbn", this.lastRoutingKbn);
        params.put("total_cost_target_flag", this.totalCostTargetFlag);
        params.put("cost_rate_kbn", this.costRateKbn);
        params.put("unit_cost_first", this.unitCostFirst);
        params.put("unit_cost_second", this.unitCostSecond);
        params.put("total_unit_cost", this.totalUnitCost);
        params.put("sum_cost_first", this.sumCostFirst);
        params.put("sum_cost_second", this.sumCostSecond);
        params.put("total_sum_cost", this.totalSumCost);
        params.put("ope_counts", this.opeCounts);
        params.put("ope_amounts", this.opeAmounts);
        params.put("unit_weight", this.unitWeight);
        params.put("ope_time", this.opeTime);
        params.put("hum_pre_time", this.humPreTime);
        params.put("hum_act_time", this.humActTime);
        params.put("mac_pre_time", this.macPreTime);
        params.put("mac_act_time", this.macActTime);
        params.put("sum_unit_supply", this.sumUnitSupply);
        params.put("materials_cost", this.materialsCost);
        params.put("hum_labor_cost_first", this.humLaborCostFirst);
        params.put("hum_expenses_first", this.humExpensesFirst);
        params.put("hum_labor_cost_second", this.humLaborCostSecond);
        params.put("hum_expenses_second", this.humExpensesSecond);
        params.put("mac_labor_cost_first", this.macLaborCostFirst);
        params.put("mac_expenses_first", this.macExpensesFirst);
        params.put("mac_labor_cost_second", this.macLaborCostSecond);
        params.put("mac_expenses_second", this.macExpensesSecond);
        params.put("data_source_kbn", this.dataSourceKbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_M
     */
    private MfgTotalCostRegLineM mfgTotalCostRegLineM;

    /**
     * @return MFG_TOTAL_COST_REG_LINE_M
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgTotalCostRegLineM")
    public MfgTotalCostRegLineM getMfgTotalCostRegLineM() {
        return this.mfgTotalCostRegLineM;
    }

    /**
     * @param p MFG_TOTAL_COST_REG_LINE_M
     */
    public void setMfgTotalCostRegLineM(final MfgTotalCostRegLineM p) {
        this.mfgTotalCostRegLineM = p;
    }

    /**
     * @return MFG_TOTAL_COST_REG_LINE_M
     */
    public MfgTotalCostRegLineM referMfgTotalCostRegLineM() {
        if (this.mfgTotalCostRegLineM == null) {
            try {
                this.mfgTotalCostRegLineM = MfgTotalCostRegLineM.get(this.hinban, this.proGroupNo, this.routing, this.yy, this.mm);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mfgTotalCostRegLineM;
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_M_Q
     */
    private MfgTotalCostRegLineMQ mfgTotalCostRegLineMQ;

    /**
     * @return MFG_TOTAL_COST_REG_LINE_M_Q
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MfgTotalCostRegLineMQ")
    public MfgTotalCostRegLineMQ getMfgTotalCostRegLineMQ() {
        return this.mfgTotalCostRegLineMQ;
    }

    /**
     * @param p MFG_TOTAL_COST_REG_LINE_M_Q
     */
    public void setMfgTotalCostRegLineMQ(final MfgTotalCostRegLineMQ p) {
        this.mfgTotalCostRegLineMQ = p;
    }

    /**
     * @return MFG_TOTAL_COST_REG_LINE_M_Q
     */
    public MfgTotalCostRegLineMQ referMfgTotalCostRegLineMQ() {
        if (this.mfgTotalCostRegLineMQ == null) {
            try {
                this.mfgTotalCostRegLineMQ = MfgTotalCostRegLineMQ.get(this.hinban, this.proGroupNo, this.routing, this.yy, this.mm);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mfgTotalCostRegLineMQ;
    }
}
