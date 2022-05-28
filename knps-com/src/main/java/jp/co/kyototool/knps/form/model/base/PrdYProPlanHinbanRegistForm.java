package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_Y_PRO_PLAN_HINBAN登録フォーム
 *
 * @author emarfkrow
 */
public class PrdYProPlanHinbanRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdYProPlanHinbanRegistForm.class);

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

    /** PRO_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    public String getProHinban() {
        return proHinban;
    }

    /**
     * @param p PRO_HINBAN
     */
    public void setProHinban(final String p) {
        this.proHinban = p;
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

    /** ITEM_KBN */
    @jakarta.validation.constraints.Size(max = 2)
    private String itemKbn;

    /**
     * @return ITEM_KBN
     */
    public String getItemKbn() {
        return itemKbn;
    }

    /**
     * @param p ITEM_KBN
     */
    public void setItemKbn(final String p) {
        this.itemKbn = p;
    }

    /** SHIKAKE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String shikakeKbn;

    /**
     * @return SHIKAKE_KBN
     */
    public String getShikakeKbn() {
        return shikakeKbn;
    }

    /**
     * @param p SHIKAKE_KBN
     */
    public void setShikakeKbn(final String p) {
        this.shikakeKbn = p;
    }

    /** NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 10)
    private String nesCounts;

    /**
     * @return NES_COUNTS
     */
    public String getNesCounts() {
        return nesCounts;
    }

    /**
     * @param p NES_COUNTS
     */
    public void setNesCounts(final String p) {
        this.nesCounts = p;
    }

    /** PARENT_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String parentHinban;

    /**
     * @return PARENT_HINBAN
     */
    public String getParentHinban() {
        return parentHinban;
    }

    /**
     * @param p PARENT_HINBAN
     */
    public void setParentHinban(final String p) {
        this.parentHinban = p;
    }

    /** PRO_LT */
    @jakarta.validation.constraints.Size(max = 6)
    private String proLt;

    /**
     * @return PRO_LT
     */
    public String getProLt() {
        return proLt;
    }

    /**
     * @param p PRO_LT
     */
    public void setProLt(final String p) {
        this.proLt = p;
    }

    /** PRD_Y_PRO_PLAN_ROUTING */
    @jakarta.validation.Valid
    private List<PrdYProPlanRoutingRegistForm> prdYProPlanRoutingGrid;

    /**
     * @return PRD_Y_PRO_PLAN_ROUTING
     */
    public List<PrdYProPlanRoutingRegistForm> getPrdYProPlanRoutingGrid() {
        return prdYProPlanRoutingGrid;
    }

    /**
     * @param p
     */
    public void setPrdYProPlanRoutingGrid(final List<PrdYProPlanRoutingRegistForm> p) {
        this.prdYProPlanRoutingGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
