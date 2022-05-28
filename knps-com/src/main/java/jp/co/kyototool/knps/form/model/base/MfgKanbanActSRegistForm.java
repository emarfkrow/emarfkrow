package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_ACT一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanActSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanActRegistForm.class);

    /** MFG_KANBAN_ACT登録フォームのリスト */
    @Valid
    private List<MfgKanbanActRegistForm> mfgKanbanActGrid;

    /**
     * @return MFG_KANBAN_ACT登録フォームのリスト
     */
    public List<MfgKanbanActRegistForm> getMfgKanbanActGrid() {
        return mfgKanbanActGrid;
    }

    /**
     * @param p MFG_KANBAN_ACT登録フォームのリスト
     */
    public void setMfgKanbanActGrid(final List<MfgKanbanActRegistForm> p) {
        this.mfgKanbanActGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
