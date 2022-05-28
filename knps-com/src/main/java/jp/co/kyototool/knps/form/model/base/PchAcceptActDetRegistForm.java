package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_ACCEPT_ACT_DET登録フォーム
 *
 * @author emarfkrow
 */
public class PchAcceptActDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchAcceptActDetRegistForm.class);

    /** ACT_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String actNo;

    /**
     * @return ACT_NO
     */
    public String getActNo() {
        return actNo;
    }

    /**
     * @param p ACT_NO
     */
    public void setActNo(final String p) {
        this.actNo = p;
    }

    /** ACT_BRANCH_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String actBranchNo;

    /**
     * @return ACT_BRANCH_NO
     */
    public String getActBranchNo() {
        return actBranchNo;
    }

    /**
     * @param p ACT_BRANCH_NO
     */
    public void setActBranchNo(final String p) {
        this.actBranchNo = p;
    }

    /** INSPECT_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String inspectCounts;

    /**
     * @return INSPECT_COUNTS
     */
    public String getInspectCounts() {
        return inspectCounts;
    }

    /**
     * @param p INSPECT_COUNTS
     */
    public void setInspectCounts(final String p) {
        this.inspectCounts = p;
    }

    /** INSPECT_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String inspectUnit;

    /**
     * @return INSPECT_UNIT
     */
    public String getInspectUnit() {
        return inspectUnit;
    }

    /**
     * @param p INSPECT_UNIT
     */
    public void setInspectUnit(final String p) {
        this.inspectUnit = p;
    }

    /** AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String amount;

    /**
     * @return AMOUNT
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param p AMOUNT
     */
    public void setAmount(final String p) {
        this.amount = p;
    }

    /** TAX_AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String taxAmount;

    /**
     * @return TAX_AMOUNT
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * @param p TAX_AMOUNT
     */
    public void setTaxAmount(final String p) {
        this.taxAmount = p;
    }

    /** CHECK_ISSUE_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String checkIssueDate;

    /**
     * @return CHECK_ISSUE_DATE
     */
    public String getCheckIssueDate() {
        return checkIssueDate;
    }

    /**
     * @param p CHECK_ISSUE_DATE
     */
    public void setCheckIssueDate(final String p) {
        this.checkIssueDate = p;
    }

    /** CHECK_LIST_NO */
    @jakarta.validation.constraints.Size(max = 8)
    private String checkListNo;

    /**
     * @return CHECK_LIST_NO
     */
    public String getCheckListNo() {
        return checkListNo;
    }

    /**
     * @param p CHECK_LIST_NO
     */
    public void setCheckListNo(final String p) {
        this.checkListNo = p;
    }

    /** CHECK_ISSUE_OPE */
    @jakarta.validation.constraints.Size(max = 10)
    private String checkIssueOpe;

    /**
     * @return CHECK_ISSUE_OPE
     */
    public String getCheckIssueOpe() {
        return checkIssueOpe;
    }

    /**
     * @param p CHECK_ISSUE_OPE
     */
    public void setCheckIssueOpe(final String p) {
        this.checkIssueOpe = p;
    }

    /** CHECK_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String checkFlg;

    /**
     * @return CHECK_FLG
     */
    public String getCheckFlg() {
        return checkFlg;
    }

    /**
     * @param p CHECK_FLG
     */
    public void setCheckFlg(final String p) {
        this.checkFlg = p;
    }

    /** CHECK_COMP_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String checkCompDate;

    /**
     * @return CHECK_COMP_DATE
     */
    public String getCheckCompDate() {
        return checkCompDate;
    }

    /**
     * @param p CHECK_COMP_DATE
     */
    public void setCheckCompDate(final String p) {
        this.checkCompDate = p;
    }

    /** CHECK_COMP_OPE */
    @jakarta.validation.constraints.Size(max = 10)
    private String checkCompOpe;

    /**
     * @return CHECK_COMP_OPE
     */
    public String getCheckCompOpe() {
        return checkCompOpe;
    }

    /**
     * @param p CHECK_COMP_OPE
     */
    public void setCheckCompOpe(final String p) {
        this.checkCompOpe = p;
    }

    /** CLOSE_DATE */
    @jakarta.validation.constraints.Size(max = 7)
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

    /** INSPECT_ISSHIKI_UNIT_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String inspectIsshikiUnitF;

    /**
     * @return INSPECT_ISSHIKI_UNIT_F
     */
    public String getInspectIsshikiUnitF() {
        return inspectIsshikiUnitF;
    }

    /**
     * @param p INSPECT_ISSHIKI_UNIT_F
     */
    public void setInspectIsshikiUnitF(final String p) {
        this.inspectIsshikiUnitF = p;
    }

    /** INSPECT_ISSHIKI_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String inspectIsshikiCounts;

    /**
     * @return INSPECT_ISSHIKI_COUNTS
     */
    public String getInspectIsshikiCounts() {
        return inspectIsshikiCounts;
    }

    /**
     * @param p INSPECT_ISSHIKI_COUNTS
     */
    public void setInspectIsshikiCounts(final String p) {
        this.inspectIsshikiCounts = p;
    }

    /** INSPECT_ISSHIKI_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String inspectIsshikiUnit;

    /**
     * @return INSPECT_ISSHIKI_UNIT
     */
    public String getInspectIsshikiUnit() {
        return inspectIsshikiUnit;
    }

    /**
     * @param p INSPECT_ISSHIKI_UNIT
     */
    public void setInspectIsshikiUnit(final String p) {
        this.inspectIsshikiUnit = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
