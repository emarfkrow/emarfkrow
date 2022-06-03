package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 与信管理マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MYosinRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MYosinRegistForm.class);

    /** 集金先コード */
    @jakarta.validation.constraints.NotBlank
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

    /** 信用ランク */
    @jakarta.validation.constraints.Size(max = 1)
    private String sinyoRank;

    /**
     * @return 信用ランク
     */
    public String getSinyoRank() {
        return sinyoRank;
    }

    /**
     * @param p 信用ランク
     */
    public void setSinyoRank(final String p) {
        this.sinyoRank = p;
    }

    /** 取引信用保険額 */
    @jakarta.validation.constraints.Size(max = 11)
    private String sinyoHoken;

    /**
     * @return 取引信用保険額
     */
    public String getSinyoHoken() {
        return sinyoHoken;
    }

    /**
     * @param p 取引信用保険額
     */
    public void setSinyoHoken(final String p) {
        this.sinyoHoken = p;
    }

    /** 営業保証金 */
    @jakarta.validation.constraints.Size(max = 11)
    private String eigyoHosyokin;

    /**
     * @return 営業保証金
     */
    public String getEigyoHosyokin() {
        return eigyoHosyokin;
    }

    /**
     * @param p 営業保証金
     */
    public void setEigyoHosyokin(final String p) {
        this.eigyoHosyokin = p;
    }

    /** 担保株式数 */
    @jakarta.validation.constraints.Size(max = 11)
    private String tanpoKabusu;

    /**
     * @return 担保株式数
     */
    public String getTanpoKabusu() {
        return tanpoKabusu;
    }

    /**
     * @param p 担保株式数
     */
    public void setTanpoKabusu(final String p) {
        this.tanpoKabusu = p;
    }

    /** 出資額 */
    @jakarta.validation.constraints.Size(max = 11)
    private String shushigaku;

    /**
     * @return 出資額
     */
    public String getShushigaku() {
        return shushigaku;
    }

    /**
     * @param p 出資額
     */
    public void setShushigaku(final String p) {
        this.shushigaku = p;
    }

    /** 貸倒懸念先引当金 */
    @jakarta.validation.constraints.Size(max = 11)
    private String kasidaoreHikiate;

    /**
     * @return 貸倒懸念先引当金
     */
    public String getKasidaoreHikiate() {
        return kasidaoreHikiate;
    }

    /**
     * @param p 貸倒懸念先引当金
     */
    public void setKasidaoreHikiate(final String p) {
        this.kasidaoreHikiate = p;
    }

    /** 出荷限度額 */
    @jakarta.validation.constraints.Size(max = 11)
    private String shukaGendo;

    /**
     * @return 出荷限度額
     */
    public String getShukaGendo() {
        return shukaGendo;
    }

    /**
     * @param p 出荷限度額
     */
    public void setShukaGendo(final String p) {
        this.shukaGendo = p;
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

    /** 更新日付 */
    @jakarta.validation.constraints.Size(max = 8)
    private String upddate;

    /**
     * @return 更新日付
     */
    public String getUpddate() {
        return upddate;
    }

    /**
     * @param p 更新日付
     */
    public void setUpddate(final String p) {
        this.upddate = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 11)
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
