package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_Y_STK_AMOUNT_PROG一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvYStkAmountProgSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvYStkAmountProgRegistForm.class);

    /** INV_Y_STK_AMOUNT_PROG登録フォームのリスト */
    @Valid
    private List<InvYStkAmountProgRegistForm> invYStkAmountProgGrid;

    /**
     * @return INV_Y_STK_AMOUNT_PROG登録フォームのリスト
     */
    public List<InvYStkAmountProgRegistForm> getInvYStkAmountProgGrid() {
        return invYStkAmountProgGrid;
    }

    /**
     * @param p INV_Y_STK_AMOUNT_PROG登録フォームのリスト
     */
    public void setInvYStkAmountProgGrid(final List<InvYStkAmountProgRegistForm> p) {
        this.invYStkAmountProgGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
