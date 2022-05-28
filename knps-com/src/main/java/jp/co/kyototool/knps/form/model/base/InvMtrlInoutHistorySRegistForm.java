package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_MTRL_INOUT_HISTORY一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvMtrlInoutHistorySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvMtrlInoutHistoryRegistForm.class);

    /** INV_MTRL_INOUT_HISTORY登録フォームのリスト */
    @Valid
    private List<InvMtrlInoutHistoryRegistForm> invMtrlInoutHistoryGrid;

    /**
     * @return INV_MTRL_INOUT_HISTORY登録フォームのリスト
     */
    public List<InvMtrlInoutHistoryRegistForm> getInvMtrlInoutHistoryGrid() {
        return invMtrlInoutHistoryGrid;
    }

    /**
     * @param p INV_MTRL_INOUT_HISTORY登録フォームのリスト
     */
    public void setInvMtrlInoutHistoryGrid(final List<InvMtrlInoutHistoryRegistForm> p) {
        this.invMtrlInoutHistoryGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
