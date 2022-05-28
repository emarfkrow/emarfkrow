package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_PAY_ACT_HED一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchPayActHedSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchPayActHedRegistForm.class);

    /** PCH_PAY_ACT_HED登録フォームのリスト */
    @Valid
    private List<PchPayActHedRegistForm> pchPayActHedGrid;

    /**
     * @return PCH_PAY_ACT_HED登録フォームのリスト
     */
    public List<PchPayActHedRegistForm> getPchPayActHedGrid() {
        return pchPayActHedGrid;
    }

    /**
     * @param p PCH_PAY_ACT_HED登録フォームのリスト
     */
    public void setPchPayActHedGrid(final List<PchPayActHedRegistForm> p) {
        this.pchPayActHedGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
