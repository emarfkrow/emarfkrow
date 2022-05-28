package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUP_UNITPRICE_DETAIL_BK登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetailBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupUnitpriceDetailBkRegistForm.class);

    /** YY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return YY
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p YY
     */
    public void setYy(final String p) {
        this.yy = p;
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

    /** SUP_CODE */
    @jakarta.validation.constraints.Size(max = 6)
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return supCode;
    }

    /**
     * @param p SUP_CODE
     */
    public void setSupCode(final String p) {
        this.supCode = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
