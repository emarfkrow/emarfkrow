package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_EMP登録フォーム
 *
 * @author emarfkrow
 */
public class MstEmpRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstEmpRegistForm.class);

    /** EMP_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String empCode;

    /**
     * @return EMP_CODE
     */
    public String getEmpCode() {
        return empCode;
    }

    /**
     * @param p EMP_CODE
     */
    public void setEmpCode(final String p) {
        this.empCode = p;
    }

    /** EMP_NAME */
    @jakarta.validation.constraints.Size(max = 30)
    private String empName;

    /**
     * @return EMP_NAME
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param p EMP_NAME
     */
    public void setEmpName(final String p) {
        this.empName = p;
    }

    /** POSITION */
    @jakarta.validation.constraints.Size(max = 1)
    private String position;

    /**
     * @return POSITION
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param p POSITION
     */
    public void setPosition(final String p) {
        this.position = p;
    }

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

    /** PASSWORD */
    @jakarta.validation.constraints.Size(max = 10)
    private String password;

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param p PASSWORD
     */
    public void setPassword(final String p) {
        this.password = p;
    }

    /** TEL_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String telNo;

    /**
     * @return TEL_NO
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param p TEL_NO
     */
    public void setTelNo(final String p) {
        this.telNo = p;
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

    /** MAIL_ADDRESS */
    @jakarta.validation.constraints.Size(max = 128)
    private String mailAddress;

    /**
     * @return MAIL_ADDRESS
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * @param p MAIL_ADDRESS
     */
    public void setMailAddress(final String p) {
        this.mailAddress = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
