package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_MATE_NES_COUNTS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMateNesCountsSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMateNesCountsRegistForm.class);

    /** PRD_MATE_NES_COUNTS登録フォームのリスト */
    @Valid
    private List<PrdMateNesCountsRegistForm> prdMateNesCountsGrid;

    /**
     * @return PRD_MATE_NES_COUNTS登録フォームのリスト
     */
    public List<PrdMateNesCountsRegistForm> getPrdMateNesCountsGrid() {
        return prdMateNesCountsGrid;
    }

    /**
     * @param p PRD_MATE_NES_COUNTS登録フォームのリスト
     */
    public void setPrdMateNesCountsGrid(final List<PrdMateNesCountsRegistForm> p) {
        this.prdMateNesCountsGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
