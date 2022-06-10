package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 部品構成マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MPkoseRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MPkoseRegistForm.class);

    /** 販売品番 */
    @jakarta.validation.constraints.NotBlank
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

    /** 販売品名 */
    @jakarta.validation.constraints.Size(max = 10)
    private String hinmei;

    /**
     * @return 販売品名
     */
    public String getHinmei() {
        return hinmei;
    }

    /**
     * @param p 販売品名
     */
    public void setHinmei(final String p) {
        this.hinmei = p;
    }

    /** 部品品番 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String phinban;

    /**
     * @return 部品品番
     */
    public String getPhinban() {
        return phinban;
    }

    /**
     * @param p 部品品番
     */
    public void setPhinban(final String p) {
        this.phinban = p;
    }

    /** 部品名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String phinmei;

    /**
     * @return 部品名
     */
    public String getPhinmei() {
        return phinmei;
    }

    /**
     * @param p 部品名
     */
    public void setPhinmei(final String p) {
        this.phinmei = p;
    }

    /** 登録日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String tourokubi;

    /**
     * @return 登録日
     */
    public String getTourokubi() {
        return tourokubi;
    }

    /**
     * @param p 登録日
     */
    public void setTourokubi(final String p) {
        this.tourokubi = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
