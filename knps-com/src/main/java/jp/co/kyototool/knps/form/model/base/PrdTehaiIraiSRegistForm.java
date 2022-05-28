package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_IRAI一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiIraiRegistForm.class);

    /** PRD_TEHAI_IRAI登録フォームのリスト */
    @Valid
    private List<PrdTehaiIraiRegistForm> prdTehaiIraiGrid;

    /**
     * @return PRD_TEHAI_IRAI登録フォームのリスト
     */
    public List<PrdTehaiIraiRegistForm> getPrdTehaiIraiGrid() {
        return prdTehaiIraiGrid;
    }

    /**
     * @param p PRD_TEHAI_IRAI登録フォームのリスト
     */
    public void setPrdTehaiIraiGrid(final List<PrdTehaiIraiRegistForm> p) {
        this.prdTehaiIraiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
