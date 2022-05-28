package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_BUSINESS登録フォーム
 *
 * @author emarfkrow
 */
public class MstBusinessRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstBusinessRegistForm.class);

    /** BUSINESS_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String businessId;

    /**
     * @return BUSINESS_ID
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * @param p BUSINESS_ID
     */
    public void setBusinessId(final String p) {
        this.businessId = p;
    }

    /** BUSINESS_NAME */
    @jakarta.validation.constraints.Size(max = 20)
    private String businessName;

    /**
     * @return BUSINESS_NAME
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * @param p BUSINESS_NAME
     */
    public void setBusinessName(final String p) {
        this.businessName = p;
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
