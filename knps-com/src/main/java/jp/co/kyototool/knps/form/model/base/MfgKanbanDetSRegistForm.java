package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanDetRegistForm.class);

    /** MFG_KANBAN_DET登録フォームのリスト */
    @Valid
    private List<MfgKanbanDetRegistForm> mfgKanbanDetGrid;

    /**
     * @return MFG_KANBAN_DET登録フォームのリスト
     */
    public List<MfgKanbanDetRegistForm> getMfgKanbanDetGrid() {
        return mfgKanbanDetGrid;
    }

    /**
     * @param p MFG_KANBAN_DET登録フォームのリスト
     */
    public void setMfgKanbanDetGrid(final List<MfgKanbanDetRegistForm> p) {
        this.mfgKanbanDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
