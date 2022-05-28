package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_UNIT一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstUnitSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstUnitRegistForm.class);

    /** MST_UNIT登録フォームのリスト */
    @Valid
    private List<MstUnitRegistForm> mstUnitGrid;

    /**
     * @return MST_UNIT登録フォームのリスト
     */
    public List<MstUnitRegistForm> getMstUnitGrid() {
        return mstUnitGrid;
    }

    /**
     * @param p MST_UNIT登録フォームのリスト
     */
    public void setMstUnitGrid(final List<MstUnitRegistForm> p) {
        this.mstUnitGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
