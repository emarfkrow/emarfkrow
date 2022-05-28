package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * M_SETKOSE登録フォーム
 *
 * @author emarfkrow
 */
public class MSetkoseRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSetkoseRegistForm.class);

    /** SET-HINBAN */
    @jakarta.validation.constraints.Size(max = 20)
    private String setHinban;

    /**
     * @return SET-HINBAN
     */
    public String getSetHinban() {
        return setHinban;
    }

    /**
     * @param p SET-HINBAN
     */
    public void setSetHinban(final String p) {
        this.setHinban = p;
    }

    /** SET-KHINBAN */
    @jakarta.validation.constraints.Size(max = 20)
    private String setKhinban;

    /**
     * @return SET-KHINBAN
     */
    public String getSetKhinban() {
        return setKhinban;
    }

    /**
     * @param p SET-KHINBAN
     */
    public void setSetKhinban(final String p) {
        this.setKhinban = p;
    }

    /** DLTFLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String dltflg;

    /**
     * @return DLTFLG
     */
    public String getDltflg() {
        return dltflg;
    }

    /**
     * @param p DLTFLG
     */
    public void setDltflg(final String p) {
        this.dltflg = p;
    }

    /** SETINZU */
    @jakarta.validation.constraints.Size(max = 3)
    private String setinzu;

    /**
     * @return SETINZU
     */
    public String getSetinzu() {
        return setinzu;
    }

    /**
     * @param p SETINZU
     */
    public void setSetinzu(final String p) {
        this.setinzu = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
