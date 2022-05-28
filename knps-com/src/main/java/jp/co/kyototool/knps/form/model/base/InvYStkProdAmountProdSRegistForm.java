package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_Y_STK_PROD_AMOUNT_PROD一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvYStkProdAmountProdSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvYStkProdAmountProdRegistForm.class);

    /** INV_Y_STK_PROD_AMOUNT_PROD登録フォームのリスト */
    @Valid
    private List<InvYStkProdAmountProdRegistForm> invYStkProdAmountProdGrid;

    /**
     * @return INV_Y_STK_PROD_AMOUNT_PROD登録フォームのリスト
     */
    public List<InvYStkProdAmountProdRegistForm> getInvYStkProdAmountProdGrid() {
        return invYStkProdAmountProdGrid;
    }

    /**
     * @param p INV_Y_STK_PROD_AMOUNT_PROD登録フォームのリスト
     */
    public void setInvYStkProdAmountProdGrid(final List<InvYStkProdAmountProdRegistForm> p) {
        this.invYStkProdAmountProdGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
