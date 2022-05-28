package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_TOTAL_COST_REG_LINE_M
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineM implements IEntity {

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

    /** T_UNIT_COST_FIRST */
    private java.math.BigDecimal tUnitCostFirst;

    /**
     * @return T_UNIT_COST_FIRST
     */
    public java.math.BigDecimal getTUnitCostFirst() {
        return this.tUnitCostFirst;
    }

    /**
     * @param o T_UNIT_COST_FIRST
     */
    public void setTUnitCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tUnitCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.tUnitCostFirst = null;
        }
    }

    /** T_UNIT_COST_SECOND */
    private java.math.BigDecimal tUnitCostSecond;

    /**
     * @return T_UNIT_COST_SECOND
     */
    public java.math.BigDecimal getTUnitCostSecond() {
        return this.tUnitCostSecond;
    }

    /**
     * @param o T_UNIT_COST_SECOND
     */
    public void setTUnitCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tUnitCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.tUnitCostSecond = null;
        }
    }

    /** T_TOTAL_UNIT_COST */
    private java.math.BigDecimal tTotalUnitCost;

    /**
     * @return T_TOTAL_UNIT_COST
     */
    public java.math.BigDecimal getTTotalUnitCost() {
        return this.tTotalUnitCost;
    }

    /**
     * @param o T_TOTAL_UNIT_COST
     */
    public void setTTotalUnitCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tTotalUnitCost = new java.math.BigDecimal(o.toString());
        } else {
            this.tTotalUnitCost = null;
        }
    }

    /** T_SUM_COST_FIRST */
    private java.math.BigDecimal tSumCostFirst;

    /**
     * @return T_SUM_COST_FIRST
     */
    public java.math.BigDecimal getTSumCostFirst() {
        return this.tSumCostFirst;
    }

    /**
     * @param o T_SUM_COST_FIRST
     */
    public void setTSumCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tSumCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.tSumCostFirst = null;
        }
    }

    /** T_SUM_COST_SECOND */
    private java.math.BigDecimal tSumCostSecond;

    /**
     * @return T_SUM_COST_SECOND
     */
    public java.math.BigDecimal getTSumCostSecond() {
        return this.tSumCostSecond;
    }

    /**
     * @param o T_SUM_COST_SECOND
     */
    public void setTSumCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tSumCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.tSumCostSecond = null;
        }
    }

    /** T_TOTAL_SUM_COST */
    private java.math.BigDecimal tTotalSumCost;

    /**
     * @return T_TOTAL_SUM_COST
     */
    public java.math.BigDecimal getTTotalSumCost() {
        return this.tTotalSumCost;
    }

    /**
     * @param o T_TOTAL_SUM_COST
     */
    public void setTTotalSumCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tTotalSumCost = new java.math.BigDecimal(o.toString());
        } else {
            this.tTotalSumCost = null;
        }
    }

    /** T_OPE_COUNTS */
    private java.math.BigDecimal tOpeCounts;

    /**
     * @return T_OPE_COUNTS
     */
    public java.math.BigDecimal getTOpeCounts() {
        return this.tOpeCounts;
    }

    /**
     * @param o T_OPE_COUNTS
     */
    public void setTOpeCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tOpeCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.tOpeCounts = null;
        }
    }

    /** T_OPE_AMOUNTS */
    private java.math.BigDecimal tOpeAmounts;

    /**
     * @return T_OPE_AMOUNTS
     */
    public java.math.BigDecimal getTOpeAmounts() {
        return this.tOpeAmounts;
    }

    /**
     * @param o T_OPE_AMOUNTS
     */
    public void setTOpeAmounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tOpeAmounts = new java.math.BigDecimal(o.toString());
        } else {
            this.tOpeAmounts = null;
        }
    }

    /** T_UNIT_WEIGHT */
    private java.math.BigDecimal tUnitWeight;

    /**
     * @return T_UNIT_WEIGHT
     */
    public java.math.BigDecimal getTUnitWeight() {
        return this.tUnitWeight;
    }

    /**
     * @param o T_UNIT_WEIGHT
     */
    public void setTUnitWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tUnitWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.tUnitWeight = null;
        }
    }

    /** T_OPE_TIME */
    private java.math.BigDecimal tOpeTime;

    /**
     * @return T_OPE_TIME
     */
    public java.math.BigDecimal getTOpeTime() {
        return this.tOpeTime;
    }

    /**
     * @param o T_OPE_TIME
     */
    public void setTOpeTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tOpeTime = new java.math.BigDecimal(o.toString());
        } else {
            this.tOpeTime = null;
        }
    }

    /** T_HUM_PRE_TIME */
    private java.math.BigDecimal tHumPreTime;

    /**
     * @return T_HUM_PRE_TIME
     */
    public java.math.BigDecimal getTHumPreTime() {
        return this.tHumPreTime;
    }

    /**
     * @param o T_HUM_PRE_TIME
     */
    public void setTHumPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tHumPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.tHumPreTime = null;
        }
    }

    /** T_HUM_ACT_TIME */
    private java.math.BigDecimal tHumActTime;

    /**
     * @return T_HUM_ACT_TIME
     */
    public java.math.BigDecimal getTHumActTime() {
        return this.tHumActTime;
    }

    /**
     * @param o T_HUM_ACT_TIME
     */
    public void setTHumActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tHumActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.tHumActTime = null;
        }
    }

    /** T_MAC_PRE_TIME */
    private java.math.BigDecimal tMacPreTime;

    /**
     * @return T_MAC_PRE_TIME
     */
    public java.math.BigDecimal getTMacPreTime() {
        return this.tMacPreTime;
    }

    /**
     * @param o T_MAC_PRE_TIME
     */
    public void setTMacPreTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tMacPreTime = new java.math.BigDecimal(o.toString());
        } else {
            this.tMacPreTime = null;
        }
    }

    /** T_MAC_ACT_TIME */
    private java.math.BigDecimal tMacActTime;

    /**
     * @return T_MAC_ACT_TIME
     */
    public java.math.BigDecimal getTMacActTime() {
        return this.tMacActTime;
    }

    /**
     * @param o T_MAC_ACT_TIME
     */
    public void setTMacActTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tMacActTime = new java.math.BigDecimal(o.toString());
        } else {
            this.tMacActTime = null;
        }
    }

    /** T_SUM_UNIT_SUPPLY */
    private java.math.BigDecimal tSumUnitSupply;

    /**
     * @return T_SUM_UNIT_SUPPLY
     */
    public java.math.BigDecimal getTSumUnitSupply() {
        return this.tSumUnitSupply;
    }

    /**
     * @param o T_SUM_UNIT_SUPPLY
     */
    public void setTSumUnitSupply(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tSumUnitSupply = new java.math.BigDecimal(o.toString());
        } else {
            this.tSumUnitSupply = null;
        }
    }

    /** T_MATERIALS_COST */
    private java.math.BigDecimal tMaterialsCost;

    /**
     * @return T_MATERIALS_COST
     */
    public java.math.BigDecimal getTMaterialsCost() {
        return this.tMaterialsCost;
    }

    /**
     * @param o T_MATERIALS_COST
     */
    public void setTMaterialsCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tMaterialsCost = new java.math.BigDecimal(o.toString());
        } else {
            this.tMaterialsCost = null;
        }
    }

    /** T_HUM_LABOR_COST_FIRST */
    private java.math.BigDecimal tHumLaborCostFirst;

    /**
     * @return T_HUM_LABOR_COST_FIRST
     */
    public java.math.BigDecimal getTHumLaborCostFirst() {
        return this.tHumLaborCostFirst;
    }

    /**
     * @param o T_HUM_LABOR_COST_FIRST
     */
    public void setTHumLaborCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tHumLaborCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.tHumLaborCostFirst = null;
        }
    }

    /** T_HUM_EXPENSES_FIRST */
    private java.math.BigDecimal tHumExpensesFirst;

    /**
     * @return T_HUM_EXPENSES_FIRST
     */
    public java.math.BigDecimal getTHumExpensesFirst() {
        return this.tHumExpensesFirst;
    }

    /**
     * @param o T_HUM_EXPENSES_FIRST
     */
    public void setTHumExpensesFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tHumExpensesFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.tHumExpensesFirst = null;
        }
    }

    /** T_HUM_LABOR_COST_SECOND */
    private java.math.BigDecimal tHumLaborCostSecond;

    /**
     * @return T_HUM_LABOR_COST_SECOND
     */
    public java.math.BigDecimal getTHumLaborCostSecond() {
        return this.tHumLaborCostSecond;
    }

    /**
     * @param o T_HUM_LABOR_COST_SECOND
     */
    public void setTHumLaborCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tHumLaborCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.tHumLaborCostSecond = null;
        }
    }

    /** T_HUM_EXPENSES_SECOND */
    private java.math.BigDecimal tHumExpensesSecond;

    /**
     * @return T_HUM_EXPENSES_SECOND
     */
    public java.math.BigDecimal getTHumExpensesSecond() {
        return this.tHumExpensesSecond;
    }

    /**
     * @param o T_HUM_EXPENSES_SECOND
     */
    public void setTHumExpensesSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tHumExpensesSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.tHumExpensesSecond = null;
        }
    }

    /** T_MAC_LABOR_COST_FIRST */
    private java.math.BigDecimal tMacLaborCostFirst;

    /**
     * @return T_MAC_LABOR_COST_FIRST
     */
    public java.math.BigDecimal getTMacLaborCostFirst() {
        return this.tMacLaborCostFirst;
    }

    /**
     * @param o T_MAC_LABOR_COST_FIRST
     */
    public void setTMacLaborCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tMacLaborCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.tMacLaborCostFirst = null;
        }
    }

    /** T_MAC_EXPENSES_FIRST */
    private java.math.BigDecimal tMacExpensesFirst;

    /**
     * @return T_MAC_EXPENSES_FIRST
     */
    public java.math.BigDecimal getTMacExpensesFirst() {
        return this.tMacExpensesFirst;
    }

    /**
     * @param o T_MAC_EXPENSES_FIRST
     */
    public void setTMacExpensesFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tMacExpensesFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.tMacExpensesFirst = null;
        }
    }

    /** T_MAC_LABOR_COST_SECOND */
    private java.math.BigDecimal tMacLaborCostSecond;

    /**
     * @return T_MAC_LABOR_COST_SECOND
     */
    public java.math.BigDecimal getTMacLaborCostSecond() {
        return this.tMacLaborCostSecond;
    }

    /**
     * @param o T_MAC_LABOR_COST_SECOND
     */
    public void setTMacLaborCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tMacLaborCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.tMacLaborCostSecond = null;
        }
    }

    /** T_MAC_EXPENSES_SECOND */
    private java.math.BigDecimal tMacExpensesSecond;

    /**
     * @return T_MAC_EXPENSES_SECOND
     */
    public java.math.BigDecimal getTMacExpensesSecond() {
        return this.tMacExpensesSecond;
    }

    /**
     * @param o T_MAC_EXPENSES_SECOND
     */
    public void setTMacExpensesSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tMacExpensesSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.tMacExpensesSecond = null;
        }
    }

    /** T_DATA_SOURCE_KBN */
    private java.math.BigDecimal tDataSourceKbn;

    /**
     * @return T_DATA_SOURCE_KBN
     */
    public java.math.BigDecimal getTDataSourceKbn() {
        return this.tDataSourceKbn;
    }

    /**
     * @param o T_DATA_SOURCE_KBN
     */
    public void setTDataSourceKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tDataSourceKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.tDataSourceKbn = null;
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

    /** T_GROSS_SUM_COST_FIRST */
    private java.math.BigDecimal tGrossSumCostFirst;

    /**
     * @return T_GROSS_SUM_COST_FIRST
     */
    public java.math.BigDecimal getTGrossSumCostFirst() {
        return this.tGrossSumCostFirst;
    }

    /**
     * @param o T_GROSS_SUM_COST_FIRST
     */
    public void setTGrossSumCostFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tGrossSumCostFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.tGrossSumCostFirst = null;
        }
    }

    /** T_GROSS_SUM_COST_SECOND */
    private java.math.BigDecimal tGrossSumCostSecond;

    /**
     * @return T_GROSS_SUM_COST_SECOND
     */
    public java.math.BigDecimal getTGrossSumCostSecond() {
        return this.tGrossSumCostSecond;
    }

    /**
     * @param o T_GROSS_SUM_COST_SECOND
     */
    public void setTGrossSumCostSecond(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tGrossSumCostSecond = new java.math.BigDecimal(o.toString());
        } else {
            this.tGrossSumCostSecond = null;
        }
    }

    /** T_TOTAL_GROSS_SUM_COST */
    private java.math.BigDecimal tTotalGrossSumCost;

    /**
     * @return T_TOTAL_GROSS_SUM_COST
     */
    public java.math.BigDecimal getTTotalGrossSumCost() {
        return this.tTotalGrossSumCost;
    }

    /**
     * @param o T_TOTAL_GROSS_SUM_COST
     */
    public void setTTotalGrossSumCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tTotalGrossSumCost = new java.math.BigDecimal(o.toString());
        } else {
            this.tTotalGrossSumCost = null;
        }
    }

    /** T_GROSS_SUM_UNIT_SUPPLY */
    private java.math.BigDecimal tGrossSumUnitSupply;

    /**
     * @return T_GROSS_SUM_UNIT_SUPPLY
     */
    public java.math.BigDecimal getTGrossSumUnitSupply() {
        return this.tGrossSumUnitSupply;
    }

    /**
     * @param o T_GROSS_SUM_UNIT_SUPPLY
     */
    public void setTGrossSumUnitSupply(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tGrossSumUnitSupply = new java.math.BigDecimal(o.toString());
        } else {
            this.tGrossSumUnitSupply = null;
        }
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_M照会
     *
     * @param param1 HINBAN
     * @param param2 PRO_GROUP_NO
     * @param param3 ROUTING
     * @param param4 YY
     * @param param5 MM
     * @return MFG_TOTAL_COST_REG_LINE_M
     */
    public static MfgTotalCostRegLineM get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("pro_group_no = :pro_group_no");
        whereList.add("routing = :routing");
        whereList.add("TRIM (yy) = TRIM (:yy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");

        String sql = "SELECT * FROM MFG_TOTAL_COST_REG_LINE_M WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("pro_group_no", param2);
        params.put("routing", param3);
        params.put("yy", param4);
        params.put("mm", param5);

        return Queries.get(sql, params, MfgTotalCostRegLineM.class);
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_M追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MMの採番処理
        numbering();

        // MFG_TOTAL_COST_REG_LINE_M_Qの登録
        if (this.mfgTotalCostRegLineMQ != null) {
            this.mfgTotalCostRegLineMQ.setHinban(this.getHinban());
            this.mfgTotalCostRegLineMQ.setProGroupNo(this.getProGroupNo());
            this.mfgTotalCostRegLineMQ.setRouting(this.getRouting());
            this.mfgTotalCostRegLineMQ.setYy(this.getYy());
            this.mfgTotalCostRegLineMQ.setMm(this.getMm());
            this.mfgTotalCostRegLineMQ.insert(now, id);
        }

        // MFG_TOTAL_COST_REG_LINE_Mの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yy -- :yy");
        nameList.add("pro_group_no -- :pro_group_no");
        nameList.add("hinban -- :hinban");
        nameList.add("routing -- :routing");
        nameList.add("wc_code -- :wc_code");
        nameList.add("sup_code -- :sup_code");
        nameList.add("ope_detail -- :ope_detail");
        nameList.add("mm -- :mm");
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
        nameList.add("t_unit_cost_first -- :t_unit_cost_first");
        nameList.add("t_unit_cost_second -- :t_unit_cost_second");
        nameList.add("t_total_unit_cost -- :t_total_unit_cost");
        nameList.add("t_sum_cost_first -- :t_sum_cost_first");
        nameList.add("t_sum_cost_second -- :t_sum_cost_second");
        nameList.add("t_total_sum_cost -- :t_total_sum_cost");
        nameList.add("t_ope_counts -- :t_ope_counts");
        nameList.add("t_ope_amounts -- :t_ope_amounts");
        nameList.add("t_unit_weight -- :t_unit_weight");
        nameList.add("t_ope_time -- :t_ope_time");
        nameList.add("t_hum_pre_time -- :t_hum_pre_time");
        nameList.add("t_hum_act_time -- :t_hum_act_time");
        nameList.add("t_mac_pre_time -- :t_mac_pre_time");
        nameList.add("t_mac_act_time -- :t_mac_act_time");
        nameList.add("t_sum_unit_supply -- :t_sum_unit_supply");
        nameList.add("t_materials_cost -- :t_materials_cost");
        nameList.add("t_hum_labor_cost_first -- :t_hum_labor_cost_first");
        nameList.add("t_hum_expenses_first -- :t_hum_expenses_first");
        nameList.add("t_hum_labor_cost_second -- :t_hum_labor_cost_second");
        nameList.add("t_hum_expenses_second -- :t_hum_expenses_second");
        nameList.add("t_mac_labor_cost_first -- :t_mac_labor_cost_first");
        nameList.add("t_mac_expenses_first -- :t_mac_expenses_first");
        nameList.add("t_mac_labor_cost_second -- :t_mac_labor_cost_second");
        nameList.add("t_mac_expenses_second -- :t_mac_expenses_second");
        nameList.add("t_data_source_kbn -- :t_data_source_kbn");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("gross_sum_cost_first -- :gross_sum_cost_first");
        nameList.add("gross_sum_cost_second -- :gross_sum_cost_second");
        nameList.add("total_gross_sum_cost -- :total_gross_sum_cost");
        nameList.add("gross_sum_unit_supply -- :gross_sum_unit_supply");
        nameList.add("t_gross_sum_cost_first -- :t_gross_sum_cost_first");
        nameList.add("t_gross_sum_cost_second -- :t_gross_sum_cost_second");
        nameList.add("t_total_gross_sum_cost -- :t_total_gross_sum_cost");
        nameList.add("t_gross_sum_unit_supply -- :t_gross_sum_unit_supply");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_TOTAL_COST_REG_LINE_M(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":pro_group_no");
        valueList.add(":hinban");
        valueList.add(":routing");
        valueList.add(":wc_code");
        valueList.add(":sup_code");
        valueList.add(":ope_detail");
        valueList.add(":mm");
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
        valueList.add(":t_unit_cost_first");
        valueList.add(":t_unit_cost_second");
        valueList.add(":t_total_unit_cost");
        valueList.add(":t_sum_cost_first");
        valueList.add(":t_sum_cost_second");
        valueList.add(":t_total_sum_cost");
        valueList.add(":t_ope_counts");
        valueList.add(":t_ope_amounts");
        valueList.add(":t_unit_weight");
        valueList.add(":t_ope_time");
        valueList.add(":t_hum_pre_time");
        valueList.add(":t_hum_act_time");
        valueList.add(":t_mac_pre_time");
        valueList.add(":t_mac_act_time");
        valueList.add(":t_sum_unit_supply");
        valueList.add(":t_materials_cost");
        valueList.add(":t_hum_labor_cost_first");
        valueList.add(":t_hum_expenses_first");
        valueList.add(":t_hum_labor_cost_second");
        valueList.add(":t_hum_expenses_second");
        valueList.add(":t_mac_labor_cost_first");
        valueList.add(":t_mac_expenses_first");
        valueList.add(":t_mac_labor_cost_second");
        valueList.add(":t_mac_expenses_second");
        valueList.add(":t_data_source_kbn");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":gross_sum_cost_first");
        valueList.add(":gross_sum_cost_second");
        valueList.add(":total_gross_sum_cost");
        valueList.add(":gross_sum_unit_supply");
        valueList.add(":t_gross_sum_cost_first");
        valueList.add(":t_gross_sum_cost_second");
        valueList.add(":t_total_gross_sum_cost");
        valueList.add(":t_gross_sum_unit_supply");
        return String.join("\r\n    , ", valueList);
    }

    /** MMの採番処理 */
    private void numbering() {

        if (this.mm != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.MM) IS NULL THEN 0 ELSE MAX(e.MM) * 1 END + 1, 2, '0') AS MM FROM MFG_TOTAL_COST_REG_LINE_M e WHERE e.MM < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.HINBAN = :hinban");
        whereList.add("e.PRO_GROUP_NO = :pro_group_no");
        whereList.add("e.ROUTING = :routing");
        whereList.add("e.YY = :yy");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hinban", this.hinban);
        params.put("proGroupNo", this.proGroupNo);
        params.put("routing", this.routing);
        params.put("yy", this.yy);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MM");

        this.setMm(o);
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_M更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

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

        // MFG_TOTAL_COST_REG_LINE_Mの登録
        String sql = "UPDATE MFG_TOTAL_COST_REG_LINE_M\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yy = :yy");
        setList.add("pro_group_no = :pro_group_no");
        setList.add("hinban = :hinban");
        setList.add("routing = :routing");
        setList.add("wc_code = :wc_code");
        setList.add("sup_code = :sup_code");
        setList.add("ope_detail = :ope_detail");
        setList.add("mm = :mm");
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
        setList.add("t_unit_cost_first = :t_unit_cost_first");
        setList.add("t_unit_cost_second = :t_unit_cost_second");
        setList.add("t_total_unit_cost = :t_total_unit_cost");
        setList.add("t_sum_cost_first = :t_sum_cost_first");
        setList.add("t_sum_cost_second = :t_sum_cost_second");
        setList.add("t_total_sum_cost = :t_total_sum_cost");
        setList.add("t_ope_counts = :t_ope_counts");
        setList.add("t_ope_amounts = :t_ope_amounts");
        setList.add("t_unit_weight = :t_unit_weight");
        setList.add("t_ope_time = :t_ope_time");
        setList.add("t_hum_pre_time = :t_hum_pre_time");
        setList.add("t_hum_act_time = :t_hum_act_time");
        setList.add("t_mac_pre_time = :t_mac_pre_time");
        setList.add("t_mac_act_time = :t_mac_act_time");
        setList.add("t_sum_unit_supply = :t_sum_unit_supply");
        setList.add("t_materials_cost = :t_materials_cost");
        setList.add("t_hum_labor_cost_first = :t_hum_labor_cost_first");
        setList.add("t_hum_expenses_first = :t_hum_expenses_first");
        setList.add("t_hum_labor_cost_second = :t_hum_labor_cost_second");
        setList.add("t_hum_expenses_second = :t_hum_expenses_second");
        setList.add("t_mac_labor_cost_first = :t_mac_labor_cost_first");
        setList.add("t_mac_expenses_first = :t_mac_expenses_first");
        setList.add("t_mac_labor_cost_second = :t_mac_labor_cost_second");
        setList.add("t_mac_expenses_second = :t_mac_expenses_second");
        setList.add("t_data_source_kbn = :t_data_source_kbn");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("gross_sum_cost_first = :gross_sum_cost_first");
        setList.add("gross_sum_cost_second = :gross_sum_cost_second");
        setList.add("total_gross_sum_cost = :total_gross_sum_cost");
        setList.add("gross_sum_unit_supply = :gross_sum_unit_supply");
        setList.add("t_gross_sum_cost_first = :t_gross_sum_cost_first");
        setList.add("t_gross_sum_cost_second = :t_gross_sum_cost_second");
        setList.add("t_total_gross_sum_cost = :t_total_gross_sum_cost");
        setList.add("t_gross_sum_unit_supply = :t_gross_sum_unit_supply");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_TOTAL_COST_REG_LINE_M削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MFG_TOTAL_COST_REG_LINE_M_Qの削除
        if (this.mfgTotalCostRegLineMQ != null) {
            this.mfgTotalCostRegLineMQ.delete();
        }

        // MFG_TOTAL_COST_REG_LINE_Mの削除
        String sql = "DELETE FROM MFG_TOTAL_COST_REG_LINE_M WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("pro_group_no = :pro_group_no");
        whereList.add("routing = :routing");
        whereList.add("TRIM (yy) = TRIM (:yy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YY", this.yy);
        params.put("PRO_GROUP_NO", this.proGroupNo);
        params.put("HINBAN", this.hinban);
        params.put("ROUTING", this.routing);
        params.put("WC_CODE", this.wcCode);
        params.put("SUP_CODE", this.supCode);
        params.put("OPE_DETAIL", this.opeDetail);
        params.put("MM", this.mm);
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
        params.put("T_UNIT_COST_FIRST", this.tUnitCostFirst);
        params.put("T_UNIT_COST_SECOND", this.tUnitCostSecond);
        params.put("T_TOTAL_UNIT_COST", this.tTotalUnitCost);
        params.put("T_SUM_COST_FIRST", this.tSumCostFirst);
        params.put("T_SUM_COST_SECOND", this.tSumCostSecond);
        params.put("T_TOTAL_SUM_COST", this.tTotalSumCost);
        params.put("T_OPE_COUNTS", this.tOpeCounts);
        params.put("T_OPE_AMOUNTS", this.tOpeAmounts);
        params.put("T_UNIT_WEIGHT", this.tUnitWeight);
        params.put("T_OPE_TIME", this.tOpeTime);
        params.put("T_HUM_PRE_TIME", this.tHumPreTime);
        params.put("T_HUM_ACT_TIME", this.tHumActTime);
        params.put("T_MAC_PRE_TIME", this.tMacPreTime);
        params.put("T_MAC_ACT_TIME", this.tMacActTime);
        params.put("T_SUM_UNIT_SUPPLY", this.tSumUnitSupply);
        params.put("T_MATERIALS_COST", this.tMaterialsCost);
        params.put("T_HUM_LABOR_COST_FIRST", this.tHumLaborCostFirst);
        params.put("T_HUM_EXPENSES_FIRST", this.tHumExpensesFirst);
        params.put("T_HUM_LABOR_COST_SECOND", this.tHumLaborCostSecond);
        params.put("T_HUM_EXPENSES_SECOND", this.tHumExpensesSecond);
        params.put("T_MAC_LABOR_COST_FIRST", this.tMacLaborCostFirst);
        params.put("T_MAC_EXPENSES_FIRST", this.tMacExpensesFirst);
        params.put("T_MAC_LABOR_COST_SECOND", this.tMacLaborCostSecond);
        params.put("T_MAC_EXPENSES_SECOND", this.tMacExpensesSecond);
        params.put("T_DATA_SOURCE_KBN", this.tDataSourceKbn);
        params.put("GROSS_SUM_COST_FIRST", this.grossSumCostFirst);
        params.put("GROSS_SUM_COST_SECOND", this.grossSumCostSecond);
        params.put("TOTAL_GROSS_SUM_COST", this.totalGrossSumCost);
        params.put("GROSS_SUM_UNIT_SUPPLY", this.grossSumUnitSupply);
        params.put("T_GROSS_SUM_COST_FIRST", this.tGrossSumCostFirst);
        params.put("T_GROSS_SUM_COST_SECOND", this.tGrossSumCostSecond);
        params.put("T_TOTAL_GROSS_SUM_COST", this.tTotalGrossSumCost);
        params.put("T_GROSS_SUM_UNIT_SUPPLY", this.tGrossSumUnitSupply);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
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
