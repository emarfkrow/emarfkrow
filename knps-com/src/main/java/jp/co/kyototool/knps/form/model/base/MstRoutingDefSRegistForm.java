package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ROUTING_DEF一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstRoutingDefSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstRoutingDefRegistForm.class);

    /** MST_ROUTING_DEF登録フォームのリスト */
    @Valid
    private List<MstRoutingDefRegistForm> mstRoutingDefGrid;

    /**
     * @return MST_ROUTING_DEF登録フォームのリスト
     */
    public List<MstRoutingDefRegistForm> getMstRoutingDefGrid() {
        return mstRoutingDefGrid;
    }

    /**
     * @param p MST_ROUTING_DEF登録フォームのリスト
     */
    public void setMstRoutingDefGrid(final List<MstRoutingDefRegistForm> p) {
        this.mstRoutingDefGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
