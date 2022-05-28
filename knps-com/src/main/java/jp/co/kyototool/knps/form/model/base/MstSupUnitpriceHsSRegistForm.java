package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUP_UNITPRICE_HS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceHsSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupUnitpriceHsRegistForm.class);

    /** MST_SUP_UNITPRICE_HS登録フォームのリスト */
    @Valid
    private List<MstSupUnitpriceHsRegistForm> mstSupUnitpriceHsGrid;

    /**
     * @return MST_SUP_UNITPRICE_HS登録フォームのリスト
     */
    public List<MstSupUnitpriceHsRegistForm> getMstSupUnitpriceHsGrid() {
        return mstSupUnitpriceHsGrid;
    }

    /**
     * @param p MST_SUP_UNITPRICE_HS登録フォームのリスト
     */
    public void setMstSupUnitpriceHsGrid(final List<MstSupUnitpriceHsRegistForm> p) {
        this.mstSupUnitpriceHsGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
