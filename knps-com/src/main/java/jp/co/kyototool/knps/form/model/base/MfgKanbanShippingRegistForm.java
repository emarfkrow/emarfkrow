package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_SHIPPING登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanShippingRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanShippingRegistForm.class);

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

    /** FOR_PRO_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String forProCode;

    /**
     * @return FOR_PRO_CODE
     */
    public String getForProCode() {
        return forProCode;
    }

    /**
     * @param p FOR_PRO_CODE
     */
    public void setForProCode(final String p) {
        this.forProCode = p;
    }

    /** FOR_PRO_LOCATION_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String forProLocationCode;

    /**
     * @return FOR_PRO_LOCATION_CODE
     */
    public String getForProLocationCode() {
        return forProLocationCode;
    }

    /**
     * @param p FOR_PRO_LOCATION_CODE
     */
    public void setForProLocationCode(final String p) {
        this.forProLocationCode = p;
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

    /** COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String counts;

    /**
     * @return COUNTS
     */
    public String getCounts() {
        return counts;
    }

    /**
     * @param p COUNTS
     */
    public void setCounts(final String p) {
        this.counts = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
