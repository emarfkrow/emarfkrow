package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 国名マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MKunimeiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MKunimeiRegistForm.class);

    /** 国際地域コード */
    @jakarta.validation.constraints.Size(max = 1)
    private String kokusaicd;

    /**
     * @return 国際地域コード
     */
    public String getKokusaicd() {
        return kokusaicd;
    }

    /**
     * @param p 国際地域コード
     */
    public void setKokusaicd(final String p) {
        this.kokusaicd = p;
    }

    /** 国コード */
    @jakarta.validation.constraints.Size(max = 2)
    private String kunicd;

    /**
     * @return 国コード
     */
    public String getKunicd() {
        return kunicd;
    }

    /**
     * @param p 国コード
     */
    public void setKunicd(final String p) {
        this.kunicd = p;
    }

    /** 原産国表示名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String gensankoku;

    /**
     * @return 原産国表示名
     */
    public String getGensankoku() {
        return gensankoku;
    }

    /**
     * @param p 原産国表示名
     */
    public void setGensankoku(final String p) {
        this.gensankoku = p;
    }

    /** 国名 */
    @jakarta.validation.constraints.Size(max = 40)
    private String kunimei;

    /**
     * @return 国名
     */
    public String getKunimei() {
        return kunimei;
    }

    /**
     * @param p 国名
     */
    public void setKunimei(final String p) {
        this.kunimei = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 37)
    private String filler;

    /**
     * @return 予備領域
     */
    public String getFiller() {
        return filler;
    }

    /**
     * @param p 予備領域
     */
    public void setFiller(final String p) {
        this.filler = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
