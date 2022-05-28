package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_COST_REG_LINE_I1一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineI1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalCostRegLineI1RegistForm.class);

    /** MFG_TOTAL_COST_REG_LINE_I1登録フォームのリスト */
    @Valid
    private List<MfgTotalCostRegLineI1RegistForm> mfgTotalCostRegLineI1Grid;

    /**
     * @return MFG_TOTAL_COST_REG_LINE_I1登録フォームのリスト
     */
    public List<MfgTotalCostRegLineI1RegistForm> getMfgTotalCostRegLineI1Grid() {
        return mfgTotalCostRegLineI1Grid;
    }

    /**
     * @param p MFG_TOTAL_COST_REG_LINE_I1登録フォームのリスト
     */
    public void setMfgTotalCostRegLineI1Grid(final List<MfgTotalCostRegLineI1RegistForm> p) {
        this.mfgTotalCostRegLineI1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
