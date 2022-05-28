package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * F_JUCHUM一覧登録フォーム
 *
 * @author emarfkrow
 */
public class FJuchumSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FJuchumRegistForm.class);

    /** F_JUCHUM登録フォームのリスト */
    @Valid
    private List<FJuchumRegistForm> fJuchumGrid;

    /**
     * @return F_JUCHUM登録フォームのリスト
     */
    public List<FJuchumRegistForm> getFJuchumGrid() {
        return fJuchumGrid;
    }

    /**
     * @param p F_JUCHUM登録フォームのリスト
     */
    public void setFJuchumGrid(final List<FJuchumRegistForm> p) {
        this.fJuchumGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
