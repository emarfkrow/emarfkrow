package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_TOTAL_COST_REG_LINE_Q一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstTotalCostRegLineQSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstTotalCostRegLineQRegistForm.class);

    /** MST_TOTAL_COST_REG_LINE_Q登録フォームのリスト */
    @Valid
    private List<MstTotalCostRegLineQRegistForm> mstTotalCostRegLineQGrid;

    /**
     * @return MST_TOTAL_COST_REG_LINE_Q登録フォームのリスト
     */
    public List<MstTotalCostRegLineQRegistForm> getMstTotalCostRegLineQGrid() {
        return mstTotalCostRegLineQGrid;
    }

    /**
     * @param p MST_TOTAL_COST_REG_LINE_Q登録フォームのリスト
     */
    public void setMstTotalCostRegLineQGrid(final List<MstTotalCostRegLineQRegistForm> p) {
        this.mstTotalCostRegLineQGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
