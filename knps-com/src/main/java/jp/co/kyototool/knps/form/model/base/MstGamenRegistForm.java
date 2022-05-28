package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_GAMEN登録フォーム
 *
 * @author emarfkrow
 */
public class MstGamenRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstGamenRegistForm.class);

    /** BUSINESS_ID */
    @jakarta.validation.constraints.Size(max = 1)
    private String businessId;

    /**
     * @return BUSINESS_ID
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * @param p BUSINESS_ID
     */
    public void setBusinessId(final String p) {
        this.businessId = p;
    }

    /** GAMEN_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 80)
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

    /** GAMEN_NAME */
    @jakarta.validation.constraints.Size(max = 160)
    private String gamenName;

    /**
     * @return GAMEN_NAME
     */
    public String getGamenName() {
        return gamenName;
    }

    /**
     * @param p GAMEN_NAME
     */
    public void setGamenName(final String p) {
        this.gamenName = p;
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

    /** SYS_REQ_LOCK_STATUS */
    @jakarta.validation.Valid
    private SysReqLockStatusRegistForm sysReqLockStatusRegistForm;

    /**
     * @return SysReqLockStatusRegistForm
     */
    public SysReqLockStatusRegistForm getSysReqLockStatusRegistForm() {
        return sysReqLockStatusRegistForm;
    }

    /**
     * @param p
     */
    public void setSysReqLockStatusRegistForm(final SysReqLockStatusRegistForm p) {
        this.sysReqLockStatusRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
