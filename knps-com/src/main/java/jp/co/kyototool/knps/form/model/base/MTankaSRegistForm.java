package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 単価マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MTankaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MTankaRegistForm.class);

    /** 単価マスタ登録フォームのリスト */
    @Valid
    private List<MTankaRegistForm> mTankaGrid;

    /**
     * @return 単価マスタ登録フォームのリスト
     */
    public List<MTankaRegistForm> getMTankaGrid() {
        return mTankaGrid;
    }

    /**
     * @param p 単価マスタ登録フォームのリスト
     */
    public void setMTankaGrid(final List<MTankaRegistForm> p) {
        this.mTankaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
