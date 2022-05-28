package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_PRO_PLAN_ROUTING一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMProPlanRoutingSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMProPlanRoutingRegistForm.class);

    /** PRD_M_PRO_PLAN_ROUTING登録フォームのリスト */
    @Valid
    private List<PrdMProPlanRoutingRegistForm> prdMProPlanRoutingGrid;

    /**
     * @return PRD_M_PRO_PLAN_ROUTING登録フォームのリスト
     */
    public List<PrdMProPlanRoutingRegistForm> getPrdMProPlanRoutingGrid() {
        return prdMProPlanRoutingGrid;
    }

    /**
     * @param p PRD_M_PRO_PLAN_ROUTING登録フォームのリスト
     */
    public void setPrdMProPlanRoutingGrid(final List<PrdMProPlanRoutingRegistForm> p) {
        this.prdMProPlanRoutingGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
