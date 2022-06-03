package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_TOTAL_COST_REG_LINE_I1
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineI1 implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
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

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
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

    /** GROSS_SUM_COST_FIRST */
    private java.math.BigDecimal grossSumCostFirst;

    /**
     * @return GROSS_SUM_COST_FIRST
     */
    public java.math.BigDecimal getGrossSumCostFirst() {
        return this.grossSumCostFirst;
    }

    /**
     * @param o GROSS_SUM_COST_FIRST
     */
    public void setGrossSumCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.grossSumCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.grossSumCostFirst = null;
        }
    }

    /** GROSS_SUM_COST_SECOND */
    private java.math.BigDecimal grossSumCostSecond;

    /**
     * @return GROSS_SUM_COST_SECOND
     */
    public java.math.BigDecimal getGrossSumCostSecond() {
        return this.grossSumCostSecond;
    }

    /**
     * @param o GROSS_SUM_COST_SECOND
     */
    public void setGrossSumCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.grossSumCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.grossSumCostSecond = null;
        }
    }

    /** TOTAL_GROSS_SUM_COST */
    private java.math.BigDecimal totalGrossSumCost;

    /**
     * @return TOTAL_GROSS_SUM_COST
     */
    public java.math.BigDecimal getTotalGrossSumCost() {
        return this.totalGrossSumCost;
    }

    /**
     * @param o TOTAL_GROSS_SUM_COST
     */
    public void setTotalGrossSumCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.totalGrossSumCost = new java.math.BigDecimal(o.toString());
        } else {
            this.totalGrossSumCost = null;
        }
    }

    /** GROSS_SUM_UNIT_SUPPLY */
    private java.math.BigDecimal grossSumUnitSupply;

    /**
     * @return GROSS_SUM_UNIT_SUPPLY
     */
    public java.math.BigDecimal getGrossSumUnitSupply() {
        return this.grossSumUnitSupply;
    }

    /**
     * @param o GROSS_SUM_UNIT_SUPPLY
     */
    public void setGrossSumUnitSupply(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.grossSumUnitSupply = new java.math.BigDecimal(o.toString());
        } else {
            this.grossSumUnitSupply = null;
        }
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_I1照会
     *
     * @param param1 PRO_GROUP_NO
     * @param param2 HINBAN
     * @param param3 ROUTING
     * @return MFG_TOTAL_COST_REG_LINE_I1
     */
    public static MfgTotalCostRegLineI1 get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"PRO_GROUP_NO\" = :pro_group_no");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"ROUTING\" = :routing");

        String sql = "SELECT * FROM MFG_TOTAL_COST_REG_LINE_I1 WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_group_no", param1);
        params.put("hinban", param2);
        params.put("routing", param3);

        return Queries.get(sql, params, MfgTotalCostRegLineI1.class);
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_I1追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MFG_TOTAL_COST_REG_LINE_I1の登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yy -- :yy");
        nameList.add("mm -- :mm");
        nameList.add("pro_group_no -- :pro_group_no");
        nameList.add("hinban -- :hinban");
        nameList.add("routing -- :routing");
        nameList.add("wc_code -- :wc_code");
        nameList.add("sup_code -- :sup_code");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("last_routing_kbn -- :last_routing_kbn");
        nameList.add("total_cost_target_flag -- :total_cost_target_flag");
        nameList.add("cost_rate_kbn -- :cost_rate_kbn");
        nameList.add("unit_cost_first -- :unit_cost_first");
        nameList.add("unit_cost_second -- :unit_cost_second");
        nameList.add("total_unit_cost -- :total_unit_cost");
        nameList.add("sum_cost_first -- :sum_cost_first");
        nameList.add("sum_cost_second -- :sum_cost_second");
        nameList.add("total_sum_cost -- :total_sum_cost");
        nameList.add("ope_counts -- :ope_counts");
        nameList.add("ope_amounts -- :ope_amounts");
        nameList.add("unit_weight -- :unit_weight");
        nameList.add("ope_time -- :ope_time");
        nameList.add("hum_pre_time -- :hum_pre_time");
        nameList.add("hum_act_time -- :hum_act_time");
        nameList.add("mac_pre_time -- :mac_pre_time");
        nameList.add("mac_act_time -- :mac_act_time");
        nameList.add("sum_unit_supply -- :sum_unit_supply");
        nameList.add("materials_cost -- :materials_cost");
        nameList.add("hum_labor_cost_first -- :hum_labor_cost_first");
        nameList.add("hum_expenses_first -- :hum_expenses_first");
        nameList.add("hum_labor_cost_second -- :hum_labor_cost_second");
        nameList.add("hum_expenses_second -- :hum_expenses_second");
        nameList.add("mac_labor_cost_first -- :mac_labor_cost_first");
        nameList.add("mac_expenses_first -- :mac_expenses_first");
        nameList.add("mac_labor_cost_second -- :mac_labor_cost_second");
        nameList.add("mac_expenses_second -- :mac_expenses_second");
        nameList.add("data_source_kbn -- :data_source_kbn");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("gross_sum_cost_first -- :gross_sum_cost_first");
        nameList.add("gross_sum_cost_second -- :gross_sum_cost_second");
        nameList.add("total_gross_sum_cost -- :total_gross_sum_cost");
        nameList.add("gross_sum_unit_supply -- :gross_sum_unit_supply");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_TOTAL_COST_REG_LINE_I1(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

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
        valueList.add(":gross_sum_cost_first");
        valueList.add(":gross_sum_cost_second");
        valueList.add(":total_gross_sum_cost");
        valueList.add(":gross_sum_unit_supply");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_I1更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MFG_TOTAL_COST_REG_LINE_I1の登録
        String sql = "UPDATE MFG_TOTAL_COST_REG_LINE_I1\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yy = :yy");
        setList.add("mm = :mm");
        setList.add("pro_group_no = :pro_group_no");
        setList.add("hinban = :hinban");
        setList.add("routing = :routing");
        setList.add("wc_code = :wc_code");
        setList.add("sup_code = :sup_code");
        setList.add("ope_detail = :ope_detail");
        setList.add("last_routing_kbn = :last_routing_kbn");
        setList.add("total_cost_target_flag = :total_cost_target_flag");
        setList.add("cost_rate_kbn = :cost_rate_kbn");
        setList.add("unit_cost_first = :unit_cost_first");
        setList.add("unit_cost_second = :unit_cost_second");
        setList.add("total_unit_cost = :total_unit_cost");
        setList.add("sum_cost_first = :sum_cost_first");
        setList.add("sum_cost_second = :sum_cost_second");
        setList.add("total_sum_cost = :total_sum_cost");
        setList.add("ope_counts = :ope_counts");
        setList.add("ope_amounts = :ope_amounts");
        setList.add("unit_weight = :unit_weight");
        setList.add("ope_time = :ope_time");
        setList.add("hum_pre_time = :hum_pre_time");
        setList.add("hum_act_time = :hum_act_time");
        setList.add("mac_pre_time = :mac_pre_time");
        setList.add("mac_act_time = :mac_act_time");
        setList.add("sum_unit_supply = :sum_unit_supply");
        setList.add("materials_cost = :materials_cost");
        setList.add("hum_labor_cost_first = :hum_labor_cost_first");
        setList.add("hum_expenses_first = :hum_expenses_first");
        setList.add("hum_labor_cost_second = :hum_labor_cost_second");
        setList.add("hum_expenses_second = :hum_expenses_second");
        setList.add("mac_labor_cost_first = :mac_labor_cost_first");
        setList.add("mac_expenses_first = :mac_expenses_first");
        setList.add("mac_labor_cost_second = :mac_labor_cost_second");
        setList.add("mac_expenses_second = :mac_expenses_second");
        setList.add("data_source_kbn = :data_source_kbn");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("gross_sum_cost_first = :gross_sum_cost_first");
        setList.add("gross_sum_cost_second = :gross_sum_cost_second");
        setList.add("total_gross_sum_cost = :total_gross_sum_cost");
        setList.add("gross_sum_unit_supply = :gross_sum_unit_supply");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_I1削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_TOTAL_COST_REG_LINE_I1の削除
        String sql = "DELETE FROM MFG_TOTAL_COST_REG_LINE_I1 WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("pro_group_no = :pro_group_no");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("routing = :routing");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YY", this.yy);
        params.put("MM", this.mm);
        params.put("PRO_GROUP_NO", this.proGroupNo);
        params.put("HINBAN", this.hinban);
        params.put("ROUTING", this.routing);
        params.put("WC_CODE", this.wcCode);
        params.put("SUP_CODE", this.supCode);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("LAST_ROUTING_KBN", this.lastRoutingKbn);
        params.put("TOTAL_COST_TARGET_FLAG", this.totalCostTargetFlag);
        params.put("COST_RATE_KBN", this.costRateKbn);
        params.put("UNIT_COST_FIRST", this.unitCostFirst);
        params.put("UNIT_COST_SECOND", this.unitCostSecond);
        params.put("TOTAL_UNIT_COST", this.totalUnitCost);
        params.put("SUM_COST_FIRST", this.sumCostFirst);
        params.put("SUM_COST_SECOND", this.sumCostSecond);
        params.put("TOTAL_SUM_COST", this.totalSumCost);
        params.put("OPE_COUNTS", this.opeCounts);
        params.put("OPE_AMOUNTS", this.opeAmounts);
        params.put("UNIT_WEIGHT", this.unitWeight);
        params.put("OPE_TIME", this.opeTime);
        params.put("HUM_PRE_TIME", this.humPreTime);
        params.put("HUM_ACT_TIME", this.humActTime);
        params.put("MAC_PRE_TIME", this.macPreTime);
        params.put("MAC_ACT_TIME", this.macActTime);
        params.put("SUM_UNIT_SUPPLY", this.sumUnitSupply);
        params.put("MATERIALS_COST", this.materialsCost);
        params.put("HUM_LABOR_COST_FIRST", this.humLaborCostFirst);
        params.put("HUM_EXPENSES_FIRST", this.humExpensesFirst);
        params.put("HUM_LABOR_COST_SECOND", this.humLaborCostSecond);
        params.put("HUM_EXPENSES_SECOND", this.humExpensesSecond);
        params.put("MAC_LABOR_COST_FIRST", this.macLaborCostFirst);
        params.put("MAC_EXPENSES_FIRST", this.macExpensesFirst);
        params.put("MAC_LABOR_COST_SECOND", this.macLaborCostSecond);
        params.put("MAC_EXPENSES_SECOND", this.macExpensesSecond);
        params.put("DATA_SOURCE_KBN", this.dataSourceKbn);
        params.put("GROSS_SUM_COST_FIRST", this.grossSumCostFirst);
        params.put("GROSS_SUM_COST_SECOND", this.grossSumCostSecond);
        params.put("TOTAL_GROSS_SUM_COST", this.totalGrossSumCost);
        params.put("GROSS_SUM_UNIT_SUPPLY", this.grossSumUnitSupply);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
