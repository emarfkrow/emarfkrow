package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_WORK_MNTH_STOCK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvWorkMnthStockSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvWorkMnthStockRegistForm.class);

    /** INV_WORK_MNTH_STOCK登録フォームのリスト */
    @Valid
    private List<InvWorkMnthStockRegistForm> invWorkMnthStockGrid;

    /**
     * @return INV_WORK_MNTH_STOCK登録フォームのリスト
     */
    public List<InvWorkMnthStockRegistForm> getInvWorkMnthStockGrid() {
        return invWorkMnthStockGrid;
    }

    /**
     * @param p INV_WORK_MNTH_STOCK登録フォームのリスト
     */
    public void setInvWorkMnthStockGrid(final List<InvWorkMnthStockRegistForm> p) {
        this.invWorkMnthStockGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
