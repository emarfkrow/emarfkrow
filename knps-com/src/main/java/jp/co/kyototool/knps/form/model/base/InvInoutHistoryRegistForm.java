package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_INOUT_HISTORY登録フォーム
 *
 * @author emarfkrow
 */
public class InvInoutHistoryRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvInoutHistoryRegistForm.class);

    /** ACTION_DATE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 7)
    private String actionDate;

    /**
     * @return ACTION_DATE
     */
    public String getActionDate() {
        return actionDate;
    }

    /**
     * @param p ACTION_DATE
     */
    public void setActionDate(final String p) {
        this.actionDate = p;
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

    /** IN_OUT_COUNTS */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 12)
    private String inOutCounts;

    /**
     * @return IN_OUT_COUNTS
     */
    public String getInOutCounts() {
        return inOutCounts;
    }

    /**
     * @param p IN_OUT_COUNTS
     */
    public void setInOutCounts(final String p) {
        this.inOutCounts = p;
    }

    /** IN_OUT_KBN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String inOutKbn;

    /**
     * @return IN_OUT_KBN
     */
    public String getInOutKbn() {
        return inOutKbn;
    }

    /**
     * @param p IN_OUT_KBN
     */
    public void setInOutKbn(final String p) {
        this.inOutKbn = p;
    }

    /** FROM_PAY */
    @jakarta.validation.constraints.Size(max = 10)
    private String fromPay;

    /**
     * @return FROM_PAY
     */
    public String getFromPay() {
        return fromPay;
    }

    /**
     * @param p FROM_PAY
     */
    public void setFromPay(final String p) {
        this.fromPay = p;
    }

    /** TO_PAY */
    @jakarta.validation.constraints.Size(max = 10)
    private String toPay;

    /**
     * @return TO_PAY
     */
    public String getToPay() {
        return toPay;
    }

    /**
     * @param p TO_PAY
     */
    public void setToPay(final String p) {
        this.toPay = p;
    }

    /** REQ_NAME */
    @jakarta.validation.constraints.Size(max = 16)
    private String reqName;

    /**
     * @return REQ_NAME
     */
    public String getReqName() {
        return reqName;
    }

    /**
     * @param p REQ_NAME
     */
    public void setReqName(final String p) {
        this.reqName = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
