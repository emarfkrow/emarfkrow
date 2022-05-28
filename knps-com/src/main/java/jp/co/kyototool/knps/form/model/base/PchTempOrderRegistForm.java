package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_TEMP_ORDER登録フォーム
 *
 * @author emarfkrow
 */
public class PchTempOrderRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchTempOrderRegistForm.class);

    /** TEMP_ORDER_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String tempOrderNo;

    /**
     * @return TEMP_ORDER_NO
     */
    public String getTempOrderNo() {
        return tempOrderNo;
    }

    /**
     * @param p TEMP_ORDER_NO
     */
    public void setTempOrderNo(final String p) {
        this.tempOrderNo = p;
    }

    /** IRAI_DT */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String iraiDt;

    /**
     * @return IRAI_DT
     */
    public String getIraiDt() {
        return iraiDt;
    }

    /**
     * @param p IRAI_DT
     */
    public void setIraiDt(final String p) {
        this.iraiDt = p;
    }

    /** IRAI_EMP_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String iraiEmpCode;

    /**
     * @return IRAI_EMP_CODE
     */
    public String getIraiEmpCode() {
        return iraiEmpCode;
    }

    /**
     * @param p IRAI_EMP_CODE
     */
    public void setIraiEmpCode(final String p) {
        this.iraiEmpCode = p;
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

    /** TEMP_SUP_CODE */
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

    /** MEMO */
    @jakarta.validation.constraints.Size(max = 500)
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param p MEMO
     */
    public void setMemo(final String p) {
        this.memo = p;
    }

    /** PAY_IRAI_DT */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String payIraiDt;

    /**
     * @return PAY_IRAI_DT
     */
    public String getPayIraiDt() {
        return payIraiDt;
    }

    /**
     * @param p PAY_IRAI_DT
     */
    public void setPayIraiDt(final String p) {
        this.payIraiDt = p;
    }

    /** PAY_IRAI_EMP_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String payIraiEmpCode;

    /**
     * @return PAY_IRAI_EMP_CODE
     */
    public String getPayIraiEmpCode() {
        return payIraiEmpCode;
    }

    /**
     * @param p PAY_IRAI_EMP_CODE
     */
    public void setPayIraiEmpCode(final String p) {
        this.payIraiEmpCode = p;
    }

    /** PCH_TEMP_ORDER_DET */
    @jakarta.validation.Valid
    private List<PchTempOrderDetRegistForm> pchTempOrderDetGrid;

    /**
     * @return PCH_TEMP_ORDER_DET
     */
    public List<PchTempOrderDetRegistForm> getPchTempOrderDetGrid() {
        return pchTempOrderDetGrid;
    }

    /**
     * @param p
     */
    public void setPchTempOrderDetGrid(final List<PchTempOrderDetRegistForm> p) {
        this.pchTempOrderDetGrid = p;
    }

    /** PCH_TEMP_ORDER_EST_FILE */
    @jakarta.validation.Valid
    private List<PchTempOrderEstFileRegistForm> pchTempOrderEstFileGrid;

    /**
     * @return PCH_TEMP_ORDER_EST_FILE
     */
    public List<PchTempOrderEstFileRegistForm> getPchTempOrderEstFileGrid() {
        return pchTempOrderEstFileGrid;
    }

    /**
     * @param p
     */
    public void setPchTempOrderEstFileGrid(final List<PchTempOrderEstFileRegistForm> p) {
        this.pchTempOrderEstFileGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
