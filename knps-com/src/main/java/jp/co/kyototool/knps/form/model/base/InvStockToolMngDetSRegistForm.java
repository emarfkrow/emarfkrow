package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_TOOL_MNG_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockToolMngDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockToolMngDetRegistForm.class);

    /** INV_STOCK_TOOL_MNG_DET登録フォームのリスト */
    @Valid
    private List<InvStockToolMngDetRegistForm> invStockToolMngDetGrid;

    /**
     * @return INV_STOCK_TOOL_MNG_DET登録フォームのリスト
     */
    public List<InvStockToolMngDetRegistForm> getInvStockToolMngDetGrid() {
        return invStockToolMngDetGrid;
    }

    /**
     * @param p INV_STOCK_TOOL_MNG_DET登録フォームのリスト
     */
    public void setInvStockToolMngDetGrid(final List<InvStockToolMngDetRegistForm> p) {
        this.invStockToolMngDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
