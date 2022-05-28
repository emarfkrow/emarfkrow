package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_MANAGEMENT_INV_MER一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockManagementInvMerSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockManagementInvMerRegistForm.class);

    /** INV_STOCK_MANAGEMENT_INV_MER登録フォームのリスト */
    @Valid
    private List<InvStockManagementInvMerRegistForm> invStockManagementInvMerGrid;

    /**
     * @return INV_STOCK_MANAGEMENT_INV_MER登録フォームのリスト
     */
    public List<InvStockManagementInvMerRegistForm> getInvStockManagementInvMerGrid() {
        return invStockManagementInvMerGrid;
    }

    /**
     * @param p INV_STOCK_MANAGEMENT_INV_MER登録フォームのリスト
     */
    public void setInvStockManagementInvMerGrid(final List<InvStockManagementInvMerRegistForm> p) {
        this.invStockManagementInvMerGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
