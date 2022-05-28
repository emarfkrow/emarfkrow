package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_RESERVE_LOC登録フォーム
 *
 * @author emarfkrow
 */
public class MstReserveLocRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstReserveLocRegistForm.class);

    /** HINBAN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** OPE_DETAIL */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return opeDetail;
    }

    /**
     * @param p OPE_DETAIL
     */
    public void setOpeDetail(final String p) {
        this.opeDetail = p;
    }

    /** RESERVE_LOC_SEQ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String reserveLocSeq;

    /**
     * @return RESERVE_LOC_SEQ
     */
    public String getReserveLocSeq() {
        return reserveLocSeq;
    }

    /**
     * @param p RESERVE_LOC_SEQ
     */
    public void setReserveLocSeq(final String p) {
        this.reserveLocSeq = p;
    }

    /** LOCATION_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * @param p LOCATION_CODE
     */
    public void setLocationCode(final String p) {
        this.locationCode = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
