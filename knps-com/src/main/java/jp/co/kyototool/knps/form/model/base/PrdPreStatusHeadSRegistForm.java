package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_PRE_STATUS_HEAD一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdPreStatusHeadSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdPreStatusHeadRegistForm.class);

    /** PRD_PRE_STATUS_HEAD登録フォームのリスト */
    @Valid
    private List<PrdPreStatusHeadRegistForm> prdPreStatusHeadGrid;

    /**
     * @return PRD_PRE_STATUS_HEAD登録フォームのリスト
     */
    public List<PrdPreStatusHeadRegistForm> getPrdPreStatusHeadGrid() {
        return prdPreStatusHeadGrid;
    }

    /**
     * @param p PRD_PRE_STATUS_HEAD登録フォームのリスト
     */
    public void setPrdPreStatusHeadGrid(final List<PrdPreStatusHeadRegistForm> p) {
        this.prdPreStatusHeadGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
