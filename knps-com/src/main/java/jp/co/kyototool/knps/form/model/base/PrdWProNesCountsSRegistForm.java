package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_W_PRO_NES_COUNTS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdWProNesCountsSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdWProNesCountsRegistForm.class);

    /** PRD_W_PRO_NES_COUNTS登録フォームのリスト */
    @Valid
    private List<PrdWProNesCountsRegistForm> prdWProNesCountsGrid;

    /**
     * @return PRD_W_PRO_NES_COUNTS登録フォームのリスト
     */
    public List<PrdWProNesCountsRegistForm> getPrdWProNesCountsGrid() {
        return prdWProNesCountsGrid;
    }

    /**
     * @param p PRD_W_PRO_NES_COUNTS登録フォームのリスト
     */
    public void setPrdWProNesCountsGrid(final List<PrdWProNesCountsRegistForm> p) {
        this.prdWProNesCountsGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
