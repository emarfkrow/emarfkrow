package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_ORDERPOINT_SUMMARY登録フォーム
 *
 * @author emarfkrow
 */
public class PrdOrderpointSummaryRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdOrderpointSummaryRegistForm.class);

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

    /** ISSUE_NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String issueNesCounts;

    /**
     * @return ISSUE_NES_COUNTS
     */
    public String getIssueNesCounts() {
        return issueNesCounts;
    }

    /**
     * @param p ISSUE_NES_COUNTS
     */
    public void setIssueNesCounts(final String p) {
        this.issueNesCounts = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
