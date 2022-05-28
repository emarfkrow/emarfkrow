package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STK_PLAN_BK登録フォーム
 *
 * @author emarfkrow
 */
public class InvStkPlanBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStkPlanBkRegistForm.class);

    /** PRO_HINBAN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 25)
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    public String getProHinban() {
        return proHinban;
    }

    /**
     * @param p PRO_HINBAN
     */
    public void setProHinban(final String p) {
        this.proHinban = p;
    }

    /** YYYY */
    @jakarta.validation.constraints.NotBlank
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
    @jakarta.validation.constraints.NotBlank
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

    /** PAP_KAN_AMT_SCH */
    @jakarta.validation.constraints.Size(max = 4)
    private String papKanAmtSch;

    /**
     * @return PAP_KAN_AMT_SCH
     */
    public String getPapKanAmtSch() {
        return papKanAmtSch;
    }

    /**
     * @param p PAP_KAN_AMT_SCH
     */
    public void setPapKanAmtSch(final String p) {
        this.papKanAmtSch = p;
    }

    /** PAP_KAN_AMT_SCH_FST */
    @jakarta.validation.constraints.Size(max = 4)
    private String papKanAmtSchFst;

    /**
     * @return PAP_KAN_AMT_SCH_FST
     */
    public String getPapKanAmtSchFst() {
        return papKanAmtSchFst;
    }

    /**
     * @param p PAP_KAN_AMT_SCH_FST
     */
    public void setPapKanAmtSchFst(final String p) {
        this.papKanAmtSchFst = p;
    }

    /** PAP_KAN_AMT_SCH_MID */
    @jakarta.validation.constraints.Size(max = 4)
    private String papKanAmtSchMid;

    /**
     * @return PAP_KAN_AMT_SCH_MID
     */
    public String getPapKanAmtSchMid() {
        return papKanAmtSchMid;
    }

    /**
     * @param p PAP_KAN_AMT_SCH_MID
     */
    public void setPapKanAmtSchMid(final String p) {
        this.papKanAmtSchMid = p;
    }

    /** PAP_KAN_AMT_SCH_LST */
    @jakarta.validation.constraints.Size(max = 4)
    private String papKanAmtSchLst;

    /**
     * @return PAP_KAN_AMT_SCH_LST
     */
    public String getPapKanAmtSchLst() {
        return papKanAmtSchLst;
    }

    /**
     * @param p PAP_KAN_AMT_SCH_LST
     */
    public void setPapKanAmtSchLst(final String p) {
        this.papKanAmtSchLst = p;
    }

    /** PAP_KAN_AMT_ACT_FST */
    @jakarta.validation.constraints.Size(max = 4)
    private String papKanAmtActFst;

    /**
     * @return PAP_KAN_AMT_ACT_FST
     */
    public String getPapKanAmtActFst() {
        return papKanAmtActFst;
    }

    /**
     * @param p PAP_KAN_AMT_ACT_FST
     */
    public void setPapKanAmtActFst(final String p) {
        this.papKanAmtActFst = p;
    }

    /** PAP_KAN_AMT_ACT_MID */
    @jakarta.validation.constraints.Size(max = 4)
    private String papKanAmtActMid;

    /**
     * @return PAP_KAN_AMT_ACT_MID
     */
    public String getPapKanAmtActMid() {
        return papKanAmtActMid;
    }

    /**
     * @param p PAP_KAN_AMT_ACT_MID
     */
    public void setPapKanAmtActMid(final String p) {
        this.papKanAmtActMid = p;
    }

    /** PAP_KAN_AMT_ACT_LST */
    @jakarta.validation.constraints.Size(max = 4)
    private String papKanAmtActLst;

    /**
     * @return PAP_KAN_AMT_ACT_LST
     */
    public String getPapKanAmtActLst() {
        return papKanAmtActLst;
    }

    /**
     * @param p PAP_KAN_AMT_ACT_LST
     */
    public void setPapKanAmtActLst(final String p) {
        this.papKanAmtActLst = p;
    }

    /** PAP_KAN_AMT_ACT */
    @jakarta.validation.constraints.Size(max = 4)
    private String papKanAmtAct;

    /**
     * @return PAP_KAN_AMT_ACT
     */
    public String getPapKanAmtAct() {
        return papKanAmtAct;
    }

    /**
     * @param p PAP_KAN_AMT_ACT
     */
    public void setPapKanAmtAct(final String p) {
        this.papKanAmtAct = p;
    }

    /** REQ_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String reqCounts;

    /**
     * @return REQ_COUNTS
     */
    public String getReqCounts() {
        return reqCounts;
    }

    /**
     * @param p REQ_COUNTS
     */
    public void setReqCounts(final String p) {
        this.reqCounts = p;
    }

    /** REQ_NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String reqNesCounts;

    /**
     * @return REQ_NES_COUNTS
     */
    public String getReqNesCounts() {
        return reqNesCounts;
    }

    /**
     * @param p REQ_NES_COUNTS
     */
    public void setReqNesCounts(final String p) {
        this.reqNesCounts = p;
    }

    /** REQ_PAP_KAN_AMT_SCH */
    @jakarta.validation.constraints.Size(max = 4)
    private String reqPapKanAmtSch;

    /**
     * @return REQ_PAP_KAN_AMT_SCH
     */
    public String getReqPapKanAmtSch() {
        return reqPapKanAmtSch;
    }

    /**
     * @param p REQ_PAP_KAN_AMT_SCH
     */
    public void setReqPapKanAmtSch(final String p) {
        this.reqPapKanAmtSch = p;
    }

    /** REQ_PAP_KAN_AMT_SCH_FST */
    @jakarta.validation.constraints.Size(max = 4)
    private String reqPapKanAmtSchFst;

    /**
     * @return REQ_PAP_KAN_AMT_SCH_FST
     */
    public String getReqPapKanAmtSchFst() {
        return reqPapKanAmtSchFst;
    }

    /**
     * @param p REQ_PAP_KAN_AMT_SCH_FST
     */
    public void setReqPapKanAmtSchFst(final String p) {
        this.reqPapKanAmtSchFst = p;
    }

    /** REQ_PAP_KAN_AMT_SCH_MID */
    @jakarta.validation.constraints.Size(max = 4)
    private String reqPapKanAmtSchMid;

    /**
     * @return REQ_PAP_KAN_AMT_SCH_MID
     */
    public String getReqPapKanAmtSchMid() {
        return reqPapKanAmtSchMid;
    }

    /**
     * @param p REQ_PAP_KAN_AMT_SCH_MID
     */
    public void setReqPapKanAmtSchMid(final String p) {
        this.reqPapKanAmtSchMid = p;
    }

    /** REQ_PAP_KAN_AMT_SCH_LST */
    @jakarta.validation.constraints.Size(max = 4)
    private String reqPapKanAmtSchLst;

    /**
     * @return REQ_PAP_KAN_AMT_SCH_LST
     */
    public String getReqPapKanAmtSchLst() {
        return reqPapKanAmtSchLst;
    }

    /**
     * @param p REQ_PAP_KAN_AMT_SCH_LST
     */
    public void setReqPapKanAmtSchLst(final String p) {
        this.reqPapKanAmtSchLst = p;
    }

    /** REQ_PAP_KAN_AMT_ACT_FST */
    @jakarta.validation.constraints.Size(max = 4)
    private String reqPapKanAmtActFst;

    /**
     * @return REQ_PAP_KAN_AMT_ACT_FST
     */
    public String getReqPapKanAmtActFst() {
        return reqPapKanAmtActFst;
    }

    /**
     * @param p REQ_PAP_KAN_AMT_ACT_FST
     */
    public void setReqPapKanAmtActFst(final String p) {
        this.reqPapKanAmtActFst = p;
    }

    /** REQ_PAP_KAN_AMT_ACT_MID */
    @jakarta.validation.constraints.Size(max = 4)
    private String reqPapKanAmtActMid;

    /**
     * @return REQ_PAP_KAN_AMT_ACT_MID
     */
    public String getReqPapKanAmtActMid() {
        return reqPapKanAmtActMid;
    }

    /**
     * @param p REQ_PAP_KAN_AMT_ACT_MID
     */
    public void setReqPapKanAmtActMid(final String p) {
        this.reqPapKanAmtActMid = p;
    }

    /** REQ_PAP_KAN_AMT_ACT_LST */
    @jakarta.validation.constraints.Size(max = 4)
    private String reqPapKanAmtActLst;

    /**
     * @return REQ_PAP_KAN_AMT_ACT_LST
     */
    public String getReqPapKanAmtActLst() {
        return reqPapKanAmtActLst;
    }

    /**
     * @param p REQ_PAP_KAN_AMT_ACT_LST
     */
    public void setReqPapKanAmtActLst(final String p) {
        this.reqPapKanAmtActLst = p;
    }

    /** REQ_PAP_KAN_AMT_ACT */
    @jakarta.validation.constraints.Size(max = 4)
    private String reqPapKanAmtAct;

    /**
     * @return REQ_PAP_KAN_AMT_ACT
     */
    public String getReqPapKanAmtAct() {
        return reqPapKanAmtAct;
    }

    /**
     * @param p REQ_PAP_KAN_AMT_ACT
     */
    public void setReqPapKanAmtAct(final String p) {
        this.reqPapKanAmtAct = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
