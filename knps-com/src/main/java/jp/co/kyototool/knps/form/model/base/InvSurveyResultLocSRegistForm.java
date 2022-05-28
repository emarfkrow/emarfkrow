package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_SURVEY_RESULT_LOC一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvSurveyResultLocSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvSurveyResultLocRegistForm.class);

    /** INV_SURVEY_RESULT_LOC登録フォームのリスト */
    @Valid
    private List<InvSurveyResultLocRegistForm> invSurveyResultLocGrid;

    /**
     * @return INV_SURVEY_RESULT_LOC登録フォームのリスト
     */
    public List<InvSurveyResultLocRegistForm> getInvSurveyResultLocGrid() {
        return invSurveyResultLocGrid;
    }

    /**
     * @param p INV_SURVEY_RESULT_LOC登録フォームのリスト
     */
    public void setInvSurveyResultLocGrid(final List<InvSurveyResultLocRegistForm> p) {
        this.invSurveyResultLocGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
