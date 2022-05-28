package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_RATE_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgRateBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgRateBkRegistForm.class);

    /** MFG_RATE_BK登録フォームのリスト */
    @Valid
    private List<MfgRateBkRegistForm> mfgRateBkGrid;

    /**
     * @return MFG_RATE_BK登録フォームのリスト
     */
    public List<MfgRateBkRegistForm> getMfgRateBkGrid() {
        return mfgRateBkGrid;
    }

    /**
     * @param p MFG_RATE_BK登録フォームのリスト
     */
    public void setMfgRateBkGrid(final List<MfgRateBkRegistForm> p) {
        this.mfgRateBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
