package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_Y_SUP_BUDGET_OUT一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdYSupBudgetOutSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdYSupBudgetOutRegistForm.class);

    /** PRD_Y_SUP_BUDGET_OUT登録フォームのリスト */
    @Valid
    private List<PrdYSupBudgetOutRegistForm> prdYSupBudgetOutGrid;

    /**
     * @return PRD_Y_SUP_BUDGET_OUT登録フォームのリスト
     */
    public List<PrdYSupBudgetOutRegistForm> getPrdYSupBudgetOutGrid() {
        return prdYSupBudgetOutGrid;
    }

    /**
     * @param p PRD_Y_SUP_BUDGET_OUT登録フォームのリスト
     */
    public void setPrdYSupBudgetOutGrid(final List<PrdYSupBudgetOutRegistForm> p) {
        this.prdYSupBudgetOutGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
