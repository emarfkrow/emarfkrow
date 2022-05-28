package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ROUTING一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstRoutingSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstRoutingRegistForm.class);

    /** MST_ROUTING登録フォームのリスト */
    @Valid
    private List<MstRoutingRegistForm> mstRoutingGrid;

    /**
     * @return MST_ROUTING登録フォームのリスト
     */
    public List<MstRoutingRegistForm> getMstRoutingGrid() {
        return mstRoutingGrid;
    }

    /**
     * @param p MST_ROUTING登録フォームのリスト
     */
    public void setMstRoutingGrid(final List<MstRoutingRegistForm> p) {
        this.mstRoutingGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
