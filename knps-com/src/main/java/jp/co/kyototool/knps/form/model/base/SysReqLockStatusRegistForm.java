package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * SYS_REQ_LOCK_STATUS登録フォーム
 *
 * @author emarfkrow
 */
public class SysReqLockStatusRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(SysReqLockStatusRegistForm.class);

    /** GAMEN_ID */
    @jakarta.validation.constraints.Size(max = 30)
    private String gamenId;

    /**
     * @return GAMEN_ID
     */
    public String getGamenId() {
        return gamenId;
    }

    /**
     * @param p GAMEN_ID
     */
    public void setGamenId(final String p) {
        this.gamenId = p;
    }

    /** USER_ID */
    @jakarta.validation.constraints.Size(max = 10)
    private String userId;

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param p USER_ID
     */
    public void setUserId(final String p) {
        this.userId = p;
    }

    /** LOCK_DATE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 7)
    private String lockDate;

    /**
     * @return LOCK_DATE
     */
    public String getLockDate() {
        return lockDate;
    }

    /**
     * @param p LOCK_DATE
     */
    public void setLockDate(final String p) {
        this.lockDate = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
