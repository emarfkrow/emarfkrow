package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 部品構成マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MPkoseSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MPkoseRegistForm.class);

    /** 部品構成マスタ登録フォームのリスト */
    @Valid
    private List<MPkoseRegistForm> mPkoseGrid;

    /**
     * @return 部品構成マスタ登録フォームのリスト
     */
    public List<MPkoseRegistForm> getMPkoseGrid() {
        return mPkoseGrid;
    }

    /**
     * @param p 部品構成マスタ登録フォームのリスト
     */
    public void setMPkoseGrid(final List<MPkoseRegistForm> p) {
        this.mPkoseGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
