package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_DAILY_PLAN_EXCHANGE_ID登録フォーム
 *
 * @author emarfkrow
 */
public class MfgDailyPlanExchangeIdRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgDailyPlanExchangeIdRegistForm.class);

    /** EXCHANGE_ID */
    @jakarta.validation.constraints.Size(max = 7)
    private String exchangeId;

    /**
     * @return EXCHANGE_ID
     */
    public String getExchangeId() {
        return exchangeId;
    }

    /**
     * @param p EXCHANGE_ID
     */
    public void setExchangeId(final String p) {
        this.exchangeId = p;
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

    /** ID_TYPE */
    @jakarta.validation.constraints.Size(max = 10)
    private String idType;

    /**
     * @return ID_TYPE
     */
    public String getIdType() {
        return idType;
    }

    /**
     * @param p ID_TYPE
     */
    public void setIdType(final String p) {
        this.idType = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
