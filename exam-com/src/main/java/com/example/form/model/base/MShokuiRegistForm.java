package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 職位マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MShokuiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MShokuiRegistForm.class);

    /** 職位ID */
    @jakarta.validation.constraints.Size(max = 10)
    private String shokuiId;

    /**
     * @return 職位ID
     */
    public String getShokuiId() {
        return shokuiId;
    }

    /**
     * @param p 職位ID
     */
    public void setShokuiId(final String p) {
        this.shokuiId = p;
    }

    /** 職位名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
    private String shokuiMei;

    /**
     * @return 職位名
     */
    public String getShokuiMei() {
        return shokuiMei;
    }

    /**
     * @param p 職位名
     */
    public void setShokuiMei(final String p) {
        this.shokuiMei = p;
    }

    /** 職位順 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String orderId;

    /**
     * @return 職位順
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param p 職位順
     */
    public void setOrderId(final String p) {
        this.orderId = p;
    }

    /** 開始日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String kaishiYmd;

    /**
     * @return 開始日
     */
    public String getKaishiYmd() {
        return kaishiYmd;
    }

    /**
     * @param p 開始日
     */
    public void setKaishiYmd(final String p) {
        this.kaishiYmd = p;
    }

    /** 終了日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String shuryoYmd;

    /**
     * @return 終了日
     */
    public String getShuryoYmd() {
        return shuryoYmd;
    }

    /**
     * @param p 終了日
     */
    public void setShuryoYmd(final String p) {
        this.shuryoYmd = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
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
        LOG.trace("not overridden in subclasses.");
    }

}
