package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_TEMP_ORDER_EST_FILE登録フォーム
 *
 * @author emarfkrow
 */
public class PchTempOrderEstFileRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchTempOrderEstFileRegistForm.class);

    /** TEMP_ORDER_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String tempOrderNo;

    /**
     * @return TEMP_ORDER_NO
     */
    public String getTempOrderNo() {
        return tempOrderNo;
    }

    /**
     * @param p TEMP_ORDER_NO
     */
    public void setTempOrderNo(final String p) {
        this.tempOrderNo = p;
    }

    /** EST_FILE_SEQ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String estFileSeq;

    /**
     * @return EST_FILE_SEQ
     */
    public String getEstFileSeq() {
        return estFileSeq;
    }

    /**
     * @param p EST_FILE_SEQ
     */
    public void setEstFileSeq(final String p) {
        this.estFileSeq = p;
    }

    /** UPLOAD_FILE_NM */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String uploadFileNm;

    /**
     * @return UPLOAD_FILE_NM
     */
    public String getUploadFileNm() {
        return uploadFileNm;
    }

    /**
     * @param p UPLOAD_FILE_NM
     */
    public void setUploadFileNm(final String p) {
        this.uploadFileNm = p;
    }

    /** SAVE_FILE_PATH */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String saveFilePath;

    /**
     * @return SAVE_FILE_PATH
     */
    public String getSaveFilePath() {
        return saveFilePath;
    }

    /**
     * @param p SAVE_FILE_PATH
     */
    public void setSaveFilePath(final String p) {
        this.saveFilePath = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
