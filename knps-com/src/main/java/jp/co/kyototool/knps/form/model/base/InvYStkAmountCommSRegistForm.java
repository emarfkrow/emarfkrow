package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_Y_STK_AMOUNT_COMM一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvYStkAmountCommSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvYStkAmountCommRegistForm.class);

    /** INV_Y_STK_AMOUNT_COMM登録フォームのリスト */
    @Valid
    private List<InvYStkAmountCommRegistForm> invYStkAmountCommGrid;

    /**
     * @return INV_Y_STK_AMOUNT_COMM登録フォームのリスト
     */
    public List<InvYStkAmountCommRegistForm> getInvYStkAmountCommGrid() {
        return invYStkAmountCommGrid;
    }

    /**
     * @param p INV_Y_STK_AMOUNT_COMM登録フォームのリスト
     */
    public void setInvYStkAmountCommGrid(final List<InvYStkAmountCommRegistForm> p) {
        this.invYStkAmountCommGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
