package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_UNIT登録フォーム
 *
 * @author emarfkrow
 */
public class MstUnitRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstUnitRegistForm.class);

    /** UNIT_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * @param p UNIT_CODE
     */
    public void setUnitCode(final String p) {
        this.unitCode = p;
    }

    /** UNIT_NAME */
    @jakarta.validation.constraints.Size(max = 10)
    private String unitName;

    /**
     * @return UNIT_NAME
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param p UNIT_NAME
     */
    public void setUnitName(final String p) {
        this.unitName = p;
    }

    /** STAN_UNIT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String stanUnitKbn;

    /**
     * @return STAN_UNIT_KBN
     */
    public String getStanUnitKbn() {
        return stanUnitKbn;
    }

    /**
     * @param p STAN_UNIT_KBN
     */
    public void setStanUnitKbn(final String p) {
        this.stanUnitKbn = p;
    }

    /** STAN_UNIT_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String stanUnitCode;

    /**
     * @return STAN_UNIT_CODE
     */
    public String getStanUnitCode() {
        return stanUnitCode;
    }

    /**
     * @param p STAN_UNIT_CODE
     */
    public void setStanUnitCode(final String p) {
        this.stanUnitCode = p;
    }

    /** EXCHANGE_RATE */
    @jakarta.validation.constraints.Size(max = 16)
    private String exchangeRate;

    /**
     * @return EXCHANGE_RATE
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * @param p EXCHANGE_RATE
     */
    public void setExchangeRate(final String p) {
        this.exchangeRate = p;
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
