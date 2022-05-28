package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * HKTC_PRD_DAILY_PRO_PLAN_ARR一覧登録フォーム
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanArrSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(HktcPrdDailyProPlanArrRegistForm.class);

    /** HKTC_PRD_DAILY_PRO_PLAN_ARR登録フォームのリスト */
    @Valid
    private List<HktcPrdDailyProPlanArrRegistForm> hktcPrdDailyProPlanArrGrid;

    /**
     * @return HKTC_PRD_DAILY_PRO_PLAN_ARR登録フォームのリスト
     */
    public List<HktcPrdDailyProPlanArrRegistForm> getHktcPrdDailyProPlanArrGrid() {
        return hktcPrdDailyProPlanArrGrid;
    }

    /**
     * @param p HKTC_PRD_DAILY_PRO_PLAN_ARR登録フォームのリスト
     */
    public void setHktcPrdDailyProPlanArrGrid(final List<HktcPrdDailyProPlanArrRegistForm> p) {
        this.hktcPrdDailyProPlanArrGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
