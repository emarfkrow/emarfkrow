package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 販売品目マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MHhinmokRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHhinmokRegistForm.class);

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

    /** ローレベルコード */
    @jakarta.validation.constraints.Size(max = 2)
    private String lvcd;

    /**
     * @return ローレベルコード
     */
    public String getLvcd() {
        return lvcd;
    }

    /**
     * @param p ローレベルコード
     */
    public void setLvcd(final String p) {
        this.lvcd = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String dltflg;

    /**
     * @return 削除フラグ
     */
    public String getDltflg() {
        return dltflg;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDltflg(final String p) {
        this.dltflg = p;
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

    /** 品名 */
    @jakarta.validation.constraints.Size(max = 10)
    private String hinmei;

    /**
     * @return 品名
     */
    public String getHinmei() {
        return hinmei;
    }

    /**
     * @param p 品名
     */
    public void setHinmei(final String p) {
        this.hinmei = p;
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

    /** 戦略商品区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String sshinkbn;

    /**
     * @return 戦略商品区分
     */
    public String getSshinkbn() {
        return sshinkbn;
    }

    /**
     * @param p 戦略商品区分
     */
    public void setSshinkbn(final String p) {
        this.sshinkbn = p;
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

    /** 入庫禁止区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String nyukokinkbn;

    /**
     * @return 入庫禁止区分
     */
    public String getNyukokinkbn() {
        return nyukokinkbn;
    }

    /**
     * @param p 入庫禁止区分
     */
    public void setNyukokinkbn(final String p) {
        this.nyukokinkbn = p;
    }

    /** 製品区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String seihinkbn;

    /**
     * @return 製品区分
     */
    public String getSeihinkbn() {
        return seihinkbn;
    }

    /**
     * @param p 製品区分
     */
    public void setSeihinkbn(final String p) {
        this.seihinkbn = p;
    }

    /** 出荷指示区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String sijikbn;

    /**
     * @return 出荷指示区分
     */
    public String getSijikbn() {
        return sijikbn;
    }

    /**
     * @param p 出荷指示区分
     */
    public void setSijikbn(final String p) {
        this.sijikbn = p;
    }

    /** 商品分類 */
    @jakarta.validation.constraints.Size(max = 2)
    private String shohinBunrui;

    /**
     * @return 商品分類
     */
    public String getShohinBunrui() {
        return shohinBunrui;
    }

    /**
     * @param p 商品分類
     */
    public void setShohinBunrui(final String p) {
        this.shohinBunrui = p;
    }

    /** 基準在庫 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kijunzaiko;

    /**
     * @return 基準在庫
     */
    public String getKijunzaiko() {
        return kijunzaiko;
    }

    /**
     * @param p 基準在庫
     */
    public void setKijunzaiko(final String p) {
        this.kijunzaiko = p;
    }

    /** 製品単重 */
    @jakarta.validation.constraints.Size(max = 7)
    private String seiTanju;

    /**
     * @return 製品単重
     */
    public String getSeiTanju() {
        return seiTanju;
    }

    /**
     * @param p 製品単重
     */
    public void setSeiTanju(final String p) {
        this.seiTanju = p;
    }

    /** ロケーションＮＯ */
    @jakarta.validation.constraints.Size(max = 10)
    private String locationno;

    /**
     * @return ロケーションＮＯ
     */
    public String getLocationno() {
        return locationno;
    }

    /**
     * @param p ロケーションＮＯ
     */
    public void setLocationno(final String p) {
        this.locationno = p;
    }

    /** 包装コード */
    @jakarta.validation.constraints.Size(max = 2)
    private String hosocd;

    /**
     * @return 包装コード
     */
    public String getHosocd() {
        return hosocd;
    }

    /**
     * @param p 包装コード
     */
    public void setHosocd(final String p) {
        this.hosocd = p;
    }

    /** 包装単位 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hosotani;

    /**
     * @return 包装単位
     */
    public String getHosotani() {
        return hosotani;
    }

    /**
     * @param p 包装単位
     */
    public void setHosotani(final String p) {
        this.hosotani = p;
    }

    /** 包装材欠品区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String hosokepin;

    /**
     * @return 包装材欠品区分
     */
    public String getHosokepin() {
        return hosokepin;
    }

    /**
     * @param p 包装材欠品区分
     */
    public void setHosokepin(final String p) {
        this.hosokepin = p;
    }

    /** 梱包区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String konpokbn;

    /**
     * @return 梱包区分
     */
    public String getKonpokbn() {
        return konpokbn;
    }

    /**
     * @param p 梱包区分
     */
    public void setKonpokbn(final String p) {
        this.konpokbn = p;
    }

    /** かんばんロット区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String klkbn;

    /**
     * @return かんばんロット区分
     */
    public String getKlkbn() {
        return klkbn;
    }

    /**
     * @param p かんばんロット区分
     */
    public void setKlkbn(final String p) {
        this.klkbn = p;
    }

    /** ＪＩＳ区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String jiskbn;

    /**
     * @return ＪＩＳ区分
     */
    public String getJiskbn() {
        return jiskbn;
    }

    /**
     * @param p ＪＩＳ区分
     */
    public void setJiskbn(final String p) {
        this.jiskbn = p;
    }

    /** セット基準時間 */
    @jakarta.validation.constraints.Size(max = 4)
    private String setkijunh;

    /**
     * @return セット基準時間
     */
    public String getSetkijunh() {
        return setkijunh;
    }

    /**
     * @param p セット基準時間
     */
    public void setSetkijunh(final String p) {
        this.setkijunh = p;
    }

    /** 期末原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kimatuGenka;

    /**
     * @return 期末原価
     */
    public String getKimatuGenka() {
        return kimatuGenka;
    }

    /**
     * @param p 期末原価
     */
    public void setKimatuGenka(final String p) {
        this.kimatuGenka = p;
    }

    /** 標準原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hyojunGenka;

    /**
     * @return 標準原価
     */
    public String getHyojunGenka() {
        return hyojunGenka;
    }

    /**
     * @param p 標準原価
     */
    public void setHyojunGenka(final String p) {
        this.hyojunGenka = p;
    }

    /** 二次評価原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String nijiGenka;

    /**
     * @return 二次評価原価
     */
    public String getNijiGenka() {
        return nijiGenka;
    }

    /**
     * @param p 二次評価原価
     */
    public void setNijiGenka(final String p) {
        this.nijiGenka = p;
    }

    /** 標準売価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hyojunBaika;

    /**
     * @return 標準売価
     */
    public String getHyojunBaika() {
        return hyojunBaika;
    }

    /**
     * @param p 標準売価
     */
    public void setHyojunBaika(final String p) {
        this.hyojunBaika = p;
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

    /** 製品発売日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String hatubaibi;

    /**
     * @return 製品発売日
     */
    public String getHatubaibi() {
        return hatubaibi;
    }

    /**
     * @param p 製品発売日
     */
    public void setHatubaibi(final String p) {
        this.hatubaibi = p;
    }

    /** 当日出荷対象区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String tojitukbn;

    /**
     * @return 当日出荷対象区分
     */
    public String getTojitukbn() {
        return tojitukbn;
    }

    /**
     * @param p 当日出荷対象区分
     */
    public void setTojitukbn(final String p) {
        this.tojitukbn = p;
    }

    /** 新製品分類 */
    @jakarta.validation.constraints.Size(max = 2)
    private String sinSeihinBunrui;

    /**
     * @return 新製品分類
     */
    public String getSinSeihinBunrui() {
        return sinSeihinBunrui;
    }

    /**
     * @param p 新製品分類
     */
    public void setSinSeihinBunrui(final String p) {
        this.sinSeihinBunrui = p;
    }

    /** ＤＩＹ定番区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String dteibankbn;

    /**
     * @return ＤＩＹ定番区分
     */
    public String getDteibankbn() {
        return dteibankbn;
    }

    /**
     * @param p ＤＩＹ定番区分
     */
    public void setDteibankbn(final String p) {
        this.dteibankbn = p;
    }

    /** 在庫受注区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String zaijuckbn;

    /**
     * @return 在庫受注区分
     */
    public String getZaijuckbn() {
        return zaijuckbn;
    }

    /**
     * @param p 在庫受注区分
     */
    public void setZaijuckbn(final String p) {
        this.zaijuckbn = p;
    }

    /** 生産担当者コード */
    @jakarta.validation.constraints.Size(max = 3)
    private String stantocd;

    /**
     * @return 生産担当者コード
     */
    public String getStantocd() {
        return stantocd;
    }

    /**
     * @param p 生産担当者コード
     */
    public void setStantocd(final String p) {
        this.stantocd = p;
    }

    /** 直送取消不可区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String torifukbn;

    /**
     * @return 直送取消不可区分
     */
    public String getTorifukbn() {
        return torifukbn;
    }

    /**
     * @param p 直送取消不可区分
     */
    public void setTorifukbn(final String p) {
        this.torifukbn = p;
    }

    /** 生産中止区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String prdendkbn;

    /**
     * @return 生産中止区分
     */
    public String getPrdendkbn() {
        return prdendkbn;
    }

    /**
     * @param p 生産中止区分
     */
    public void setPrdendkbn(final String p) {
        this.prdendkbn = p;
    }

    /** 品種分類４ */
    @jakarta.validation.constraints.Size(max = 2)
    private String bunrui4;

    /**
     * @return 品種分類４
     */
    public String getBunrui4() {
        return bunrui4;
    }

    /**
     * @param p 品種分類４
     */
    public void setBunrui4(final String p) {
        this.bunrui4 = p;
    }

    /** 在庫出荷区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String zaishukbn;

    /**
     * @return 在庫出荷区分
     */
    public String getZaishukbn() {
        return zaishukbn;
    }

    /**
     * @param p 在庫出荷区分
     */
    public void setZaishukbn(final String p) {
        this.zaishukbn = p;
    }

    /** バーコード */
    @jakarta.validation.constraints.Size(max = 13)
    private String barcode;

    /**
     * @return バーコード
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param p バーコード
     */
    public void setBarcode(final String p) {
        this.barcode = p;
    }

    /** データ送信区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String dataFlg;

    /**
     * @return データ送信区分
     */
    public String getDataFlg() {
        return dataFlg;
    }

    /**
     * @param p データ送信区分
     */
    public void setDataFlg(final String p) {
        this.dataFlg = p;
    }

    /** ＵＰＣコード */
    @jakarta.validation.constraints.Size(max = 12)
    private String upccd;

    /**
     * @return ＵＰＣコード
     */
    public String getUpccd() {
        return upccd;
    }

    /**
     * @param p ＵＰＣコード
     */
    public void setUpccd(final String p) {
        this.upccd = p;
    }

    /** 平１在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String zaikosuH1;

    /**
     * @return 平１在庫数
     */
    public String getZaikosuH1() {
        return zaikosuH1;
    }

    /**
     * @param p 平１在庫数
     */
    public void setZaikosuH1(final String p) {
        this.zaikosuH1 = p;
    }

    /** 平２在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String zaikosuH2;

    /**
     * @return 平２在庫数
     */
    public String getZaikosuH2() {
        return zaikosuH2;
    }

    /**
     * @param p 平２在庫数
     */
    public void setZaikosuH2(final String p) {
        this.zaikosuH2 = p;
    }

    /** 平３在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String zaikosuH3;

    /**
     * @return 平３在庫数
     */
    public String getZaikosuH3() {
        return zaikosuH3;
    }

    /**
     * @param p 平３在庫数
     */
    public void setZaikosuH3(final String p) {
        this.zaikosuH3 = p;
    }

    /** 平４在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String zaikosuH4;

    /**
     * @return 平４在庫数
     */
    public String getZaikosuH4() {
        return zaikosuH4;
    }

    /**
     * @param p 平４在庫数
     */
    public void setZaikosuH4(final String p) {
        this.zaikosuH4 = p;
    }

    /** 平５在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String zaikosuH5;

    /**
     * @return 平５在庫数
     */
    public String getZaikosuH5() {
        return zaikosuH5;
    }

    /**
     * @param p 平５在庫数
     */
    public void setZaikosuH5(final String p) {
        this.zaikosuH5 = p;
    }

    /** 平１指示数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String sijisuH1;

    /**
     * @return 平１指示数
     */
    public String getSijisuH1() {
        return sijisuH1;
    }

    /**
     * @param p 平１指示数
     */
    public void setSijisuH1(final String p) {
        this.sijisuH1 = p;
    }

    /** 平２指示数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String sijisuH2;

    /**
     * @return 平２指示数
     */
    public String getSijisuH2() {
        return sijisuH2;
    }

    /**
     * @param p 平２指示数
     */
    public void setSijisuH2(final String p) {
        this.sijisuH2 = p;
    }

    /** 平３指示数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String sijisuH3;

    /**
     * @return 平３指示数
     */
    public String getSijisuH3() {
        return sijisuH3;
    }

    /**
     * @param p 平３指示数
     */
    public void setSijisuH3(final String p) {
        this.sijisuH3 = p;
    }

    /** 平４指示数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String sijisuH4;

    /**
     * @return 平４指示数
     */
    public String getSijisuH4() {
        return sijisuH4;
    }

    /**
     * @param p 平４指示数
     */
    public void setSijisuH4(final String p) {
        this.sijisuH4 = p;
    }

    /** 平１引当数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hikiateH1;

    /**
     * @return 平１引当数
     */
    public String getHikiateH1() {
        return hikiateH1;
    }

    /**
     * @param p 平１引当数
     */
    public void setHikiateH1(final String p) {
        this.hikiateH1 = p;
    }

    /** 平２引当数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hikiateH2;

    /**
     * @return 平２引当数
     */
    public String getHikiateH2() {
        return hikiateH2;
    }

    /**
     * @param p 平２引当数
     */
    public void setHikiateH2(final String p) {
        this.hikiateH2 = p;
    }

    /** 平３引当数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hikiateH3;

    /**
     * @return 平３引当数
     */
    public String getHikiateH3() {
        return hikiateH3;
    }

    /**
     * @param p 平３引当数
     */
    public void setHikiateH3(final String p) {
        this.hikiateH3 = p;
    }

    /** 平４引当数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hikiateH4;

    /**
     * @return 平４引当数
     */
    public String getHikiateH4() {
        return hikiateH4;
    }

    /**
     * @param p 平４引当数
     */
    public void setHikiateH4(final String p) {
        this.hikiateH4 = p;
    }

    /** 市販当月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String schuzansu1;

    /**
     * @return 市販当月注残数
     */
    public String getSchuzansu1() {
        return schuzansu1;
    }

    /**
     * @param p 市販当月注残数
     */
    public void setSchuzansu1(final String p) {
        this.schuzansu1 = p;
    }

    /** 市販翌月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String schuzansu2;

    /**
     * @return 市販翌月注残数
     */
    public String getSchuzansu2() {
        return schuzansu2;
    }

    /**
     * @param p 市販翌月注残数
     */
    public void setSchuzansu2(final String p) {
        this.schuzansu2 = p;
    }

    /** 市販翌々月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String schuzansu3;

    /**
     * @return 市販翌々月注残数
     */
    public String getSchuzansu3() {
        return schuzansu3;
    }

    /**
     * @param p 市販翌々月注残数
     */
    public void setSchuzansu3(final String p) {
        this.schuzansu3 = p;
    }

    /** 輸出当月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String uchuzansu1;

    /**
     * @return 輸出当月注残数
     */
    public String getUchuzansu1() {
        return uchuzansu1;
    }

    /**
     * @param p 輸出当月注残数
     */
    public void setUchuzansu1(final String p) {
        this.uchuzansu1 = p;
    }

    /** 輸出翌月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String uchuzansu2;

    /**
     * @return 輸出翌月注残数
     */
    public String getUchuzansu2() {
        return uchuzansu2;
    }

    /**
     * @param p 輸出翌月注残数
     */
    public void setUchuzansu2(final String p) {
        this.uchuzansu2 = p;
    }

    /** 輸出翌々月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String uchuzansu3;

    /**
     * @return 輸出翌々月注残数
     */
    public String getUchuzansu3() {
        return uchuzansu3;
    }

    /**
     * @param p 輸出翌々月注残数
     */
    public void setUchuzansu3(final String p) {
        this.uchuzansu3 = p;
    }

    /** ＤＩＹ当月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String dchuzansu1;

    /**
     * @return ＤＩＹ当月注残数
     */
    public String getDchuzansu1() {
        return dchuzansu1;
    }

    /**
     * @param p ＤＩＹ当月注残数
     */
    public void setDchuzansu1(final String p) {
        this.dchuzansu1 = p;
    }

    /** ＤＩＹ翌月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String dchuzansu2;

    /**
     * @return ＤＩＹ翌月注残数
     */
    public String getDchuzansu2() {
        return dchuzansu2;
    }

    /**
     * @param p ＤＩＹ翌月注残数
     */
    public void setDchuzansu2(final String p) {
        this.dchuzansu2 = p;
    }

    /** ＤＩＹ翌々月注残数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String dchuzansu3;

    /**
     * @return ＤＩＹ翌々月注残数
     */
    public String getDchuzansu3() {
        return dchuzansu3;
    }

    /**
     * @param p ＤＩＹ翌々月注残数
     */
    public void setDchuzansu3(final String p) {
        this.dchuzansu3 = p;
    }

    /** 平１入庫予定数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String nyukoyoteH1;

    /**
     * @return 平１入庫予定数
     */
    public String getNyukoyoteH1() {
        return nyukoyoteH1;
    }

    /**
     * @param p 平１入庫予定数
     */
    public void setNyukoyoteH1(final String p) {
        this.nyukoyoteH1 = p;
    }

    /** 平２入庫予定数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String nyukoyoteH2;

    /**
     * @return 平２入庫予定数
     */
    public String getNyukoyoteH2() {
        return nyukoyoteH2;
    }

    /**
     * @param p 平２入庫予定数
     */
    public void setNyukoyoteH2(final String p) {
        this.nyukoyoteH2 = p;
    }

    /** 平３入庫予定数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String nyukoyoteH3;

    /**
     * @return 平３入庫予定数
     */
    public String getNyukoyoteH3() {
        return nyukoyoteH3;
    }

    /**
     * @param p 平３入庫予定数
     */
    public void setNyukoyoteH3(final String p) {
        this.nyukoyoteH3 = p;
    }

    /** 平４入庫予定数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String nyukoyoteH4;

    /**
     * @return 平４入庫予定数
     */
    public String getNyukoyoteH4() {
        return nyukoyoteH4;
    }

    /**
     * @param p 平４入庫予定数
     */
    public void setNyukoyoteH4(final String p) {
        this.nyukoyoteH4 = p;
    }

    /** 札幌在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String sapporozaiko;

    /**
     * @return 札幌在庫数
     */
    public String getSapporozaiko() {
        return sapporozaiko;
    }

    /**
     * @param p 札幌在庫数
     */
    public void setSapporozaiko(final String p) {
        this.sapporozaiko = p;
    }

    /** 仙台在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String sendaizaiko;

    /**
     * @return 仙台在庫数
     */
    public String getSendaizaiko() {
        return sendaizaiko;
    }

    /**
     * @param p 仙台在庫数
     */
    public void setSendaizaiko(final String p) {
        this.sendaizaiko = p;
    }

    /** 東京在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String tokyozaiko;

    /**
     * @return 東京在庫数
     */
    public String getTokyozaiko() {
        return tokyozaiko;
    }

    /**
     * @param p 東京在庫数
     */
    public void setTokyozaiko(final String p) {
        this.tokyozaiko = p;
    }

    /** 関東在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kantozaiko;

    /**
     * @return 関東在庫数
     */
    public String getKantozaiko() {
        return kantozaiko;
    }

    /**
     * @param p 関東在庫数
     */
    public void setKantozaiko(final String p) {
        this.kantozaiko = p;
    }

    /** 金沢在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kanazawazaiko;

    /**
     * @return 金沢在庫数
     */
    public String getKanazawazaiko() {
        return kanazawazaiko;
    }

    /**
     * @param p 金沢在庫数
     */
    public void setKanazawazaiko(final String p) {
        this.kanazawazaiko = p;
    }

    /** 名古屋在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String nagoyazaiko;

    /**
     * @return 名古屋在庫数
     */
    public String getNagoyazaiko() {
        return nagoyazaiko;
    }

    /**
     * @param p 名古屋在庫数
     */
    public void setNagoyazaiko(final String p) {
        this.nagoyazaiko = p;
    }

    /** 近畿在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kinkizaiko;

    /**
     * @return 近畿在庫数
     */
    public String getKinkizaiko() {
        return kinkizaiko;
    }

    /**
     * @param p 近畿在庫数
     */
    public void setKinkizaiko(final String p) {
        this.kinkizaiko = p;
    }

    /** 広島在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hirosimazaiko;

    /**
     * @return 広島在庫数
     */
    public String getHirosimazaiko() {
        return hirosimazaiko;
    }

    /**
     * @param p 広島在庫数
     */
    public void setHirosimazaiko(final String p) {
        this.hirosimazaiko = p;
    }

    /** 福岡在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String fukuokazaiko;

    /**
     * @return 福岡在庫数
     */
    public String getFukuokazaiko() {
        return fukuokazaiko;
    }

    /**
     * @param p 福岡在庫数
     */
    public void setFukuokazaiko(final String p) {
        this.fukuokazaiko = p;
    }

    /** 業務在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String gyomuzaiko;

    /**
     * @return 業務在庫数
     */
    public String getGyomuzaiko() {
        return gyomuzaiko;
    }

    /**
     * @param p 業務在庫数
     */
    public void setGyomuzaiko(final String p) {
        this.gyomuzaiko = p;
    }

    /** 貿易在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String boekizaiko;

    /**
     * @return 貿易在庫数
     */
    public String getBoekizaiko() {
        return boekizaiko;
    }

    /**
     * @param p 貿易在庫数
     */
    public void setBoekizaiko(final String p) {
        this.boekizaiko = p;
    }

    /** ハイテック在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hiteczaiko;

    /**
     * @return ハイテック在庫数
     */
    public String getHiteczaiko() {
        return hiteczaiko;
    }

    /**
     * @param p ハイテック在庫数
     */
    public void setHiteczaiko(final String p) {
        this.hiteczaiko = p;
    }

    /** 貿易委託在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String boekiitaku;

    /**
     * @return 貿易委託在庫数
     */
    public String getBoekiitaku() {
        return boekiitaku;
    }

    /**
     * @param p 貿易委託在庫数
     */
    public void setBoekiitaku(final String p) {
        this.boekiitaku = p;
    }

    /** 上海ＫＴＣ保税倉庫在庫 */
    @jakarta.validation.constraints.Size(max = 7)
    private String sktchszaiko;

    /**
     * @return 上海ＫＴＣ保税倉庫在庫
     */
    public String getSktchszaiko() {
        return sktchszaiko;
    }

    /**
     * @param p 上海ＫＴＣ保税倉庫在庫
     */
    public void setSktchszaiko(final String p) {
        this.sktchszaiko = p;
    }

    /** 包装材在庫数 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hosozaiko;

    /**
     * @return 包装材在庫数
     */
    public String getHosozaiko() {
        return hosozaiko;
    }

    /**
     * @param p 包装材在庫数
     */
    public void setHosozaiko(final String p) {
        this.hosozaiko = p;
    }

    /** 生産終了予定日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String sendyoteibi;

    /**
     * @return 生産終了予定日
     */
    public String getSendyoteibi() {
        return sendyoteibi;
    }

    /**
     * @param p 生産終了予定日
     */
    public void setSendyoteibi(final String p) {
        this.sendyoteibi = p;
    }

    /** 生産終了日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String sendbi;

    /**
     * @return 生産終了日
     */
    public String getSendbi() {
        return sendbi;
    }

    /**
     * @param p 生産終了日
     */
    public void setSendbi(final String p) {
        this.sendbi = p;
    }

    /** 代替品番１ */
    @jakarta.validation.constraints.Size(max = 20)
    private String hincdalt1;

    /**
     * @return 代替品番１
     */
    public String getHincdalt1() {
        return hincdalt1;
    }

    /**
     * @param p 代替品番１
     */
    public void setHincdalt1(final String p) {
        this.hincdalt1 = p;
    }

    /** 代替品番２ */
    @jakarta.validation.constraints.Size(max = 20)
    private String hincdalt2;

    /**
     * @return 代替品番２
     */
    public String getHincdalt2() {
        return hincdalt2;
    }

    /**
     * @param p 代替品番２
     */
    public void setHincdalt2(final String p) {
        this.hincdalt2 = p;
    }

    /** 納期回答不可区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String noukifukakbn;

    /**
     * @return 納期回答不可区分
     */
    public String getNoukifukakbn() {
        return noukifukakbn;
    }

    /**
     * @param p 納期回答不可区分
     */
    public void setNoukifukakbn(final String p) {
        this.noukifukakbn = p;
    }

    /** 直送対象品区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String chokuhinkbn;

    /**
     * @return 直送対象品区分
     */
    public String getChokuhinkbn() {
        return chokuhinkbn;
    }

    /**
     * @param p 直送対象品区分
     */
    public void setChokuhinkbn(final String p) {
        this.chokuhinkbn = p;
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

    /** 直送可能区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String chokukakbn;

    /**
     * @return 直送可能区分
     */
    public String getChokukakbn() {
        return chokukakbn;
    }

    /**
     * @param p 直送可能区分
     */
    public void setChokukakbn(final String p) {
        this.chokukakbn = p;
    }

    /** バーコードマスタ */
    @jakarta.validation.Valid
    private MBarcdRegistForm mBarcdRegistForm;

    /**
     * @return MBarcdRegistForm
     */
    public MBarcdRegistForm getMBarcdRegistForm() {
        return mBarcdRegistForm;
    }

    /**
     * @param p
     */
    public void setMBarcdRegistForm(final MBarcdRegistForm p) {
        this.mBarcdRegistForm = p;
    }

    /** 原価マスタ */
    @jakarta.validation.Valid
    private MGenkaRegistForm mGenkaRegistForm;

    /**
     * @return MGenkaRegistForm
     */
    public MGenkaRegistForm getMGenkaRegistForm() {
        return mGenkaRegistForm;
    }

    /**
     * @param p
     */
    public void setMGenkaRegistForm(final MGenkaRegistForm p) {
        this.mGenkaRegistForm = p;
    }

    /** 日産単価マスタ */
    @jakarta.validation.Valid
    private MNtankaRegistForm mNtankaRegistForm;

    /**
     * @return MNtankaRegistForm
     */
    public MNtankaRegistForm getMNtankaRegistForm() {
        return mNtankaRegistForm;
    }

    /**
     * @param p
     */
    public void setMNtankaRegistForm(final MNtankaRegistForm p) {
        this.mNtankaRegistForm = p;
    }

    /** 製品原価マスタ */
    @jakarta.validation.Valid
    private MSgenkaRegistForm mSgenkaRegistForm;

    /**
     * @return MSgenkaRegistForm
     */
    public MSgenkaRegistForm getMSgenkaRegistForm() {
        return mSgenkaRegistForm;
    }

    /**
     * @param p
     */
    public void setMSgenkaRegistForm(final MSgenkaRegistForm p) {
        this.mSgenkaRegistForm = p;
    }

    /** ＳＫ品番マスタ */
    @jakarta.validation.Valid
    private MSkhinRegistForm mSkhinRegistForm;

    /**
     * @return MSkhinRegistForm
     */
    public MSkhinRegistForm getMSkhinRegistForm() {
        return mSkhinRegistForm;
    }

    /**
     * @param p
     */
    public void setMSkhinRegistForm(final MSkhinRegistForm p) {
        this.mSkhinRegistForm = p;
    }

    /** 単価マスタ */
    @jakarta.validation.Valid
    private MTankaRegistForm mTankaRegistForm;

    /**
     * @return MTankaRegistForm
     */
    public MTankaRegistForm getMTankaRegistForm() {
        return mTankaRegistForm;
    }

    /**
     * @param p
     */
    public void setMTankaRegistForm(final MTankaRegistForm p) {
        this.mTankaRegistForm = p;
    }

    /** WEB在庫管理マスタ */
    @jakarta.validation.Valid
    private MWebkanRegistForm mWebkanRegistForm;

    /**
     * @return MWebkanRegistForm
     */
    public MWebkanRegistForm getMWebkanRegistForm() {
        return mWebkanRegistForm;
    }

    /**
     * @param p
     */
    public void setMWebkanRegistForm(final MWebkanRegistForm p) {
        this.mWebkanRegistForm = p;
    }

    /** 包装材構成マスタ */
    @jakarta.validation.Valid
    private List<MHososetRegistForm> mHososetGrid;

    /**
     * @return 包装材構成マスタ
     */
    public List<MHososetRegistForm> getMHososetGrid() {
        return mHososetGrid;
    }

    /**
     * @param p
     */
    public void setMHososetGrid(final List<MHososetRegistForm> p) {
        this.mHososetGrid = p;
    }

    /** 部品構成マスタ */
    @jakarta.validation.Valid
    private List<MPkoseRegistForm> mPkoseGrid;

    /**
     * @return 部品構成マスタ
     */
    public List<MPkoseRegistForm> getMPkoseGrid() {
        return mPkoseGrid;
    }

    /**
     * @param p
     */
    public void setMPkoseGrid(final List<MPkoseRegistForm> p) {
        this.mPkoseGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
