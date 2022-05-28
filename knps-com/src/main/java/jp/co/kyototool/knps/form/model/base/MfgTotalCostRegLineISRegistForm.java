package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_COST_REG_LINE_I一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineISRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalCostRegLineIRegistForm.class);

    /** MFG_TOTAL_COST_REG_LINE_I登録フォームのリスト */
    @Valid
    private List<MfgTotalCostRegLineIRegistForm> mfgTotalCostRegLineIGrid;

    /**
     * @return MFG_TOTAL_COST_REG_LINE_I登録フォームのリスト
     */
    public List<MfgTotalCostRegLineIRegistForm> getMfgTotalCostRegLineIGrid() {
        return mfgTotalCostRegLineIGrid;
    }

    /**
     * @param p MFG_TOTAL_COST_REG_LINE_I登録フォームのリスト
     */
    public void setMfgTotalCostRegLineIGrid(final List<MfgTotalCostRegLineIRegistForm> p) {
        this.mfgTotalCostRegLineIGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
