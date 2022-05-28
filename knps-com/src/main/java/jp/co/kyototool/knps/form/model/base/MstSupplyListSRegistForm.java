package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUPPLY_LIST一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupplyListSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupplyListRegistForm.class);

    /** MST_SUPPLY_LIST登録フォームのリスト */
    @Valid
    private List<MstSupplyListRegistForm> mstSupplyListGrid;

    /**
     * @return MST_SUPPLY_LIST登録フォームのリスト
     */
    public List<MstSupplyListRegistForm> getMstSupplyListGrid() {
        return mstSupplyListGrid;
    }

    /**
     * @param p MST_SUPPLY_LIST登録フォームのリスト
     */
    public void setMstSupplyListGrid(final List<MstSupplyListRegistForm> p) {
        this.mstSupplyListGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
