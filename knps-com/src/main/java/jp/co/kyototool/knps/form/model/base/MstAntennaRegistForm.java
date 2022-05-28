package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ANTENNA登録フォーム
 *
 * @author emarfkrow
 */
public class MstAntennaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstAntennaRegistForm.class);

    /** READER_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
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
    @jakarta.validation.constraints.Size(max = 10)
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

    /** STORE_MAN_ID */
    @jakarta.validation.constraints.Size(max = 10)
    private String storeManId;

    /**
     * @return STORE_MAN_ID
     */
    public String getStoreManId() {
        return storeManId;
    }

    /**
     * @param p STORE_MAN_ID
     */
    public void setStoreManId(final String p) {
        this.storeManId = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
