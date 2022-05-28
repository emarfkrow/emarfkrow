package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * HKTC_PRD_DAILY_PRO_PLAN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class HktcPrdDailyProPlanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(HktcPrdDailyProPlanRegistForm.class);

    /** HKTC_PRD_DAILY_PRO_PLAN登録フォームのリスト */
    @Valid
    private List<HktcPrdDailyProPlanRegistForm> hktcPrdDailyProPlanGrid;

    /**
     * @return HKTC_PRD_DAILY_PRO_PLAN登録フォームのリスト
     */
    public List<HktcPrdDailyProPlanRegistForm> getHktcPrdDailyProPlanGrid() {
        return hktcPrdDailyProPlanGrid;
    }

    /**
     * @param p HKTC_PRD_DAILY_PRO_PLAN登録フォームのリスト
     */
    public void setHktcPrdDailyProPlanGrid(final List<HktcPrdDailyProPlanRegistForm> p) {
        this.hktcPrdDailyProPlanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
