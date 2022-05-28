package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_HED一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanHedSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanHedRegistForm.class);

    /** MFG_KANBAN_HED登録フォームのリスト */
    @Valid
    private List<MfgKanbanHedRegistForm> mfgKanbanHedGrid;

    /**
     * @return MFG_KANBAN_HED登録フォームのリスト
     */
    public List<MfgKanbanHedRegistForm> getMfgKanbanHedGrid() {
        return mfgKanbanHedGrid;
    }

    /**
     * @param p MFG_KANBAN_HED登録フォームのリスト
     */
    public void setMfgKanbanHedGrid(final List<MfgKanbanHedRegistForm> p) {
        this.mfgKanbanHedGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
