package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 単価マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MTankaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MTankaRegistForm.class);

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

    /** 代理店単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String dairiTanka;

    /**
     * @return 代理店単価
     */
    public String getDairiTanka() {
        return dairiTanka;
    }

    /**
     * @param p 代理店単価
     */
    public void setDairiTanka(final String p) {
        this.dairiTanka = p;
    }

    /** Ｃ代行店単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String cdaikoTanka;

    /**
     * @return Ｃ代行店単価
     */
    public String getCdaikoTanka() {
        return cdaikoTanka;
    }

    /**
     * @param p Ｃ代行店単価
     */
    public void setCdaikoTanka(final String p) {
        this.cdaikoTanka = p;
    }

    /** 準代行店単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String jdaikoTanka;

    /**
     * @return 準代行店単価
     */
    public String getJdaikoTanka() {
        return jdaikoTanka;
    }

    /**
     * @param p 準代行店単価
     */
    public void setJdaikoTanka(final String p) {
        this.jdaikoTanka = p;
    }

    /** 卸単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String orosiTanka;

    /**
     * @return 卸単価
     */
    public String getOrosiTanka() {
        return orosiTanka;
    }

    /**
     * @param p 卸単価
     */
    public void setOrosiTanka(final String p) {
        this.orosiTanka = p;
    }

    /** 希望小売価格 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kouriKakaku;

    /**
     * @return 希望小売価格
     */
    public String getKouriKakaku() {
        return kouriKakaku;
    }

    /**
     * @param p 希望小売価格
     */
    public void setKouriKakaku(final String p) {
        this.kouriKakaku = p;
    }

    /** ＤＩＹ価格 */
    @jakarta.validation.constraints.Size(max = 7)
    private String diyKakaku;

    /**
     * @return ＤＩＹ価格
     */
    public String getDiyKakaku() {
        return diyKakaku;
    }

    /**
     * @param p ＤＩＹ価格
     */
    public void setDiyKakaku(final String p) {
        this.diyKakaku = p;
    }

    /** 輸出価格１ */
    @jakarta.validation.constraints.Size(max = 7)
    private String yushutu1Kakaku;

    /**
     * @return 輸出価格１
     */
    public String getYushutu1Kakaku() {
        return yushutu1Kakaku;
    }

    /**
     * @param p 輸出価格１
     */
    public void setYushutu1Kakaku(final String p) {
        this.yushutu1Kakaku = p;
    }

    /** 輸出価格２ */
    @jakarta.validation.constraints.Size(max = 7)
    private String yushutu2Kakaku;

    /**
     * @return 輸出価格２
     */
    public String getYushutu2Kakaku() {
        return yushutu2Kakaku;
    }

    /**
     * @param p 輸出価格２
     */
    public void setYushutu2Kakaku(final String p) {
        this.yushutu2Kakaku = p;
    }

    /** 輸出価格３ */
    @jakarta.validation.constraints.Size(max = 7)
    private String yushutu3Kakaku;

    /**
     * @return 輸出価格３
     */
    public String getYushutu3Kakaku() {
        return yushutu3Kakaku;
    }

    /**
     * @param p 輸出価格３
     */
    public void setYushutu3Kakaku(final String p) {
        this.yushutu3Kakaku = p;
    }

    /** 価格１ */
    @jakarta.validation.constraints.Size(max = 7)
    private String kakaku1;

    /**
     * @return 価格１
     */
    public String getKakaku1() {
        return kakaku1;
    }

    /**
     * @param p 価格１
     */
    public void setKakaku1(final String p) {
        this.kakaku1 = p;
    }

    /** 価格２ */
    @jakarta.validation.constraints.Size(max = 7)
    private String kakaku2;

    /**
     * @return 価格２
     */
    public String getKakaku2() {
        return kakaku2;
    }

    /**
     * @param p 価格２
     */
    public void setKakaku2(final String p) {
        this.kakaku2 = p;
    }

    /** 価格３ */
    @jakarta.validation.constraints.Size(max = 7)
    private String kakaku3;

    /**
     * @return 価格３
     */
    public String getKakaku3() {
        return kakaku3;
    }

    /**
     * @param p 価格３
     */
    public void setKakaku3(final String p) {
        this.kakaku3 = p;
    }

    /** 価格４ */
    @jakarta.validation.constraints.Size(max = 7)
    private String kakaku4;

    /**
     * @return 価格４
     */
    public String getKakaku4() {
        return kakaku4;
    }

    /**
     * @param p 価格４
     */
    public void setKakaku4(final String p) {
        this.kakaku4 = p;
    }

    /** 価格５ */
    @jakarta.validation.constraints.Size(max = 7)
    private String kakaku5;

    /**
     * @return 価格５
     */
    public String getKakaku5() {
        return kakaku5;
    }

    /**
     * @param p 価格５
     */
    public void setKakaku5(final String p) {
        this.kakaku5 = p;
    }

    /** 価格６ */
    @jakarta.validation.constraints.Size(max = 7)
    private String kakaku6;

    /**
     * @return 価格６
     */
    public String getKakaku6() {
        return kakaku6;
    }

    /**
     * @param p 価格６
     */
    public void setKakaku6(final String p) {
        this.kakaku6 = p;
    }

    /** 商品区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String shohinkbn;

    /**
     * @return 商品区分
     */
    public String getShohinkbn() {
        return shohinkbn;
    }

    /**
     * @param p 商品区分
     */
    public void setShohinkbn(final String p) {
        this.shohinkbn = p;
    }

    /** 価格体系区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String kakakukbn;

    /**
     * @return 価格体系区分
     */
    public String getKakakukbn() {
        return kakakukbn;
    }

    /**
     * @param p 価格体系区分
     */
    public void setKakakukbn(final String p) {
        this.kakakukbn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
