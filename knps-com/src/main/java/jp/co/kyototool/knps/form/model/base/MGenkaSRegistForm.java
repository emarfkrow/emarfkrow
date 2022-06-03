package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 原価マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MGenkaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MGenkaRegistForm.class);

    /** 原価マスタ登録フォームのリスト */
    @Valid
    private List<MGenkaRegistForm> mGenkaGrid;

    /**
     * @return 原価マスタ登録フォームのリスト
     */
    public List<MGenkaRegistForm> getMGenkaGrid() {
        return mGenkaGrid;
    }

    /**
     * @param p 原価マスタ登録フォームのリスト
     */
    public void setMGenkaGrid(final List<MGenkaRegistForm> p) {
        this.mGenkaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
