package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ID一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstIdSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstIdRegistForm.class);

    /** MST_ID登録フォームのリスト */
    @Valid
    private List<MstIdRegistForm> mstIdGrid;

    /**
     * @return MST_ID登録フォームのリスト
     */
    public List<MstIdRegistForm> getMstIdGrid() {
        return mstIdGrid;
    }

    /**
     * @param p MST_ID登録フォームのリスト
     */
    public void setMstIdGrid(final List<MstIdRegistForm> p) {
        this.mstIdGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
