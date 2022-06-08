package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 日産単価マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MNtankaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MNtankaRegistForm.class);

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

    /** 日産品番 */
    @jakarta.validation.constraints.Size(max = 20)
    private String nissanHinban;

    /**
     * @return 日産品番
     */
    public String getNissanHinban() {
        return nissanHinban;
    }

    /**
     * @param p 日産品番
     */
    public void setNissanHinban(final String p) {
        this.nissanHinban = p;
    }

    /** 日産単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String nissanTanka;

    /**
     * @return 日産単価
     */
    public String getNissanTanka() {
        return nissanTanka;
    }

    /**
     * @param p 日産単価
     */
    public void setNissanTanka(final String p) {
        this.nissanTanka = p;
    }

    /** 希望小売価格 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kouriKakaku;

    /**
     * @return 希望小売価格
     */
    public String getKouriKakaku() {
        return kouriKakaku;
    }

    /**
     * @param p 希望小売価格
     */
    public void setKouriKakaku(final String p) {
        this.kouriKakaku = p;
    }

    /** 商品区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String shohinkbn;

    /**
     * @return 商品区分
     */
    public String getShohinkbn() {
        return shohinkbn;
    }

    /**
     * @param p 商品区分
     */
    public void setShohinkbn(final String p) {
        this.shohinkbn = p;
    }

    /** パーソナル区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String persokbn;

    /**
     * @return パーソナル区分
     */
    public String getPersokbn() {
        return persokbn;
    }

    /**
     * @param p パーソナル区分
     */
    public void setPersokbn(final String p) {
        this.persokbn = p;
    }

    /** 価格体系区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String kakakukbn;

    /**
     * @return 価格体系区分
     */
    public String getKakakukbn() {
        return kakakukbn;
    }

    /**
     * @param p 価格体系区分
     */
    public void setKakakukbn(final String p) {
        this.kakakukbn = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 26)
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
