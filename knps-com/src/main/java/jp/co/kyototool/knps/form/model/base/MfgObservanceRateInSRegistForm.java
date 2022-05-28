package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_OBSERVANCE_RATE_IN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgObservanceRateInSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgObservanceRateInRegistForm.class);

    /** MFG_OBSERVANCE_RATE_IN登録フォームのリスト */
    @Valid
    private List<MfgObservanceRateInRegistForm> mfgObservanceRateInGrid;

    /**
     * @return MFG_OBSERVANCE_RATE_IN登録フォームのリスト
     */
    public List<MfgObservanceRateInRegistForm> getMfgObservanceRateInGrid() {
        return mfgObservanceRateInGrid;
    }

    /**
     * @param p MFG_OBSERVANCE_RATE_IN登録フォームのリスト
     */
    public void setMfgObservanceRateInGrid(final List<MfgObservanceRateInRegistForm> p) {
        this.mfgObservanceRateInGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
