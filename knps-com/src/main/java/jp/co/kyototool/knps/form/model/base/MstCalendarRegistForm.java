package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_CALENDAR登録フォーム
 *
 * @author emarfkrow
 */
public class MstCalendarRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCalendarRegistForm.class);

    /** SERIAL_DAY */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 7)
    private String serialDay;

    /**
     * @return SERIAL_DAY
     */
    public String getSerialDay() {
        return serialDay;
    }

    /**
     * @param p SERIAL_DAY
     */
    public void setSerialDay(final String p) {
        this.serialDay = p;
    }

    /** WORKING_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String workingFlag;

    /**
     * @return WORKING_FLAG
     */
    public String getWorkingFlag() {
        return workingFlag;
    }

    /**
     * @param p WORKING_FLAG
     */
    public void setWorkingFlag(final String p) {
        this.workingFlag = p;
    }

    /** DAY_OF_WEEK */
    @jakarta.validation.constraints.Size(max = 1)
    private String dayOfWeek;

    /**
     * @return DAY_OF_WEEK
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * @param p DAY_OF_WEEK
     */
    public void setDayOfWeek(final String p) {
        this.dayOfWeek = p;
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

    /** N_WORKING */
    @jakarta.validation.constraints.Size(max = 5)
    private String nWorking;

    /**
     * @return N_WORKING
     */
    public String getNWorking() {
        return nWorking;
    }

    /**
     * @param p N_WORKING
     */
    public void setNWorking(final String p) {
        this.nWorking = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
