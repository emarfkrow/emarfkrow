package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_PRO_PLAN_PCH一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanPchSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyProPlanPchRegistForm.class);

    /** PRD_DAILY_PRO_PLAN_PCH登録フォームのリスト */
    @Valid
    private List<PrdDailyProPlanPchRegistForm> prdDailyProPlanPchGrid;

    /**
     * @return PRD_DAILY_PRO_PLAN_PCH登録フォームのリスト
     */
    public List<PrdDailyProPlanPchRegistForm> getPrdDailyProPlanPchGrid() {
        return prdDailyProPlanPchGrid;
    }

    /**
     * @param p PRD_DAILY_PRO_PLAN_PCH登録フォームのリスト
     */
    public void setPrdDailyProPlanPchGrid(final List<PrdDailyProPlanPchRegistForm> p) {
        this.prdDailyProPlanPchGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
