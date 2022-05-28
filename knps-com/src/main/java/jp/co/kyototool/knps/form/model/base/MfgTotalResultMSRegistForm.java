package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_TOTAL_RESULT_M一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgTotalResultMSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgTotalResultMRegistForm.class);

    /** MFG_TOTAL_RESULT_M登録フォームのリスト */
    @Valid
    private List<MfgTotalResultMRegistForm> mfgTotalResultMGrid;

    /**
     * @return MFG_TOTAL_RESULT_M登録フォームのリスト
     */
    public List<MfgTotalResultMRegistForm> getMfgTotalResultMGrid() {
        return mfgTotalResultMGrid;
    }

    /**
     * @param p MFG_TOTAL_RESULT_M登録フォームのリスト
     */
    public void setMfgTotalResultMGrid(final List<MfgTotalResultMRegistForm> p) {
        this.mfgTotalResultMGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
