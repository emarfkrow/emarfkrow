package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ROUTING_DEF_BK登録フォーム
 *
 * @author emarfkrow
 */
public class MstRoutingDefBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstRoutingDefBkRegistForm.class);

    /** YY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return YY
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p YY
     */
    public void setYy(final String p) {
        this.yy = p;
    }

    /** MAN_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    public String getManHinban() {
        return manHinban;
    }

    /**
     * @param p MAN_HINBAN
     */
    public void setManHinban(final String p) {
        this.manHinban = p;
    }

    /** ROUTING_GROUP */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    public String getRoutingGroup() {
        return routingGroup;
    }

    /**
     * @param p ROUTING_GROUP
     */
    public void setRoutingGroup(final String p) {
        this.routingGroup = p;
    }

    /** PERMISSION_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String permissionFlag;

    /**
     * @return PERMISSION_FLAG
     */
    public String getPermissionFlag() {
        return permissionFlag;
    }

    /**
     * @param p PERMISSION_FLAG
     */
    public void setPermissionFlag(final String p) {
        this.permissionFlag = p;
    }

    /** USABLE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String usableFlag;

    /**
     * @return USABLE_FLAG
     */
    public String getUsableFlag() {
        return usableFlag;
    }

    /**
     * @param p USABLE_FLAG
     */
    public void setUsableFlag(final String p) {
        this.usableFlag = p;
    }

    /** MAX_ROUTING */
    @jakarta.validation.constraints.Size(max = 2)
    private String maxRouting;

    /**
     * @return MAX_ROUTING
     */
    public String getMaxRouting() {
        return maxRouting;
    }

    /**
     * @param p MAX_ROUTING
     */
    public void setMaxRouting(final String p) {
        this.maxRouting = p;
    }

    /** COPY_SOURCE_GROUP */
    @jakarta.validation.constraints.Size(max = 2)
    private String copySourceGroup;

    /**
     * @return COPY_SOURCE_GROUP
     */
    public String getCopySourceGroup() {
        return copySourceGroup;
    }

    /**
     * @param p COPY_SOURCE_GROUP
     */
    public void setCopySourceGroup(final String p) {
        this.copySourceGroup = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
