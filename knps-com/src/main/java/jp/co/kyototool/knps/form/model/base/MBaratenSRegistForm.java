package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * バラ展開マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MBaratenSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MBaratenRegistForm.class);

    /** バラ展開マスタ登録フォームのリスト */
    @Valid
    private List<MBaratenRegistForm> mBaratenGrid;

    /**
     * @return バラ展開マスタ登録フォームのリスト
     */
    public List<MBaratenRegistForm> getMBaratenGrid() {
        return mBaratenGrid;
    }

    /**
     * @param p バラ展開マスタ登録フォームのリスト
     */
    public void setMBaratenGrid(final List<MBaratenRegistForm> p) {
        this.mBaratenGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
