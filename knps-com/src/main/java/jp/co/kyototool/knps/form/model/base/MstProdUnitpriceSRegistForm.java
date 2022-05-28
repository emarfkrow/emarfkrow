package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_PROD_UNITPRICE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstProdUnitpriceSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstProdUnitpriceRegistForm.class);

    /** MST_PROD_UNITPRICE登録フォームのリスト */
    @Valid
    private List<MstProdUnitpriceRegistForm> mstProdUnitpriceGrid;

    /**
     * @return MST_PROD_UNITPRICE登録フォームのリスト
     */
    public List<MstProdUnitpriceRegistForm> getMstProdUnitpriceGrid() {
        return mstProdUnitpriceGrid;
    }

    /**
     * @param p MST_PROD_UNITPRICE登録フォームのリスト
     */
    public void setMstProdUnitpriceGrid(final List<MstProdUnitpriceRegistForm> p) {
        this.mstProdUnitpriceGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
