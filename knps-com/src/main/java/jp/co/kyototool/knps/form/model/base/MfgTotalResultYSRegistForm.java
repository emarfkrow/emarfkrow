package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_RESULT_Y一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalResultYSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalResultYRegistForm.class);

    /** MFG_TOTAL_RESULT_Y登録フォームのリスト */
    @Valid
    private List<MfgTotalResultYRegistForm> mfgTotalResultYGrid;

    /**
     * @return MFG_TOTAL_RESULT_Y登録フォームのリスト
     */
    public List<MfgTotalResultYRegistForm> getMfgTotalResultYGrid() {
        return mfgTotalResultYGrid;
    }

    /**
     * @param p MFG_TOTAL_RESULT_Y登録フォームのリスト
     */
    public void setMfgTotalResultYGrid(final List<MfgTotalResultYRegistForm> p) {
        this.mfgTotalResultYGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
