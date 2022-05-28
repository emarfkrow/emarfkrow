package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_DAILY_NECK_LOAD一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdDailyNeckLoadSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdDailyNeckLoadRegistForm.class);

    /** PRD_DAILY_NECK_LOAD登録フォームのリスト */
    @Valid
    private List<PrdDailyNeckLoadRegistForm> prdDailyNeckLoadGrid;

    /**
     * @return PRD_DAILY_NECK_LOAD登録フォームのリスト
     */
    public List<PrdDailyNeckLoadRegistForm> getPrdDailyNeckLoadGrid() {
        return prdDailyNeckLoadGrid;
    }

    /**
     * @param p PRD_DAILY_NECK_LOAD登録フォームのリスト
     */
    public void setPrdDailyNeckLoadGrid(final List<PrdDailyNeckLoadRegistForm> p) {
        this.prdDailyNeckLoadGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
