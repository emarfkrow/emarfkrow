package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_CODE_VALUE登録フォーム
 *
 * @author emarfkrow
 */
public class MstCodeValueRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCodeValueRegistForm.class);

    /** CODE_NM */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
    private String codeNm;

    /**
     * @return CODE_NM
     */
    public String getCodeNm() {
        return codeNm;
    }

    /**
     * @param p CODE_NM
     */
    public void setCodeNm(final String p) {
        this.codeNm = p;
    }

    /** CODE_VALUE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String codeValue;

    /**
     * @return CODE_VALUE
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * @param p CODE_VALUE
     */
    public void setCodeValue(final String p) {
        this.codeValue = p;
    }

    /** CODE_VALUE_MEI */
    @jakarta.validation.constraints.Size(max = 60)
    private String codeValueMei;

    /**
     * @return CODE_VALUE_MEI
     */
    public String getCodeValueMei() {
        return codeValueMei;
    }

    /**
     * @param p CODE_VALUE_MEI
     */
    public void setCodeValueMei(final String p) {
        this.codeValueMei = p;
    }

    /** HYOJI_JUN */
    @jakarta.validation.constraints.Size(max = 10)
    private String hyojiJun;

    /**
     * @return HYOJI_JUN
     */
    public String getHyojiJun() {
        return hyojiJun;
    }

    /**
     * @param p HYOJI_JUN
     */
    public void setHyojiJun(final String p) {
        this.hyojiJun = p;
    }

    /** CRITERIA */
    @jakarta.validation.constraints.Size(max = 256)
    private String criteria;

    /**
     * @return CRITERIA
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * @param p CRITERIA
     */
    public void setCriteria(final String p) {
        this.criteria = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
