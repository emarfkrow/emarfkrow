package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ネットインカム一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MNetincSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MNetincRegistForm.class);

    /** ネットインカム登録フォームのリスト */
    @Valid
    private List<MNetincRegistForm> mNetincGrid;

    /**
     * @return ネットインカム登録フォームのリスト
     */
    public List<MNetincRegistForm> getMNetincGrid() {
        return mNetincGrid;
    }

    /**
     * @param p ネットインカム登録フォームのリスト
     */
    public void setMNetincGrid(final List<MNetincRegistForm> p) {
        this.mNetincGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
