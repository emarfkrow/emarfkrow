package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_PRINT_WAREHOUSINGSLIP一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvPrintWarehousingslipSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvPrintWarehousingslipRegistForm.class);

    /** INV_PRINT_WAREHOUSINGSLIP登録フォームのリスト */
    @Valid
    private List<InvPrintWarehousingslipRegistForm> invPrintWarehousingslipGrid;

    /**
     * @return INV_PRINT_WAREHOUSINGSLIP登録フォームのリスト
     */
    public List<InvPrintWarehousingslipRegistForm> getInvPrintWarehousingslipGrid() {
        return invPrintWarehousingslipGrid;
    }

    /**
     * @param p INV_PRINT_WAREHOUSINGSLIP登録フォームのリスト
     */
    public void setInvPrintWarehousingslipGrid(final List<InvPrintWarehousingslipRegistForm> p) {
        this.invPrintWarehousingslipGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
