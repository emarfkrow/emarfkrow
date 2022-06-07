package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_HINBAN_BK
 *
 * @author emarfkrow
 */
public class MstHinbanBk implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YY")
    public String getYy() {
        return this.yy;
    }

    /**
     * @param o YY
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = String.valueOf(o.toString());
        } else {
            this.yy = null;
        }
    }

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN")
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o HINBAN
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** HINBAN_CODE */
    private String hinbanCode;

    /**
     * @return HINBAN_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN_CODE")
    public String getHinbanCode() {
        return this.hinbanCode;
    }

    /**
     * @param o HINBAN_CODE
     */
    public void setHinbanCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinbanCode = String.valueOf(o.toString());
        } else {
            this.hinbanCode = null;
        }
    }

    /** ITEM */
    private String item;

    /**
     * @return ITEM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ITEM")
    public String getItem() {
        return this.item;
    }

    /**
     * @param o ITEM
     */
    public void setItem(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.item = String.valueOf(o.toString());
        } else {
            this.item = null;
        }
    }

    /** ITEM_KBN */
    private java.math.BigDecimal itemKbn;

    /**
     * @return ITEM_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ITEM_KBN")
    public java.math.BigDecimal getItemKbn() {
        return this.itemKbn;
    }

    /**
     * @param o ITEM_KBN
     */
    public void setItemKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.itemKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.itemKbn = null;
        }
    }

    /** SHIKAKE_KBN */
    private String shikakeKbn;

    /**
     * @return SHIKAKE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHIKAKE_KBN")
    public String getShikakeKbn() {
        return this.shikakeKbn;
    }

    /**
     * @param o SHIKAKE_KBN
     */
    public void setShikakeKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shikakeKbn = String.valueOf(o.toString());
        } else {
            this.shikakeKbn = null;
        }
    }

    /** LOT_SIZE */
    private java.math.BigDecimal lotSize;

    /**
     * @return LOT_SIZE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOT_SIZE")
    public java.math.BigDecimal getLotSize() {
        return this.lotSize;
    }

    /**
     * @param o LOT_SIZE
     */
    public void setLotSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lotSize = new java.math.BigDecimal(o.toString());
        } else {
            this.lotSize = null;
        }
    }

    /** COUNTS */
    private java.math.BigDecimal counts;

    /**
     * @return COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COUNTS")
    public java.math.BigDecimal getCounts() {
        return this.counts;
    }

    /**
     * @param o COUNTS
     */
    public void setCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.counts = new java.math.BigDecimal(o.toString());
        } else {
            this.counts = null;
        }
    }

    /** UNIT_CODE */
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNIT_CODE")
    public String getUnitCode() {
        return this.unitCode;
    }

    /**
     * @param o UNIT_CODE
     */
    public void setUnitCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCode = String.valueOf(o.toString());
        } else {
            this.unitCode = null;
        }
    }

    /** ACCOUNT_CODE */
    private String accountCode;

    /**
     * @return ACCOUNT_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACCOUNT_CODE")
    public String getAccountCode() {
        return this.accountCode;
    }

    /**
     * @param o ACCOUNT_CODE
     */
    public void setAccountCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.accountCode = String.valueOf(o.toString());
        } else {
            this.accountCode = null;
        }
    }

    /** SUPPLY_CHANGE */
    private java.math.BigDecimal supplyChange;

    /**
     * @return SUPPLY_CHANGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUPPLY_CHANGE")
    public java.math.BigDecimal getSupplyChange() {
        return this.supplyChange;
    }

    /**
     * @param o SUPPLY_CHANGE
     */
    public void setSupplyChange(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyChange = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyChange = null;
        }
    }

    /** SUPPLY_PERMISSION */
    private java.math.BigDecimal supplyPermission;

    /**
     * @return SUPPLY_PERMISSION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUPPLY_PERMISSION")
    public java.math.BigDecimal getSupplyPermission() {
        return this.supplyPermission;
    }

    /**
     * @param o SUPPLY_PERMISSION
     */
    public void setSupplyPermission(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyPermission = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyPermission = null;
        }
    }

    /** OFF_POST_NO */
    private String offPostNo;

    /**
     * @return OFF_POST_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OFF_POST_NO")
    public String getOffPostNo() {
        return this.offPostNo;
    }

    /**
     * @param o OFF_POST_NO
     */
    public void setOffPostNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.offPostNo = String.valueOf(o.toString());
        } else {
            this.offPostNo = null;
        }
    }

    /** ISUUE_POST_NO */
    private String isuuePostNo;

    /**
     * @return ISUUE_POST_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ISUUE_POST_NO")
    public String getIsuuePostNo() {
        return this.isuuePostNo;
    }

    /**
     * @param o ISUUE_POST_NO
     */
    public void setIsuuePostNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.isuuePostNo = String.valueOf(o.toString());
        } else {
            this.isuuePostNo = null;
        }
    }

    /** STORE_NO */
    private String storeNo;

    /**
     * @return STORE_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STORE_NO")
    public String getStoreNo() {
        return this.storeNo;
    }

    /**
     * @param o STORE_NO
     */
    public void setStoreNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.storeNo = String.valueOf(o.toString());
        } else {
            this.storeNo = null;
        }
    }

    /** STOCKS_KIND_KBN */
    private java.math.BigDecimal stocksKindKbn;

    /**
     * @return STOCKS_KIND_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STOCKS_KIND_KBN")
    public java.math.BigDecimal getStocksKindKbn() {
        return this.stocksKindKbn;
    }

    /**
     * @param o STOCKS_KIND_KBN
     */
    public void setStocksKindKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stocksKindKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.stocksKindKbn = null;
        }
    }

    /** HINGUN_KBN */
    private java.math.BigDecimal hingunKbn;

    /**
     * @return HINGUN_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINGUN_KBN")
    public java.math.BigDecimal getHingunKbn() {
        return this.hingunKbn;
    }

    /**
     * @param o HINGUN_KBN
     */
    public void setHingunKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hingunKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.hingunKbn = null;
        }
    }

    /** ELEC_INV_CONTROL */
    private java.math.BigDecimal elecInvControl;

    /**
     * @return ELEC_INV_CONTROL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ELEC_INV_CONTROL")
    public java.math.BigDecimal getElecInvControl() {
        return this.elecInvControl;
    }

    /**
     * @param o ELEC_INV_CONTROL
     */
    public void setElecInvControl(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.elecInvControl = new java.math.BigDecimal(o.toString());
        } else {
            this.elecInvControl = null;
        }
    }

    /** REST_ARTICLE_KBN */
    private java.math.BigDecimal restArticleKbn;

    /**
     * @return REST_ARTICLE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REST_ARTICLE_KBN")
    public java.math.BigDecimal getRestArticleKbn() {
        return this.restArticleKbn;
    }

    /**
     * @param o REST_ARTICLE_KBN
     */
    public void setRestArticleKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.restArticleKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.restArticleKbn = null;
        }
    }

    /** REST_ARTICLE_MAX */
    private java.math.BigDecimal restArticleMax;

    /**
     * @return REST_ARTICLE_MAX
     */
    @com.fasterxml.jackson.annotation.JsonProperty("REST_ARTICLE_MAX")
    public java.math.BigDecimal getRestArticleMax() {
        return this.restArticleMax;
    }

    /**
     * @param o REST_ARTICLE_MAX
     */
    public void setRestArticleMax(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.restArticleMax = new java.math.BigDecimal(o.toString());
        } else {
            this.restArticleMax = null;
        }
    }

    /** COST_AMOUNT_KBN */
    private java.math.BigDecimal costAmountKbn;

    /**
     * @return COST_AMOUNT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COST_AMOUNT_KBN")
    public java.math.BigDecimal getCostAmountKbn() {
        return this.costAmountKbn;
    }

    /**
     * @param o COST_AMOUNT_KBN
     */
    public void setCostAmountKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costAmountKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.costAmountKbn = null;
        }
    }

    /** F_COST_AMOUNT_KBN */
    private java.math.BigDecimal fCostAmountKbn;

    /**
     * @return F_COST_AMOUNT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("F_COST_AMOUNT_KBN")
    public java.math.BigDecimal getFCostAmountKbn() {
        return this.fCostAmountKbn;
    }

    /**
     * @param o F_COST_AMOUNT_KBN
     */
    public void setFCostAmountKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fCostAmountKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.fCostAmountKbn = null;
        }
    }

    /** S_COST_AMOUNT_KBN */
    private java.math.BigDecimal sCostAmountKbn;

    /**
     * @return S_COST_AMOUNT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("S_COST_AMOUNT_KBN")
    public java.math.BigDecimal getSCostAmountKbn() {
        return this.sCostAmountKbn;
    }

    /**
     * @param o S_COST_AMOUNT_KBN
     */
    public void setSCostAmountKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sCostAmountKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.sCostAmountKbn = null;
        }
    }

    /** HINBAN_OPE_CODE */
    private String hinbanOpeCode;

    /**
     * @return HINBAN_OPE_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN_OPE_CODE")
    public String getHinbanOpeCode() {
        return this.hinbanOpeCode;
    }

    /**
     * @param o HINBAN_OPE_CODE
     */
    public void setHinbanOpeCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinbanOpeCode = String.valueOf(o.toString());
        } else {
            this.hinbanOpeCode = null;
        }
    }

    /** PERMISSION_FLAG */
    private java.math.BigDecimal permissionFlag;

    /**
     * @return PERMISSION_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PERMISSION_FLAG")
    public java.math.BigDecimal getPermissionFlag() {
        return this.permissionFlag;
    }

    /**
     * @param o PERMISSION_FLAG
     */
    public void setPermissionFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.permissionFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.permissionFlag = null;
        }
    }

    /** VERSION */
    private String version;

    /**
     * @return VERSION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("VERSION")
    public String getVersion() {
        return this.version;
    }

    /**
     * @param o VERSION
     */
    public void setVersion(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.version = String.valueOf(o.toString());
        } else {
            this.version = null;
        }
    }

    /** PLAN_CODE */
    private String planCode;

    /**
     * @return PLAN_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PLAN_CODE")
    public String getPlanCode() {
        return this.planCode;
    }

    /**
     * @param o PLAN_CODE
     */
    public void setPlanCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.planCode = String.valueOf(o.toString());
        } else {
            this.planCode = null;
        }
    }

    /** POISON_KBN */
    private java.math.BigDecimal poisonKbn;

    /**
     * @return POISON_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("POISON_KBN")
    public java.math.BigDecimal getPoisonKbn() {
        return this.poisonKbn;
    }

    /**
     * @param o POISON_KBN
     */
    public void setPoisonKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.poisonKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.poisonKbn = null;
        }
    }

    /** MATERIAL */
    private String material;

    /**
     * @return MATERIAL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MATERIAL")
    public String getMaterial() {
        return this.material;
    }

    /**
     * @param o MATERIAL
     */
    public void setMaterial(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.material = String.valueOf(o.toString());
        } else {
            this.material = null;
        }
    }

    /** MATERIAL_SIZE */
    private String materialSize;

    /**
     * @return MATERIAL_SIZE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MATERIAL_SIZE")
    public String getMaterialSize() {
        return this.materialSize;
    }

    /**
     * @param o MATERIAL_SIZE
     */
    public void setMaterialSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.materialSize = String.valueOf(o.toString());
        } else {
            this.materialSize = null;
        }
    }

    /** MAKER */
    private String maker;

    /**
     * @return MAKER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAKER")
    public String getMaker() {
        return this.maker;
    }

    /**
     * @param o MAKER
     */
    public void setMaker(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.maker = String.valueOf(o.toString());
        } else {
            this.maker = null;
        }
    }

    /** MATERIAL_RECYCLE */
    private String materialRecycle;

    /**
     * @return MATERIAL_RECYCLE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MATERIAL_RECYCLE")
    public String getMaterialRecycle() {
        return this.materialRecycle;
    }

    /**
     * @param o MATERIAL_RECYCLE
     */
    public void setMaterialRecycle(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.materialRecycle = String.valueOf(o.toString());
        } else {
            this.materialRecycle = null;
        }
    }

    /** MAKER_SIMUKE */
    private java.math.BigDecimal makerSimuke;

    /**
     * @return MAKER_SIMUKE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAKER_SIMUKE")
    public java.math.BigDecimal getMakerSimuke() {
        return this.makerSimuke;
    }

    /**
     * @param o MAKER_SIMUKE
     */
    public void setMakerSimuke(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.makerSimuke = new java.math.BigDecimal(o.toString());
        } else {
            this.makerSimuke = null;
        }
    }

    /** MAKER_WEIGHT */
    private java.math.BigDecimal makerWeight;

    /**
     * @return MAKER_WEIGHT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAKER_WEIGHT")
    public java.math.BigDecimal getMakerWeight() {
        return this.makerWeight;
    }

    /**
     * @param o MAKER_WEIGHT
     */
    public void setMakerWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.makerWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.makerWeight = null;
        }
    }

    /** ACT_INV_FIRST */
    private java.math.BigDecimal actInvFirst;

    /**
     * @return ACT_INV_FIRST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_INV_FIRST")
    public java.math.BigDecimal getActInvFirst() {
        return this.actInvFirst;
    }

    /**
     * @param o ACT_INV_FIRST
     */
    public void setActInvFirst(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actInvFirst = new java.math.BigDecimal(o.toString());
        } else {
            this.actInvFirst = null;
        }
    }

    /** ACT_INV_LAST */
    private java.math.BigDecimal actInvLast;

    /**
     * @return ACT_INV_LAST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ACT_INV_LAST")
    public java.math.BigDecimal getActInvLast() {
        return this.actInvLast;
    }

    /**
     * @param o ACT_INV_LAST
     */
    public void setActInvLast(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.actInvLast = new java.math.BigDecimal(o.toString());
        } else {
            this.actInvLast = null;
        }
    }

    /** SUP_UNIT */
    private java.math.BigDecimal supUnit;

    /**
     * @return SUP_UNIT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_UNIT")
    public java.math.BigDecimal getSupUnit() {
        return this.supUnit;
    }

    /**
     * @param o SUP_UNIT
     */
    public void setSupUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.supUnit = null;
        }
    }

    /** ROUTING_DEF_GROUP */
    private java.math.BigDecimal routingDefGroup;

    /**
     * @return ROUTING_DEF_GROUP
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROUTING_DEF_GROUP")
    public java.math.BigDecimal getRoutingDefGroup() {
        return this.routingDefGroup;
    }

    /**
     * @param o ROUTING_DEF_GROUP
     */
    public void setRoutingDefGroup(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.routingDefGroup = new java.math.BigDecimal(o.toString());
        } else {
            this.routingDefGroup = null;
        }
    }

    /** COST_CALCULATE_GROUP */
    private java.math.BigDecimal costCalculateGroup;

    /**
     * @return COST_CALCULATE_GROUP
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COST_CALCULATE_GROUP")
    public java.math.BigDecimal getCostCalculateGroup() {
        return this.costCalculateGroup;
    }

    /**
     * @param o COST_CALCULATE_GROUP
     */
    public void setCostCalculateGroup(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.costCalculateGroup = new java.math.BigDecimal(o.toString());
        } else {
            this.costCalculateGroup = null;
        }
    }

    /** KBN1 */
    private String kbn1;

    /**
     * @return KBN1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN1")
    public String getKbn1() {
        return this.kbn1;
    }

    /**
     * @param o KBN1
     */
    public void setKbn1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kbn1 = String.valueOf(o.toString());
        } else {
            this.kbn1 = null;
        }
    }

    /** KBN2 */
    private String kbn2;

    /**
     * @return KBN2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN2")
    public String getKbn2() {
        return this.kbn2;
    }

    /**
     * @param o KBN2
     */
    public void setKbn2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kbn2 = String.valueOf(o.toString());
        } else {
            this.kbn2 = null;
        }
    }

    /** KBN3 */
    private String kbn3;

    /**
     * @return KBN3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN3")
    public String getKbn3() {
        return this.kbn3;
    }

    /**
     * @param o KBN3
     */
    public void setKbn3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kbn3 = String.valueOf(o.toString());
        } else {
            this.kbn3 = null;
        }
    }

    /** STOCK_STATUS */
    private String stockStatus;

    /**
     * @return STOCK_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STOCK_STATUS")
    public String getStockStatus() {
        return this.stockStatus;
    }

    /**
     * @param o STOCK_STATUS
     */
    public void setStockStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stockStatus = String.valueOf(o.toString());
        } else {
            this.stockStatus = null;
        }
    }

    /** STOCK_STATUS_DATE */
    private String stockStatusDate;

    /**
     * @return STOCK_STATUS_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STOCK_STATUS_DATE")
    public String getStockStatusDate() {
        return this.stockStatusDate;
    }

    /**
     * @param o STOCK_STATUS_DATE
     */
    public void setStockStatusDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stockStatusDate = String.valueOf(o.toString());
        } else {
            this.stockStatusDate = null;
        }
    }

    /** PRINT_STRUCTURE_FLG */
    private java.math.BigDecimal printStructureFlg;

    /**
     * @return PRINT_STRUCTURE_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRINT_STRUCTURE_FLG")
    public java.math.BigDecimal getPrintStructureFlg() {
        return this.printStructureFlg;
    }

    /**
     * @param o PRINT_STRUCTURE_FLG
     */
    public void setPrintStructureFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printStructureFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.printStructureFlg = null;
        }
    }

    /** PRINT_WORK_FLOW_FLG */
    private java.math.BigDecimal printWorkFlowFlg;

    /**
     * @return PRINT_WORK_FLOW_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRINT_WORK_FLOW_FLG")
    public java.math.BigDecimal getPrintWorkFlowFlg() {
        return this.printWorkFlowFlg;
    }

    /**
     * @param o PRINT_WORK_FLOW_FLG
     */
    public void setPrintWorkFlowFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printWorkFlowFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.printWorkFlowFlg = null;
        }
    }

    /** PRINT_WORK_RESULT_FLG */
    private java.math.BigDecimal printWorkResultFlg;

    /**
     * @return PRINT_WORK_RESULT_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRINT_WORK_RESULT_FLG")
    public java.math.BigDecimal getPrintWorkResultFlg() {
        return this.printWorkResultFlg;
    }

    /**
     * @param o PRINT_WORK_RESULT_FLG
     */
    public void setPrintWorkResultFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printWorkResultFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.printWorkResultFlg = null;
        }
    }

    /** PRINT_SHIP_SHEET_FLG */
    private java.math.BigDecimal printShipSheetFlg;

    /**
     * @return PRINT_SHIP_SHEET_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRINT_SHIP_SHEET_FLG")
    public java.math.BigDecimal getPrintShipSheetFlg() {
        return this.printShipSheetFlg;
    }

    /**
     * @param o PRINT_SHIP_SHEET_FLG
     */
    public void setPrintShipSheetFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printShipSheetFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.printShipSheetFlg = null;
        }
    }

    /** PRINT_INSPECT_FLG */
    private java.math.BigDecimal printInspectFlg;

    /**
     * @return PRINT_INSPECT_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRINT_INSPECT_FLG")
    public java.math.BigDecimal getPrintInspectFlg() {
        return this.printInspectFlg;
    }

    /**
     * @param o PRINT_INSPECT_FLG
     */
    public void setPrintInspectFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printInspectFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.printInspectFlg = null;
        }
    }

    /** PRINT_PRODUCT_BOX_FLG */
    private java.math.BigDecimal printProductBoxFlg;

    /**
     * @return PRINT_PRODUCT_BOX_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRINT_PRODUCT_BOX_FLG")
    public java.math.BigDecimal getPrintProductBoxFlg() {
        return this.printProductBoxFlg;
    }

    /**
     * @param o PRINT_PRODUCT_BOX_FLG
     */
    public void setPrintProductBoxFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printProductBoxFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.printProductBoxFlg = null;
        }
    }

    /** PRINT_HINBAN_STRUCT_FLG */
    private java.math.BigDecimal printHinbanStructFlg;

    /**
     * @return PRINT_HINBAN_STRUCT_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRINT_HINBAN_STRUCT_FLG")
    public java.math.BigDecimal getPrintHinbanStructFlg() {
        return this.printHinbanStructFlg;
    }

    /**
     * @param o PRINT_HINBAN_STRUCT_FLG
     */
    public void setPrintHinbanStructFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.printHinbanStructFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.printHinbanStructFlg = null;
        }
    }

    /** SEMI_PRODUCT_FLG */
    private java.math.BigDecimal semiProductFlg;

    /**
     * @return SEMI_PRODUCT_FLG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SEMI_PRODUCT_FLG")
    public java.math.BigDecimal getSemiProductFlg() {
        return this.semiProductFlg;
    }

    /**
     * @param o SEMI_PRODUCT_FLG
     */
    public void setSemiProductFlg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.semiProductFlg = new java.math.BigDecimal(o.toString());
        } else {
            this.semiProductFlg = null;
        }
    }

    /** STOCK_MANAGEMENT_SECTION */
    private java.math.BigDecimal stockManagementSection;

    /**
     * @return STOCK_MANAGEMENT_SECTION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STOCK_MANAGEMENT_SECTION")
    public java.math.BigDecimal getStockManagementSection() {
        return this.stockManagementSection;
    }

    /**
     * @param o STOCK_MANAGEMENT_SECTION
     */
    public void setStockManagementSection(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stockManagementSection = new java.math.BigDecimal(o.toString());
        } else {
            this.stockManagementSection = null;
        }
    }

    /** TIME_STAMP_CREATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampCreate;

    /**
     * @return TIME_STAMP_CREATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CREATE")
    public java.time.LocalDateTime getTimeStampCreate() {
        return this.timeStampCreate;
    }

    /**
     * @param o TIME_STAMP_CREATE
     */
    public void setTimeStampCreate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampCreate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampCreate = null;
        }
    }

    /** TIME_STAMP_CHANGE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampChange;

    /**
     * @return TIME_STAMP_CHANGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CHANGE")
    public java.time.LocalDateTime getTimeStampChange() {
        return this.timeStampChange;
    }

    /**
     * @param o TIME_STAMP_CHANGE
     */
    public void setTimeStampChange(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampChange = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampChange = null;
        }
    }

    /** USER_ID_CREATE */
    private String userIdCreate;

    /**
     * @return USER_ID_CREATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CREATE")
    public String getUserIdCreate() {
        return this.userIdCreate;
    }

    /**
     * @param o USER_ID_CREATE
     */
    public void setUserIdCreate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdCreate = String.valueOf(o.toString());
        } else {
            this.userIdCreate = null;
        }
    }

    /** USER_ID_CHANGE */
    private String userIdChange;

    /**
     * @return USER_ID_CHANGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CHANGE")
    public String getUserIdChange() {
        return this.userIdChange;
    }

    /**
     * @param o USER_ID_CHANGE
     */
    public void setUserIdChange(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdChange = String.valueOf(o.toString());
        } else {
            this.userIdChange = null;
        }
    }

    /** TOTAL_LT */
    private java.math.BigDecimal totalLt;

    /**
     * @return TOTAL_LT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOTAL_LT")
    public java.math.BigDecimal getTotalLt() {
        return this.totalLt;
    }

    /**
     * @param o TOTAL_LT
     */
    public void setTotalLt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.totalLt = new java.math.BigDecimal(o.toString());
        } else {
            this.totalLt = null;
        }
    }

    /** COMPANY_DIV_CODE */
    private String companyDivCode;

    /**
     * @return COMPANY_DIV_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMPANY_DIV_CODE")
    public String getCompanyDivCode() {
        return this.companyDivCode;
    }

    /**
     * @param o COMPANY_DIV_CODE
     */
    public void setCompanyDivCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.companyDivCode = String.valueOf(o.toString());
        } else {
            this.companyDivCode = null;
        }
    }

    /** KBN4 */
    private String kbn4;

    /**
     * @return KBN4
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN4")
    public String getKbn4() {
        return this.kbn4;
    }

    /**
     * @param o KBN4
     */
    public void setKbn4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kbn4 = String.valueOf(o.toString());
        } else {
            this.kbn4 = null;
        }
    }

    /** KBN5 */
    private String kbn5;

    /**
     * @return KBN5
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN5")
    public String getKbn5() {
        return this.kbn5;
    }

    /**
     * @param o KBN5
     */
    public void setKbn5(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kbn5 = String.valueOf(o.toString());
        } else {
            this.kbn5 = null;
        }
    }

    /** KBN6 */
    private String kbn6;

    /**
     * @return KBN6
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KBN6")
    public String getKbn6() {
        return this.kbn6;
    }

    /**
     * @param o KBN6
     */
    public void setKbn6(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kbn6 = String.valueOf(o.toString());
        } else {
            this.kbn6 = null;
        }
    }

    /** ROHS */
    private java.math.BigDecimal rohs;

    /**
     * @return ROHS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ROHS")
    public java.math.BigDecimal getRohs() {
        return this.rohs;
    }

    /**
     * @param o ROHS
     */
    public void setRohs(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rohs = new java.math.BigDecimal(o.toString());
        } else {
            this.rohs = null;
        }
    }

    /** TANTAI_LT */
    private java.math.BigDecimal tantaiLt;

    /**
     * @return TANTAI_LT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TANTAI_LT")
    public java.math.BigDecimal getTantaiLt() {
        return this.tantaiLt;
    }

    /**
     * @param o TANTAI_LT
     */
    public void setTantaiLt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tantaiLt = new java.math.BigDecimal(o.toString());
        } else {
            this.tantaiLt = null;
        }
    }

    /** TSUKESU */
    private java.math.BigDecimal tsukesu;

    /**
     * @return TSUKESU
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TSUKESU")
    public java.math.BigDecimal getTsukesu() {
        return this.tsukesu;
    }

    /**
     * @param o TSUKESU
     */
    public void setTsukesu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tsukesu = new java.math.BigDecimal(o.toString());
        } else {
            this.tsukesu = null;
        }
    }

    /** EX_TAX_RATE */
    private java.math.BigDecimal exTaxRate;

    /**
     * @return EX_TAX_RATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EX_TAX_RATE")
    public java.math.BigDecimal getExTaxRate() {
        return this.exTaxRate;
    }

    /**
     * @param o EX_TAX_RATE
     */
    public void setExTaxRate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.exTaxRate = new java.math.BigDecimal(o.toString());
        } else {
            this.exTaxRate = null;
        }
    }

    /** MEMO */
    private String memo;

    /**
     * @return MEMO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MEMO")
    public String getMemo() {
        return this.memo;
    }

    /**
     * @param o MEMO
     */
    public void setMemo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.memo = String.valueOf(o.toString());
        } else {
            this.memo = null;
        }
    }

    /** HAIBAN_KBN */
    private String haibanKbn;

    /**
     * @return HAIBAN_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HAIBAN_KBN")
    public String getHaibanKbn() {
        return this.haibanKbn;
    }

    /**
     * @param o HAIBAN_KBN
     */
    public void setHaibanKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.haibanKbn = String.valueOf(o.toString());
        } else {
            this.haibanKbn = null;
        }
    }

    /** HAIBAN_YM */
    private String haibanYm;

    /**
     * @return HAIBAN_YM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HAIBAN_YM")
    public String getHaibanYm() {
        return this.haibanYm;
    }

    /**
     * @param o HAIBAN_YM
     */
    public void setHaibanYm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.haibanYm = String.valueOf(o.toString());
        } else {
            this.haibanYm = null;
        }
    }

    /**
     * MST_HINBAN_BK照会
     *
     * @param param1 HINBAN
     * @param param2 YY
     * @return MST_HINBAN_BK
     */
    public static MstHinbanBk get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM MST_HINBAN_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("yy", param2);

        return Queries.get(sql, params, MstHinbanBk.class);
    }

    /**
     * MST_HINBAN_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MST_HINBAN_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"HINBAN_CODE\" -- :hinban_code");
        nameList.add("\"ITEM\" -- :item");
        nameList.add("\"ITEM_KBN\" -- :item_kbn");
        nameList.add("\"SHIKAKE_KBN\" -- :shikake_kbn");
        nameList.add("\"LOT_SIZE\" -- :lot_size");
        nameList.add("\"COUNTS\" -- :counts");
        nameList.add("\"UNIT_CODE\" -- :unit_code");
        nameList.add("\"ACCOUNT_CODE\" -- :account_code");
        nameList.add("\"SUPPLY_CHANGE\" -- :supply_change");
        nameList.add("\"SUPPLY_PERMISSION\" -- :supply_permission");
        nameList.add("\"OFF_POST_NO\" -- :off_post_no");
        nameList.add("\"ISUUE_POST_NO\" -- :isuue_post_no");
        nameList.add("\"STORE_NO\" -- :store_no");
        nameList.add("\"STOCKS_KIND_KBN\" -- :stocks_kind_kbn");
        nameList.add("\"HINGUN_KBN\" -- :hingun_kbn");
        nameList.add("\"ELEC_INV_CONTROL\" -- :elec_inv_control");
        nameList.add("\"REST_ARTICLE_KBN\" -- :rest_article_kbn");
        nameList.add("\"REST_ARTICLE_MAX\" -- :rest_article_max");
        nameList.add("\"COST_AMOUNT_KBN\" -- :cost_amount_kbn");
        nameList.add("\"F_COST_AMOUNT_KBN\" -- :f_cost_amount_kbn");
        nameList.add("\"S_COST_AMOUNT_KBN\" -- :s_cost_amount_kbn");
        nameList.add("\"HINBAN_OPE_CODE\" -- :hinban_ope_code");
        nameList.add("\"PERMISSION_FLAG\" -- :permission_flag");
        nameList.add("\"VERSION\" -- :version");
        nameList.add("\"PLAN_CODE\" -- :plan_code");
        nameList.add("\"POISON_KBN\" -- :poison_kbn");
        nameList.add("\"MATERIAL\" -- :material");
        nameList.add("\"MATERIAL_SIZE\" -- :material_size");
        nameList.add("\"MAKER\" -- :maker");
        nameList.add("\"MATERIAL_RECYCLE\" -- :material_recycle");
        nameList.add("\"MAKER_SIMUKE\" -- :maker_simuke");
        nameList.add("\"MAKER_WEIGHT\" -- :maker_weight");
        nameList.add("\"ACT_INV_FIRST\" -- :act_inv_first");
        nameList.add("\"ACT_INV_LAST\" -- :act_inv_last");
        nameList.add("\"SUP_UNIT\" -- :sup_unit");
        nameList.add("\"ROUTING_DEF_GROUP\" -- :routing_def_group");
        nameList.add("\"COST_CALCULATE_GROUP\" -- :cost_calculate_group");
        nameList.add("\"KBN1\" -- :kbn1");
        nameList.add("\"KBN2\" -- :kbn2");
        nameList.add("\"KBN3\" -- :kbn3");
        nameList.add("\"STOCK_STATUS\" -- :stock_status");
        nameList.add("\"STOCK_STATUS_DATE\" -- :stock_status_date");
        nameList.add("\"PRINT_STRUCTURE_FLG\" -- :print_structure_flg");
        nameList.add("\"PRINT_WORK_FLOW_FLG\" -- :print_work_flow_flg");
        nameList.add("\"PRINT_WORK_RESULT_FLG\" -- :print_work_result_flg");
        nameList.add("\"PRINT_SHIP_SHEET_FLG\" -- :print_ship_sheet_flg");
        nameList.add("\"PRINT_INSPECT_FLG\" -- :print_inspect_flg");
        nameList.add("\"PRINT_PRODUCT_BOX_FLG\" -- :print_product_box_flg");
        nameList.add("\"PRINT_HINBAN_STRUCT_FLG\" -- :print_hinban_struct_flg");
        nameList.add("\"SEMI_PRODUCT_FLG\" -- :semi_product_flg");
        nameList.add("\"STOCK_MANAGEMENT_SECTION\" -- :stock_management_section");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"TOTAL_LT\" -- :total_lt");
        nameList.add("\"COMPANY_DIV_CODE\" -- :company_div_code");
        nameList.add("\"KBN4\" -- :kbn4");
        nameList.add("\"KBN5\" -- :kbn5");
        nameList.add("\"KBN6\" -- :kbn6");
        nameList.add("\"ROHS\" -- :rohs");
        nameList.add("\"TANTAI_LT\" -- :tantai_lt");
        nameList.add("\"TSUKESU\" -- :tsukesu");
        nameList.add("\"EX_TAX_RATE\" -- :ex_tax_rate");
        nameList.add("\"MEMO\" -- :memo");
        nameList.add("\"HAIBAN_KBN\" -- :haiban_kbn");
        nameList.add("\"HAIBAN_YM\" -- :haiban_ym");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_HINBAN_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":hinban");
        valueList.add(":hinban_code");
        valueList.add(":item");
        valueList.add(":item_kbn");
        valueList.add(":shikake_kbn");
        valueList.add(":lot_size");
        valueList.add(":counts");
        valueList.add(":unit_code");
        valueList.add(":account_code");
        valueList.add(":supply_change");
        valueList.add(":supply_permission");
        valueList.add(":off_post_no");
        valueList.add(":isuue_post_no");
        valueList.add(":store_no");
        valueList.add(":stocks_kind_kbn");
        valueList.add(":hingun_kbn");
        valueList.add(":elec_inv_control");
        valueList.add(":rest_article_kbn");
        valueList.add(":rest_article_max");
        valueList.add(":cost_amount_kbn");
        valueList.add(":f_cost_amount_kbn");
        valueList.add(":s_cost_amount_kbn");
        valueList.add(":hinban_ope_code");
        valueList.add(":permission_flag");
        valueList.add(":version");
        valueList.add(":plan_code");
        valueList.add(":poison_kbn");
        valueList.add(":material");
        valueList.add(":material_size");
        valueList.add(":maker");
        valueList.add(":material_recycle");
        valueList.add(":maker_simuke");
        valueList.add(":maker_weight");
        valueList.add(":act_inv_first");
        valueList.add(":act_inv_last");
        valueList.add(":sup_unit");
        valueList.add(":routing_def_group");
        valueList.add(":cost_calculate_group");
        valueList.add(":kbn1");
        valueList.add(":kbn2");
        valueList.add(":kbn3");
        valueList.add(":stock_status");
        valueList.add(":stock_status_date");
        valueList.add(":print_structure_flg");
        valueList.add(":print_work_flow_flg");
        valueList.add(":print_work_result_flg");
        valueList.add(":print_ship_sheet_flg");
        valueList.add(":print_inspect_flg");
        valueList.add(":print_product_box_flg");
        valueList.add(":print_hinban_struct_flg");
        valueList.add(":semi_product_flg");
        valueList.add(":stock_management_section");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":total_lt");
        valueList.add(":company_div_code");
        valueList.add(":kbn4");
        valueList.add(":kbn5");
        valueList.add(":kbn6");
        valueList.add(":rohs");
        valueList.add(":tantai_lt");
        valueList.add(":tsukesu");
        valueList.add(":ex_tax_rate");
        valueList.add(":memo");
        valueList.add(":haiban_kbn");
        valueList.add(":haiban_ym");
        return String.join("\r\n    , ", valueList);
    }

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"YY\") IS NULL THEN 0 ELSE MAX(e.\"YY\") * 1 END + 1, 4, '0') AS \"YY\" FROM MST_HINBAN_BK e WHERE e.\"YY\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"HINBAN\" = :hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hinban", this.hinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * MST_HINBAN_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_HINBAN_BKの登録
        String sql = "UPDATE MST_HINBAN_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"HINBAN_CODE\" = :hinban_code");
        setList.add("\"ITEM\" = :item");
        setList.add("\"ITEM_KBN\" = :item_kbn");
        setList.add("\"SHIKAKE_KBN\" = :shikake_kbn");
        setList.add("\"LOT_SIZE\" = :lot_size");
        setList.add("\"COUNTS\" = :counts");
        setList.add("\"UNIT_CODE\" = :unit_code");
        setList.add("\"ACCOUNT_CODE\" = :account_code");
        setList.add("\"SUPPLY_CHANGE\" = :supply_change");
        setList.add("\"SUPPLY_PERMISSION\" = :supply_permission");
        setList.add("\"OFF_POST_NO\" = :off_post_no");
        setList.add("\"ISUUE_POST_NO\" = :isuue_post_no");
        setList.add("\"STORE_NO\" = :store_no");
        setList.add("\"STOCKS_KIND_KBN\" = :stocks_kind_kbn");
        setList.add("\"HINGUN_KBN\" = :hingun_kbn");
        setList.add("\"ELEC_INV_CONTROL\" = :elec_inv_control");
        setList.add("\"REST_ARTICLE_KBN\" = :rest_article_kbn");
        setList.add("\"REST_ARTICLE_MAX\" = :rest_article_max");
        setList.add("\"COST_AMOUNT_KBN\" = :cost_amount_kbn");
        setList.add("\"F_COST_AMOUNT_KBN\" = :f_cost_amount_kbn");
        setList.add("\"S_COST_AMOUNT_KBN\" = :s_cost_amount_kbn");
        setList.add("\"HINBAN_OPE_CODE\" = :hinban_ope_code");
        setList.add("\"PERMISSION_FLAG\" = :permission_flag");
        setList.add("\"VERSION\" = :version");
        setList.add("\"PLAN_CODE\" = :plan_code");
        setList.add("\"POISON_KBN\" = :poison_kbn");
        setList.add("\"MATERIAL\" = :material");
        setList.add("\"MATERIAL_SIZE\" = :material_size");
        setList.add("\"MAKER\" = :maker");
        setList.add("\"MATERIAL_RECYCLE\" = :material_recycle");
        setList.add("\"MAKER_SIMUKE\" = :maker_simuke");
        setList.add("\"MAKER_WEIGHT\" = :maker_weight");
        setList.add("\"ACT_INV_FIRST\" = :act_inv_first");
        setList.add("\"ACT_INV_LAST\" = :act_inv_last");
        setList.add("\"SUP_UNIT\" = :sup_unit");
        setList.add("\"ROUTING_DEF_GROUP\" = :routing_def_group");
        setList.add("\"COST_CALCULATE_GROUP\" = :cost_calculate_group");
        setList.add("\"KBN1\" = :kbn1");
        setList.add("\"KBN2\" = :kbn2");
        setList.add("\"KBN3\" = :kbn3");
        setList.add("\"STOCK_STATUS\" = :stock_status");
        setList.add("\"STOCK_STATUS_DATE\" = :stock_status_date");
        setList.add("\"PRINT_STRUCTURE_FLG\" = :print_structure_flg");
        setList.add("\"PRINT_WORK_FLOW_FLG\" = :print_work_flow_flg");
        setList.add("\"PRINT_WORK_RESULT_FLG\" = :print_work_result_flg");
        setList.add("\"PRINT_SHIP_SHEET_FLG\" = :print_ship_sheet_flg");
        setList.add("\"PRINT_INSPECT_FLG\" = :print_inspect_flg");
        setList.add("\"PRINT_PRODUCT_BOX_FLG\" = :print_product_box_flg");
        setList.add("\"PRINT_HINBAN_STRUCT_FLG\" = :print_hinban_struct_flg");
        setList.add("\"SEMI_PRODUCT_FLG\" = :semi_product_flg");
        setList.add("\"STOCK_MANAGEMENT_SECTION\" = :stock_management_section");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"TOTAL_LT\" = :total_lt");
        setList.add("\"COMPANY_DIV_CODE\" = :company_div_code");
        setList.add("\"KBN4\" = :kbn4");
        setList.add("\"KBN5\" = :kbn5");
        setList.add("\"KBN6\" = :kbn6");
        setList.add("\"ROHS\" = :rohs");
        setList.add("\"TANTAI_LT\" = :tantai_lt");
        setList.add("\"TSUKESU\" = :tsukesu");
        setList.add("\"EX_TAX_RATE\" = :ex_tax_rate");
        setList.add("\"MEMO\" = :memo");
        setList.add("\"HAIBAN_KBN\" = :haiban_kbn");
        setList.add("\"HAIBAN_YM\" = :haiban_ym");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_HINBAN_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_HINBAN_BKの削除
        String sql = "DELETE FROM MST_HINBAN_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("hinban", this.hinban);
        params.put("hinban_code", this.hinbanCode);
        params.put("item", this.item);
        params.put("item_kbn", this.itemKbn);
        params.put("shikake_kbn", this.shikakeKbn);
        params.put("lot_size", this.lotSize);
        params.put("counts", this.counts);
        params.put("unit_code", this.unitCode);
        params.put("account_code", this.accountCode);
        params.put("supply_change", this.supplyChange);
        params.put("supply_permission", this.supplyPermission);
        params.put("off_post_no", this.offPostNo);
        params.put("isuue_post_no", this.isuuePostNo);
        params.put("store_no", this.storeNo);
        params.put("stocks_kind_kbn", this.stocksKindKbn);
        params.put("hingun_kbn", this.hingunKbn);
        params.put("elec_inv_control", this.elecInvControl);
        params.put("rest_article_kbn", this.restArticleKbn);
        params.put("rest_article_max", this.restArticleMax);
        params.put("cost_amount_kbn", this.costAmountKbn);
        params.put("f_cost_amount_kbn", this.fCostAmountKbn);
        params.put("s_cost_amount_kbn", this.sCostAmountKbn);
        params.put("hinban_ope_code", this.hinbanOpeCode);
        params.put("permission_flag", this.permissionFlag);
        params.put("version", this.version);
        params.put("plan_code", this.planCode);
        params.put("poison_kbn", this.poisonKbn);
        params.put("material", this.material);
        params.put("material_size", this.materialSize);
        params.put("maker", this.maker);
        params.put("material_recycle", this.materialRecycle);
        params.put("maker_simuke", this.makerSimuke);
        params.put("maker_weight", this.makerWeight);
        params.put("act_inv_first", this.actInvFirst);
        params.put("act_inv_last", this.actInvLast);
        params.put("sup_unit", this.supUnit);
        params.put("routing_def_group", this.routingDefGroup);
        params.put("cost_calculate_group", this.costCalculateGroup);
        params.put("kbn1", this.kbn1);
        params.put("kbn2", this.kbn2);
        params.put("kbn3", this.kbn3);
        params.put("stock_status", this.stockStatus);
        params.put("stock_status_date", this.stockStatusDate);
        params.put("print_structure_flg", this.printStructureFlg);
        params.put("print_work_flow_flg", this.printWorkFlowFlg);
        params.put("print_work_result_flg", this.printWorkResultFlg);
        params.put("print_ship_sheet_flg", this.printShipSheetFlg);
        params.put("print_inspect_flg", this.printInspectFlg);
        params.put("print_product_box_flg", this.printProductBoxFlg);
        params.put("print_hinban_struct_flg", this.printHinbanStructFlg);
        params.put("semi_product_flg", this.semiProductFlg);
        params.put("stock_management_section", this.stockManagementSection);
        params.put("total_lt", this.totalLt);
        params.put("company_div_code", this.companyDivCode);
        params.put("kbn4", this.kbn4);
        params.put("kbn5", this.kbn5);
        params.put("kbn6", this.kbn6);
        params.put("rohs", this.rohs);
        params.put("tantai_lt", this.tantaiLt);
        params.put("tsukesu", this.tsukesu);
        params.put("ex_tax_rate", this.exTaxRate);
        params.put("memo", this.memo);
        params.put("haiban_kbn", this.haibanKbn);
        params.put("haiban_ym", this.haibanYm);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
