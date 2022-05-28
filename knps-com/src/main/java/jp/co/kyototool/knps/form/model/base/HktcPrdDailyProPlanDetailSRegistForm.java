package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * HKTC_PRD_DAILY_PRO_PLAN_DETAIL一覧登録フォーム
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanDetailSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(HktcPrdDailyProPlanDetailRegistForm.class);

    /** HKTC_PRD_DAILY_PRO_PLAN_DETAIL登録フォームのリスト */
    @Valid
    private List<HktcPrdDailyProPlanDetailRegistForm> hktcPrdDailyProPlanDetailGrid;

    /**
     * @return HKTC_PRD_DAILY_PRO_PLAN_DETAIL登録フォームのリスト
     */
    public List<HktcPrdDailyProPlanDetailRegistForm> getHktcPrdDailyProPlanDetailGrid() {
        return hktcPrdDailyProPlanDetailGrid;
    }

    /**
     * @param p HKTC_PRD_DAILY_PRO_PLAN_DETAIL登録フォームのリスト
     */
    public void setHktcPrdDailyProPlanDetailGrid(final List<HktcPrdDailyProPlanDetailRegistForm> p) {
        this.hktcPrdDailyProPlanDetailGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
