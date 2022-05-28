package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SALES_HINBAN登録フォーム
 *
 * @author emarfkrow
 */
public class MstSalesHinbanRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSalesHinbanRegistForm.class);

    /** SALES_HINBAN */
    @jakarta.validation.constraints.Size(max = 20)
    private String salesHinban;

    /**
     * @return SALES_HINBAN
     */
    public String getSalesHinban() {
        return salesHinban;
    }

    /**
     * @param p SALES_HINBAN
     */
    public void setSalesHinban(final String p) {
        this.salesHinban = p;
    }

    /** COMP_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String compKbn;

    /**
     * @return COMP_KBN
     */
    public String getCompKbn() {
        return compKbn;
    }

    /**
     * @param p COMP_KBN
     */
    public void setCompKbn(final String p) {
        this.compKbn = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** MST_SALES_HINBAN_MASTER */
    @jakarta.validation.Valid
    private MstSalesHinbanMasterRegistForm mstSalesHinbanMasterRegistForm;

    /**
     * @return MstSalesHinbanMasterRegistForm
     */
    public MstSalesHinbanMasterRegistForm getMstSalesHinbanMasterRegistForm() {
        return mstSalesHinbanMasterRegistForm;
    }

    /**
     * @param p
     */
    public void setMstSalesHinbanMasterRegistForm(final MstSalesHinbanMasterRegistForm p) {
        this.mstSalesHinbanMasterRegistForm = p;
    }

    /** INV_SALES_INVENTORY */
    @jakarta.validation.Valid
    private List<InvSalesInventoryRegistForm> invSalesInventoryGrid;

    /**
     * @return INV_SALES_INVENTORY
     */
    public List<InvSalesInventoryRegistForm> getInvSalesInventoryGrid() {
        return invSalesInventoryGrid;
    }

    /**
     * @param p
     */
    public void setInvSalesInventoryGrid(final List<InvSalesInventoryRegistForm> p) {
        this.invSalesInventoryGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
