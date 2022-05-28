package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_FLOW一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiFlowSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiFlowRegistForm.class);

    /** PRD_TEHAI_FLOW登録フォームのリスト */
    @Valid
    private List<PrdTehaiFlowRegistForm> prdTehaiFlowGrid;

    /**
     * @return PRD_TEHAI_FLOW登録フォームのリスト
     */
    public List<PrdTehaiFlowRegistForm> getPrdTehaiFlowGrid() {
        return prdTehaiFlowGrid;
    }

    /**
     * @param p PRD_TEHAI_FLOW登録フォームのリスト
     */
    public void setPrdTehaiFlowGrid(final List<PrdTehaiFlowRegistForm> p) {
        this.prdTehaiFlowGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
