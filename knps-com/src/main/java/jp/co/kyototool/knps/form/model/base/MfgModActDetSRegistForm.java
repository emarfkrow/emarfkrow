package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_MOD_ACT_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgModActDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgModActDetRegistForm.class);

    /** MFG_MOD_ACT_DET登録フォームのリスト */
    @Valid
    private List<MfgModActDetRegistForm> mfgModActDetGrid;

    /**
     * @return MFG_MOD_ACT_DET登録フォームのリスト
     */
    public List<MfgModActDetRegistForm> getMfgModActDetGrid() {
        return mfgModActDetGrid;
    }

    /**
     * @param p MFG_MOD_ACT_DET登録フォームのリスト
     */
    public void setMfgModActDetGrid(final List<MfgModActDetRegistForm> p) {
        this.mfgModActDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
