package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_PRE_STATUS_Y登録フォーム
 *
 * @author emarfkrow
 */
public class PrdPreStatusYRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdPreStatusYRegistForm.class);

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

    /** SALES_TARGET_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String salesTargetStatus;

    /**
     * @return SALES_TARGET_STATUS
     */
    public String getSalesTargetStatus() {
        return salesTargetStatus;
    }

    /**
     * @param p SALES_TARGET_STATUS
     */
    public void setSalesTargetStatus(final String p) {
        this.salesTargetStatus = p;
    }

    /** PRD_PLAN_MAKE_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String prdPlanMakeStatus;

    /**
     * @return PRD_PLAN_MAKE_STATUS
     */
    public String getPrdPlanMakeStatus() {
        return prdPlanMakeStatus;
    }

    /**
     * @param p PRD_PLAN_MAKE_STATUS
     */
    public void setPrdPlanMakeStatus(final String p) {
        this.prdPlanMakeStatus = p;
    }

    /** PRD_PLAN_FIXED_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String prdPlanFixedStatus;

    /**
     * @return PRD_PLAN_FIXED_STATUS
     */
    public String getPrdPlanFixedStatus() {
        return prdPlanFixedStatus;
    }

    /**
     * @param p PRD_PLAN_FIXED_STATUS
     */
    public void setPrdPlanFixedStatus(final String p) {
        this.prdPlanFixedStatus = p;
    }

    /** MFG_RATE_BK */
    @jakarta.validation.Valid
    private List<MfgRateBkRegistForm> mfgRateBkGrid;

    /**
     * @return MFG_RATE_BK
     */
    public List<MfgRateBkRegistForm> getMfgRateBkGrid() {
        return mfgRateBkGrid;
    }

    /**
     * @param p
     */
    public void setMfgRateBkGrid(final List<MfgRateBkRegistForm> p) {
        this.mfgRateBkGrid = p;
    }

    /** PRD_PRE_STATUS_M */
    @jakarta.validation.Valid
    private List<PrdPreStatusMRegistForm> prdPreStatusMGrid;

    /**
     * @return PRD_PRE_STATUS_M
     */
    public List<PrdPreStatusMRegistForm> getPrdPreStatusMGrid() {
        return prdPreStatusMGrid;
    }

    /**
     * @param p
     */
    public void setPrdPreStatusMGrid(final List<PrdPreStatusMRegistForm> p) {
        this.prdPreStatusMGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
