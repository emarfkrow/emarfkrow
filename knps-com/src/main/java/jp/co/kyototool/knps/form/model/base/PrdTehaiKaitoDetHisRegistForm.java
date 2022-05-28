package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_KAITO_DET_HIS登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiKaitoDetHisRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiKaitoDetHisRegistForm.class);

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

    /** KAITO_DET_HIS_SEQ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String kaitoDetHisSeq;

    /**
     * @return KAITO_DET_HIS_SEQ
     */
    public String getKaitoDetHisSeq() {
        return kaitoDetHisSeq;
    }

    /**
     * @param p KAITO_DET_HIS_SEQ
     */
    public void setKaitoDetHisSeq(final String p) {
        this.kaitoDetHisSeq = p;
    }

    /** KAITO_DET_SEQ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String kaitoDetSeq;

    /**
     * @return KAITO_DET_SEQ
     */
    public String getKaitoDetSeq() {
        return kaitoDetSeq;
    }

    /**
     * @param p KAITO_DET_SEQ
     */
    public void setKaitoDetSeq(final String p) {
        this.kaitoDetSeq = p;
    }

    /** IRAI_DET_SEQ */
    @jakarta.validation.constraints.Size(max = 10)
    private String iraiDetSeq;

    /**
     * @return IRAI_DET_SEQ
     */
    public String getIraiDetSeq() {
        return iraiDetSeq;
    }

    /**
     * @param p IRAI_DET_SEQ
     */
    public void setIraiDetSeq(final String p) {
        this.iraiDetSeq = p;
    }

    /** ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 14)
    private String id;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param p ID
     */
    public void setId(final String p) {
        this.id = p;
    }

    /** PARENT_ID */
    @jakarta.validation.constraints.Size(max = 14)
    private String parentId;

    /**
     * @return PARENT_ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param p PARENT_ID
     */
    public void setParentId(final String p) {
        this.parentId = p;
    }

    /** KAITO_HINBAN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 25)
    private String kaitoHinban;

    /**
     * @return KAITO_HINBAN
     */
    public String getKaitoHinban() {
        return kaitoHinban;
    }

    /**
     * @param p KAITO_HINBAN
     */
    public void setKaitoHinban(final String p) {
        this.kaitoHinban = p;
    }

    /** KAITO_QT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 11)
    private String kaitoQt;

    /**
     * @return KAITO_QT
     */
    public String getKaitoQt() {
        return kaitoQt;
    }

    /**
     * @param p KAITO_QT
     */
    public void setKaitoQt(final String p) {
        this.kaitoQt = p;
    }

    /** FUMEIHIN_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String fumeihinF;

    /**
     * @return FUMEIHIN_F
     */
    public String getFumeihinF() {
        return fumeihinF;
    }

    /**
     * @param p FUMEIHIN_F
     */
    public void setFumeihinF(final String p) {
        this.fumeihinF = p;
    }

    /** SETHIN_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String sethinF;

    /**
     * @return SETHIN_F
     */
    public String getSethinF() {
        return sethinF;
    }

    /**
     * @param p SETHIN_F
     */
    public void setSethinF(final String p) {
        this.sethinF = p;
    }

    /** KIBO_NOKI_YMD */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String kiboNokiYmd;

    /**
     * @return KIBO_NOKI_YMD
     */
    public String getKiboNokiYmd() {
        return kiboNokiYmd;
    }

    /**
     * @param p KIBO_NOKI_YMD
     */
    public void setKiboNokiYmd(final String p) {
        this.kiboNokiYmd = p;
    }

    /** HINBAN_TANTOSHA_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String hinbanTantoshaCd;

    /**
     * @return HINBAN_TANTOSHA_CD
     */
    public String getHinbanTantoshaCd() {
        return hinbanTantoshaCd;
    }

    /**
     * @param p HINBAN_TANTOSHA_CD
     */
    public void setHinbanTantoshaCd(final String p) {
        this.hinbanTantoshaCd = p;
    }

    /** SET_NOKI_TUCHI_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String setNokiTuchiF;

    /**
     * @return SET_NOKI_TUCHI_F
     */
    public String getSetNokiTuchiF() {
        return setNokiTuchiF;
    }

    /**
     * @param p SET_NOKI_TUCHI_F
     */
    public void setSetNokiTuchiF(final String p) {
        this.setNokiTuchiF = p;
    }

    /** KAITO_NOKI_YMD */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String kaitoNokiYmd;

    /**
     * @return KAITO_NOKI_YMD
     */
    public String getKaitoNokiYmd() {
        return kaitoNokiYmd;
    }

    /**
     * @param p KAITO_NOKI_YMD
     */
    public void setKaitoNokiYmd(final String p) {
        this.kaitoNokiYmd = p;
    }

    /** KAITO_NOKI_CMT */
    @jakarta.validation.constraints.Size(max = 120)
    private String kaitoNokiCmt;

    /**
     * @return KAITO_NOKI_CMT
     */
    public String getKaitoNokiCmt() {
        return kaitoNokiCmt;
    }

    /**
     * @param p KAITO_NOKI_CMT
     */
    public void setKaitoNokiCmt(final String p) {
        this.kaitoNokiCmt = p;
    }

    /** NOKI_KAITOSHA_CD */
    @jakarta.validation.constraints.Size(max = 10)
    private String nokiKaitoshaCd;

    /**
     * @return NOKI_KAITOSHA_CD
     */
    public String getNokiKaitoshaCd() {
        return nokiKaitoshaCd;
    }

    /**
     * @param p NOKI_KAITOSHA_CD
     */
    public void setNokiKaitoshaCd(final String p) {
        this.nokiKaitoshaCd = p;
    }

    /** NOKI_KAITO_DT */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2}(T| )[0-9]{1,2}:[0-9]{1,2}(:[0-9]{1,2}(\\.[0-9]{3})?)?|[0-9]{13})?")
    private String nokiKaitoDt;

    /**
     * @return NOKI_KAITO_DT
     */
    public String getNokiKaitoDt() {
        return nokiKaitoDt;
    }

    /**
     * @param p NOKI_KAITO_DT
     */
    public void setNokiKaitoDt(final String p) {
        this.nokiKaitoDt = p;
    }

    /** KAITO_NOKI_HININ_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String kaitoNokiHininF;

    /**
     * @return KAITO_NOKI_HININ_F
     */
    public String getKaitoNokiHininF() {
        return kaitoNokiHininF;
    }

    /**
     * @param p KAITO_NOKI_HININ_F
     */
    public void setKaitoNokiHininF(final String p) {
        this.kaitoNokiHininF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
