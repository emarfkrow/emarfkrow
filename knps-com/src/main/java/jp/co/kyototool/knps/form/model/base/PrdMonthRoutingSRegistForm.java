package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_MONTH_ROUTING一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMonthRoutingSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMonthRoutingRegistForm.class);

    /** PRD_MONTH_ROUTING登録フォームのリスト */
    @Valid
    private List<PrdMonthRoutingRegistForm> prdMonthRoutingGrid;

    /**
     * @return PRD_MONTH_ROUTING登録フォームのリスト
     */
    public List<PrdMonthRoutingRegistForm> getPrdMonthRoutingGrid() {
        return prdMonthRoutingGrid;
    }

    /**
     * @param p PRD_MONTH_ROUTING登録フォームのリスト
     */
    public void setPrdMonthRoutingGrid(final List<PrdMonthRoutingRegistForm> p) {
        this.prdMonthRoutingGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
