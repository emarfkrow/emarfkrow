package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_W_NES_KANBAN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdWNesKanbanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdWNesKanbanRegistForm.class);

    /** PRD_W_NES_KANBAN登録フォームのリスト */
    @Valid
    private List<PrdWNesKanbanRegistForm> prdWNesKanbanGrid;

    /**
     * @return PRD_W_NES_KANBAN登録フォームのリスト
     */
    public List<PrdWNesKanbanRegistForm> getPrdWNesKanbanGrid() {
        return prdWNesKanbanGrid;
    }

    /**
     * @param p PRD_W_NES_KANBAN登録フォームのリスト
     */
    public void setPrdWNesKanbanGrid(final List<PrdWNesKanbanRegistForm> p) {
        this.prdWNesKanbanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
