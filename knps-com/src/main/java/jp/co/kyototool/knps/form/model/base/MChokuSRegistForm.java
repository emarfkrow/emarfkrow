package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 直送先マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MChokuSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MChokuRegistForm.class);

    /** 直送先マスタ登録フォームのリスト */
    @Valid
    private List<MChokuRegistForm> mChokuGrid;

    /**
     * @return 直送先マスタ登録フォームのリスト
     */
    public List<MChokuRegistForm> getMChokuGrid() {
        return mChokuGrid;
    }

    /**
     * @param p 直送先マスタ登録フォームのリスト
     */
    public void setMChokuGrid(final List<MChokuRegistForm> p) {
        this.mChokuGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
