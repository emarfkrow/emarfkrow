package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_SUP_BUDGET_OUT_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetOutBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMSupBudgetOutBkRegistForm.class);

    /** PRD_M_SUP_BUDGET_OUT_BK登録フォームのリスト */
    @Valid
    private List<PrdMSupBudgetOutBkRegistForm> prdMSupBudgetOutBkGrid;

    /**
     * @return PRD_M_SUP_BUDGET_OUT_BK登録フォームのリスト
     */
    public List<PrdMSupBudgetOutBkRegistForm> getPrdMSupBudgetOutBkGrid() {
        return prdMSupBudgetOutBkGrid;
    }

    /**
     * @param p PRD_M_SUP_BUDGET_OUT_BK登録フォームのリスト
     */
    public void setPrdMSupBudgetOutBkGrid(final List<PrdMSupBudgetOutBkRegistForm> p) {
        this.prdMSupBudgetOutBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
