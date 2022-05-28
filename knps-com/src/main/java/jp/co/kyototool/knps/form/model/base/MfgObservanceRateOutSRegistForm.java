package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_OBSERVANCE_RATE_OUT一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgObservanceRateOutSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgObservanceRateOutRegistForm.class);

    /** MFG_OBSERVANCE_RATE_OUT登録フォームのリスト */
    @Valid
    private List<MfgObservanceRateOutRegistForm> mfgObservanceRateOutGrid;

    /**
     * @return MFG_OBSERVANCE_RATE_OUT登録フォームのリスト
     */
    public List<MfgObservanceRateOutRegistForm> getMfgObservanceRateOutGrid() {
        return mfgObservanceRateOutGrid;
    }

    /**
     * @param p MFG_OBSERVANCE_RATE_OUT登録フォームのリスト
     */
    public void setMfgObservanceRateOutGrid(final List<MfgObservanceRateOutRegistForm> p) {
        this.mfgObservanceRateOutGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
