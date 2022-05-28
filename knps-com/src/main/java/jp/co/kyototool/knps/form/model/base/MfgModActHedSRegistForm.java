package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_MOD_ACT_HED一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgModActHedSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgModActHedRegistForm.class);

    /** MFG_MOD_ACT_HED登録フォームのリスト */
    @Valid
    private List<MfgModActHedRegistForm> mfgModActHedGrid;

    /**
     * @return MFG_MOD_ACT_HED登録フォームのリスト
     */
    public List<MfgModActHedRegistForm> getMfgModActHedGrid() {
        return mfgModActHedGrid;
    }

    /**
     * @param p MFG_MOD_ACT_HED登録フォームのリスト
     */
    public void setMfgModActHedGrid(final List<MfgModActHedRegistForm> p) {
        this.mfgModActHedGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
