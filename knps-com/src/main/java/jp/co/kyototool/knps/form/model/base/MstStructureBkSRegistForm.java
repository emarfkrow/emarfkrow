package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_STRUCTURE_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstStructureBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstStructureBkRegistForm.class);

    /** MST_STRUCTURE_BK登録フォームのリスト */
    @Valid
    private List<MstStructureBkRegistForm> mstStructureBkGrid;

    /**
     * @return MST_STRUCTURE_BK登録フォームのリスト
     */
    public List<MstStructureBkRegistForm> getMstStructureBkGrid() {
        return mstStructureBkGrid;
    }

    /**
     * @param p MST_STRUCTURE_BK登録フォームのリスト
     */
    public void setMstStructureBkGrid(final List<MstStructureBkRegistForm> p) {
        this.mstStructureBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
