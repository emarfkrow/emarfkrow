package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_SALES_TARGET_MONTH登録フォーム
 *
 * @author emarfkrow
 */
public class PrdSalesTargetMonthRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdSalesTargetMonthRegistForm.class);

    /** YYYY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return yyyy;
    }

    /**
     * @param p YYYY
     */
    public void setYyyy(final String p) {
        this.yyyy = p;
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

    /** FILE_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String fileId;

    /**
     * @return FILE_ID
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * @param p FILE_ID
     */
    public void setFileId(final String p) {
        this.fileId = p;
    }

    /** SALES_HINBAN */
    @jakarta.validation.constraints.Size(max = 20)
    private String salesHinban;

    /**
     * @return SALES_HINBAN
     */
    public String getSalesHinban() {
        return salesHinban;
    }

    /**
     * @param p SALES_HINBAN
     */
    public void setSalesHinban(final String p) {
        this.salesHinban = p;
    }

    /** SALES_TARGET_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String salesTargetCounts;

    /**
     * @return SALES_TARGET_COUNTS
     */
    public String getSalesTargetCounts() {
        return salesTargetCounts;
    }

    /**
     * @param p SALES_TARGET_COUNTS
     */
    public void setSalesTargetCounts(final String p) {
        this.salesTargetCounts = p;
    }

    /** PRD_SALES_TARGET_YEAR */
    @jakarta.validation.Valid
    private PrdSalesTargetYearRegistForm prdSalesTargetYearRegistForm;

    /**
     * @return PrdSalesTargetYearRegistForm
     */
    public PrdSalesTargetYearRegistForm getPrdSalesTargetYearRegistForm() {
        return prdSalesTargetYearRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdSalesTargetYearRegistForm(final PrdSalesTargetYearRegistForm p) {
        this.prdSalesTargetYearRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
