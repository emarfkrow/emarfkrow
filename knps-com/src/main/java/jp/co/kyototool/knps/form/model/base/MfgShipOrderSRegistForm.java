package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_SHIP_ORDER一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgShipOrderSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgShipOrderRegistForm.class);

    /** MFG_SHIP_ORDER登録フォームのリスト */
    @Valid
    private List<MfgShipOrderRegistForm> mfgShipOrderGrid;

    /**
     * @return MFG_SHIP_ORDER登録フォームのリスト
     */
    public List<MfgShipOrderRegistForm> getMfgShipOrderGrid() {
        return mfgShipOrderGrid;
    }

    /**
     * @param p MFG_SHIP_ORDER登録フォームのリスト
     */
    public void setMfgShipOrderGrid(final List<MfgShipOrderRegistForm> p) {
        this.mfgShipOrderGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
