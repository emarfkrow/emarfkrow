package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * バーコードマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MBarcdRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MBarcdRegistForm.class);

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

    /** 自由項目１ */
    @jakarta.validation.constraints.Size(max = 15)
    private String free1;

    /**
     * @return 自由項目１
     */
    public String getFree1() {
        return free1;
    }

    /**
     * @param p 自由項目１
     */
    public void setFree1(final String p) {
        this.free1 = p;
    }

    /** 自由項目２ */
    @jakarta.validation.constraints.Size(max = 10)
    private String free2;

    /**
     * @return 自由項目２
     */
    public String getFree2() {
        return free2;
    }

    /**
     * @param p 自由項目２
     */
    public void setFree2(final String p) {
        this.free2 = p;
    }

    /** 自由項目３ */
    @jakarta.validation.constraints.Size(max = 10)
    private String free3;

    /**
     * @return 自由項目３
     */
    public String getFree3() {
        return free3;
    }

    /**
     * @param p 自由項目３
     */
    public void setFree3(final String p) {
        this.free3 = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 22)
    private String fller;

    /**
     * @return 予備領域
     */
    public String getFller() {
        return fller;
    }

    /**
     * @param p 予備領域
     */
    public void setFller(final String p) {
        this.fller = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
