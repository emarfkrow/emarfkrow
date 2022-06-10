package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * WEB制御マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MWseigyoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MWseigyoRegistForm.class);

    /** ＷＥＢデータ区分 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String webDatakbn;

    /**
     * @return ＷＥＢデータ区分
     */
    public String getWebDatakbn() {
        return webDatakbn;
    }

    /**
     * @param p ＷＥＢデータ区分
     */
    public void setWebDatakbn(final String p) {
        this.webDatakbn = p;
    }

    /** ＷＥＢ受注番号１ */
    @jakarta.validation.constraints.Size(max = 9)
    private String webJuchuno1;

    /**
     * @return ＷＥＢ受注番号１
     */
    public String getWebJuchuno1() {
        return webJuchuno1;
    }

    /**
     * @param p ＷＥＢ受注番号１
     */
    public void setWebJuchuno1(final String p) {
        this.webJuchuno1 = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
