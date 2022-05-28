package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_PRO_ACT_DET登録フォーム
 *
 * @author emarfkrow
 */
public class MfgProActDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgProActDetRegistForm.class);

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

    /** PRO_ROUTING_BRANCH */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String proRoutingBranch;

    /**
     * @return PRO_ROUTING_BRANCH
     */
    public String getProRoutingBranch() {
        return proRoutingBranch;
    }

    /**
     * @param p PRO_ROUTING_BRANCH
     */
    public void setProRoutingBranch(final String p) {
        this.proRoutingBranch = p;
    }

    /** PRO_ACT_BRANCH_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String proActBranchNo;

    /**
     * @return PRO_ACT_BRANCH_NO
     */
    public String getProActBranchNo() {
        return proActBranchNo;
    }

    /**
     * @param p PRO_ACT_BRANCH_NO
     */
    public void setProActBranchNo(final String p) {
        this.proActBranchNo = p;
    }

    /** ACT_ITEM */
    @jakarta.validation.constraints.Size(max = 1)
    private String actItem;

    /**
     * @return ACT_ITEM
     */
    public String getActItem() {
        return actItem;
    }

    /**
     * @param p ACT_ITEM
     */
    public void setActItem(final String p) {
        this.actItem = p;
    }

    /** ACT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String actDate;

    /**
     * @return ACT_DATE
     */
    public String getActDate() {
        return actDate;
    }

    /**
     * @param p ACT_DATE
     */
    public void setActDate(final String p) {
        this.actDate = p;
    }

    /** CAUSE_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String causeCode;

    /**
     * @return CAUSE_CODE
     */
    public String getCauseCode() {
        return causeCode;
    }

    /**
     * @param p CAUSE_CODE
     */
    public void setCauseCode(final String p) {
        this.causeCode = p;
    }

    /** OPERATOR */
    @jakarta.validation.constraints.Size(max = 10)
    private String operator;

    /**
     * @return OPERATOR
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param p OPERATOR
     */
    public void setOperator(final String p) {
        this.operator = p;
    }

    /** LAST_ROUTING */
    @jakarta.validation.constraints.Size(max = 1)
    private String lastRouting;

    /**
     * @return LAST_ROUTING
     */
    public String getLastRouting() {
        return lastRouting;
    }

    /**
     * @param p LAST_ROUTING
     */
    public void setLastRouting(final String p) {
        this.lastRouting = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
