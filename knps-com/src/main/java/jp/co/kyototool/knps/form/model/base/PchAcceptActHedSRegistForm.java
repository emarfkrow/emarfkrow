package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_ACCEPT_ACT_HED一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchAcceptActHedSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchAcceptActHedRegistForm.class);

    /** PCH_ACCEPT_ACT_HED登録フォームのリスト */
    @Valid
    private List<PchAcceptActHedRegistForm> pchAcceptActHedGrid;

    /**
     * @return PCH_ACCEPT_ACT_HED登録フォームのリスト
     */
    public List<PchAcceptActHedRegistForm> getPchAcceptActHedGrid() {
        return pchAcceptActHedGrid;
    }

    /**
     * @param p PCH_ACCEPT_ACT_HED登録フォームのリスト
     */
    public void setPchAcceptActHedGrid(final List<PchAcceptActHedRegistForm> p) {
        this.pchAcceptActHedGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
