package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_SUP_BUDGET_OUT一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetOutSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMSupBudgetOutRegistForm.class);

    /** PRD_M_SUP_BUDGET_OUT登録フォームのリスト */
    @Valid
    private List<PrdMSupBudgetOutRegistForm> prdMSupBudgetOutGrid;

    /**
     * @return PRD_M_SUP_BUDGET_OUT登録フォームのリスト
     */
    public List<PrdMSupBudgetOutRegistForm> getPrdMSupBudgetOutGrid() {
        return prdMSupBudgetOutGrid;
    }

    /**
     * @param p PRD_M_SUP_BUDGET_OUT登録フォームのリスト
     */
    public void setPrdMSupBudgetOutGrid(final List<PrdMSupBudgetOutRegistForm> p) {
        this.prdMSupBudgetOutGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
