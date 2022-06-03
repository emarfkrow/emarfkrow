package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 得意先マスタ
 *
 * @author emarfkrow
 */
public class MTokui implements IEntity {

    /** 得意先コード */
    private java.math.BigDecimal tokucd;

    /**
     * @return 得意先コード
     */
    public java.math.BigDecimal getTokucd() {
        return this.tokucd;
    }

    /**
     * @param o 得意先コード
     */
    public void setTokucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokucd = new java.math.BigDecimal(o.toString());
        } else {
            this.tokucd = null;
        }
    }

    /** 得意先名１ */
    private String tokumei1;

    /**
     * @return 得意先名１
     */
    public String getTokumei1() {
        return this.tokumei1;
    }

    /**
     * @param o 得意先名１
     */
    public void setTokumei1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokumei1 = String.valueOf(o.toString());
        } else {
            this.tokumei1 = null;
        }
    }

    /** 得意先名２ */
    private String tokumei2;

    /**
     * @return 得意先名２
     */
    public String getTokumei2() {
        return this.tokumei2;
    }

    /**
     * @param o 得意先名２
     */
    public void setTokumei2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokumei2 = String.valueOf(o.toString());
        } else {
            this.tokumei2 = null;
        }
    }

    /** 略得意先名 */
    private String rtokumei;

    /**
     * @return 略得意先名
     */
    public String getRtokumei() {
        return this.rtokumei;
    }

    /**
     * @param o 略得意先名
     */
    public void setRtokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rtokumei = String.valueOf(o.toString());
        } else {
            this.rtokumei = null;
        }
    }

    /** 郵便番号 */
    private String ubinno;

    /**
     * @return 郵便番号
     */
    public String getUbinno() {
        return this.ubinno;
    }

    /**
     * @param o 郵便番号
     */
    public void setUbinno(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ubinno = String.valueOf(o.toString());
        } else {
            this.ubinno = null;
        }
    }

    /** 得意先住所１ */
    private String tokuJusho1;

    /**
     * @return 得意先住所１
     */
    public String getTokuJusho1() {
        return this.tokuJusho1;
    }

    /**
     * @param o 得意先住所１
     */
    public void setTokuJusho1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuJusho1 = String.valueOf(o.toString());
        } else {
            this.tokuJusho1 = null;
        }
    }

    /** 得意先住所２ */
    private String tokuJusho2;

    /**
     * @return 得意先住所２
     */
    public String getTokuJusho2() {
        return this.tokuJusho2;
    }

    /**
     * @param o 得意先住所２
     */
    public void setTokuJusho2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuJusho2 = String.valueOf(o.toString());
        } else {
            this.tokuJusho2 = null;
        }
    }

    /** 電話番号 */
    private String telno;

    /**
     * @return 電話番号
     */
    public String getTelno() {
        return this.telno;
    }

    /**
     * @param o 電話番号
     */
    public void setTelno(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.telno = String.valueOf(o.toString());
        } else {
            this.telno = null;
        }
    }

    /** 請求先コード */
    private java.math.BigDecimal seikyucd;

    /**
     * @return 請求先コード
     */
    public java.math.BigDecimal getSeikyucd() {
        return this.seikyucd;
    }

    /**
     * @param o 請求先コード
     */
    public void setSeikyucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.seikyucd = new java.math.BigDecimal(o.toString());
        } else {
            this.seikyucd = null;
        }
    }

    /** メール先コード */
    private java.math.BigDecimal mailcd;

    /**
     * @return メール先コード
     */
    public java.math.BigDecimal getMailcd() {
        return this.mailcd;
    }

    /**
     * @param o メール先コード
     */
    public void setMailcd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mailcd = new java.math.BigDecimal(o.toString());
        } else {
            this.mailcd = null;
        }
    }

    /** 集金先コード */
    private java.math.BigDecimal shukincd;

    /**
     * @return 集金先コード
     */
    public java.math.BigDecimal getShukincd() {
        return this.shukincd;
    }

    /**
     * @param o 集金先コード
     */
    public void setShukincd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shukincd = new java.math.BigDecimal(o.toString());
        } else {
            this.shukincd = null;
        }
    }

    /** 本社コード */
    private java.math.BigDecimal honshacd;

    /**
     * @return 本社コード
     */
    public java.math.BigDecimal getHonshacd() {
        return this.honshacd;
    }

    /**
     * @param o 本社コード
     */
    public void setHonshacd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.honshacd = new java.math.BigDecimal(o.toString());
        } else {
            this.honshacd = null;
        }
    }

    /** 集計先コード */
    private java.math.BigDecimal shukeicd;

    /**
     * @return 集計先コード
     */
    public java.math.BigDecimal getShukeicd() {
        return this.shukeicd;
    }

    /**
     * @param o 集計先コード
     */
    public void setShukeicd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shukeicd = new java.math.BigDecimal(o.toString());
        } else {
            this.shukeicd = null;
        }
    }

    /** 単価資格区分 */
    private String tankakbn;

    /**
     * @return 単価資格区分
     */
    public String getTankakbn() {
        return this.tankakbn;
    }

    /**
     * @param o 単価資格区分
     */
    public void setTankakbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tankakbn = String.valueOf(o.toString());
        } else {
            this.tankakbn = null;
        }
    }

    /** ボーナス区分 */
    private String bonuskbn;

    /**
     * @return ボーナス区分
     */
    public String getBonuskbn() {
        return this.bonuskbn;
    }

    /**
     * @param o ボーナス区分
     */
    public void setBonuskbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bonuskbn = String.valueOf(o.toString());
        } else {
            this.bonuskbn = null;
        }
    }

    /** 納品書区分 */
    private String nohinkbn;

    /**
     * @return 納品書区分
     */
    public String getNohinkbn() {
        return this.nohinkbn;
    }

    /**
     * @param o 納品書区分
     */
    public void setNohinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinkbn = String.valueOf(o.toString());
        } else {
            this.nohinkbn = null;
        }
    }

    /** 納品書発行区分 */
    private String hakkokbn;

    /**
     * @return 納品書発行区分
     */
    public String getHakkokbn() {
        return this.hakkokbn;
    }

    /**
     * @param o 納品書発行区分
     */
    public void setHakkokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hakkokbn = String.valueOf(o.toString());
        } else {
            this.hakkokbn = null;
        }
    }

    /** 納品書フォーム区分 */
    private String nohinformkbn;

    /**
     * @return 納品書フォーム区分
     */
    public String getNohinformkbn() {
        return this.nohinformkbn;
    }

    /**
     * @param o 納品書フォーム区分
     */
    public void setNohinformkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinformkbn = String.valueOf(o.toString());
        } else {
            this.nohinformkbn = null;
        }
    }

    /** 仕向け区分 */
    private String simukekbn;

    /**
     * @return 仕向け区分
     */
    public String getSimukekbn() {
        return this.simukekbn;
    }

    /**
     * @param o 仕向け区分
     */
    public void setSimukekbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.simukekbn = String.valueOf(o.toString());
        } else {
            this.simukekbn = null;
        }
    }

    /** 営業所区分 */
    private String eigyokbn;

    /**
     * @return 営業所区分
     */
    public String getEigyokbn() {
        return this.eigyokbn;
    }

    /**
     * @param o 営業所区分
     */
    public void setEigyokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.eigyokbn = String.valueOf(o.toString());
        } else {
            this.eigyokbn = null;
        }
    }

    /** 予備領域１ */
    private String filler1;

    /**
     * @return 予備領域１
     */
    public String getFiller1() {
        return this.filler1;
    }

    /**
     * @param o 予備領域１
     */
    public void setFiller1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.filler1 = String.valueOf(o.toString());
        } else {
            this.filler1 = null;
        }
    }

    /** 金額レス区分 */
    private String kinlesskbn;

    /**
     * @return 金額レス区分
     */
    public String getKinlesskbn() {
        return this.kinlesskbn;
    }

    /**
     * @param o 金額レス区分
     */
    public void setKinlesskbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kinlesskbn = String.valueOf(o.toString());
        } else {
            this.kinlesskbn = null;
        }
    }

    /** 正協レス区分 */
    private String seikyokbn;

    /**
     * @return 正協レス区分
     */
    public String getSeikyokbn() {
        return this.seikyokbn;
    }

    /**
     * @param o 正協レス区分
     */
    public void setSeikyokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.seikyokbn = String.valueOf(o.toString());
        } else {
            this.seikyokbn = null;
        }
    }

    /** 地区締切日 */
    private java.math.BigDecimal tikusimebi;

    /**
     * @return 地区締切日
     */
    public java.math.BigDecimal getTikusimebi() {
        return this.tikusimebi;
    }

    /**
     * @param o 地区締切日
     */
    public void setTikusimebi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tikusimebi = new java.math.BigDecimal(o.toString());
        } else {
            this.tikusimebi = null;
        }
    }

    /** 得意先締切日 */
    private java.math.BigDecimal misesimebi;

    /**
     * @return 得意先締切日
     */
    public java.math.BigDecimal getMisesimebi() {
        return this.misesimebi;
    }

    /**
     * @param o 得意先締切日
     */
    public void setMisesimebi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.misesimebi = new java.math.BigDecimal(o.toString());
        } else {
            this.misesimebi = null;
        }
    }

    /** マスター登録日 */
    private java.math.BigDecimal tourokubi;

    /**
     * @return マスター登録日
     */
    public java.math.BigDecimal getTourokubi() {
        return this.tourokubi;
    }

    /**
     * @param o マスター登録日
     */
    public void setTourokubi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tourokubi = new java.math.BigDecimal(o.toString());
        } else {
            this.tourokubi = null;
        }
    }

    /** 受注禁止区分 */
    private String jukinkbn;

    /**
     * @return 受注禁止区分
     */
    public String getJukinkbn() {
        return this.jukinkbn;
    }

    /**
     * @param o 受注禁止区分
     */
    public void setJukinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jukinkbn = String.valueOf(o.toString());
        } else {
            this.jukinkbn = null;
        }
    }

    /** 転売禁止区分 */
    private String tenkinkbn;

    /**
     * @return 転売禁止区分
     */
    public String getTenkinkbn() {
        return this.tenkinkbn;
    }

    /**
     * @param o 転売禁止区分
     */
    public void setTenkinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tenkinkbn = String.valueOf(o.toString());
        } else {
            this.tenkinkbn = null;
        }
    }

    /** 売上集計区分 */
    private String urisumkbn;

    /**
     * @return 売上集計区分
     */
    public String getUrisumkbn() {
        return this.urisumkbn;
    }

    /**
     * @param o 売上集計区分
     */
    public void setUrisumkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.urisumkbn = String.valueOf(o.toString());
        } else {
            this.urisumkbn = null;
        }
    }

    /** ＤＩＹ区分 */
    private String diykbn;

    /**
     * @return ＤＩＹ区分
     */
    public String getDiykbn() {
        return this.diykbn;
    }

    /**
     * @param o ＤＩＹ区分
     */
    public void setDiykbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.diykbn = String.valueOf(o.toString());
        } else {
            this.diykbn = null;
        }
    }

    /** カナ得意先名 */
    private String ktokumei;

    /**
     * @return カナ得意先名
     */
    public String getKtokumei() {
        return this.ktokumei;
    }

    /**
     * @param o カナ得意先名
     */
    public void setKtokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ktokumei = String.valueOf(o.toString());
        } else {
            this.ktokumei = null;
        }
    }

    /** 消費税区分 */
    private String zeikbn;

    /**
     * @return 消費税区分
     */
    public String getZeikbn() {
        return this.zeikbn;
    }

    /**
     * @param o 消費税区分
     */
    public void setZeikbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zeikbn = String.valueOf(o.toString());
        } else {
            this.zeikbn = null;
        }
    }

    /** 営業担当者コード */
    private java.math.BigDecimal eiTantocd;

    /**
     * @return 営業担当者コード
     */
    public java.math.BigDecimal getEiTantocd() {
        return this.eiTantocd;
    }

    /**
     * @param o 営業担当者コード
     */
    public void setEiTantocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.eiTantocd = new java.math.BigDecimal(o.toString());
        } else {
            this.eiTantocd = null;
        }
    }

    /** 市町村コード */
    private String sichocd;

    /**
     * @return 市町村コード
     */
    public String getSichocd() {
        return this.sichocd;
    }

    /**
     * @param o 市町村コード
     */
    public void setSichocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sichocd = String.valueOf(o.toString());
        } else {
            this.sichocd = null;
        }
    }

    /** ＦＡＸ番号 */
    private String faxno;

    /**
     * @return ＦＡＸ番号
     */
    public String getFaxno() {
        return this.faxno;
    }

    /**
     * @param o ＦＡＸ番号
     */
    public void setFaxno(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.faxno = String.valueOf(o.toString());
        } else {
            this.faxno = null;
        }
    }

    /** 得意先区分１ */
    private String tokuikbn1;

    /**
     * @return 得意先区分１
     */
    public String getTokuikbn1() {
        return this.tokuikbn1;
    }

    /**
     * @param o 得意先区分１
     */
    public void setTokuikbn1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuikbn1 = String.valueOf(o.toString());
        } else {
            this.tokuikbn1 = null;
        }
    }

    /** 得意先区分２ */
    private String tokuikbn2;

    /**
     * @return 得意先区分２
     */
    public String getTokuikbn2() {
        return this.tokuikbn2;
    }

    /**
     * @param o 得意先区分２
     */
    public void setTokuikbn2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuikbn2 = String.valueOf(o.toString());
        } else {
            this.tokuikbn2 = null;
        }
    }

    /** 得意先区分３ */
    private String tokuikbn3;

    /**
     * @return 得意先区分３
     */
    public String getTokuikbn3() {
        return this.tokuikbn3;
    }

    /**
     * @param o 得意先区分３
     */
    public void setTokuikbn3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuikbn3 = String.valueOf(o.toString());
        } else {
            this.tokuikbn3 = null;
        }
    }

    /** ＦＡＸ区分 */
    private String faxkbn;

    /**
     * @return ＦＡＸ区分
     */
    public String getFaxkbn() {
        return this.faxkbn;
    }

    /**
     * @param o ＦＡＸ区分
     */
    public void setFaxkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.faxkbn = String.valueOf(o.toString());
        } else {
            this.faxkbn = null;
        }
    }

    /** 運送会社コード */
    private String unsocd;

    /**
     * @return 運送会社コード
     */
    public String getUnsocd() {
        return this.unsocd;
    }

    /**
     * @param o 運送会社コード
     */
    public void setUnsocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unsocd = String.valueOf(o.toString());
        } else {
            this.unsocd = null;
        }
    }

    /** 売上集計区分明細 */
    private String urisumkbnm;

    /**
     * @return 売上集計区分明細
     */
    public String getUrisumkbnm() {
        return this.urisumkbnm;
    }

    /**
     * @param o 売上集計区分明細
     */
    public void setUrisumkbnm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.urisumkbnm = String.valueOf(o.toString());
        } else {
            this.urisumkbnm = null;
        }
    }

    /** 地区コード */
    private String tikucd;

    /**
     * @return 地区コード
     */
    public String getTikucd() {
        return this.tikucd;
    }

    /**
     * @param o 地区コード
     */
    public void setTikucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tikucd = String.valueOf(o.toString());
        } else {
            this.tikucd = null;
        }
    }

    /** 都道府県コード */
    private String todofukencd;

    /**
     * @return 都道府県コード
     */
    public String getTodofukencd() {
        return this.todofukencd;
    }

    /**
     * @param o 都道府県コード
     */
    public void setTodofukencd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.todofukencd = String.valueOf(o.toString());
        } else {
            this.todofukencd = null;
        }
    }

    /** 国際地域コード */
    private String kokusaicd;

    /**
     * @return 国際地域コード
     */
    public String getKokusaicd() {
        return this.kokusaicd;
    }

    /**
     * @param o 国際地域コード
     */
    public void setKokusaicd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kokusaicd = String.valueOf(o.toString());
        } else {
            this.kokusaicd = null;
        }
    }

    /** 国コード */
    private String kunicd;

    /**
     * @return 国コード
     */
    public String getKunicd() {
        return this.kunicd;
    }

    /**
     * @param o 国コード
     */
    public void setKunicd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kunicd = String.valueOf(o.toString());
        } else {
            this.kunicd = null;
        }
    }

    /** 営業エリアコード */
    private String eigyoareacd;

    /**
     * @return 営業エリアコード
     */
    public String getEigyoareacd() {
        return this.eigyoareacd;
    }

    /**
     * @param o 営業エリアコード
     */
    public void setEigyoareacd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.eigyoareacd = String.valueOf(o.toString());
        } else {
            this.eigyoareacd = null;
        }
    }

    /** 検収期間 */
    private java.math.BigDecimal kensyukikan;

    /**
     * @return 検収期間
     */
    public java.math.BigDecimal getKensyukikan() {
        return this.kensyukikan;
    }

    /**
     * @param o 検収期間
     */
    public void setKensyukikan(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kensyukikan = new java.math.BigDecimal(o.toString());
        } else {
            this.kensyukikan = null;
        }
    }

    /** 請求発行区分 */
    private String eSeikyukbn;

    /**
     * @return 請求発行区分
     */
    public String getESeikyukbn() {
        return this.eSeikyukbn;
    }

    /**
     * @param o 請求発行区分
     */
    public void setESeikyukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.eSeikyukbn = String.valueOf(o.toString());
        } else {
            this.eSeikyukbn = null;
        }
    }

    /** 予備領域 */
    private String filler;

    /**
     * @return 予備領域
     */
    public String getFiller() {
        return this.filler;
    }

    /**
     * @param o 予備領域
     */
    public void setFiller(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.filler = String.valueOf(o.toString());
        } else {
            this.filler = null;
        }
    }

    /**
     * 得意先マスタ照会
     *
     * @param param1 得意先コード
     * @return 得意先マスタ
     */
    public static MTokui get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"TOKUCD\" = :tokucd");

        String sql = "SELECT * FROM M_TOKUI WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("tokucd", param1);

        return Queries.get(sql, params, MTokui.class);
    }

    /**
     * 得意先マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 得意先マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("tokucd -- :tokucd");
        nameList.add("tokumei1 -- :tokumei1");
        nameList.add("tokumei2 -- :tokumei2");
        nameList.add("rtokumei -- :rtokumei");
        nameList.add("ubinno -- :ubinno");
        nameList.add("toku_jusho1 -- :toku_jusho1");
        nameList.add("toku_jusho2 -- :toku_jusho2");
        nameList.add("telno -- :telno");
        nameList.add("seikyucd -- :seikyucd");
        nameList.add("mailcd -- :mailcd");
        nameList.add("shukincd -- :shukincd");
        nameList.add("honshacd -- :honshacd");
        nameList.add("shukeicd -- :shukeicd");
        nameList.add("tankakbn -- :tankakbn");
        nameList.add("bonuskbn -- :bonuskbn");
        nameList.add("nohinkbn -- :nohinkbn");
        nameList.add("hakkokbn -- :hakkokbn");
        nameList.add("nohinformkbn -- :nohinformkbn");
        nameList.add("simukekbn -- :simukekbn");
        nameList.add("eigyokbn -- :eigyokbn");
        nameList.add("filler1 -- :filler1");
        nameList.add("kinlesskbn -- :kinlesskbn");
        nameList.add("seikyokbn -- :seikyokbn");
        nameList.add("tikusimebi -- :tikusimebi");
        nameList.add("misesimebi -- :misesimebi");
        nameList.add("tourokubi -- :tourokubi");
        nameList.add("jukinkbn -- :jukinkbn");
        nameList.add("tenkinkbn -- :tenkinkbn");
        nameList.add("urisumkbn -- :urisumkbn");
        nameList.add("diykbn -- :diykbn");
        nameList.add("ktokumei -- :ktokumei");
        nameList.add("zeikbn -- :zeikbn");
        nameList.add("ei_tantocd -- :ei_tantocd");
        nameList.add("sichocd -- :sichocd");
        nameList.add("faxno -- :faxno");
        nameList.add("tokuikbn1 -- :tokuikbn1");
        nameList.add("tokuikbn2 -- :tokuikbn2");
        nameList.add("tokuikbn3 -- :tokuikbn3");
        nameList.add("faxkbn -- :faxkbn");
        nameList.add("unsocd -- :unsocd");
        nameList.add("urisumkbnm -- :urisumkbnm");
        nameList.add("tikucd -- :tikucd");
        nameList.add("todofukencd -- :todofukencd");
        nameList.add("kokusaicd -- :kokusaicd");
        nameList.add("kunicd -- :kunicd");
        nameList.add("eigyoareacd -- :eigyoareacd");
        nameList.add("kensyukikan -- :kensyukikan");
        nameList.add("e_seikyukbn -- :e_seikyukbn");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_TOKUI(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":tokucd");
        valueList.add(":tokumei1");
        valueList.add(":tokumei2");
        valueList.add(":rtokumei");
        valueList.add(":ubinno");
        valueList.add(":toku-jusho1");
        valueList.add(":toku-jusho2");
        valueList.add(":telno");
        valueList.add(":seikyucd");
        valueList.add(":mailcd");
        valueList.add(":shukincd");
        valueList.add(":honshacd");
        valueList.add(":shukeicd");
        valueList.add(":tankakbn");
        valueList.add(":bonuskbn");
        valueList.add(":nohinkbn");
        valueList.add(":hakkokbn");
        valueList.add(":nohinformkbn");
        valueList.add(":simukekbn");
        valueList.add(":eigyokbn");
        valueList.add(":filler1");
        valueList.add(":kinlesskbn");
        valueList.add(":seikyokbn");
        valueList.add(":tikusimebi");
        valueList.add(":misesimebi");
        valueList.add(":tourokubi");
        valueList.add(":jukinkbn");
        valueList.add(":tenkinkbn");
        valueList.add(":urisumkbn");
        valueList.add(":diykbn");
        valueList.add(":ktokumei");
        valueList.add(":zeikbn");
        valueList.add(":ei-tantocd");
        valueList.add(":sichocd");
        valueList.add(":faxno");
        valueList.add(":tokuikbn1");
        valueList.add(":tokuikbn2");
        valueList.add(":tokuikbn3");
        valueList.add(":faxkbn");
        valueList.add(":unsocd");
        valueList.add(":urisumkbnm");
        valueList.add(":tikucd");
        valueList.add(":todofukencd");
        valueList.add(":kokusaicd");
        valueList.add(":kunicd");
        valueList.add(":eigyoareacd");
        valueList.add(":kensyukikan");
        valueList.add(":e-seikyukbn");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 得意先マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 得意先マスタの登録
        String sql = "UPDATE M_TOKUI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("tokucd = :tokucd");
        setList.add("tokumei1 = :tokumei1");
        setList.add("tokumei2 = :tokumei2");
        setList.add("rtokumei = :rtokumei");
        setList.add("ubinno = :ubinno");
        setList.add("toku-jusho1 = :toku-jusho1");
        setList.add("toku-jusho2 = :toku-jusho2");
        setList.add("telno = :telno");
        setList.add("seikyucd = :seikyucd");
        setList.add("mailcd = :mailcd");
        setList.add("shukincd = :shukincd");
        setList.add("honshacd = :honshacd");
        setList.add("shukeicd = :shukeicd");
        setList.add("tankakbn = :tankakbn");
        setList.add("bonuskbn = :bonuskbn");
        setList.add("nohinkbn = :nohinkbn");
        setList.add("hakkokbn = :hakkokbn");
        setList.add("nohinformkbn = :nohinformkbn");
        setList.add("simukekbn = :simukekbn");
        setList.add("eigyokbn = :eigyokbn");
        setList.add("filler1 = :filler1");
        setList.add("kinlesskbn = :kinlesskbn");
        setList.add("seikyokbn = :seikyokbn");
        setList.add("tikusimebi = :tikusimebi");
        setList.add("misesimebi = :misesimebi");
        setList.add("tourokubi = :tourokubi");
        setList.add("jukinkbn = :jukinkbn");
        setList.add("tenkinkbn = :tenkinkbn");
        setList.add("urisumkbn = :urisumkbn");
        setList.add("diykbn = :diykbn");
        setList.add("ktokumei = :ktokumei");
        setList.add("zeikbn = :zeikbn");
        setList.add("ei-tantocd = :ei-tantocd");
        setList.add("sichocd = :sichocd");
        setList.add("faxno = :faxno");
        setList.add("tokuikbn1 = :tokuikbn1");
        setList.add("tokuikbn2 = :tokuikbn2");
        setList.add("tokuikbn3 = :tokuikbn3");
        setList.add("faxkbn = :faxkbn");
        setList.add("unsocd = :unsocd");
        setList.add("urisumkbnm = :urisumkbnm");
        setList.add("tikucd = :tikucd");
        setList.add("todofukencd = :todofukencd");
        setList.add("kokusaicd = :kokusaicd");
        setList.add("kunicd = :kunicd");
        setList.add("eigyoareacd = :eigyoareacd");
        setList.add("kensyukikan = :kensyukikan");
        setList.add("e-seikyukbn = :e-seikyukbn");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 得意先マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 得意先マスタの削除
        String sql = "DELETE FROM M_TOKUI WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("tokucd = :tokucd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("TOKUCD", this.tokucd);
        params.put("TOKUMEI1", this.tokumei1);
        params.put("TOKUMEI2", this.tokumei2);
        params.put("RTOKUMEI", this.rtokumei);
        params.put("UBINNO", this.ubinno);
        params.put("TOKU-JUSHO1", this.tokuJusho1);
        params.put("TOKU-JUSHO2", this.tokuJusho2);
        params.put("TELNO", this.telno);
        params.put("SEIKYUCD", this.seikyucd);
        params.put("MAILCD", this.mailcd);
        params.put("SHUKINCD", this.shukincd);
        params.put("HONSHACD", this.honshacd);
        params.put("SHUKEICD", this.shukeicd);
        params.put("TANKAKBN", this.tankakbn);
        params.put("BONUSKBN", this.bonuskbn);
        params.put("NOHINKBN", this.nohinkbn);
        params.put("HAKKOKBN", this.hakkokbn);
        params.put("NOHINFORMKBN", this.nohinformkbn);
        params.put("SIMUKEKBN", this.simukekbn);
        params.put("EIGYOKBN", this.eigyokbn);
        params.put("FILLER1", this.filler1);
        params.put("KINLESSKBN", this.kinlesskbn);
        params.put("SEIKYOKBN", this.seikyokbn);
        params.put("TIKUSIMEBI", this.tikusimebi);
        params.put("MISESIMEBI", this.misesimebi);
        params.put("TOUROKUBI", this.tourokubi);
        params.put("JUKINKBN", this.jukinkbn);
        params.put("TENKINKBN", this.tenkinkbn);
        params.put("URISUMKBN", this.urisumkbn);
        params.put("DIYKBN", this.diykbn);
        params.put("KTOKUMEI", this.ktokumei);
        params.put("ZEIKBN", this.zeikbn);
        params.put("EI-TANTOCD", this.eiTantocd);
        params.put("SICHOCD", this.sichocd);
        params.put("FAXNO", this.faxno);
        params.put("TOKUIKBN1", this.tokuikbn1);
        params.put("TOKUIKBN2", this.tokuikbn2);
        params.put("TOKUIKBN3", this.tokuikbn3);
        params.put("FAXKBN", this.faxkbn);
        params.put("UNSOCD", this.unsocd);
        params.put("URISUMKBNM", this.urisumkbnm);
        params.put("TIKUCD", this.tikucd);
        params.put("TODOFUKENCD", this.todofukencd);
        params.put("KOKUSAICD", this.kokusaicd);
        params.put("KUNICD", this.kunicd);
        params.put("EIGYOAREACD", this.eigyoareacd);
        params.put("KENSYUKIKAN", this.kensyukikan);
        params.put("E-SEIKYUKBN", this.eSeikyukbn);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
