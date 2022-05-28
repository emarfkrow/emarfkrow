package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_Y_PRO_NES_COUNTS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdYProNesCountsSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdYProNesCountsRegistForm.class);

    /** PRD_Y_PRO_NES_COUNTS登録フォームのリスト */
    @Valid
    private List<PrdYProNesCountsRegistForm> prdYProNesCountsGrid;

    /**
     * @return PRD_Y_PRO_NES_COUNTS登録フォームのリスト
     */
    public List<PrdYProNesCountsRegistForm> getPrdYProNesCountsGrid() {
        return prdYProNesCountsGrid;
    }

    /**
     * @param p PRD_Y_PRO_NES_COUNTS登録フォームのリスト
     */
    public void setPrdYProNesCountsGrid(final List<PrdYProNesCountsRegistForm> p) {
        this.prdYProNesCountsGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
