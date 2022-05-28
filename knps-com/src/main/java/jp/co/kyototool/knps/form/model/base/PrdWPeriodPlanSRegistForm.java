package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_W_PERIOD_PLAN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdWPeriodPlanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdWPeriodPlanRegistForm.class);

    /** PRD_W_PERIOD_PLAN登録フォームのリスト */
    @Valid
    private List<PrdWPeriodPlanRegistForm> prdWPeriodPlanGrid;

    /**
     * @return PRD_W_PERIOD_PLAN登録フォームのリスト
     */
    public List<PrdWPeriodPlanRegistForm> getPrdWPeriodPlanGrid() {
        return prdWPeriodPlanGrid;
    }

    /**
     * @param p PRD_W_PERIOD_PLAN登録フォームのリスト
     */
    public void setPrdWPeriodPlanGrid(final List<PrdWPeriodPlanRegistForm> p) {
        this.prdWPeriodPlanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
