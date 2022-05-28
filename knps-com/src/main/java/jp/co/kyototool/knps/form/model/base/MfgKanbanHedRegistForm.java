package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_HED登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanHedRegistForm.class);

    /** ROUTING_GROUP */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    public String getRoutingGroup() {
        return routingGroup;
    }

    /**
     * @param p ROUTING_GROUP
     */
    public void setRoutingGroup(final String p) {
        this.routingGroup = p;
    }

    /** MAN_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    public String getManHinban() {
        return manHinban;
    }

    /**
     * @param p MAN_HINBAN
     */
    public void setManHinban(final String p) {
        this.manHinban = p;
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

    /** KANBAN_ID_CURRENT */
    @jakarta.validation.constraints.Size(max = 9)
    private String kanbanIdCurrent;

    /**
     * @return KANBAN_ID_CURRENT
     */
    public String getKanbanIdCurrent() {
        return kanbanIdCurrent;
    }

    /**
     * @param p KANBAN_ID_CURRENT
     */
    public void setKanbanIdCurrent(final String p) {
        this.kanbanIdCurrent = p;
    }

    /** KANBAN_ID_NEXT */
    @jakarta.validation.constraints.Size(max = 9)
    private String kanbanIdNext;

    /**
     * @return KANBAN_ID_NEXT
     */
    public String getKanbanIdNext() {
        return kanbanIdNext;
    }

    /**
     * @param p KANBAN_ID_NEXT
     */
    public void setKanbanIdNext(final String p) {
        this.kanbanIdNext = p;
    }

    /** FOR_ROUTING */
    @jakarta.validation.constraints.Size(max = 2)
    private String forRouting;

    /**
     * @return FOR_ROUTING
     */
    public String getForRouting() {
        return forRouting;
    }

    /**
     * @param p FOR_ROUTING
     */
    public void setForRouting(final String p) {
        this.forRouting = p;
    }

    /** MST_ROUTING */
    @jakarta.validation.Valid
    private MstRoutingRegistForm mstRoutingRegistForm;

    /**
     * @return MstRoutingRegistForm
     */
    public MstRoutingRegistForm getMstRoutingRegistForm() {
        return mstRoutingRegistForm;
    }

    /**
     * @param p
     */
    public void setMstRoutingRegistForm(final MstRoutingRegistForm p) {
        this.mstRoutingRegistForm = p;
    }

    /** MST_ROUTING_BK */
    @jakarta.validation.Valid
    private List<MstRoutingBkRegistForm> mstRoutingBkGrid;

    /**
     * @return MST_ROUTING_BK
     */
    public List<MstRoutingBkRegistForm> getMstRoutingBkGrid() {
        return mstRoutingBkGrid;
    }

    /**
     * @param p
     */
    public void setMstRoutingBkGrid(final List<MstRoutingBkRegistForm> p) {
        this.mstRoutingBkGrid = p;
    }

    /** MST_SUPPLY_LIST */
    @jakarta.validation.Valid
    private List<MstSupplyListRegistForm> mstSupplyListGrid;

    /**
     * @return MST_SUPPLY_LIST
     */
    public List<MstSupplyListRegistForm> getMstSupplyListGrid() {
        return mstSupplyListGrid;
    }

    /**
     * @param p
     */
    public void setMstSupplyListGrid(final List<MstSupplyListRegistForm> p) {
        this.mstSupplyListGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
