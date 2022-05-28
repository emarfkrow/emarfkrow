package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_PRO_ACT_HED一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgProActHedSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgProActHedRegistForm.class);

    /** MFG_PRO_ACT_HED登録フォームのリスト */
    @Valid
    private List<MfgProActHedRegistForm> mfgProActHedGrid;

    /**
     * @return MFG_PRO_ACT_HED登録フォームのリスト
     */
    public List<MfgProActHedRegistForm> getMfgProActHedGrid() {
        return mfgProActHedGrid;
    }

    /**
     * @param p MFG_PRO_ACT_HED登録フォームのリスト
     */
    public void setMfgProActHedGrid(final List<MfgProActHedRegistForm> p) {
        this.mfgProActHedGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
