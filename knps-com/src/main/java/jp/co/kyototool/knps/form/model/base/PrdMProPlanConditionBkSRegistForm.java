package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_PRO_PLAN_CONDITION_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMProPlanConditionBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMProPlanConditionBkRegistForm.class);

    /** PRD_M_PRO_PLAN_CONDITION_BK登録フォームのリスト */
    @Valid
    private List<PrdMProPlanConditionBkRegistForm> prdMProPlanConditionBkGrid;

    /**
     * @return PRD_M_PRO_PLAN_CONDITION_BK登録フォームのリスト
     */
    public List<PrdMProPlanConditionBkRegistForm> getPrdMProPlanConditionBkGrid() {
        return prdMProPlanConditionBkGrid;
    }

    /**
     * @param p PRD_M_PRO_PLAN_CONDITION_BK登録フォームのリスト
     */
    public void setPrdMProPlanConditionBkGrid(final List<PrdMProPlanConditionBkRegistForm> p) {
        this.prdMProPlanConditionBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
