package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_MANAGEMENT_INV_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockManagementInvDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockManagementInvDetRegistForm.class);

    /** INV_STOCK_MANAGEMENT_INV_DET登録フォームのリスト */
    @Valid
    private List<InvStockManagementInvDetRegistForm> invStockManagementInvDetGrid;

    /**
     * @return INV_STOCK_MANAGEMENT_INV_DET登録フォームのリスト
     */
    public List<InvStockManagementInvDetRegistForm> getInvStockManagementInvDetGrid() {
        return invStockManagementInvDetGrid;
    }

    /**
     * @param p INV_STOCK_MANAGEMENT_INV_DET登録フォームのリスト
     */
    public void setInvStockManagementInvDetGrid(final List<InvStockManagementInvDetRegistForm> p) {
        this.invStockManagementInvDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
