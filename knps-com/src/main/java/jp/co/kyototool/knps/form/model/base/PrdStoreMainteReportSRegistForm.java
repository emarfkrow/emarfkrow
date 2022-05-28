package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_REPORT一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteReportSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteReportRegistForm.class);

    /** PRD_STORE_MAINTE_REPORT登録フォームのリスト */
    @Valid
    private List<PrdStoreMainteReportRegistForm> prdStoreMainteReportGrid;

    /**
     * @return PRD_STORE_MAINTE_REPORT登録フォームのリスト
     */
    public List<PrdStoreMainteReportRegistForm> getPrdStoreMainteReportGrid() {
        return prdStoreMainteReportGrid;
    }

    /**
     * @param p PRD_STORE_MAINTE_REPORT登録フォームのリスト
     */
    public void setPrdStoreMainteReportGrid(final List<PrdStoreMainteReportRegistForm> p) {
        this.prdStoreMainteReportGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
