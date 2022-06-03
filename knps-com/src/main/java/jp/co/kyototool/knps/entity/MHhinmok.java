package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 販売品目マスタ
 *
 * @author emarfkrow
 */
public class MHhinmok implements IEntity {

    /** 販売品番 */
    private String hhinban;

    /**
     * @return 販売品番
     */
    public String getHhinban() {
        return this.hhinban;
    }

    /**
     * @param o 販売品番
     */
    public void setHhinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hhinban = String.valueOf(o.toString());
        } else {
            this.hhinban = null;
        }
    }

    /** ローレベルコード */
    private java.math.BigDecimal lvcd;

    /**
     * @return ローレベルコード
     */
    public java.math.BigDecimal getLvcd() {
        return this.lvcd;
    }

    /**
     * @param o ローレベルコード
     */
    public void setLvcd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lvcd = new java.math.BigDecimal(o.toString());
        } else {
            this.lvcd = null;
        }
    }

    /** 削除フラグ */
    private java.math.BigDecimal dltflg;

    /**
     * @return 削除フラグ
     */
    public java.math.BigDecimal getDltflg() {
        return this.dltflg;
    }

    /**
     * @param o 削除フラグ
     */
    public void setDltflg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dltflg = new java.math.BigDecimal(o.toString());
        } else {
            this.dltflg = null;
        }
    }

    /** 品目コード */
    private String hincd;

    /**
     * @return 品目コード
     */
    public String getHincd() {
        return this.hincd;
    }

    /**
     * @param o 品目コード
     */
    public void setHincd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hincd = String.valueOf(o.toString());
        } else {
            this.hincd = null;
        }
    }

    /** 品　名 */
    private String hinmei;

    /**
     * @return 品　名
     */
    public String getHinmei() {
        return this.hinmei;
    }

    /**
     * @param o 品　名
     */
    public void setHinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinmei = String.valueOf(o.toString());
        } else {
            this.hinmei = null;
        }
    }

    /** セット区分 */
    private String setkbn;

    /**
     * @return セット区分
     */
    public String getSetkbn() {
        return this.setkbn;
    }

    /**
     * @param o セット区分
     */
    public void setSetkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setkbn = String.valueOf(o.toString());
        } else {
            this.setkbn = null;
        }
    }

    /** 戦略商品区分 */
    private String sshinkbn;

    /**
     * @return 戦略商品区分
     */
    public String getSshinkbn() {
        return this.sshinkbn;
    }

    /**
     * @param o 戦略商品区分
     */
    public void setSshinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sshinkbn = String.valueOf(o.toString());
        } else {
            this.sshinkbn = null;
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

    /** 入庫禁止区分 */
    private String nyukokinkbn;

    /**
     * @return 入庫禁止区分
     */
    public String getNyukokinkbn() {
        return this.nyukokinkbn;
    }

    /**
     * @param o 入庫禁止区分
     */
    public void setNyukokinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nyukokinkbn = String.valueOf(o.toString());
        } else {
            this.nyukokinkbn = null;
        }
    }

    /** 製品区分 */
    private String seihinkbn;

    /**
     * @return 製品区分
     */
    public String getSeihinkbn() {
        return this.seihinkbn;
    }

    /**
     * @param o 製品区分
     */
    public void setSeihinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.seihinkbn = String.valueOf(o.toString());
        } else {
            this.seihinkbn = null;
        }
    }

    /** 出荷指示区分 */
    private String sijikbn;

    /**
     * @return 出荷指示区分
     */
    public String getSijikbn() {
        return this.sijikbn;
    }

    /**
     * @param o 出荷指示区分
     */
    public void setSijikbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sijikbn = String.valueOf(o.toString());
        } else {
            this.sijikbn = null;
        }
    }

    /** 商品分類 */
    private java.math.BigDecimal shohinBunrui;

    /**
     * @return 商品分類
     */
    public java.math.BigDecimal getShohinBunrui() {
        return this.shohinBunrui;
    }

    /**
     * @param o 商品分類
     */
    public void setShohinBunrui(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shohinBunrui = new java.math.BigDecimal(o.toString());
        } else {
            this.shohinBunrui = null;
        }
    }

    /** 基準在庫 */
    private java.math.BigDecimal kijunzaiko;

    /**
     * @return 基準在庫
     */
    public java.math.BigDecimal getKijunzaiko() {
        return this.kijunzaiko;
    }

    /**
     * @param o 基準在庫
     */
    public void setKijunzaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kijunzaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.kijunzaiko = null;
        }
    }

    /** 製品単重 */
    private java.math.BigDecimal seiTanju;

    /**
     * @return 製品単重
     */
    public java.math.BigDecimal getSeiTanju() {
        return this.seiTanju;
    }

    /**
     * @param o 製品単重
     */
    public void setSeiTanju(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.seiTanju = new java.math.BigDecimal(o.toString());
        } else {
            this.seiTanju = null;
        }
    }

    /** ロケーションＮＯ */
    private java.math.BigDecimal locationno;

    /**
     * @return ロケーションＮＯ
     */
    public java.math.BigDecimal getLocationno() {
        return this.locationno;
    }

    /**
     * @param o ロケーションＮＯ
     */
    public void setLocationno(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locationno = new java.math.BigDecimal(o.toString());
        } else {
            this.locationno = null;
        }
    }

    /** 包装コード */
    private java.math.BigDecimal hosocd;

    /**
     * @return 包装コード
     */
    public java.math.BigDecimal getHosocd() {
        return this.hosocd;
    }

    /**
     * @param o 包装コード
     */
    public void setHosocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosocd = new java.math.BigDecimal(o.toString());
        } else {
            this.hosocd = null;
        }
    }

    /** 包装単位 */
    private java.math.BigDecimal hosotani;

    /**
     * @return 包装単位
     */
    public java.math.BigDecimal getHosotani() {
        return this.hosotani;
    }

    /**
     * @param o 包装単位
     */
    public void setHosotani(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosotani = new java.math.BigDecimal(o.toString());
        } else {
            this.hosotani = null;
        }
    }

    /** 包装材欠品区分 */
    private String hosokepin;

    /**
     * @return 包装材欠品区分
     */
    public String getHosokepin() {
        return this.hosokepin;
    }

    /**
     * @param o 包装材欠品区分
     */
    public void setHosokepin(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosokepin = String.valueOf(o.toString());
        } else {
            this.hosokepin = null;
        }
    }

    /** 梱包区分 */
    private String konpokbn;

    /**
     * @return 梱包区分
     */
    public String getKonpokbn() {
        return this.konpokbn;
    }

    /**
     * @param o 梱包区分
     */
    public void setKonpokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.konpokbn = String.valueOf(o.toString());
        } else {
            this.konpokbn = null;
        }
    }

    /** かんばんロット区分 */
    private String klkbn;

    /**
     * @return かんばんロット区分
     */
    public String getKlkbn() {
        return this.klkbn;
    }

    /**
     * @param o かんばんロット区分
     */
    public void setKlkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.klkbn = String.valueOf(o.toString());
        } else {
            this.klkbn = null;
        }
    }

    /** ＪＩＳ区分 */
    private String jiskbn;

    /**
     * @return ＪＩＳ区分
     */
    public String getJiskbn() {
        return this.jiskbn;
    }

    /**
     * @param o ＪＩＳ区分
     */
    public void setJiskbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jiskbn = String.valueOf(o.toString());
        } else {
            this.jiskbn = null;
        }
    }

    /** セット基準時間 */
    private java.math.BigDecimal setkijunh;

    /**
     * @return セット基準時間
     */
    public java.math.BigDecimal getSetkijunh() {
        return this.setkijunh;
    }

    /**
     * @param o セット基準時間
     */
    public void setSetkijunh(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setkijunh = new java.math.BigDecimal(o.toString());
        } else {
            this.setkijunh = null;
        }
    }

    /** 期末原価 */
    private java.math.BigDecimal kimatuGenka;

    /**
     * @return 期末原価
     */
    public java.math.BigDecimal getKimatuGenka() {
        return this.kimatuGenka;
    }

    /**
     * @param o 期末原価
     */
    public void setKimatuGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kimatuGenka = new java.math.BigDecimal(o.toString());
        } else {
            this.kimatuGenka = null;
        }
    }

    /** 標準原価 */
    private java.math.BigDecimal hyojunGenka;

    /**
     * @return 標準原価
     */
    public java.math.BigDecimal getHyojunGenka() {
        return this.hyojunGenka;
    }

    /**
     * @param o 標準原価
     */
    public void setHyojunGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hyojunGenka = new java.math.BigDecimal(o.toString());
        } else {
            this.hyojunGenka = null;
        }
    }

    /** 二次評価原価 */
    private java.math.BigDecimal nijiGenka;

    /**
     * @return 二次評価原価
     */
    public java.math.BigDecimal getNijiGenka() {
        return this.nijiGenka;
    }

    /**
     * @param o 二次評価原価
     */
    public void setNijiGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nijiGenka = new java.math.BigDecimal(o.toString());
        } else {
            this.nijiGenka = null;
        }
    }

    /** 標準売価 */
    private java.math.BigDecimal hyojunBaika;

    /**
     * @return 標準売価
     */
    public java.math.BigDecimal getHyojunBaika() {
        return this.hyojunBaika;
    }

    /**
     * @param o 標準売価
     */
    public void setHyojunBaika(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hyojunBaika = new java.math.BigDecimal(o.toString());
        } else {
            this.hyojunBaika = null;
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

    /** 製品発売日 */
    private java.math.BigDecimal hatubaibi;

    /**
     * @return 製品発売日
     */
    public java.math.BigDecimal getHatubaibi() {
        return this.hatubaibi;
    }

    /**
     * @param o 製品発売日
     */
    public void setHatubaibi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hatubaibi = new java.math.BigDecimal(o.toString());
        } else {
            this.hatubaibi = null;
        }
    }

    /** 当日出荷対象区分 */
    private String tojitukbn;

    /**
     * @return 当日出荷対象区分
     */
    public String getTojitukbn() {
        return this.tojitukbn;
    }

    /**
     * @param o 当日出荷対象区分
     */
    public void setTojitukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tojitukbn = String.valueOf(o.toString());
        } else {
            this.tojitukbn = null;
        }
    }

    /** 新製品分類 */
    private java.math.BigDecimal sinSeihinBunrui;

    /**
     * @return 新製品分類
     */
    public java.math.BigDecimal getSinSeihinBunrui() {
        return this.sinSeihinBunrui;
    }

    /**
     * @param o 新製品分類
     */
    public void setSinSeihinBunrui(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sinSeihinBunrui = new java.math.BigDecimal(o.toString());
        } else {
            this.sinSeihinBunrui = null;
        }
    }

    /** ＤＩＹ定番区分 */
    private String dteibankbn;

    /**
     * @return ＤＩＹ定番区分
     */
    public String getDteibankbn() {
        return this.dteibankbn;
    }

    /**
     * @param o ＤＩＹ定番区分
     */
    public void setDteibankbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dteibankbn = String.valueOf(o.toString());
        } else {
            this.dteibankbn = null;
        }
    }

    /** 在庫受注区分 */
    private String zaijuckbn;

    /**
     * @return 在庫受注区分
     */
    public String getZaijuckbn() {
        return this.zaijuckbn;
    }

    /**
     * @param o 在庫受注区分
     */
    public void setZaijuckbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaijuckbn = String.valueOf(o.toString());
        } else {
            this.zaijuckbn = null;
        }
    }

    /** 生産担当者コード */
    private java.math.BigDecimal stantocd;

    /**
     * @return 生産担当者コード
     */
    public java.math.BigDecimal getStantocd() {
        return this.stantocd;
    }

    /**
     * @param o 生産担当者コード
     */
    public void setStantocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stantocd = new java.math.BigDecimal(o.toString());
        } else {
            this.stantocd = null;
        }
    }

    /** 直送取消不可区分 */
    private String torifukbn;

    /**
     * @return 直送取消不可区分
     */
    public String getTorifukbn() {
        return this.torifukbn;
    }

    /**
     * @param o 直送取消不可区分
     */
    public void setTorifukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.torifukbn = String.valueOf(o.toString());
        } else {
            this.torifukbn = null;
        }
    }

    /** 生産中止区分 */
    private String prdendkbn;

    /**
     * @return 生産中止区分
     */
    public String getPrdendkbn() {
        return this.prdendkbn;
    }

    /**
     * @param o 生産中止区分
     */
    public void setPrdendkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.prdendkbn = String.valueOf(o.toString());
        } else {
            this.prdendkbn = null;
        }
    }

    /** 品種分類４ */
    private java.math.BigDecimal bunrui4;

    /**
     * @return 品種分類４
     */
    public java.math.BigDecimal getBunrui4() {
        return this.bunrui4;
    }

    /**
     * @param o 品種分類４
     */
    public void setBunrui4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bunrui4 = new java.math.BigDecimal(o.toString());
        } else {
            this.bunrui4 = null;
        }
    }

    /** 在庫出荷区分 */
    private String zaishukbn;

    /**
     * @return 在庫出荷区分
     */
    public String getZaishukbn() {
        return this.zaishukbn;
    }

    /**
     * @param o 在庫出荷区分
     */
    public void setZaishukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaishukbn = String.valueOf(o.toString());
        } else {
            this.zaishukbn = null;
        }
    }

    /** バーコード */
    private java.math.BigDecimal barcode;

    /**
     * @return バーコード
     */
    public java.math.BigDecimal getBarcode() {
        return this.barcode;
    }

    /**
     * @param o バーコード
     */
    public void setBarcode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barcode = new java.math.BigDecimal(o.toString());
        } else {
            this.barcode = null;
        }
    }

    /** データ送信区分 */
    private String dataFlg;

    /**
     * @return データ送信区分
     */
    public String getDataFlg() {
        return this.dataFlg;
    }

    /**
     * @param o データ送信区分
     */
    public void setDataFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dataFlg = String.valueOf(o.toString());
        } else {
            this.dataFlg = null;
        }
    }

    /** 予備領域3 */
    private String filler3;

    /**
     * @return 予備領域3
     */
    public String getFiller3() {
        return this.filler3;
    }

    /**
     * @param o 予備領域3
     */
    public void setFiller3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.filler3 = String.valueOf(o.toString());
        } else {
            this.filler3 = null;
        }
    }

    /** ＵＰＣコード */
    private String upccd;

    /**
     * @return ＵＰＣコード
     */
    public String getUpccd() {
        return this.upccd;
    }

    /**
     * @param o ＵＰＣコード
     */
    public void setUpccd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.upccd = String.valueOf(o.toString());
        } else {
            this.upccd = null;
        }
    }

    /** 平１在庫数 */
    private java.math.BigDecimal zaikosuH1;

    /**
     * @return 平１在庫数
     */
    public java.math.BigDecimal getZaikosuH1() {
        return this.zaikosuH1;
    }

    /**
     * @param o 平１在庫数
     */
    public void setZaikosuH1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaikosuH1 = new java.math.BigDecimal(o.toString());
        } else {
            this.zaikosuH1 = null;
        }
    }

    /** 平２在庫数 */
    private java.math.BigDecimal zaikosuH2;

    /**
     * @return 平２在庫数
     */
    public java.math.BigDecimal getZaikosuH2() {
        return this.zaikosuH2;
    }

    /**
     * @param o 平２在庫数
     */
    public void setZaikosuH2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaikosuH2 = new java.math.BigDecimal(o.toString());
        } else {
            this.zaikosuH2 = null;
        }
    }

    /** 平３在庫数 */
    private java.math.BigDecimal zaikosuH3;

    /**
     * @return 平３在庫数
     */
    public java.math.BigDecimal getZaikosuH3() {
        return this.zaikosuH3;
    }

    /**
     * @param o 平３在庫数
     */
    public void setZaikosuH3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaikosuH3 = new java.math.BigDecimal(o.toString());
        } else {
            this.zaikosuH3 = null;
        }
    }

    /** 平４在庫数 */
    private java.math.BigDecimal zaikosuH4;

    /**
     * @return 平４在庫数
     */
    public java.math.BigDecimal getZaikosuH4() {
        return this.zaikosuH4;
    }

    /**
     * @param o 平４在庫数
     */
    public void setZaikosuH4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaikosuH4 = new java.math.BigDecimal(o.toString());
        } else {
            this.zaikosuH4 = null;
        }
    }

    /** 平５在庫数 */
    private java.math.BigDecimal zaikosuH5;

    /**
     * @return 平５在庫数
     */
    public java.math.BigDecimal getZaikosuH5() {
        return this.zaikosuH5;
    }

    /**
     * @param o 平５在庫数
     */
    public void setZaikosuH5(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaikosuH5 = new java.math.BigDecimal(o.toString());
        } else {
            this.zaikosuH5 = null;
        }
    }

    /** 平１指示数 */
    private java.math.BigDecimal sijisuH1;

    /**
     * @return 平１指示数
     */
    public java.math.BigDecimal getSijisuH1() {
        return this.sijisuH1;
    }

    /**
     * @param o 平１指示数
     */
    public void setSijisuH1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sijisuH1 = new java.math.BigDecimal(o.toString());
        } else {
            this.sijisuH1 = null;
        }
    }

    /** 平２指示数 */
    private java.math.BigDecimal sijisuH2;

    /**
     * @return 平２指示数
     */
    public java.math.BigDecimal getSijisuH2() {
        return this.sijisuH2;
    }

    /**
     * @param o 平２指示数
     */
    public void setSijisuH2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sijisuH2 = new java.math.BigDecimal(o.toString());
        } else {
            this.sijisuH2 = null;
        }
    }

    /** 平３指示数 */
    private java.math.BigDecimal sijisuH3;

    /**
     * @return 平３指示数
     */
    public java.math.BigDecimal getSijisuH3() {
        return this.sijisuH3;
    }

    /**
     * @param o 平３指示数
     */
    public void setSijisuH3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sijisuH3 = new java.math.BigDecimal(o.toString());
        } else {
            this.sijisuH3 = null;
        }
    }

    /** 平４指示数 */
    private java.math.BigDecimal sijisuH4;

    /**
     * @return 平４指示数
     */
    public java.math.BigDecimal getSijisuH4() {
        return this.sijisuH4;
    }

    /**
     * @param o 平４指示数
     */
    public void setSijisuH4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sijisuH4 = new java.math.BigDecimal(o.toString());
        } else {
            this.sijisuH4 = null;
        }
    }

    /** 平１引当数 */
    private java.math.BigDecimal hikiateH1;

    /**
     * @return 平１引当数
     */
    public java.math.BigDecimal getHikiateH1() {
        return this.hikiateH1;
    }

    /**
     * @param o 平１引当数
     */
    public void setHikiateH1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hikiateH1 = new java.math.BigDecimal(o.toString());
        } else {
            this.hikiateH1 = null;
        }
    }

    /** 平２引当数 */
    private java.math.BigDecimal hikiateH2;

    /**
     * @return 平２引当数
     */
    public java.math.BigDecimal getHikiateH2() {
        return this.hikiateH2;
    }

    /**
     * @param o 平２引当数
     */
    public void setHikiateH2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hikiateH2 = new java.math.BigDecimal(o.toString());
        } else {
            this.hikiateH2 = null;
        }
    }

    /** 平３引当数 */
    private java.math.BigDecimal hikiateH3;

    /**
     * @return 平３引当数
     */
    public java.math.BigDecimal getHikiateH3() {
        return this.hikiateH3;
    }

    /**
     * @param o 平３引当数
     */
    public void setHikiateH3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hikiateH3 = new java.math.BigDecimal(o.toString());
        } else {
            this.hikiateH3 = null;
        }
    }

    /** 平４引当数 */
    private java.math.BigDecimal hikiateH4;

    /**
     * @return 平４引当数
     */
    public java.math.BigDecimal getHikiateH4() {
        return this.hikiateH4;
    }

    /**
     * @param o 平４引当数
     */
    public void setHikiateH4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hikiateH4 = new java.math.BigDecimal(o.toString());
        } else {
            this.hikiateH4 = null;
        }
    }

    /** 市販当月注残数 */
    private java.math.BigDecimal schuzansu1;

    /**
     * @return 市販当月注残数
     */
    public java.math.BigDecimal getSchuzansu1() {
        return this.schuzansu1;
    }

    /**
     * @param o 市販当月注残数
     */
    public void setSchuzansu1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.schuzansu1 = new java.math.BigDecimal(o.toString());
        } else {
            this.schuzansu1 = null;
        }
    }

    /** 市販翌月注残数 */
    private java.math.BigDecimal schuzansu2;

    /**
     * @return 市販翌月注残数
     */
    public java.math.BigDecimal getSchuzansu2() {
        return this.schuzansu2;
    }

    /**
     * @param o 市販翌月注残数
     */
    public void setSchuzansu2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.schuzansu2 = new java.math.BigDecimal(o.toString());
        } else {
            this.schuzansu2 = null;
        }
    }

    /** 市販翌々月注残数 */
    private java.math.BigDecimal schuzansu3;

    /**
     * @return 市販翌々月注残数
     */
    public java.math.BigDecimal getSchuzansu3() {
        return this.schuzansu3;
    }

    /**
     * @param o 市販翌々月注残数
     */
    public void setSchuzansu3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.schuzansu3 = new java.math.BigDecimal(o.toString());
        } else {
            this.schuzansu3 = null;
        }
    }

    /** 輸出当月注残数 */
    private java.math.BigDecimal uchuzansu1;

    /**
     * @return 輸出当月注残数
     */
    public java.math.BigDecimal getUchuzansu1() {
        return this.uchuzansu1;
    }

    /**
     * @param o 輸出当月注残数
     */
    public void setUchuzansu1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.uchuzansu1 = new java.math.BigDecimal(o.toString());
        } else {
            this.uchuzansu1 = null;
        }
    }

    /** 輸出翌月注残数 */
    private java.math.BigDecimal uchuzansu2;

    /**
     * @return 輸出翌月注残数
     */
    public java.math.BigDecimal getUchuzansu2() {
        return this.uchuzansu2;
    }

    /**
     * @param o 輸出翌月注残数
     */
    public void setUchuzansu2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.uchuzansu2 = new java.math.BigDecimal(o.toString());
        } else {
            this.uchuzansu2 = null;
        }
    }

    /** 輸出翌々月注残数 */
    private java.math.BigDecimal uchuzansu3;

    /**
     * @return 輸出翌々月注残数
     */
    public java.math.BigDecimal getUchuzansu3() {
        return this.uchuzansu3;
    }

    /**
     * @param o 輸出翌々月注残数
     */
    public void setUchuzansu3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.uchuzansu3 = new java.math.BigDecimal(o.toString());
        } else {
            this.uchuzansu3 = null;
        }
    }

    /** ＤＩＹ当月注残数 */
    private java.math.BigDecimal dchuzansu1;

    /**
     * @return ＤＩＹ当月注残数
     */
    public java.math.BigDecimal getDchuzansu1() {
        return this.dchuzansu1;
    }

    /**
     * @param o ＤＩＹ当月注残数
     */
    public void setDchuzansu1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dchuzansu1 = new java.math.BigDecimal(o.toString());
        } else {
            this.dchuzansu1 = null;
        }
    }

    /** ＤＩＹ翌月注残数 */
    private java.math.BigDecimal dchuzansu2;

    /**
     * @return ＤＩＹ翌月注残数
     */
    public java.math.BigDecimal getDchuzansu2() {
        return this.dchuzansu2;
    }

    /**
     * @param o ＤＩＹ翌月注残数
     */
    public void setDchuzansu2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dchuzansu2 = new java.math.BigDecimal(o.toString());
        } else {
            this.dchuzansu2 = null;
        }
    }

    /** ＤＩＹ翌々月注残数 */
    private java.math.BigDecimal dchuzansu3;

    /**
     * @return ＤＩＹ翌々月注残数
     */
    public java.math.BigDecimal getDchuzansu3() {
        return this.dchuzansu3;
    }

    /**
     * @param o ＤＩＹ翌々月注残数
     */
    public void setDchuzansu3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dchuzansu3 = new java.math.BigDecimal(o.toString());
        } else {
            this.dchuzansu3 = null;
        }
    }

    /** 平１入庫予定数 */
    private java.math.BigDecimal nyukoyoteH1;

    /**
     * @return 平１入庫予定数
     */
    public java.math.BigDecimal getNyukoyoteH1() {
        return this.nyukoyoteH1;
    }

    /**
     * @param o 平１入庫予定数
     */
    public void setNyukoyoteH1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nyukoyoteH1 = new java.math.BigDecimal(o.toString());
        } else {
            this.nyukoyoteH1 = null;
        }
    }

    /** 平２入庫予定数 */
    private java.math.BigDecimal nyukoyoteH2;

    /**
     * @return 平２入庫予定数
     */
    public java.math.BigDecimal getNyukoyoteH2() {
        return this.nyukoyoteH2;
    }

    /**
     * @param o 平２入庫予定数
     */
    public void setNyukoyoteH2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nyukoyoteH2 = new java.math.BigDecimal(o.toString());
        } else {
            this.nyukoyoteH2 = null;
        }
    }

    /** 平３入庫予定数 */
    private java.math.BigDecimal nyukoyoteH3;

    /**
     * @return 平３入庫予定数
     */
    public java.math.BigDecimal getNyukoyoteH3() {
        return this.nyukoyoteH3;
    }

    /**
     * @param o 平３入庫予定数
     */
    public void setNyukoyoteH3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nyukoyoteH3 = new java.math.BigDecimal(o.toString());
        } else {
            this.nyukoyoteH3 = null;
        }
    }

    /** 平４入庫予定数 */
    private java.math.BigDecimal nyukoyoteH4;

    /**
     * @return 平４入庫予定数
     */
    public java.math.BigDecimal getNyukoyoteH4() {
        return this.nyukoyoteH4;
    }

    /**
     * @param o 平４入庫予定数
     */
    public void setNyukoyoteH4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nyukoyoteH4 = new java.math.BigDecimal(o.toString());
        } else {
            this.nyukoyoteH4 = null;
        }
    }

    /** 札幌在庫数 */
    private java.math.BigDecimal sapporozaiko;

    /**
     * @return 札幌在庫数
     */
    public java.math.BigDecimal getSapporozaiko() {
        return this.sapporozaiko;
    }

    /**
     * @param o 札幌在庫数
     */
    public void setSapporozaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sapporozaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.sapporozaiko = null;
        }
    }

    /** 仙台在庫数 */
    private java.math.BigDecimal sendaizaiko;

    /**
     * @return 仙台在庫数
     */
    public java.math.BigDecimal getSendaizaiko() {
        return this.sendaizaiko;
    }

    /**
     * @param o 仙台在庫数
     */
    public void setSendaizaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendaizaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.sendaizaiko = null;
        }
    }

    /** 東京在庫数 */
    private java.math.BigDecimal tokyozaiko;

    /**
     * @return 東京在庫数
     */
    public java.math.BigDecimal getTokyozaiko() {
        return this.tokyozaiko;
    }

    /**
     * @param o 東京在庫数
     */
    public void setTokyozaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokyozaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.tokyozaiko = null;
        }
    }

    /** 関東在庫数 */
    private java.math.BigDecimal kantozaiko;

    /**
     * @return 関東在庫数
     */
    public java.math.BigDecimal getKantozaiko() {
        return this.kantozaiko;
    }

    /**
     * @param o 関東在庫数
     */
    public void setKantozaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kantozaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.kantozaiko = null;
        }
    }

    /** 金沢在庫数 */
    private java.math.BigDecimal kanazawazaiko;

    /**
     * @return 金沢在庫数
     */
    public java.math.BigDecimal getKanazawazaiko() {
        return this.kanazawazaiko;
    }

    /**
     * @param o 金沢在庫数
     */
    public void setKanazawazaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanazawazaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.kanazawazaiko = null;
        }
    }

    /** 名古屋在庫数 */
    private java.math.BigDecimal nagoyazaiko;

    /**
     * @return 名古屋在庫数
     */
    public java.math.BigDecimal getNagoyazaiko() {
        return this.nagoyazaiko;
    }

    /**
     * @param o 名古屋在庫数
     */
    public void setNagoyazaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nagoyazaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.nagoyazaiko = null;
        }
    }

    /** 近畿在庫数 */
    private java.math.BigDecimal kinkizaiko;

    /**
     * @return 近畿在庫数
     */
    public java.math.BigDecimal getKinkizaiko() {
        return this.kinkizaiko;
    }

    /**
     * @param o 近畿在庫数
     */
    public void setKinkizaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kinkizaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.kinkizaiko = null;
        }
    }

    /** 広島在庫数 */
    private java.math.BigDecimal hirosimazaiko;

    /**
     * @return 広島在庫数
     */
    public java.math.BigDecimal getHirosimazaiko() {
        return this.hirosimazaiko;
    }

    /**
     * @param o 広島在庫数
     */
    public void setHirosimazaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hirosimazaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.hirosimazaiko = null;
        }
    }

    /** 福岡在庫数 */
    private java.math.BigDecimal fukuokazaiko;

    /**
     * @return 福岡在庫数
     */
    public java.math.BigDecimal getFukuokazaiko() {
        return this.fukuokazaiko;
    }

    /**
     * @param o 福岡在庫数
     */
    public void setFukuokazaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fukuokazaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.fukuokazaiko = null;
        }
    }

    /** 業務在庫数 */
    private java.math.BigDecimal gyomuzaiko;

    /**
     * @return 業務在庫数
     */
    public java.math.BigDecimal getGyomuzaiko() {
        return this.gyomuzaiko;
    }

    /**
     * @param o 業務在庫数
     */
    public void setGyomuzaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gyomuzaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.gyomuzaiko = null;
        }
    }

    /** 貿易在庫数 */
    private java.math.BigDecimal boekizaiko;

    /**
     * @return 貿易在庫数
     */
    public java.math.BigDecimal getBoekizaiko() {
        return this.boekizaiko;
    }

    /**
     * @param o 貿易在庫数
     */
    public void setBoekizaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.boekizaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.boekizaiko = null;
        }
    }

    /** ハイテック在庫数 */
    private java.math.BigDecimal hiteczaiko;

    /**
     * @return ハイテック在庫数
     */
    public java.math.BigDecimal getHiteczaiko() {
        return this.hiteczaiko;
    }

    /**
     * @param o ハイテック在庫数
     */
    public void setHiteczaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hiteczaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.hiteczaiko = null;
        }
    }

    /** 貿易委託在庫数 */
    private java.math.BigDecimal boekiitaku;

    /**
     * @return 貿易委託在庫数
     */
    public java.math.BigDecimal getBoekiitaku() {
        return this.boekiitaku;
    }

    /**
     * @param o 貿易委託在庫数
     */
    public void setBoekiitaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.boekiitaku = new java.math.BigDecimal(o.toString());
        } else {
            this.boekiitaku = null;
        }
    }

    /** 上海ＫＴＣ保税倉庫在庫 */
    private java.math.BigDecimal sktchszaiko;

    /**
     * @return 上海ＫＴＣ保税倉庫在庫
     */
    public java.math.BigDecimal getSktchszaiko() {
        return this.sktchszaiko;
    }

    /**
     * @param o 上海ＫＴＣ保税倉庫在庫
     */
    public void setSktchszaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sktchszaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.sktchszaiko = null;
        }
    }

    /** 包装材在庫数 */
    private java.math.BigDecimal hosozaiko;

    /**
     * @return 包装材在庫数
     */
    public java.math.BigDecimal getHosozaiko() {
        return this.hosozaiko;
    }

    /**
     * @param o 包装材在庫数
     */
    public void setHosozaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosozaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.hosozaiko = null;
        }
    }

    /** 生産終了予定日 */
    private java.math.BigDecimal sendyoteibi;

    /**
     * @return 生産終了予定日
     */
    public java.math.BigDecimal getSendyoteibi() {
        return this.sendyoteibi;
    }

    /**
     * @param o 生産終了予定日
     */
    public void setSendyoteibi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendyoteibi = new java.math.BigDecimal(o.toString());
        } else {
            this.sendyoteibi = null;
        }
    }

    /** 生産終了日 */
    private java.math.BigDecimal sendbi;

    /**
     * @return 生産終了日
     */
    public java.math.BigDecimal getSendbi() {
        return this.sendbi;
    }

    /**
     * @param o 生産終了日
     */
    public void setSendbi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendbi = new java.math.BigDecimal(o.toString());
        } else {
            this.sendbi = null;
        }
    }

    /** 代替品番１ */
    private String hincdalt1;

    /**
     * @return 代替品番１
     */
    public String getHincdalt1() {
        return this.hincdalt1;
    }

    /**
     * @param o 代替品番１
     */
    public void setHincdalt1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hincdalt1 = String.valueOf(o.toString());
        } else {
            this.hincdalt1 = null;
        }
    }

    /** 代替品番２ */
    private String hincdalt2;

    /**
     * @return 代替品番２
     */
    public String getHincdalt2() {
        return this.hincdalt2;
    }

    /**
     * @param o 代替品番２
     */
    public void setHincdalt2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hincdalt2 = String.valueOf(o.toString());
        } else {
            this.hincdalt2 = null;
        }
    }

    /** 納期回答不可区分 */
    private String noukifukakbn;

    /**
     * @return 納期回答不可区分
     */
    public String getNoukifukakbn() {
        return this.noukifukakbn;
    }

    /**
     * @param o 納期回答不可区分
     */
    public void setNoukifukakbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.noukifukakbn = String.valueOf(o.toString());
        } else {
            this.noukifukakbn = null;
        }
    }

    /** 直送対象品区分 */
    private String chokuhinkbn;

    /**
     * @return 直送対象品区分
     */
    public String getChokuhinkbn() {
        return this.chokuhinkbn;
    }

    /**
     * @param o 直送対象品区分
     */
    public void setChokuhinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokuhinkbn = String.valueOf(o.toString());
        } else {
            this.chokuhinkbn = null;
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

    /** 直送可能区分 */
    private String chokukakbn;

    /**
     * @return 直送可能区分
     */
    public String getChokukakbn() {
        return this.chokukakbn;
    }

    /**
     * @param o 直送可能区分
     */
    public void setChokukakbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokukakbn = String.valueOf(o.toString());
        } else {
            this.chokukakbn = null;
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
     * 販売品目マスタ照会
     *
     * @param param1 販売品番
     * @return 販売品目マスタ
     */
    public static MHhinmok get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");

        String sql = "SELECT * FROM M_HHINMOK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.get(sql, params, MHhinmok.class);
    }

    /**
     * 販売品目マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 販売品番の採番処理
        numbering();

        // 包装材構成マスタの登録
        if (this.mHososets != null) {
            for (MHososet mHososet : this.mHososets) {
                mHososet.setHhinban(this.getHhinban());
                mHososet.insert(now, id);
            }
        }

        // 部品構成マスタの登録
        if (this.mPkoses != null) {
            for (MPkose mPkose : this.mPkoses) {
                mPkose.setHhinban(this.getHhinban());
                mPkose.insert(now, id);
            }
        }

        // バーコードマスタの登録
        if (this.mBarcd != null) {
            this.mBarcd.setHhinban(this.getHhinban());
            this.mBarcd.insert(now, id);
        }

        // 原価マスタの登録
        if (this.mGenka != null) {
            this.mGenka.setHhinban(this.getHhinban());
            this.mGenka.insert(now, id);
        }

        // 日産単価マスタの登録
        if (this.mNtanka != null) {
            this.mNtanka.setHhinban(this.getHhinban());
            this.mNtanka.insert(now, id);
        }

        // 製品原価マスタの登録
        if (this.mSgenka != null) {
            this.mSgenka.setHhinban(this.getHhinban());
            this.mSgenka.insert(now, id);
        }

        // ＳＫ品番マスタの登録
        if (this.mSkhin != null) {
            this.mSkhin.setHhinban(this.getHhinban());
            this.mSkhin.insert(now, id);
        }

        // 単価マスタの登録
        if (this.mTanka != null) {
            this.mTanka.setHhinban(this.getHhinban());
            this.mTanka.insert(now, id);
        }

        // WEB在庫管理マスタの登録
        if (this.mWebkan != null) {
            this.mWebkan.setHhinban(this.getHhinban());
            this.mWebkan.insert(now, id);
        }

        // 販売品目マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("hhinban -- :hhinban");
        nameList.add("lvcd -- :lvcd");
        nameList.add("dltflg -- :dltflg");
        nameList.add("hincd -- :hincd");
        nameList.add("hinmei -- :hinmei");
        nameList.add("setkbn -- :setkbn");
        nameList.add("sshinkbn -- :sshinkbn");
        nameList.add("jukinkbn -- :jukinkbn");
        nameList.add("tenkinkbn -- :tenkinkbn");
        nameList.add("nyukokinkbn -- :nyukokinkbn");
        nameList.add("seihinkbn -- :seihinkbn");
        nameList.add("sijikbn -- :sijikbn");
        nameList.add("shohin_bunrui -- :shohin_bunrui");
        nameList.add("kijunzaiko -- :kijunzaiko");
        nameList.add("sei_tanju -- :sei_tanju");
        nameList.add("locationno -- :locationno");
        nameList.add("hosocd -- :hosocd");
        nameList.add("hosotani -- :hosotani");
        nameList.add("hosokepin -- :hosokepin");
        nameList.add("konpokbn -- :konpokbn");
        nameList.add("klkbn -- :klkbn");
        nameList.add("jiskbn -- :jiskbn");
        nameList.add("setkijunh -- :setkijunh");
        nameList.add("kimatu_genka -- :kimatu_genka");
        nameList.add("hyojun_genka -- :hyojun_genka");
        nameList.add("niji_genka -- :niji_genka");
        nameList.add("hyojun_baika -- :hyojun_baika");
        nameList.add("tourokubi -- :tourokubi");
        nameList.add("hatubaibi -- :hatubaibi");
        nameList.add("tojitukbn -- :tojitukbn");
        nameList.add("sin_seihin_bunrui -- :sin_seihin_bunrui");
        nameList.add("dteibankbn -- :dteibankbn");
        nameList.add("zaijuckbn -- :zaijuckbn");
        nameList.add("stantocd -- :stantocd");
        nameList.add("torifukbn -- :torifukbn");
        nameList.add("prdendkbn -- :prdendkbn");
        nameList.add("bunrui4 -- :bunrui4");
        nameList.add("zaishukbn -- :zaishukbn");
        nameList.add("barcode -- :barcode");
        nameList.add("data_flg -- :data_flg");
        nameList.add("filler3 -- :filler3");
        nameList.add("upccd -- :upccd");
        nameList.add("zaikosu_h1 -- :zaikosu_h1");
        nameList.add("zaikosu_h2 -- :zaikosu_h2");
        nameList.add("zaikosu_h3 -- :zaikosu_h3");
        nameList.add("zaikosu_h4 -- :zaikosu_h4");
        nameList.add("zaikosu_h5 -- :zaikosu_h5");
        nameList.add("sijisu_h1 -- :sijisu_h1");
        nameList.add("sijisu_h2 -- :sijisu_h2");
        nameList.add("sijisu_h3 -- :sijisu_h3");
        nameList.add("sijisu_h4 -- :sijisu_h4");
        nameList.add("hikiate_h1 -- :hikiate_h1");
        nameList.add("hikiate_h2 -- :hikiate_h2");
        nameList.add("hikiate_h3 -- :hikiate_h3");
        nameList.add("hikiate_h4 -- :hikiate_h4");
        nameList.add("schuzansu1 -- :schuzansu1");
        nameList.add("schuzansu2 -- :schuzansu2");
        nameList.add("schuzansu3 -- :schuzansu3");
        nameList.add("uchuzansu1 -- :uchuzansu1");
        nameList.add("uchuzansu2 -- :uchuzansu2");
        nameList.add("uchuzansu3 -- :uchuzansu3");
        nameList.add("dchuzansu1 -- :dchuzansu1");
        nameList.add("dchuzansu2 -- :dchuzansu2");
        nameList.add("dchuzansu3 -- :dchuzansu3");
        nameList.add("nyukoyote_h1 -- :nyukoyote_h1");
        nameList.add("nyukoyote_h2 -- :nyukoyote_h2");
        nameList.add("nyukoyote_h3 -- :nyukoyote_h3");
        nameList.add("nyukoyote_h4 -- :nyukoyote_h4");
        nameList.add("sapporozaiko -- :sapporozaiko");
        nameList.add("sendaizaiko -- :sendaizaiko");
        nameList.add("tokyozaiko -- :tokyozaiko");
        nameList.add("kantozaiko -- :kantozaiko");
        nameList.add("kanazawazaiko -- :kanazawazaiko");
        nameList.add("nagoyazaiko -- :nagoyazaiko");
        nameList.add("kinkizaiko -- :kinkizaiko");
        nameList.add("hirosimazaiko -- :hirosimazaiko");
        nameList.add("fukuokazaiko -- :fukuokazaiko");
        nameList.add("gyomuzaiko -- :gyomuzaiko");
        nameList.add("boekizaiko -- :boekizaiko");
        nameList.add("hiteczaiko -- :hiteczaiko");
        nameList.add("boekiitaku -- :boekiitaku");
        nameList.add("sktchszaiko -- :sktchszaiko");
        nameList.add("hosozaiko -- :hosozaiko");
        nameList.add("sendyoteibi -- :sendyoteibi");
        nameList.add("sendbi -- :sendbi");
        nameList.add("hincdalt1 -- :hincdalt1");
        nameList.add("hincdalt2 -- :hincdalt2");
        nameList.add("noukifukakbn -- :noukifukakbn");
        nameList.add("chokuhinkbn -- :chokuhinkbn");
        nameList.add("kokusaicd -- :kokusaicd");
        nameList.add("kunicd -- :kunicd");
        nameList.add("chokukakbn -- :chokukakbn");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_HHINMOK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":lvcd");
        valueList.add(":dltflg");
        valueList.add(":hincd");
        valueList.add(":hinmei");
        valueList.add(":setkbn");
        valueList.add(":sshinkbn");
        valueList.add(":jukinkbn");
        valueList.add(":tenkinkbn");
        valueList.add(":nyukokinkbn");
        valueList.add(":seihinkbn");
        valueList.add(":sijikbn");
        valueList.add(":shohin-bunrui");
        valueList.add(":kijunzaiko");
        valueList.add(":sei-tanju");
        valueList.add(":locationno");
        valueList.add(":hosocd");
        valueList.add(":hosotani");
        valueList.add(":hosokepin");
        valueList.add(":konpokbn");
        valueList.add(":klkbn");
        valueList.add(":jiskbn");
        valueList.add(":setkijunh");
        valueList.add(":kimatu-genka");
        valueList.add(":hyojun-genka");
        valueList.add(":niji-genka");
        valueList.add(":hyojun-baika");
        valueList.add(":tourokubi");
        valueList.add(":hatubaibi");
        valueList.add(":tojitukbn");
        valueList.add(":sin-seihin-bunrui");
        valueList.add(":dteibankbn");
        valueList.add(":zaijuckbn");
        valueList.add(":stantocd");
        valueList.add(":torifukbn");
        valueList.add(":prdendkbn");
        valueList.add(":bunrui4");
        valueList.add(":zaishukbn");
        valueList.add(":barcode");
        valueList.add(":data-flg");
        valueList.add(":filler3");
        valueList.add(":upccd");
        valueList.add(":zaikosu-h1");
        valueList.add(":zaikosu-h2");
        valueList.add(":zaikosu-h3");
        valueList.add(":zaikosu-h4");
        valueList.add(":zaikosu-h5");
        valueList.add(":sijisu-h1");
        valueList.add(":sijisu-h2");
        valueList.add(":sijisu-h3");
        valueList.add(":sijisu-h4");
        valueList.add(":hikiate-h1");
        valueList.add(":hikiate-h2");
        valueList.add(":hikiate-h3");
        valueList.add(":hikiate-h4");
        valueList.add(":schuzansu1");
        valueList.add(":schuzansu2");
        valueList.add(":schuzansu3");
        valueList.add(":uchuzansu1");
        valueList.add(":uchuzansu2");
        valueList.add(":uchuzansu3");
        valueList.add(":dchuzansu1");
        valueList.add(":dchuzansu2");
        valueList.add(":dchuzansu3");
        valueList.add(":nyukoyote-h1");
        valueList.add(":nyukoyote-h2");
        valueList.add(":nyukoyote-h3");
        valueList.add(":nyukoyote-h4");
        valueList.add(":sapporozaiko");
        valueList.add(":sendaizaiko");
        valueList.add(":tokyozaiko");
        valueList.add(":kantozaiko");
        valueList.add(":kanazawazaiko");
        valueList.add(":nagoyazaiko");
        valueList.add(":kinkizaiko");
        valueList.add(":hirosimazaiko");
        valueList.add(":fukuokazaiko");
        valueList.add(":gyomuzaiko");
        valueList.add(":boekizaiko");
        valueList.add(":hiteczaiko");
        valueList.add(":boekiitaku");
        valueList.add(":sktchszaiko");
        valueList.add(":hosozaiko");
        valueList.add(":sendyoteibi");
        valueList.add(":sendbi");
        valueList.add(":hincdalt1");
        valueList.add(":hincdalt2");
        valueList.add(":noukifukakbn");
        valueList.add(":chokuhinkbn");
        valueList.add(":kokusaicd");
        valueList.add(":kunicd");
        valueList.add(":chokukakbn");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 販売品番の採番処理 */
    private void numbering() {

        if (this.hhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HHINBAN) IS NULL THEN 0 ELSE MAX(e.HHINBAN) * 1 END + 1, 20, '0') AS HHINBAN FROM M_HHINMOK e WHERE e.HHINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HHINBAN");

        this.setHhinban(o);
    }

    /**
     * 販売品目マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 包装材構成マスタの登録
        if (this.mHososets != null) {
            Queries.regist("DELETE FROM M_HOSOSET WHERE HHINBAN = :HHINBAN AND HOSO-HINBAN = :HOSO-HINBAN", toMap(now, id));
            for (MHososet mHososet : this.mHososets) {
                mHososet.setHhinban(this.hhinban);
                try {
                    mHososet.insert(now, id);
                } catch (Exception e) {
                    mHososet.update(now, id);
                }
            }
        }

        // 部品構成マスタの登録
        if (this.mPkoses != null) {
            Queries.regist("DELETE FROM M_PKOSE WHERE HHINBAN = :HHINBAN AND PHINBAN = :PHINBAN", toMap(now, id));
            for (MPkose mPkose : this.mPkoses) {
                mPkose.setHhinban(this.hhinban);
                try {
                    mPkose.insert(now, id);
                } catch (Exception e) {
                    mPkose.update(now, id);
                }
            }
        }

        // バーコードマスタの登録
        if (this.mBarcd != null) {
            mBarcd.setHhinban(this.getHhinban());
            try {
                mBarcd.insert(now, id);
            } catch (Exception e) {
                mBarcd.update(now, id);
            }
        }

        // 原価マスタの登録
        if (this.mGenka != null) {
            mGenka.setHhinban(this.getHhinban());
            try {
                mGenka.insert(now, id);
            } catch (Exception e) {
                mGenka.update(now, id);
            }
        }

        // 日産単価マスタの登録
        if (this.mNtanka != null) {
            mNtanka.setHhinban(this.getHhinban());
            try {
                mNtanka.insert(now, id);
            } catch (Exception e) {
                mNtanka.update(now, id);
            }
        }

        // 製品原価マスタの登録
        if (this.mSgenka != null) {
            mSgenka.setHhinban(this.getHhinban());
            try {
                mSgenka.insert(now, id);
            } catch (Exception e) {
                mSgenka.update(now, id);
            }
        }

        // ＳＫ品番マスタの登録
        if (this.mSkhin != null) {
            mSkhin.setHhinban(this.getHhinban());
            try {
                mSkhin.insert(now, id);
            } catch (Exception e) {
                mSkhin.update(now, id);
            }
        }

        // 単価マスタの登録
        if (this.mTanka != null) {
            mTanka.setHhinban(this.getHhinban());
            try {
                mTanka.insert(now, id);
            } catch (Exception e) {
                mTanka.update(now, id);
            }
        }

        // WEB在庫管理マスタの登録
        if (this.mWebkan != null) {
            mWebkan.setHhinban(this.getHhinban());
            try {
                mWebkan.insert(now, id);
            } catch (Exception e) {
                mWebkan.update(now, id);
            }
        }

        // 販売品目マスタの登録
        String sql = "UPDATE M_HHINMOK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("hhinban = :hhinban");
        setList.add("lvcd = :lvcd");
        setList.add("dltflg = :dltflg");
        setList.add("hincd = :hincd");
        setList.add("hinmei = :hinmei");
        setList.add("setkbn = :setkbn");
        setList.add("sshinkbn = :sshinkbn");
        setList.add("jukinkbn = :jukinkbn");
        setList.add("tenkinkbn = :tenkinkbn");
        setList.add("nyukokinkbn = :nyukokinkbn");
        setList.add("seihinkbn = :seihinkbn");
        setList.add("sijikbn = :sijikbn");
        setList.add("shohin-bunrui = :shohin-bunrui");
        setList.add("kijunzaiko = :kijunzaiko");
        setList.add("sei-tanju = :sei-tanju");
        setList.add("locationno = :locationno");
        setList.add("hosocd = :hosocd");
        setList.add("hosotani = :hosotani");
        setList.add("hosokepin = :hosokepin");
        setList.add("konpokbn = :konpokbn");
        setList.add("klkbn = :klkbn");
        setList.add("jiskbn = :jiskbn");
        setList.add("setkijunh = :setkijunh");
        setList.add("kimatu-genka = :kimatu-genka");
        setList.add("hyojun-genka = :hyojun-genka");
        setList.add("niji-genka = :niji-genka");
        setList.add("hyojun-baika = :hyojun-baika");
        setList.add("tourokubi = :tourokubi");
        setList.add("hatubaibi = :hatubaibi");
        setList.add("tojitukbn = :tojitukbn");
        setList.add("sin-seihin-bunrui = :sin-seihin-bunrui");
        setList.add("dteibankbn = :dteibankbn");
        setList.add("zaijuckbn = :zaijuckbn");
        setList.add("stantocd = :stantocd");
        setList.add("torifukbn = :torifukbn");
        setList.add("prdendkbn = :prdendkbn");
        setList.add("bunrui4 = :bunrui4");
        setList.add("zaishukbn = :zaishukbn");
        setList.add("barcode = :barcode");
        setList.add("data-flg = :data-flg");
        setList.add("filler3 = :filler3");
        setList.add("upccd = :upccd");
        setList.add("zaikosu-h1 = :zaikosu-h1");
        setList.add("zaikosu-h2 = :zaikosu-h2");
        setList.add("zaikosu-h3 = :zaikosu-h3");
        setList.add("zaikosu-h4 = :zaikosu-h4");
        setList.add("zaikosu-h5 = :zaikosu-h5");
        setList.add("sijisu-h1 = :sijisu-h1");
        setList.add("sijisu-h2 = :sijisu-h2");
        setList.add("sijisu-h3 = :sijisu-h3");
        setList.add("sijisu-h4 = :sijisu-h4");
        setList.add("hikiate-h1 = :hikiate-h1");
        setList.add("hikiate-h2 = :hikiate-h2");
        setList.add("hikiate-h3 = :hikiate-h3");
        setList.add("hikiate-h4 = :hikiate-h4");
        setList.add("schuzansu1 = :schuzansu1");
        setList.add("schuzansu2 = :schuzansu2");
        setList.add("schuzansu3 = :schuzansu3");
        setList.add("uchuzansu1 = :uchuzansu1");
        setList.add("uchuzansu2 = :uchuzansu2");
        setList.add("uchuzansu3 = :uchuzansu3");
        setList.add("dchuzansu1 = :dchuzansu1");
        setList.add("dchuzansu2 = :dchuzansu2");
        setList.add("dchuzansu3 = :dchuzansu3");
        setList.add("nyukoyote-h1 = :nyukoyote-h1");
        setList.add("nyukoyote-h2 = :nyukoyote-h2");
        setList.add("nyukoyote-h3 = :nyukoyote-h3");
        setList.add("nyukoyote-h4 = :nyukoyote-h4");
        setList.add("sapporozaiko = :sapporozaiko");
        setList.add("sendaizaiko = :sendaizaiko");
        setList.add("tokyozaiko = :tokyozaiko");
        setList.add("kantozaiko = :kantozaiko");
        setList.add("kanazawazaiko = :kanazawazaiko");
        setList.add("nagoyazaiko = :nagoyazaiko");
        setList.add("kinkizaiko = :kinkizaiko");
        setList.add("hirosimazaiko = :hirosimazaiko");
        setList.add("fukuokazaiko = :fukuokazaiko");
        setList.add("gyomuzaiko = :gyomuzaiko");
        setList.add("boekizaiko = :boekizaiko");
        setList.add("hiteczaiko = :hiteczaiko");
        setList.add("boekiitaku = :boekiitaku");
        setList.add("sktchszaiko = :sktchszaiko");
        setList.add("hosozaiko = :hosozaiko");
        setList.add("sendyoteibi = :sendyoteibi");
        setList.add("sendbi = :sendbi");
        setList.add("hincdalt1 = :hincdalt1");
        setList.add("hincdalt2 = :hincdalt2");
        setList.add("noukifukakbn = :noukifukakbn");
        setList.add("chokuhinkbn = :chokuhinkbn");
        setList.add("kokusaicd = :kokusaicd");
        setList.add("kunicd = :kunicd");
        setList.add("chokukakbn = :chokukakbn");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 販売品目マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 包装材構成マスタの削除
        if (this.mHososets != null) {
            for (MHososet mHososet : this.mHososets) {
                mHososet.delete();
            }
        }

        // 部品構成マスタの削除
        if (this.mPkoses != null) {
            for (MPkose mPkose : this.mPkoses) {
                mPkose.delete();
            }
        }

        // バーコードマスタの削除
        if (this.mBarcd != null) {
            this.mBarcd.delete();
        }

        // 原価マスタの削除
        if (this.mGenka != null) {
            this.mGenka.delete();
        }

        // 日産単価マスタの削除
        if (this.mNtanka != null) {
            this.mNtanka.delete();
        }

        // 製品原価マスタの削除
        if (this.mSgenka != null) {
            this.mSgenka.delete();
        }

        // ＳＫ品番マスタの削除
        if (this.mSkhin != null) {
            this.mSkhin.delete();
        }

        // 単価マスタの削除
        if (this.mTanka != null) {
            this.mTanka.delete();
        }

        // WEB在庫管理マスタの削除
        if (this.mWebkan != null) {
            this.mWebkan.delete();
        }

        // 販売品目マスタの削除
        String sql = "DELETE FROM M_HHINMOK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hhinban) = TRIM (:hhinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("HHINBAN", this.hhinban);
        params.put("LVCD", this.lvcd);
        params.put("DLTFLG", this.dltflg);
        params.put("HINCD", this.hincd);
        params.put("HINMEI", this.hinmei);
        params.put("SETKBN", this.setkbn);
        params.put("SSHINKBN", this.sshinkbn);
        params.put("JUKINKBN", this.jukinkbn);
        params.put("TENKINKBN", this.tenkinkbn);
        params.put("NYUKOKINKBN", this.nyukokinkbn);
        params.put("SEIHINKBN", this.seihinkbn);
        params.put("SIJIKBN", this.sijikbn);
        params.put("SHOHIN-BUNRUI", this.shohinBunrui);
        params.put("KIJUNZAIKO", this.kijunzaiko);
        params.put("SEI-TANJU", this.seiTanju);
        params.put("LOCATIONNO", this.locationno);
        params.put("HOSOCD", this.hosocd);
        params.put("HOSOTANI", this.hosotani);
        params.put("HOSOKEPIN", this.hosokepin);
        params.put("KONPOKBN", this.konpokbn);
        params.put("KLKBN", this.klkbn);
        params.put("JISKBN", this.jiskbn);
        params.put("SETKIJUNH", this.setkijunh);
        params.put("KIMATU-GENKA", this.kimatuGenka);
        params.put("HYOJUN-GENKA", this.hyojunGenka);
        params.put("NIJI-GENKA", this.nijiGenka);
        params.put("HYOJUN-BAIKA", this.hyojunBaika);
        params.put("TOUROKUBI", this.tourokubi);
        params.put("HATUBAIBI", this.hatubaibi);
        params.put("TOJITUKBN", this.tojitukbn);
        params.put("SIN-SEIHIN-BUNRUI", this.sinSeihinBunrui);
        params.put("DTEIBANKBN", this.dteibankbn);
        params.put("ZAIJUCKBN", this.zaijuckbn);
        params.put("STANTOCD", this.stantocd);
        params.put("TORIFUKBN", this.torifukbn);
        params.put("PRDENDKBN", this.prdendkbn);
        params.put("BUNRUI4", this.bunrui4);
        params.put("ZAISHUKBN", this.zaishukbn);
        params.put("BARCODE", this.barcode);
        params.put("DATA-FLG", this.dataFlg);
        params.put("FILLER3", this.filler3);
        params.put("UPCCD", this.upccd);
        params.put("ZAIKOSU-H1", this.zaikosuH1);
        params.put("ZAIKOSU-H2", this.zaikosuH2);
        params.put("ZAIKOSU-H3", this.zaikosuH3);
        params.put("ZAIKOSU-H4", this.zaikosuH4);
        params.put("ZAIKOSU-H5", this.zaikosuH5);
        params.put("SIJISU-H1", this.sijisuH1);
        params.put("SIJISU-H2", this.sijisuH2);
        params.put("SIJISU-H3", this.sijisuH3);
        params.put("SIJISU-H4", this.sijisuH4);
        params.put("HIKIATE-H1", this.hikiateH1);
        params.put("HIKIATE-H2", this.hikiateH2);
        params.put("HIKIATE-H3", this.hikiateH3);
        params.put("HIKIATE-H4", this.hikiateH4);
        params.put("SCHUZANSU1", this.schuzansu1);
        params.put("SCHUZANSU2", this.schuzansu2);
        params.put("SCHUZANSU3", this.schuzansu3);
        params.put("UCHUZANSU1", this.uchuzansu1);
        params.put("UCHUZANSU2", this.uchuzansu2);
        params.put("UCHUZANSU3", this.uchuzansu3);
        params.put("DCHUZANSU1", this.dchuzansu1);
        params.put("DCHUZANSU2", this.dchuzansu2);
        params.put("DCHUZANSU3", this.dchuzansu3);
        params.put("NYUKOYOTE-H1", this.nyukoyoteH1);
        params.put("NYUKOYOTE-H2", this.nyukoyoteH2);
        params.put("NYUKOYOTE-H3", this.nyukoyoteH3);
        params.put("NYUKOYOTE-H4", this.nyukoyoteH4);
        params.put("SAPPOROZAIKO", this.sapporozaiko);
        params.put("SENDAIZAIKO", this.sendaizaiko);
        params.put("TOKYOZAIKO", this.tokyozaiko);
        params.put("KANTOZAIKO", this.kantozaiko);
        params.put("KANAZAWAZAIKO", this.kanazawazaiko);
        params.put("NAGOYAZAIKO", this.nagoyazaiko);
        params.put("KINKIZAIKO", this.kinkizaiko);
        params.put("HIROSIMAZAIKO", this.hirosimazaiko);
        params.put("FUKUOKAZAIKO", this.fukuokazaiko);
        params.put("GYOMUZAIKO", this.gyomuzaiko);
        params.put("BOEKIZAIKO", this.boekizaiko);
        params.put("HITECZAIKO", this.hiteczaiko);
        params.put("BOEKIITAKU", this.boekiitaku);
        params.put("SKTCHSZAIKO", this.sktchszaiko);
        params.put("HOSOZAIKO", this.hosozaiko);
        params.put("SENDYOTEIBI", this.sendyoteibi);
        params.put("SENDBI", this.sendbi);
        params.put("HINCDALT1", this.hincdalt1);
        params.put("HINCDALT2", this.hincdalt2);
        params.put("NOUKIFUKAKBN", this.noukifukakbn);
        params.put("CHOKUHINKBN", this.chokuhinkbn);
        params.put("KOKUSAICD", this.kokusaicd);
        params.put("KUNICD", this.kunicd);
        params.put("CHOKUKAKBN", this.chokukakbn);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * バーコードマスタ
     */
    private MBarcd mBarcd;

    /**
     * @return バーコードマスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MBarcd")
    public MBarcd getMBarcd() {
        return this.mBarcd;
    }

    /**
     * @param p バーコードマスタ
     */
    public void setMBarcd(final MBarcd p) {
        this.mBarcd = p;
    }

    /**
     * @return バーコードマスタ
     */
    public MBarcd referMBarcd() {
        if (this.mBarcd == null) {
            try {
                this.mBarcd = MBarcd.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mBarcd;
    }

    /**
     * 原価マスタ
     */
    private MGenka mGenka;

    /**
     * @return 原価マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MGenka")
    public MGenka getMGenka() {
        return this.mGenka;
    }

    /**
     * @param p 原価マスタ
     */
    public void setMGenka(final MGenka p) {
        this.mGenka = p;
    }

    /**
     * @return 原価マスタ
     */
    public MGenka referMGenka() {
        if (this.mGenka == null) {
            try {
                this.mGenka = MGenka.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mGenka;
    }

    /**
     * 日産単価マスタ
     */
    private MNtanka mNtanka;

    /**
     * @return 日産単価マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MNtanka")
    public MNtanka getMNtanka() {
        return this.mNtanka;
    }

    /**
     * @param p 日産単価マスタ
     */
    public void setMNtanka(final MNtanka p) {
        this.mNtanka = p;
    }

    /**
     * @return 日産単価マスタ
     */
    public MNtanka referMNtanka() {
        if (this.mNtanka == null) {
            try {
                this.mNtanka = MNtanka.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mNtanka;
    }

    /**
     * 製品原価マスタ
     */
    private MSgenka mSgenka;

    /**
     * @return 製品原価マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MSgenka")
    public MSgenka getMSgenka() {
        return this.mSgenka;
    }

    /**
     * @param p 製品原価マスタ
     */
    public void setMSgenka(final MSgenka p) {
        this.mSgenka = p;
    }

    /**
     * @return 製品原価マスタ
     */
    public MSgenka referMSgenka() {
        if (this.mSgenka == null) {
            try {
                this.mSgenka = MSgenka.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mSgenka;
    }

    /**
     * ＳＫ品番マスタ
     */
    private MSkhin mSkhin;

    /**
     * @return ＳＫ品番マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MSkhin")
    public MSkhin getMSkhin() {
        return this.mSkhin;
    }

    /**
     * @param p ＳＫ品番マスタ
     */
    public void setMSkhin(final MSkhin p) {
        this.mSkhin = p;
    }

    /**
     * @return ＳＫ品番マスタ
     */
    public MSkhin referMSkhin() {
        if (this.mSkhin == null) {
            try {
                this.mSkhin = MSkhin.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mSkhin;
    }

    /**
     * 単価マスタ
     */
    private MTanka mTanka;

    /**
     * @return 単価マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MTanka")
    public MTanka getMTanka() {
        return this.mTanka;
    }

    /**
     * @param p 単価マスタ
     */
    public void setMTanka(final MTanka p) {
        this.mTanka = p;
    }

    /**
     * @return 単価マスタ
     */
    public MTanka referMTanka() {
        if (this.mTanka == null) {
            try {
                this.mTanka = MTanka.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mTanka;
    }

    /**
     * WEB在庫管理マスタ
     */
    private MWebkan mWebkan;

    /**
     * @return WEB在庫管理マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MWebkan")
    public MWebkan getMWebkan() {
        return this.mWebkan;
    }

    /**
     * @param p WEB在庫管理マスタ
     */
    public void setMWebkan(final MWebkan p) {
        this.mWebkan = p;
    }

    /**
     * @return WEB在庫管理マスタ
     */
    public MWebkan referMWebkan() {
        if (this.mWebkan == null) {
            try {
                this.mWebkan = MWebkan.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mWebkan;
    }

    /**
     * 包装材構成マスタのリスト
     */
    private List<MHososet> mHososets;

    /**
     * @return 包装材構成マスタのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MHososets")
    public List<MHososet> getMHososets() {
        return this.mHososets;
    }

    /**
     * @param list 包装材構成マスタのリスト
     */
    public void setMHososets(final List<MHososet> list) {
        this.mHososets = list;
    }

    /**
     * @param mHososet
     */
    public void addMHososets(final MHososet mHososet) {
        if (this.mHososets == null) {
            this.mHososets = new ArrayList<MHososet>();
        }
        this.mHososets.add(mHososet);
    }

    /**
     * @return 包装材構成マスタのリスト
     */
    public List<MHososet> referMHososets() {
        if (this.mHososets == null) {
            this.mHososets = MHhinmok.referMHososets(this.hhinban);
        }
        return this.mHososets;
    }

    /**
     * @param param1 hhinban
     * @return List<MHososet>
     */
    public static List<MHososet> referMHososets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hhinban = :hhinban");

        String sql = "SELECT * FROM M_HOSOSET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.select(sql, params, MHososet.class);
    }

    /**
     * 部品構成マスタのリスト
     */
    private List<MPkose> mPkoses;

    /**
     * @return 部品構成マスタのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MPkoses")
    public List<MPkose> getMPkoses() {
        return this.mPkoses;
    }

    /**
     * @param list 部品構成マスタのリスト
     */
    public void setMPkoses(final List<MPkose> list) {
        this.mPkoses = list;
    }

    /**
     * @param mPkose
     */
    public void addMPkoses(final MPkose mPkose) {
        if (this.mPkoses == null) {
            this.mPkoses = new ArrayList<MPkose>();
        }
        this.mPkoses.add(mPkose);
    }

    /**
     * @return 部品構成マスタのリスト
     */
    public List<MPkose> referMPkoses() {
        if (this.mPkoses == null) {
            this.mPkoses = MHhinmok.referMPkoses(this.hhinban);
        }
        return this.mPkoses;
    }

    /**
     * @param param1 hhinban
     * @return List<MPkose>
     */
    public static List<MPkose> referMPkoses(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hhinban = :hhinban");

        String sql = "SELECT * FROM M_PKOSE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.select(sql, params, MPkose.class);
    }
}
