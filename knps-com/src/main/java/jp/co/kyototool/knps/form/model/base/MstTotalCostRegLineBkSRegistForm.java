package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_TOTAL_COST_REG_LINE_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstTotalCostRegLineBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstTotalCostRegLineBkRegistForm.class);

    /** MST_TOTAL_COST_REG_LINE_BK登録フォームのリスト */
    @Valid
    private List<MstTotalCostRegLineBkRegistForm> mstTotalCostRegLineBkGrid;

    /**
     * @return MST_TOTAL_COST_REG_LINE_BK登録フォームのリスト
     */
    public List<MstTotalCostRegLineBkRegistForm> getMstTotalCostRegLineBkGrid() {
        return mstTotalCostRegLineBkGrid;
    }

    /**
     * @param p MST_TOTAL_COST_REG_LINE_BK登録フォームのリスト
     */
    public void setMstTotalCostRegLineBkGrid(final List<MstTotalCostRegLineBkRegistForm> p) {
        this.mstTotalCostRegLineBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
