package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_DAILY_PLAN_EXCHANGE_ID一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgDailyPlanExchangeIdSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgDailyPlanExchangeIdRegistForm.class);

    /** MFG_DAILY_PLAN_EXCHANGE_ID登録フォームのリスト */
    @Valid
    private List<MfgDailyPlanExchangeIdRegistForm> mfgDailyPlanExchangeIdGrid;

    /**
     * @return MFG_DAILY_PLAN_EXCHANGE_ID登録フォームのリスト
     */
    public List<MfgDailyPlanExchangeIdRegistForm> getMfgDailyPlanExchangeIdGrid() {
        return mfgDailyPlanExchangeIdGrid;
    }

    /**
     * @param p MFG_DAILY_PLAN_EXCHANGE_ID登録フォームのリスト
     */
    public void setMfgDailyPlanExchangeIdGrid(final List<MfgDailyPlanExchangeIdRegistForm> p) {
        this.mfgDailyPlanExchangeIdGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
