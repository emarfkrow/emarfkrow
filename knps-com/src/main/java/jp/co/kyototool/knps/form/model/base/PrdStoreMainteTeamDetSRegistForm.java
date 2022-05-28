package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_TEAM_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteTeamDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteTeamDetRegistForm.class);

    /** PRD_STORE_MAINTE_TEAM_DET登録フォームのリスト */
    @Valid
    private List<PrdStoreMainteTeamDetRegistForm> prdStoreMainteTeamDetGrid;

    /**
     * @return PRD_STORE_MAINTE_TEAM_DET登録フォームのリスト
     */
    public List<PrdStoreMainteTeamDetRegistForm> getPrdStoreMainteTeamDetGrid() {
        return prdStoreMainteTeamDetGrid;
    }

    /**
     * @param p PRD_STORE_MAINTE_TEAM_DET登録フォームのリスト
     */
    public void setPrdStoreMainteTeamDetGrid(final List<PrdStoreMainteTeamDetRegistForm> p) {
        this.prdStoreMainteTeamDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
