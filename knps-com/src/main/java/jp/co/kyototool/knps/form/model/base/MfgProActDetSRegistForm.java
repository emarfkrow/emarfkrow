package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_PRO_ACT_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgProActDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgProActDetRegistForm.class);

    /** MFG_PRO_ACT_DET登録フォームのリスト */
    @Valid
    private List<MfgProActDetRegistForm> mfgProActDetGrid;

    /**
     * @return MFG_PRO_ACT_DET登録フォームのリスト
     */
    public List<MfgProActDetRegistForm> getMfgProActDetGrid() {
        return mfgProActDetGrid;
    }

    /**
     * @param p MFG_PRO_ACT_DET登録フォームのリスト
     */
    public void setMfgProActDetGrid(final List<MfgProActDetRegistForm> p) {
        this.mfgProActDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
