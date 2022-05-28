package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_PRO_ACT_STATUS登録フォーム
 *
 * @author emarfkrow
 */
public class MfgProActStatusRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgProActStatusRegistForm.class);

    /** CHILD_PLAN_NO */
    @jakarta.validation.constraints.Size(max = 12)
    private String childPlanNo;

    /**
     * @return CHILD_PLAN_NO
     */
    public String getChildPlanNo() {
        return childPlanNo;
    }

    /**
     * @param p CHILD_PLAN_NO
     */
    public void setChildPlanNo(final String p) {
        this.childPlanNo = p;
    }

    /** PRO_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String proNo;

    /**
     * @return PRO_NO
     */
    public String getProNo() {
        return proNo;
    }

    /**
     * @param p PRO_NO
     */
    public void setProNo(final String p) {
        this.proNo = p;
    }

    /** ACT_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String actStatus;

    /**
     * @return ACT_STATUS
     */
    public String getActStatus() {
        return actStatus;
    }

    /**
     * @param p ACT_STATUS
     */
    public void setActStatus(final String p) {
        this.actStatus = p;
    }

    /** USER_ID */
    @jakarta.validation.constraints.Size(max = 10)
    private String userId;

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param p USER_ID
     */
    public void setUserId(final String p) {
        this.userId = p;
    }

    /** PRD_DAILY_PRO_PLAN_DETAIL */
    @jakarta.validation.Valid
    private PrdDailyProPlanDetailRegistForm prdDailyProPlanDetailRegistForm;

    /**
     * @return PrdDailyProPlanDetailRegistForm
     */
    public PrdDailyProPlanDetailRegistForm getPrdDailyProPlanDetailRegistForm() {
        return prdDailyProPlanDetailRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdDailyProPlanDetailRegistForm(final PrdDailyProPlanDetailRegistForm p) {
        this.prdDailyProPlanDetailRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
