package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_PRO_PLAN_ARR一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanArrSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyProPlanArrRegistForm.class);

    /** PRD_DAILY_PRO_PLAN_ARR登録フォームのリスト */
    @Valid
    private List<PrdDailyProPlanArrRegistForm> prdDailyProPlanArrGrid;

    /**
     * @return PRD_DAILY_PRO_PLAN_ARR登録フォームのリスト
     */
    public List<PrdDailyProPlanArrRegistForm> getPrdDailyProPlanArrGrid() {
        return prdDailyProPlanArrGrid;
    }

    /**
     * @param p PRD_DAILY_PRO_PLAN_ARR登録フォームのリスト
     */
    public void setPrdDailyProPlanArrGrid(final List<PrdDailyProPlanArrRegistForm> p) {
        this.prdDailyProPlanArrGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
