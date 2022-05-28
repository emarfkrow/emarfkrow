package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_ACT登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanActRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanActRegistForm.class);

    /** ACT_NO */
    @jakarta.validation.constraints.Size(max = 12)
    private String actNo;

    /**
     * @return ACT_NO
     */
    public String getActNo() {
        return actNo;
    }

    /**
     * @param p ACT_NO
     */
    public void setActNo(final String p) {
        this.actNo = p;
    }

    /** KANBAN_ID */
    @jakarta.validation.constraints.Size(max = 9)
    private String kanbanId;

    /**
     * @return KANBAN_ID
     */
    public String getKanbanId() {
        return kanbanId;
    }

    /**
     * @param p KANBAN_ID
     */
    public void setKanbanId(final String p) {
        this.kanbanId = p;
    }

    /** SERIAL_NO */
    @jakarta.validation.constraints.Size(max = 4)
    private String serialNo;

    /**
     * @return SERIAL_NO
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param p SERIAL_NO
     */
    public void setSerialNo(final String p) {
        this.serialNo = p;
    }

    /** WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return wcCode;
    }

    /**
     * @param p WC_CODE
     */
    public void setWcCode(final String p) {
        this.wcCode = p;
    }

    /** ACT_DATE */
    @jakarta.validation.constraints.Size(max = 7)
    private String actDate;

    /**
     * @return ACT_DATE
     */
    public String getActDate() {
        return actDate;
    }

    /**
     * @param p ACT_DATE
     */
    public void setActDate(final String p) {
        this.actDate = p;
    }

    /** PCH_ACCEPT_ACT_HED */
    @jakarta.validation.Valid
    private PchAcceptActHedRegistForm pchAcceptActHedRegistForm;

    /**
     * @return PchAcceptActHedRegistForm
     */
    public PchAcceptActHedRegistForm getPchAcceptActHedRegistForm() {
        return pchAcceptActHedRegistForm;
    }

    /**
     * @param p
     */
    public void setPchAcceptActHedRegistForm(final PchAcceptActHedRegistForm p) {
        this.pchAcceptActHedRegistForm = p;
    }

    /** PCH_ACCEPT_ACT_DET */
    @jakarta.validation.Valid
    private List<PchAcceptActDetRegistForm> pchAcceptActDetGrid;

    /**
     * @return PCH_ACCEPT_ACT_DET
     */
    public List<PchAcceptActDetRegistForm> getPchAcceptActDetGrid() {
        return pchAcceptActDetGrid;
    }

    /**
     * @param p
     */
    public void setPchAcceptActDetGrid(final List<PchAcceptActDetRegistForm> p) {
        this.pchAcceptActDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
