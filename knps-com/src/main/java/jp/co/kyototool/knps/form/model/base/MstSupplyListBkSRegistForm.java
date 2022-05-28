package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUPPLY_LIST_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupplyListBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupplyListBkRegistForm.class);

    /** MST_SUPPLY_LIST_BK登録フォームのリスト */
    @Valid
    private List<MstSupplyListBkRegistForm> mstSupplyListBkGrid;

    /**
     * @return MST_SUPPLY_LIST_BK登録フォームのリスト
     */
    public List<MstSupplyListBkRegistForm> getMstSupplyListBkGrid() {
        return mstSupplyListBkGrid;
    }

    /**
     * @param p MST_SUPPLY_LIST_BK登録フォームのリスト
     */
    public void setMstSupplyListBkGrid(final List<MstSupplyListBkRegistForm> p) {
        this.mstSupplyListBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
