package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ２登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity2RegistForm.class);

    /** 祖先ID */
    @Size(max = 10)
    private String sosenId;

    /**
     * @return 祖先ID
     */
    public String getSosenId() {
        return sosenId;
    }

    /**
     * @param p 祖先ID
     */
    public void setSosenId(final String p) {
        this.sosenId = p;
    }

    /** 親連番 */
    @Size(max = 10)
    private String oyaSn;

    /**
     * @return 親連番
     */
    public String getOyaSn() {
        return oyaSn;
    }

    /**
     * @param p 親連番
     */
    public void setOyaSn(final String p) {
        this.oyaSn = p;
    }

    /** エンティティ連番 */
    @Size(max = 10)
    private String entitySn;

    /**
     * @return エンティティ連番
     */
    public String getEntitySn() {
        return entitySn;
    }

    /**
     * @param p エンティティ連番
     */
    public void setEntitySn(final String p) {
        this.entitySn = p;
    }

    /** 任意エンティティ２名 */
    @Size(max = 20)
    private String nullEntity2Mei;

    /**
     * @return 任意エンティティ２名
     */
    public String getNullEntity2Mei() {
        return nullEntity2Mei;
    }

    /**
     * @param p 任意エンティティ２名
     */
    public void setNullEntity2Mei(final String p) {
        this.nullEntity2Mei = p;
    }

    /** エンティティ２名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String entity2Mei;

    /**
     * @return エンティティ２名
     */
    public String getEntity2Mei() {
        return entity2Mei;
    }

    /**
     * @param p エンティティ２名
     */
    public void setEntity2Mei(final String p) {
        this.entity2Mei = p;
    }

    /** チェックフラグ */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 1)
    private String checkF;

    /**
     * @return チェックフラグ
     */
    public String getCheckF() {
        return checkF;
    }

    /**
     * @param p チェックフラグ
     */
    public void setCheckF(final String p) {
        this.checkF = p;
    }

    /** ラジオ区分 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 2)
    private String radioKb;

    /**
     * @return ラジオ区分
     */
    public String getRadioKb() {
        return radioKb;
    }

    /**
     * @param p ラジオ区分
     */
    public void setRadioKb(final String p) {
        this.radioKb = p;
    }

    /** プルダウン区分 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 2)
    private String pulldownKb;

    /**
     * @return プルダウン区分
     */
    public String getPulldownKb() {
        return pulldownKb;
    }

    /**
     * @param p プルダウン区分
     */
    public void setPulldownKb(final String p) {
        this.pulldownKb = p;
    }

    /** メモ */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 200)
    private String memoTx;

    /**
     * @return メモ
     */
    public String getMemoTx() {
        return memoTx;
    }

    /**
     * @param p メモ
     */
    public void setMemoTx(final String p) {
        this.memoTx = p;
    }

    /** 日付 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String hidukeYmd;

    /**
     * @return 日付
     */
    public String getHidukeYmd() {
        return hidukeYmd;
    }

    /**
     * @param p 日付
     */
    public void setHidukeYmd(final String p) {
        this.hidukeYmd = p;
    }

    /** 年月 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2})?")
    private String nengetsuYm;

    /**
     * @return 年月
     */
    public String getNengetsuYm() {
        return nengetsuYm;
    }

    /**
     * @param p 年月
     */
    public void setNengetsuYm(final String p) {
        this.nengetsuYm = p;
    }

    /** 年 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4})?")
    private String sampleY;

    /**
     * @return 年
     */
    public String getSampleY() {
        return sampleY;
    }

    /**
     * @param p 年
     */
    public void setSampleY(final String p) {
        this.sampleY = p;
    }

    /** 月 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{2})?")
    private String sampleM;

    /**
     * @return 月
     */
    public String getSampleM() {
        return sampleM;
    }

    /**
     * @param p 月
     */
    public void setSampleM(final String p) {
        this.sampleM = p;
    }

    /** 日時 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{13}|[0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?)?")
    private String nichijiDt;

    /**
     * @return 日時
     */
    public String getNichijiDt() {
        return nichijiDt;
    }

    /**
     * @param p 日時
     */
    public void setNichijiDt(final String p) {
        this.nichijiDt = p;
    }

    /** 時刻 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,2}:[0-9]{1,2})?")
    private String jikokuHm;

    /**
     * @return 時刻
     */
    public String getJikokuHm() {
        return jikokuHm;
    }

    /**
     * @param p 時刻
     */
    public void setJikokuHm(final String p) {
        this.jikokuHm = p;
    }

    /** 時間 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,}:[0-9]{1,2})?")
    private String jikanTm;

    /**
     * @return 時間
     */
    public String getJikanTm() {
        return jikanTm;
    }

    /**
     * @param p 時間
     */
    public void setJikanTm(final String p) {
        this.jikanTm = p;
    }

    /** 数量 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "[0-9]{0,7}\\.?[0-9]{0,2}?")
    private String suryoQt;

    /**
     * @return 数量
     */
    public String getSuryoQt() {
        return suryoQt;
    }

    /**
     * @param p 数量
     */
    public void setSuryoQt(final String p) {
        this.suryoQt = p;
    }

    /** 単価 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "[0-9]{0,8}\\.?[0-9]{0,3}?")
    private String tankaAm;

    /**
     * @return 単価
     */
    public String getTankaAm() {
        return tankaAm;
    }

    /**
     * @param p 単価
     */
    public void setTankaAm(final String p) {
        this.tankaAm = p;
    }

    /** 金額 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "[0-9]{0,8}\\.?[0-9]{0,3}?")
    private String kingakuAm;

    /**
     * @return 金額
     */
    public String getKingakuAm() {
        return kingakuAm;
    }

    /**
     * @param p 金額
     */
    public void setKingakuAm(final String p) {
        this.kingakuAm = p;
    }

    /** 削除フラグ */
    @Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
