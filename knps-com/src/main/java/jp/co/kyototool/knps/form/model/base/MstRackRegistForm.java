package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_RACK登録フォーム
 *
 * @author emarfkrow
 */
public class MstRackRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstRackRegistForm.class);

    /** MAN_HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String manHinban;

    /**
     * @return MAN_HINBAN
     */
    public String getManHinban() {
        return manHinban;
    }

    /**
     * @param p MAN_HINBAN
     */
    public void setManHinban(final String p) {
        this.manHinban = p;
    }

    /** RACK_NAME */
    @jakarta.validation.constraints.Size(max = 30)
    private String rackName;

    /**
     * @return RACK_NAME
     */
    public String getRackName() {
        return rackName;
    }

    /**
     * @param p RACK_NAME
     */
    public void setRackName(final String p) {
        this.rackName = p;
    }

    /** KAKESU */
    @jakarta.validation.constraints.Size(max = 3)
    private String kakesu;

    /**
     * @return KAKESU
     */
    public String getKakesu() {
        return kakesu;
    }

    /**
     * @param p KAKESU
     */
    public void setKakesu(final String p) {
        this.kakesu = p;
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

    /** MST_ROUTING_DEF */
    @jakarta.validation.Valid
    private List<MstRoutingDefRegistForm> mstRoutingDefGrid;

    /**
     * @return MST_ROUTING_DEF
     */
    public List<MstRoutingDefRegistForm> getMstRoutingDefGrid() {
        return mstRoutingDefGrid;
    }

    /**
     * @param p
     */
    public void setMstRoutingDefGrid(final List<MstRoutingDefRegistForm> p) {
        this.mstRoutingDefGrid = p;
    }

    /** MST_STRUCTURE */
    @jakarta.validation.Valid
    private List<MstStructureRegistForm> mstStructureGrid;

    /**
     * @return MST_STRUCTURE
     */
    public List<MstStructureRegistForm> getMstStructureGrid() {
        return mstStructureGrid;
    }

    /**
     * @param p
     */
    public void setMstStructureGrid(final List<MstStructureRegistForm> p) {
        this.mstStructureGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
