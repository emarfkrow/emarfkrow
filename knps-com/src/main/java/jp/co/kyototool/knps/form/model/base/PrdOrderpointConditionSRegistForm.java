package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_ORDERPOINT_CONDITION一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdOrderpointConditionSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdOrderpointConditionRegistForm.class);

    /** PRD_ORDERPOINT_CONDITION登録フォームのリスト */
    @Valid
    private List<PrdOrderpointConditionRegistForm> prdOrderpointConditionGrid;

    /**
     * @return PRD_ORDERPOINT_CONDITION登録フォームのリスト
     */
    public List<PrdOrderpointConditionRegistForm> getPrdOrderpointConditionGrid() {
        return prdOrderpointConditionGrid;
    }

    /**
     * @param p PRD_ORDERPOINT_CONDITION登録フォームのリスト
     */
    public void setPrdOrderpointConditionGrid(final List<PrdOrderpointConditionRegistForm> p) {
        this.prdOrderpointConditionGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
