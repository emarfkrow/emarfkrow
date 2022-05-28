package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_SUPPLY_SCH登録フォーム
 *
 * @author emarfkrow
 */
public class PchSupplySchRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchSupplySchRegistForm.class);

    /** SUPPLY_NO */
    @jakarta.validation.constraints.Size(max = 12)
    private String supplyNo;

    /**
     * @return SUPPLY_NO
     */
    public String getSupplyNo() {
        return supplyNo;
    }

    /**
     * @param p SUPPLY_NO
     */
    public void setSupplyNo(final String p) {
        this.supplyNo = p;
    }

    /** SUPPLY_ORDER_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String supplyOrderNo;

    /**
     * @return SUPPLY_ORDER_NO
     */
    public String getSupplyOrderNo() {
        return supplyOrderNo;
    }

    /**
     * @param p SUPPLY_ORDER_NO
     */
    public void setSupplyOrderNo(final String p) {
        this.supplyOrderNo = p;
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

    /** SUPPLY_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String supplyUnit;

    /**
     * @return SUPPLY_UNIT
     */
    public String getSupplyUnit() {
        return supplyUnit;
    }

    /**
     * @param p SUPPLY_UNIT
     */
    public void setSupplyUnit(final String p) {
        this.supplyUnit = p;
    }

    /** SUPPLY_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String supplyCounts;

    /**
     * @return SUPPLY_COUNTS
     */
    public String getSupplyCounts() {
        return supplyCounts;
    }

    /**
     * @param p SUPPLY_COUNTS
     */
    public void setSupplyCounts(final String p) {
        this.supplyCounts = p;
    }

    /** ACT_SUPPLY_COUNTS */
    @jakarta.validation.constraints.Size(max = 11)
    private String actSupplyCounts;

    /**
     * @return ACT_SUPPLY_COUNTS
     */
    public String getActSupplyCounts() {
        return actSupplyCounts;
    }

    /**
     * @param p ACT_SUPPLY_COUNTS
     */
    public void setActSupplyCounts(final String p) {
        this.actSupplyCounts = p;
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

    /** SUPPLY_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String supplyDate;

    /**
     * @return SUPPLY_DATE
     */
    public String getSupplyDate() {
        return supplyDate;
    }

    /**
     * @param p SUPPLY_DATE
     */
    public void setSupplyDate(final String p) {
        this.supplyDate = p;
    }

    /** SUPPLY_VERIFY_STAT */
    @jakarta.validation.constraints.Size(max = 1)
    private String supplyVerifyStat;

    /**
     * @return SUPPLY_VERIFY_STAT
     */
    public String getSupplyVerifyStat() {
        return supplyVerifyStat;
    }

    /**
     * @param p SUPPLY_VERIFY_STAT
     */
    public void setSupplyVerifyStat(final String p) {
        this.supplyVerifyStat = p;
    }

    /** USER_ID_VERIFY */
    @jakarta.validation.constraints.Size(max = 10)
    private String userIdVerify;

    /**
     * @return USER_ID_VERIFY
     */
    public String getUserIdVerify() {
        return userIdVerify;
    }

    /**
     * @param p USER_ID_VERIFY
     */
    public void setUserIdVerify(final String p) {
        this.userIdVerify = p;
    }

    /** SUPPLY_ISSUE_STAT */
    @jakarta.validation.constraints.Size(max = 1)
    private String supplyIssueStat;

    /**
     * @return SUPPLY_ISSUE_STAT
     */
    public String getSupplyIssueStat() {
        return supplyIssueStat;
    }

    /**
     * @param p SUPPLY_ISSUE_STAT
     */
    public void setSupplyIssueStat(final String p) {
        this.supplyIssueStat = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
