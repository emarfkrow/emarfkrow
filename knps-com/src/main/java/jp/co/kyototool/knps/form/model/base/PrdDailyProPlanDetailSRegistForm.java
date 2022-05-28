package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_PRO_PLAN_DETAIL一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanDetailSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyProPlanDetailRegistForm.class);

    /** PRD_DAILY_PRO_PLAN_DETAIL登録フォームのリスト */
    @Valid
    private List<PrdDailyProPlanDetailRegistForm> prdDailyProPlanDetailGrid;

    /**
     * @return PRD_DAILY_PRO_PLAN_DETAIL登録フォームのリスト
     */
    public List<PrdDailyProPlanDetailRegistForm> getPrdDailyProPlanDetailGrid() {
        return prdDailyProPlanDetailGrid;
    }

    /**
     * @param p PRD_DAILY_PRO_PLAN_DETAIL登録フォームのリスト
     */
    public void setPrdDailyProPlanDetailGrid(final List<PrdDailyProPlanDetailRegistForm> p) {
        this.prdDailyProPlanDetailGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
