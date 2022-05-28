package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUP_UNITPRICE登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupUnitpriceRegistForm.class);

    /** HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** SUP_CODE */
    @jakarta.validation.constraints.Size(max = 6)
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return supCode;
    }

    /**
     * @param p SUP_CODE
     */
    public void setSupCode(final String p) {
        this.supCode = p;
    }

    /** SUBINV_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String subinvCode;

    /**
     * @return SUBINV_CODE
     */
    public String getSubinvCode() {
        return subinvCode;
    }

    /**
     * @param p SUBINV_CODE
     */
    public void setSubinvCode(final String p) {
        this.subinvCode = p;
    }

    /** PROCURE_LT */
    @jakarta.validation.constraints.Size(max = 9)
    private String procureLt;

    /**
     * @return PROCURE_LT
     */
    public String getProcureLt() {
        return procureLt;
    }

    /**
     * @param p PROCURE_LT
     */
    public void setProcureLt(final String p) {
        this.procureLt = p;
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

    /** MUSHO_HACCHU_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String mushoHacchuF;

    /**
     * @return MUSHO_HACCHU_F
     */
    public String getMushoHacchuF() {
        return mushoHacchuF;
    }

    /**
     * @param p MUSHO_HACCHU_F
     */
    public void setMushoHacchuF(final String p) {
        this.mushoHacchuF = p;
    }

    /** MST_SUP_UNITPRICE_BK */
    @jakarta.validation.Valid
    private List<MstSupUnitpriceBkRegistForm> mstSupUnitpriceBkGrid;

    /**
     * @return MST_SUP_UNITPRICE_BK
     */
    public List<MstSupUnitpriceBkRegistForm> getMstSupUnitpriceBkGrid() {
        return mstSupUnitpriceBkGrid;
    }

    /**
     * @param p
     */
    public void setMstSupUnitpriceBkGrid(final List<MstSupUnitpriceBkRegistForm> p) {
        this.mstSupUnitpriceBkGrid = p;
    }

    /** MST_SUP_UNITPRICE_DETAIL */
    @jakarta.validation.Valid
    private List<MstSupUnitpriceDetailRegistForm> mstSupUnitpriceDetailGrid;

    /**
     * @return MST_SUP_UNITPRICE_DETAIL
     */
    public List<MstSupUnitpriceDetailRegistForm> getMstSupUnitpriceDetailGrid() {
        return mstSupUnitpriceDetailGrid;
    }

    /**
     * @param p
     */
    public void setMstSupUnitpriceDetailGrid(final List<MstSupUnitpriceDetailRegistForm> p) {
        this.mstSupUnitpriceDetailGrid = p;
    }

    /** MST_SUP_UNITPRICE_HS */
    @jakarta.validation.Valid
    private List<MstSupUnitpriceHsRegistForm> mstSupUnitpriceHsGrid;

    /**
     * @return MST_SUP_UNITPRICE_HS
     */
    public List<MstSupUnitpriceHsRegistForm> getMstSupUnitpriceHsGrid() {
        return mstSupUnitpriceHsGrid;
    }

    /**
     * @param p
     */
    public void setMstSupUnitpriceHsGrid(final List<MstSupUnitpriceHsRegistForm> p) {
        this.mstSupUnitpriceHsGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
