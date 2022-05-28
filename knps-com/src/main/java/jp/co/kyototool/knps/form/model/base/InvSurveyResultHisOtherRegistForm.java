package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_SURVEY_RESULT_HIS_OTHER登録フォーム
 *
 * @author emarfkrow
 */
public class InvSurveyResultHisOtherRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvSurveyResultHisOtherRegistForm.class);

    /** LOCATION_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * @param p LOCATION_CODE
     */
    public void setLocationCode(final String p) {
        this.locationCode = p;
    }

    /** RESULT_BRANCH_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String resultBranchNo;

    /**
     * @return RESULT_BRANCH_NO
     */
    public String getResultBranchNo() {
        return resultBranchNo;
    }

    /**
     * @param p RESULT_BRANCH_NO
     */
    public void setResultBranchNo(final String p) {
        this.resultBranchNo = p;
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

    /** HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** STOCK */
    @jakarta.validation.constraints.Size(max = 11)
    private String stock;

    /**
     * @return STOCK
     */
    public String getStock() {
        return stock;
    }

    /**
     * @param p STOCK
     */
    public void setStock(final String p) {
        this.stock = p;
    }

    /** DECISION_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String decisionKbn;

    /**
     * @return DECISION_KBN
     */
    public String getDecisionKbn() {
        return decisionKbn;
    }

    /**
     * @param p DECISION_KBN
     */
    public void setDecisionKbn(final String p) {
        this.decisionKbn = p;
    }

    /** ENTRY_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String entryDate;

    /**
     * @return ENTRY_DATE
     */
    public String getEntryDate() {
        return entryDate;
    }

    /**
     * @param p ENTRY_DATE
     */
    public void setEntryDate(final String p) {
        this.entryDate = p;
    }

    /** REGISTRANT */
    @jakarta.validation.constraints.Size(max = 10)
    private String registrant;

    /**
     * @return REGISTRANT
     */
    public String getRegistrant() {
        return registrant;
    }

    /**
     * @param p REGISTRANT
     */
    public void setRegistrant(final String p) {
        this.registrant = p;
    }

    /** SHUKEI_TANI_MEI */
    @jakarta.validation.constraints.Size(max = 20)
    private String shukeiTaniMei;

    /**
     * @return SHUKEI_TANI_MEI
     */
    public String getShukeiTaniMei() {
        return shukeiTaniMei;
    }

    /**
     * @param p SHUKEI_TANI_MEI
     */
    public void setShukeiTaniMei(final String p) {
        this.shukeiTaniMei = p;
    }

    /** DENPYO_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String denpyoNo;

    /**
     * @return DENPYO_NO
     */
    public String getDenpyoNo() {
        return denpyoNo;
    }

    /**
     * @param p DENPYO_NO
     */
    public void setDenpyoNo(final String p) {
        this.denpyoNo = p;
    }

    /** OPE_DETAIL */
    @jakarta.validation.constraints.Size(max = 10)
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return opeDetail;
    }

    /**
     * @param p OPE_DETAIL
     */
    public void setOpeDetail(final String p) {
        this.opeDetail = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
