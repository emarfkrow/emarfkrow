package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * セール品目マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSalehinRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSalehinRegistForm.class);

    /** セール区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String salekbn;

    /**
     * @return セール区分
     */
    public String getSalekbn() {
        return salekbn;
    }

    /**
     * @param p セール区分
     */
    public void setSalekbn(final String p) {
        this.salekbn = p;
    }

    /** セール名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String salemei;

    /**
     * @return セール名
     */
    public String getSalemei() {
        return salemei;
    }

    /**
     * @param p セール名
     */
    public void setSalemei(final String p) {
        this.salemei = p;
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

    /** 開始年 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 4)
    private String kaisiYy;

    /**
     * @return 開始年
     */
    public String getKaisiYy() {
        return kaisiYy;
    }

    /**
     * @param p 開始年
     */
    public void setKaisiYy(final String p) {
        this.kaisiYy = p;
    }

    /** 開始月 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String kaisiMm;

    /**
     * @return 開始月
     */
    public String getKaisiMm() {
        return kaisiMm;
    }

    /**
     * @param p 開始月
     */
    public void setKaisiMm(final String p) {
        this.kaisiMm = p;
    }

    /** 開始日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String kaisiDd;

    /**
     * @return 開始日
     */
    public String getKaisiDd() {
        return kaisiDd;
    }

    /**
     * @param p 開始日
     */
    public void setKaisiDd(final String p) {
        this.kaisiDd = p;
    }

    /** 終了年 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 4)
    private String shuryoYy;

    /**
     * @return 終了年
     */
    public String getShuryoYy() {
        return shuryoYy;
    }

    /**
     * @param p 終了年
     */
    public void setShuryoYy(final String p) {
        this.shuryoYy = p;
    }

    /** 終了月 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String shuryoMm;

    /**
     * @return 終了月
     */
    public String getShuryoMm() {
        return shuryoMm;
    }

    /**
     * @param p 終了月
     */
    public void setShuryoMm(final String p) {
        this.shuryoMm = p;
    }

    /** 終了日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String shuryoDd;

    /**
     * @return 終了日
     */
    public String getShuryoDd() {
        return shuryoDd;
    }

    /**
     * @param p 終了日
     */
    public void setShuryoDd(final String p) {
        this.shuryoDd = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 32)
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
