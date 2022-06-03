package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ネプロス特約店マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MTokuyakRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MTokuyakRegistForm.class);

    /** 特約店コード */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
    private String tokuyakucd;

    /**
     * @return 特約店コード
     */
    public String getTokuyakucd() {
        return tokuyakucd;
    }

    /**
     * @param p 特約店コード
     */
    public void setTokuyakucd(final String p) {
        this.tokuyakucd = p;
    }

    /** 得意先コード */
    @jakarta.validation.constraints.Size(max = 8)
    private String tokucd;

    /**
     * @return 得意先コード
     */
    public String getTokucd() {
        return tokucd;
    }

    /**
     * @param p 得意先コード
     */
    public void setTokucd(final String p) {
        this.tokucd = p;
    }

    /** 本社特約店コード */
    @jakarta.validation.constraints.Size(max = 8)
    private String htokuyakucd;

    /**
     * @return 本社特約店コード
     */
    public String getHtokuyakucd() {
        return htokuyakucd;
    }

    /**
     * @param p 本社特約店コード
     */
    public void setHtokuyakucd(final String p) {
        this.htokuyakucd = p;
    }

    /** 営業区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String eigyokbn;

    /**
     * @return 営業区分
     */
    public String getEigyokbn() {
        return eigyokbn;
    }

    /**
     * @param p 営業区分
     */
    public void setEigyokbn(final String p) {
        this.eigyokbn = p;
    }

    /** 有力店資格区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String yuryokukbn;

    /**
     * @return 有力店資格区分
     */
    public String getYuryokukbn() {
        return yuryokukbn;
    }

    /**
     * @param p 有力店資格区分
     */
    public void setYuryokukbn(final String p) {
        this.yuryokukbn = p;
    }

    /** 業種区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String gyoshuKbn;

    /**
     * @return 業種区分
     */
    public String getGyoshuKbn() {
        return gyoshuKbn;
    }

    /**
     * @param p 業種区分
     */
    public void setGyoshuKbn(final String p) {
        this.gyoshuKbn = p;
    }

    /** 略特約店名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String rtokuyakumei;

    /**
     * @return 略特約店名
     */
    public String getRtokuyakumei() {
        return rtokuyakumei;
    }

    /**
     * @param p 略特約店名
     */
    public void setRtokuyakumei(final String p) {
        this.rtokuyakumei = p;
    }

    /** 特約店名１ */
    @jakarta.validation.constraints.Size(max = 28)
    private String tokuyakumei1;

    /**
     * @return 特約店名１
     */
    public String getTokuyakumei1() {
        return tokuyakumei1;
    }

    /**
     * @param p 特約店名１
     */
    public void setTokuyakumei1(final String p) {
        this.tokuyakumei1 = p;
    }

    /** 特約店名２ */
    @jakarta.validation.constraints.Size(max = 22)
    private String tokuyakumei2;

    /**
     * @return 特約店名２
     */
    public String getTokuyakumei2() {
        return tokuyakumei2;
    }

    /**
     * @param p 特約店名２
     */
    public void setTokuyakumei2(final String p) {
        this.tokuyakumei2 = p;
    }

    /** 特約店住所１ */
    @jakarta.validation.constraints.Size(max = 28)
    private String tokuyakuJusho1;

    /**
     * @return 特約店住所１
     */
    public String getTokuyakuJusho1() {
        return tokuyakuJusho1;
    }

    /**
     * @param p 特約店住所１
     */
    public void setTokuyakuJusho1(final String p) {
        this.tokuyakuJusho1 = p;
    }

    /** 特約店住所２ */
    @jakarta.validation.constraints.Size(max = 22)
    private String tokuyakuJusho2;

    /**
     * @return 特約店住所２
     */
    public String getTokuyakuJusho2() {
        return tokuyakuJusho2;
    }

    /**
     * @param p 特約店住所２
     */
    public void setTokuyakuJusho2(final String p) {
        this.tokuyakuJusho2 = p;
    }

    /** カナ特約店名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String ktokuyakumei;

    /**
     * @return カナ特約店名
     */
    public String getKtokuyakumei() {
        return ktokuyakumei;
    }

    /**
     * @param p カナ特約店名
     */
    public void setKtokuyakumei(final String p) {
        this.ktokuyakumei = p;
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

    /** 取引停止区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String torihikiKbn;

    /**
     * @return 取引停止区分
     */
    public String getTorihikiKbn() {
        return torihikiKbn;
    }

    /**
     * @param p 取引停止区分
     */
    public void setTorihikiKbn(final String p) {
        this.torihikiKbn = p;
    }

    /** ネプロス今期受注金額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String konNpjuchukin;

    /**
     * @return ネプロス今期受注金額
     */
    public String getKonNpjuchukin() {
        return konNpjuchukin;
    }

    /**
     * @param p ネプロス今期受注金額
     */
    public void setKonNpjuchukin(final String p) {
        this.konNpjuchukin = p;
    }

    /** ネプロス今期出荷金額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String konNpshukka;

    /**
     * @return ネプロス今期出荷金額
     */
    public String getKonNpshukka() {
        return konNpshukka;
    }

    /**
     * @param p ネプロス今期出荷金額
     */
    public void setKonNpshukka(final String p) {
        this.konNpshukka = p;
    }

    /** ネプロス前期受注金額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String zenNpjuchukin;

    /**
     * @return ネプロス前期受注金額
     */
    public String getZenNpjuchukin() {
        return zenNpjuchukin;
    }

    /**
     * @param p ネプロス前期受注金額
     */
    public void setZenNpjuchukin(final String p) {
        this.zenNpjuchukin = p;
    }

    /** ネプロス前期出荷金額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String zenNpshukka;

    /**
     * @return ネプロス前期出荷金額
     */
    public String getZenNpshukka() {
        return zenNpshukka;
    }

    /**
     * @param p ネプロス前期出荷金額
     */
    public void setZenNpshukka(final String p) {
        this.zenNpshukka = p;
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

    /** ＦＡＸ区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String faxkbn;

    /**
     * @return ＦＡＸ区分
     */
    public String getFaxkbn() {
        return faxkbn;
    }

    /**
     * @param p ＦＡＸ区分
     */
    public void setFaxkbn(final String p) {
        this.faxkbn = p;
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

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 8)
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
