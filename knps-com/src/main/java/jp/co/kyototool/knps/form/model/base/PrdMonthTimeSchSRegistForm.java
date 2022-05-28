package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_MONTH_TIME_SCH一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMonthTimeSchSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMonthTimeSchRegistForm.class);

    /** PRD_MONTH_TIME_SCH登録フォームのリスト */
    @Valid
    private List<PrdMonthTimeSchRegistForm> prdMonthTimeSchGrid;

    /**
     * @return PRD_MONTH_TIME_SCH登録フォームのリスト
     */
    public List<PrdMonthTimeSchRegistForm> getPrdMonthTimeSchGrid() {
        return prdMonthTimeSchGrid;
    }

    /**
     * @param p PRD_MONTH_TIME_SCH登録フォームのリスト
     */
    public void setPrdMonthTimeSchGrid(final List<PrdMonthTimeSchRegistForm> p) {
        this.prdMonthTimeSchGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
