package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_PHASE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstPhaseSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstPhaseRegistForm.class);

    /** MST_PHASE登録フォームのリスト */
    @Valid
    private List<MstPhaseRegistForm> mstPhaseGrid;

    /**
     * @return MST_PHASE登録フォームのリスト
     */
    public List<MstPhaseRegistForm> getMstPhaseGrid() {
        return mstPhaseGrid;
    }

    /**
     * @param p MST_PHASE登録フォームのリスト
     */
    public void setMstPhaseGrid(final List<MstPhaseRegistForm> p) {
        this.mstPhaseGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
