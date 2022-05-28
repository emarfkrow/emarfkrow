package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_WS登録フォーム
 *
 * @author emarfkrow
 */
public class MstWsRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstWsRegistForm.class);

    /** WS_CODE */
    @jakarta.validation.constraints.Size(max = 4)
    private String wsCode;

    /**
     * @return WS_CODE
     */
    public String getWsCode() {
        return wsCode;
    }

    /**
     * @param p WS_CODE
     */
    public void setWsCode(final String p) {
        this.wsCode = p;
    }

    /** WS_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String wsName;

    /**
     * @return WS_NAME
     */
    public String getWsName() {
        return wsName;
    }

    /**
     * @param p WS_NAME
     */
    public void setWsName(final String p) {
        this.wsName = p;
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

    /** HUM_NORM_ABILITY */
    @jakarta.validation.constraints.Size(max = 7)
    private String humNormAbility;

    /**
     * @return HUM_NORM_ABILITY
     */
    public String getHumNormAbility() {
        return humNormAbility;
    }

    /**
     * @param p HUM_NORM_ABILITY
     */
    public void setHumNormAbility(final String p) {
        this.humNormAbility = p;
    }

    /** HUM_MAX_ABILITY */
    @jakarta.validation.constraints.Size(max = 7)
    private String humMaxAbility;

    /**
     * @return HUM_MAX_ABILITY
     */
    public String getHumMaxAbility() {
        return humMaxAbility;
    }

    /**
     * @param p HUM_MAX_ABILITY
     */
    public void setHumMaxAbility(final String p) {
        this.humMaxAbility = p;
    }

    /** NORM_MEMBER */
    @jakarta.validation.constraints.Size(max = 7)
    private String normMember;

    /**
     * @return NORM_MEMBER
     */
    public String getNormMember() {
        return normMember;
    }

    /**
     * @param p NORM_MEMBER
     */
    public void setNormMember(final String p) {
        this.normMember = p;
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
