package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_HINBAN_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstHinbanBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstHinbanBkRegistForm.class);

    /** MST_HINBAN_BK登録フォームのリスト */
    @Valid
    private List<MstHinbanBkRegistForm> mstHinbanBkGrid;

    /**
     * @return MST_HINBAN_BK登録フォームのリスト
     */
    public List<MstHinbanBkRegistForm> getMstHinbanBkGrid() {
        return mstHinbanBkGrid;
    }

    /**
     * @param p MST_HINBAN_BK登録フォームのリスト
     */
    public void setMstHinbanBkGrid(final List<MstHinbanBkRegistForm> p) {
        this.mstHinbanBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
