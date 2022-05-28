package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_AREA一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstAreaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstAreaRegistForm.class);

    /** MST_AREA登録フォームのリスト */
    @Valid
    private List<MstAreaRegistForm> mstAreaGrid;

    /**
     * @return MST_AREA登録フォームのリスト
     */
    public List<MstAreaRegistForm> getMstAreaGrid() {
        return mstAreaGrid;
    }

    /**
     * @param p MST_AREA登録フォームのリスト
     */
    public void setMstAreaGrid(final List<MstAreaRegistForm> p) {
        this.mstAreaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
