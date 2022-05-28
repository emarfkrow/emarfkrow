package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_COST_REG_LINE_M一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalCostRegLineMSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalCostRegLineMRegistForm.class);

    /** MFG_TOTAL_COST_REG_LINE_M登録フォームのリスト */
    @Valid
    private List<MfgTotalCostRegLineMRegistForm> mfgTotalCostRegLineMGrid;

    /**
     * @return MFG_TOTAL_COST_REG_LINE_M登録フォームのリスト
     */
    public List<MfgTotalCostRegLineMRegistForm> getMfgTotalCostRegLineMGrid() {
        return mfgTotalCostRegLineMGrid;
    }

    /**
     * @param p MFG_TOTAL_COST_REG_LINE_M登録フォームのリスト
     */
    public void setMfgTotalCostRegLineMGrid(final List<MfgTotalCostRegLineMRegistForm> p) {
        this.mfgTotalCostRegLineMGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
