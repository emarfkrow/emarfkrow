package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_BUSINESS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstBusinessSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstBusinessRegistForm.class);

    /** MST_BUSINESS登録フォームのリスト */
    @Valid
    private List<MstBusinessRegistForm> mstBusinessGrid;

    /**
     * @return MST_BUSINESS登録フォームのリスト
     */
    public List<MstBusinessRegistForm> getMstBusinessGrid() {
        return mstBusinessGrid;
    }

    /**
     * @param p MST_BUSINESS登録フォームのリスト
     */
    public void setMstBusinessGrid(final List<MstBusinessRegistForm> p) {
        this.mstBusinessGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
