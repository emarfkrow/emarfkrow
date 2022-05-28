package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_PROCESS_WK登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockProcessWkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockProcessWkRegistForm.class);

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

    /** ITEM */
    @jakarta.validation.constraints.Size(max = 60)
    private String item;

    /**
     * @return ITEM
     */
    public String getItem() {
        return item;
    }

    /**
     * @param p ITEM
     */
    public void setItem(final String p) {
        this.item = p;
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

    /** HINBAN_OPE_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String hinbanOpeCode;

    /**
     * @return HINBAN_OPE_CODE
     */
    public String getHinbanOpeCode() {
        return hinbanOpeCode;
    }

    /**
     * @param p HINBAN_OPE_CODE
     */
    public void setHinbanOpeCode(final String p) {
        this.hinbanOpeCode = p;
    }

    /** ROUTING_GROUP */
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

    /** WC_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String wcName;

    /**
     * @return WC_NAME
     */
    public String getWcName() {
        return wcName;
    }

    /**
     * @param p WC_NAME
     */
    public void setWcName(final String p) {
        this.wcName = p;
    }

    /** OPE_DETAIL */
    @jakarta.validation.constraints.Size(max = 10)
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return opeDetail;
    }

    /**
     * @param p OPE_DETAIL
     */
    public void setOpeDetail(final String p) {
        this.opeDetail = p;
    }

    /** LAST_IN_OUT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String lastInOutDate;

    /**
     * @return LAST_IN_OUT_DATE
     */
    public String getLastInOutDate() {
        return lastInOutDate;
    }

    /**
     * @param p LAST_IN_OUT_DATE
     */
    public void setLastInOutDate(final String p) {
        this.lastInOutDate = p;
    }

    /** STOCK */
    @jakarta.validation.constraints.Size(max = 11)
    private String stock;

    /**
     * @return STOCK
     */
    public String getStock() {
        return stock;
    }

    /**
     * @param p STOCK
     */
    public void setStock(final String p) {
        this.stock = p;
    }

    /** PRO_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String proNo;

    /**
     * @return PRO_NO
     */
    public String getProNo() {
        return proNo;
    }

    /**
     * @param p PRO_NO
     */
    public void setProNo(final String p) {
        this.proNo = p;
    }

    /** NEXT_ROUTING */
    @jakarta.validation.constraints.Size(max = 60)
    private String nextRouting;

    /**
     * @return NEXT_ROUTING
     */
    public String getNextRouting() {
        return nextRouting;
    }

    /**
     * @param p NEXT_ROUTING
     */
    public void setNextRouting(final String p) {
        this.nextRouting = p;
    }

    /** NEXT_WC */
    @jakarta.validation.constraints.Size(max = 3)
    private String nextWc;

    /**
     * @return NEXT_WC
     */
    public String getNextWc() {
        return nextWc;
    }

    /**
     * @param p NEXT_WC
     */
    public void setNextWc(final String p) {
        this.nextWc = p;
    }

    /** NEXT_DETAIL */
    @jakarta.validation.constraints.Size(max = 10)
    private String nextDetail;

    /**
     * @return NEXT_DETAIL
     */
    public String getNextDetail() {
        return nextDetail;
    }

    /**
     * @param p NEXT_DETAIL
     */
    public void setNextDetail(final String p) {
        this.nextDetail = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
