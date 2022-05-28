package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_INVENTORY一覧登録フォーム
 *
 * @author emarfkrow
 */
public class InvInventorySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvInventoryRegistForm.class);

    /** INV_INVENTORY登録フォームのリスト */
    @Valid
    private List<InvInventoryRegistForm> invInventoryGrid;

    /**
     * @return INV_INVENTORY登録フォームのリスト
     */
    public List<InvInventoryRegistForm> getInvInventoryGrid() {
        return invInventoryGrid;
    }

    /**
     * @param p INV_INVENTORY登録フォームのリスト
     */
    public void setInvInventoryGrid(final List<InvInventoryRegistForm> p) {
        this.invInventoryGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
