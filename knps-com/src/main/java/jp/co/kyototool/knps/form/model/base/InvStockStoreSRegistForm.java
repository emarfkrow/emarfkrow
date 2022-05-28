package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_STORE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockStoreSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockStoreRegistForm.class);

    /** INV_STOCK_STORE登録フォームのリスト */
    @Valid
    private List<InvStockStoreRegistForm> invStockStoreGrid;

    /**
     * @return INV_STOCK_STORE登録フォームのリスト
     */
    public List<InvStockStoreRegistForm> getInvStockStoreGrid() {
        return invStockStoreGrid;
    }

    /**
     * @param p INV_STOCK_STORE登録フォームのリスト
     */
    public void setInvStockStoreGrid(final List<InvStockStoreRegistForm> p) {
        this.invStockStoreGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
