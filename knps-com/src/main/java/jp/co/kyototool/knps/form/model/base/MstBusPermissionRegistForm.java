package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_BUS_PERMISSION登録フォーム
 *
 * @author emarfkrow
 */
public class MstBusPermissionRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstBusPermissionRegistForm.class);

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

    /** BUSINESS_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String businessNo;

    /**
     * @return BUSINESS_NO
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * @param p BUSINESS_NO
     */
    public void setBusinessNo(final String p) {
        this.businessNo = p;
    }

    /** PERMISSION */
    @jakarta.validation.constraints.NotBlank
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

    /** MST_GAMEN_PERMISSION */
    @jakarta.validation.Valid
    private List<MstGamenPermissionRegistForm> mstGamenPermissionGrid;

    /**
     * @return MST_GAMEN_PERMISSION
     */
    public List<MstGamenPermissionRegistForm> getMstGamenPermissionGrid() {
        return mstGamenPermissionGrid;
    }

    /**
     * @param p
     */
    public void setMstGamenPermissionGrid(final List<MstGamenPermissionRegistForm> p) {
        this.mstGamenPermissionGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
