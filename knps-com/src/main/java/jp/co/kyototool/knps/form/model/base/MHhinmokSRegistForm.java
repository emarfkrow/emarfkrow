package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * M_HHINMOK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MHhinmokSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHhinmokRegistForm.class);

    /** M_HHINMOK登録フォームのリスト */
    @Valid
    private List<MHhinmokRegistForm> mHhinmokGrid;

    /**
     * @return M_HHINMOK登録フォームのリスト
     */
    public List<MHhinmokRegistForm> getMHhinmokGrid() {
        return mHhinmokGrid;
    }

    /**
     * @param p M_HHINMOK登録フォームのリスト
     */
    public void setMHhinmokGrid(final List<MHhinmokRegistForm> p) {
        this.mHhinmokGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
