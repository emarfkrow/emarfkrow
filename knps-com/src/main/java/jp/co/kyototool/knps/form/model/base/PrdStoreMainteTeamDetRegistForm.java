package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_TEAM_DET登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteTeamDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteTeamDetRegistForm.class);

    /** MFG_TEAM_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String mfgTeamCode;

    /**
     * @return MFG_TEAM_CODE
     */
    public String getMfgTeamCode() {
        return mfgTeamCode;
    }

    /**
     * @param p MFG_TEAM_CODE
     */
    public void setMfgTeamCode(final String p) {
        this.mfgTeamCode = p;
    }

    /** WS_CODE */
    @jakarta.validation.constraints.Size(max = 4)
    private String wsCode;

    /**
     * @return WS_CODE
     */
    public String getWsCode() {
        return wsCode;
    }

    /**
     * @param p WS_CODE
     */
    public void setWsCode(final String p) {
        this.wsCode = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
