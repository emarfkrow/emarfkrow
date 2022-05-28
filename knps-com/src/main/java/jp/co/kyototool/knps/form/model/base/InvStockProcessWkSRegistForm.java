package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_PROCESS_WK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockProcessWkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockProcessWkRegistForm.class);

    /** INV_STOCK_PROCESS_WK登録フォームのリスト */
    @Valid
    private List<InvStockProcessWkRegistForm> invStockProcessWkGrid;

    /**
     * @return INV_STOCK_PROCESS_WK登録フォームのリスト
     */
    public List<InvStockProcessWkRegistForm> getInvStockProcessWkGrid() {
        return invStockProcessWkGrid;
    }

    /**
     * @param p INV_STOCK_PROCESS_WK登録フォームのリスト
     */
    public void setInvStockProcessWkGrid(final List<InvStockProcessWkRegistForm> p) {
        this.invStockProcessWkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
