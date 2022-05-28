package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_PROCESS_SUPPLY一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockProcessSupplySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockProcessSupplyRegistForm.class);

    /** INV_STOCK_PROCESS_SUPPLY登録フォームのリスト */
    @Valid
    private List<InvStockProcessSupplyRegistForm> invStockProcessSupplyGrid;

    /**
     * @return INV_STOCK_PROCESS_SUPPLY登録フォームのリスト
     */
    public List<InvStockProcessSupplyRegistForm> getInvStockProcessSupplyGrid() {
        return invStockProcessSupplyGrid;
    }

    /**
     * @param p INV_STOCK_PROCESS_SUPPLY登録フォームのリスト
     */
    public void setInvStockProcessSupplyGrid(final List<InvStockProcessSupplyRegistForm> p) {
        this.invStockProcessSupplyGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
