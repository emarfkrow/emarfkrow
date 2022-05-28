package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_STORE_MAN登録フォーム
 *
 * @author emarfkrow
 */
public class MstStoreManRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstStoreManRegistForm.class);

    /** STORE_MAN_ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String storeManId;

    /**
     * @return STORE_MAN_ID
     */
    public String getStoreManId() {
        return storeManId;
    }

    /**
     * @param p STORE_MAN_ID
     */
    public void setStoreManId(final String p) {
        this.storeManId = p;
    }

    /** STORE_MAN_MEI */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String storeManMei;

    /**
     * @return STORE_MAN_MEI
     */
    public String getStoreManMei() {
        return storeManMei;
    }

    /**
     * @param p STORE_MAN_MEI
     */
    public void setStoreManMei(final String p) {
        this.storeManMei = p;
    }

    /** MEMO */
    @jakarta.validation.constraints.Size(max = 120)
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param p MEMO
     */
    public void setMemo(final String p) {
        this.memo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
