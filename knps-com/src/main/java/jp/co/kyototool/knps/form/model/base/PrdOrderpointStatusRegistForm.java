package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_ORDERPOINT_STATUS登録フォーム
 *
 * @author emarfkrow
 */
public class PrdOrderpointStatusRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdOrderpointStatusRegistForm.class);

    /** HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** PUBLISHED_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String publishedCounts;

    /**
     * @return PUBLISHED_COUNTS
     */
    public String getPublishedCounts() {
        return publishedCounts;
    }

    /**
     * @param p PUBLISHED_COUNTS
     */
    public void setPublishedCounts(final String p) {
        this.publishedCounts = p;
    }

    /** PRD_ORDERPOINT_SUMMARY */
    @jakarta.validation.Valid
    private PrdOrderpointSummaryRegistForm prdOrderpointSummaryRegistForm;

    /**
     * @return PrdOrderpointSummaryRegistForm
     */
    public PrdOrderpointSummaryRegistForm getPrdOrderpointSummaryRegistForm() {
        return prdOrderpointSummaryRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdOrderpointSummaryRegistForm(final PrdOrderpointSummaryRegistForm p) {
        this.prdOrderpointSummaryRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
