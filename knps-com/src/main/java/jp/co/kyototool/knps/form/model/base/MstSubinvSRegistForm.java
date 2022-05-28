package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUBINV一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSubinvSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSubinvRegistForm.class);

    /** MST_SUBINV登録フォームのリスト */
    @Valid
    private List<MstSubinvRegistForm> mstSubinvGrid;

    /**
     * @return MST_SUBINV登録フォームのリスト
     */
    public List<MstSubinvRegistForm> getMstSubinvGrid() {
        return mstSubinvGrid;
    }

    /**
     * @param p MST_SUBINV登録フォームのリスト
     */
    public void setMstSubinvGrid(final List<MstSubinvRegistForm> p) {
        this.mstSubinvGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
