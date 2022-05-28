package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_Y_PRO_PLAN_ROUTING一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdYProPlanRoutingSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdYProPlanRoutingRegistForm.class);

    /** PRD_Y_PRO_PLAN_ROUTING登録フォームのリスト */
    @Valid
    private List<PrdYProPlanRoutingRegistForm> prdYProPlanRoutingGrid;

    /**
     * @return PRD_Y_PRO_PLAN_ROUTING登録フォームのリスト
     */
    public List<PrdYProPlanRoutingRegistForm> getPrdYProPlanRoutingGrid() {
        return prdYProPlanRoutingGrid;
    }

    /**
     * @param p PRD_Y_PRO_PLAN_ROUTING登録フォームのリスト
     */
    public void setPrdYProPlanRoutingGrid(final List<PrdYProPlanRoutingRegistForm> p) {
        this.prdYProPlanRoutingGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
