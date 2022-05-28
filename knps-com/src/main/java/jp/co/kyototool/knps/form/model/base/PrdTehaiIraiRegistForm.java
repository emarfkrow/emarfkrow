package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_IRAI登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiIraiRegistForm.class);

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

    /** IRAI_BUSHO_CD */
    @jakarta.validation.constraints.Size(max = 2)
    private String iraiBushoCd;

    /**
     * @return IRAI_BUSHO_CD
     */
    public String getIraiBushoCd() {
        return iraiBushoCd;
    }

    /**
     * @param p IRAI_BUSHO_CD
     */
    public void setIraiBushoCd(final String p) {
        this.iraiBushoCd = p;
    }

    /** DAIRITEN_MEI */
    @jakarta.validation.constraints.Size(max = 60)
    private String dairitenMei;

    /**
     * @return DAIRITEN_MEI
     */
    public String getDairitenMei() {
        return dairitenMei;
    }

    /**
     * @param p DAIRITEN_MEI
     */
    public void setDairitenMei(final String p) {
        this.dairitenMei = p;
    }

    /** NONYUSAKI_MEI */
    @jakarta.validation.constraints.Size(max = 60)
    private String nonyusakiMei;

    /**
     * @return NONYUSAKI_MEI
     */
    public String getNonyusakiMei() {
        return nonyusakiMei;
    }

    /**
     * @param p NONYUSAKI_MEI
     */
    public void setNonyusakiMei(final String p) {
        this.nonyusakiMei = p;
    }

    /** KIHYOSHA_CD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String kihyoshaCd;

    /**
     * @return KIHYOSHA_CD
     */
    public String getKihyoshaCd() {
        return kihyoshaCd;
    }

    /**
     * @param p KIHYOSHA_CD
     */
    public void setKihyoshaCd(final String p) {
        this.kihyoshaCd = p;
    }

    /** KIHYO_DT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String kihyoDt;

    /**
     * @return KIHYO_DT
     */
    public String getKihyoDt() {
        return kihyoDt;
    }

    /**
     * @param p KIHYO_DT
     */
    public void setKihyoDt(final String p) {
        this.kihyoDt = p;
    }

    /** SHINSEISHA_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String shinseishaCd;

    /**
     * @return SHINSEISHA_CD
     */
    public String getShinseishaCd() {
        return shinseishaCd;
    }

    /**
     * @param p SHINSEISHA_CD
     */
    public void setShinseishaCd(final String p) {
        this.shinseishaCd = p;
    }

    /** SHINSEI_DT */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String shinseiDt;

    /**
     * @return SHINSEI_DT
     */
    public String getShinseiDt() {
        return shinseiDt;
    }

    /**
     * @param p SHINSEI_DT
     */
    public void setShinseiDt(final String p) {
        this.shinseiDt = p;
    }

    /** SHINSEI_CMT */
    @jakarta.validation.constraints.Size(max = 120)
    private String shinseiCmt;

    /**
     * @return SHINSEI_CMT
     */
    public String getShinseiCmt() {
        return shinseiCmt;
    }

    /**
     * @param p SHINSEI_CMT
     */
    public void setShinseiCmt(final String p) {
        this.shinseiCmt = p;
    }

    /** SHINSEISAKI_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String shinseisakiCd;

    /**
     * @return SHINSEISAKI_CD
     */
    public String getShinseisakiCd() {
        return shinseisakiCd;
    }

    /**
     * @param p SHINSEISAKI_CD
     */
    public void setShinseisakiCd(final String p) {
        this.shinseisakiCd = p;
    }

    /** SHONINSHA_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String shoninshaCd;

    /**
     * @return SHONINSHA_CD
     */
    public String getShoninshaCd() {
        return shoninshaCd;
    }

    /**
     * @param p SHONINSHA_CD
     */
    public void setShoninshaCd(final String p) {
        this.shoninshaCd = p;
    }

    /** SHONIN_DT */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String shoninDt;

    /**
     * @return SHONIN_DT
     */
    public String getShoninDt() {
        return shoninDt;
    }

    /**
     * @param p SHONIN_DT
     */
    public void setShoninDt(final String p) {
        this.shoninDt = p;
    }

    /** UKETSUKESHA_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String uketsukeshaCd;

    /**
     * @return UKETSUKESHA_CD
     */
    public String getUketsukeshaCd() {
        return uketsukeshaCd;
    }

    /**
     * @param p UKETSUKESHA_CD
     */
    public void setUketsukeshaCd(final String p) {
        this.uketsukeshaCd = p;
    }

    /** UKETSUKE_DT */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String uketsukeDt;

    /**
     * @return UKETSUKE_DT
     */
    public String getUketsukeDt() {
        return uketsukeDt;
    }

    /**
     * @param p UKETSUKE_DT
     */
    public void setUketsukeDt(final String p) {
        this.uketsukeDt = p;
    }

    /** KAITOSHA_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String kaitoshaCd;

    /**
     * @return KAITOSHA_CD
     */
    public String getKaitoshaCd() {
        return kaitoshaCd;
    }

    /**
     * @param p KAITOSHA_CD
     */
    public void setKaitoshaCd(final String p) {
        this.kaitoshaCd = p;
    }

    /** KAITO_DT */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String kaitoDt;

    /**
     * @return KAITO_DT
     */
    public String getKaitoDt() {
        return kaitoDt;
    }

    /**
     * @param p KAITO_DT
     */
    public void setKaitoDt(final String p) {
        this.kaitoDt = p;
    }

    /** JUCHUNO_CSV */
    @jakarta.validation.constraints.Size(max = 256)
    private String juchunoCsv;

    /**
     * @return JUCHUNO_CSV
     */
    public String getJuchunoCsv() {
        return juchunoCsv;
    }

    /**
     * @param p JUCHUNO_CSV
     */
    public void setJuchunoCsv(final String p) {
        this.juchunoCsv = p;
    }

    /** PRD_TEHAI_FLOW */
    @jakarta.validation.Valid
    private List<PrdTehaiFlowRegistForm> prdTehaiFlowGrid;

    /**
     * @return PRD_TEHAI_FLOW
     */
    public List<PrdTehaiFlowRegistForm> getPrdTehaiFlowGrid() {
        return prdTehaiFlowGrid;
    }

    /**
     * @param p
     */
    public void setPrdTehaiFlowGrid(final List<PrdTehaiFlowRegistForm> p) {
        this.prdTehaiFlowGrid = p;
    }

    /** PRD_TEHAI_IRAI_DET */
    @jakarta.validation.Valid
    private List<PrdTehaiIraiDetRegistForm> prdTehaiIraiDetGrid;

    /**
     * @return PRD_TEHAI_IRAI_DET
     */
    public List<PrdTehaiIraiDetRegistForm> getPrdTehaiIraiDetGrid() {
        return prdTehaiIraiDetGrid;
    }

    /**
     * @param p
     */
    public void setPrdTehaiIraiDetGrid(final List<PrdTehaiIraiDetRegistForm> p) {
        this.prdTehaiIraiDetGrid = p;
    }

    /** PRD_TEHAI_KAITO_DET */
    @jakarta.validation.Valid
    private List<PrdTehaiKaitoDetRegistForm> prdTehaiKaitoDetGrid;

    /**
     * @return PRD_TEHAI_KAITO_DET
     */
    public List<PrdTehaiKaitoDetRegistForm> getPrdTehaiKaitoDetGrid() {
        return prdTehaiKaitoDetGrid;
    }

    /**
     * @param p
     */
    public void setPrdTehaiKaitoDetGrid(final List<PrdTehaiKaitoDetRegistForm> p) {
        this.prdTehaiKaitoDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
