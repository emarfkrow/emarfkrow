package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 包装材構成マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MHososetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHososetRegistForm.class);

    /** 包装材構成マスタ登録フォームのリスト */
    @Valid
    private List<MHososetRegistForm> mHososetGrid;

    /**
     * @return 包装材構成マスタ登録フォームのリスト
     */
    public List<MHososetRegistForm> getMHososetGrid() {
        return mHososetGrid;
    }

    /**
     * @param p 包装材構成マスタ登録フォームのリスト
     */
    public void setMHososetGrid(final List<MHososetRegistForm> p) {
        this.mHososetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
