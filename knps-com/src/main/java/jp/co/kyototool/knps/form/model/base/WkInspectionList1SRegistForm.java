package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * WK_INSPECTION_LIST1一覧登録フォーム
 *
 * @author emarfkrow
 */
public class WkInspectionList1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(WkInspectionList1RegistForm.class);

    /** WK_INSPECTION_LIST1登録フォームのリスト */
    @Valid
    private List<WkInspectionList1RegistForm> wkInspectionList1Grid;

    /**
     * @return WK_INSPECTION_LIST1登録フォームのリスト
     */
    public List<WkInspectionList1RegistForm> getWkInspectionList1Grid() {
        return wkInspectionList1Grid;
    }

    /**
     * @param p WK_INSPECTION_LIST1登録フォームのリスト
     */
    public void setWkInspectionList1Grid(final List<WkInspectionList1RegistForm> p) {
        this.wkInspectionList1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
