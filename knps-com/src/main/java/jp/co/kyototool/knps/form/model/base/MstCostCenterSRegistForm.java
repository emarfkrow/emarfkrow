package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_COST_CENTER一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstCostCenterSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCostCenterRegistForm.class);

    /** MST_COST_CENTER登録フォームのリスト */
    @Valid
    private List<MstCostCenterRegistForm> mstCostCenterGrid;

    /**
     * @return MST_COST_CENTER登録フォームのリスト
     */
    public List<MstCostCenterRegistForm> getMstCostCenterGrid() {
        return mstCostCenterGrid;
    }

    /**
     * @param p MST_COST_CENTER登録フォームのリスト
     */
    public void setMstCostCenterGrid(final List<MstCostCenterRegistForm> p) {
        this.mstCostCenterGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
