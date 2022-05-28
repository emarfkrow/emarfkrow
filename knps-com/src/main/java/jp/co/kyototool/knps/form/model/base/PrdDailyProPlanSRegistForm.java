package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_PRO_PLAN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyProPlanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyProPlanRegistForm.class);

    /** PRD_DAILY_PRO_PLAN登録フォームのリスト */
    @Valid
    private List<PrdDailyProPlanRegistForm> prdDailyProPlanGrid;

    /**
     * @return PRD_DAILY_PRO_PLAN登録フォームのリスト
     */
    public List<PrdDailyProPlanRegistForm> getPrdDailyProPlanGrid() {
        return prdDailyProPlanGrid;
    }

    /**
     * @param p PRD_DAILY_PRO_PLAN登録フォームのリスト
     */
    public void setPrdDailyProPlanGrid(final List<PrdDailyProPlanRegistForm> p) {
        this.prdDailyProPlanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
