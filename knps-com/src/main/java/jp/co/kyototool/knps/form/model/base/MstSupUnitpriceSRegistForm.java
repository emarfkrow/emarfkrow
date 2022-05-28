package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUP_UNITPRICE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupUnitpriceRegistForm.class);

    /** MST_SUP_UNITPRICE登録フォームのリスト */
    @Valid
    private List<MstSupUnitpriceRegistForm> mstSupUnitpriceGrid;

    /**
     * @return MST_SUP_UNITPRICE登録フォームのリスト
     */
    public List<MstSupUnitpriceRegistForm> getMstSupUnitpriceGrid() {
        return mstSupUnitpriceGrid;
    }

    /**
     * @param p MST_SUP_UNITPRICE登録フォームのリスト
     */
    public void setMstSupUnitpriceGrid(final List<MstSupUnitpriceRegistForm> p) {
        this.mstSupUnitpriceGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
