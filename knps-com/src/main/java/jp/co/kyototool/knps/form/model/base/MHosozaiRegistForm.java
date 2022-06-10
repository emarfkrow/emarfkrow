package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 包装材マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MHosozaiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHosozaiRegistForm.class);

    /** 包装品番 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 25)
    private String hosoHinban;

    /**
     * @return 包装品番
     */
    public String getHosoHinban() {
        return hosoHinban;
    }

    /**
     * @param p 包装品番
     */
    public void setHosoHinban(final String p) {
        this.hosoHinban = p;
    }

    /** 包装品名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String hosoHinmei;

    /**
     * @return 包装品名
     */
    public String getHosoHinmei() {
        return hosoHinmei;
    }

    /**
     * @param p 包装品名
     */
    public void setHosoHinmei(final String p) {
        this.hosoHinmei = p;
    }

    /** 包装品名略称 */
    @jakarta.validation.constraints.Size(max = 25)
    private String hosoHinmeiRyaku;

    /**
     * @return 包装品名略称
     */
    public String getHosoHinmeiRyaku() {
        return hosoHinmeiRyaku;
    }

    /**
     * @param p 包装品名略称
     */
    public void setHosoHinmeiRyaku(final String p) {
        this.hosoHinmeiRyaku = p;
    }

    /** 包装サイズ */
    @jakarta.validation.constraints.Size(max = 30)
    private String hosoSize;

    /**
     * @return 包装サイズ
     */
    public String getHosoSize() {
        return hosoSize;
    }

    /**
     * @param p 包装サイズ
     */
    public void setHosoSize(final String p) {
        this.hosoSize = p;
    }

    /** 包装単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hosoTanka;

    /**
     * @return 包装単価
     */
    public String getHosoTanka() {
        return hosoTanka;
    }

    /**
     * @param p 包装単価
     */
    public void setHosoTanka(final String p) {
        this.hosoTanka = p;
    }

    /** 包装材質コード */
    @jakarta.validation.constraints.Size(max = 5)
    private String hosoZaicode;

    /**
     * @return 包装材質コード
     */
    public String getHosoZaicode() {
        return hosoZaicode;
    }

    /**
     * @param p 包装材質コード
     */
    public void setHosoZaicode(final String p) {
        this.hosoZaicode = p;
    }

    /** 包装重量 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hosoWeight;

    /**
     * @return 包装重量
     */
    public String getHosoWeight() {
        return hosoWeight;
    }

    /**
     * @param p 包装重量
     */
    public void setHosoWeight(final String p) {
        this.hosoWeight = p;
    }

    /** 作成日付 */
    @jakarta.validation.constraints.Size(max = 8)
    private String makedate;

    /**
     * @return 作成日付
     */
    public String getMakedate() {
        return makedate;
    }

    /**
     * @param p 作成日付
     */
    public void setMakedate(final String p) {
        this.makedate = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
