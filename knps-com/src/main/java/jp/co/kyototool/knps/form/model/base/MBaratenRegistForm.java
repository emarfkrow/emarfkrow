package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * バラ展開マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MBaratenRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MBaratenRegistForm.class);

    /** 親品番 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String oyaHinban;

    /**
     * @return 親品番
     */
    public String getOyaHinban() {
        return oyaHinban;
    }

    /**
     * @param p 親品番
     */
    public void setOyaHinban(final String p) {
        this.oyaHinban = p;
    }

    /** 子品番 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String koHinban;

    /**
     * @return 子品番
     */
    public String getKoHinban() {
        return koHinban;
    }

    /**
     * @param p 子品番
     */
    public void setKoHinban(final String p) {
        this.koHinban = p;
    }

    /** 親品目コード */
    @jakarta.validation.constraints.Size(max = 20)
    private String oyaHinc;

    /**
     * @return 親品目コード
     */
    public String getOyaHinc() {
        return oyaHinc;
    }

    /**
     * @param p 親品目コード
     */
    public void setOyaHinc(final String p) {
        this.oyaHinc = p;
    }

    /** 子品目コード */
    @jakarta.validation.constraints.Size(max = 20)
    private String koHinc;

    /**
     * @return 子品目コード
     */
    public String getKoHinc() {
        return koHinc;
    }

    /**
     * @param p 子品目コード
     */
    public void setKoHinc(final String p) {
        this.koHinc = p;
    }

    /** 員数 */
    @jakarta.validation.constraints.Size(max = 3)
    private String inzu;

    /**
     * @return 員数
     */
    public String getInzu() {
        return inzu;
    }

    /**
     * @param p 員数
     */
    public void setInzu(final String p) {
        this.inzu = p;
    }

    /** 親売価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String oyaBaika;

    /**
     * @return 親売価
     */
    public String getOyaBaika() {
        return oyaBaika;
    }

    /**
     * @param p 親売価
     */
    public void setOyaBaika(final String p) {
        this.oyaBaika = p;
    }

    /** 親原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String oyaGenka;

    /**
     * @return 親原価
     */
    public String getOyaGenka() {
        return oyaGenka;
    }

    /**
     * @param p 親原価
     */
    public void setOyaGenka(final String p) {
        this.oyaGenka = p;
    }

    /** 子単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String koTanka;

    /**
     * @return 子単価
     */
    public String getKoTanka() {
        return koTanka;
    }

    /**
     * @param p 子単価
     */
    public void setKoTanka(final String p) {
        this.koTanka = p;
    }

    /** 子原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String koGenka;

    /**
     * @return 子原価
     */
    public String getKoGenka() {
        return koGenka;
    }

    /**
     * @param p 子原価
     */
    public void setKoGenka(final String p) {
        this.koGenka = p;
    }

    /** 子単価率 */
    @jakarta.validation.constraints.Size(max = 3)
    private String koTanritu;

    /**
     * @return 子単価率
     */
    public String getKoTanritu() {
        return koTanritu;
    }

    /**
     * @param p 子単価率
     */
    public void setKoTanritu(final String p) {
        this.koTanritu = p;
    }

    /** 検索マスター */
    @jakarta.validation.constraints.Size(max = 4)
    private String kensakum;

    /**
     * @return 検索マスター
     */
    public String getKensakum() {
        return kensakum;
    }

    /**
     * @param p 検索マスター
     */
    public void setKensakum(final String p) {
        this.kensakum = p;
    }

    /** ケース区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String casekbn;

    /**
     * @return ケース区分
     */
    public String getCasekbn() {
        return casekbn;
    }

    /**
     * @param p ケース区分
     */
    public void setCasekbn(final String p) {
        this.casekbn = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 16)
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
