package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_PROD_UNITPRICE_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstProdUnitpriceBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstProdUnitpriceBkRegistForm.class);

    /** MST_PROD_UNITPRICE_BK登録フォームのリスト */
    @Valid
    private List<MstProdUnitpriceBkRegistForm> mstProdUnitpriceBkGrid;

    /**
     * @return MST_PROD_UNITPRICE_BK登録フォームのリスト
     */
    public List<MstProdUnitpriceBkRegistForm> getMstProdUnitpriceBkGrid() {
        return mstProdUnitpriceBkGrid;
    }

    /**
     * @param p MST_PROD_UNITPRICE_BK登録フォームのリスト
     */
    public void setMstProdUnitpriceBkGrid(final List<MstProdUnitpriceBkRegistForm> p) {
        this.mstProdUnitpriceBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
