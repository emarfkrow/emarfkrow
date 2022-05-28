package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_PROD_TOTAL_INF一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchProdTotalInfSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchProdTotalInfRegistForm.class);

    /** PCH_PROD_TOTAL_INF登録フォームのリスト */
    @Valid
    private List<PchProdTotalInfRegistForm> pchProdTotalInfGrid;

    /**
     * @return PCH_PROD_TOTAL_INF登録フォームのリスト
     */
    public List<PchProdTotalInfRegistForm> getPchProdTotalInfGrid() {
        return pchProdTotalInfGrid;
    }

    /**
     * @param p PCH_PROD_TOTAL_INF登録フォームのリスト
     */
    public void setPchProdTotalInfGrid(final List<PchProdTotalInfRegistForm> p) {
        this.pchProdTotalInfGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
