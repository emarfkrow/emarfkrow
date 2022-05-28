package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_IRAI_DET_HIS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiDetHisSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiIraiDetHisRegistForm.class);

    /** PRD_TEHAI_IRAI_DET_HIS登録フォームのリスト */
    @Valid
    private List<PrdTehaiIraiDetHisRegistForm> prdTehaiIraiDetHisGrid;

    /**
     * @return PRD_TEHAI_IRAI_DET_HIS登録フォームのリスト
     */
    public List<PrdTehaiIraiDetHisRegistForm> getPrdTehaiIraiDetHisGrid() {
        return prdTehaiIraiDetHisGrid;
    }

    /**
     * @param p PRD_TEHAI_IRAI_DET_HIS登録フォームのリスト
     */
    public void setPrdTehaiIraiDetHisGrid(final List<PrdTehaiIraiDetHisRegistForm> p) {
        this.prdTehaiIraiDetHisGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
