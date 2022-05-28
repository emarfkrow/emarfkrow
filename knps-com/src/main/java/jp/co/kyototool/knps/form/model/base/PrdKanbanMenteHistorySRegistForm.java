package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_KANBAN_MENTE_HISTORY一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdKanbanMenteHistorySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdKanbanMenteHistoryRegistForm.class);

    /** PRD_KANBAN_MENTE_HISTORY登録フォームのリスト */
    @Valid
    private List<PrdKanbanMenteHistoryRegistForm> prdKanbanMenteHistoryGrid;

    /**
     * @return PRD_KANBAN_MENTE_HISTORY登録フォームのリスト
     */
    public List<PrdKanbanMenteHistoryRegistForm> getPrdKanbanMenteHistoryGrid() {
        return prdKanbanMenteHistoryGrid;
    }

    /**
     * @param p PRD_KANBAN_MENTE_HISTORY登録フォームのリスト
     */
    public void setPrdKanbanMenteHistoryGrid(final List<PrdKanbanMenteHistoryRegistForm> p) {
        this.prdKanbanMenteHistoryGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
