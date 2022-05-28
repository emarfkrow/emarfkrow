package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_LOCATION登録フォーム
 *
 * @author emarfkrow
 */
public class MstLocationRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstLocationRegistForm.class);

    /** LOCATION_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * @param p LOCATION_CODE
     */
    public void setLocationCode(final String p) {
        this.locationCode = p;
    }

    /** LOCATION_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String locationName;

    /**
     * @return LOCATION_NAME
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * @param p LOCATION_NAME
     */
    public void setLocationName(final String p) {
        this.locationName = p;
    }

    /** LOC_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String locKbn;

    /**
     * @return LOC_KBN
     */
    public String getLocKbn() {
        return locKbn;
    }

    /**
     * @param p LOC_KBN
     */
    public void setLocKbn(final String p) {
        this.locKbn = p;
    }

    /** LOC_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String locStatus;

    /**
     * @return LOC_STATUS
     */
    public String getLocStatus() {
        return locStatus;
    }

    /**
     * @param p LOC_STATUS
     */
    public void setLocStatus(final String p) {
        this.locStatus = p;
    }

    /** LOC_ENABLE */
    @jakarta.validation.constraints.Size(max = 1)
    private String locEnable;

    /**
     * @return LOC_ENABLE
     */
    public String getLocEnable() {
        return locEnable;
    }

    /**
     * @param p LOC_ENABLE
     */
    public void setLocEnable(final String p) {
        this.locEnable = p;
    }

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

    /** AREA_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String areaCd;

    /**
     * @return AREA_CD
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * @param p AREA_CD
     */
    public void setAreaCd(final String p) {
        this.areaCd = p;
    }

    /** STORE_MAN_ID */
    @jakarta.validation.constraints.Size(max = 10)
    private String storeManId;

    /**
     * @return STORE_MAN_ID
     */
    public String getStoreManId() {
        return storeManId;
    }

    /**
     * @param p STORE_MAN_ID
     */
    public void setStoreManId(final String p) {
        this.storeManId = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
