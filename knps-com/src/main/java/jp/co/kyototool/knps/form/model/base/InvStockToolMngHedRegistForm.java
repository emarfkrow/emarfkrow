package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_TOOL_MNG_HED登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockToolMngHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockToolMngHedRegistForm.class);

    /** STOCK_MANAGEMENT_SECTION */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String stockManagementSection;

    /**
     * @return STOCK_MANAGEMENT_SECTION
     */
    public String getStockManagementSection() {
        return stockManagementSection;
    }

    /**
     * @param p STOCK_MANAGEMENT_SECTION
     */
    public void setStockManagementSection(final String p) {
        this.stockManagementSection = p;
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

    /** SUB_INV_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
    public String getSubInvCode() {
        return subInvCode;
    }

    /**
     * @param p SUB_INV_CODE
     */
    public void setSubInvCode(final String p) {
        this.subInvCode = p;
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
