package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 販売制御マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MHseigyoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHseigyoRegistForm.class);

    /** キーコード */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String keycd;

    /**
     * @return キーコード
     */
    public String getKeycd() {
        return keycd;
    }

    /**
     * @param p キーコード
     */
    public void setKeycd(final String p) {
        this.keycd = p;
    }

    /** 開始日付 */
    @jakarta.validation.constraints.Size(max = 8)
    private String kaisibi;

    /**
     * @return 開始日付
     */
    public String getKaisibi() {
        return kaisibi;
    }

    /**
     * @param p 開始日付
     */
    public void setKaisibi(final String p) {
        this.kaisibi = p;
    }

    /** 終了日付 */
    @jakarta.validation.constraints.Size(max = 8)
    private String shuryobi;

    /**
     * @return 終了日付
     */
    public String getShuryobi() {
        return shuryobi;
    }

    /**
     * @param p 終了日付
     */
    public void setShuryobi(final String p) {
        this.shuryobi = p;
    }

    /** 消費税率 */
    @jakarta.validation.constraints.Size(max = 2)
    private String zeiritu;

    /**
     * @return 消費税率
     */
    public String getZeiritu() {
        return zeiritu;
    }

    /**
     * @param p 消費税率
     */
    public void setZeiritu(final String p) {
        this.zeiritu = p;
    }

    /** 有ボ入力区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String yuboent;

    /**
     * @return 有ボ入力区分
     */
    public String getYuboent() {
        return yuboent;
    }

    /**
     * @param p 有ボ入力区分
     */
    public void setYuboent(final String p) {
        this.yuboent = p;
    }

    /** 出荷指示番号１ */
    @jakarta.validation.constraints.Size(max = 5)
    private String shusijino1;

    /**
     * @return 出荷指示番号１
     */
    public String getShusijino1() {
        return shusijino1;
    }

    /**
     * @param p 出荷指示番号１
     */
    public void setShusijino1(final String p) {
        this.shusijino1 = p;
    }

    /** 納品書番号 */
    @jakarta.validation.constraints.Size(max = 6)
    private String nohinshono;

    /**
     * @return 納品書番号
     */
    public String getNohinshono() {
        return nohinshono;
    }

    /**
     * @param p 納品書番号
     */
    public void setNohinshono(final String p) {
        this.nohinshono = p;
    }

    /** セット計画番号 */
    @jakarta.validation.constraints.Size(max = 6)
    private String setkeino;

    /**
     * @return セット計画番号
     */
    public String getSetkeino() {
        return setkeino;
    }

    /**
     * @param p セット計画番号
     */
    public void setSetkeino(final String p) {
        this.setkeino = p;
    }

    /** 月次年月 */
    @jakarta.validation.constraints.Size(max = 6)
    private String getujiYymm;

    /**
     * @return 月次年月
     */
    public String getGetujiYymm() {
        return getujiYymm;
    }

    /**
     * @param p 月次年月
     */
    public void setGetujiYymm(final String p) {
        this.getujiYymm = p;
    }

    /** 当日受注件数 */
    @jakarta.validation.constraints.Size(max = 4)
    private String tJuccnt;

    /**
     * @return 当日受注件数
     */
    public String getTJuccnt() {
        return tJuccnt;
    }

    /**
     * @param p 当日受注件数
     */
    public void setTJuccnt(final String p) {
        this.tJuccnt = p;
    }

    /** 当日受注最大件数 */
    @jakarta.validation.constraints.Size(max = 4)
    private String tMaxcnt;

    /**
     * @return 当日受注最大件数
     */
    public String getTMaxcnt() {
        return tMaxcnt;
    }

    /**
     * @param p 当日受注最大件数
     */
    public void setTMaxcnt(final String p) {
        this.tMaxcnt = p;
    }

    /** 直送先カウント */
    @jakarta.validation.constraints.Size(max = 6)
    private String chokucnt;

    /**
     * @return 直送先カウント
     */
    public String getChokucnt() {
        return chokucnt;
    }

    /**
     * @param p 直送先カウント
     */
    public void setChokucnt(final String p) {
        this.chokucnt = p;
    }

    /** 評価単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hyotanka;

    /**
     * @return 評価単価
     */
    public String getHyotanka() {
        return hyotanka;
    }

    /**
     * @param p 評価単価
     */
    public void setHyotanka(final String p) {
        this.hyotanka = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 7)
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
