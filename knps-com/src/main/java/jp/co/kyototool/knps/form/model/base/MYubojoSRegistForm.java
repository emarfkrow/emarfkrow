package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 有力店ボーナス条件一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MYubojoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MYubojoRegistForm.class);

    /** 有力店ボーナス条件登録フォームのリスト */
    @Valid
    private List<MYubojoRegistForm> mYubojoGrid;

    /**
     * @return 有力店ボーナス条件登録フォームのリスト
     */
    public List<MYubojoRegistForm> getMYubojoGrid() {
        return mYubojoGrid;
    }

    /**
     * @param p 有力店ボーナス条件登録フォームのリスト
     */
    public void setMYubojoGrid(final List<MYubojoRegistForm> p) {
        this.mYubojoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
