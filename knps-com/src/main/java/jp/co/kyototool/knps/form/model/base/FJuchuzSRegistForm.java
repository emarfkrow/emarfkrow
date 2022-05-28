package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * F_JUCHUZ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class FJuchuzSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FJuchuzRegistForm.class);

    /** F_JUCHUZ登録フォームのリスト */
    @Valid
    private List<FJuchuzRegistForm> fJuchuzGrid;

    /**
     * @return F_JUCHUZ登録フォームのリスト
     */
    public List<FJuchuzRegistForm> getFJuchuzGrid() {
        return fJuchuzGrid;
    }

    /**
     * @param p F_JUCHUZ登録フォームのリスト
     */
    public void setFJuchuzGrid(final List<FJuchuzRegistForm> p) {
        this.fJuchuzGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
