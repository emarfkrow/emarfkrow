package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_RACK_MAINTE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdRackMainteSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdRackMainteRegistForm.class);

    /** PRD_RACK_MAINTE登録フォームのリスト */
    @Valid
    private List<PrdRackMainteRegistForm> prdRackMainteGrid;

    /**
     * @return PRD_RACK_MAINTE登録フォームのリスト
     */
    public List<PrdRackMainteRegistForm> getPrdRackMainteGrid() {
        return prdRackMainteGrid;
    }

    /**
     * @param p PRD_RACK_MAINTE登録フォームのリスト
     */
    public void setPrdRackMainteGrid(final List<PrdRackMainteRegistForm> p) {
        this.prdRackMainteGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
