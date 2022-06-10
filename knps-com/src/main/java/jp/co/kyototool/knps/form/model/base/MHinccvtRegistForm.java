package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 品番変換マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MHinccvtRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHinccvtRegistForm.class);

    /** 変換品番 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String cvthinban;

    /**
     * @return 変換品番
     */
    public String getCvthinban() {
        return cvthinban;
    }

    /**
     * @param p 変換品番
     */
    public void setCvthinban(final String p) {
        this.cvthinban = p;
    }

    /** 販売品番 */
    @jakarta.validation.constraints.Size(max = 20)
    private String hhinban;

    /**
     * @return 販売品番
     */
    public String getHhinban() {
        return hhinban;
    }

    /**
     * @param p 販売品番
     */
    public void setHhinban(final String p) {
        this.hhinban = p;
    }

    /** 直送対象品区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String chokuhinkbn;

    /**
     * @return 直送対象品区分
     */
    public String getChokuhinkbn() {
        return chokuhinkbn;
    }

    /**
     * @param p 直送対象品区分
     */
    public void setChokuhinkbn(final String p) {
        this.chokuhinkbn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
