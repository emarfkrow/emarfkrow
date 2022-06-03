package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * WEB在庫管理マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MWebkanRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MWebkanRegistForm.class);

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

    /** 規格 */
    @jakarta.validation.constraints.Size(max = 40)
    private String kikaku;

    /**
     * @return 規格
     */
    public String getKikaku() {
        return kikaku;
    }

    /**
     * @param p 規格
     */
    public void setKikaku(final String p) {
        this.kikaku = p;
    }

    /** 大分類コード */
    @jakarta.validation.constraints.Size(max = 1)
    private String daicd;

    /**
     * @return 大分類コード
     */
    public String getDaicd() {
        return daicd;
    }

    /**
     * @param p 大分類コード
     */
    public void setDaicd(final String p) {
        this.daicd = p;
    }

    /** 中分類コード */
    @jakarta.validation.constraints.Size(max = 2)
    private String chucd;

    /**
     * @return 中分類コード
     */
    public String getChucd() {
        return chucd;
    }

    /**
     * @param p 中分類コード
     */
    public void setChucd(final String p) {
        this.chucd = p;
    }

    /** 小分類コード */
    @jakarta.validation.constraints.Size(max = 4)
    private String shocd;

    /**
     * @return 小分類コード
     */
    public String getShocd() {
        return shocd;
    }

    /**
     * @param p 小分類コード
     */
    public void setShocd(final String p) {
        this.shocd = p;
    }

    /** 分類Ａコード */
    @jakarta.validation.constraints.Size(max = 6)
    private String abuncd;

    /**
     * @return 分類Ａコード
     */
    public String getAbuncd() {
        return abuncd;
    }

    /**
     * @param p 分類Ａコード
     */
    public void setAbuncd(final String p) {
        this.abuncd = p;
    }

    /** 分類Ｂコード */
    @jakarta.validation.constraints.Size(max = 20)
    private String bbuncd;

    /**
     * @return 分類Ｂコード
     */
    public String getBbuncd() {
        return bbuncd;
    }

    /**
     * @param p 分類Ｂコード
     */
    public void setBbuncd(final String p) {
        this.bbuncd = p;
    }

    /** WEB表示区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String whyojikbn;

    /**
     * @return WEB表示区分
     */
    public String getWhyojikbn() {
        return whyojikbn;
    }

    /**
     * @param p WEB表示区分
     */
    public void setWhyojikbn(final String p) {
        this.whyojikbn = p;
    }

    /** 入数 */
    @jakarta.validation.constraints.Size(max = 4)
    private String irisu;

    /**
     * @return 入数
     */
    public String getIrisu() {
        return irisu;
    }

    /**
     * @param p 入数
     */
    public void setIrisu(final String p) {
        this.irisu = p;
    }

    /** 最低在庫閾値 */
    @jakarta.validation.constraints.Size(max = 7)
    private String zaisikii;

    /**
     * @return 最低在庫閾値
     */
    public String getZaisikii() {
        return zaisikii;
    }

    /**
     * @param p 最低在庫閾値
     */
    public void setZaisikii(final String p) {
        this.zaisikii = p;
    }

    /** 入庫予定数閾値 */
    @jakarta.validation.constraints.Size(max = 7)
    private String nyuyoteisikii;

    /**
     * @return 入庫予定数閾値
     */
    public String getNyuyoteisikii() {
        return nyuyoteisikii;
    }

    /**
     * @param p 入庫予定数閾値
     */
    public void setNyuyoteisikii(final String p) {
        this.nyuyoteisikii = p;
    }

    /** 汎用文字１ */
    @jakarta.validation.constraints.Size(max = 40)
    private String hanyou1;

    /**
     * @return 汎用文字１
     */
    public String getHanyou1() {
        return hanyou1;
    }

    /**
     * @param p 汎用文字１
     */
    public void setHanyou1(final String p) {
        this.hanyou1 = p;
    }

    /** 汎用文字２ */
    @jakarta.validation.constraints.Size(max = 40)
    private String hanyou2;

    /**
     * @return 汎用文字２
     */
    public String getHanyou2() {
        return hanyou2;
    }

    /**
     * @param p 汎用文字２
     */
    public void setHanyou2(final String p) {
        this.hanyou2 = p;
    }

    /** 汎用文字３ */
    @jakarta.validation.constraints.Size(max = 40)
    private String hanyou3;

    /**
     * @return 汎用文字３
     */
    public String getHanyou3() {
        return hanyou3;
    }

    /**
     * @param p 汎用文字３
     */
    public void setHanyou3(final String p) {
        this.hanyou3 = p;
    }

    /** 在庫表示変更区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String zaihenkbn;

    /**
     * @return 在庫表示変更区分
     */
    public String getZaihenkbn() {
        return zaihenkbn;
    }

    /**
     * @param p 在庫表示変更区分
     */
    public void setZaihenkbn(final String p) {
        this.zaihenkbn = p;
    }

    /** 定価表示制御区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String teidspkbn;

    /**
     * @return 定価表示制御区分
     */
    public String getTeidspkbn() {
        return teidspkbn;
    }

    /**
     * @param p 定価表示制御区分
     */
    public void setTeidspkbn(final String p) {
        this.teidspkbn = p;
    }

    /** 閾値更新対象区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String updexcdkbn;

    /**
     * @return 閾値更新対象区分
     */
    public String getUpdexcdkbn() {
        return updexcdkbn;
    }

    /**
     * @param p 閾値更新対象区分
     */
    public void setUpdexcdkbn(final String p) {
        this.updexcdkbn = p;
    }

    /** 作成日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String tourokubi;

    /**
     * @return 作成日
     */
    public String getTourokubi() {
        return tourokubi;
    }

    /**
     * @param p 作成日
     */
    public void setTourokubi(final String p) {
        this.tourokubi = p;
    }

    /** 更新日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String shuseibi;

    /**
     * @return 更新日
     */
    public String getShuseibi() {
        return shuseibi;
    }

    /**
     * @param p 更新日
     */
    public void setShuseibi(final String p) {
        this.shuseibi = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 49)
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
