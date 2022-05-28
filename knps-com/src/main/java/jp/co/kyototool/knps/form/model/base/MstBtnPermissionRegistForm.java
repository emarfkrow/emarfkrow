package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_BTN_PERMISSION登録フォーム
 *
 * @author emarfkrow
 */
public class MstBtnPermissionRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstBtnPermissionRegistForm.class);

    /** COMP_CODE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String compCode;

    /**
     * @return COMP_CODE
     */
    public String getCompCode() {
        return compCode;
    }

    /**
     * @param p COMP_CODE
     */
    public void setCompCode(final String p) {
        this.compCode = p;
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

    /** BUTTON_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 80)
    private String buttonId;

    /**
     * @return BUTTON_ID
     */
    public String getButtonId() {
        return buttonId;
    }

    /**
     * @param p BUTTON_ID
     */
    public void setButtonId(final String p) {
        this.buttonId = p;
    }

    /** PERMISSION */
    @jakarta.validation.constraints.Size(max = 1)
    private String permission;

    /**
     * @return PERMISSION
     */
    public String getPermission() {
        return permission;
    }

    /**
     * @param p PERMISSION
     */
    public void setPermission(final String p) {
        this.permission = p;
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
