package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_MOD_ACT_HED登録フォーム
 *
 * @author emarfkrow
 */
public class MfgModActHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgModActHedRegistForm.class);

    /** MOD_ACT_NO */
    @jakarta.validation.constraints.Size(max = 12)
    private String modActNo;

    /**
     * @return MOD_ACT_NO
     */
    public String getModActNo() {
        return modActNo;
    }

    /**
     * @param p MOD_ACT_NO
     */
    public void setModActNo(final String p) {
        this.modActNo = p;
    }

    /** WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return wcCode;
    }

    /**
     * @param p WC_CODE
     */
    public void setWcCode(final String p) {
        this.wcCode = p;
    }

    /** MOD_KIND */
    @jakarta.validation.constraints.Size(max = 1)
    private String modKind;

    /**
     * @return MOD_KIND
     */
    public String getModKind() {
        return modKind;
    }

    /**
     * @param p MOD_KIND
     */
    public void setModKind(final String p) {
        this.modKind = p;
    }

    /** AMOUNT_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String amountTime;

    /**
     * @return AMOUNT_TIME
     */
    public String getAmountTime() {
        return amountTime;
    }

    /**
     * @param p AMOUNT_TIME
     */
    public void setAmountTime(final String p) {
        this.amountTime = p;
    }

    /** ACT_MOD_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String actModTime;

    /**
     * @return ACT_MOD_TIME
     */
    public String getActModTime() {
        return actModTime;
    }

    /**
     * @param p ACT_MOD_TIME
     */
    public void setActModTime(final String p) {
        this.actModTime = p;
    }

    /** EXP_TIME */
    @jakarta.validation.constraints.Size(max = 6)
    private String expTime;

    /**
     * @return EXP_TIME
     */
    public String getExpTime() {
        return expTime;
    }

    /**
     * @param p EXP_TIME
     */
    public void setExpTime(final String p) {
        this.expTime = p;
    }

    /** MOD_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String modCounts;

    /**
     * @return MOD_COUNTS
     */
    public String getModCounts() {
        return modCounts;
    }

    /**
     * @param p MOD_COUNTS
     */
    public void setModCounts(final String p) {
        this.modCounts = p;
    }

    /** ACT_MOD_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String actModCounts;

    /**
     * @return ACT_MOD_COUNTS
     */
    public String getActModCounts() {
        return actModCounts;
    }

    /**
     * @param p ACT_MOD_COUNTS
     */
    public void setActModCounts(final String p) {
        this.actModCounts = p;
    }

    /** MEMO */
    @jakarta.validation.constraints.Size(max = 60)
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param p MEMO
     */
    public void setMemo(final String p) {
        this.memo = p;
    }

    /** MOD_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String modStatus;

    /**
     * @return MOD_STATUS
     */
    public String getModStatus() {
        return modStatus;
    }

    /**
     * @param p MOD_STATUS
     */
    public void setModStatus(final String p) {
        this.modStatus = p;
    }

    /** EXP_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String expFlag;

    /**
     * @return EXP_FLAG
     */
    public String getExpFlag() {
        return expFlag;
    }

    /**
     * @param p EXP_FLAG
     */
    public void setExpFlag(final String p) {
        this.expFlag = p;
    }

    /** BEG_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String begDate;

    /**
     * @return BEG_DATE
     */
    public String getBegDate() {
        return begDate;
    }

    /**
     * @param p BEG_DATE
     */
    public void setBegDate(final String p) {
        this.begDate = p;
    }

    /** END_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String endDate;

    /**
     * @return END_DATE
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param p END_DATE
     */
    public void setEndDate(final String p) {
        this.endDate = p;
    }

    /** MFG_MOD_ACT_DET */
    @jakarta.validation.Valid
    private List<MfgModActDetRegistForm> mfgModActDetGrid;

    /**
     * @return MFG_MOD_ACT_DET
     */
    public List<MfgModActDetRegistForm> getMfgModActDetGrid() {
        return mfgModActDetGrid;
    }

    /**
     * @param p
     */
    public void setMfgModActDetGrid(final List<MfgModActDetRegistForm> p) {
        this.mfgModActDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
