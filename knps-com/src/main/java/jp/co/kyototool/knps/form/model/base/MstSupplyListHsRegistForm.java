package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUPPLY_LIST_HS登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupplyListHsRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupplyListHsRegistForm.class);

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

    /** SUPPLY_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String supplyHinban;

    /**
     * @return SUPPLY_HINBAN
     */
    public String getSupplyHinban() {
        return supplyHinban;
    }

    /**
     * @param p SUPPLY_HINBAN
     */
    public void setSupplyHinban(final String p) {
        this.supplyHinban = p;
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

    /** SUPPLY_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String supplyKbn;

    /**
     * @return SUPPLY_KBN
     */
    public String getSupplyKbn() {
        return supplyKbn;
    }

    /**
     * @param p SUPPLY_KBN
     */
    public void setSupplyKbn(final String p) {
        this.supplyKbn = p;
    }

    /** STAN_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String stanCounts;

    /**
     * @return STAN_COUNTS
     */
    public String getStanCounts() {
        return stanCounts;
    }

    /**
     * @param p STAN_COUNTS
     */
    public void setStanCounts(final String p) {
        this.stanCounts = p;
    }

    /** UNIT_SUPPLY */
    @jakarta.validation.constraints.Size(max = 9)
    private String unitSupply;

    /**
     * @return UNIT_SUPPLY
     */
    public String getUnitSupply() {
        return unitSupply;
    }

    /**
     * @param p UNIT_SUPPLY
     */
    public void setUnitSupply(final String p) {
        this.unitSupply = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
