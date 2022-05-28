package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_IRAI_DET_HIS登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiIraiDetHisRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiIraiDetHisRegistForm.class);

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

    /** IRAI_DET_SEQ */
    @jakarta.validation.constraints.NotBlank
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

    /** IRAI_DET_HIS_SEQ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String iraiDetHisSeq;

    /**
     * @return IRAI_DET_HIS_SEQ
     */
    public String getIraiDetHisSeq() {
        return iraiDetHisSeq;
    }

    /**
     * @param p IRAI_DET_HIS_SEQ
     */
    public void setIraiDetHisSeq(final String p) {
        this.iraiDetHisSeq = p;
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

    /** IRAI_HINBAN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 25)
    private String iraiHinban;

    /**
     * @return IRAI_HINBAN
     */
    public String getIraiHinban() {
        return iraiHinban;
    }

    /**
     * @param p IRAI_HINBAN
     */
    public void setIraiHinban(final String p) {
        this.iraiHinban = p;
    }

    /** IRAI_QT */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 11)
    private String iraiQt;

    /**
     * @return IRAI_QT
     */
    public String getIraiQt() {
        return iraiQt;
    }

    /**
     * @param p IRAI_QT
     */
    public void setIraiQt(final String p) {
        this.iraiQt = p;
    }

    /** SHINSETSUHIN_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String shinsetsuhinF;

    /**
     * @return SHINSETSUHIN_F
     */
    public String getShinsetsuhinF() {
        return shinsetsuhinF;
    }

    /**
     * @param p SHINSETSUHIN_F
     */
    public void setShinsetsuhinF(final String p) {
        this.shinsetsuhinF = p;
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

    /** HANMOKUGAI_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String hanmokugaiF;

    /**
     * @return HANMOKUGAI_F
     */
    public String getHanmokugaiF() {
        return hanmokugaiF;
    }

    /**
     * @param p HANMOKUGAI_F
     */
    public void setHanmokugaiF(final String p) {
        this.hanmokugaiF = p;
    }

    /** CHUMON_NYURYOKU_ZUMI_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String chumonNyuryokuZumiF;

    /**
     * @return CHUMON_NYURYOKU_ZUMI_F
     */
    public String getChumonNyuryokuZumiF() {
        return chumonNyuryokuZumiF;
    }

    /**
     * @param p CHUMON_NYURYOKU_ZUMI_F
     */
    public void setChumonNyuryokuZumiF(final String p) {
        this.chumonNyuryokuZumiF = p;
    }

    /** KIBO_NOKI_YMD */
    @jakarta.validation.constraints.NotBlank
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

    /** SHUKKA_ZUMI_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String shukkaZumiF;

    /**
     * @return SHUKKA_ZUMI_F
     */
    public String getShukkaZumiF() {
        return shukkaZumiF;
    }

    /**
     * @param p SHUKKA_ZUMI_F
     */
    public void setShukkaZumiF(final String p) {
        this.shukkaZumiF = p;
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

    /** IRAI_INZU_QT */
    @jakarta.validation.constraints.Size(max = 11)
    private String iraiInzuQt;

    /**
     * @return IRAI_INZU_QT
     */
    public String getIraiInzuQt() {
        return iraiInzuQt;
    }

    /**
     * @param p IRAI_INZU_QT
     */
    public void setIraiInzuQt(final String p) {
        this.iraiInzuQt = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
