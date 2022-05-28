package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * M_TOKUI登録フォーム
 *
 * @author emarfkrow
 */
public class MTokuiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MTokuiRegistForm.class);

    /** TOKUCD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
    private String tokucd;

    /**
     * @return TOKUCD
     */
    public String getTokucd() {
        return tokucd;
    }

    /**
     * @param p TOKUCD
     */
    public void setTokucd(final String p) {
        this.tokucd = p;
    }

    /** TOKUMEI1 */
    @jakarta.validation.constraints.Size(max = 28)
    private String tokumei1;

    /**
     * @return TOKUMEI1
     */
    public String getTokumei1() {
        return tokumei1;
    }

    /**
     * @param p TOKUMEI1
     */
    public void setTokumei1(final String p) {
        this.tokumei1 = p;
    }

    /** TOKUMEI2 */
    @jakarta.validation.constraints.Size(max = 22)
    private String tokumei2;

    /**
     * @return TOKUMEI2
     */
    public String getTokumei2() {
        return tokumei2;
    }

    /**
     * @param p TOKUMEI2
     */
    public void setTokumei2(final String p) {
        this.tokumei2 = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
