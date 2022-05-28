package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_PROD_TOTAL_INF登録フォーム
 *
 * @author emarfkrow
 */
public class PchProdTotalInfRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchProdTotalInfRegistForm.class);

    /** CLOSE_DATE */
    @jakarta.validation.constraints.Size(max = 4)
    private String closeDate;

    /**
     * @return CLOSE_DATE
     */
    public String getCloseDate() {
        return closeDate;
    }

    /**
     * @param p CLOSE_DATE
     */
    public void setCloseDate(final String p) {
        this.closeDate = p;
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

    /** TOTAL_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String totalCounts;

    /**
     * @return TOTAL_COUNTS
     */
    public String getTotalCounts() {
        return totalCounts;
    }

    /**
     * @param p TOTAL_COUNTS
     */
    public void setTotalCounts(final String p) {
        this.totalCounts = p;
    }

    /** TOTAL_AMOUNT */
    @jakarta.validation.constraints.Size(max = 13)
    private String totalAmount;

    /**
     * @return TOTAL_AMOUNT
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param p TOTAL_AMOUNT
     */
    public void setTotalAmount(final String p) {
        this.totalAmount = p;
    }

    /** SUM_SUPPLY */
    @jakarta.validation.constraints.Size(max = 13)
    private String sumSupply;

    /**
     * @return SUM_SUPPLY
     */
    public String getSumSupply() {
        return sumSupply;
    }

    /**
     * @param p SUM_SUPPLY
     */
    public void setSumSupply(final String p) {
        this.sumSupply = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
