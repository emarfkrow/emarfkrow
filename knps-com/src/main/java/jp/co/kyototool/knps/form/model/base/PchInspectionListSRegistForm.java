package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_INSPECTION_LIST一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchInspectionListSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchInspectionListRegistForm.class);

    /** PCH_INSPECTION_LIST登録フォームのリスト */
    @Valid
    private List<PchInspectionListRegistForm> pchInspectionListGrid;

    /**
     * @return PCH_INSPECTION_LIST登録フォームのリスト
     */
    public List<PchInspectionListRegistForm> getPchInspectionListGrid() {
        return pchInspectionListGrid;
    }

    /**
     * @param p PCH_INSPECTION_LIST登録フォームのリスト
     */
    public void setPchInspectionListGrid(final List<PchInspectionListRegistForm> p) {
        this.pchInspectionListGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
