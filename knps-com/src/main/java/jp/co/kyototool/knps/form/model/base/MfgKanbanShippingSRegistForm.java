package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_SHIPPING一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanShippingSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanShippingRegistForm.class);

    /** MFG_KANBAN_SHIPPING登録フォームのリスト */
    @Valid
    private List<MfgKanbanShippingRegistForm> mfgKanbanShippingGrid;

    /**
     * @return MFG_KANBAN_SHIPPING登録フォームのリスト
     */
    public List<MfgKanbanShippingRegistForm> getMfgKanbanShippingGrid() {
        return mfgKanbanShippingGrid;
    }

    /**
     * @param p MFG_KANBAN_SHIPPING登録フォームのリスト
     */
    public void setMfgKanbanShippingGrid(final List<MfgKanbanShippingRegistForm> p) {
        this.mfgKanbanShippingGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
