package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * M_CHOKU登録フォーム
 *
 * @author emarfkrow
 */
public class MChokuRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MChokuRegistForm.class);

    /** CHOKUCD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
    private String chokucd;

    /**
     * @return CHOKUCD
     */
    public String getChokucd() {
        return chokucd;
    }

    /**
     * @param p CHOKUCD
     */
    public void setChokucd(final String p) {
        this.chokucd = p;
    }

    /** CHOKUMEI1 */
    @jakarta.validation.constraints.Size(max = 28)
    private String chokumei1;

    /**
     * @return CHOKUMEI1
     */
    public String getChokumei1() {
        return chokumei1;
    }

    /**
     * @param p CHOKUMEI1
     */
    public void setChokumei1(final String p) {
        this.chokumei1 = p;
    }

    /** CHOKUMEI2 */
    @jakarta.validation.constraints.Size(max = 22)
    private String chokumei2;

    /**
     * @return CHOKUMEI2
     */
    public String getChokumei2() {
        return chokumei2;
    }

    /**
     * @param p CHOKUMEI2
     */
    public void setChokumei2(final String p) {
        this.chokumei2 = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
