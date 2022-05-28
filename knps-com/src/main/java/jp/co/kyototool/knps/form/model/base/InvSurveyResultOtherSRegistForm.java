package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_SURVEY_RESULT_OTHER一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvSurveyResultOtherSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvSurveyResultOtherRegistForm.class);

    /** INV_SURVEY_RESULT_OTHER登録フォームのリスト */
    @Valid
    private List<InvSurveyResultOtherRegistForm> invSurveyResultOtherGrid;

    /**
     * @return INV_SURVEY_RESULT_OTHER登録フォームのリスト
     */
    public List<InvSurveyResultOtherRegistForm> getInvSurveyResultOtherGrid() {
        return invSurveyResultOtherGrid;
    }

    /**
     * @param p INV_SURVEY_RESULT_OTHER登録フォームのリスト
     */
    public void setInvSurveyResultOtherGrid(final List<InvSurveyResultOtherRegistForm> p) {
        this.invSurveyResultOtherGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
