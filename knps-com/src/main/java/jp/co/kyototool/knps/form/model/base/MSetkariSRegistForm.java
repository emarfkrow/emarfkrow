package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * M_SETKARI一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MSetkariSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSetkariRegistForm.class);

    /** M_SETKARI登録フォームのリスト */
    @Valid
    private List<MSetkariRegistForm> mSetkariGrid;

    /**
     * @return M_SETKARI登録フォームのリスト
     */
    public List<MSetkariRegistForm> getMSetkariGrid() {
        return mSetkariGrid;
    }

    /**
     * @param p M_SETKARI登録フォームのリスト
     */
    public void setMSetkariGrid(final List<MSetkariRegistForm> p) {
        this.mSetkariGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
