package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_REASON一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstReasonSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstReasonRegistForm.class);

    /** MST_REASON登録フォームのリスト */
    @Valid
    private List<MstReasonRegistForm> mstReasonGrid;

    /**
     * @return MST_REASON登録フォームのリスト
     */
    public List<MstReasonRegistForm> getMstReasonGrid() {
        return mstReasonGrid;
    }

    /**
     * @param p MST_REASON登録フォームのリスト
     */
    public void setMstReasonGrid(final List<MstReasonRegistForm> p) {
        this.mstReasonGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
