package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_PRO_NES_COUNTS登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMProNesCountsRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMProNesCountsRegistForm.class);

    /** PRO_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    public String getProHinban() {
        return proHinban;
    }

    /**
     * @param p PRO_HINBAN
     */
    public void setProHinban(final String p) {
        this.proHinban = p;
    }

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

    /** PRO_NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String proNesCounts;

    /**
     * @return PRO_NES_COUNTS
     */
    public String getProNesCounts() {
        return proNesCounts;
    }

    /**
     * @param p PRO_NES_COUNTS
     */
    public void setProNesCounts(final String p) {
        this.proNesCounts = p;
    }

    /** PRO_ADJ_COUNTS */
    @jakarta.validation.constraints.Size(max = 8)
    private String proAdjCounts;

    /**
     * @return PRO_ADJ_COUNTS
     */
    public String getProAdjCounts() {
        return proAdjCounts;
    }

    /**
     * @param p PRO_ADJ_COUNTS
     */
    public void setProAdjCounts(final String p) {
        this.proAdjCounts = p;
    }

    /** PRD_Y_PRO_NES_COUNTS */
    @jakarta.validation.Valid
    private PrdYProNesCountsRegistForm prdYProNesCountsRegistForm;

    /**
     * @return PrdYProNesCountsRegistForm
     */
    public PrdYProNesCountsRegistForm getPrdYProNesCountsRegistForm() {
        return prdYProNesCountsRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdYProNesCountsRegistForm(final PrdYProNesCountsRegistForm p) {
        this.prdYProNesCountsRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
