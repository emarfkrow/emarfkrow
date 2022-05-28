package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_W_NES_KANBAN_OLD登録フォーム
 *
 * @author emarfkrow
 */
public class PrdWNesKanbanOldRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdWNesKanbanOldRegistForm.class);

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

    /** STORE_WC */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 3)
    private String storeWc;

    /**
     * @return STORE_WC
     */
    public String getStoreWc() {
        return storeWc;
    }

    /**
     * @param p STORE_WC
     */
    public void setStoreWc(final String p) {
        this.storeWc = p;
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

    /** ROUTING_DEF_GROUP */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routingDefGroup;

    /**
     * @return ROUTING_DEF_GROUP
     */
    public String getRoutingDefGroup() {
        return routingDefGroup;
    }

    /**
     * @param p ROUTING_DEF_GROUP
     */
    public void setRoutingDefGroup(final String p) {
        this.routingDefGroup = p;
    }

    /** STORE_OPE_DETAIL */
    @jakarta.validation.constraints.Size(max = 10)
    private String storeOpeDetail;

    /**
     * @return STORE_OPE_DETAIL
     */
    public String getStoreOpeDetail() {
        return storeOpeDetail;
    }

    /**
     * @param p STORE_OPE_DETAIL
     */
    public void setStoreOpeDetail(final String p) {
        this.storeOpeDetail = p;
    }

    /** PRO_NES_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String proNesCounts;

    /**
     * @return PRO_NES_COUNTS
     */
    public String getProNesCounts() {
        return proNesCounts;
    }

    /**
     * @param p PRO_NES_COUNTS
     */
    public void setProNesCounts(final String p) {
        this.proNesCounts = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
