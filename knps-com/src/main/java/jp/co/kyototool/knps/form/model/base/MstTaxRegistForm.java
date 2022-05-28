package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_TAX登録フォーム
 *
 * @author emarfkrow
 */
public class MstTaxRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstTaxRegistForm.class);

    /** TAX_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String taxCode;

    /**
     * @return TAX_CODE
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * @param p TAX_CODE
     */
    public void setTaxCode(final String p) {
        this.taxCode = p;
    }

    /** TAX_NAME */
    @jakarta.validation.constraints.Size(max = 20)
    private String taxName;

    /**
     * @return TAX_NAME
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * @param p TAX_NAME
     */
    public void setTaxName(final String p) {
        this.taxName = p;
    }

    /** TAX_RATE */
    @jakarta.validation.constraints.Size(max = 6)
    private String taxRate;

    /**
     * @return TAX_RATE
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * @param p TAX_RATE
     */
    public void setTaxRate(final String p) {
        this.taxRate = p;
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
