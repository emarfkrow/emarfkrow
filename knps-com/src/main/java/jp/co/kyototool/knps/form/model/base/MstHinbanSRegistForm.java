package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_HINBAN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstHinbanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstHinbanRegistForm.class);

    /** MST_HINBAN登録フォームのリスト */
    @Valid
    private List<MstHinbanRegistForm> mstHinbanGrid;

    /**
     * @return MST_HINBAN登録フォームのリスト
     */
    public List<MstHinbanRegistForm> getMstHinbanGrid() {
        return mstHinbanGrid;
    }

    /**
     * @param p MST_HINBAN登録フォームのリスト
     */
    public void setMstHinbanGrid(final List<MstHinbanRegistForm> p) {
        this.mstHinbanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
