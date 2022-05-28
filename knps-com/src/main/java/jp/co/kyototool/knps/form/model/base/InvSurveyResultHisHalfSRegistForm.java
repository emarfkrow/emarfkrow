package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_SURVEY_RESULT_HIS_HALF一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvSurveyResultHisHalfSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvSurveyResultHisHalfRegistForm.class);

    /** INV_SURVEY_RESULT_HIS_HALF登録フォームのリスト */
    @Valid
    private List<InvSurveyResultHisHalfRegistForm> invSurveyResultHisHalfGrid;

    /**
     * @return INV_SURVEY_RESULT_HIS_HALF登録フォームのリスト
     */
    public List<InvSurveyResultHisHalfRegistForm> getInvSurveyResultHisHalfGrid() {
        return invSurveyResultHisHalfGrid;
    }

    /**
     * @param p INV_SURVEY_RESULT_HIS_HALF登録フォームのリスト
     */
    public void setInvSurveyResultHisHalfGrid(final List<InvSurveyResultHisHalfRegistForm> p) {
        this.invSurveyResultHisHalfGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
