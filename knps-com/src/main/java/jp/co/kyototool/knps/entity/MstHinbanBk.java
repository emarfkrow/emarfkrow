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
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("TRIM (yy) = TRIM (:yy)");

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
        nameList.add("yy -- :yy");
        nameList.add("hinban -- :hinban");
        nameList.add("hinban_code -- :hinban_code");
        nameList.add("item -- :item");
        nameList.add("item_kbn -- :item_kbn");
        nameList.add("shikake_kbn -- :shikake_kbn");
        nameList.add("lot_size -- :lot_size");
        nameList.add("counts -- :counts");
        nameList.add("unit_code -- :unit_code");
        nameList.add("account_code -- :account_code");
        nameList.add("supply_change -- :supply_change");
        nameList.add("supply_permission -- :supply_permission");
        nameList.add("off_post_no -- :off_post_no");
        nameList.add("isuue_post_no -- :isuue_post_no");
        nameList.add("store_no -- :store_no");
        nameList.add("stocks_kind_kbn -- :stocks_kind_kbn");
        nameList.add("hingun_kbn -- :hingun_kbn");
        nameList.add("elec_inv_control -- :elec_inv_control");
        nameList.add("rest_article_kbn -- :rest_article_kbn");
        nameList.add("rest_article_max -- :rest_article_max");
        nameList.add("cost_amount_kbn -- :cost_amount_kbn");
        nameList.add("f_cost_amount_kbn -- :f_cost_amount_kbn");
        nameList.add("s_cost_amount_kbn -- :s_cost_amount_kbn");
        nameList.add("hinban_ope_code -- :hinban_ope_code");
        nameList.add("permission_flag -- :permission_flag");
        nameList.add("version -- :version");
        nameList.add("plan_code -- :plan_code");
        nameList.add("poison_kbn -- :poison_kbn");
        nameList.add("material -- :material");
        nameList.add("material_size -- :material_size");
        nameList.add("maker -- :maker");
        nameList.add("material_recycle -- :material_recycle");
        nameList.add("maker_simuke -- :maker_simuke");
        nameList.add("maker_weight -- :maker_weight");
        nameList.add("act_inv_first -- :act_inv_first");
        nameList.add("act_inv_last -- :act_inv_last");
        nameList.add("sup_unit -- :sup_unit");
        nameList.add("routing_def_group -- :routing_def_group");
        nameList.add("cost_calculate_group -- :cost_calculate_group");
        nameList.add("kbn1 -- :kbn1");
        nameList.add("kbn2 -- :kbn2");
        nameList.add("kbn3 -- :kbn3");
        nameList.add("stock_status -- :stock_status");
        nameList.add("stock_status_date -- :stock_status_date");
        nameList.add("print_structure_flg -- :print_structure_flg");
        nameList.add("print_work_flow_flg -- :print_work_flow_flg");
        nameList.add("print_work_result_flg -- :print_work_result_flg");
        nameList.add("print_ship_sheet_flg -- :print_ship_sheet_flg");
        nameList.add("print_inspect_flg -- :print_inspect_flg");
        nameList.add("print_product_box_flg -- :print_product_box_flg");
        nameList.add("print_hinban_struct_flg -- :print_hinban_struct_flg");
        nameList.add("semi_product_flg -- :semi_product_flg");
        nameList.add("stock_management_section -- :stock_management_section");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("total_lt -- :total_lt");
        nameList.add("company_div_code -- :company_div_code");
        nameList.add("kbn4 -- :kbn4");
        nameList.add("kbn5 -- :kbn5");
        nameList.add("kbn6 -- :kbn6");
        nameList.add("rohs -- :rohs");
        nameList.add("tantai_lt -- :tantai_lt");
        nameList.add("tsukesu -- :tsukesu");
        nameList.add("ex_tax_rate -- :ex_tax_rate");
        nameList.add("memo -- :memo");
        nameList.add("haiban_kbn -- :haiban_kbn");
        nameList.add("haiban_ym -- :haiban_ym");
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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.YY) IS NULL THEN 0 ELSE MAX(e.YY) * 1 END + 1, 4, '0') AS YY FROM MST_HINBAN_BK e WHERE e.YY < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.HINBAN = :hinban");
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
        setList.add("yy = :yy");
        setList.add("hinban = :hinban");
        setList.add("hinban_code = :hinban_code");
        setList.add("item = :item");
        setList.add("item_kbn = :item_kbn");
        setList.add("shikake_kbn = :shikake_kbn");
        setList.add("lot_size = :lot_size");
        setList.add("counts = :counts");
        setList.add("unit_code = :unit_code");
        setList.add("account_code = :account_code");
        setList.add("supply_change = :supply_change");
        setList.add("supply_permission = :supply_permission");
        setList.add("off_post_no = :off_post_no");
        setList.add("isuue_post_no = :isuue_post_no");
        setList.add("store_no = :store_no");
        setList.add("stocks_kind_kbn = :stocks_kind_kbn");
        setList.add("hingun_kbn = :hingun_kbn");
        setList.add("elec_inv_control = :elec_inv_control");
        setList.add("rest_article_kbn = :rest_article_kbn");
        setList.add("rest_article_max = :rest_article_max");
        setList.add("cost_amount_kbn = :cost_amount_kbn");
        setList.add("f_cost_amount_kbn = :f_cost_amount_kbn");
        setList.add("s_cost_amount_kbn = :s_cost_amount_kbn");
        setList.add("hinban_ope_code = :hinban_ope_code");
        setList.add("permission_flag = :permission_flag");
        setList.add("version = :version");
        setList.add("plan_code = :plan_code");
        setList.add("poison_kbn = :poison_kbn");
        setList.add("material = :material");
        setList.add("material_size = :material_size");
        setList.add("maker = :maker");
        setList.add("material_recycle = :material_recycle");
        setList.add("maker_simuke = :maker_simuke");
        setList.add("maker_weight = :maker_weight");
        setList.add("act_inv_first = :act_inv_first");
        setList.add("act_inv_last = :act_inv_last");
        setList.add("sup_unit = :sup_unit");
        setList.add("routing_def_group = :routing_def_group");
        setList.add("cost_calculate_group = :cost_calculate_group");
        setList.add("kbn1 = :kbn1");
        setList.add("kbn2 = :kbn2");
        setList.add("kbn3 = :kbn3");
        setList.add("stock_status = :stock_status");
        setList.add("stock_status_date = :stock_status_date");
        setList.add("print_structure_flg = :print_structure_flg");
        setList.add("print_work_flow_flg = :print_work_flow_flg");
        setList.add("print_work_result_flg = :print_work_result_flg");
        setList.add("print_ship_sheet_flg = :print_ship_sheet_flg");
        setList.add("print_inspect_flg = :print_inspect_flg");
        setList.add("print_product_box_flg = :print_product_box_flg");
        setList.add("print_hinban_struct_flg = :print_hinban_struct_flg");
        setList.add("semi_product_flg = :semi_product_flg");
        setList.add("stock_management_section = :stock_management_section");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("total_lt = :total_lt");
        setList.add("company_div_code = :company_div_code");
        setList.add("kbn4 = :kbn4");
        setList.add("kbn5 = :kbn5");
        setList.add("kbn6 = :kbn6");
        setList.add("rohs = :rohs");
        setList.add("tantai_lt = :tantai_lt");
        setList.add("tsukesu = :tsukesu");
        setList.add("ex_tax_rate = :ex_tax_rate");
        setList.add("memo = :memo");
        setList.add("haiban_kbn = :haiban_kbn");
        setList.add("haiban_ym = :haiban_ym");
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
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("TRIM (yy) = TRIM (:yy)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YY", this.yy);
        params.put("HINBAN", this.hinban);
        params.put("HINBAN_CODE", this.hinbanCode);
        params.put("ITEM", this.item);
        params.put("ITEM_KBN", this.itemKbn);
        params.put("SHIKAKE_KBN", this.shikakeKbn);
        params.put("LOT_SIZE", this.lotSize);
        params.put("COUNTS", this.counts);
        params.put("UNIT_CODE", this.unitCode);
        params.put("ACCOUNT_CODE", this.accountCode);
        params.put("SUPPLY_CHANGE", this.supplyChange);
        params.put("SUPPLY_PERMISSION", this.supplyPermission);
        params.put("OFF_POST_NO", this.offPostNo);
        params.put("ISUUE_POST_NO", this.isuuePostNo);
        params.put("STORE_NO", this.storeNo);
        params.put("STOCKS_KIND_KBN", this.stocksKindKbn);
        params.put("HINGUN_KBN", this.hingunKbn);
        params.put("ELEC_INV_CONTROL", this.elecInvControl);
        params.put("REST_ARTICLE_KBN", this.restArticleKbn);
        params.put("REST_ARTICLE_MAX", this.restArticleMax);
        params.put("COST_AMOUNT_KBN", this.costAmountKbn);
        params.put("F_COST_AMOUNT_KBN", this.fCostAmountKbn);
        params.put("S_COST_AMOUNT_KBN", this.sCostAmountKbn);
        params.put("HINBAN_OPE_CODE", this.hinbanOpeCode);
        params.put("PERMISSION_FLAG", this.permissionFlag);
        params.put("VERSION", this.version);
        params.put("PLAN_CODE", this.planCode);
        params.put("POISON_KBN", this.poisonKbn);
        params.put("MATERIAL", this.material);
        params.put("MATERIAL_SIZE", this.materialSize);
        params.put("MAKER", this.maker);
        params.put("MATERIAL_RECYCLE", this.materialRecycle);
        params.put("MAKER_SIMUKE", this.makerSimuke);
        params.put("MAKER_WEIGHT", this.makerWeight);
        params.put("ACT_INV_FIRST", this.actInvFirst);
        params.put("ACT_INV_LAST", this.actInvLast);
        params.put("SUP_UNIT", this.supUnit);
        params.put("ROUTING_DEF_GROUP", this.routingDefGroup);
        params.put("COST_CALCULATE_GROUP", this.costCalculateGroup);
        params.put("KBN1", this.kbn1);
        params.put("KBN2", this.kbn2);
        params.put("KBN3", this.kbn3);
        params.put("STOCK_STATUS", this.stockStatus);
        params.put("STOCK_STATUS_DATE", this.stockStatusDate);
        params.put("PRINT_STRUCTURE_FLG", this.printStructureFlg);
        params.put("PRINT_WORK_FLOW_FLG", this.printWorkFlowFlg);
        params.put("PRINT_WORK_RESULT_FLG", this.printWorkResultFlg);
        params.put("PRINT_SHIP_SHEET_FLG", this.printShipSheetFlg);
        params.put("PRINT_INSPECT_FLG", this.printInspectFlg);
        params.put("PRINT_PRODUCT_BOX_FLG", this.printProductBoxFlg);
        params.put("PRINT_HINBAN_STRUCT_FLG", this.printHinbanStructFlg);
        params.put("SEMI_PRODUCT_FLG", this.semiProductFlg);
        params.put("STOCK_MANAGEMENT_SECTION", this.stockManagementSection);
        params.put("TOTAL_LT", this.totalLt);
        params.put("COMPANY_DIV_CODE", this.companyDivCode);
        params.put("KBN4", this.kbn4);
        params.put("KBN5", this.kbn5);
        params.put("KBN6", this.kbn6);
        params.put("ROHS", this.rohs);
        params.put("TANTAI_LT", this.tantaiLt);
        params.put("TSUKESU", this.tsukesu);
        params.put("EX_TAX_RATE", this.exTaxRate);
        params.put("MEMO", this.memo);
        params.put("HAIBAN_KBN", this.haibanKbn);
        params.put("HAIBAN_YM", this.haibanYm);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
