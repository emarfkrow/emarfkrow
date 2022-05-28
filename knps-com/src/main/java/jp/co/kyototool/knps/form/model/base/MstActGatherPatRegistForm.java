package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ACT_GATHER_PAT登録フォーム
 *
 * @author emarfkrow
 */
public class MstActGatherPatRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstActGatherPatRegistForm.class);

    /** ACT_GATHER_PAT_NO */
    @jakarta.validation.constraints.Size(max = 3)
    private String actGatherPatNo;

    /**
     * @return ACT_GATHER_PAT_NO
     */
    public String getActGatherPatNo() {
        return actGatherPatNo;
    }

    /**
     * @param p ACT_GATHER_PAT_NO
     */
    public void setActGatherPatNo(final String p) {
        this.actGatherPatNo = p;
    }

    /** IN_PRE_START */
    @jakarta.validation.constraints.Size(max = 1)
    private String inPreStart;

    /**
     * @return IN_PRE_START
     */
    public String getInPreStart() {
        return inPreStart;
    }

    /**
     * @param p IN_PRE_START
     */
    public void setInPreStart(final String p) {
        this.inPreStart = p;
    }

    /** IN_PRE_END */
    @jakarta.validation.constraints.Size(max = 1)
    private String inPreEnd;

    /**
     * @return IN_PRE_END
     */
    public String getInPreEnd() {
        return inPreEnd;
    }

    /**
     * @param p IN_PRE_END
     */
    public void setInPreEnd(final String p) {
        this.inPreEnd = p;
    }

    /** PROC_END */
    @jakarta.validation.constraints.Size(max = 1)
    private String procEnd;

    /**
     * @return PROC_END
     */
    public String getProcEnd() {
        return procEnd;
    }

    /**
     * @param p PROC_END
     */
    public void setProcEnd(final String p) {
        this.procEnd = p;
    }

    /** PROC_STOP */
    @jakarta.validation.constraints.Size(max = 1)
    private String procStop;

    /**
     * @return PROC_STOP
     */
    public String getProcStop() {
        return procStop;
    }

    /**
     * @param p PROC_STOP
     */
    public void setProcStop(final String p) {
        this.procStop = p;
    }

    /** PROC_CANCEL */
    @jakarta.validation.constraints.Size(max = 1)
    private String procCancel;

    /**
     * @return PROC_CANCEL
     */
    public String getProcCancel() {
        return procCancel;
    }

    /**
     * @param p PROC_CANCEL
     */
    public void setProcCancel(final String p) {
        this.procCancel = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
