package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SALES_TAX一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSalesTaxSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSalesTaxRegistForm.class);

    /** MST_SALES_TAX登録フォームのリスト */
    @Valid
    private List<MstSalesTaxRegistForm> mstSalesTaxGrid;

    /**
     * @return MST_SALES_TAX登録フォームのリスト
     */
    public List<MstSalesTaxRegistForm> getMstSalesTaxGrid() {
        return mstSalesTaxGrid;
    }

    /**
     * @param p MST_SALES_TAX登録フォームのリスト
     */
    public void setMstSalesTaxGrid(final List<MstSalesTaxRegistForm> p) {
        this.mstSalesTaxGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
