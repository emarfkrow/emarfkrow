package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_BTN_PERMISSION一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstBtnPermissionSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstBtnPermissionRegistForm.class);

    /** MST_BTN_PERMISSION登録フォームのリスト */
    @Valid
    private List<MstBtnPermissionRegistForm> mstBtnPermissionGrid;

    /**
     * @return MST_BTN_PERMISSION登録フォームのリスト
     */
    public List<MstBtnPermissionRegistForm> getMstBtnPermissionGrid() {
        return mstBtnPermissionGrid;
    }

    /**
     * @param p MST_BTN_PERMISSION登録フォームのリスト
     */
    public void setMstBtnPermissionGrid(final List<MstBtnPermissionRegistForm> p) {
        this.mstBtnPermissionGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
