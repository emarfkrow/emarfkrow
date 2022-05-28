package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_PRINT_WAREHOUSINGSLIP登録フォーム
 *
 * @author emarfkrow
 */
public class InvPrintWarehousingslipRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvPrintWarehousingslipRegistForm.class);

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

    /** HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** KANBAN_ACC_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String kanbanAccCounts;

    /**
     * @return KANBAN_ACC_COUNTS
     */
    public String getKanbanAccCounts() {
        return kanbanAccCounts;
    }

    /**
     * @param p KANBAN_ACC_COUNTS
     */
    public void setKanbanAccCounts(final String p) {
        this.kanbanAccCounts = p;
    }

    /** KANBAN_COUNTS */
    @jakarta.validation.constraints.Size(max = 3)
    private String kanbanCounts;

    /**
     * @return KANBAN_COUNTS
     */
    public String getKanbanCounts() {
        return kanbanCounts;
    }

    /**
     * @param p KANBAN_COUNTS
     */
    public void setKanbanCounts(final String p) {
        this.kanbanCounts = p;
    }

    /** HOST_N_KBN */
    @jakarta.validation.constraints.Size(max = 2)
    private String hostNKbn;

    /**
     * @return HOST_N_KBN
     */
    public String getHostNKbn() {
        return hostNKbn;
    }

    /**
     * @param p HOST_N_KBN
     */
    public void setHostNKbn(final String p) {
        this.hostNKbn = p;
    }

    /** PRINT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String printKbn;

    /**
     * @return PRINT_KBN
     */
    public String getPrintKbn() {
        return printKbn;
    }

    /**
     * @param p PRINT_KBN
     */
    public void setPrintKbn(final String p) {
        this.printKbn = p;
    }

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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
