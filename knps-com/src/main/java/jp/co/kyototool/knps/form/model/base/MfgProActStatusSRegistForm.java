package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_PRO_ACT_STATUS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgProActStatusSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgProActStatusRegistForm.class);

    /** MFG_PRO_ACT_STATUS登録フォームのリスト */
    @Valid
    private List<MfgProActStatusRegistForm> mfgProActStatusGrid;

    /**
     * @return MFG_PRO_ACT_STATUS登録フォームのリスト
     */
    public List<MfgProActStatusRegistForm> getMfgProActStatusGrid() {
        return mfgProActStatusGrid;
    }

    /**
     * @param p MFG_PRO_ACT_STATUS登録フォームのリスト
     */
    public void setMfgProActStatusGrid(final List<MfgProActStatusRegistForm> p) {
        this.mfgProActStatusGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
