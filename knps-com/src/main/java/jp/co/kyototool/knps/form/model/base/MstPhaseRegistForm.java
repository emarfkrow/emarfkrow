package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_PHASE登録フォーム
 *
 * @author emarfkrow
 */
public class MstPhaseRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstPhaseRegistForm.class);

    /** PHASE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 3)
    private String phase;

    /**
     * @return PHASE
     */
    public String getPhase() {
        return phase;
    }

    /**
     * @param p PHASE
     */
    public void setPhase(final String p) {
        this.phase = p;
    }

    /** YY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return YY
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p YY
     */
    public void setYy(final String p) {
        this.yy = p;
    }

    /** PHASE_FROM */
    @jakarta.validation.constraints.Size(max = 7)
    private String phaseFrom;

    /**
     * @return PHASE_FROM
     */
    public String getPhaseFrom() {
        return phaseFrom;
    }

    /**
     * @param p PHASE_FROM
     */
    public void setPhaseFrom(final String p) {
        this.phaseFrom = p;
    }

    /** PHASE_TO */
    @jakarta.validation.constraints.Size(max = 7)
    private String phaseTo;

    /**
     * @return PHASE_TO
     */
    public String getPhaseTo() {
        return phaseTo;
    }

    /**
     * @param p PHASE_TO
     */
    public void setPhaseTo(final String p) {
        this.phaseTo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
