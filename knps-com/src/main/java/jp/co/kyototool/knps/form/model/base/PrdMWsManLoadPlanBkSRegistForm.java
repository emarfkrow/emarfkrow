package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_M_WS_MAN_LOAD_PLAN_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMWsManLoadPlanBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMWsManLoadPlanBkRegistForm.class);

    /** PRD_M_WS_MAN_LOAD_PLAN_BK登録フォームのリスト */
    @Valid
    private List<PrdMWsManLoadPlanBkRegistForm> prdMWsManLoadPlanBkGrid;

    /**
     * @return PRD_M_WS_MAN_LOAD_PLAN_BK登録フォームのリスト
     */
    public List<PrdMWsManLoadPlanBkRegistForm> getPrdMWsManLoadPlanBkGrid() {
        return prdMWsManLoadPlanBkGrid;
    }

    /**
     * @param p PRD_M_WS_MAN_LOAD_PLAN_BK登録フォームのリスト
     */
    public void setPrdMWsManLoadPlanBkGrid(final List<PrdMWsManLoadPlanBkRegistForm> p) {
        this.prdMWsManLoadPlanBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
