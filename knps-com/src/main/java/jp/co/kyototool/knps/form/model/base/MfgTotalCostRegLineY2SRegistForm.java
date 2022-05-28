package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_COST_REG_LINE_Y2一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineY2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalCostRegLineY2RegistForm.class);

    /** MFG_TOTAL_COST_REG_LINE_Y2登録フォームのリスト */
    @Valid
    private List<MfgTotalCostRegLineY2RegistForm> mfgTotalCostRegLineY2Grid;

    /**
     * @return MFG_TOTAL_COST_REG_LINE_Y2登録フォームのリスト
     */
    public List<MfgTotalCostRegLineY2RegistForm> getMfgTotalCostRegLineY2Grid() {
        return mfgTotalCostRegLineY2Grid;
    }

    /**
     * @param p MFG_TOTAL_COST_REG_LINE_Y2登録フォームのリスト
     */
    public void setMfgTotalCostRegLineY2Grid(final List<MfgTotalCostRegLineY2RegistForm> p) {
        this.mfgTotalCostRegLineY2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
