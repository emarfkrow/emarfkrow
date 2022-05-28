package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_STATUS登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanStatusRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanStatusRegistForm.class);

    /** KANBAN_ID */
    @jakarta.validation.constraints.Size(max = 9)
    private String kanbanId;

    /**
     * @return KANBAN_ID
     */
    public String getKanbanId() {
        return kanbanId;
    }

    /**
     * @param p KANBAN_ID
     */
    public void setKanbanId(final String p) {
        this.kanbanId = p;
    }

    /** SERIAL_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 4)
    private String serialNo;

    /**
     * @return SERIAL_NO
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param p SERIAL_NO
     */
    public void setSerialNo(final String p) {
        this.serialNo = p;
    }

    /** KANBAN_PRINT_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String kanbanPrintStatus;

    /**
     * @return KANBAN_PRINT_STATUS
     */
    public String getKanbanPrintStatus() {
        return kanbanPrintStatus;
    }

    /**
     * @param p KANBAN_PRINT_STATUS
     */
    public void setKanbanPrintStatus(final String p) {
        this.kanbanPrintStatus = p;
    }

    /** KANBAN_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String kanbanStatus;

    /**
     * @return KANBAN_STATUS
     */
    public String getKanbanStatus() {
        return kanbanStatus;
    }

    /**
     * @param p KANBAN_STATUS
     */
    public void setKanbanStatus(final String p) {
        this.kanbanStatus = p;
    }

    /** RE_ISSUE_COUNTS */
    @jakarta.validation.constraints.Size(max = 2)
    private String reIssueCounts;

    /**
     * @return RE_ISSUE_COUNTS
     */
    public String getReIssueCounts() {
        return reIssueCounts;
    }

    /**
     * @param p RE_ISSUE_COUNTS
     */
    public void setReIssueCounts(final String p) {
        this.reIssueCounts = p;
    }

    /** PRD_KANBAN_MENTE_HISTORY */
    @jakarta.validation.Valid
    private PrdKanbanMenteHistoryRegistForm prdKanbanMenteHistoryRegistForm;

    /**
     * @return PrdKanbanMenteHistoryRegistForm
     */
    public PrdKanbanMenteHistoryRegistForm getPrdKanbanMenteHistoryRegistForm() {
        return prdKanbanMenteHistoryRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdKanbanMenteHistoryRegistForm(final PrdKanbanMenteHistoryRegistForm p) {
        this.prdKanbanMenteHistoryRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
