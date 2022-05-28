package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_TIME_SCH一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyTimeSchSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyTimeSchRegistForm.class);

    /** PRD_DAILY_TIME_SCH登録フォームのリスト */
    @Valid
    private List<PrdDailyTimeSchRegistForm> prdDailyTimeSchGrid;

    /**
     * @return PRD_DAILY_TIME_SCH登録フォームのリスト
     */
    public List<PrdDailyTimeSchRegistForm> getPrdDailyTimeSchGrid() {
        return prdDailyTimeSchGrid;
    }

    /**
     * @param p PRD_DAILY_TIME_SCH登録フォームのリスト
     */
    public void setPrdDailyTimeSchGrid(final List<PrdDailyTimeSchRegistForm> p) {
        this.prdDailyTimeSchGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
