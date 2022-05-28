package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_COST_CENTER_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstCostCenterBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCostCenterBkRegistForm.class);

    /** MST_COST_CENTER_BK登録フォームのリスト */
    @Valid
    private List<MstCostCenterBkRegistForm> mstCostCenterBkGrid;

    /**
     * @return MST_COST_CENTER_BK登録フォームのリスト
     */
    public List<MstCostCenterBkRegistForm> getMstCostCenterBkGrid() {
        return mstCostCenterBkGrid;
    }

    /**
     * @param p MST_COST_CENTER_BK登録フォームのリスト
     */
    public void setMstCostCenterBkGrid(final List<MstCostCenterBkRegistForm> p) {
        this.mstCostCenterBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
