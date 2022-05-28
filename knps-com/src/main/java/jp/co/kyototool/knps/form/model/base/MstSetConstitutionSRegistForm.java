package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SET_CONSTITUTION一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSetConstitutionSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSetConstitutionRegistForm.class);

    /** MST_SET_CONSTITUTION登録フォームのリスト */
    @Valid
    private List<MstSetConstitutionRegistForm> mstSetConstitutionGrid;

    /**
     * @return MST_SET_CONSTITUTION登録フォームのリスト
     */
    public List<MstSetConstitutionRegistForm> getMstSetConstitutionGrid() {
        return mstSetConstitutionGrid;
    }

    /**
     * @param p MST_SET_CONSTITUTION登録フォームのリスト
     */
    public void setMstSetConstitutionGrid(final List<MstSetConstitutionRegistForm> p) {
        this.mstSetConstitutionGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
