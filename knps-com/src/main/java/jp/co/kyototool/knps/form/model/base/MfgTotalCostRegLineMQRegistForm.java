package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_COST_REG_LINE_M_Q登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineMQRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalCostRegLineMQRegistForm.class);

    /** YY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return YY
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p YY
     */
    public void setYy(final String p) {
        this.yy = p;
    }

    /** PRO_GROUP_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String proGroupNo;

    /**
     * @return PRO_GROUP_NO
     */
    public String getProGroupNo() {
        return proGroupNo;
    }

    /**
     * @param p PRO_GROUP_NO
     */
    public void setProGroupNo(final String p) {
        this.proGroupNo = p;
    }

    /** HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** ROUTING */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routing;

    /**
     * @return ROUTING
     */
    public String getRouting() {
        return routing;
    }

    /**
     * @param p ROUTING
     */
    public void setRouting(final String p) {
        this.routing = p;
    }

    /** WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return wcCode;
    }

    /**
     * @param p WC_CODE
     */
    public void setWcCode(final String p) {
        this.wcCode = p;
    }

    /** SUP_CODE */
    @jakarta.validation.constraints.Size(max = 6)
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return supCode;
    }

    /**
     * @param p SUP_CODE
     */
    public void setSupCode(final String p) {
        this.supCode = p;
    }

    /** OPE_DETAIL */
    @jakarta.validation.constraints.Size(max = 10)
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return opeDetail;
    }

    /**
     * @param p OPE_DETAIL
     */
    public void setOpeDetail(final String p) {
        this.opeDetail = p;
    }

    /** MM */
    @jakarta.validation.constraints.Size(max = 2)
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return mm;
    }

    /**
     * @param p MM
     */
    public void setMm(final String p) {
        this.mm = p;
    }

    /** LAST_ROUTING_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String lastRoutingKbn;

    /**
     * @return LAST_ROUTING_KBN
     */
    public String getLastRoutingKbn() {
        return lastRoutingKbn;
    }

    /**
     * @param p LAST_ROUTING_KBN
     */
    public void setLastRoutingKbn(final String p) {
        this.lastRoutingKbn = p;
    }

    /** TOTAL_COST_TARGET_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String totalCostTargetFlag;

    /**
     * @return TOTAL_COST_TARGET_FLAG
     */
    public String getTotalCostTargetFlag() {
        return totalCostTargetFlag;
    }

    /**
     * @param p TOTAL_COST_TARGET_FLAG
     */
    public void setTotalCostTargetFlag(final String p) {
        this.totalCostTargetFlag = p;
    }

    /** COST_RATE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String costRateKbn;

    /**
     * @return COST_RATE_KBN
     */
    public String getCostRateKbn() {
        return costRateKbn;
    }

    /**
     * @param p COST_RATE_KBN
     */
    public void setCostRateKbn(final String p) {
        this.costRateKbn = p;
    }

    /** UNIT_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String unitCostFirst;

    /**
     * @return UNIT_COST_FIRST
     */
    public String getUnitCostFirst() {
        return unitCostFirst;
    }

    /**
     * @param p UNIT_COST_FIRST
     */
    public void setUnitCostFirst(final String p) {
        this.unitCostFirst = p;
    }

    /** UNIT_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String unitCostSecond;

    /**
     * @return UNIT_COST_SECOND
     */
    public String getUnitCostSecond() {
        return unitCostSecond;
    }

    /**
     * @param p UNIT_COST_SECOND
     */
    public void setUnitCostSecond(final String p) {
        this.unitCostSecond = p;
    }

    /** TOTAL_UNIT_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String totalUnitCost;

    /**
     * @return TOTAL_UNIT_COST
     */
    public String getTotalUnitCost() {
        return totalUnitCost;
    }

    /**
     * @param p TOTAL_UNIT_COST
     */
    public void setTotalUnitCost(final String p) {
        this.totalUnitCost = p;
    }

    /** SUM_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String sumCostFirst;

    /**
     * @return SUM_COST_FIRST
     */
    public String getSumCostFirst() {
        return sumCostFirst;
    }

    /**
     * @param p SUM_COST_FIRST
     */
    public void setSumCostFirst(final String p) {
        this.sumCostFirst = p;
    }

    /** SUM_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String sumCostSecond;

    /**
     * @return SUM_COST_SECOND
     */
    public String getSumCostSecond() {
        return sumCostSecond;
    }

    /**
     * @param p SUM_COST_SECOND
     */
    public void setSumCostSecond(final String p) {
        this.sumCostSecond = p;
    }

    /** TOTAL_SUM_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String totalSumCost;

    /**
     * @return TOTAL_SUM_COST
     */
    public String getTotalSumCost() {
        return totalSumCost;
    }

    /**
     * @param p TOTAL_SUM_COST
     */
    public void setTotalSumCost(final String p) {
        this.totalSumCost = p;
    }

    /** OPE_COUNTS */
    @jakarta.validation.constraints.Size(max = 5)
    private String opeCounts;

    /**
     * @return OPE_COUNTS
     */
    public String getOpeCounts() {
        return opeCounts;
    }

    /**
     * @param p OPE_COUNTS
     */
    public void setOpeCounts(final String p) {
        this.opeCounts = p;
    }

    /** OPE_AMOUNTS */
    @jakarta.validation.constraints.Size(max = 12)
    private String opeAmounts;

    /**
     * @return OPE_AMOUNTS
     */
    public String getOpeAmounts() {
        return opeAmounts;
    }

    /**
     * @param p OPE_AMOUNTS
     */
    public void setOpeAmounts(final String p) {
        this.opeAmounts = p;
    }

    /** UNIT_WEIGHT */
    @jakarta.validation.constraints.Size(max = 11)
    private String unitWeight;

    /**
     * @return UNIT_WEIGHT
     */
    public String getUnitWeight() {
        return unitWeight;
    }

    /**
     * @param p UNIT_WEIGHT
     */
    public void setUnitWeight(final String p) {
        this.unitWeight = p;
    }

    /** OPE_TIME */
    @jakarta.validation.constraints.Size(max = 9)
    private String opeTime;

    /**
     * @return OPE_TIME
     */
    public String getOpeTime() {
        return opeTime;
    }

    /**
     * @param p OPE_TIME
     */
    public void setOpeTime(final String p) {
        this.opeTime = p;
    }

    /** HUM_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 9)
    private String humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    public String getHumPreTime() {
        return humPreTime;
    }

    /**
     * @param p HUM_PRE_TIME
     */
    public void setHumPreTime(final String p) {
        this.humPreTime = p;
    }

    /** HUM_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 9)
    private String humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    public String getHumActTime() {
        return humActTime;
    }

    /**
     * @param p HUM_ACT_TIME
     */
    public void setHumActTime(final String p) {
        this.humActTime = p;
    }

    /** MAC_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 9)
    private String macPreTime;

    /**
     * @return MAC_PRE_TIME
     */
    public String getMacPreTime() {
        return macPreTime;
    }

    /**
     * @param p MAC_PRE_TIME
     */
    public void setMacPreTime(final String p) {
        this.macPreTime = p;
    }

    /** MAC_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 9)
    private String macActTime;

    /**
     * @return MAC_ACT_TIME
     */
    public String getMacActTime() {
        return macActTime;
    }

    /**
     * @param p MAC_ACT_TIME
     */
    public void setMacActTime(final String p) {
        this.macActTime = p;
    }

    /** SUM_UNIT_SUPPLY */
    @jakarta.validation.constraints.Size(max = 10)
    private String sumUnitSupply;

    /**
     * @return SUM_UNIT_SUPPLY
     */
    public String getSumUnitSupply() {
        return sumUnitSupply;
    }

    /**
     * @param p SUM_UNIT_SUPPLY
     */
    public void setSumUnitSupply(final String p) {
        this.sumUnitSupply = p;
    }

    /** MATERIALS_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String materialsCost;

    /**
     * @return MATERIALS_COST
     */
    public String getMaterialsCost() {
        return materialsCost;
    }

    /**
     * @param p MATERIALS_COST
     */
    public void setMaterialsCost(final String p) {
        this.materialsCost = p;
    }

    /** HUM_LABOR_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String humLaborCostFirst;

    /**
     * @return HUM_LABOR_COST_FIRST
     */
    public String getHumLaborCostFirst() {
        return humLaborCostFirst;
    }

    /**
     * @param p HUM_LABOR_COST_FIRST
     */
    public void setHumLaborCostFirst(final String p) {
        this.humLaborCostFirst = p;
    }

    /** HUM_EXPENSES_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String humExpensesFirst;

    /**
     * @return HUM_EXPENSES_FIRST
     */
    public String getHumExpensesFirst() {
        return humExpensesFirst;
    }

    /**
     * @param p HUM_EXPENSES_FIRST
     */
    public void setHumExpensesFirst(final String p) {
        this.humExpensesFirst = p;
    }

    /** HUM_LABOR_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String humLaborCostSecond;

    /**
     * @return HUM_LABOR_COST_SECOND
     */
    public String getHumLaborCostSecond() {
        return humLaborCostSecond;
    }

    /**
     * @param p HUM_LABOR_COST_SECOND
     */
    public void setHumLaborCostSecond(final String p) {
        this.humLaborCostSecond = p;
    }

    /** HUM_EXPENSES_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String humExpensesSecond;

    /**
     * @return HUM_EXPENSES_SECOND
     */
    public String getHumExpensesSecond() {
        return humExpensesSecond;
    }

    /**
     * @param p HUM_EXPENSES_SECOND
     */
    public void setHumExpensesSecond(final String p) {
        this.humExpensesSecond = p;
    }

    /** MAC_LABOR_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String macLaborCostFirst;

    /**
     * @return MAC_LABOR_COST_FIRST
     */
    public String getMacLaborCostFirst() {
        return macLaborCostFirst;
    }

    /**
     * @param p MAC_LABOR_COST_FIRST
     */
    public void setMacLaborCostFirst(final String p) {
        this.macLaborCostFirst = p;
    }

    /** MAC_EXPENSES_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String macExpensesFirst;

    /**
     * @return MAC_EXPENSES_FIRST
     */
    public String getMacExpensesFirst() {
        return macExpensesFirst;
    }

    /**
     * @param p MAC_EXPENSES_FIRST
     */
    public void setMacExpensesFirst(final String p) {
        this.macExpensesFirst = p;
    }

    /** MAC_LABOR_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String macLaborCostSecond;

    /**
     * @return MAC_LABOR_COST_SECOND
     */
    public String getMacLaborCostSecond() {
        return macLaborCostSecond;
    }

    /**
     * @param p MAC_LABOR_COST_SECOND
     */
    public void setMacLaborCostSecond(final String p) {
        this.macLaborCostSecond = p;
    }

    /** MAC_EXPENSES_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String macExpensesSecond;

    /**
     * @return MAC_EXPENSES_SECOND
     */
    public String getMacExpensesSecond() {
        return macExpensesSecond;
    }

    /**
     * @param p MAC_EXPENSES_SECOND
     */
    public void setMacExpensesSecond(final String p) {
        this.macExpensesSecond = p;
    }

    /** DATA_SOURCE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String dataSourceKbn;

    /**
     * @return DATA_SOURCE_KBN
     */
    public String getDataSourceKbn() {
        return dataSourceKbn;
    }

    /**
     * @param p DATA_SOURCE_KBN
     */
    public void setDataSourceKbn(final String p) {
        this.dataSourceKbn = p;
    }

    /** T_UNIT_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tUnitCostFirst;

    /**
     * @return T_UNIT_COST_FIRST
     */
    public String getTUnitCostFirst() {
        return tUnitCostFirst;
    }

    /**
     * @param p T_UNIT_COST_FIRST
     */
    public void setTUnitCostFirst(final String p) {
        this.tUnitCostFirst = p;
    }

    /** T_UNIT_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String tUnitCostSecond;

    /**
     * @return T_UNIT_COST_SECOND
     */
    public String getTUnitCostSecond() {
        return tUnitCostSecond;
    }

    /**
     * @param p T_UNIT_COST_SECOND
     */
    public void setTUnitCostSecond(final String p) {
        this.tUnitCostSecond = p;
    }

    /** T_TOTAL_UNIT_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tTotalUnitCost;

    /**
     * @return T_TOTAL_UNIT_COST
     */
    public String getTTotalUnitCost() {
        return tTotalUnitCost;
    }

    /**
     * @param p T_TOTAL_UNIT_COST
     */
    public void setTTotalUnitCost(final String p) {
        this.tTotalUnitCost = p;
    }

    /** T_SUM_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tSumCostFirst;

    /**
     * @return T_SUM_COST_FIRST
     */
    public String getTSumCostFirst() {
        return tSumCostFirst;
    }

    /**
     * @param p T_SUM_COST_FIRST
     */
    public void setTSumCostFirst(final String p) {
        this.tSumCostFirst = p;
    }

    /** T_SUM_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String tSumCostSecond;

    /**
     * @return T_SUM_COST_SECOND
     */
    public String getTSumCostSecond() {
        return tSumCostSecond;
    }

    /**
     * @param p T_SUM_COST_SECOND
     */
    public void setTSumCostSecond(final String p) {
        this.tSumCostSecond = p;
    }

    /** T_TOTAL_SUM_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tTotalSumCost;

    /**
     * @return T_TOTAL_SUM_COST
     */
    public String getTTotalSumCost() {
        return tTotalSumCost;
    }

    /**
     * @param p T_TOTAL_SUM_COST
     */
    public void setTTotalSumCost(final String p) {
        this.tTotalSumCost = p;
    }

    /** T_OPE_COUNTS */
    @jakarta.validation.constraints.Size(max = 3)
    private String tOpeCounts;

    /**
     * @return T_OPE_COUNTS
     */
    public String getTOpeCounts() {
        return tOpeCounts;
    }

    /**
     * @param p T_OPE_COUNTS
     */
    public void setTOpeCounts(final String p) {
        this.tOpeCounts = p;
    }

    /** T_OPE_AMOUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String tOpeAmounts;

    /**
     * @return T_OPE_AMOUNTS
     */
    public String getTOpeAmounts() {
        return tOpeAmounts;
    }

    /**
     * @param p T_OPE_AMOUNTS
     */
    public void setTOpeAmounts(final String p) {
        this.tOpeAmounts = p;
    }

    /** T_UNIT_WEIGHT */
    @jakarta.validation.constraints.Size(max = 11)
    private String tUnitWeight;

    /**
     * @return T_UNIT_WEIGHT
     */
    public String getTUnitWeight() {
        return tUnitWeight;
    }

    /**
     * @param p T_UNIT_WEIGHT
     */
    public void setTUnitWeight(final String p) {
        this.tUnitWeight = p;
    }

    /** T_OPE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String tOpeTime;

    /**
     * @return T_OPE_TIME
     */
    public String getTOpeTime() {
        return tOpeTime;
    }

    /**
     * @param p T_OPE_TIME
     */
    public void setTOpeTime(final String p) {
        this.tOpeTime = p;
    }

    /** T_HUM_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String tHumPreTime;

    /**
     * @return T_HUM_PRE_TIME
     */
    public String getTHumPreTime() {
        return tHumPreTime;
    }

    /**
     * @param p T_HUM_PRE_TIME
     */
    public void setTHumPreTime(final String p) {
        this.tHumPreTime = p;
    }

    /** T_HUM_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String tHumActTime;

    /**
     * @return T_HUM_ACT_TIME
     */
    public String getTHumActTime() {
        return tHumActTime;
    }

    /**
     * @param p T_HUM_ACT_TIME
     */
    public void setTHumActTime(final String p) {
        this.tHumActTime = p;
    }

    /** T_MAC_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String tMacPreTime;

    /**
     * @return T_MAC_PRE_TIME
     */
    public String getTMacPreTime() {
        return tMacPreTime;
    }

    /**
     * @param p T_MAC_PRE_TIME
     */
    public void setTMacPreTime(final String p) {
        this.tMacPreTime = p;
    }

    /** T_MAC_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String tMacActTime;

    /**
     * @return T_MAC_ACT_TIME
     */
    public String getTMacActTime() {
        return tMacActTime;
    }

    /**
     * @param p T_MAC_ACT_TIME
     */
    public void setTMacActTime(final String p) {
        this.tMacActTime = p;
    }

    /** T_SUM_UNIT_SUPPLY */
    @jakarta.validation.constraints.Size(max = 10)
    private String tSumUnitSupply;

    /**
     * @return T_SUM_UNIT_SUPPLY
     */
    public String getTSumUnitSupply() {
        return tSumUnitSupply;
    }

    /**
     * @param p T_SUM_UNIT_SUPPLY
     */
    public void setTSumUnitSupply(final String p) {
        this.tSumUnitSupply = p;
    }

    /** T_MATERIALS_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tMaterialsCost;

    /**
     * @return T_MATERIALS_COST
     */
    public String getTMaterialsCost() {
        return tMaterialsCost;
    }

    /**
     * @param p T_MATERIALS_COST
     */
    public void setTMaterialsCost(final String p) {
        this.tMaterialsCost = p;
    }

    /** T_HUM_LABOR_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tHumLaborCostFirst;

    /**
     * @return T_HUM_LABOR_COST_FIRST
     */
    public String getTHumLaborCostFirst() {
        return tHumLaborCostFirst;
    }

    /**
     * @param p T_HUM_LABOR_COST_FIRST
     */
    public void setTHumLaborCostFirst(final String p) {
        this.tHumLaborCostFirst = p;
    }

    /** T_HUM_EXPENSES_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tHumExpensesFirst;

    /**
     * @return T_HUM_EXPENSES_FIRST
     */
    public String getTHumExpensesFirst() {
        return tHumExpensesFirst;
    }

    /**
     * @param p T_HUM_EXPENSES_FIRST
     */
    public void setTHumExpensesFirst(final String p) {
        this.tHumExpensesFirst = p;
    }

    /** T_HUM_LABOR_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String tHumLaborCostSecond;

    /**
     * @return T_HUM_LABOR_COST_SECOND
     */
    public String getTHumLaborCostSecond() {
        return tHumLaborCostSecond;
    }

    /**
     * @param p T_HUM_LABOR_COST_SECOND
     */
    public void setTHumLaborCostSecond(final String p) {
        this.tHumLaborCostSecond = p;
    }

    /** T_HUM_EXPENSES_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String tHumExpensesSecond;

    /**
     * @return T_HUM_EXPENSES_SECOND
     */
    public String getTHumExpensesSecond() {
        return tHumExpensesSecond;
    }

    /**
     * @param p T_HUM_EXPENSES_SECOND
     */
    public void setTHumExpensesSecond(final String p) {
        this.tHumExpensesSecond = p;
    }

    /** T_MAC_LABOR_COST_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tMacLaborCostFirst;

    /**
     * @return T_MAC_LABOR_COST_FIRST
     */
    public String getTMacLaborCostFirst() {
        return tMacLaborCostFirst;
    }

    /**
     * @param p T_MAC_LABOR_COST_FIRST
     */
    public void setTMacLaborCostFirst(final String p) {
        this.tMacLaborCostFirst = p;
    }

    /** T_MAC_EXPENSES_FIRST */
    @jakarta.validation.constraints.Size(max = 9)
    private String tMacExpensesFirst;

    /**
     * @return T_MAC_EXPENSES_FIRST
     */
    public String getTMacExpensesFirst() {
        return tMacExpensesFirst;
    }

    /**
     * @param p T_MAC_EXPENSES_FIRST
     */
    public void setTMacExpensesFirst(final String p) {
        this.tMacExpensesFirst = p;
    }

    /** T_MAC_LABOR_COST_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String tMacLaborCostSecond;

    /**
     * @return T_MAC_LABOR_COST_SECOND
     */
    public String getTMacLaborCostSecond() {
        return tMacLaborCostSecond;
    }

    /**
     * @param p T_MAC_LABOR_COST_SECOND
     */
    public void setTMacLaborCostSecond(final String p) {
        this.tMacLaborCostSecond = p;
    }

    /** T_MAC_EXPENSES_SECOND */
    @jakarta.validation.constraints.Size(max = 9)
    private String tMacExpensesSecond;

    /**
     * @return T_MAC_EXPENSES_SECOND
     */
    public String getTMacExpensesSecond() {
        return tMacExpensesSecond;
    }

    /**
     * @param p T_MAC_EXPENSES_SECOND
     */
    public void setTMacExpensesSecond(final String p) {
        this.tMacExpensesSecond = p;
    }

    /** T_DATA_SOURCE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String tDataSourceKbn;

    /**
     * @return T_DATA_SOURCE_KBN
     */
    public String getTDataSourceKbn() {
        return tDataSourceKbn;
    }

    /**
     * @param p T_DATA_SOURCE_KBN
     */
    public void setTDataSourceKbn(final String p) {
        this.tDataSourceKbn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
