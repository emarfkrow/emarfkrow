package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_TOOL_MNG_HED一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockToolMngHedSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockToolMngHedRegistForm.class);

    /** INV_STOCK_TOOL_MNG_HED登録フォームのリスト */
    @Valid
    private List<InvStockToolMngHedRegistForm> invStockToolMngHedGrid;

    /**
     * @return INV_STOCK_TOOL_MNG_HED登録フォームのリスト
     */
    public List<InvStockToolMngHedRegistForm> getInvStockToolMngHedGrid() {
        return invStockToolMngHedGrid;
    }

    /**
     * @param p INV_STOCK_TOOL_MNG_HED登録フォームのリスト
     */
    public void setInvStockToolMngHedGrid(final List<InvStockToolMngHedRegistForm> p) {
        this.invStockToolMngHedGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
