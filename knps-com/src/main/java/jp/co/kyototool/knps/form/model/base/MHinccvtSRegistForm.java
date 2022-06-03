package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 品番変換マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MHinccvtSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHinccvtRegistForm.class);

    /** 品番変換マスタ登録フォームのリスト */
    @Valid
    private List<MHinccvtRegistForm> mHinccvtGrid;

    /**
     * @return 品番変換マスタ登録フォームのリスト
     */
    public List<MHinccvtRegistForm> getMHinccvtGrid() {
        return mHinccvtGrid;
    }

    /**
     * @param p 品番変換マスタ登録フォームのリスト
     */
    public void setMHinccvtGrid(final List<MHinccvtRegistForm> p) {
        this.mHinccvtGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
