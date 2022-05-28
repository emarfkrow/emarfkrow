package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ACCOUNT_CODE登録フォーム
 *
 * @author emarfkrow
 */
public class MstAccountCodeRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstAccountCodeRegistForm.class);

    /** ACCOUNT_CODE */
    @jakarta.validation.constraints.Size(max = 5)
    private String accountCode;

    /**
     * @return ACCOUNT_CODE
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * @param p ACCOUNT_CODE
     */
    public void setAccountCode(final String p) {
        this.accountCode = p;
    }

    /** ACCOUNT_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String accountName;

    /**
     * @return ACCOUNT_NAME
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param p ACCOUNT_NAME
     */
    public void setAccountName(final String p) {
        this.accountName = p;
    }

    /** EXPENSE_KBN1 */
    @jakarta.validation.constraints.Size(max = 1)
    private String expenseKbn1;

    /**
     * @return EXPENSE_KBN1
     */
    public String getExpenseKbn1() {
        return expenseKbn1;
    }

    /**
     * @param p EXPENSE_KBN1
     */
    public void setExpenseKbn1(final String p) {
        this.expenseKbn1 = p;
    }

    /** EXPENSE_KBN2 */
    @jakarta.validation.constraints.Size(max = 1)
    private String expenseKbn2;

    /**
     * @return EXPENSE_KBN2
     */
    public String getExpenseKbn2() {
        return expenseKbn2;
    }

    /**
     * @param p EXPENSE_KBN2
     */
    public void setExpenseKbn2(final String p) {
        this.expenseKbn2 = p;
    }

    /** EXPENSE_KBN3 */
    @jakarta.validation.constraints.Size(max = 1)
    private String expenseKbn3;

    /**
     * @return EXPENSE_KBN3
     */
    public String getExpenseKbn3() {
        return expenseKbn3;
    }

    /**
     * @param p EXPENSE_KBN3
     */
    public void setExpenseKbn3(final String p) {
        this.expenseKbn3 = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
