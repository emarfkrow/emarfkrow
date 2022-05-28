package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_ORDERPOINT_STATUS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdOrderpointStatusSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdOrderpointStatusRegistForm.class);

    /** PRD_ORDERPOINT_STATUS登録フォームのリスト */
    @Valid
    private List<PrdOrderpointStatusRegistForm> prdOrderpointStatusGrid;

    /**
     * @return PRD_ORDERPOINT_STATUS登録フォームのリスト
     */
    public List<PrdOrderpointStatusRegistForm> getPrdOrderpointStatusGrid() {
        return prdOrderpointStatusGrid;
    }

    /**
     * @param p PRD_ORDERPOINT_STATUS登録フォームのリスト
     */
    public void setPrdOrderpointStatusGrid(final List<PrdOrderpointStatusRegistForm> p) {
        this.prdOrderpointStatusGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
