package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_REASON登録フォーム
 *
 * @author emarfkrow
 */
public class MstReasonRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstReasonRegistForm.class);

    /** REASON_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String reasonCode;

    /**
     * @return REASON_CODE
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * @param p REASON_CODE
     */
    public void setReasonCode(final String p) {
        this.reasonCode = p;
    }

    /** REASON_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String reasonName;

    /**
     * @return REASON_NAME
     */
    public String getReasonName() {
        return reasonName;
    }

    /**
     * @param p REASON_NAME
     */
    public void setReasonName(final String p) {
        this.reasonName = p;
    }

    /** REASON_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String reasonKbn;

    /**
     * @return REASON_KBN
     */
    public String getReasonKbn() {
        return reasonKbn;
    }

    /**
     * @param p REASON_KBN
     */
    public void setReasonKbn(final String p) {
        this.reasonKbn = p;
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
