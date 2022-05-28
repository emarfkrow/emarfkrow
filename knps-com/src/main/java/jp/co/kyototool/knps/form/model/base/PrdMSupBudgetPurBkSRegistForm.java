package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_SUP_BUDGET_PUR_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetPurBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMSupBudgetPurBkRegistForm.class);

    /** PRD_M_SUP_BUDGET_PUR_BK登録フォームのリスト */
    @Valid
    private List<PrdMSupBudgetPurBkRegistForm> prdMSupBudgetPurBkGrid;

    /**
     * @return PRD_M_SUP_BUDGET_PUR_BK登録フォームのリスト
     */
    public List<PrdMSupBudgetPurBkRegistForm> getPrdMSupBudgetPurBkGrid() {
        return prdMSupBudgetPurBkGrid;
    }

    /**
     * @param p PRD_M_SUP_BUDGET_PUR_BK登録フォームのリスト
     */
    public void setPrdMSupBudgetPurBkGrid(final List<PrdMSupBudgetPurBkRegistForm> p) {
        this.prdMSupBudgetPurBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
