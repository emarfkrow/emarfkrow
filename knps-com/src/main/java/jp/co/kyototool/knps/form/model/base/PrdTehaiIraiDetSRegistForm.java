package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_IRAI_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiIraiDetRegistForm.class);

    /** PRD_TEHAI_IRAI_DET登録フォームのリスト */
    @Valid
    private List<PrdTehaiIraiDetRegistForm> prdTehaiIraiDetGrid;

    /**
     * @return PRD_TEHAI_IRAI_DET登録フォームのリスト
     */
    public List<PrdTehaiIraiDetRegistForm> getPrdTehaiIraiDetGrid() {
        return prdTehaiIraiDetGrid;
    }

    /**
     * @param p PRD_TEHAI_IRAI_DET登録フォームのリスト
     */
    public void setPrdTehaiIraiDetGrid(final List<PrdTehaiIraiDetRegistForm> p) {
        this.prdTehaiIraiDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
