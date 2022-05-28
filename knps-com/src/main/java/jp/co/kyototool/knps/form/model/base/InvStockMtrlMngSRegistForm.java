package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_MTRL_MNG一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockMtrlMngSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockMtrlMngRegistForm.class);

    /** INV_STOCK_MTRL_MNG登録フォームのリスト */
    @Valid
    private List<InvStockMtrlMngRegistForm> invStockMtrlMngGrid;

    /**
     * @return INV_STOCK_MTRL_MNG登録フォームのリスト
     */
    public List<InvStockMtrlMngRegistForm> getInvStockMtrlMngGrid() {
        return invStockMtrlMngGrid;
    }

    /**
     * @param p INV_STOCK_MTRL_MNG登録フォームのリスト
     */
    public void setInvStockMtrlMngGrid(final List<InvStockMtrlMngRegistForm> p) {
        this.invStockMtrlMngGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
