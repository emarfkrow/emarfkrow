package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUBINV登録フォーム
 *
 * @author emarfkrow
 */
public class MstSubinvRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSubinvRegistForm.class);

    /** SUB_INV_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
    public String getSubInvCode() {
        return subInvCode;
    }

    /**
     * @param p SUB_INV_CODE
     */
    public void setSubInvCode(final String p) {
        this.subInvCode = p;
    }

    /** SUB_INV_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String subInvName;

    /**
     * @return SUB_INV_NAME
     */
    public String getSubInvName() {
        return subInvName;
    }

    /**
     * @param p SUB_INV_NAME
     */
    public void setSubInvName(final String p) {
        this.subInvName = p;
    }

    /** MANAGE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String manageKbn;

    /**
     * @return MANAGE_KBN
     */
    public String getManageKbn() {
        return manageKbn;
    }

    /**
     * @param p MANAGE_KBN
     */
    public void setManageKbn(final String p) {
        this.manageKbn = p;
    }

    /** IN_OUT_KBN */
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

    /** SUP_CODE */
    @jakarta.validation.constraints.Size(max = 6)
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return supCode;
    }

    /**
     * @param p SUP_CODE
     */
    public void setSupCode(final String p) {
        this.supCode = p;
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
