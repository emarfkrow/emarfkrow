package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_STOCK_STORE登録フォーム
 *
 * @author emarfkrow
 */
public class InvStockStoreRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvStockStoreRegistForm.class);

    /** HINBAN */
    @jakarta.validation.constraints.NotBlank
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

    /** STORE_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String storeNo;

    /**
     * @return STORE_NO
     */
    public String getStoreNo() {
        return storeNo;
    }

    /**
     * @param p STORE_NO
     */
    public void setStoreNo(final String p) {
        this.storeNo = p;
    }

    /** COUNTS */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 6)
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

    /** HAKO_SU */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 3)
    private String hakoSu;

    /**
     * @return HAKO_SU
     */
    public String getHakoSu() {
        return hakoSu;
    }

    /**
     * @param p HAKO_SU
     */
    public void setHakoSu(final String p) {
        this.hakoSu = p;
    }

    /** STOCK */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 9)
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

    /** TOTAL_SUM_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String totalSumCost;

    /**
     * @return TOTAL_SUM_COST
     */
    public String getTotalSumCost() {
        return totalSumCost;
    }

    /**
     * @param p TOTAL_SUM_COST
     */
    public void setTotalSumCost(final String p) {
        this.totalSumCost = p;
    }

    /** AMOUNT */
    @jakarta.validation.constraints.Size(max = 11)
    private String amount;

    /**
     * @return AMOUNT
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param p AMOUNT
     */
    public void setAmount(final String p) {
        this.amount = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
