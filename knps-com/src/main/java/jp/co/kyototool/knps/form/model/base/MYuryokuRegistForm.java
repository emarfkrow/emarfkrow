package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 有力店マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MYuryokuRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MYuryokuRegistForm.class);

    /** 有力店コード */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
    private String yuryocd;

    /**
     * @return 有力店コード
     */
    public String getYuryocd() {
        return yuryocd;
    }

    /**
     * @param p 有力店コード
     */
    public void setYuryocd(final String p) {
        this.yuryocd = p;
    }

    /** 略有力店名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String ryuryokumei;

    /**
     * @return 略有力店名
     */
    public String getRyuryokumei() {
        return ryuryokumei;
    }

    /**
     * @param p 略有力店名
     */
    public void setRyuryokumei(final String p) {
        this.ryuryokumei = p;
    }

    /** 有力店名１ */
    @jakarta.validation.constraints.Size(max = 28)
    private String yuryomei1;

    /**
     * @return 有力店名１
     */
    public String getYuryomei1() {
        return yuryomei1;
    }

    /**
     * @param p 有力店名１
     */
    public void setYuryomei1(final String p) {
        this.yuryomei1 = p;
    }

    /** 有力店名２ */
    @jakarta.validation.constraints.Size(max = 22)
    private String yuryomei2;

    /**
     * @return 有力店名２
     */
    public String getYuryomei2() {
        return yuryomei2;
    }

    /**
     * @param p 有力店名２
     */
    public void setYuryomei2(final String p) {
        this.yuryomei2 = p;
    }

    /** 有力店住所１ */
    @jakarta.validation.constraints.Size(max = 28)
    private String yuryokuJusho1;

    /**
     * @return 有力店住所１
     */
    public String getYuryokuJusho1() {
        return yuryokuJusho1;
    }

    /**
     * @param p 有力店住所１
     */
    public void setYuryokuJusho1(final String p) {
        this.yuryokuJusho1 = p;
    }

    /** 有力店住所２ */
    @jakarta.validation.constraints.Size(max = 22)
    private String yuryokuJusho2;

    /**
     * @return 有力店住所２
     */
    public String getYuryokuJusho2() {
        return yuryokuJusho2;
    }

    /**
     * @param p 有力店住所２
     */
    public void setYuryokuJusho2(final String p) {
        this.yuryokuJusho2 = p;
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

    /** カナ有力店名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String kyuryokumei;

    /**
     * @return カナ有力店名
     */
    public String getKyuryokumei() {
        return kyuryokumei;
    }

    /**
     * @param p カナ有力店名
     */
    public void setKyuryokumei(final String p) {
        this.kyuryokumei = p;
    }

    /** 期 */
    @jakarta.validation.constraints.Size(max = 2)
    private String ki;

    /**
     * @return 期
     */
    public String getKi() {
        return ki;
    }

    /**
     * @param p 期
     */
    public void setKi(final String p) {
        this.ki = p;
    }

    /** 上期購入額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String kamiKonyu;

    /**
     * @return 上期購入額
     */
    public String getKamiKonyu() {
        return kamiKonyu;
    }

    /**
     * @param p 上期購入額
     */
    public void setKamiKonyu(final String p) {
        this.kamiKonyu = p;
    }

    /** 上期支払対象額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String kamiSiharai;

    /**
     * @return 上期支払対象額
     */
    public String getKamiSiharai() {
        return kamiSiharai;
    }

    /**
     * @param p 上期支払対象額
     */
    public void setKamiSiharai(final String p) {
        this.kamiSiharai = p;
    }

    /** 上期有ボ支払率 */
    @jakarta.validation.constraints.Size(max = 2)
    private String kamiYuboritu;

    /**
     * @return 上期有ボ支払率
     */
    public String getKamiYuboritu() {
        return kamiYuboritu;
    }

    /**
     * @param p 上期有ボ支払率
     */
    public void setKamiYuboritu(final String p) {
        this.kamiYuboritu = p;
    }

    /** 上期達成区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String kamiTasseikbn;

    /**
     * @return 上期達成区分
     */
    public String getKamiTasseikbn() {
        return kamiTasseikbn;
    }

    /**
     * @param p 上期達成区分
     */
    public void setKamiTasseikbn(final String p) {
        this.kamiTasseikbn = p;
    }

    /** 下期購入額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String simoKonyu;

    /**
     * @return 下期購入額
     */
    public String getSimoKonyu() {
        return simoKonyu;
    }

    /**
     * @param p 下期購入額
     */
    public void setSimoKonyu(final String p) {
        this.simoKonyu = p;
    }

    /** 下期支払対象額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String simoSiharai;

    /**
     * @return 下期支払対象額
     */
    public String getSimoSiharai() {
        return simoSiharai;
    }

    /**
     * @param p 下期支払対象額
     */
    public void setSimoSiharai(final String p) {
        this.simoSiharai = p;
    }

    /** 下期有ボ支払率 */
    @jakarta.validation.constraints.Size(max = 2)
    private String simoYuboritu;

    /**
     * @return 下期有ボ支払率
     */
    public String getSimoYuboritu() {
        return simoYuboritu;
    }

    /**
     * @param p 下期有ボ支払率
     */
    public void setSimoYuboritu(final String p) {
        this.simoYuboritu = p;
    }

    /** 下期達成区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String simoTasseikbn;

    /**
     * @return 下期達成区分
     */
    public String getSimoTasseikbn() {
        return simoTasseikbn;
    }

    /**
     * @param p 下期達成区分
     */
    public void setSimoTasseikbn(final String p) {
        this.simoTasseikbn = p;
    }

    /** 有力店会区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String yutenkaikbn;

    /**
     * @return 有力店会区分
     */
    public String getYutenkaikbn() {
        return yutenkaikbn;
    }

    /**
     * @param p 有力店会区分
     */
    public void setYutenkaikbn(final String p) {
        this.yutenkaikbn = p;
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

    /** 有ボ率区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String ritukbn;

    /**
     * @return 有ボ率区分
     */
    public String getRitukbn() {
        return ritukbn;
    }

    /**
     * @param p 有ボ率区分
     */
    public void setRitukbn(final String p) {
        this.ritukbn = p;
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

    /** 有力店ランク */
    @jakarta.validation.constraints.Size(max = 2)
    private String yuryokuRank;

    /**
     * @return 有力店ランク
     */
    public String getYuryokuRank() {
        return yuryokuRank;
    }

    /**
     * @param p 有力店ランク
     */
    public void setYuryokuRank(final String p) {
        this.yuryokuRank = p;
    }

    /** 戦略店区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String stkbn;

    /**
     * @return 戦略店区分
     */
    public String getStkbn() {
        return stkbn;
    }

    /**
     * @param p 戦略店区分
     */
    public void setStkbn(final String p) {
        this.stkbn = p;
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
