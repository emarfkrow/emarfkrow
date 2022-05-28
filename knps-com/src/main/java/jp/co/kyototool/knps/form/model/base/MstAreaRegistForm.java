package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_AREA登録フォーム
 *
 * @author emarfkrow
 */
public class MstAreaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstAreaRegistForm.class);

    /** AREA_CD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String areaCd;

    /**
     * @return AREA_CD
     */
    public String getAreaCd() {
        return areaCd;
    }

    /**
     * @param p AREA_CD
     */
    public void setAreaCd(final String p) {
        this.areaCd = p;
    }

    /** AREA_MEI */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String areaMei;

    /**
     * @return AREA_MEI
     */
    public String getAreaMei() {
        return areaMei;
    }

    /**
     * @param p AREA_MEI
     */
    public void setAreaMei(final String p) {
        this.areaMei = p;
    }

    /** SUB_INV_CODE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String subInvCode;

    /**
     * @return SUB_INV_CODE
     */
    public String getSubInvCode() {
        return subInvCode;
    }

    /**
     * @param p SUB_INV_CODE
     */
    public void setSubInvCode(final String p) {
        this.subInvCode = p;
    }

    /** DELETE_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteF;

    /**
     * @return DELETE_F
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p DELETE_F
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
