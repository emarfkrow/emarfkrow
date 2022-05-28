package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STK_PLAN_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvStkPlanBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStkPlanBkRegistForm.class);

    /** INV_STK_PLAN_BK登録フォームのリスト */
    @Valid
    private List<InvStkPlanBkRegistForm> invStkPlanBkGrid;

    /**
     * @return INV_STK_PLAN_BK登録フォームのリスト
     */
    public List<InvStkPlanBkRegistForm> getInvStkPlanBkGrid() {
        return invStkPlanBkGrid;
    }

    /**
     * @param p INV_STK_PLAN_BK登録フォームのリスト
     */
    public void setInvStkPlanBkGrid(final List<InvStkPlanBkRegistForm> p) {
        this.invStkPlanBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
