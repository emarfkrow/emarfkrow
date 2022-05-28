package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_TOTAL_COST_REG_LINE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstTotalCostRegLineSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstTotalCostRegLineRegistForm.class);

    /** MST_TOTAL_COST_REG_LINE登録フォームのリスト */
    @Valid
    private List<MstTotalCostRegLineRegistForm> mstTotalCostRegLineGrid;

    /**
     * @return MST_TOTAL_COST_REG_LINE登録フォームのリスト
     */
    public List<MstTotalCostRegLineRegistForm> getMstTotalCostRegLineGrid() {
        return mstTotalCostRegLineGrid;
    }

    /**
     * @param p MST_TOTAL_COST_REG_LINE登録フォームのリスト
     */
    public void setMstTotalCostRegLineGrid(final List<MstTotalCostRegLineRegistForm> p) {
        this.mstTotalCostRegLineGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
