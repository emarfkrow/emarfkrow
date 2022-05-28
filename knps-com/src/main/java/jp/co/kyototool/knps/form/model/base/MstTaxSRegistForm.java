package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_TAX一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstTaxSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstTaxRegistForm.class);

    /** MST_TAX登録フォームのリスト */
    @Valid
    private List<MstTaxRegistForm> mstTaxGrid;

    /**
     * @return MST_TAX登録フォームのリスト
     */
    public List<MstTaxRegistForm> getMstTaxGrid() {
        return mstTaxGrid;
    }

    /**
     * @param p MST_TAX登録フォームのリスト
     */
    public void setMstTaxGrid(final List<MstTaxRegistForm> p) {
        this.mstTaxGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
