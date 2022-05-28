package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_FLOW登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiFlowRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiFlowRegistForm.class);

    /** PRD_TEHAI_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String prdTehaiNo;

    /**
     * @return PRD_TEHAI_NO
     */
    public String getPrdTehaiNo() {
        return prdTehaiNo;
    }

    /**
     * @param p PRD_TEHAI_NO
     */
    public void setPrdTehaiNo(final String p) {
        this.prdTehaiNo = p;
    }

    /** TEHAI_FLOW_SEQ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String tehaiFlowSeq;

    /**
     * @return TEHAI_FLOW_SEQ
     */
    public String getTehaiFlowSeq() {
        return tehaiFlowSeq;
    }

    /**
     * @param p TEHAI_FLOW_SEQ
     */
    public void setTehaiFlowSeq(final String p) {
        this.tehaiFlowSeq = p;
    }

    /** TEHAI_JOKYO_KB */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String tehaiJokyoKb;

    /**
     * @return TEHAI_JOKYO_KB
     */
    public String getTehaiJokyoKb() {
        return tehaiJokyoKb;
    }

    /**
     * @param p TEHAI_JOKYO_KB
     */
    public void setTehaiJokyoKb(final String p) {
        this.tehaiJokyoKb = p;
    }

    /** KAITEI_JOKYO_KB */
    @jakarta.validation.constraints.Size(max = 2)
    private String kaiteiJokyoKb;

    /**
     * @return KAITEI_JOKYO_KB
     */
    public String getKaiteiJokyoKb() {
        return kaiteiJokyoKb;
    }

    /**
     * @param p KAITEI_JOKYO_KB
     */
    public void setKaiteiJokyoKb(final String p) {
        this.kaiteiJokyoKb = p;
    }

    /** SHORISHA_CD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String shorishaCd;

    /**
     * @return SHORISHA_CD
     */
    public String getShorishaCd() {
        return shorishaCd;
    }

    /**
     * @param p SHORISHA_CD
     */
    public void setShorishaCd(final String p) {
        this.shorishaCd = p;
    }

    /** SHORI_DT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String shoriDt;

    /**
     * @return SHORI_DT
     */
    public String getShoriDt() {
        return shoriDt;
    }

    /**
     * @param p SHORI_DT
     */
    public void setShoriDt(final String p) {
        this.shoriDt = p;
    }

    /** SHORI_CMT */
    @jakarta.validation.constraints.Size(max = 120)
    private String shoriCmt;

    /**
     * @return SHORI_CMT
     */
    public String getShoriCmt() {
        return shoriCmt;
    }

    /**
     * @param p SHORI_CMT
     */
    public void setShoriCmt(final String p) {
        this.shoriCmt = p;
    }

    /** AITESAKI_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String aitesakiCd;

    /**
     * @return AITESAKI_CD
     */
    public String getAitesakiCd() {
        return aitesakiCd;
    }

    /**
     * @param p AITESAKI_CD
     */
    public void setAitesakiCd(final String p) {
        this.aitesakiCd = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
