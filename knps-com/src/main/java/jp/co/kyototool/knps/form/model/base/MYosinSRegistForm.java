package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 与信管理マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MYosinSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MYosinRegistForm.class);

    /** 与信管理マスタ登録フォームのリスト */
    @Valid
    private List<MYosinRegistForm> mYosinGrid;

    /**
     * @return 与信管理マスタ登録フォームのリスト
     */
    public List<MYosinRegistForm> getMYosinGrid() {
        return mYosinGrid;
    }

    /**
     * @param p 与信管理マスタ登録フォームのリスト
     */
    public void setMYosinGrid(final List<MYosinRegistForm> p) {
        this.mYosinGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
