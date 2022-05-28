package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_GAMEN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstGamenSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstGamenRegistForm.class);

    /** MST_GAMEN登録フォームのリスト */
    @Valid
    private List<MstGamenRegistForm> mstGamenGrid;

    /**
     * @return MST_GAMEN登録フォームのリスト
     */
    public List<MstGamenRegistForm> getMstGamenGrid() {
        return mstGamenGrid;
    }

    /**
     * @param p MST_GAMEN登録フォームのリスト
     */
    public void setMstGamenGrid(final List<MstGamenRegistForm> p) {
        this.mstGamenGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
