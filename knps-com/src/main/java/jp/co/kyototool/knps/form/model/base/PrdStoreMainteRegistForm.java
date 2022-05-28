package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteRegistForm.class);

    /** YYYY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return yyyy;
    }

    /**
     * @param p YYYY
     */
    public void setYyyy(final String p) {
        this.yyyy = p;
    }

    /** MM */
    @jakarta.validation.constraints.Size(max = 2)
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return mm;
    }

    /**
     * @param p MM
     */
    public void setMm(final String p) {
        this.mm = p;
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

    /** ROUTING */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routing;

    /**
     * @return ROUTING
     */
    public String getRouting() {
        return routing;
    }

    /**
     * @param p ROUTING
     */
    public void setRouting(final String p) {
        this.routing = p;
    }

    /** WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return wcCode;
    }

    /**
     * @param p WC_CODE
     */
    public void setWcCode(final String p) {
        this.wcCode = p;
    }

    /** LOCATION_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * @param p LOCATION_CODE
     */
    public void setLocationCode(final String p) {
        this.locationCode = p;
    }

    /** LOT_SIZE */
    @jakarta.validation.constraints.Size(max = 6)
    private String lotSize;

    /**
     * @return LOT_SIZE
     */
    public String getLotSize() {
        return lotSize;
    }

    /**
     * @param p LOT_SIZE
     */
    public void setLotSize(final String p) {
        this.lotSize = p;
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

    /** PL_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String plCounts;

    /**
     * @return PL_COUNTS
     */
    public String getPlCounts() {
        return plCounts;
    }

    /**
     * @param p PL_COUNTS
     */
    public void setPlCounts(final String p) {
        this.plCounts = p;
    }

    /** KANBAN_COUNTS */
    @jakarta.validation.constraints.Size(max = 4)
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

    /** FIT_POS */
    @jakarta.validation.constraints.Size(max = 2)
    private String fitPos;

    /**
     * @return FIT_POS
     */
    public String getFitPos() {
        return fitPos;
    }

    /**
     * @param p FIT_POS
     */
    public void setFitPos(final String p) {
        this.fitPos = p;
    }

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

    /** PRD_Y_SUP_BUDGET_OUT */
    @jakarta.validation.Valid
    private PrdYSupBudgetOutRegistForm prdYSupBudgetOutRegistForm;

    /**
     * @return PrdYSupBudgetOutRegistForm
     */
    public PrdYSupBudgetOutRegistForm getPrdYSupBudgetOutRegistForm() {
        return prdYSupBudgetOutRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdYSupBudgetOutRegistForm(final PrdYSupBudgetOutRegistForm p) {
        this.prdYSupBudgetOutRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
