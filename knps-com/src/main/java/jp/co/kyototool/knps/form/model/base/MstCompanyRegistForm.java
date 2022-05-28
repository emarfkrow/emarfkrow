package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_COMPANY登録フォーム
 *
 * @author emarfkrow
 */
public class MstCompanyRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCompanyRegistForm.class);

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

    /** COMPANY_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String companyName;

    /**
     * @return COMPANY_NAME
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param p COMPANY_NAME
     */
    public void setCompanyName(final String p) {
        this.companyName = p;
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
