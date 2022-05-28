package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_MONTH_TIME_SCH_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdMonthTimeSchBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdMonthTimeSchBkRegistForm.class);

    /** PRD_MONTH_TIME_SCH_BK登録フォームのリスト */
    @Valid
    private List<PrdMonthTimeSchBkRegistForm> prdMonthTimeSchBkGrid;

    /**
     * @return PRD_MONTH_TIME_SCH_BK登録フォームのリスト
     */
    public List<PrdMonthTimeSchBkRegistForm> getPrdMonthTimeSchBkGrid() {
        return prdMonthTimeSchBkGrid;
    }

    /**
     * @param p PRD_MONTH_TIME_SCH_BK登録フォームのリスト
     */
    public void setPrdMonthTimeSchBkGrid(final List<PrdMonthTimeSchBkRegistForm> p) {
        this.prdMonthTimeSchBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
