package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUP_EMP登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupEmpRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupEmpRegistForm.class);

    /** SUPPLIER_OPE_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String supplierOpeCode;

    /**
     * @return SUPPLIER_OPE_CODE
     */
    public String getSupplierOpeCode() {
        return supplierOpeCode;
    }

    /**
     * @param p SUPPLIER_OPE_CODE
     */
    public void setSupplierOpeCode(final String p) {
        this.supplierOpeCode = p;
    }

    /** SUPPLIER_OPE_NAME */
    @jakarta.validation.constraints.Size(max = 30)
    private String supplierOpeName;

    /**
     * @return SUPPLIER_OPE_NAME
     */
    public String getSupplierOpeName() {
        return supplierOpeName;
    }

    /**
     * @param p SUPPLIER_OPE_NAME
     */
    public void setSupplierOpeName(final String p) {
        this.supplierOpeName = p;
    }

    /** EMP_CODE */
    @jakarta.validation.constraints.NotBlank
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
