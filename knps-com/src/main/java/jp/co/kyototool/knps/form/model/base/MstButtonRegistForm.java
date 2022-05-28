package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_BUTTON登録フォーム
 *
 * @author emarfkrow
 */
public class MstButtonRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstButtonRegistForm.class);

    /** GAMEN_ID */
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

    /** BTN_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 80)
    private String btnId;

    /**
     * @return BTN_ID
     */
    public String getBtnId() {
        return btnId;
    }

    /**
     * @param p BTN_ID
     */
    public void setBtnId(final String p) {
        this.btnId = p;
    }

    /** BTN_NAME */
    @jakarta.validation.constraints.Size(max = 160)
    private String btnName;

    /**
     * @return BTN_NAME
     */
    public String getBtnName() {
        return btnName;
    }

    /**
     * @param p BTN_NAME
     */
    public void setBtnName(final String p) {
        this.btnName = p;
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
