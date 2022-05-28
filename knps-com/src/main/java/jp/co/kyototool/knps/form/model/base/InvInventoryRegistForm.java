package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_INVENTORY登録フォーム
 *
 * @author emarfkrow
 */
public class InvInventoryRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvInventoryRegistForm.class);

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

    /** GOOD_STOCK */
    @jakarta.validation.constraints.Size(max = 12)
    private String goodStock;

    /**
     * @return GOOD_STOCK
     */
    public String getGoodStock() {
        return goodStock;
    }

    /**
     * @param p GOOD_STOCK
     */
    public void setGoodStock(final String p) {
        this.goodStock = p;
    }

    /** BAD_STOCK */
    @jakarta.validation.constraints.Size(max = 12)
    private String badStock;

    /**
     * @return BAD_STOCK
     */
    public String getBadStock() {
        return badStock;
    }

    /**
     * @param p BAD_STOCK
     */
    public void setBadStock(final String p) {
        this.badStock = p;
    }

    /** LATEST_IN_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String latestInDate;

    /**
     * @return LATEST_IN_DATE
     */
    public String getLatestInDate() {
        return latestInDate;
    }

    /**
     * @param p LATEST_IN_DATE
     */
    public void setLatestInDate(final String p) {
        this.latestInDate = p;
    }

    /** LATEST_OUT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String latestOutDate;

    /**
     * @return LATEST_OUT_DATE
     */
    public String getLatestOutDate() {
        return latestOutDate;
    }

    /**
     * @param p LATEST_OUT_DATE
     */
    public void setLatestOutDate(final String p) {
        this.latestOutDate = p;
    }

    /** REMAINS_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String remainsKbn;

    /**
     * @return REMAINS_KBN
     */
    public String getRemainsKbn() {
        return remainsKbn;
    }

    /**
     * @param p REMAINS_KBN
     */
    public void setRemainsKbn(final String p) {
        this.remainsKbn = p;
    }

    /** REASON_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String reasonCode;

    /**
     * @return REASON_CODE
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * @param p REASON_CODE
     */
    public void setReasonCode(final String p) {
        this.reasonCode = p;
    }

    /** NOTE */
    @jakarta.validation.constraints.Size(max = 60)
    private String note;

    /**
     * @return NOTE
     */
    public String getNote() {
        return note;
    }

    /**
     * @param p NOTE
     */
    public void setNote(final String p) {
        this.note = p;
    }

    /** INV_STOCK_PROCESS */
    @jakarta.validation.Valid
    private InvStockProcessRegistForm invStockProcessRegistForm;

    /**
     * @return InvStockProcessRegistForm
     */
    public InvStockProcessRegistForm getInvStockProcessRegistForm() {
        return invStockProcessRegistForm;
    }

    /**
     * @param p
     */
    public void setInvStockProcessRegistForm(final InvStockProcessRegistForm p) {
        this.invStockProcessRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
