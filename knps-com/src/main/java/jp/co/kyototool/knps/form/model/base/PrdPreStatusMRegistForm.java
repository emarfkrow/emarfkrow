package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_PRE_STATUS_M登録フォーム
 *
 * @author emarfkrow
 */
public class PrdPreStatusMRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdPreStatusMRegistForm.class);

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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
