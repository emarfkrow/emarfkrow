package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ROUTING_BK登録フォーム
 *
 * @author emarfkrow
 */
public class MstRoutingBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstRoutingBkRegistForm.class);

    /** YY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return YY
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p YY
     */
    public void setYy(final String p) {
        this.yy = p;
    }

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

    /** ROUTING_GROUP */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    public String getRoutingGroup() {
        return routingGroup;
    }

    /**
     * @param p ROUTING_GROUP
     */
    public void setRoutingGroup(final String p) {
        this.routingGroup = p;
    }

    /** ROUTING */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routing;

    /**
     * @return ROUTING
     */
    public String getRouting() {
        return routing;
    }

    /**
     * @param p ROUTING
     */
    public void setRouting(final String p) {
        this.routing = p;
    }

    /** NECK_ROUTING */
    @jakarta.validation.constraints.Size(max = 1)
    private String neckRouting;

    /**
     * @return NECK_ROUTING
     */
    public String getNeckRouting() {
        return neckRouting;
    }

    /**
     * @param p NECK_ROUTING
     */
    public void setNeckRouting(final String p) {
        this.neckRouting = p;
    }

    /** OPE_DETAIL */
    @jakarta.validation.constraints.Size(max = 10)
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return opeDetail;
    }

    /**
     * @param p OPE_DETAIL
     */
    public void setOpeDetail(final String p) {
        this.opeDetail = p;
    }

    /** WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return wcCode;
    }

    /**
     * @param p WC_CODE
     */
    public void setWcCode(final String p) {
        this.wcCode = p;
    }

    /** HUM_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String humPreTime;

    /**
     * @return HUM_PRE_TIME
     */
    public String getHumPreTime() {
        return humPreTime;
    }

    /**
     * @param p HUM_PRE_TIME
     */
    public void setHumPreTime(final String p) {
        this.humPreTime = p;
    }

    /** HUM_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String humActTime;

    /**
     * @return HUM_ACT_TIME
     */
    public String getHumActTime() {
        return humActTime;
    }

    /**
     * @param p HUM_ACT_TIME
     */
    public void setHumActTime(final String p) {
        this.humActTime = p;
    }

    /** MAC_PRE_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String macPreTime;

    /**
     * @return MAC_PRE_TIME
     */
    public String getMacPreTime() {
        return macPreTime;
    }

    /**
     * @param p MAC_PRE_TIME
     */
    public void setMacPreTime(final String p) {
        this.macPreTime = p;
    }

    /** MAC_ACT_TIME */
    @jakarta.validation.constraints.Size(max = 7)
    private String macActTime;

    /**
     * @return MAC_ACT_TIME
     */
    public String getMacActTime() {
        return macActTime;
    }

    /**
     * @param p MAC_ACT_TIME
     */
    public void setMacActTime(final String p) {
        this.macActTime = p;
    }

    /** COMMENT1 */
    @jakarta.validation.constraints.Size(max = 25)
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
    @jakarta.validation.constraints.Size(max = 25)
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

    /** ACC_COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String accCounts;

    /**
     * @return ACC_COUNTS
     */
    public String getAccCounts() {
        return accCounts;
    }

    /**
     * @param p ACC_COUNTS
     */
    public void setAccCounts(final String p) {
        this.accCounts = p;
    }

    /** UNIT_WEIGHT */
    @jakarta.validation.constraints.Size(max = 11)
    private String unitWeight;

    /**
     * @return UNIT_WEIGHT
     */
    public String getUnitWeight() {
        return unitWeight;
    }

    /**
     * @param p UNIT_WEIGHT
     */
    public void setUnitWeight(final String p) {
        this.unitWeight = p;
    }

    /** STORE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String storeKbn;

    /**
     * @return STORE_KBN
     */
    public String getStoreKbn() {
        return storeKbn;
    }

    /**
     * @param p STORE_KBN
     */
    public void setStoreKbn(final String p) {
        this.storeKbn = p;
    }

    /** STORE_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String storeNo;

    /**
     * @return STORE_NO
     */
    public String getStoreNo() {
        return storeNo;
    }

    /**
     * @param p STORE_NO
     */
    public void setStoreNo(final String p) {
        this.storeNo = p;
    }

    /** INSPECT_LANE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String inspectLaneKbn;

    /**
     * @return INSPECT_LANE_KBN
     */
    public String getInspectLaneKbn() {
        return inspectLaneKbn;
    }

    /**
     * @param p INSPECT_LANE_KBN
     */
    public void setInspectLaneKbn(final String p) {
        this.inspectLaneKbn = p;
    }

    /** INSPECT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String inspectKbn;

    /**
     * @return INSPECT_KBN
     */
    public String getInspectKbn() {
        return inspectKbn;
    }

    /**
     * @param p INSPECT_KBN
     */
    public void setInspectKbn(final String p) {
        this.inspectKbn = p;
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

    /** HUM_PRE_TIME_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String humPreTimeKbn;

    /**
     * @return HUM_PRE_TIME_KBN
     */
    public String getHumPreTimeKbn() {
        return humPreTimeKbn;
    }

    /**
     * @param p HUM_PRE_TIME_KBN
     */
    public void setHumPreTimeKbn(final String p) {
        this.humPreTimeKbn = p;
    }

    /** HUM_ACT_TIME_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String humActTimeKbn;

    /**
     * @return HUM_ACT_TIME_KBN
     */
    public String getHumActTimeKbn() {
        return humActTimeKbn;
    }

    /**
     * @param p HUM_ACT_TIME_KBN
     */
    public void setHumActTimeKbn(final String p) {
        this.humActTimeKbn = p;
    }

    /** MAC_PRE_TIME_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String macPreTimeKbn;

    /**
     * @return MAC_PRE_TIME_KBN
     */
    public String getMacPreTimeKbn() {
        return macPreTimeKbn;
    }

    /**
     * @param p MAC_PRE_TIME_KBN
     */
    public void setMacPreTimeKbn(final String p) {
        this.macPreTimeKbn = p;
    }

    /** MAC_ACT_TIME_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String macActTimeKbn;

    /**
     * @return MAC_ACT_TIME_KBN
     */
    public String getMacActTimeKbn() {
        return macActTimeKbn;
    }

    /**
     * @param p MAC_ACT_TIME_KBN
     */
    public void setMacActTimeKbn(final String p) {
        this.macActTimeKbn = p;
    }

    /** SUPPLY_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String supplyFlag;

    /**
     * @return SUPPLY_FLAG
     */
    public String getSupplyFlag() {
        return supplyFlag;
    }

    /**
     * @param p SUPPLY_FLAG
     */
    public void setSupplyFlag(final String p) {
        this.supplyFlag = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
