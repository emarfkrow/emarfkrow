package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * SYS_REQ_STATUS登録フォーム
 *
 * @author emarfkrow
 */
public class SysReqStatusRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(SysReqStatusRegistForm.class);

    /** REQ_ID */
    @jakarta.validation.constraints.Size(max = 11)
    private String reqId;

    /**
     * @return REQ_ID
     */
    public String getReqId() {
        return reqId;
    }

    /**
     * @param p REQ_ID
     */
    public void setReqId(final String p) {
        this.reqId = p;
    }

    /** REQ_PRG_NAME */
    @jakarta.validation.constraints.Size(max = 40)
    private String reqPrgName;

    /**
     * @return REQ_PRG_NAME
     */
    public String getReqPrgName() {
        return reqPrgName;
    }

    /**
     * @param p REQ_PRG_NAME
     */
    public void setReqPrgName(final String p) {
        this.reqPrgName = p;
    }

    /** REQ_EMP_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String reqEmpCode;

    /**
     * @return REQ_EMP_CODE
     */
    public String getReqEmpCode() {
        return reqEmpCode;
    }

    /**
     * @param p REQ_EMP_CODE
     */
    public void setReqEmpCode(final String p) {
        this.reqEmpCode = p;
    }

    /** REQ_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String reqDate;

    /**
     * @return REQ_DATE
     */
    public String getReqDate() {
        return reqDate;
    }

    /**
     * @param p REQ_DATE
     */
    public void setReqDate(final String p) {
        this.reqDate = p;
    }

    /** REQ_EXEC_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String reqExecDate;

    /**
     * @return REQ_EXEC_DATE
     */
    public String getReqExecDate() {
        return reqExecDate;
    }

    /**
     * @param p REQ_EXEC_DATE
     */
    public void setReqExecDate(final String p) {
        this.reqExecDate = p;
    }

    /** REQ_COMP_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String reqCompDate;

    /**
     * @return REQ_COMP_DATE
     */
    public String getReqCompDate() {
        return reqCompDate;
    }

    /**
     * @param p REQ_COMP_DATE
     */
    public void setReqCompDate(final String p) {
        this.reqCompDate = p;
    }

    /** EXEC_PHASE */
    @jakarta.validation.constraints.Size(max = 1)
    private String execPhase;

    /**
     * @return EXEC_PHASE
     */
    public String getExecPhase() {
        return execPhase;
    }

    /**
     * @param p EXEC_PHASE
     */
    public void setExecPhase(final String p) {
        this.execPhase = p;
    }

    /** EXEC_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String execStatus;

    /**
     * @return EXEC_STATUS
     */
    public String getExecStatus() {
        return execStatus;
    }

    /**
     * @param p EXEC_STATUS
     */
    public void setExecStatus(final String p) {
        this.execStatus = p;
    }

    /** PARAMS */
    @jakarta.validation.constraints.Size(max = 200)
    private String params;

    /**
     * @return PARAMS
     */
    public String getParams() {
        return params;
    }

    /**
     * @param p PARAMS
     */
    public void setParams(final String p) {
        this.params = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
