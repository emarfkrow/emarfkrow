package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_ORDERPOINT_SUMMARY一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdOrderpointSummarySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdOrderpointSummaryRegistForm.class);

    /** PRD_ORDERPOINT_SUMMARY登録フォームのリスト */
    @Valid
    private List<PrdOrderpointSummaryRegistForm> prdOrderpointSummaryGrid;

    /**
     * @return PRD_ORDERPOINT_SUMMARY登録フォームのリスト
     */
    public List<PrdOrderpointSummaryRegistForm> getPrdOrderpointSummaryGrid() {
        return prdOrderpointSummaryGrid;
    }

    /**
     * @param p PRD_ORDERPOINT_SUMMARY登録フォームのリスト
     */
    public void setPrdOrderpointSummaryGrid(final List<PrdOrderpointSummaryRegistForm> p) {
        this.prdOrderpointSummaryGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
