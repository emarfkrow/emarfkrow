package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_RFID_DATA登録フォーム
 *
 * @author emarfkrow
 */
public class InvRfidDataRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvRfidDataRegistForm.class);

    /** TARGET_KBN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String targetKbn;

    /**
     * @return TARGET_KBN
     */
    public String getTargetKbn() {
        return targetKbn;
    }

    /**
     * @param p TARGET_KBN
     */
    public void setTargetKbn(final String p) {
        this.targetKbn = p;
    }

    /** TID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 24)
    private String tid;

    /**
     * @return TID
     */
    public String getTid() {
        return tid;
    }

    /**
     * @param p TID
     */
    public void setTid(final String p) {
        this.tid = p;
    }

    /** TAG_DATA */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 16)
    private String tagData;

    /**
     * @return TAG_DATA
     */
    public String getTagData() {
        return tagData;
    }

    /**
     * @param p TAG_DATA
     */
    public void setTagData(final String p) {
        this.tagData = p;
    }

    /** READER_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String readerNo;

    /**
     * @return READER_NO
     */
    public String getReaderNo() {
        return readerNo;
    }

    /**
     * @param p READER_NO
     */
    public void setReaderNo(final String p) {
        this.readerNo = p;
    }

    /** ANTENNA_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String antennaNo;

    /**
     * @return ANTENNA_NO
     */
    public String getAntennaNo() {
        return antennaNo;
    }

    /**
     * @param p ANTENNA_NO
     */
    public void setAntennaNo(final String p) {
        this.antennaNo = p;
    }

    /** SPOT_KBN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String spotKbn;

    /**
     * @return SPOT_KBN
     */
    public String getSpotKbn() {
        return spotKbn;
    }

    /**
     * @param p SPOT_KBN
     */
    public void setSpotKbn(final String p) {
        this.spotKbn = p;
    }

    /** RECIVE_TIME */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 14)
    private String reciveTime;

    /**
     * @return RECIVE_TIME
     */
    public String getReciveTime() {
        return reciveTime;
    }

    /**
     * @param p RECIVE_TIME
     */
    public void setReciveTime(final String p) {
        this.reciveTime = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
