package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_COST_CENTER登録フォーム
 *
 * @author emarfkrow
 */
public class MstCostCenterRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCostCenterRegistForm.class);

    /** COST_CENTER_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String costCenterCode;

    /**
     * @return COST_CENTER_CODE
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * @param p COST_CENTER_CODE
     */
    public void setCostCenterCode(final String p) {
        this.costCenterCode = p;
    }

    /** COST_CENTER_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String costCenterName;

    /**
     * @return COST_CENTER_NAME
     */
    public String getCostCenterName() {
        return costCenterName;
    }

    /**
     * @param p COST_CENTER_NAME
     */
    public void setCostCenterName(final String p) {
        this.costCenterName = p;
    }

    /** IN_OUT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    public String getInOutKbn() {
        return inOutKbn;
    }

    /**
     * @param p IN_OUT_KBN
     */
    public void setInOutKbn(final String p) {
        this.inOutKbn = p;
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

    /** COST_RATE_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String costRateCode;

    /**
     * @return COST_RATE_CODE
     */
    public String getCostRateCode() {
        return costRateCode;
    }

    /**
     * @param p COST_RATE_CODE
     */
    public void setCostRateCode(final String p) {
        this.costRateCode = p;
    }

    /** COST_COLLECT */
    @jakarta.validation.constraints.Size(max = 1)
    private String costCollect;

    /**
     * @return COST_COLLECT
     */
    public String getCostCollect() {
        return costCollect;
    }

    /**
     * @param p COST_COLLECT
     */
    public void setCostCollect(final String p) {
        this.costCollect = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** MST_COST_CENTER_BK */
    @jakarta.validation.Valid
    private List<MstCostCenterBkRegistForm> mstCostCenterBkGrid;

    /**
     * @return MST_COST_CENTER_BK
     */
    public List<MstCostCenterBkRegistForm> getMstCostCenterBkGrid() {
        return mstCostCenterBkGrid;
    }

    /**
     * @param p
     */
    public void setMstCostCenterBkGrid(final List<MstCostCenterBkRegistForm> p) {
        this.mstCostCenterBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
