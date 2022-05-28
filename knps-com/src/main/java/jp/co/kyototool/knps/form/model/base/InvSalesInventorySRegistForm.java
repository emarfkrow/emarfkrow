package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_SALES_INVENTORY一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvSalesInventorySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvSalesInventoryRegistForm.class);

    /** INV_SALES_INVENTORY登録フォームのリスト */
    @Valid
    private List<InvSalesInventoryRegistForm> invSalesInventoryGrid;

    /**
     * @return INV_SALES_INVENTORY登録フォームのリスト
     */
    public List<InvSalesInventoryRegistForm> getInvSalesInventoryGrid() {
        return invSalesInventoryGrid;
    }

    /**
     * @param p INV_SALES_INVENTORY登録フォームのリスト
     */
    public void setInvSalesInventoryGrid(final List<InvSalesInventoryRegistForm> p) {
        this.invSalesInventoryGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
