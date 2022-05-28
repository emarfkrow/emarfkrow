package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_COST_REG_LINE_Y2登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineY2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalCostRegLineY2RegistForm.class);

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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
