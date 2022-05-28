package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_LOCATION一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstLocationSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstLocationRegistForm.class);

    /** MST_LOCATION登録フォームのリスト */
    @Valid
    private List<MstLocationRegistForm> mstLocationGrid;

    /**
     * @return MST_LOCATION登録フォームのリスト
     */
    public List<MstLocationRegistForm> getMstLocationGrid() {
        return mstLocationGrid;
    }

    /**
     * @param p MST_LOCATION登録フォームのリスト
     */
    public void setMstLocationGrid(final List<MstLocationRegistForm> p) {
        this.mstLocationGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
