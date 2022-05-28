package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_PRO_PLAN_CONDITION一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMProPlanConditionSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMProPlanConditionRegistForm.class);

    /** PRD_M_PRO_PLAN_CONDITION登録フォームのリスト */
    @Valid
    private List<PrdMProPlanConditionRegistForm> prdMProPlanConditionGrid;

    /**
     * @return PRD_M_PRO_PLAN_CONDITION登録フォームのリスト
     */
    public List<PrdMProPlanConditionRegistForm> getPrdMProPlanConditionGrid() {
        return prdMProPlanConditionGrid;
    }

    /**
     * @param p PRD_M_PRO_PLAN_CONDITION登録フォームのリスト
     */
    public void setPrdMProPlanConditionGrid(final List<PrdMProPlanConditionRegistForm> p) {
        this.prdMProPlanConditionGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
