package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_GROUP登録フォーム
 *
 * @author emarfkrow
 */
public class MstGroupRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstGroupRegistForm.class);

    /** GROUP_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String groupCode;

    /**
     * @return GROUP_CODE
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * @param p GROUP_CODE
     */
    public void setGroupCode(final String p) {
        this.groupCode = p;
    }

    /** GROUP_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String groupName;

    /**
     * @return GROUP_NAME
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param p GROUP_NAME
     */
    public void setGroupName(final String p) {
        this.groupName = p;
    }

    /** ADMIN_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String adminCode;

    /**
     * @return ADMIN_CODE
     */
    public String getAdminCode() {
        return adminCode;
    }

    /**
     * @param p ADMIN_CODE
     */
    public void setAdminCode(final String p) {
        this.adminCode = p;
    }

    /** DIVISION_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String divisionCode;

    /**
     * @return DIVISION_CODE
     */
    public String getDivisionCode() {
        return divisionCode;
    }

    /**
     * @param p DIVISION_CODE
     */
    public void setDivisionCode(final String p) {
        this.divisionCode = p;
    }

    /** INDIVIDUAL_COUNTS */
    @jakarta.validation.constraints.Size(max = 7)
    private String individualCounts;

    /**
     * @return INDIVIDUAL_COUNTS
     */
    public String getIndividualCounts() {
        return individualCounts;
    }

    /**
     * @param p INDIVIDUAL_COUNTS
     */
    public void setIndividualCounts(final String p) {
        this.individualCounts = p;
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
