package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_OPE_FORM登録フォーム
 *
 * @author emarfkrow
 */
public class MstOpeFormRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstOpeFormRegistForm.class);

    /** PATTERN_NO */
    @jakarta.validation.constraints.Size(max = 2)
    private String patternNo;

    /**
     * @return PATTERN_NO
     */
    public String getPatternNo() {
        return patternNo;
    }

    /**
     * @param p PATTERN_NO
     */
    public void setPatternNo(final String p) {
        this.patternNo = p;
    }

    /** F_CHOKU_START */
    @jakarta.validation.constraints.Size(max = 4)
    private String fChokuStart;

    /**
     * @return F_CHOKU_START
     */
    public String getFChokuStart() {
        return fChokuStart;
    }

    /**
     * @param p F_CHOKU_START
     */
    public void setFChokuStart(final String p) {
        this.fChokuStart = p;
    }

    /** F_CHOKU_END */
    @jakarta.validation.constraints.Size(max = 4)
    private String fChokuEnd;

    /**
     * @return F_CHOKU_END
     */
    public String getFChokuEnd() {
        return fChokuEnd;
    }

    /**
     * @param p F_CHOKU_END
     */
    public void setFChokuEnd(final String p) {
        this.fChokuEnd = p;
    }

    /** F_CHOKU_START_DED */
    @jakarta.validation.constraints.Size(max = 4)
    private String fChokuStartDed;

    /**
     * @return F_CHOKU_START_DED
     */
    public String getFChokuStartDed() {
        return fChokuStartDed;
    }

    /**
     * @param p F_CHOKU_START_DED
     */
    public void setFChokuStartDed(final String p) {
        this.fChokuStartDed = p;
    }

    /** F_CHOKU_END_DED */
    @jakarta.validation.constraints.Size(max = 4)
    private String fChokuEndDed;

    /**
     * @return F_CHOKU_END_DED
     */
    public String getFChokuEndDed() {
        return fChokuEndDed;
    }

    /**
     * @param p F_CHOKU_END_DED
     */
    public void setFChokuEndDed(final String p) {
        this.fChokuEndDed = p;
    }

    /** S_CHOKU_START_DED */
    @jakarta.validation.constraints.Size(max = 4)
    private String sChokuStartDed;

    /**
     * @return S_CHOKU_START_DED
     */
    public String getSChokuStartDed() {
        return sChokuStartDed;
    }

    /**
     * @param p S_CHOKU_START_DED
     */
    public void setSChokuStartDed(final String p) {
        this.sChokuStartDed = p;
    }

    /** S_CHOKU_END_DED */
    @jakarta.validation.constraints.Size(max = 4)
    private String sChokuEndDed;

    /**
     * @return S_CHOKU_END_DED
     */
    public String getSChokuEndDed() {
        return sChokuEndDed;
    }

    /**
     * @param p S_CHOKU_END_DED
     */
    public void setSChokuEndDed(final String p) {
        this.sChokuEndDed = p;
    }

    /** T_CHOKU_START_DED */
    @jakarta.validation.constraints.Size(max = 4)
    private String tChokuStartDed;

    /**
     * @return T_CHOKU_START_DED
     */
    public String getTChokuStartDed() {
        return tChokuStartDed;
    }

    /**
     * @param p T_CHOKU_START_DED
     */
    public void setTChokuStartDed(final String p) {
        this.tChokuStartDed = p;
    }

    /** T_CHOKU_END_DED */
    @jakarta.validation.constraints.Size(max = 4)
    private String tChokuEndDed;

    /**
     * @return T_CHOKU_END_DED
     */
    public String getTChokuEndDed() {
        return tChokuEndDed;
    }

    /**
     * @param p T_CHOKU_END_DED
     */
    public void setTChokuEndDed(final String p) {
        this.tChokuEndDed = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
