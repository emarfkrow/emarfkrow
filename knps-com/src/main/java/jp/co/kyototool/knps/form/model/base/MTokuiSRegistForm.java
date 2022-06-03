package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 得意先マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MTokuiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MTokuiRegistForm.class);

    /** 得意先マスタ登録フォームのリスト */
    @Valid
    private List<MTokuiRegistForm> mTokuiGrid;

    /**
     * @return 得意先マスタ登録フォームのリスト
     */
    public List<MTokuiRegistForm> getMTokuiGrid() {
        return mTokuiGrid;
    }

    /**
     * @param p 得意先マスタ登録フォームのリスト
     */
    public void setMTokuiGrid(final List<MTokuiRegistForm> p) {
        this.mTokuiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
