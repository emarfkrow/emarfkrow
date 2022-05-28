package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SALES_TAX登録フォーム
 *
 * @author emarfkrow
 */
public class MstSalesTaxRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSalesTaxRegistForm.class);

    /** START_DATE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 7)
    private String startDate;

    /**
     * @return START_DATE
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param p START_DATE
     */
    public void setStartDate(final String p) {
        this.startDate = p;
    }

    /** SALSE_TAX */
    @jakarta.validation.constraints.Size(max = 3)
    private String salseTax;

    /**
     * @return SALSE_TAX
     */
    public String getSalseTax() {
        return salseTax;
    }

    /**
     * @param p SALSE_TAX
     */
    public void setSalseTax(final String p) {
        this.salseTax = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
