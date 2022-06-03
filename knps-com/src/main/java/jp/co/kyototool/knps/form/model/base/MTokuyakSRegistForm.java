package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ネプロス特約店マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MTokuyakSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MTokuyakRegistForm.class);

    /** ネプロス特約店マスタ登録フォームのリスト */
    @Valid
    private List<MTokuyakRegistForm> mTokuyakGrid;

    /**
     * @return ネプロス特約店マスタ登録フォームのリスト
     */
    public List<MTokuyakRegistForm> getMTokuyakGrid() {
        return mTokuyakGrid;
    }

    /**
     * @param p ネプロス特約店マスタ登録フォームのリスト
     */
    public void setMTokuyakGrid(final List<MTokuyakRegistForm> p) {
        this.mTokuyakGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
