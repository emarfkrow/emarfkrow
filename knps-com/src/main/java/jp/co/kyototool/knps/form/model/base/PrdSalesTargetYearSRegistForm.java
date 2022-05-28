package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_SALES_TARGET_YEAR一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdSalesTargetYearSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdSalesTargetYearRegistForm.class);

    /** PRD_SALES_TARGET_YEAR登録フォームのリスト */
    @Valid
    private List<PrdSalesTargetYearRegistForm> prdSalesTargetYearGrid;

    /**
     * @return PRD_SALES_TARGET_YEAR登録フォームのリスト
     */
    public List<PrdSalesTargetYearRegistForm> getPrdSalesTargetYearGrid() {
        return prdSalesTargetYearGrid;
    }

    /**
     * @param p PRD_SALES_TARGET_YEAR登録フォームのリスト
     */
    public void setPrdSalesTargetYearGrid(final List<PrdSalesTargetYearRegistForm> p) {
        this.prdSalesTargetYearGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
