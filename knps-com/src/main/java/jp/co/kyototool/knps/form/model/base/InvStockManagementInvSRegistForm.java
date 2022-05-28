package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_MANAGEMENT_INV一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockManagementInvSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockManagementInvRegistForm.class);

    /** INV_STOCK_MANAGEMENT_INV登録フォームのリスト */
    @Valid
    private List<InvStockManagementInvRegistForm> invStockManagementInvGrid;

    /**
     * @return INV_STOCK_MANAGEMENT_INV登録フォームのリスト
     */
    public List<InvStockManagementInvRegistForm> getInvStockManagementInvGrid() {
        return invStockManagementInvGrid;
    }

    /**
     * @param p INV_STOCK_MANAGEMENT_INV登録フォームのリスト
     */
    public void setInvStockManagementInvGrid(final List<InvStockManagementInvRegistForm> p) {
        this.invStockManagementInvGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
