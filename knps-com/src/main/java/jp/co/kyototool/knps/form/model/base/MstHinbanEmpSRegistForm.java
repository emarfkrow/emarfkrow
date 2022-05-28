package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_HINBAN_EMP一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstHinbanEmpSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstHinbanEmpRegistForm.class);

    /** MST_HINBAN_EMP登録フォームのリスト */
    @Valid
    private List<MstHinbanEmpRegistForm> mstHinbanEmpGrid;

    /**
     * @return MST_HINBAN_EMP登録フォームのリスト
     */
    public List<MstHinbanEmpRegistForm> getMstHinbanEmpGrid() {
        return mstHinbanEmpGrid;
    }

    /**
     * @param p MST_HINBAN_EMP登録フォームのリスト
     */
    public void setMstHinbanEmpGrid(final List<MstHinbanEmpRegistForm> p) {
        this.mstHinbanEmpGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
