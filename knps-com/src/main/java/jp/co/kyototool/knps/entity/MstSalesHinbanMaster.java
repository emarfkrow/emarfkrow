package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SALES_HINBAN_MASTER
 *
 * @author emarfkrow
 */
public class MstSalesHinbanMaster implements IEntity {

    /** SALES_HINBAN */
    private String salesHinban;

    /**
     * @return SALES_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SALES_HINBAN")
    public String getSalesHinban() {
        return this.salesHinban;
    }

    /**
     * @param o SALES_HINBAN
     */
    public void setSalesHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.salesHinban = String.valueOf(o.toString());
        } else {
            this.salesHinban = null;
        }
    }

    /** LOW_LEVEL_CODE */
    private java.math.BigDecimal lowLevelCode;

    /**
     * @return LOW_LEVEL_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOW_LEVEL_CODE")
    public java.math.BigDecimal getLowLevelCode() {
        return this.lowLevelCode;
    }

    /**
     * @param o LOW_LEVEL_CODE
     */
    public void setLowLevelCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lowLevelCode = new java.math.BigDecimal(o.toString());
        } else {
            this.lowLevelCode = null;
        }
    }

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_FLAG")
    public java.math.BigDecimal getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * @param o DELETE_FLAG
     */
    public void setDeleteFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.deleteFlag = null;
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

    /** SET_KBN */
    private String setKbn;

    /**
     * @return SET_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SET_KBN")
    public String getSetKbn() {
        return this.setKbn;
    }

    /**
     * @param o SET_KBN
     */
    public void setSetKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setKbn = String.valueOf(o.toString());
        } else {
            this.setKbn = null;
        }
    }

    /** STRATEGY_PRO_KBN */
    private String strategyProKbn;

    /**
     * @return STRATEGY_PRO_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STRATEGY_PRO_KBN")
    public String getStrategyProKbn() {
        return this.strategyProKbn;
    }

    /**
     * @param o STRATEGY_PRO_KBN
     */
    public void setStrategyProKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.strategyProKbn = String.valueOf(o.toString());
        } else {
            this.strategyProKbn = null;
        }
    }

    /** ORDER_BAN_KBN */
    private String orderBanKbn;

    /**
     * @return ORDER_BAN_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ORDER_BAN_KBN")
    public String getOrderBanKbn() {
        return this.orderBanKbn;
    }

    /**
     * @param o ORDER_BAN_KBN
     */
    public void setOrderBanKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderBanKbn = String.valueOf(o.toString());
        } else {
            this.orderBanKbn = null;
        }
    }

    /** RESALE_BAN_KBN */
    private String resaleBanKbn;

    /**
     * @return RESALE_BAN_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RESALE_BAN_KBN")
    public String getResaleBanKbn() {
        return this.resaleBanKbn;
    }

    /**
     * @param o RESALE_BAN_KBN
     */
    public void setResaleBanKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.resaleBanKbn = String.valueOf(o.toString());
        } else {
            this.resaleBanKbn = null;
        }
    }

    /** WAREHOUSING_BAN_KBN */
    private String warehousingBanKbn;

    /**
     * @return WAREHOUSING_BAN_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("WAREHOUSING_BAN_KBN")
    public String getWarehousingBanKbn() {
        return this.warehousingBanKbn;
    }

    /**
     * @param o WAREHOUSING_BAN_KBN
     */
    public void setWarehousingBanKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.warehousingBanKbn = String.valueOf(o.toString());
        } else {
            this.warehousingBanKbn = null;
        }
    }

    /** PRODUCT_KBN */
    private String productKbn;

    /**
     * @return PRODUCT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRODUCT_KBN")
    public String getProductKbn() {
        return this.productKbn;
    }

    /**
     * @param o PRODUCT_KBN
     */
    public void setProductKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.productKbn = String.valueOf(o.toString());
        } else {
            this.productKbn = null;
        }
    }

    /** SHIP_INSTRUCTIONS_KBN */
    private String shipInstructionsKbn;

    /**
     * @return SHIP_INSTRUCTIONS_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHIP_INSTRUCTIONS_KBN")
    public String getShipInstructionsKbn() {
        return this.shipInstructionsKbn;
    }

    /**
     * @param o SHIP_INSTRUCTIONS_KBN
     */
    public void setShipInstructionsKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipInstructionsKbn = String.valueOf(o.toString());
        } else {
            this.shipInstructionsKbn = null;
        }
    }

    /** PRODUCT_CLASS */
    private java.math.BigDecimal productClass;

    /**
     * @return PRODUCT_CLASS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRODUCT_CLASS")
    public java.math.BigDecimal getProductClass() {
        return this.productClass;
    }

    /**
     * @param o PRODUCT_CLASS
     */
    public void setProductClass(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.productClass = new java.math.BigDecimal(o.toString());
        } else {
            this.productClass = null;
        }
    }

    /** STANDARD_STOCK */
    private java.math.BigDecimal standardStock;

    /**
     * @return STANDARD_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STANDARD_STOCK")
    public java.math.BigDecimal getStandardStock() {
        return this.standardStock;
    }

    /**
     * @param o STANDARD_STOCK
     */
    public void setStandardStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.standardStock = new java.math.BigDecimal(o.toString());
        } else {
            this.standardStock = null;
        }
    }

    /** PRODUCT_WEIGHT */
    private java.math.BigDecimal productWeight;

    /**
     * @return PRODUCT_WEIGHT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRODUCT_WEIGHT")
    public java.math.BigDecimal getProductWeight() {
        return this.productWeight;
    }

    /**
     * @param o PRODUCT_WEIGHT
     */
    public void setProductWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.productWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.productWeight = null;
        }
    }

    /** LOCATION_NO */
    private java.math.BigDecimal locationNo;

    /**
     * @return LOCATION_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LOCATION_NO")
    public java.math.BigDecimal getLocationNo() {
        return this.locationNo;
    }

    /**
     * @param o LOCATION_NO
     */
    public void setLocationNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locationNo = new java.math.BigDecimal(o.toString());
        } else {
            this.locationNo = null;
        }
    }

    /** PACKAGE_CODE */
    private java.math.BigDecimal packageCode;

    /**
     * @return PACKAGE_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PACKAGE_CODE")
    public java.math.BigDecimal getPackageCode() {
        return this.packageCode;
    }

    /**
     * @param o PACKAGE_CODE
     */
    public void setPackageCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.packageCode = new java.math.BigDecimal(o.toString());
        } else {
            this.packageCode = null;
        }
    }

    /** PACKAGE_UNIT */
    private java.math.BigDecimal packageUnit;

    /**
     * @return PACKAGE_UNIT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PACKAGE_UNIT")
    public java.math.BigDecimal getPackageUnit() {
        return this.packageUnit;
    }

    /**
     * @param o PACKAGE_UNIT
     */
    public void setPackageUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.packageUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.packageUnit = null;
        }
    }

    /** PACKAGE_SHORTAGE_KBN */
    private String packageShortageKbn;

    /**
     * @return PACKAGE_SHORTAGE_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PACKAGE_SHORTAGE_KBN")
    public String getPackageShortageKbn() {
        return this.packageShortageKbn;
    }

    /**
     * @param o PACKAGE_SHORTAGE_KBN
     */
    public void setPackageShortageKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.packageShortageKbn = String.valueOf(o.toString());
        } else {
            this.packageShortageKbn = null;
        }
    }

    /** PACKING_KBN */
    private String packingKbn;

    /**
     * @return PACKING_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PACKING_KBN")
    public String getPackingKbn() {
        return this.packingKbn;
    }

    /**
     * @param o PACKING_KBN
     */
    public void setPackingKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.packingKbn = String.valueOf(o.toString());
        } else {
            this.packingKbn = null;
        }
    }

    /** KNBAN_LOT_KBN */
    private String knbanLotKbn;

    /**
     * @return KNBAN_LOT_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KNBAN_LOT_KBN")
    public String getKnbanLotKbn() {
        return this.knbanLotKbn;
    }

    /**
     * @param o KNBAN_LOT_KBN
     */
    public void setKnbanLotKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.knbanLotKbn = String.valueOf(o.toString());
        } else {
            this.knbanLotKbn = null;
        }
    }

    /** JIS_KBN */
    private String jisKbn;

    /**
     * @return JIS_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("JIS_KBN")
    public String getJisKbn() {
        return this.jisKbn;
    }

    /**
     * @param o JIS_KBN
     */
    public void setJisKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jisKbn = String.valueOf(o.toString());
        } else {
            this.jisKbn = null;
        }
    }

    /** SET_STANDARD_TIME */
    private java.math.BigDecimal setStandardTime;

    /**
     * @return SET_STANDARD_TIME
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SET_STANDARD_TIME")
    public java.math.BigDecimal getSetStandardTime() {
        return this.setStandardTime;
    }

    /**
     * @param o SET_STANDARD_TIME
     */
    public void setSetStandardTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setStandardTime = new java.math.BigDecimal(o.toString());
        } else {
            this.setStandardTime = null;
        }
    }

    /** END_PERIOD_COST */
    private java.math.BigDecimal endPeriodCost;

    /**
     * @return END_PERIOD_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("END_PERIOD_COST")
    public java.math.BigDecimal getEndPeriodCost() {
        return this.endPeriodCost;
    }

    /**
     * @param o END_PERIOD_COST
     */
    public void setEndPeriodCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.endPeriodCost = new java.math.BigDecimal(o.toString());
        } else {
            this.endPeriodCost = null;
        }
    }

    /** STANDARD_COST */
    private java.math.BigDecimal standardCost;

    /**
     * @return STANDARD_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STANDARD_COST")
    public java.math.BigDecimal getStandardCost() {
        return this.standardCost;
    }

    /**
     * @param o STANDARD_COST
     */
    public void setStandardCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.standardCost = new java.math.BigDecimal(o.toString());
        } else {
            this.standardCost = null;
        }
    }

    /** SECOND_EVAL_COST */
    private java.math.BigDecimal secondEvalCost;

    /**
     * @return SECOND_EVAL_COST
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SECOND_EVAL_COST")
    public java.math.BigDecimal getSecondEvalCost() {
        return this.secondEvalCost;
    }

    /**
     * @param o SECOND_EVAL_COST
     */
    public void setSecondEvalCost(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.secondEvalCost = new java.math.BigDecimal(o.toString());
        } else {
            this.secondEvalCost = null;
        }
    }

    /** STANDARD_PRICE */
    private java.math.BigDecimal standardPrice;

    /**
     * @return STANDARD_PRICE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STANDARD_PRICE")
    public java.math.BigDecimal getStandardPrice() {
        return this.standardPrice;
    }

    /**
     * @param o STANDARD_PRICE
     */
    public void setStandardPrice(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.standardPrice = new java.math.BigDecimal(o.toString());
        } else {
            this.standardPrice = null;
        }
    }

    /** MASTER_REGIST_DATE */
    private java.math.BigDecimal masterRegistDate;

    /**
     * @return MASTER_REGIST_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MASTER_REGIST_DATE")
    public java.math.BigDecimal getMasterRegistDate() {
        return this.masterRegistDate;
    }

    /**
     * @param o MASTER_REGIST_DATE
     */
    public void setMasterRegistDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.masterRegistDate = new java.math.BigDecimal(o.toString());
        } else {
            this.masterRegistDate = null;
        }
    }

    /** PRODUCT_SALE_DATE */
    private java.math.BigDecimal productSaleDate;

    /**
     * @return PRODUCT_SALE_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRODUCT_SALE_DATE")
    public java.math.BigDecimal getProductSaleDate() {
        return this.productSaleDate;
    }

    /**
     * @param o PRODUCT_SALE_DATE
     */
    public void setProductSaleDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.productSaleDate = new java.math.BigDecimal(o.toString());
        } else {
            this.productSaleDate = null;
        }
    }

    /** SHIP_TARGET_KBN */
    private String shipTargetKbn;

    /**
     * @return SHIP_TARGET_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHIP_TARGET_KBN")
    public String getShipTargetKbn() {
        return this.shipTargetKbn;
    }

    /**
     * @param o SHIP_TARGET_KBN
     */
    public void setShipTargetKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipTargetKbn = String.valueOf(o.toString());
        } else {
            this.shipTargetKbn = null;
        }
    }

    /** NEW_PRODUCT_CLASS */
    private java.math.BigDecimal newProductClass;

    /**
     * @return NEW_PRODUCT_CLASS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NEW_PRODUCT_CLASS")
    public java.math.BigDecimal getNewProductClass() {
        return this.newProductClass;
    }

    /**
     * @param o NEW_PRODUCT_CLASS
     */
    public void setNewProductClass(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.newProductClass = new java.math.BigDecimal(o.toString());
        } else {
            this.newProductClass = null;
        }
    }

    /** DIY_CLASSIC_KBN */
    private String diyClassicKbn;

    /**
     * @return DIY_CLASSIC_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIY_CLASSIC_KBN")
    public String getDiyClassicKbn() {
        return this.diyClassicKbn;
    }

    /**
     * @param o DIY_CLASSIC_KBN
     */
    public void setDiyClassicKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.diyClassicKbn = String.valueOf(o.toString());
        } else {
            this.diyClassicKbn = null;
        }
    }

    /** STOCK_ORDER_KBN */
    private String stockOrderKbn;

    /**
     * @return STOCK_ORDER_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STOCK_ORDER_KBN")
    public String getStockOrderKbn() {
        return this.stockOrderKbn;
    }

    /**
     * @param o STOCK_ORDER_KBN
     */
    public void setStockOrderKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stockOrderKbn = String.valueOf(o.toString());
        } else {
            this.stockOrderKbn = null;
        }
    }

    /** PRODUCT_OPE_CODE */
    private java.math.BigDecimal productOpeCode;

    /**
     * @return PRODUCT_OPE_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRODUCT_OPE_CODE")
    public java.math.BigDecimal getProductOpeCode() {
        return this.productOpeCode;
    }

    /**
     * @param o PRODUCT_OPE_CODE
     */
    public void setProductOpeCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.productOpeCode = new java.math.BigDecimal(o.toString());
        } else {
            this.productOpeCode = null;
        }
    }

    /** DIRECT_DELIVERY_CANCEL_NG_KBN */
    private String directDeliveryCancelNgKbn;

    /**
     * @return DIRECT_DELIVERY_CANCEL_NG_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIRECT_DELIVERY_CANCEL_NG_KBN")
    public String getDirectDeliveryCancelNgKbn() {
        return this.directDeliveryCancelNgKbn;
    }

    /**
     * @param o DIRECT_DELIVERY_CANCEL_NG_KBN
     */
    public void setDirectDeliveryCancelNgKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.directDeliveryCancelNgKbn = String.valueOf(o.toString());
        } else {
            this.directDeliveryCancelNgKbn = null;
        }
    }

    /** PRODUCTION_STOP_KBN */
    private String productionStopKbn;

    /**
     * @return PRODUCTION_STOP_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRODUCTION_STOP_KBN")
    public String getProductionStopKbn() {
        return this.productionStopKbn;
    }

    /**
     * @param o PRODUCTION_STOP_KBN
     */
    public void setProductionStopKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.productionStopKbn = String.valueOf(o.toString());
        } else {
            this.productionStopKbn = null;
        }
    }

    /** VARIETY_CLASS4 */
    private java.math.BigDecimal varietyClass4;

    /**
     * @return VARIETY_CLASS4
     */
    @com.fasterxml.jackson.annotation.JsonProperty("VARIETY_CLASS4")
    public java.math.BigDecimal getVarietyClass4() {
        return this.varietyClass4;
    }

    /**
     * @param o VARIETY_CLASS4
     */
    public void setVarietyClass4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.varietyClass4 = new java.math.BigDecimal(o.toString());
        } else {
            this.varietyClass4 = null;
        }
    }

    /** YOBI2 */
    private String yobi2;

    /**
     * @return YOBI2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YOBI2")
    public String getYobi2() {
        return this.yobi2;
    }

    /**
     * @param o YOBI2
     */
    public void setYobi2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yobi2 = String.valueOf(o.toString());
        } else {
            this.yobi2 = null;
        }
    }

    /** BARCODE */
    private java.math.BigDecimal barcode;

    /**
     * @return BARCODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BARCODE")
    public java.math.BigDecimal getBarcode() {
        return this.barcode;
    }

    /**
     * @param o BARCODE
     */
    public void setBarcode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barcode = new java.math.BigDecimal(o.toString());
        } else {
            this.barcode = null;
        }
    }

    /** DATA_SEND_KBN */
    private String dataSendKbn;

    /**
     * @return DATA_SEND_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DATA_SEND_KBN")
    public String getDataSendKbn() {
        return this.dataSendKbn;
    }

    /**
     * @param o DATA_SEND_KBN
     */
    public void setDataSendKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dataSendKbn = String.valueOf(o.toString());
        } else {
            this.dataSendKbn = null;
        }
    }

    /** YOBI3 */
    private String yobi3;

    /**
     * @return YOBI3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YOBI3")
    public String getYobi3() {
        return this.yobi3;
    }

    /**
     * @param o YOBI3
     */
    public void setYobi3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yobi3 = String.valueOf(o.toString());
        } else {
            this.yobi3 = null;
        }
    }

    /** UPC_CODE */
    private String upcCode;

    /**
     * @return UPC_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UPC_CODE")
    public String getUpcCode() {
        return this.upcCode;
    }

    /**
     * @param o UPC_CODE
     */
    public void setUpcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.upcCode = String.valueOf(o.toString());
        } else {
            this.upcCode = null;
        }
    }

    /** NORMAL_1_STOCK */
    private java.math.BigDecimal normal1Stock;

    /**
     * @return NORMAL_1_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_1_STOCK")
    public java.math.BigDecimal getNormal1Stock() {
        return this.normal1Stock;
    }

    /**
     * @param o NORMAL_1_STOCK
     */
    public void setNormal1Stock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal1Stock = new java.math.BigDecimal(o.toString());
        } else {
            this.normal1Stock = null;
        }
    }

    /** NORMAL_2_STOCK */
    private java.math.BigDecimal normal2Stock;

    /**
     * @return NORMAL_2_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_2_STOCK")
    public java.math.BigDecimal getNormal2Stock() {
        return this.normal2Stock;
    }

    /**
     * @param o NORMAL_2_STOCK
     */
    public void setNormal2Stock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal2Stock = new java.math.BigDecimal(o.toString());
        } else {
            this.normal2Stock = null;
        }
    }

    /** NORMAL_3_STOCK */
    private java.math.BigDecimal normal3Stock;

    /**
     * @return NORMAL_3_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_3_STOCK")
    public java.math.BigDecimal getNormal3Stock() {
        return this.normal3Stock;
    }

    /**
     * @param o NORMAL_3_STOCK
     */
    public void setNormal3Stock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal3Stock = new java.math.BigDecimal(o.toString());
        } else {
            this.normal3Stock = null;
        }
    }

    /** NORMAL_4_STOCK */
    private java.math.BigDecimal normal4Stock;

    /**
     * @return NORMAL_4_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_4_STOCK")
    public java.math.BigDecimal getNormal4Stock() {
        return this.normal4Stock;
    }

    /**
     * @param o NORMAL_4_STOCK
     */
    public void setNormal4Stock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal4Stock = new java.math.BigDecimal(o.toString());
        } else {
            this.normal4Stock = null;
        }
    }

    /** NORMAL_5_STOCK */
    private java.math.BigDecimal normal5Stock;

    /**
     * @return NORMAL_5_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_5_STOCK")
    public java.math.BigDecimal getNormal5Stock() {
        return this.normal5Stock;
    }

    /**
     * @param o NORMAL_5_STOCK
     */
    public void setNormal5Stock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal5Stock = new java.math.BigDecimal(o.toString());
        } else {
            this.normal5Stock = null;
        }
    }

    /** NORMAL_1_INSTRUCTIONS */
    private java.math.BigDecimal normal1Instructions;

    /**
     * @return NORMAL_1_INSTRUCTIONS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_1_INSTRUCTIONS")
    public java.math.BigDecimal getNormal1Instructions() {
        return this.normal1Instructions;
    }

    /**
     * @param o NORMAL_1_INSTRUCTIONS
     */
    public void setNormal1Instructions(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal1Instructions = new java.math.BigDecimal(o.toString());
        } else {
            this.normal1Instructions = null;
        }
    }

    /** NORMAL_2_INSTRUCTIONS */
    private java.math.BigDecimal normal2Instructions;

    /**
     * @return NORMAL_2_INSTRUCTIONS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_2_INSTRUCTIONS")
    public java.math.BigDecimal getNormal2Instructions() {
        return this.normal2Instructions;
    }

    /**
     * @param o NORMAL_2_INSTRUCTIONS
     */
    public void setNormal2Instructions(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal2Instructions = new java.math.BigDecimal(o.toString());
        } else {
            this.normal2Instructions = null;
        }
    }

    /** NORMAL_3_INSTRUCTIONS */
    private java.math.BigDecimal normal3Instructions;

    /**
     * @return NORMAL_3_INSTRUCTIONS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_3_INSTRUCTIONS")
    public java.math.BigDecimal getNormal3Instructions() {
        return this.normal3Instructions;
    }

    /**
     * @param o NORMAL_3_INSTRUCTIONS
     */
    public void setNormal3Instructions(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal3Instructions = new java.math.BigDecimal(o.toString());
        } else {
            this.normal3Instructions = null;
        }
    }

    /** NORMAL_4_INSTRUCTIONS */
    private java.math.BigDecimal normal4Instructions;

    /**
     * @return NORMAL_4_INSTRUCTIONS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_4_INSTRUCTIONS")
    public java.math.BigDecimal getNormal4Instructions() {
        return this.normal4Instructions;
    }

    /**
     * @param o NORMAL_4_INSTRUCTIONS
     */
    public void setNormal4Instructions(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal4Instructions = new java.math.BigDecimal(o.toString());
        } else {
            this.normal4Instructions = null;
        }
    }

    /** NORMAL_1_PROVISION */
    private java.math.BigDecimal normal1Provision;

    /**
     * @return NORMAL_1_PROVISION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_1_PROVISION")
    public java.math.BigDecimal getNormal1Provision() {
        return this.normal1Provision;
    }

    /**
     * @param o NORMAL_1_PROVISION
     */
    public void setNormal1Provision(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal1Provision = new java.math.BigDecimal(o.toString());
        } else {
            this.normal1Provision = null;
        }
    }

    /** NORMAL_2_PROVISION */
    private java.math.BigDecimal normal2Provision;

    /**
     * @return NORMAL_2_PROVISION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_2_PROVISION")
    public java.math.BigDecimal getNormal2Provision() {
        return this.normal2Provision;
    }

    /**
     * @param o NORMAL_2_PROVISION
     */
    public void setNormal2Provision(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal2Provision = new java.math.BigDecimal(o.toString());
        } else {
            this.normal2Provision = null;
        }
    }

    /** NORMAL_3_PROVISION */
    private java.math.BigDecimal normal3Provision;

    /**
     * @return NORMAL_3_PROVISION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_3_PROVISION")
    public java.math.BigDecimal getNormal3Provision() {
        return this.normal3Provision;
    }

    /**
     * @param o NORMAL_3_PROVISION
     */
    public void setNormal3Provision(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal3Provision = new java.math.BigDecimal(o.toString());
        } else {
            this.normal3Provision = null;
        }
    }

    /** NORMAL_4_PROVISION */
    private java.math.BigDecimal normal4Provision;

    /**
     * @return NORMAL_4_PROVISION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_4_PROVISION")
    public java.math.BigDecimal getNormal4Provision() {
        return this.normal4Provision;
    }

    /**
     * @param o NORMAL_4_PROVISION
     */
    public void setNormal4Provision(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal4Provision = new java.math.BigDecimal(o.toString());
        } else {
            this.normal4Provision = null;
        }
    }

    /** COMM_THIS_MONTH_LEFTORCER */
    private java.math.BigDecimal commThisMonthLeftorcer;

    /**
     * @return COMM_THIS_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMM_THIS_MONTH_LEFTORCER")
    public java.math.BigDecimal getCommThisMonthLeftorcer() {
        return this.commThisMonthLeftorcer;
    }

    /**
     * @param o COMM_THIS_MONTH_LEFTORCER
     */
    public void setCommThisMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.commThisMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.commThisMonthLeftorcer = null;
        }
    }

    /** COMM_NEXT_MONTH_LEFTORCER */
    private java.math.BigDecimal commNextMonthLeftorcer;

    /**
     * @return COMM_NEXT_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMM_NEXT_MONTH_LEFTORCER")
    public java.math.BigDecimal getCommNextMonthLeftorcer() {
        return this.commNextMonthLeftorcer;
    }

    /**
     * @param o COMM_NEXT_MONTH_LEFTORCER
     */
    public void setCommNextMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.commNextMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.commNextMonthLeftorcer = null;
        }
    }

    /** COMM_TWO_NEXT_MONTH_LEFTORCER */
    private java.math.BigDecimal commTwoNextMonthLeftorcer;

    /**
     * @return COMM_TWO_NEXT_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("COMM_TWO_NEXT_MONTH_LEFTORCER")
    public java.math.BigDecimal getCommTwoNextMonthLeftorcer() {
        return this.commTwoNextMonthLeftorcer;
    }

    /**
     * @param o COMM_TWO_NEXT_MONTH_LEFTORCER
     */
    public void setCommTwoNextMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.commTwoNextMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.commTwoNextMonthLeftorcer = null;
        }
    }

    /** EXP_THIS_MONTH_LEFTORCER */
    private java.math.BigDecimal expThisMonthLeftorcer;

    /**
     * @return EXP_THIS_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_THIS_MONTH_LEFTORCER")
    public java.math.BigDecimal getExpThisMonthLeftorcer() {
        return this.expThisMonthLeftorcer;
    }

    /**
     * @param o EXP_THIS_MONTH_LEFTORCER
     */
    public void setExpThisMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expThisMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.expThisMonthLeftorcer = null;
        }
    }

    /** EXP_NEXT_MONTH_LEFTORCER */
    private java.math.BigDecimal expNextMonthLeftorcer;

    /**
     * @return EXP_NEXT_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_NEXT_MONTH_LEFTORCER")
    public java.math.BigDecimal getExpNextMonthLeftorcer() {
        return this.expNextMonthLeftorcer;
    }

    /**
     * @param o EXP_NEXT_MONTH_LEFTORCER
     */
    public void setExpNextMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expNextMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.expNextMonthLeftorcer = null;
        }
    }

    /** EXP_TWO_NEXT_MONTH_LEFTORCER */
    private java.math.BigDecimal expTwoNextMonthLeftorcer;

    /**
     * @return EXP_TWO_NEXT_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EXP_TWO_NEXT_MONTH_LEFTORCER")
    public java.math.BigDecimal getExpTwoNextMonthLeftorcer() {
        return this.expTwoNextMonthLeftorcer;
    }

    /**
     * @param o EXP_TWO_NEXT_MONTH_LEFTORCER
     */
    public void setExpTwoNextMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.expTwoNextMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.expTwoNextMonthLeftorcer = null;
        }
    }

    /** DIY_THIS_MONTH_LEFTORCER */
    private java.math.BigDecimal diyThisMonthLeftorcer;

    /**
     * @return DIY_THIS_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIY_THIS_MONTH_LEFTORCER")
    public java.math.BigDecimal getDiyThisMonthLeftorcer() {
        return this.diyThisMonthLeftorcer;
    }

    /**
     * @param o DIY_THIS_MONTH_LEFTORCER
     */
    public void setDiyThisMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.diyThisMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.diyThisMonthLeftorcer = null;
        }
    }

    /** DIY_NEXT_MONTH_LEFTORCER */
    private java.math.BigDecimal diyNextMonthLeftorcer;

    /**
     * @return DIY_NEXT_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIY_NEXT_MONTH_LEFTORCER")
    public java.math.BigDecimal getDiyNextMonthLeftorcer() {
        return this.diyNextMonthLeftorcer;
    }

    /**
     * @param o DIY_NEXT_MONTH_LEFTORCER
     */
    public void setDiyNextMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.diyNextMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.diyNextMonthLeftorcer = null;
        }
    }

    /** DIY_TWO_NEXT_MONTH_LEFTORCER */
    private java.math.BigDecimal diyTwoNextMonthLeftorcer;

    /**
     * @return DIY_TWO_NEXT_MONTH_LEFTORCER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIY_TWO_NEXT_MONTH_LEFTORCER")
    public java.math.BigDecimal getDiyTwoNextMonthLeftorcer() {
        return this.diyTwoNextMonthLeftorcer;
    }

    /**
     * @param o DIY_TWO_NEXT_MONTH_LEFTORCER
     */
    public void setDiyTwoNextMonthLeftorcer(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.diyTwoNextMonthLeftorcer = new java.math.BigDecimal(o.toString());
        } else {
            this.diyTwoNextMonthLeftorcer = null;
        }
    }

    /** NORMAL_1_WAREHOUSING_PLAN */
    private java.math.BigDecimal normal1WarehousingPlan;

    /**
     * @return NORMAL_1_WAREHOUSING_PLAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_1_WAREHOUSING_PLAN")
    public java.math.BigDecimal getNormal1WarehousingPlan() {
        return this.normal1WarehousingPlan;
    }

    /**
     * @param o NORMAL_1_WAREHOUSING_PLAN
     */
    public void setNormal1WarehousingPlan(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal1WarehousingPlan = new java.math.BigDecimal(o.toString());
        } else {
            this.normal1WarehousingPlan = null;
        }
    }

    /** NORMAL_2_WAREHOUSING_PLAN */
    private java.math.BigDecimal normal2WarehousingPlan;

    /**
     * @return NORMAL_2_WAREHOUSING_PLAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_2_WAREHOUSING_PLAN")
    public java.math.BigDecimal getNormal2WarehousingPlan() {
        return this.normal2WarehousingPlan;
    }

    /**
     * @param o NORMAL_2_WAREHOUSING_PLAN
     */
    public void setNormal2WarehousingPlan(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal2WarehousingPlan = new java.math.BigDecimal(o.toString());
        } else {
            this.normal2WarehousingPlan = null;
        }
    }

    /** NORMAL_3_WAREHOUSING_PLAN */
    private java.math.BigDecimal normal3WarehousingPlan;

    /**
     * @return NORMAL_3_WAREHOUSING_PLAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_3_WAREHOUSING_PLAN")
    public java.math.BigDecimal getNormal3WarehousingPlan() {
        return this.normal3WarehousingPlan;
    }

    /**
     * @param o NORMAL_3_WAREHOUSING_PLAN
     */
    public void setNormal3WarehousingPlan(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal3WarehousingPlan = new java.math.BigDecimal(o.toString());
        } else {
            this.normal3WarehousingPlan = null;
        }
    }

    /** NORMAL_4_WAREHOUSING_PLAN */
    private java.math.BigDecimal normal4WarehousingPlan;

    /**
     * @return NORMAL_4_WAREHOUSING_PLAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NORMAL_4_WAREHOUSING_PLAN")
    public java.math.BigDecimal getNormal4WarehousingPlan() {
        return this.normal4WarehousingPlan;
    }

    /**
     * @param o NORMAL_4_WAREHOUSING_PLAN
     */
    public void setNormal4WarehousingPlan(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.normal4WarehousingPlan = new java.math.BigDecimal(o.toString());
        } else {
            this.normal4WarehousingPlan = null;
        }
    }

    /** SAPPORO_STOCK */
    private java.math.BigDecimal sapporoStock;

    /**
     * @return SAPPORO_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SAPPORO_STOCK")
    public java.math.BigDecimal getSapporoStock() {
        return this.sapporoStock;
    }

    /**
     * @param o SAPPORO_STOCK
     */
    public void setSapporoStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sapporoStock = new java.math.BigDecimal(o.toString());
        } else {
            this.sapporoStock = null;
        }
    }

    /** SENDAI_STOCK */
    private java.math.BigDecimal sendaiStock;

    /**
     * @return SENDAI_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SENDAI_STOCK")
    public java.math.BigDecimal getSendaiStock() {
        return this.sendaiStock;
    }

    /**
     * @param o SENDAI_STOCK
     */
    public void setSendaiStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendaiStock = new java.math.BigDecimal(o.toString());
        } else {
            this.sendaiStock = null;
        }
    }

    /** TOKYO_STOCK */
    private java.math.BigDecimal tokyoStock;

    /**
     * @return TOKYO_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOKYO_STOCK")
    public java.math.BigDecimal getTokyoStock() {
        return this.tokyoStock;
    }

    /**
     * @param o TOKYO_STOCK
     */
    public void setTokyoStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokyoStock = new java.math.BigDecimal(o.toString());
        } else {
            this.tokyoStock = null;
        }
    }

    /** KANTOU_STOCK */
    private java.math.BigDecimal kantouStock;

    /**
     * @return KANTOU_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANTOU_STOCK")
    public java.math.BigDecimal getKantouStock() {
        return this.kantouStock;
    }

    /**
     * @param o KANTOU_STOCK
     */
    public void setKantouStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kantouStock = new java.math.BigDecimal(o.toString());
        } else {
            this.kantouStock = null;
        }
    }

    /** KANAZAWA_STOCK */
    private java.math.BigDecimal kanazawaStock;

    /**
     * @return KANAZAWA_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KANAZAWA_STOCK")
    public java.math.BigDecimal getKanazawaStock() {
        return this.kanazawaStock;
    }

    /**
     * @param o KANAZAWA_STOCK
     */
    public void setKanazawaStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kanazawaStock = new java.math.BigDecimal(o.toString());
        } else {
            this.kanazawaStock = null;
        }
    }

    /** NAGOYA_STOCK */
    private java.math.BigDecimal nagoyaStock;

    /**
     * @return NAGOYA_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NAGOYA_STOCK")
    public java.math.BigDecimal getNagoyaStock() {
        return this.nagoyaStock;
    }

    /**
     * @param o NAGOYA_STOCK
     */
    public void setNagoyaStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nagoyaStock = new java.math.BigDecimal(o.toString());
        } else {
            this.nagoyaStock = null;
        }
    }

    /** KINKI_STOCK */
    private java.math.BigDecimal kinkiStock;

    /**
     * @return KINKI_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KINKI_STOCK")
    public java.math.BigDecimal getKinkiStock() {
        return this.kinkiStock;
    }

    /**
     * @param o KINKI_STOCK
     */
    public void setKinkiStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kinkiStock = new java.math.BigDecimal(o.toString());
        } else {
            this.kinkiStock = null;
        }
    }

    /** HIROSHIMA_STOCK */
    private java.math.BigDecimal hiroshimaStock;

    /**
     * @return HIROSHIMA_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HIROSHIMA_STOCK")
    public java.math.BigDecimal getHiroshimaStock() {
        return this.hiroshimaStock;
    }

    /**
     * @param o HIROSHIMA_STOCK
     */
    public void setHiroshimaStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hiroshimaStock = new java.math.BigDecimal(o.toString());
        } else {
            this.hiroshimaStock = null;
        }
    }

    /** HUKUOKA_STOCK */
    private java.math.BigDecimal hukuokaStock;

    /**
     * @return HUKUOKA_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HUKUOKA_STOCK")
    public java.math.BigDecimal getHukuokaStock() {
        return this.hukuokaStock;
    }

    /**
     * @param o HUKUOKA_STOCK
     */
    public void setHukuokaStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hukuokaStock = new java.math.BigDecimal(o.toString());
        } else {
            this.hukuokaStock = null;
        }
    }

    /** BUSINESS_STOCK */
    private java.math.BigDecimal businessStock;

    /**
     * @return BUSINESS_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BUSINESS_STOCK")
    public java.math.BigDecimal getBusinessStock() {
        return this.businessStock;
    }

    /**
     * @param o BUSINESS_STOCK
     */
    public void setBusinessStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.businessStock = new java.math.BigDecimal(o.toString());
        } else {
            this.businessStock = null;
        }
    }

    /** TRADE_STOCK */
    private java.math.BigDecimal tradeStock;

    /**
     * @return TRADE_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TRADE_STOCK")
    public java.math.BigDecimal getTradeStock() {
        return this.tradeStock;
    }

    /**
     * @param o TRADE_STOCK
     */
    public void setTradeStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tradeStock = new java.math.BigDecimal(o.toString());
        } else {
            this.tradeStock = null;
        }
    }

    /** HIGH_TECH_STOCK */
    private java.math.BigDecimal highTechStock;

    /**
     * @return HIGH_TECH_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HIGH_TECH_STOCK")
    public java.math.BigDecimal getHighTechStock() {
        return this.highTechStock;
    }

    /**
     * @param o HIGH_TECH_STOCK
     */
    public void setHighTechStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.highTechStock = new java.math.BigDecimal(o.toString());
        } else {
            this.highTechStock = null;
        }
    }

    /** TRADE_CONSIG_STOCK */
    private java.math.BigDecimal tradeConsigStock;

    /**
     * @return TRADE_CONSIG_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TRADE_CONSIG_STOCK")
    public java.math.BigDecimal getTradeConsigStock() {
        return this.tradeConsigStock;
    }

    /**
     * @param o TRADE_CONSIG_STOCK
     */
    public void setTradeConsigStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tradeConsigStock = new java.math.BigDecimal(o.toString());
        } else {
            this.tradeConsigStock = null;
        }
    }

    /** SHANGHAI_KTC_BONDED_STOCK */
    private java.math.BigDecimal shanghaiKtcBondedStock;

    /**
     * @return SHANGHAI_KTC_BONDED_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHANGHAI_KTC_BONDED_STOCK")
    public java.math.BigDecimal getShanghaiKtcBondedStock() {
        return this.shanghaiKtcBondedStock;
    }

    /**
     * @param o SHANGHAI_KTC_BONDED_STOCK
     */
    public void setShanghaiKtcBondedStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shanghaiKtcBondedStock = new java.math.BigDecimal(o.toString());
        } else {
            this.shanghaiKtcBondedStock = null;
        }
    }

    /** PACKAGE_MATERIAL_STOCK */
    private java.math.BigDecimal packageMaterialStock;

    /**
     * @return PACKAGE_MATERIAL_STOCK
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PACKAGE_MATERIAL_STOCK")
    public java.math.BigDecimal getPackageMaterialStock() {
        return this.packageMaterialStock;
    }

    /**
     * @param o PACKAGE_MATERIAL_STOCK
     */
    public void setPackageMaterialStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.packageMaterialStock = new java.math.BigDecimal(o.toString());
        } else {
            this.packageMaterialStock = null;
        }
    }

    /** PRODUCT_END_PLAN_DATE */
    private java.math.BigDecimal productEndPlanDate;

    /**
     * @return PRODUCT_END_PLAN_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRODUCT_END_PLAN_DATE")
    public java.math.BigDecimal getProductEndPlanDate() {
        return this.productEndPlanDate;
    }

    /**
     * @param o PRODUCT_END_PLAN_DATE
     */
    public void setProductEndPlanDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.productEndPlanDate = new java.math.BigDecimal(o.toString());
        } else {
            this.productEndPlanDate = null;
        }
    }

    /** PRODUCT_END_DATE */
    private java.math.BigDecimal productEndDate;

    /**
     * @return PRODUCT_END_DATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRODUCT_END_DATE")
    public java.math.BigDecimal getProductEndDate() {
        return this.productEndDate;
    }

    /**
     * @param o PRODUCT_END_DATE
     */
    public void setProductEndDate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.productEndDate = new java.math.BigDecimal(o.toString());
        } else {
            this.productEndDate = null;
        }
    }

    /** ALTERNATIVE_HINBAN1 */
    private String alternativeHinban1;

    /**
     * @return ALTERNATIVE_HINBAN1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ALTERNATIVE_HINBAN1")
    public String getAlternativeHinban1() {
        return this.alternativeHinban1;
    }

    /**
     * @param o ALTERNATIVE_HINBAN1
     */
    public void setAlternativeHinban1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.alternativeHinban1 = String.valueOf(o.toString());
        } else {
            this.alternativeHinban1 = null;
        }
    }

    /** ALTERNATIVE_HINBAN2 */
    private String alternativeHinban2;

    /**
     * @return ALTERNATIVE_HINBAN2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ALTERNATIVE_HINBAN2")
    public String getAlternativeHinban2() {
        return this.alternativeHinban2;
    }

    /**
     * @param o ALTERNATIVE_HINBAN2
     */
    public void setAlternativeHinban2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.alternativeHinban2 = String.valueOf(o.toString());
        } else {
            this.alternativeHinban2 = null;
        }
    }

    /** NOUKI_ANSWER_NG_KBN */
    private String noukiAnswerNgKbn;

    /**
     * @return NOUKI_ANSWER_NG_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NOUKI_ANSWER_NG_KBN")
    public String getNoukiAnswerNgKbn() {
        return this.noukiAnswerNgKbn;
    }

    /**
     * @param o NOUKI_ANSWER_NG_KBN
     */
    public void setNoukiAnswerNgKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.noukiAnswerNgKbn = String.valueOf(o.toString());
        } else {
            this.noukiAnswerNgKbn = null;
        }
    }

    /** DIRECT_DELIVERY_TARGET_KBN */
    private String directDeliveryTargetKbn;

    /**
     * @return DIRECT_DELIVERY_TARGET_KBN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIRECT_DELIVERY_TARGET_KBN")
    public String getDirectDeliveryTargetKbn() {
        return this.directDeliveryTargetKbn;
    }

    /**
     * @param o DIRECT_DELIVERY_TARGET_KBN
     */
    public void setDirectDeliveryTargetKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.directDeliveryTargetKbn = String.valueOf(o.toString());
        } else {
            this.directDeliveryTargetKbn = null;
        }
    }

    /** YOBI */
    private String yobi;

    /**
     * @return YOBI
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YOBI")
    public String getYobi() {
        return this.yobi;
    }

    /**
     * @param o YOBI
     */
    public void setYobi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yobi = String.valueOf(o.toString());
        } else {
            this.yobi = null;
        }
    }

    /**
     * MST_SALES_HINBAN_MASTER照会
     *
     * @param param1 SALES_HINBAN
     * @return MST_SALES_HINBAN_MASTER
     */
    public static MstSalesHinbanMaster get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SALES_HINBAN\") = TRIM (:sales_hinban)");

        String sql = "SELECT * FROM MST_SALES_HINBAN_MASTER WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sales_hinban", param1);

        return Queries.get(sql, params, MstSalesHinbanMaster.class);
    }

    /**
     * MST_SALES_HINBAN_MASTER追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SALES_HINBANの採番処理
        numbering();

        // MST_SALES_HINBAN_MASTERの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SALES_HINBAN\" -- :sales_hinban");
        nameList.add("\"LOW_LEVEL_CODE\" -- :low_level_code");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"HINBAN_CODE\" -- :hinban_code");
        nameList.add("\"ITEM\" -- :item");
        nameList.add("\"SET_KBN\" -- :set_kbn");
        nameList.add("\"STRATEGY_PRO_KBN\" -- :strategy_pro_kbn");
        nameList.add("\"ORDER_BAN_KBN\" -- :order_ban_kbn");
        nameList.add("\"RESALE_BAN_KBN\" -- :resale_ban_kbn");
        nameList.add("\"WAREHOUSING_BAN_KBN\" -- :warehousing_ban_kbn");
        nameList.add("\"PRODUCT_KBN\" -- :product_kbn");
        nameList.add("\"SHIP_INSTRUCTIONS_KBN\" -- :ship_instructions_kbn");
        nameList.add("\"PRODUCT_CLASS\" -- :product_class");
        nameList.add("\"STANDARD_STOCK\" -- :standard_stock");
        nameList.add("\"PRODUCT_WEIGHT\" -- :product_weight");
        nameList.add("\"LOCATION_NO\" -- :location_no");
        nameList.add("\"PACKAGE_CODE\" -- :package_code");
        nameList.add("\"PACKAGE_UNIT\" -- :package_unit");
        nameList.add("\"PACKAGE_SHORTAGE_KBN\" -- :package_shortage_kbn");
        nameList.add("\"PACKING_KBN\" -- :packing_kbn");
        nameList.add("\"KNBAN_LOT_KBN\" -- :knban_lot_kbn");
        nameList.add("\"JIS_KBN\" -- :jis_kbn");
        nameList.add("\"SET_STANDARD_TIME\" -- :set_standard_time");
        nameList.add("\"END_PERIOD_COST\" -- :end_period_cost");
        nameList.add("\"STANDARD_COST\" -- :standard_cost");
        nameList.add("\"SECOND_EVAL_COST\" -- :second_eval_cost");
        nameList.add("\"STANDARD_PRICE\" -- :standard_price");
        nameList.add("\"MASTER_REGIST_DATE\" -- :master_regist_date");
        nameList.add("\"PRODUCT_SALE_DATE\" -- :product_sale_date");
        nameList.add("\"SHIP_TARGET_KBN\" -- :ship_target_kbn");
        nameList.add("\"NEW_PRODUCT_CLASS\" -- :new_product_class");
        nameList.add("\"DIY_CLASSIC_KBN\" -- :diy_classic_kbn");
        nameList.add("\"STOCK_ORDER_KBN\" -- :stock_order_kbn");
        nameList.add("\"PRODUCT_OPE_CODE\" -- :product_ope_code");
        nameList.add("\"DIRECT_DELIVERY_CANCEL_NG_KBN\" -- :direct_delivery_cancel_ng_kbn");
        nameList.add("\"PRODUCTION_STOP_KBN\" -- :production_stop_kbn");
        nameList.add("\"VARIETY_CLASS4\" -- :variety_class4");
        nameList.add("\"YOBI2\" -- :yobi2");
        nameList.add("\"BARCODE\" -- :barcode");
        nameList.add("\"DATA_SEND_KBN\" -- :data_send_kbn");
        nameList.add("\"YOBI3\" -- :yobi3");
        nameList.add("\"UPC_CODE\" -- :upc_code");
        nameList.add("\"NORMAL_1_STOCK\" -- :normal_1_stock");
        nameList.add("\"NORMAL_2_STOCK\" -- :normal_2_stock");
        nameList.add("\"NORMAL_3_STOCK\" -- :normal_3_stock");
        nameList.add("\"NORMAL_4_STOCK\" -- :normal_4_stock");
        nameList.add("\"NORMAL_5_STOCK\" -- :normal_5_stock");
        nameList.add("\"NORMAL_1_INSTRUCTIONS\" -- :normal_1_instructions");
        nameList.add("\"NORMAL_2_INSTRUCTIONS\" -- :normal_2_instructions");
        nameList.add("\"NORMAL_3_INSTRUCTIONS\" -- :normal_3_instructions");
        nameList.add("\"NORMAL_4_INSTRUCTIONS\" -- :normal_4_instructions");
        nameList.add("\"NORMAL_1_PROVISION\" -- :normal_1_provision");
        nameList.add("\"NORMAL_2_PROVISION\" -- :normal_2_provision");
        nameList.add("\"NORMAL_3_PROVISION\" -- :normal_3_provision");
        nameList.add("\"NORMAL_4_PROVISION\" -- :normal_4_provision");
        nameList.add("\"COMM_THIS_MONTH_LEFTORCER\" -- :comm_this_month_leftorcer");
        nameList.add("\"COMM_NEXT_MONTH_LEFTORCER\" -- :comm_next_month_leftorcer");
        nameList.add("\"COMM_TWO_NEXT_MONTH_LEFTORCER\" -- :comm_two_next_month_leftorcer");
        nameList.add("\"EXP_THIS_MONTH_LEFTORCER\" -- :exp_this_month_leftorcer");
        nameList.add("\"EXP_NEXT_MONTH_LEFTORCER\" -- :exp_next_month_leftorcer");
        nameList.add("\"EXP_TWO_NEXT_MONTH_LEFTORCER\" -- :exp_two_next_month_leftorcer");
        nameList.add("\"DIY_THIS_MONTH_LEFTORCER\" -- :diy_this_month_leftorcer");
        nameList.add("\"DIY_NEXT_MONTH_LEFTORCER\" -- :diy_next_month_leftorcer");
        nameList.add("\"DIY_TWO_NEXT_MONTH_LEFTORCER\" -- :diy_two_next_month_leftorcer");
        nameList.add("\"NORMAL_1_WAREHOUSING_PLAN\" -- :normal_1_warehousing_plan");
        nameList.add("\"NORMAL_2_WAREHOUSING_PLAN\" -- :normal_2_warehousing_plan");
        nameList.add("\"NORMAL_3_WAREHOUSING_PLAN\" -- :normal_3_warehousing_plan");
        nameList.add("\"NORMAL_4_WAREHOUSING_PLAN\" -- :normal_4_warehousing_plan");
        nameList.add("\"SAPPORO_STOCK\" -- :sapporo_stock");
        nameList.add("\"SENDAI_STOCK\" -- :sendai_stock");
        nameList.add("\"TOKYO_STOCK\" -- :tokyo_stock");
        nameList.add("\"KANTOU_STOCK\" -- :kantou_stock");
        nameList.add("\"KANAZAWA_STOCK\" -- :kanazawa_stock");
        nameList.add("\"NAGOYA_STOCK\" -- :nagoya_stock");
        nameList.add("\"KINKI_STOCK\" -- :kinki_stock");
        nameList.add("\"HIROSHIMA_STOCK\" -- :hiroshima_stock");
        nameList.add("\"HUKUOKA_STOCK\" -- :hukuoka_stock");
        nameList.add("\"BUSINESS_STOCK\" -- :business_stock");
        nameList.add("\"TRADE_STOCK\" -- :trade_stock");
        nameList.add("\"HIGH_TECH_STOCK\" -- :high_tech_stock");
        nameList.add("\"TRADE_CONSIG_STOCK\" -- :trade_consig_stock");
        nameList.add("\"SHANGHAI_KTC_BONDED_STOCK\" -- :shanghai_ktc_bonded_stock");
        nameList.add("\"PACKAGE_MATERIAL_STOCK\" -- :package_material_stock");
        nameList.add("\"PRODUCT_END_PLAN_DATE\" -- :product_end_plan_date");
        nameList.add("\"PRODUCT_END_DATE\" -- :product_end_date");
        nameList.add("\"ALTERNATIVE_HINBAN1\" -- :alternative_hinban1");
        nameList.add("\"ALTERNATIVE_HINBAN2\" -- :alternative_hinban2");
        nameList.add("\"NOUKI_ANSWER_NG_KBN\" -- :nouki_answer_ng_kbn");
        nameList.add("\"DIRECT_DELIVERY_TARGET_KBN\" -- :direct_delivery_target_kbn");
        nameList.add("\"YOBI\" -- :yobi");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SALES_HINBAN_MASTER(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sales_hinban");
        valueList.add(":low_level_code");
        valueList.add(":delete_flag");
        valueList.add(":hinban_code");
        valueList.add(":item");
        valueList.add(":set_kbn");
        valueList.add(":strategy_pro_kbn");
        valueList.add(":order_ban_kbn");
        valueList.add(":resale_ban_kbn");
        valueList.add(":warehousing_ban_kbn");
        valueList.add(":product_kbn");
        valueList.add(":ship_instructions_kbn");
        valueList.add(":product_class");
        valueList.add(":standard_stock");
        valueList.add(":product_weight");
        valueList.add(":location_no");
        valueList.add(":package_code");
        valueList.add(":package_unit");
        valueList.add(":package_shortage_kbn");
        valueList.add(":packing_kbn");
        valueList.add(":knban_lot_kbn");
        valueList.add(":jis_kbn");
        valueList.add(":set_standard_time");
        valueList.add(":end_period_cost");
        valueList.add(":standard_cost");
        valueList.add(":second_eval_cost");
        valueList.add(":standard_price");
        valueList.add(":master_regist_date");
        valueList.add(":product_sale_date");
        valueList.add(":ship_target_kbn");
        valueList.add(":new_product_class");
        valueList.add(":diy_classic_kbn");
        valueList.add(":stock_order_kbn");
        valueList.add(":product_ope_code");
        valueList.add(":direct_delivery_cancel_ng_kbn");
        valueList.add(":production_stop_kbn");
        valueList.add(":variety_class4");
        valueList.add(":yobi2");
        valueList.add(":barcode");
        valueList.add(":data_send_kbn");
        valueList.add(":yobi3");
        valueList.add(":upc_code");
        valueList.add(":normal_1_stock");
        valueList.add(":normal_2_stock");
        valueList.add(":normal_3_stock");
        valueList.add(":normal_4_stock");
        valueList.add(":normal_5_stock");
        valueList.add(":normal_1_instructions");
        valueList.add(":normal_2_instructions");
        valueList.add(":normal_3_instructions");
        valueList.add(":normal_4_instructions");
        valueList.add(":normal_1_provision");
        valueList.add(":normal_2_provision");
        valueList.add(":normal_3_provision");
        valueList.add(":normal_4_provision");
        valueList.add(":comm_this_month_leftorcer");
        valueList.add(":comm_next_month_leftorcer");
        valueList.add(":comm_two_next_month_leftorcer");
        valueList.add(":exp_this_month_leftorcer");
        valueList.add(":exp_next_month_leftorcer");
        valueList.add(":exp_two_next_month_leftorcer");
        valueList.add(":diy_this_month_leftorcer");
        valueList.add(":diy_next_month_leftorcer");
        valueList.add(":diy_two_next_month_leftorcer");
        valueList.add(":normal_1_warehousing_plan");
        valueList.add(":normal_2_warehousing_plan");
        valueList.add(":normal_3_warehousing_plan");
        valueList.add(":normal_4_warehousing_plan");
        valueList.add(":sapporo_stock");
        valueList.add(":sendai_stock");
        valueList.add(":tokyo_stock");
        valueList.add(":kantou_stock");
        valueList.add(":kanazawa_stock");
        valueList.add(":nagoya_stock");
        valueList.add(":kinki_stock");
        valueList.add(":hiroshima_stock");
        valueList.add(":hukuoka_stock");
        valueList.add(":business_stock");
        valueList.add(":trade_stock");
        valueList.add(":high_tech_stock");
        valueList.add(":trade_consig_stock");
        valueList.add(":shanghai_ktc_bonded_stock");
        valueList.add(":package_material_stock");
        valueList.add(":product_end_plan_date");
        valueList.add(":product_end_date");
        valueList.add(":alternative_hinban1");
        valueList.add(":alternative_hinban2");
        valueList.add(":nouki_answer_ng_kbn");
        valueList.add(":direct_delivery_target_kbn");
        valueList.add(":yobi");
        return String.join("\r\n    , ", valueList);
    }

    /** SALES_HINBANの採番処理 */
    private void numbering() {

        if (this.salesHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"SALES_HINBAN\") IS NULL THEN 0 ELSE MAX(e.\"SALES_HINBAN\") * 1 END + 1, 20, '0') AS \"SALES_HINBAN\" FROM MST_SALES_HINBAN_MASTER e WHERE e.\"SALES_HINBAN\" < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SALES_HINBAN");

        this.setSalesHinban(o);
    }

    /**
     * MST_SALES_HINBAN_MASTER更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SALES_HINBAN_MASTERの登録
        String sql = "UPDATE MST_SALES_HINBAN_MASTER\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SALES_HINBAN\" = :sales_hinban");
        setList.add("\"LOW_LEVEL_CODE\" = :low_level_code");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"HINBAN_CODE\" = :hinban_code");
        setList.add("\"ITEM\" = :item");
        setList.add("\"SET_KBN\" = :set_kbn");
        setList.add("\"STRATEGY_PRO_KBN\" = :strategy_pro_kbn");
        setList.add("\"ORDER_BAN_KBN\" = :order_ban_kbn");
        setList.add("\"RESALE_BAN_KBN\" = :resale_ban_kbn");
        setList.add("\"WAREHOUSING_BAN_KBN\" = :warehousing_ban_kbn");
        setList.add("\"PRODUCT_KBN\" = :product_kbn");
        setList.add("\"SHIP_INSTRUCTIONS_KBN\" = :ship_instructions_kbn");
        setList.add("\"PRODUCT_CLASS\" = :product_class");
        setList.add("\"STANDARD_STOCK\" = :standard_stock");
        setList.add("\"PRODUCT_WEIGHT\" = :product_weight");
        setList.add("\"LOCATION_NO\" = :location_no");
        setList.add("\"PACKAGE_CODE\" = :package_code");
        setList.add("\"PACKAGE_UNIT\" = :package_unit");
        setList.add("\"PACKAGE_SHORTAGE_KBN\" = :package_shortage_kbn");
        setList.add("\"PACKING_KBN\" = :packing_kbn");
        setList.add("\"KNBAN_LOT_KBN\" = :knban_lot_kbn");
        setList.add("\"JIS_KBN\" = :jis_kbn");
        setList.add("\"SET_STANDARD_TIME\" = :set_standard_time");
        setList.add("\"END_PERIOD_COST\" = :end_period_cost");
        setList.add("\"STANDARD_COST\" = :standard_cost");
        setList.add("\"SECOND_EVAL_COST\" = :second_eval_cost");
        setList.add("\"STANDARD_PRICE\" = :standard_price");
        setList.add("\"MASTER_REGIST_DATE\" = :master_regist_date");
        setList.add("\"PRODUCT_SALE_DATE\" = :product_sale_date");
        setList.add("\"SHIP_TARGET_KBN\" = :ship_target_kbn");
        setList.add("\"NEW_PRODUCT_CLASS\" = :new_product_class");
        setList.add("\"DIY_CLASSIC_KBN\" = :diy_classic_kbn");
        setList.add("\"STOCK_ORDER_KBN\" = :stock_order_kbn");
        setList.add("\"PRODUCT_OPE_CODE\" = :product_ope_code");
        setList.add("\"DIRECT_DELIVERY_CANCEL_NG_KBN\" = :direct_delivery_cancel_ng_kbn");
        setList.add("\"PRODUCTION_STOP_KBN\" = :production_stop_kbn");
        setList.add("\"VARIETY_CLASS4\" = :variety_class4");
        setList.add("\"YOBI2\" = :yobi2");
        setList.add("\"BARCODE\" = :barcode");
        setList.add("\"DATA_SEND_KBN\" = :data_send_kbn");
        setList.add("\"YOBI3\" = :yobi3");
        setList.add("\"UPC_CODE\" = :upc_code");
        setList.add("\"NORMAL_1_STOCK\" = :normal_1_stock");
        setList.add("\"NORMAL_2_STOCK\" = :normal_2_stock");
        setList.add("\"NORMAL_3_STOCK\" = :normal_3_stock");
        setList.add("\"NORMAL_4_STOCK\" = :normal_4_stock");
        setList.add("\"NORMAL_5_STOCK\" = :normal_5_stock");
        setList.add("\"NORMAL_1_INSTRUCTIONS\" = :normal_1_instructions");
        setList.add("\"NORMAL_2_INSTRUCTIONS\" = :normal_2_instructions");
        setList.add("\"NORMAL_3_INSTRUCTIONS\" = :normal_3_instructions");
        setList.add("\"NORMAL_4_INSTRUCTIONS\" = :normal_4_instructions");
        setList.add("\"NORMAL_1_PROVISION\" = :normal_1_provision");
        setList.add("\"NORMAL_2_PROVISION\" = :normal_2_provision");
        setList.add("\"NORMAL_3_PROVISION\" = :normal_3_provision");
        setList.add("\"NORMAL_4_PROVISION\" = :normal_4_provision");
        setList.add("\"COMM_THIS_MONTH_LEFTORCER\" = :comm_this_month_leftorcer");
        setList.add("\"COMM_NEXT_MONTH_LEFTORCER\" = :comm_next_month_leftorcer");
        setList.add("\"COMM_TWO_NEXT_MONTH_LEFTORCER\" = :comm_two_next_month_leftorcer");
        setList.add("\"EXP_THIS_MONTH_LEFTORCER\" = :exp_this_month_leftorcer");
        setList.add("\"EXP_NEXT_MONTH_LEFTORCER\" = :exp_next_month_leftorcer");
        setList.add("\"EXP_TWO_NEXT_MONTH_LEFTORCER\" = :exp_two_next_month_leftorcer");
        setList.add("\"DIY_THIS_MONTH_LEFTORCER\" = :diy_this_month_leftorcer");
        setList.add("\"DIY_NEXT_MONTH_LEFTORCER\" = :diy_next_month_leftorcer");
        setList.add("\"DIY_TWO_NEXT_MONTH_LEFTORCER\" = :diy_two_next_month_leftorcer");
        setList.add("\"NORMAL_1_WAREHOUSING_PLAN\" = :normal_1_warehousing_plan");
        setList.add("\"NORMAL_2_WAREHOUSING_PLAN\" = :normal_2_warehousing_plan");
        setList.add("\"NORMAL_3_WAREHOUSING_PLAN\" = :normal_3_warehousing_plan");
        setList.add("\"NORMAL_4_WAREHOUSING_PLAN\" = :normal_4_warehousing_plan");
        setList.add("\"SAPPORO_STOCK\" = :sapporo_stock");
        setList.add("\"SENDAI_STOCK\" = :sendai_stock");
        setList.add("\"TOKYO_STOCK\" = :tokyo_stock");
        setList.add("\"KANTOU_STOCK\" = :kantou_stock");
        setList.add("\"KANAZAWA_STOCK\" = :kanazawa_stock");
        setList.add("\"NAGOYA_STOCK\" = :nagoya_stock");
        setList.add("\"KINKI_STOCK\" = :kinki_stock");
        setList.add("\"HIROSHIMA_STOCK\" = :hiroshima_stock");
        setList.add("\"HUKUOKA_STOCK\" = :hukuoka_stock");
        setList.add("\"BUSINESS_STOCK\" = :business_stock");
        setList.add("\"TRADE_STOCK\" = :trade_stock");
        setList.add("\"HIGH_TECH_STOCK\" = :high_tech_stock");
        setList.add("\"TRADE_CONSIG_STOCK\" = :trade_consig_stock");
        setList.add("\"SHANGHAI_KTC_BONDED_STOCK\" = :shanghai_ktc_bonded_stock");
        setList.add("\"PACKAGE_MATERIAL_STOCK\" = :package_material_stock");
        setList.add("\"PRODUCT_END_PLAN_DATE\" = :product_end_plan_date");
        setList.add("\"PRODUCT_END_DATE\" = :product_end_date");
        setList.add("\"ALTERNATIVE_HINBAN1\" = :alternative_hinban1");
        setList.add("\"ALTERNATIVE_HINBAN2\" = :alternative_hinban2");
        setList.add("\"NOUKI_ANSWER_NG_KBN\" = :nouki_answer_ng_kbn");
        setList.add("\"DIRECT_DELIVERY_TARGET_KBN\" = :direct_delivery_target_kbn");
        setList.add("\"YOBI\" = :yobi");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SALES_HINBAN_MASTER削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SALES_HINBAN_MASTERの削除
        String sql = "DELETE FROM MST_SALES_HINBAN_MASTER WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SALES_HINBAN\") = TRIM (:sales_hinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sales_hinban", this.salesHinban);
        params.put("low_level_code", this.lowLevelCode);
        params.put("delete_flag", this.deleteFlag);
        params.put("hinban_code", this.hinbanCode);
        params.put("item", this.item);
        params.put("set_kbn", this.setKbn);
        params.put("strategy_pro_kbn", this.strategyProKbn);
        params.put("order_ban_kbn", this.orderBanKbn);
        params.put("resale_ban_kbn", this.resaleBanKbn);
        params.put("warehousing_ban_kbn", this.warehousingBanKbn);
        params.put("product_kbn", this.productKbn);
        params.put("ship_instructions_kbn", this.shipInstructionsKbn);
        params.put("product_class", this.productClass);
        params.put("standard_stock", this.standardStock);
        params.put("product_weight", this.productWeight);
        params.put("location_no", this.locationNo);
        params.put("package_code", this.packageCode);
        params.put("package_unit", this.packageUnit);
        params.put("package_shortage_kbn", this.packageShortageKbn);
        params.put("packing_kbn", this.packingKbn);
        params.put("knban_lot_kbn", this.knbanLotKbn);
        params.put("jis_kbn", this.jisKbn);
        params.put("set_standard_time", this.setStandardTime);
        params.put("end_period_cost", this.endPeriodCost);
        params.put("standard_cost", this.standardCost);
        params.put("second_eval_cost", this.secondEvalCost);
        params.put("standard_price", this.standardPrice);
        params.put("master_regist_date", this.masterRegistDate);
        params.put("product_sale_date", this.productSaleDate);
        params.put("ship_target_kbn", this.shipTargetKbn);
        params.put("new_product_class", this.newProductClass);
        params.put("diy_classic_kbn", this.diyClassicKbn);
        params.put("stock_order_kbn", this.stockOrderKbn);
        params.put("product_ope_code", this.productOpeCode);
        params.put("direct_delivery_cancel_ng_kbn", this.directDeliveryCancelNgKbn);
        params.put("production_stop_kbn", this.productionStopKbn);
        params.put("variety_class4", this.varietyClass4);
        params.put("yobi2", this.yobi2);
        params.put("barcode", this.barcode);
        params.put("data_send_kbn", this.dataSendKbn);
        params.put("yobi3", this.yobi3);
        params.put("upc_code", this.upcCode);
        params.put("normal_1_stock", this.normal1Stock);
        params.put("normal_2_stock", this.normal2Stock);
        params.put("normal_3_stock", this.normal3Stock);
        params.put("normal_4_stock", this.normal4Stock);
        params.put("normal_5_stock", this.normal5Stock);
        params.put("normal_1_instructions", this.normal1Instructions);
        params.put("normal_2_instructions", this.normal2Instructions);
        params.put("normal_3_instructions", this.normal3Instructions);
        params.put("normal_4_instructions", this.normal4Instructions);
        params.put("normal_1_provision", this.normal1Provision);
        params.put("normal_2_provision", this.normal2Provision);
        params.put("normal_3_provision", this.normal3Provision);
        params.put("normal_4_provision", this.normal4Provision);
        params.put("comm_this_month_leftorcer", this.commThisMonthLeftorcer);
        params.put("comm_next_month_leftorcer", this.commNextMonthLeftorcer);
        params.put("comm_two_next_month_leftorcer", this.commTwoNextMonthLeftorcer);
        params.put("exp_this_month_leftorcer", this.expThisMonthLeftorcer);
        params.put("exp_next_month_leftorcer", this.expNextMonthLeftorcer);
        params.put("exp_two_next_month_leftorcer", this.expTwoNextMonthLeftorcer);
        params.put("diy_this_month_leftorcer", this.diyThisMonthLeftorcer);
        params.put("diy_next_month_leftorcer", this.diyNextMonthLeftorcer);
        params.put("diy_two_next_month_leftorcer", this.diyTwoNextMonthLeftorcer);
        params.put("normal_1_warehousing_plan", this.normal1WarehousingPlan);
        params.put("normal_2_warehousing_plan", this.normal2WarehousingPlan);
        params.put("normal_3_warehousing_plan", this.normal3WarehousingPlan);
        params.put("normal_4_warehousing_plan", this.normal4WarehousingPlan);
        params.put("sapporo_stock", this.sapporoStock);
        params.put("sendai_stock", this.sendaiStock);
        params.put("tokyo_stock", this.tokyoStock);
        params.put("kantou_stock", this.kantouStock);
        params.put("kanazawa_stock", this.kanazawaStock);
        params.put("nagoya_stock", this.nagoyaStock);
        params.put("kinki_stock", this.kinkiStock);
        params.put("hiroshima_stock", this.hiroshimaStock);
        params.put("hukuoka_stock", this.hukuokaStock);
        params.put("business_stock", this.businessStock);
        params.put("trade_stock", this.tradeStock);
        params.put("high_tech_stock", this.highTechStock);
        params.put("trade_consig_stock", this.tradeConsigStock);
        params.put("shanghai_ktc_bonded_stock", this.shanghaiKtcBondedStock);
        params.put("package_material_stock", this.packageMaterialStock);
        params.put("product_end_plan_date", this.productEndPlanDate);
        params.put("product_end_date", this.productEndDate);
        params.put("alternative_hinban1", this.alternativeHinban1);
        params.put("alternative_hinban2", this.alternativeHinban2);
        params.put("nouki_answer_ng_kbn", this.noukiAnswerNgKbn);
        params.put("direct_delivery_target_kbn", this.directDeliveryTargetKbn);
        params.put("yobi", this.yobi);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
