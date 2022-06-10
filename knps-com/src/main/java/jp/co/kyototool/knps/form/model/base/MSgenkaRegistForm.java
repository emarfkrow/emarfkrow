package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 製品原価マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSgenkaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSgenkaRegistForm.class);

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

    /** 品目コード */
    @jakarta.validation.constraints.Size(max = 20)
    private String hincd;

    /**
     * @return 品目コード
     */
    public String getHincd() {
        return hincd;
    }

    /**
     * @param p 品目コード
     */
    public void setHincd(final String p) {
        this.hincd = p;
    }

    /** セット区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String setkbn;

    /**
     * @return セット区分
     */
    public String getSetkbn() {
        return setkbn;
    }

    /**
     * @param p セット区分
     */
    public void setSetkbn(final String p) {
        this.setkbn = p;
    }

    /** 原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String genka;

    /**
     * @return 原価
     */
    public String getGenka() {
        return genka;
    }

    /**
     * @param p 原価
     */
    public void setGenka(final String p) {
        this.genka = p;
    }

    /** 製品原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String seihinGenka;

    /**
     * @return 製品原価
     */
    public String getSeihinGenka() {
        return seihinGenka;
    }

    /**
     * @param p 製品原価
     */
    public void setSeihinGenka(final String p) {
        this.seihinGenka = p;
    }

    /** 商品原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String shohinGenka;

    /**
     * @return 商品原価
     */
    public String getShohinGenka() {
        return shohinGenka;
    }

    /**
     * @param p 商品原価
     */
    public void setShohinGenka(final String p) {
        this.shohinGenka = p;
    }

    /** 売価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String baika;

    /**
     * @return 売価
     */
    public String getBaika() {
        return baika;
    }

    /**
     * @param p 売価
     */
    public void setBaika(final String p) {
        this.baika = p;
    }

    /** 製品売価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String seihinBaika;

    /**
     * @return 製品売価
     */
    public String getSeihinBaika() {
        return seihinBaika;
    }

    /**
     * @param p 製品売価
     */
    public void setSeihinBaika(final String p) {
        this.seihinBaika = p;
    }

    /** 商品売価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String shohinBaika;

    /**
     * @return 商品売価
     */
    public String getShohinBaika() {
        return shohinBaika;
    }

    /**
     * @param p 商品売価
     */
    public void setShohinBaika(final String p) {
        this.shohinBaika = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
