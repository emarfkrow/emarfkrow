package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_FORM_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanFormDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanFormDetRegistForm.class);

    /** MFG_KANBAN_FORM_DET登録フォームのリスト */
    @Valid
    private List<MfgKanbanFormDetRegistForm> mfgKanbanFormDetGrid;

    /**
     * @return MFG_KANBAN_FORM_DET登録フォームのリスト
     */
    public List<MfgKanbanFormDetRegistForm> getMfgKanbanFormDetGrid() {
        return mfgKanbanFormDetGrid;
    }

    /**
     * @param p MFG_KANBAN_FORM_DET登録フォームのリスト
     */
    public void setMfgKanbanFormDetGrid(final List<MfgKanbanFormDetRegistForm> p) {
        this.mfgKanbanFormDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
