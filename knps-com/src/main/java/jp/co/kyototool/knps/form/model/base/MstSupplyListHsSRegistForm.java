package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUPPLY_LIST_HS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupplyListHsSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupplyListHsRegistForm.class);

    /** MST_SUPPLY_LIST_HS登録フォームのリスト */
    @Valid
    private List<MstSupplyListHsRegistForm> mstSupplyListHsGrid;

    /**
     * @return MST_SUPPLY_LIST_HS登録フォームのリスト
     */
    public List<MstSupplyListHsRegistForm> getMstSupplyListHsGrid() {
        return mstSupplyListHsGrid;
    }

    /**
     * @param p MST_SUPPLY_LIST_HS登録フォームのリスト
     */
    public void setMstSupplyListHsGrid(final List<MstSupplyListHsRegistForm> p) {
        this.mstSupplyListHsGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
