package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_PROCESS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockProcessSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockProcessRegistForm.class);

    /** INV_STOCK_PROCESS登録フォームのリスト */
    @Valid
    private List<InvStockProcessRegistForm> invStockProcessGrid;

    /**
     * @return INV_STOCK_PROCESS登録フォームのリスト
     */
    public List<InvStockProcessRegistForm> getInvStockProcessGrid() {
        return invStockProcessGrid;
    }

    /**
     * @param p INV_STOCK_PROCESS登録フォームのリスト
     */
    public void setInvStockProcessGrid(final List<InvStockProcessRegistForm> p) {
        this.invStockProcessGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
