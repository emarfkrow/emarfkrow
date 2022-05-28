package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_STRUCTURE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstStructureSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstStructureRegistForm.class);

    /** MST_STRUCTURE登録フォームのリスト */
    @Valid
    private List<MstStructureRegistForm> mstStructureGrid;

    /**
     * @return MST_STRUCTURE登録フォームのリスト
     */
    public List<MstStructureRegistForm> getMstStructureGrid() {
        return mstStructureGrid;
    }

    /**
     * @param p MST_STRUCTURE登録フォームのリスト
     */
    public void setMstStructureGrid(final List<MstStructureRegistForm> p) {
        this.mstStructureGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
