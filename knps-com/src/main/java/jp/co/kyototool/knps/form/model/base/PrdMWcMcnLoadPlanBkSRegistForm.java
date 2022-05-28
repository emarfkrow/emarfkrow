package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_WC_MCN_LOAD_PLAN_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMWcMcnLoadPlanBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMWcMcnLoadPlanBkRegistForm.class);

    /** PRD_M_WC_MCN_LOAD_PLAN_BK登録フォームのリスト */
    @Valid
    private List<PrdMWcMcnLoadPlanBkRegistForm> prdMWcMcnLoadPlanBkGrid;

    /**
     * @return PRD_M_WC_MCN_LOAD_PLAN_BK登録フォームのリスト
     */
    public List<PrdMWcMcnLoadPlanBkRegistForm> getPrdMWcMcnLoadPlanBkGrid() {
        return prdMWcMcnLoadPlanBkGrid;
    }

    /**
     * @param p PRD_M_WC_MCN_LOAD_PLAN_BK登録フォームのリスト
     */
    public void setPrdMWcMcnLoadPlanBkGrid(final List<PrdMWcMcnLoadPlanBkRegistForm> p) {
        this.prdMWcMcnLoadPlanBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
