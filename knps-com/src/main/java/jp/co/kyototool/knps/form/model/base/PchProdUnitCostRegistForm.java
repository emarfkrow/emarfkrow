package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_PROD_UNIT_COST登録フォーム
 *
 * @author emarfkrow
 */
public class PchProdUnitCostRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchProdUnitCostRegistForm.class);

    /** CLOSE_DATE */
    @jakarta.validation.constraints.Size(max = 4)
    private String closeDate;

    /**
     * @return CLOSE_DATE
     */
    public String getCloseDate() {
        return closeDate;
    }

    /**
     * @param p CLOSE_DATE
     */
    public void setCloseDate(final String p) {
        this.closeDate = p;
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

    /** PROPRIETARY_TOTAL_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String proprietaryTotalCounts;

    /**
     * @return PROPRIETARY_TOTAL_COUNTS
     */
    public String getProprietaryTotalCounts() {
        return proprietaryTotalCounts;
    }

    /**
     * @param p PROPRIETARY_TOTAL_COUNTS
     */
    public void setProprietaryTotalCounts(final String p) {
        this.proprietaryTotalCounts = p;
    }

    /** PROPRIETARY_TOTAL_COST */
    @jakarta.validation.constraints.Size(max = 11)
    private String proprietaryTotalCost;

    /**
     * @return PROPRIETARY_TOTAL_COST
     */
    public String getProprietaryTotalCost() {
        return proprietaryTotalCost;
    }

    /**
     * @param p PROPRIETARY_TOTAL_COST
     */
    public void setProprietaryTotalCost(final String p) {
        this.proprietaryTotalCost = p;
    }

    /** LAST_PRCH_UNIT_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String lastPrchUnitCost;

    /**
     * @return LAST_PRCH_UNIT_COST
     */
    public String getLastPrchUnitCost() {
        return lastPrchUnitCost;
    }

    /**
     * @param p LAST_PRCH_UNIT_COST
     */
    public void setLastPrchUnitCost(final String p) {
        this.lastPrchUnitCost = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
