package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_TEMP_SUPPLIER登録フォーム
 *
 * @author emarfkrow
 */
public class MstTempSupplierRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstTempSupplierRegistForm.class);

    /** TEMP_SUP_CODE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 6)
    private String tempSupCode;

    /**
     * @return TEMP_SUP_CODE
     */
    public String getTempSupCode() {
        return tempSupCode;
    }

    /**
     * @param p TEMP_SUP_CODE
     */
    public void setTempSupCode(final String p) {
        this.tempSupCode = p;
    }

    /** TEMP_SUP_NAME */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
    private String tempSupName;

    /**
     * @return TEMP_SUP_NAME
     */
    public String getTempSupName() {
        return tempSupName;
    }

    /**
     * @param p TEMP_SUP_NAME
     */
    public void setTempSupName(final String p) {
        this.tempSupName = p;
    }

    /** TEMP_SUP_STAFF_NAME */
    @jakarta.validation.constraints.Size(max = 30)
    private String tempSupStaffName;

    /**
     * @return TEMP_SUP_STAFF_NAME
     */
    public String getTempSupStaffName() {
        return tempSupStaffName;
    }

    /**
     * @param p TEMP_SUP_STAFF_NAME
     */
    public void setTempSupStaffName(final String p) {
        this.tempSupStaffName = p;
    }

    /** TEMP_SUP_TEL_NO */
    @jakarta.validation.constraints.Size(max = 15)
    private String tempSupTelNo;

    /**
     * @return TEMP_SUP_TEL_NO
     */
    public String getTempSupTelNo() {
        return tempSupTelNo;
    }

    /**
     * @param p TEMP_SUP_TEL_NO
     */
    public void setTempSupTelNo(final String p) {
        this.tempSupTelNo = p;
    }

    /** TEMP_SUP_FAX_NO */
    @jakarta.validation.constraints.Size(max = 15)
    private String tempSupFaxNo;

    /**
     * @return TEMP_SUP_FAX_NO
     */
    public String getTempSupFaxNo() {
        return tempSupFaxNo;
    }

    /**
     * @param p TEMP_SUP_FAX_NO
     */
    public void setTempSupFaxNo(final String p) {
        this.tempSupFaxNo = p;
    }

    /** TEMP_SUP_DIV_CODE */
    @jakarta.validation.constraints.Size(max = 1)
    private String tempSupDivCode;

    /**
     * @return TEMP_SUP_DIV_CODE
     */
    public String getTempSupDivCode() {
        return tempSupDivCode;
    }

    /**
     * @param p TEMP_SUP_DIV_CODE
     */
    public void setTempSupDivCode(final String p) {
        this.tempSupDivCode = p;
    }

    /** TEMP_KOZA_NO */
    @jakarta.validation.constraints.Size(max = 8)
    private String tempKozaNo;

    /**
     * @return TEMP_KOZA_NO
     */
    public String getTempKozaNo() {
        return tempKozaNo;
    }

    /**
     * @param p TEMP_KOZA_NO
     */
    public void setTempKozaNo(final String p) {
        this.tempKozaNo = p;
    }

    /** TEMP_KOZA_MEIGI */
    @jakarta.validation.constraints.Size(max = 30)
    private String tempKozaMeigi;

    /**
     * @return TEMP_KOZA_MEIGI
     */
    public String getTempKozaMeigi() {
        return tempKozaMeigi;
    }

    /**
     * @param p TEMP_KOZA_MEIGI
     */
    public void setTempKozaMeigi(final String p) {
        this.tempKozaMeigi = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
