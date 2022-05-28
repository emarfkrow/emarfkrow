package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_MOD_ACT_DET登録フォーム
 *
 * @author emarfkrow
 */
public class MfgModActDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgModActDetRegistForm.class);

    /** MOD_ACT_NO */
    @jakarta.validation.constraints.Size(max = 12)
    private String modActNo;

    /**
     * @return MOD_ACT_NO
     */
    public String getModActNo() {
        return modActNo;
    }

    /**
     * @param p MOD_ACT_NO
     */
    public void setModActNo(final String p) {
        this.modActNo = p;
    }

    /** MOD_ACT_BRANCH_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String modActBranchNo;

    /**
     * @return MOD_ACT_BRANCH_NO
     */
    public String getModActBranchNo() {
        return modActBranchNo;
    }

    /**
     * @param p MOD_ACT_BRANCH_NO
     */
    public void setModActBranchNo(final String p) {
        this.modActBranchNo = p;
    }

    /** MOD_ACT_ITEM */
    @jakarta.validation.constraints.Size(max = 1)
    private String modActItem;

    /**
     * @return MOD_ACT_ITEM
     */
    public String getModActItem() {
        return modActItem;
    }

    /**
     * @param p MOD_ACT_ITEM
     */
    public void setModActItem(final String p) {
        this.modActItem = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
