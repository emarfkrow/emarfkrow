package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 得意先マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MTokuiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MTokuiRegistForm.class);

    /** 得意先コード */
    @jakarta.validation.constraints.NotBlank
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

    /** 得意先名１ */
    @jakarta.validation.constraints.Size(max = 28)
    private String tokumei1;

    /**
     * @return 得意先名１
     */
    public String getTokumei1() {
        return tokumei1;
    }

    /**
     * @param p 得意先名１
     */
    public void setTokumei1(final String p) {
        this.tokumei1 = p;
    }

    /** 得意先名２ */
    @jakarta.validation.constraints.Size(max = 22)
    private String tokumei2;

    /**
     * @return 得意先名２
     */
    public String getTokumei2() {
        return tokumei2;
    }

    /**
     * @param p 得意先名２
     */
    public void setTokumei2(final String p) {
        this.tokumei2 = p;
    }

    /** 略得意先名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String rtokumei;

    /**
     * @return 略得意先名
     */
    public String getRtokumei() {
        return rtokumei;
    }

    /**
     * @param p 略得意先名
     */
    public void setRtokumei(final String p) {
        this.rtokumei = p;
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

    /** 得意先住所１ */
    @jakarta.validation.constraints.Size(max = 28)
    private String tokuJusho1;

    /**
     * @return 得意先住所１
     */
    public String getTokuJusho1() {
        return tokuJusho1;
    }

    /**
     * @param p 得意先住所１
     */
    public void setTokuJusho1(final String p) {
        this.tokuJusho1 = p;
    }

    /** 得意先住所２ */
    @jakarta.validation.constraints.Size(max = 22)
    private String tokuJusho2;

    /**
     * @return 得意先住所２
     */
    public String getTokuJusho2() {
        return tokuJusho2;
    }

    /**
     * @param p 得意先住所２
     */
    public void setTokuJusho2(final String p) {
        this.tokuJusho2 = p;
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

    /** 請求先コード */
    @jakarta.validation.constraints.Size(max = 8)
    private String seikyucd;

    /**
     * @return 請求先コード
     */
    public String getSeikyucd() {
        return seikyucd;
    }

    /**
     * @param p 請求先コード
     */
    public void setSeikyucd(final String p) {
        this.seikyucd = p;
    }

    /** メール先コード */
    @jakarta.validation.constraints.Size(max = 8)
    private String mailcd;

    /**
     * @return メール先コード
     */
    public String getMailcd() {
        return mailcd;
    }

    /**
     * @param p メール先コード
     */
    public void setMailcd(final String p) {
        this.mailcd = p;
    }

    /** 集金先コード */
    @jakarta.validation.constraints.Size(max = 8)
    private String shukincd;

    /**
     * @return 集金先コード
     */
    public String getShukincd() {
        return shukincd;
    }

    /**
     * @param p 集金先コード
     */
    public void setShukincd(final String p) {
        this.shukincd = p;
    }

    /** 本社コード */
    @jakarta.validation.constraints.Size(max = 8)
    private String honshacd;

    /**
     * @return 本社コード
     */
    public String getHonshacd() {
        return honshacd;
    }

    /**
     * @param p 本社コード
     */
    public void setHonshacd(final String p) {
        this.honshacd = p;
    }

    /** 集計先コード */
    @jakarta.validation.constraints.Size(max = 8)
    private String shukeicd;

    /**
     * @return 集計先コード
     */
    public String getShukeicd() {
        return shukeicd;
    }

    /**
     * @param p 集計先コード
     */
    public void setShukeicd(final String p) {
        this.shukeicd = p;
    }

    /** 単価資格区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String tankakbn;

    /**
     * @return 単価資格区分
     */
    public String getTankakbn() {
        return tankakbn;
    }

    /**
     * @param p 単価資格区分
     */
    public void setTankakbn(final String p) {
        this.tankakbn = p;
    }

    /** ボーナス区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String bonuskbn;

    /**
     * @return ボーナス区分
     */
    public String getBonuskbn() {
        return bonuskbn;
    }

    /**
     * @param p ボーナス区分
     */
    public void setBonuskbn(final String p) {
        this.bonuskbn = p;
    }

    /** 納品書区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String nohinkbn;

    /**
     * @return 納品書区分
     */
    public String getNohinkbn() {
        return nohinkbn;
    }

    /**
     * @param p 納品書区分
     */
    public void setNohinkbn(final String p) {
        this.nohinkbn = p;
    }

    /** 納品書発行区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String hakkokbn;

    /**
     * @return 納品書発行区分
     */
    public String getHakkokbn() {
        return hakkokbn;
    }

    /**
     * @param p 納品書発行区分
     */
    public void setHakkokbn(final String p) {
        this.hakkokbn = p;
    }

    /** 納品書フォーム区分 */
    @jakarta.validation.constraints.Size(max = 3)
    private String nohinformkbn;

    /**
     * @return 納品書フォーム区分
     */
    public String getNohinformkbn() {
        return nohinformkbn;
    }

    /**
     * @param p 納品書フォーム区分
     */
    public void setNohinformkbn(final String p) {
        this.nohinformkbn = p;
    }

    /** 仕向け区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String simukekbn;

    /**
     * @return 仕向け区分
     */
    public String getSimukekbn() {
        return simukekbn;
    }

    /**
     * @param p 仕向け区分
     */
    public void setSimukekbn(final String p) {
        this.simukekbn = p;
    }

    /** 営業所区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String eigyokbn;

    /**
     * @return 営業所区分
     */
    public String getEigyokbn() {
        return eigyokbn;
    }

    /**
     * @param p 営業所区分
     */
    public void setEigyokbn(final String p) {
        this.eigyokbn = p;
    }

    /** 予備領域１ */
    @jakarta.validation.constraints.Size(max = 1)
    private String filler1;

    /**
     * @return 予備領域１
     */
    public String getFiller1() {
        return filler1;
    }

    /**
     * @param p 予備領域１
     */
    public void setFiller1(final String p) {
        this.filler1 = p;
    }

    /** 金額レス区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String kinlesskbn;

    /**
     * @return 金額レス区分
     */
    public String getKinlesskbn() {
        return kinlesskbn;
    }

    /**
     * @param p 金額レス区分
     */
    public void setKinlesskbn(final String p) {
        this.kinlesskbn = p;
    }

    /** 正協レス区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String seikyokbn;

    /**
     * @return 正協レス区分
     */
    public String getSeikyokbn() {
        return seikyokbn;
    }

    /**
     * @param p 正協レス区分
     */
    public void setSeikyokbn(final String p) {
        this.seikyokbn = p;
    }

    /** 地区締切日 */
    @jakarta.validation.constraints.Size(max = 2)
    private String tikusimebi;

    /**
     * @return 地区締切日
     */
    public String getTikusimebi() {
        return tikusimebi;
    }

    /**
     * @param p 地区締切日
     */
    public void setTikusimebi(final String p) {
        this.tikusimebi = p;
    }

    /** 得意先締切日 */
    @jakarta.validation.constraints.Size(max = 2)
    private String misesimebi;

    /**
     * @return 得意先締切日
     */
    public String getMisesimebi() {
        return misesimebi;
    }

    /**
     * @param p 得意先締切日
     */
    public void setMisesimebi(final String p) {
        this.misesimebi = p;
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

    /** 受注禁止区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String jukinkbn;

    /**
     * @return 受注禁止区分
     */
    public String getJukinkbn() {
        return jukinkbn;
    }

    /**
     * @param p 受注禁止区分
     */
    public void setJukinkbn(final String p) {
        this.jukinkbn = p;
    }

    /** 転売禁止区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String tenkinkbn;

    /**
     * @return 転売禁止区分
     */
    public String getTenkinkbn() {
        return tenkinkbn;
    }

    /**
     * @param p 転売禁止区分
     */
    public void setTenkinkbn(final String p) {
        this.tenkinkbn = p;
    }

    /** 売上集計区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String urisumkbn;

    /**
     * @return 売上集計区分
     */
    public String getUrisumkbn() {
        return urisumkbn;
    }

    /**
     * @param p 売上集計区分
     */
    public void setUrisumkbn(final String p) {
        this.urisumkbn = p;
    }

    /** ＤＩＹ区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String diykbn;

    /**
     * @return ＤＩＹ区分
     */
    public String getDiykbn() {
        return diykbn;
    }

    /**
     * @param p ＤＩＹ区分
     */
    public void setDiykbn(final String p) {
        this.diykbn = p;
    }

    /** カナ得意先名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String ktokumei;

    /**
     * @return カナ得意先名
     */
    public String getKtokumei() {
        return ktokumei;
    }

    /**
     * @param p カナ得意先名
     */
    public void setKtokumei(final String p) {
        this.ktokumei = p;
    }

    /** 消費税区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String zeikbn;

    /**
     * @return 消費税区分
     */
    public String getZeikbn() {
        return zeikbn;
    }

    /**
     * @param p 消費税区分
     */
    public void setZeikbn(final String p) {
        this.zeikbn = p;
    }

    /** 営業担当者コード */
    @jakarta.validation.constraints.Size(max = 4)
    private String eiTantocd;

    /**
     * @return 営業担当者コード
     */
    public String getEiTantocd() {
        return eiTantocd;
    }

    /**
     * @param p 営業担当者コード
     */
    public void setEiTantocd(final String p) {
        this.eiTantocd = p;
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

    /** 得意先区分１ */
    @jakarta.validation.constraints.Size(max = 2)
    private String tokuikbn1;

    /**
     * @return 得意先区分１
     */
    public String getTokuikbn1() {
        return tokuikbn1;
    }

    /**
     * @param p 得意先区分１
     */
    public void setTokuikbn1(final String p) {
        this.tokuikbn1 = p;
    }

    /** 得意先区分２ */
    @jakarta.validation.constraints.Size(max = 2)
    private String tokuikbn2;

    /**
     * @return 得意先区分２
     */
    public String getTokuikbn2() {
        return tokuikbn2;
    }

    /**
     * @param p 得意先区分２
     */
    public void setTokuikbn2(final String p) {
        this.tokuikbn2 = p;
    }

    /** 得意先区分３ */
    @jakarta.validation.constraints.Size(max = 2)
    private String tokuikbn3;

    /**
     * @return 得意先区分３
     */
    public String getTokuikbn3() {
        return tokuikbn3;
    }

    /**
     * @param p 得意先区分３
     */
    public void setTokuikbn3(final String p) {
        this.tokuikbn3 = p;
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

    /** 売上集計区分明細 */
    @jakarta.validation.constraints.Size(max = 2)
    private String urisumkbnm;

    /**
     * @return 売上集計区分明細
     */
    public String getUrisumkbnm() {
        return urisumkbnm;
    }

    /**
     * @param p 売上集計区分明細
     */
    public void setUrisumkbnm(final String p) {
        this.urisumkbnm = p;
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

    /** 営業エリアコード */
    @jakarta.validation.constraints.Size(max = 1)
    private String eigyoareacd;

    /**
     * @return 営業エリアコード
     */
    public String getEigyoareacd() {
        return eigyoareacd;
    }

    /**
     * @param p 営業エリアコード
     */
    public void setEigyoareacd(final String p) {
        this.eigyoareacd = p;
    }

    /** 検収期間 */
    @jakarta.validation.constraints.Size(max = 2)
    private String kensyukikan;

    /**
     * @return 検収期間
     */
    public String getKensyukikan() {
        return kensyukikan;
    }

    /**
     * @param p 検収期間
     */
    public void setKensyukikan(final String p) {
        this.kensyukikan = p;
    }

    /** 請求発行区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String eSeikyukbn;

    /**
     * @return 請求発行区分
     */
    public String getESeikyukbn() {
        return eSeikyukbn;
    }

    /**
     * @param p 請求発行区分
     */
    public void setESeikyukbn(final String p) {
        this.eSeikyukbn = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 17)
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
