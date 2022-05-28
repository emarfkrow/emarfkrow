package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_STRUCTURE_BK_YM一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstStructureBkYmSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstStructureBkYmRegistForm.class);

    /** MST_STRUCTURE_BK_YM登録フォームのリスト */
    @Valid
    private List<MstStructureBkYmRegistForm> mstStructureBkYmGrid;

    /**
     * @return MST_STRUCTURE_BK_YM登録フォームのリスト
     */
    public List<MstStructureBkYmRegistForm> getMstStructureBkYmGrid() {
        return mstStructureBkYmGrid;
    }

    /**
     * @param p MST_STRUCTURE_BK_YM登録フォームのリスト
     */
    public void setMstStructureBkYmGrid(final List<MstStructureBkYmRegistForm> p) {
        this.mstStructureBkYmGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
