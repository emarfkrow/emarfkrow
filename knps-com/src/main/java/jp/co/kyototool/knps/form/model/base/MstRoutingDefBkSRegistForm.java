package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ROUTING_DEF_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstRoutingDefBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstRoutingDefBkRegistForm.class);

    /** MST_ROUTING_DEF_BK登録フォームのリスト */
    @Valid
    private List<MstRoutingDefBkRegistForm> mstRoutingDefBkGrid;

    /**
     * @return MST_ROUTING_DEF_BK登録フォームのリスト
     */
    public List<MstRoutingDefBkRegistForm> getMstRoutingDefBkGrid() {
        return mstRoutingDefBkGrid;
    }

    /**
     * @param p MST_ROUTING_DEF_BK登録フォームのリスト
     */
    public void setMstRoutingDefBkGrid(final List<MstRoutingDefBkRegistForm> p) {
        this.mstRoutingDefBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
