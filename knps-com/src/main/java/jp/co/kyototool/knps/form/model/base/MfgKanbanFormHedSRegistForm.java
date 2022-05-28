package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_FORM_HED一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanFormHedSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanFormHedRegistForm.class);

    /** MFG_KANBAN_FORM_HED登録フォームのリスト */
    @Valid
    private List<MfgKanbanFormHedRegistForm> mfgKanbanFormHedGrid;

    /**
     * @return MFG_KANBAN_FORM_HED登録フォームのリスト
     */
    public List<MfgKanbanFormHedRegistForm> getMfgKanbanFormHedGrid() {
        return mfgKanbanFormHedGrid;
    }

    /**
     * @param p MFG_KANBAN_FORM_HED登録フォームのリスト
     */
    public void setMfgKanbanFormHedGrid(final List<MfgKanbanFormHedRegistForm> p) {
        this.mfgKanbanFormHedGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
