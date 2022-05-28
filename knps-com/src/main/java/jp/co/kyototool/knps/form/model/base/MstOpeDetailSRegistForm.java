package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_OPE_DETAIL一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstOpeDetailSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstOpeDetailRegistForm.class);

    /** MST_OPE_DETAIL登録フォームのリスト */
    @Valid
    private List<MstOpeDetailRegistForm> mstOpeDetailGrid;

    /**
     * @return MST_OPE_DETAIL登録フォームのリスト
     */
    public List<MstOpeDetailRegistForm> getMstOpeDetailGrid() {
        return mstOpeDetailGrid;
    }

    /**
     * @param p MST_OPE_DETAIL登録フォームのリスト
     */
    public void setMstOpeDetailGrid(final List<MstOpeDetailRegistForm> p) {
        this.mstOpeDetailGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
