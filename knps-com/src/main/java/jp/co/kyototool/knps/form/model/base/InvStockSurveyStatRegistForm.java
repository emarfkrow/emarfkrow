package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_SURVEY_STAT登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockSurveyStatRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockSurveyStatRegistForm.class);

    /** REC_NO */
    @jakarta.validation.constraints.Size(max = 3)
    private String recNo;

    /**
     * @return REC_NO
     */
    public String getRecNo() {
        return recNo;
    }

    /**
     * @param p REC_NO
     */
    public void setRecNo(final String p) {
        this.recNo = p;
    }

    /** YYYY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return yyyy;
    }

    /**
     * @param p YYYY
     */
    public void setYyyy(final String p) {
        this.yyyy = p;
    }

    /** MM */
    @jakarta.validation.constraints.Size(max = 2)
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return mm;
    }

    /**
     * @param p MM
     */
    public void setMm(final String p) {
        this.mm = p;
    }

    /** SURVEY_STAT */
    @jakarta.validation.constraints.Size(max = 1)
    private String surveyStat;

    /**
     * @return SURVEY_STAT
     */
    public String getSurveyStat() {
        return surveyStat;
    }

    /**
     * @param p SURVEY_STAT
     */
    public void setSurveyStat(final String p) {
        this.surveyStat = p;
    }

    /** DEVELOP_PRODUCTS_STAT */
    @jakarta.validation.constraints.Size(max = 1)
    private String developProductsStat;

    /**
     * @return DEVELOP_PRODUCTS_STAT
     */
    public String getDevelopProductsStat() {
        return developProductsStat;
    }

    /**
     * @param p DEVELOP_PRODUCTS_STAT
     */
    public void setDevelopProductsStat(final String p) {
        this.developProductsStat = p;
    }

    /** DEVELOP_PARTS_STAT */
    @jakarta.validation.constraints.Size(max = 1)
    private String developPartsStat;

    /**
     * @return DEVELOP_PARTS_STAT
     */
    public String getDevelopPartsStat() {
        return developPartsStat;
    }

    /**
     * @param p DEVELOP_PARTS_STAT
     */
    public void setDevelopPartsStat(final String p) {
        this.developPartsStat = p;
    }

    /** PRD_ORDERPOINT_CONDITION */
    @jakarta.validation.Valid
    private PrdOrderpointConditionRegistForm prdOrderpointConditionRegistForm;

    /**
     * @return PrdOrderpointConditionRegistForm
     */
    public PrdOrderpointConditionRegistForm getPrdOrderpointConditionRegistForm() {
        return prdOrderpointConditionRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdOrderpointConditionRegistForm(final PrdOrderpointConditionRegistForm p) {
        this.prdOrderpointConditionRegistForm = p;
    }

    /** PRD_PRE_STATUS_HEAD */
    @jakarta.validation.Valid
    private PrdPreStatusHeadRegistForm prdPreStatusHeadRegistForm;

    /**
     * @return PrdPreStatusHeadRegistForm
     */
    public PrdPreStatusHeadRegistForm getPrdPreStatusHeadRegistForm() {
        return prdPreStatusHeadRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdPreStatusHeadRegistForm(final PrdPreStatusHeadRegistForm p) {
        this.prdPreStatusHeadRegistForm = p;
    }

    /** SYS_CLOSE_STATUS */
    @jakarta.validation.Valid
    private SysCloseStatusRegistForm sysCloseStatusRegistForm;

    /**
     * @return SysCloseStatusRegistForm
     */
    public SysCloseStatusRegistForm getSysCloseStatusRegistForm() {
        return sysCloseStatusRegistForm;
    }

    /**
     * @param p
     */
    public void setSysCloseStatusRegistForm(final SysCloseStatusRegistForm p) {
        this.sysCloseStatusRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
