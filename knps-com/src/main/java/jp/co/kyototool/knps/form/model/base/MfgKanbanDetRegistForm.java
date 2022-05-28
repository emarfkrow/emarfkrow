package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_DET登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanDetRegistForm.class);

    /** KANBAN_ID */
    @jakarta.validation.constraints.Size(max = 9)
    private String kanbanId;

    /**
     * @return KANBAN_ID
     */
    public String getKanbanId() {
        return kanbanId;
    }

    /**
     * @param p KANBAN_ID
     */
    public void setKanbanId(final String p) {
        this.kanbanId = p;
    }

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

    /** NECK_ROUTING_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String neckRoutingCode;

    /**
     * @return NECK_ROUTING_CODE
     */
    public String getNeckRoutingCode() {
        return neckRoutingCode;
    }

    /**
     * @param p NECK_ROUTING_CODE
     */
    public void setNeckRoutingCode(final String p) {
        this.neckRoutingCode = p;
    }

    /** FOR_PRO_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String forProCode;

    /**
     * @return FOR_PRO_CODE
     */
    public String getForProCode() {
        return forProCode;
    }

    /**
     * @param p FOR_PRO_CODE
     */
    public void setForProCode(final String p) {
        this.forProCode = p;
    }

    /** FOR_PRO_LOCATION_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String forProLocationCode;

    /**
     * @return FOR_PRO_LOCATION_CODE
     */
    public String getForProLocationCode() {
        return forProLocationCode;
    }

    /**
     * @param p FOR_PRO_LOCATION_CODE
     */
    public void setForProLocationCode(final String p) {
        this.forProLocationCode = p;
    }

    /** PRO_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String proCode;

    /**
     * @return PRO_CODE
     */
    public String getProCode() {
        return proCode;
    }

    /**
     * @param p PRO_CODE
     */
    public void setProCode(final String p) {
        this.proCode = p;
    }

    /** PRO_LOCATION_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String proLocationCode;

    /**
     * @return PRO_LOCATION_CODE
     */
    public String getProLocationCode() {
        return proLocationCode;
    }

    /**
     * @param p PRO_LOCATION_CODE
     */
    public void setProLocationCode(final String p) {
        this.proLocationCode = p;
    }

    /** COMMENT1 */
    @jakarta.validation.constraints.Size(max = 50)
    private String comment1;

    /**
     * @return COMMENT1
     */
    public String getComment1() {
        return comment1;
    }

    /**
     * @param p COMMENT1
     */
    public void setComment1(final String p) {
        this.comment1 = p;
    }

    /** COMMENT2 */
    @jakarta.validation.constraints.Size(max = 50)
    private String comment2;

    /**
     * @return COMMENT2
     */
    public String getComment2() {
        return comment2;
    }

    /**
     * @param p COMMENT2
     */
    public void setComment2(final String p) {
        this.comment2 = p;
    }

    /** ROUTING1 */
    @jakarta.validation.constraints.Size(max = 2)
    private String routing1;

    /**
     * @return ROUTING1
     */
    public String getRouting1() {
        return routing1;
    }

    /**
     * @param p ROUTING1
     */
    public void setRouting1(final String p) {
        this.routing1 = p;
    }

    /** TUNNEL_PRO_CODE1 */
    @jakarta.validation.constraints.Size(max = 10)
    private String tunnelProCode1;

    /**
     * @return TUNNEL_PRO_CODE1
     */
    public String getTunnelProCode1() {
        return tunnelProCode1;
    }

    /**
     * @param p TUNNEL_PRO_CODE1
     */
    public void setTunnelProCode1(final String p) {
        this.tunnelProCode1 = p;
    }

    /** ROUTING2 */
    @jakarta.validation.constraints.Size(max = 2)
    private String routing2;

    /**
     * @return ROUTING2
     */
    public String getRouting2() {
        return routing2;
    }

    /**
     * @param p ROUTING2
     */
    public void setRouting2(final String p) {
        this.routing2 = p;
    }

    /** TUNNEL_PRO_CODE2 */
    @jakarta.validation.constraints.Size(max = 10)
    private String tunnelProCode2;

    /**
     * @return TUNNEL_PRO_CODE2
     */
    public String getTunnelProCode2() {
        return tunnelProCode2;
    }

    /**
     * @param p TUNNEL_PRO_CODE2
     */
    public void setTunnelProCode2(final String p) {
        this.tunnelProCode2 = p;
    }

    /** ROUTING3 */
    @jakarta.validation.constraints.Size(max = 2)
    private String routing3;

    /**
     * @return ROUTING3
     */
    public String getRouting3() {
        return routing3;
    }

    /**
     * @param p ROUTING3
     */
    public void setRouting3(final String p) {
        this.routing3 = p;
    }

    /** TUNNEL_PRO_CODE3 */
    @jakarta.validation.constraints.Size(max = 10)
    private String tunnelProCode3;

    /**
     * @return TUNNEL_PRO_CODE3
     */
    public String getTunnelProCode3() {
        return tunnelProCode3;
    }

    /**
     * @param p TUNNEL_PRO_CODE3
     */
    public void setTunnelProCode3(final String p) {
        this.tunnelProCode3 = p;
    }

    /** ROUTING4 */
    @jakarta.validation.constraints.Size(max = 2)
    private String routing4;

    /**
     * @return ROUTING4
     */
    public String getRouting4() {
        return routing4;
    }

    /**
     * @param p ROUTING4
     */
    public void setRouting4(final String p) {
        this.routing4 = p;
    }

    /** TUNNEL_PRO_CODE4 */
    @jakarta.validation.constraints.Size(max = 10)
    private String tunnelProCode4;

    /**
     * @return TUNNEL_PRO_CODE4
     */
    public String getTunnelProCode4() {
        return tunnelProCode4;
    }

    /**
     * @param p TUNNEL_PRO_CODE4
     */
    public void setTunnelProCode4(final String p) {
        this.tunnelProCode4 = p;
    }

    /** ROUTING5 */
    @jakarta.validation.constraints.Size(max = 2)
    private String routing5;

    /**
     * @return ROUTING5
     */
    public String getRouting5() {
        return routing5;
    }

    /**
     * @param p ROUTING5
     */
    public void setRouting5(final String p) {
        this.routing5 = p;
    }

    /** TUNNEL_PRO_CODE5 */
    @jakarta.validation.constraints.Size(max = 10)
    private String tunnelProCode5;

    /**
     * @return TUNNEL_PRO_CODE5
     */
    public String getTunnelProCode5() {
        return tunnelProCode5;
    }

    /**
     * @param p TUNNEL_PRO_CODE5
     */
    public void setTunnelProCode5(final String p) {
        this.tunnelProCode5 = p;
    }

    /** KANBAN_ACC_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String kanbanAccCounts;

    /**
     * @return KANBAN_ACC_COUNTS
     */
    public String getKanbanAccCounts() {
        return kanbanAccCounts;
    }

    /**
     * @param p KANBAN_ACC_COUNTS
     */
    public void setKanbanAccCounts(final String p) {
        this.kanbanAccCounts = p;
    }

    /** LOT_SIZE */
    @jakarta.validation.constraints.Size(max = 6)
    private String lotSize;

    /**
     * @return LOT_SIZE
     */
    public String getLotSize() {
        return lotSize;
    }

    /**
     * @param p LOT_SIZE
     */
    public void setLotSize(final String p) {
        this.lotSize = p;
    }

    /** MFG_KANBAN_SHIPPING */
    @jakarta.validation.Valid
    private List<MfgKanbanShippingRegistForm> mfgKanbanShippingGrid;

    /**
     * @return MFG_KANBAN_SHIPPING
     */
    public List<MfgKanbanShippingRegistForm> getMfgKanbanShippingGrid() {
        return mfgKanbanShippingGrid;
    }

    /**
     * @param p
     */
    public void setMfgKanbanShippingGrid(final List<MfgKanbanShippingRegistForm> p) {
        this.mfgKanbanShippingGrid = p;
    }

    /** MFG_KANBAN_STATUS */
    @jakarta.validation.Valid
    private List<MfgKanbanStatusRegistForm> mfgKanbanStatusGrid;

    /**
     * @return MFG_KANBAN_STATUS
     */
    public List<MfgKanbanStatusRegistForm> getMfgKanbanStatusGrid() {
        return mfgKanbanStatusGrid;
    }

    /**
     * @param p
     */
    public void setMfgKanbanStatusGrid(final List<MfgKanbanStatusRegistForm> p) {
        this.mfgKanbanStatusGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
