package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 日産単価マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MNtankaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MNtankaRegistForm.class);

    /** 日産単価マスタ登録フォームのリスト */
    @Valid
    private List<MNtankaRegistForm> mNtankaGrid;

    /**
     * @return 日産単価マスタ登録フォームのリスト
     */
    public List<MNtankaRegistForm> getMNtankaGrid() {
        return mNtankaGrid;
    }

    /**
     * @param p 日産単価マスタ登録フォームのリスト
     */
    public void setMNtankaGrid(final List<MNtankaRegistForm> p) {
        this.mNtankaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
