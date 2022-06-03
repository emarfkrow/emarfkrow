package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 直送先マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MChokuRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MChokuRegistForm.class);

    /** 直送先コード */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
    private String chokucd;

    /**
     * @return 直送先コード
     */
    public String getChokucd() {
        return chokucd;
    }

    /**
     * @param p 直送先コード
     */
    public void setChokucd(final String p) {
        this.chokucd = p;
    }

    /** 直送先名１ */
    @jakarta.validation.constraints.Size(max = 28)
    private String chokumei1;

    /**
     * @return 直送先名１
     */
    public String getChokumei1() {
        return chokumei1;
    }

    /**
     * @param p 直送先名１
     */
    public void setChokumei1(final String p) {
        this.chokumei1 = p;
    }

    /** 直送先名２ */
    @jakarta.validation.constraints.Size(max = 22)
    private String chokumei2;

    /**
     * @return 直送先名２
     */
    public String getChokumei2() {
        return chokumei2;
    }

    /**
     * @param p 直送先名２
     */
    public void setChokumei2(final String p) {
        this.chokumei2 = p;
    }

    /** 略直送先名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String rchokumei;

    /**
     * @return 略直送先名
     */
    public String getRchokumei() {
        return rchokumei;
    }

    /**
     * @param p 略直送先名
     */
    public void setRchokumei(final String p) {
        this.rchokumei = p;
    }

    /** 直送先住所１ */
    @jakarta.validation.constraints.Size(max = 28)
    private String chokuJusho1;

    /**
     * @return 直送先住所１
     */
    public String getChokuJusho1() {
        return chokuJusho1;
    }

    /**
     * @param p 直送先住所１
     */
    public void setChokuJusho1(final String p) {
        this.chokuJusho1 = p;
    }

    /** 直送先住所２ */
    @jakarta.validation.constraints.Size(max = 22)
    private String chokuJusho2;

    /**
     * @return 直送先住所２
     */
    public String getChokuJusho2() {
        return chokuJusho2;
    }

    /**
     * @param p 直送先住所２
     */
    public void setChokuJusho2(final String p) {
        this.chokuJusho2 = p;
    }

    /** 郵便番号 */
    @jakarta.validation.constraints.Size(max = 8)
    private String ubinno;

    /**
     * @return 郵便番号
     */
    public String getUbinno() {
        return ubinno;
    }

    /**
     * @param p 郵便番号
     */
    public void setUbinno(final String p) {
        this.ubinno = p;
    }

    /** 電話番号 */
    @jakarta.validation.constraints.Size(max = 12)
    private String telno;

    /**
     * @return 電話番号
     */
    public String getTelno() {
        return telno;
    }

    /**
     * @param p 電話番号
     */
    public void setTelno(final String p) {
        this.telno = p;
    }

    /** マスター登録日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String tourokubi;

    /**
     * @return マスター登録日
     */
    public String getTourokubi() {
        return tourokubi;
    }

    /**
     * @param p マスター登録日
     */
    public void setTourokubi(final String p) {
        this.tourokubi = p;
    }

    /** カナ直送先名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String kchokumei;

    /**
     * @return カナ直送先名
     */
    public String getKchokumei() {
        return kchokumei;
    }

    /**
     * @param p カナ直送先名
     */
    public void setKchokumei(final String p) {
        this.kchokumei = p;
    }

    /** 市町村コード */
    @jakarta.validation.constraints.Size(max = 6)
    private String sichocd;

    /**
     * @return 市町村コード
     */
    public String getSichocd() {
        return sichocd;
    }

    /**
     * @param p 市町村コード
     */
    public void setSichocd(final String p) {
        this.sichocd = p;
    }

    /** ＦＡＸ番号 */
    @jakarta.validation.constraints.Size(max = 12)
    private String faxno;

    /**
     * @return ＦＡＸ番号
     */
    public String getFaxno() {
        return faxno;
    }

    /**
     * @param p ＦＡＸ番号
     */
    public void setFaxno(final String p) {
        this.faxno = p;
    }

    /** 注文自動取消区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String torikesiKbn;

    /**
     * @return 注文自動取消区分
     */
    public String getTorikesiKbn() {
        return torikesiKbn;
    }

    /**
     * @param p 注文自動取消区分
     */
    public void setTorikesiKbn(final String p) {
        this.torikesiKbn = p;
    }

    /** 運送会社コード */
    @jakarta.validation.constraints.Size(max = 3)
    private String unsocd;

    /**
     * @return 運送会社コード
     */
    public String getUnsocd() {
        return unsocd;
    }

    /**
     * @param p 運送会社コード
     */
    public void setUnsocd(final String p) {
        this.unsocd = p;
    }

    /** 地区コード */
    @jakarta.validation.constraints.Size(max = 1)
    private String tikucd;

    /**
     * @return 地区コード
     */
    public String getTikucd() {
        return tikucd;
    }

    /**
     * @param p 地区コード
     */
    public void setTikucd(final String p) {
        this.tikucd = p;
    }

    /** 都道府県コード */
    @jakarta.validation.constraints.Size(max = 1)
    private String todofukencd;

    /**
     * @return 都道府県コード
     */
    public String getTodofukencd() {
        return todofukencd;
    }

    /**
     * @param p 都道府県コード
     */
    public void setTodofukencd(final String p) {
        this.todofukencd = p;
    }

    /** 更新禁止区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String updnkinkbn;

    /**
     * @return 更新禁止区分
     */
    public String getUpdnkinkbn() {
        return updnkinkbn;
    }

    /**
     * @param p 更新禁止区分
     */
    public void setUpdnkinkbn(final String p) {
        this.updnkinkbn = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 9)
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
