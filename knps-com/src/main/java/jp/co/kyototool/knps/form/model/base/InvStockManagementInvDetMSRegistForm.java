package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_MANAGEMENT_INV_DET_M一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockManagementInvDetMSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockManagementInvDetMRegistForm.class);

    /** INV_STOCK_MANAGEMENT_INV_DET_M登録フォームのリスト */
    @Valid
    private List<InvStockManagementInvDetMRegistForm> invStockManagementInvDetMGrid;

    /**
     * @return INV_STOCK_MANAGEMENT_INV_DET_M登録フォームのリスト
     */
    public List<InvStockManagementInvDetMRegistForm> getInvStockManagementInvDetMGrid() {
        return invStockManagementInvDetMGrid;
    }

    /**
     * @param p INV_STOCK_MANAGEMENT_INV_DET_M登録フォームのリスト
     */
    public void setInvStockManagementInvDetMGrid(final List<InvStockManagementInvDetMRegistForm> p) {
        this.invStockManagementInvDetMGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
