package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_MATE_NES_COUNTS_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMateNesCountsBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMateNesCountsBkRegistForm.class);

    /** PRD_MATE_NES_COUNTS_BK登録フォームのリスト */
    @Valid
    private List<PrdMateNesCountsBkRegistForm> prdMateNesCountsBkGrid;

    /**
     * @return PRD_MATE_NES_COUNTS_BK登録フォームのリスト
     */
    public List<PrdMateNesCountsBkRegistForm> getPrdMateNesCountsBkGrid() {
        return prdMateNesCountsBkGrid;
    }

    /**
     * @param p PRD_MATE_NES_COUNTS_BK登録フォームのリスト
     */
    public void setPrdMateNesCountsBkGrid(final List<PrdMateNesCountsBkRegistForm> p) {
        this.prdMateNesCountsBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
