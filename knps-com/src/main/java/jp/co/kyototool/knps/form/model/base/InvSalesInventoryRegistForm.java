package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_SALES_INVENTORY登録フォーム
 *
 * @author emarfkrow
 */
public class InvSalesInventoryRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvSalesInventoryRegistForm.class);

    /** SALES_HINBAN */
    @jakarta.validation.constraints.Size(max = 20)
    private String salesHinban;

    /**
     * @return SALES_HINBAN
     */
    public String getSalesHinban() {
        return salesHinban;
    }

    /**
     * @param p SALES_HINBAN
     */
    public void setSalesHinban(final String p) {
        this.salesHinban = p;
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

    /** INVENTORY */
    @jakarta.validation.constraints.Size(max = 11)
    private String inventory;

    /**
     * @return INVENTORY
     */
    public String getInventory() {
        return inventory;
    }

    /**
     * @param p INVENTORY
     */
    public void setInventory(final String p) {
        this.inventory = p;
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

    /** LAST_DOWNLOAD_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String lastDownloadDate;

    /**
     * @return LAST_DOWNLOAD_DATE
     */
    public String getLastDownloadDate() {
        return lastDownloadDate;
    }

    /**
     * @param p LAST_DOWNLOAD_DATE
     */
    public void setLastDownloadDate(final String p) {
        this.lastDownloadDate = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
