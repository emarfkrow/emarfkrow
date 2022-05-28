package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_RFID_DATA一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvRfidDataSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvRfidDataRegistForm.class);

    /** INV_RFID_DATA登録フォームのリスト */
    @Valid
    private List<InvRfidDataRegistForm> invRfidDataGrid;

    /**
     * @return INV_RFID_DATA登録フォームのリスト
     */
    public List<InvRfidDataRegistForm> getInvRfidDataGrid() {
        return invRfidDataGrid;
    }

    /**
     * @param p INV_RFID_DATA登録フォームのリスト
     */
    public void setInvRfidDataGrid(final List<InvRfidDataRegistForm> p) {
        this.invRfidDataGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
