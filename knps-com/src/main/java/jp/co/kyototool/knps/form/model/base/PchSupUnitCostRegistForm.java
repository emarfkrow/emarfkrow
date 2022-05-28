package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_SUP_UNIT_COST登録フォーム
 *
 * @author emarfkrow
 */
public class PchSupUnitCostRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchSupUnitCostRegistForm.class);

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

    /** LAST_ACT_DATE */
    @jakarta.validation.constraints.Size(max = 4)
    private String lastActDate;

    /**
     * @return LAST_ACT_DATE
     */
    public String getLastActDate() {
        return lastActDate;
    }

    /**
     * @param p LAST_ACT_DATE
     */
    public void setLastActDate(final String p) {
        this.lastActDate = p;
    }

    /** LOWER_COST_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String lowerCostKbn;

    /**
     * @return LOWER_COST_KBN
     */
    public String getLowerCostKbn() {
        return lowerCostKbn;
    }

    /**
     * @param p LOWER_COST_KBN
     */
    public void setLowerCostKbn(final String p) {
        this.lowerCostKbn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
