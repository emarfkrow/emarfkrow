package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_COST_REG_LINE_M_Q一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineMQSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalCostRegLineMQRegistForm.class);

    /** MFG_TOTAL_COST_REG_LINE_M_Q登録フォームのリスト */
    @Valid
    private List<MfgTotalCostRegLineMQRegistForm> mfgTotalCostRegLineMQGrid;

    /**
     * @return MFG_TOTAL_COST_REG_LINE_M_Q登録フォームのリスト
     */
    public List<MfgTotalCostRegLineMQRegistForm> getMfgTotalCostRegLineMQGrid() {
        return mfgTotalCostRegLineMQGrid;
    }

    /**
     * @param p MFG_TOTAL_COST_REG_LINE_M_Q登録フォームのリスト
     */
    public void setMfgTotalCostRegLineMQGrid(final List<MfgTotalCostRegLineMQRegistForm> p) {
        this.mfgTotalCostRegLineMQGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
