package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_Y_WC_MCN_LOAD_PLAN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdYWcMcnLoadPlanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdYWcMcnLoadPlanRegistForm.class);

    /** PRD_Y_WC_MCN_LOAD_PLAN登録フォームのリスト */
    @Valid
    private List<PrdYWcMcnLoadPlanRegistForm> prdYWcMcnLoadPlanGrid;

    /**
     * @return PRD_Y_WC_MCN_LOAD_PLAN登録フォームのリスト
     */
    public List<PrdYWcMcnLoadPlanRegistForm> getPrdYWcMcnLoadPlanGrid() {
        return prdYWcMcnLoadPlanGrid;
    }

    /**
     * @param p PRD_Y_WC_MCN_LOAD_PLAN登録フォームのリスト
     */
    public void setPrdYWcMcnLoadPlanGrid(final List<PrdYWcMcnLoadPlanRegistForm> p) {
        this.prdYWcMcnLoadPlanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
