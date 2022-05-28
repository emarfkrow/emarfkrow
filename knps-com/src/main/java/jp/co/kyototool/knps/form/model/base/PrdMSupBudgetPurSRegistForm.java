package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_SUP_BUDGET_PUR一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMSupBudgetPurSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMSupBudgetPurRegistForm.class);

    /** PRD_M_SUP_BUDGET_PUR登録フォームのリスト */
    @Valid
    private List<PrdMSupBudgetPurRegistForm> prdMSupBudgetPurGrid;

    /**
     * @return PRD_M_SUP_BUDGET_PUR登録フォームのリスト
     */
    public List<PrdMSupBudgetPurRegistForm> getPrdMSupBudgetPurGrid() {
        return prdMSupBudgetPurGrid;
    }

    /**
     * @param p PRD_M_SUP_BUDGET_PUR登録フォームのリスト
     */
    public void setPrdMSupBudgetPurGrid(final List<PrdMSupBudgetPurRegistForm> p) {
        this.prdMSupBudgetPurGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
