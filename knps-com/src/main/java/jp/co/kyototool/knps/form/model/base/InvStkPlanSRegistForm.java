package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STK_PLAN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStkPlanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStkPlanRegistForm.class);

    /** INV_STK_PLAN登録フォームのリスト */
    @Valid
    private List<InvStkPlanRegistForm> invStkPlanGrid;

    /**
     * @return INV_STK_PLAN登録フォームのリスト
     */
    public List<InvStkPlanRegistForm> getInvStkPlanGrid() {
        return invStkPlanGrid;
    }

    /**
     * @param p INV_STK_PLAN登録フォームのリスト
     */
    public void setInvStkPlanGrid(final List<InvStkPlanRegistForm> p) {
        this.invStkPlanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
