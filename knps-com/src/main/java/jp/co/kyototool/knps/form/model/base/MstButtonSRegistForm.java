package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_BUTTON一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstButtonSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstButtonRegistForm.class);

    /** MST_BUTTON登録フォームのリスト */
    @Valid
    private List<MstButtonRegistForm> mstButtonGrid;

    /**
     * @return MST_BUTTON登録フォームのリスト
     */
    public List<MstButtonRegistForm> getMstButtonGrid() {
        return mstButtonGrid;
    }

    /**
     * @param p MST_BUTTON登録フォームのリスト
     */
    public void setMstButtonGrid(final List<MstButtonRegistForm> p) {
        this.mstButtonGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
