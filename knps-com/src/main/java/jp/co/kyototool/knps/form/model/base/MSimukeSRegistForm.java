package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 仕向先マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MSimukeSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSimukeRegistForm.class);

    /** 仕向先マスタ登録フォームのリスト */
    @Valid
    private List<MSimukeRegistForm> mSimukeGrid;

    /**
     * @return 仕向先マスタ登録フォームのリスト
     */
    public List<MSimukeRegistForm> getMSimukeGrid() {
        return mSimukeGrid;
    }

    /**
     * @param p 仕向先マスタ登録フォームのリスト
     */
    public void setMSimukeGrid(final List<MSimukeRegistForm> p) {
        this.mSimukeGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
