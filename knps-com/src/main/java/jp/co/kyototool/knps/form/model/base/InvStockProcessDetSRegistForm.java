package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_PROCESS_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockProcessDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockProcessDetRegistForm.class);

    /** INV_STOCK_PROCESS_DET登録フォームのリスト */
    @Valid
    private List<InvStockProcessDetRegistForm> invStockProcessDetGrid;

    /**
     * @return INV_STOCK_PROCESS_DET登録フォームのリスト
     */
    public List<InvStockProcessDetRegistForm> getInvStockProcessDetGrid() {
        return invStockProcessDetGrid;
    }

    /**
     * @param p INV_STOCK_PROCESS_DET登録フォームのリスト
     */
    public void setInvStockProcessDetGrid(final List<InvStockProcessDetRegistForm> p) {
        this.invStockProcessDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
