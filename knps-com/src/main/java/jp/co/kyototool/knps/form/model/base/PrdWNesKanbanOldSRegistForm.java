package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_W_NES_KANBAN_OLD一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdWNesKanbanOldSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdWNesKanbanOldRegistForm.class);

    /** PRD_W_NES_KANBAN_OLD登録フォームのリスト */
    @Valid
    private List<PrdWNesKanbanOldRegistForm> prdWNesKanbanOldGrid;

    /**
     * @return PRD_W_NES_KANBAN_OLD登録フォームのリスト
     */
    public List<PrdWNesKanbanOldRegistForm> getPrdWNesKanbanOldGrid() {
        return prdWNesKanbanOldGrid;
    }

    /**
     * @param p PRD_W_NES_KANBAN_OLD登録フォームのリスト
     */
    public void setPrdWNesKanbanOldGrid(final List<PrdWNesKanbanOldRegistForm> p) {
        this.prdWNesKanbanOldGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
