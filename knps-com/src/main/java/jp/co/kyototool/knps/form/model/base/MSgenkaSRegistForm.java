package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 製品原価マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MSgenkaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSgenkaRegistForm.class);

    /** 製品原価マスタ登録フォームのリスト */
    @Valid
    private List<MSgenkaRegistForm> mSgenkaGrid;

    /**
     * @return 製品原価マスタ登録フォームのリスト
     */
    public List<MSgenkaRegistForm> getMSgenkaGrid() {
        return mSgenkaGrid;
    }

    /**
     * @param p 製品原価マスタ登録フォームのリスト
     */
    public void setMSgenkaGrid(final List<MSgenkaRegistForm> p) {
        this.mSgenkaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
