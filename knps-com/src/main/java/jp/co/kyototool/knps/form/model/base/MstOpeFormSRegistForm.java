package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_OPE_FORM一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstOpeFormSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstOpeFormRegistForm.class);

    /** MST_OPE_FORM登録フォームのリスト */
    @Valid
    private List<MstOpeFormRegistForm> mstOpeFormGrid;

    /**
     * @return MST_OPE_FORM登録フォームのリスト
     */
    public List<MstOpeFormRegistForm> getMstOpeFormGrid() {
        return mstOpeFormGrid;
    }

    /**
     * @param p MST_OPE_FORM登録フォームのリスト
     */
    public void setMstOpeFormGrid(final List<MstOpeFormRegistForm> p) {
        this.mstOpeFormGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
