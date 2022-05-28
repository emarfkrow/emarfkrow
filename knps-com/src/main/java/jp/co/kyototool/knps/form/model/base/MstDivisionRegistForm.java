package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_DIVISION登録フォーム
 *
 * @author emarfkrow
 */
public class MstDivisionRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstDivisionRegistForm.class);

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

    /** DIVISION_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String divisionName;

    /**
     * @return DIVISION_NAME
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * @param p DIVISION_NAME
     */
    public void setDivisionName(final String p) {
        this.divisionName = p;
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

    /** COMPANY_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String companyCode;

    /**
     * @return COMPANY_CODE
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * @param p COMPANY_CODE
     */
    public void setCompanyCode(final String p) {
        this.companyCode = p;
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
