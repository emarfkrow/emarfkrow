package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ACT_GATHER_PAT一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstActGatherPatSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstActGatherPatRegistForm.class);

    /** MST_ACT_GATHER_PAT登録フォームのリスト */
    @Valid
    private List<MstActGatherPatRegistForm> mstActGatherPatGrid;

    /**
     * @return MST_ACT_GATHER_PAT登録フォームのリスト
     */
    public List<MstActGatherPatRegistForm> getMstActGatherPatGrid() {
        return mstActGatherPatGrid;
    }

    /**
     * @param p MST_ACT_GATHER_PAT登録フォームのリスト
     */
    public void setMstActGatherPatGrid(final List<MstActGatherPatRegistForm> p) {
        this.mstActGatherPatGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
