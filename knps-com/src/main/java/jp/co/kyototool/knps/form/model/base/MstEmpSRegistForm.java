package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_EMP一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstEmpSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstEmpRegistForm.class);

    /** MST_EMP登録フォームのリスト */
    @Valid
    private List<MstEmpRegistForm> mstEmpGrid;

    /**
     * @return MST_EMP登録フォームのリスト
     */
    public List<MstEmpRegistForm> getMstEmpGrid() {
        return mstEmpGrid;
    }

    /**
     * @param p MST_EMP登録フォームのリスト
     */
    public void setMstEmpGrid(final List<MstEmpRegistForm> p) {
        this.mstEmpGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
