package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_PROD_UNITPRICE登録フォーム
 *
 * @author emarfkrow
 */
public class MstProdUnitpriceRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstProdUnitpriceRegistForm.class);

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

    /** MIN_ORDER */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 11)
    private String minOrder;

    /**
     * @return MIN_ORDER
     */
    public String getMinOrder() {
        return minOrder;
    }

    /**
     * @param p MIN_ORDER
     */
    public void setMinOrder(final String p) {
        this.minOrder = p;
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

    /** ORDER_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String orderUnit;

    /**
     * @return ORDER_UNIT
     */
    public String getOrderUnit() {
        return orderUnit;
    }

    /**
     * @param p ORDER_UNIT
     */
    public void setOrderUnit(final String p) {
        this.orderUnit = p;
    }

    /** STANDARD_UNITPRICE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String standardUnitpriceFlag;

    /**
     * @return STANDARD_UNITPRICE_FLAG
     */
    public String getStandardUnitpriceFlag() {
        return standardUnitpriceFlag;
    }

    /**
     * @param p STANDARD_UNITPRICE_FLAG
     */
    public void setStandardUnitpriceFlag(final String p) {
        this.standardUnitpriceFlag = p;
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

    /** GAIKA_KB */
    @jakarta.validation.constraints.Size(max = 1)
    private String gaikaKb;

    /**
     * @return GAIKA_KB
     */
    public String getGaikaKb() {
        return gaikaKb;
    }

    /**
     * @param p GAIKA_KB
     */
    public void setGaikaKb(final String p) {
        this.gaikaKb = p;
    }

    /** GAIKA_TK */
    @jakarta.validation.constraints.Size(max = 10)
    private String gaikaTk;

    /**
     * @return GAIKA_TK
     */
    public String getGaikaTk() {
        return gaikaTk;
    }

    /**
     * @param p GAIKA_TK
     */
    public void setGaikaTk(final String p) {
        this.gaikaTk = p;
    }

    /** ISSHIKI_UNIT_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String isshikiUnitF;

    /**
     * @return ISSHIKI_UNIT_F
     */
    public String getIsshikiUnitF() {
        return isshikiUnitF;
    }

    /**
     * @param p ISSHIKI_UNIT_F
     */
    public void setIsshikiUnitF(final String p) {
        this.isshikiUnitF = p;
    }

    /** MIN_ORDER_AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String minOrderAmount;

    /**
     * @return MIN_ORDER_AMOUNT
     */
    public String getMinOrderAmount() {
        return minOrderAmount;
    }

    /**
     * @param p MIN_ORDER_AMOUNT
     */
    public void setMinOrderAmount(final String p) {
        this.minOrderAmount = p;
    }

    /** MST_PROD_UNITPRICE_BK */
    @jakarta.validation.Valid
    private List<MstProdUnitpriceBkRegistForm> mstProdUnitpriceBkGrid;

    /**
     * @return MST_PROD_UNITPRICE_BK
     */
    public List<MstProdUnitpriceBkRegistForm> getMstProdUnitpriceBkGrid() {
        return mstProdUnitpriceBkGrid;
    }

    /**
     * @param p
     */
    public void setMstProdUnitpriceBkGrid(final List<MstProdUnitpriceBkRegistForm> p) {
        this.mstProdUnitpriceBkGrid = p;
    }

    /** MST_PROD_UNITPRICE_HS */
    @jakarta.validation.Valid
    private List<MstProdUnitpriceHsRegistForm> mstProdUnitpriceHsGrid;

    /**
     * @return MST_PROD_UNITPRICE_HS
     */
    public List<MstProdUnitpriceHsRegistForm> getMstProdUnitpriceHsGrid() {
        return mstProdUnitpriceHsGrid;
    }

    /**
     * @param p
     */
    public void setMstProdUnitpriceHsGrid(final List<MstProdUnitpriceHsRegistForm> p) {
        this.mstProdUnitpriceHsGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
