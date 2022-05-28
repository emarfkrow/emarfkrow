package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUP_UNITPRICE_DETAIL一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetailSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupUnitpriceDetailRegistForm.class);

    /** MST_SUP_UNITPRICE_DETAIL登録フォームのリスト */
    @Valid
    private List<MstSupUnitpriceDetailRegistForm> mstSupUnitpriceDetailGrid;

    /**
     * @return MST_SUP_UNITPRICE_DETAIL登録フォームのリスト
     */
    public List<MstSupUnitpriceDetailRegistForm> getMstSupUnitpriceDetailGrid() {
        return mstSupUnitpriceDetailGrid;
    }

    /**
     * @param p MST_SUP_UNITPRICE_DETAIL登録フォームのリスト
     */
    public void setMstSupUnitpriceDetailGrid(final List<MstSupUnitpriceDetailRegistForm> p) {
        this.mstSupUnitpriceDetailGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
