package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_TEAM登録フォーム
 *
 * @author emarfkrow
 */
public class MstTeamRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstTeamRegistForm.class);

    /** TEAM_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String teamCode;

    /**
     * @return TEAM_CODE
     */
    public String getTeamCode() {
        return teamCode;
    }

    /**
     * @param p TEAM_CODE
     */
    public void setTeamCode(final String p) {
        this.teamCode = p;
    }

    /** TEAM_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String teamName;

    /**
     * @return TEAM_NAME
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param p TEAM_NAME
     */
    public void setTeamName(final String p) {
        this.teamName = p;
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
