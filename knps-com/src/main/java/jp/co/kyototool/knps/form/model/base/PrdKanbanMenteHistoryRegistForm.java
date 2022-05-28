package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_KANBAN_MENTE_HISTORY登録フォーム
 *
 * @author emarfkrow
 */
public class PrdKanbanMenteHistoryRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdKanbanMenteHistoryRegistForm.class);

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

    /** PRINT_OUT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String printOutDate;

    /**
     * @return PRINT_OUT_DATE
     */
    public String getPrintOutDate() {
        return printOutDate;
    }

    /**
     * @param p PRINT_OUT_DATE
     */
    public void setPrintOutDate(final String p) {
        this.printOutDate = p;
    }

    /** PRINT_OUT_OPERATOR */
    @jakarta.validation.constraints.Size(max = 10)
    private String printOutOperator;

    /**
     * @return PRINT_OUT_OPERATOR
     */
    public String getPrintOutOperator() {
        return printOutOperator;
    }

    /**
     * @param p PRINT_OUT_OPERATOR
     */
    public void setPrintOutOperator(final String p) {
        this.printOutOperator = p;
    }

    /** SCRAP_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String scrapDate;

    /**
     * @return SCRAP_DATE
     */
    public String getScrapDate() {
        return scrapDate;
    }

    /**
     * @param p SCRAP_DATE
     */
    public void setScrapDate(final String p) {
        this.scrapDate = p;
    }

    /** SCRAP_OPERATOR */
    @jakarta.validation.constraints.Size(max = 10)
    private String scrapOperator;

    /**
     * @return SCRAP_OPERATOR
     */
    public String getScrapOperator() {
        return scrapOperator;
    }

    /**
     * @param p SCRAP_OPERATOR
     */
    public void setScrapOperator(final String p) {
        this.scrapOperator = p;
    }

    /** LOST_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String lostDate;

    /**
     * @return LOST_DATE
     */
    public String getLostDate() {
        return lostDate;
    }

    /**
     * @param p LOST_DATE
     */
    public void setLostDate(final String p) {
        this.lostDate = p;
    }

    /** LOST_OPERATOR */
    @jakarta.validation.constraints.Size(max = 10)
    private String lostOperator;

    /**
     * @return LOST_OPERATOR
     */
    public String getLostOperator() {
        return lostOperator;
    }

    /**
     * @param p LOST_OPERATOR
     */
    public void setLostOperator(final String p) {
        this.lostOperator = p;
    }

    /** LOST_REQ */
    @jakarta.validation.constraints.Size(max = 10)
    private String lostReq;

    /**
     * @return LOST_REQ
     */
    public String getLostReq() {
        return lostReq;
    }

    /**
     * @param p LOST_REQ
     */
    public void setLostReq(final String p) {
        this.lostReq = p;
    }

    /** LOST_REASON */
    @jakarta.validation.constraints.Size(max = 10)
    private String lostReason;

    /**
     * @return LOST_REASON
     */
    public String getLostReason() {
        return lostReason;
    }

    /**
     * @param p LOST_REASON
     */
    public void setLostReason(final String p) {
        this.lostReason = p;
    }

    /** LOSS_SCRAP_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String lossScrapDate;

    /**
     * @return LOSS_SCRAP_DATE
     */
    public String getLossScrapDate() {
        return lossScrapDate;
    }

    /**
     * @param p LOSS_SCRAP_DATE
     */
    public void setLossScrapDate(final String p) {
        this.lossScrapDate = p;
    }

    /** LOSS_SCRAP_OPERATOR */
    @jakarta.validation.constraints.Size(max = 10)
    private String lossScrapOperator;

    /**
     * @return LOSS_SCRAP_OPERATOR
     */
    public String getLossScrapOperator() {
        return lossScrapOperator;
    }

    /**
     * @param p LOSS_SCRAP_OPERATOR
     */
    public void setLossScrapOperator(final String p) {
        this.lossScrapOperator = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
