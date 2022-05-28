package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_TEAM_HED登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteTeamHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteTeamHedRegistForm.class);

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

    /** MFG_TEAM_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String mfgTeamName;

    /**
     * @return MFG_TEAM_NAME
     */
    public String getMfgTeamName() {
        return mfgTeamName;
    }

    /**
     * @param p MFG_TEAM_NAME
     */
    public void setMfgTeamName(final String p) {
        this.mfgTeamName = p;
    }

    /** PRD_STORE_MAINTE_TEAM_DET */
    @jakarta.validation.Valid
    private List<PrdStoreMainteTeamDetRegistForm> prdStoreMainteTeamDetGrid;

    /**
     * @return PRD_STORE_MAINTE_TEAM_DET
     */
    public List<PrdStoreMainteTeamDetRegistForm> getPrdStoreMainteTeamDetGrid() {
        return prdStoreMainteTeamDetGrid;
    }

    /**
     * @param p
     */
    public void setPrdStoreMainteTeamDetGrid(final List<PrdStoreMainteTeamDetRegistForm> p) {
        this.prdStoreMainteTeamDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
