package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * バーコード管理マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MBarindxRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MBarindxRegistForm.class);

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

    /** バー分類追番１ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban1;

    /**
     * @return バー分類追番１
     */
    public String getBarOiban1() {
        return barOiban1;
    }

    /**
     * @param p バー分類追番１
     */
    public void setBarOiban1(final String p) {
        this.barOiban1 = p;
    }

    /** バー分類追番２ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban2;

    /**
     * @return バー分類追番２
     */
    public String getBarOiban2() {
        return barOiban2;
    }

    /**
     * @param p バー分類追番２
     */
    public void setBarOiban2(final String p) {
        this.barOiban2 = p;
    }

    /** バー分類追番３ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban3;

    /**
     * @return バー分類追番３
     */
    public String getBarOiban3() {
        return barOiban3;
    }

    /**
     * @param p バー分類追番３
     */
    public void setBarOiban3(final String p) {
        this.barOiban3 = p;
    }

    /** バー分類追番４ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban4;

    /**
     * @return バー分類追番４
     */
    public String getBarOiban4() {
        return barOiban4;
    }

    /**
     * @param p バー分類追番４
     */
    public void setBarOiban4(final String p) {
        this.barOiban4 = p;
    }

    /** バー分類追番５ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban5;

    /**
     * @return バー分類追番５
     */
    public String getBarOiban5() {
        return barOiban5;
    }

    /**
     * @param p バー分類追番５
     */
    public void setBarOiban5(final String p) {
        this.barOiban5 = p;
    }

    /** バー分類追番６ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban6;

    /**
     * @return バー分類追番６
     */
    public String getBarOiban6() {
        return barOiban6;
    }

    /**
     * @param p バー分類追番６
     */
    public void setBarOiban6(final String p) {
        this.barOiban6 = p;
    }

    /** バー分類追番７ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban7;

    /**
     * @return バー分類追番７
     */
    public String getBarOiban7() {
        return barOiban7;
    }

    /**
     * @param p バー分類追番７
     */
    public void setBarOiban7(final String p) {
        this.barOiban7 = p;
    }

    /** バー分類追番８ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban8;

    /**
     * @return バー分類追番８
     */
    public String getBarOiban8() {
        return barOiban8;
    }

    /**
     * @param p バー分類追番８
     */
    public void setBarOiban8(final String p) {
        this.barOiban8 = p;
    }

    /** バー分類追番９ */
    @jakarta.validation.constraints.Size(max = 4)
    private String barOiban9;

    /**
     * @return バー分類追番９
     */
    public String getBarOiban9() {
        return barOiban9;
    }

    /**
     * @param p バー分類追番９
     */
    public void setBarOiban9(final String p) {
        this.barOiban9 = p;
    }

    /** 販売制御マスタ */
    @jakarta.validation.Valid
    private MHseigyoRegistForm mHseigyoRegistForm;

    /**
     * @return MHseigyoRegistForm
     */
    public MHseigyoRegistForm getMHseigyoRegistForm() {
        return mHseigyoRegistForm;
    }

    /**
     * @param p
     */
    public void setMHseigyoRegistForm(final MHseigyoRegistForm p) {
        this.mHseigyoRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
