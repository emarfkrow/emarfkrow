package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_Y_SUP_BUDGET_PUR一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdYSupBudgetPurSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdYSupBudgetPurRegistForm.class);

    /** PRD_Y_SUP_BUDGET_PUR登録フォームのリスト */
    @Valid
    private List<PrdYSupBudgetPurRegistForm> prdYSupBudgetPurGrid;

    /**
     * @return PRD_Y_SUP_BUDGET_PUR登録フォームのリスト
     */
    public List<PrdYSupBudgetPurRegistForm> getPrdYSupBudgetPurGrid() {
        return prdYSupBudgetPurGrid;
    }

    /**
     * @param p PRD_Y_SUP_BUDGET_PUR登録フォームのリスト
     */
    public void setPrdYSupBudgetPurGrid(final List<PrdYSupBudgetPurRegistForm> p) {
        this.prdYSupBudgetPurGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
