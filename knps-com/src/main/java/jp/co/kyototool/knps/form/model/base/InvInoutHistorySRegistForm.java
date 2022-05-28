package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_INOUT_HISTORY一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvInoutHistorySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvInoutHistoryRegistForm.class);

    /** INV_INOUT_HISTORY登録フォームのリスト */
    @Valid
    private List<InvInoutHistoryRegistForm> invInoutHistoryGrid;

    /**
     * @return INV_INOUT_HISTORY登録フォームのリスト
     */
    public List<InvInoutHistoryRegistForm> getInvInoutHistoryGrid() {
        return invInoutHistoryGrid;
    }

    /**
     * @param p INV_INOUT_HISTORY登録フォームのリスト
     */
    public void setInvInoutHistoryGrid(final List<InvInoutHistoryRegistForm> p) {
        this.invInoutHistoryGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
