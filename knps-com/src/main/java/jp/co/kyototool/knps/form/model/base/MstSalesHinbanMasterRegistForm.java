package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SALES_HINBAN_MASTER登録フォーム
 *
 * @author emarfkrow
 */
public class MstSalesHinbanMasterRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSalesHinbanMasterRegistForm.class);

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

    /** LOW_LEVEL_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String lowLevelCode;

    /**
     * @return LOW_LEVEL_CODE
     */
    public String getLowLevelCode() {
        return lowLevelCode;
    }

    /**
     * @param p LOW_LEVEL_CODE
     */
    public void setLowLevelCode(final String p) {
        this.lowLevelCode = p;
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

    /** HINBAN_CODE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String hinbanCode;

    /**
     * @return HINBAN_CODE
     */
    public String getHinbanCode() {
        return hinbanCode;
    }

    /**
     * @param p HINBAN_CODE
     */
    public void setHinbanCode(final String p) {
        this.hinbanCode = p;
    }

    /** ITEM */
    @jakarta.validation.constraints.Size(max = 10)
    private String item;

    /**
     * @return ITEM
     */
    public String getItem() {
        return item;
    }

    /**
     * @param p ITEM
     */
    public void setItem(final String p) {
        this.item = p;
    }

    /** SET_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String setKbn;

    /**
     * @return SET_KBN
     */
    public String getSetKbn() {
        return setKbn;
    }

    /**
     * @param p SET_KBN
     */
    public void setSetKbn(final String p) {
        this.setKbn = p;
    }

    /** STRATEGY_PRO_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String strategyProKbn;

    /**
     * @return STRATEGY_PRO_KBN
     */
    public String getStrategyProKbn() {
        return strategyProKbn;
    }

    /**
     * @param p STRATEGY_PRO_KBN
     */
    public void setStrategyProKbn(final String p) {
        this.strategyProKbn = p;
    }

    /** ORDER_BAN_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String orderBanKbn;

    /**
     * @return ORDER_BAN_KBN
     */
    public String getOrderBanKbn() {
        return orderBanKbn;
    }

    /**
     * @param p ORDER_BAN_KBN
     */
    public void setOrderBanKbn(final String p) {
        this.orderBanKbn = p;
    }

    /** RESALE_BAN_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String resaleBanKbn;

    /**
     * @return RESALE_BAN_KBN
     */
    public String getResaleBanKbn() {
        return resaleBanKbn;
    }

    /**
     * @param p RESALE_BAN_KBN
     */
    public void setResaleBanKbn(final String p) {
        this.resaleBanKbn = p;
    }

    /** WAREHOUSING_BAN_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String warehousingBanKbn;

    /**
     * @return WAREHOUSING_BAN_KBN
     */
    public String getWarehousingBanKbn() {
        return warehousingBanKbn;
    }

    /**
     * @param p WAREHOUSING_BAN_KBN
     */
    public void setWarehousingBanKbn(final String p) {
        this.warehousingBanKbn = p;
    }

    /** PRODUCT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String productKbn;

    /**
     * @return PRODUCT_KBN
     */
    public String getProductKbn() {
        return productKbn;
    }

    /**
     * @param p PRODUCT_KBN
     */
    public void setProductKbn(final String p) {
        this.productKbn = p;
    }

    /** SHIP_INSTRUCTIONS_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String shipInstructionsKbn;

    /**
     * @return SHIP_INSTRUCTIONS_KBN
     */
    public String getShipInstructionsKbn() {
        return shipInstructionsKbn;
    }

    /**
     * @param p SHIP_INSTRUCTIONS_KBN
     */
    public void setShipInstructionsKbn(final String p) {
        this.shipInstructionsKbn = p;
    }

    /** PRODUCT_CLASS */
    @jakarta.validation.constraints.Size(max = 2)
    private String productClass;

    /**
     * @return PRODUCT_CLASS
     */
    public String getProductClass() {
        return productClass;
    }

    /**
     * @param p PRODUCT_CLASS
     */
    public void setProductClass(final String p) {
        this.productClass = p;
    }

    /** STANDARD_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String standardStock;

    /**
     * @return STANDARD_STOCK
     */
    public String getStandardStock() {
        return standardStock;
    }

    /**
     * @param p STANDARD_STOCK
     */
    public void setStandardStock(final String p) {
        this.standardStock = p;
    }

    /** PRODUCT_WEIGHT */
    @jakarta.validation.constraints.Size(max = 7)
    private String productWeight;

    /**
     * @return PRODUCT_WEIGHT
     */
    public String getProductWeight() {
        return productWeight;
    }

    /**
     * @param p PRODUCT_WEIGHT
     */
    public void setProductWeight(final String p) {
        this.productWeight = p;
    }

    /** LOCATION_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String locationNo;

    /**
     * @return LOCATION_NO
     */
    public String getLocationNo() {
        return locationNo;
    }

    /**
     * @param p LOCATION_NO
     */
    public void setLocationNo(final String p) {
        this.locationNo = p;
    }

    /** PACKAGE_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String packageCode;

    /**
     * @return PACKAGE_CODE
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * @param p PACKAGE_CODE
     */
    public void setPackageCode(final String p) {
        this.packageCode = p;
    }

    /** PACKAGE_UNIT */
    @jakarta.validation.constraints.Size(max = 7)
    private String packageUnit;

    /**
     * @return PACKAGE_UNIT
     */
    public String getPackageUnit() {
        return packageUnit;
    }

    /**
     * @param p PACKAGE_UNIT
     */
    public void setPackageUnit(final String p) {
        this.packageUnit = p;
    }

    /** PACKAGE_SHORTAGE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String packageShortageKbn;

    /**
     * @return PACKAGE_SHORTAGE_KBN
     */
    public String getPackageShortageKbn() {
        return packageShortageKbn;
    }

    /**
     * @param p PACKAGE_SHORTAGE_KBN
     */
    public void setPackageShortageKbn(final String p) {
        this.packageShortageKbn = p;
    }

    /** PACKING_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String packingKbn;

    /**
     * @return PACKING_KBN
     */
    public String getPackingKbn() {
        return packingKbn;
    }

    /**
     * @param p PACKING_KBN
     */
    public void setPackingKbn(final String p) {
        this.packingKbn = p;
    }

    /** KNBAN_LOT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String knbanLotKbn;

    /**
     * @return KNBAN_LOT_KBN
     */
    public String getKnbanLotKbn() {
        return knbanLotKbn;
    }

    /**
     * @param p KNBAN_LOT_KBN
     */
    public void setKnbanLotKbn(final String p) {
        this.knbanLotKbn = p;
    }

    /** JIS_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String jisKbn;

    /**
     * @return JIS_KBN
     */
    public String getJisKbn() {
        return jisKbn;
    }

    /**
     * @param p JIS_KBN
     */
    public void setJisKbn(final String p) {
        this.jisKbn = p;
    }

    /** SET_STANDARD_TIME */
    @jakarta.validation.constraints.Size(max = 4)
    private String setStandardTime;

    /**
     * @return SET_STANDARD_TIME
     */
    public String getSetStandardTime() {
        return setStandardTime;
    }

    /**
     * @param p SET_STANDARD_TIME
     */
    public void setSetStandardTime(final String p) {
        this.setStandardTime = p;
    }

    /** END_PERIOD_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String endPeriodCost;

    /**
     * @return END_PERIOD_COST
     */
    public String getEndPeriodCost() {
        return endPeriodCost;
    }

    /**
     * @param p END_PERIOD_COST
     */
    public void setEndPeriodCost(final String p) {
        this.endPeriodCost = p;
    }

    /** STANDARD_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String standardCost;

    /**
     * @return STANDARD_COST
     */
    public String getStandardCost() {
        return standardCost;
    }

    /**
     * @param p STANDARD_COST
     */
    public void setStandardCost(final String p) {
        this.standardCost = p;
    }

    /** SECOND_EVAL_COST */
    @jakarta.validation.constraints.Size(max = 9)
    private String secondEvalCost;

    /**
     * @return SECOND_EVAL_COST
     */
    public String getSecondEvalCost() {
        return secondEvalCost;
    }

    /**
     * @param p SECOND_EVAL_COST
     */
    public void setSecondEvalCost(final String p) {
        this.secondEvalCost = p;
    }

    /** STANDARD_PRICE */
    @jakarta.validation.constraints.Size(max = 9)
    private String standardPrice;

    /**
     * @return STANDARD_PRICE
     */
    public String getStandardPrice() {
        return standardPrice;
    }

    /**
     * @param p STANDARD_PRICE
     */
    public void setStandardPrice(final String p) {
        this.standardPrice = p;
    }

    /** MASTER_REGIST_DATE */
    @jakarta.validation.constraints.Size(max = 8)
    private String masterRegistDate;

    /**
     * @return MASTER_REGIST_DATE
     */
    public String getMasterRegistDate() {
        return masterRegistDate;
    }

    /**
     * @param p MASTER_REGIST_DATE
     */
    public void setMasterRegistDate(final String p) {
        this.masterRegistDate = p;
    }

    /** PRODUCT_SALE_DATE */
    @jakarta.validation.constraints.Size(max = 8)
    private String productSaleDate;

    /**
     * @return PRODUCT_SALE_DATE
     */
    public String getProductSaleDate() {
        return productSaleDate;
    }

    /**
     * @param p PRODUCT_SALE_DATE
     */
    public void setProductSaleDate(final String p) {
        this.productSaleDate = p;
    }

    /** SHIP_TARGET_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String shipTargetKbn;

    /**
     * @return SHIP_TARGET_KBN
     */
    public String getShipTargetKbn() {
        return shipTargetKbn;
    }

    /**
     * @param p SHIP_TARGET_KBN
     */
    public void setShipTargetKbn(final String p) {
        this.shipTargetKbn = p;
    }

    /** NEW_PRODUCT_CLASS */
    @jakarta.validation.constraints.Size(max = 2)
    private String newProductClass;

    /**
     * @return NEW_PRODUCT_CLASS
     */
    public String getNewProductClass() {
        return newProductClass;
    }

    /**
     * @param p NEW_PRODUCT_CLASS
     */
    public void setNewProductClass(final String p) {
        this.newProductClass = p;
    }

    /** DIY_CLASSIC_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String diyClassicKbn;

    /**
     * @return DIY_CLASSIC_KBN
     */
    public String getDiyClassicKbn() {
        return diyClassicKbn;
    }

    /**
     * @param p DIY_CLASSIC_KBN
     */
    public void setDiyClassicKbn(final String p) {
        this.diyClassicKbn = p;
    }

    /** STOCK_ORDER_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String stockOrderKbn;

    /**
     * @return STOCK_ORDER_KBN
     */
    public String getStockOrderKbn() {
        return stockOrderKbn;
    }

    /**
     * @param p STOCK_ORDER_KBN
     */
    public void setStockOrderKbn(final String p) {
        this.stockOrderKbn = p;
    }

    /** PRODUCT_OPE_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String productOpeCode;

    /**
     * @return PRODUCT_OPE_CODE
     */
    public String getProductOpeCode() {
        return productOpeCode;
    }

    /**
     * @param p PRODUCT_OPE_CODE
     */
    public void setProductOpeCode(final String p) {
        this.productOpeCode = p;
    }

    /** DIRECT_DELIVERY_CANCEL_NG_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String directDeliveryCancelNgKbn;

    /**
     * @return DIRECT_DELIVERY_CANCEL_NG_KBN
     */
    public String getDirectDeliveryCancelNgKbn() {
        return directDeliveryCancelNgKbn;
    }

    /**
     * @param p DIRECT_DELIVERY_CANCEL_NG_KBN
     */
    public void setDirectDeliveryCancelNgKbn(final String p) {
        this.directDeliveryCancelNgKbn = p;
    }

    /** PRODUCTION_STOP_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String productionStopKbn;

    /**
     * @return PRODUCTION_STOP_KBN
     */
    public String getProductionStopKbn() {
        return productionStopKbn;
    }

    /**
     * @param p PRODUCTION_STOP_KBN
     */
    public void setProductionStopKbn(final String p) {
        this.productionStopKbn = p;
    }

    /** VARIETY_CLASS4 */
    @jakarta.validation.constraints.Size(max = 2)
    private String varietyClass4;

    /**
     * @return VARIETY_CLASS4
     */
    public String getVarietyClass4() {
        return varietyClass4;
    }

    /**
     * @param p VARIETY_CLASS4
     */
    public void setVarietyClass4(final String p) {
        this.varietyClass4 = p;
    }

    /** YOBI2 */
    @jakarta.validation.constraints.Size(max = 1)
    private String yobi2;

    /**
     * @return YOBI2
     */
    public String getYobi2() {
        return yobi2;
    }

    /**
     * @param p YOBI2
     */
    public void setYobi2(final String p) {
        this.yobi2 = p;
    }

    /** BARCODE */
    @jakarta.validation.constraints.Size(max = 13)
    private String barcode;

    /**
     * @return BARCODE
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param p BARCODE
     */
    public void setBarcode(final String p) {
        this.barcode = p;
    }

    /** DATA_SEND_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String dataSendKbn;

    /**
     * @return DATA_SEND_KBN
     */
    public String getDataSendKbn() {
        return dataSendKbn;
    }

    /**
     * @param p DATA_SEND_KBN
     */
    public void setDataSendKbn(final String p) {
        this.dataSendKbn = p;
    }

    /** YOBI3 */
    @jakarta.validation.constraints.Size(max = 6)
    private String yobi3;

    /**
     * @return YOBI3
     */
    public String getYobi3() {
        return yobi3;
    }

    /**
     * @param p YOBI3
     */
    public void setYobi3(final String p) {
        this.yobi3 = p;
    }

    /** UPC_CODE */
    @jakarta.validation.constraints.Size(max = 12)
    private String upcCode;

    /**
     * @return UPC_CODE
     */
    public String getUpcCode() {
        return upcCode;
    }

    /**
     * @param p UPC_CODE
     */
    public void setUpcCode(final String p) {
        this.upcCode = p;
    }

    /** NORMAL_1_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal1Stock;

    /**
     * @return NORMAL_1_STOCK
     */
    public String getNormal1Stock() {
        return normal1Stock;
    }

    /**
     * @param p NORMAL_1_STOCK
     */
    public void setNormal1Stock(final String p) {
        this.normal1Stock = p;
    }

    /** NORMAL_2_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal2Stock;

    /**
     * @return NORMAL_2_STOCK
     */
    public String getNormal2Stock() {
        return normal2Stock;
    }

    /**
     * @param p NORMAL_2_STOCK
     */
    public void setNormal2Stock(final String p) {
        this.normal2Stock = p;
    }

    /** NORMAL_3_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal3Stock;

    /**
     * @return NORMAL_3_STOCK
     */
    public String getNormal3Stock() {
        return normal3Stock;
    }

    /**
     * @param p NORMAL_3_STOCK
     */
    public void setNormal3Stock(final String p) {
        this.normal3Stock = p;
    }

    /** NORMAL_4_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal4Stock;

    /**
     * @return NORMAL_4_STOCK
     */
    public String getNormal4Stock() {
        return normal4Stock;
    }

    /**
     * @param p NORMAL_4_STOCK
     */
    public void setNormal4Stock(final String p) {
        this.normal4Stock = p;
    }

    /** NORMAL_5_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal5Stock;

    /**
     * @return NORMAL_5_STOCK
     */
    public String getNormal5Stock() {
        return normal5Stock;
    }

    /**
     * @param p NORMAL_5_STOCK
     */
    public void setNormal5Stock(final String p) {
        this.normal5Stock = p;
    }

    /** NORMAL_1_INSTRUCTIONS */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal1Instructions;

    /**
     * @return NORMAL_1_INSTRUCTIONS
     */
    public String getNormal1Instructions() {
        return normal1Instructions;
    }

    /**
     * @param p NORMAL_1_INSTRUCTIONS
     */
    public void setNormal1Instructions(final String p) {
        this.normal1Instructions = p;
    }

    /** NORMAL_2_INSTRUCTIONS */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal2Instructions;

    /**
     * @return NORMAL_2_INSTRUCTIONS
     */
    public String getNormal2Instructions() {
        return normal2Instructions;
    }

    /**
     * @param p NORMAL_2_INSTRUCTIONS
     */
    public void setNormal2Instructions(final String p) {
        this.normal2Instructions = p;
    }

    /** NORMAL_3_INSTRUCTIONS */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal3Instructions;

    /**
     * @return NORMAL_3_INSTRUCTIONS
     */
    public String getNormal3Instructions() {
        return normal3Instructions;
    }

    /**
     * @param p NORMAL_3_INSTRUCTIONS
     */
    public void setNormal3Instructions(final String p) {
        this.normal3Instructions = p;
    }

    /** NORMAL_4_INSTRUCTIONS */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal4Instructions;

    /**
     * @return NORMAL_4_INSTRUCTIONS
     */
    public String getNormal4Instructions() {
        return normal4Instructions;
    }

    /**
     * @param p NORMAL_4_INSTRUCTIONS
     */
    public void setNormal4Instructions(final String p) {
        this.normal4Instructions = p;
    }

    /** NORMAL_1_PROVISION */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal1Provision;

    /**
     * @return NORMAL_1_PROVISION
     */
    public String getNormal1Provision() {
        return normal1Provision;
    }

    /**
     * @param p NORMAL_1_PROVISION
     */
    public void setNormal1Provision(final String p) {
        this.normal1Provision = p;
    }

    /** NORMAL_2_PROVISION */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal2Provision;

    /**
     * @return NORMAL_2_PROVISION
     */
    public String getNormal2Provision() {
        return normal2Provision;
    }

    /**
     * @param p NORMAL_2_PROVISION
     */
    public void setNormal2Provision(final String p) {
        this.normal2Provision = p;
    }

    /** NORMAL_3_PROVISION */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal3Provision;

    /**
     * @return NORMAL_3_PROVISION
     */
    public String getNormal3Provision() {
        return normal3Provision;
    }

    /**
     * @param p NORMAL_3_PROVISION
     */
    public void setNormal3Provision(final String p) {
        this.normal3Provision = p;
    }

    /** NORMAL_4_PROVISION */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal4Provision;

    /**
     * @return NORMAL_4_PROVISION
     */
    public String getNormal4Provision() {
        return normal4Provision;
    }

    /**
     * @param p NORMAL_4_PROVISION
     */
    public void setNormal4Provision(final String p) {
        this.normal4Provision = p;
    }

    /** COMM_THIS_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String commThisMonthLeftorcer;

    /**
     * @return COMM_THIS_MONTH_LEFTORCER
     */
    public String getCommThisMonthLeftorcer() {
        return commThisMonthLeftorcer;
    }

    /**
     * @param p COMM_THIS_MONTH_LEFTORCER
     */
    public void setCommThisMonthLeftorcer(final String p) {
        this.commThisMonthLeftorcer = p;
    }

    /** COMM_NEXT_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String commNextMonthLeftorcer;

    /**
     * @return COMM_NEXT_MONTH_LEFTORCER
     */
    public String getCommNextMonthLeftorcer() {
        return commNextMonthLeftorcer;
    }

    /**
     * @param p COMM_NEXT_MONTH_LEFTORCER
     */
    public void setCommNextMonthLeftorcer(final String p) {
        this.commNextMonthLeftorcer = p;
    }

    /** COMM_TWO_NEXT_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String commTwoNextMonthLeftorcer;

    /**
     * @return COMM_TWO_NEXT_MONTH_LEFTORCER
     */
    public String getCommTwoNextMonthLeftorcer() {
        return commTwoNextMonthLeftorcer;
    }

    /**
     * @param p COMM_TWO_NEXT_MONTH_LEFTORCER
     */
    public void setCommTwoNextMonthLeftorcer(final String p) {
        this.commTwoNextMonthLeftorcer = p;
    }

    /** EXP_THIS_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String expThisMonthLeftorcer;

    /**
     * @return EXP_THIS_MONTH_LEFTORCER
     */
    public String getExpThisMonthLeftorcer() {
        return expThisMonthLeftorcer;
    }

    /**
     * @param p EXP_THIS_MONTH_LEFTORCER
     */
    public void setExpThisMonthLeftorcer(final String p) {
        this.expThisMonthLeftorcer = p;
    }

    /** EXP_NEXT_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String expNextMonthLeftorcer;

    /**
     * @return EXP_NEXT_MONTH_LEFTORCER
     */
    public String getExpNextMonthLeftorcer() {
        return expNextMonthLeftorcer;
    }

    /**
     * @param p EXP_NEXT_MONTH_LEFTORCER
     */
    public void setExpNextMonthLeftorcer(final String p) {
        this.expNextMonthLeftorcer = p;
    }

    /** EXP_TWO_NEXT_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String expTwoNextMonthLeftorcer;

    /**
     * @return EXP_TWO_NEXT_MONTH_LEFTORCER
     */
    public String getExpTwoNextMonthLeftorcer() {
        return expTwoNextMonthLeftorcer;
    }

    /**
     * @param p EXP_TWO_NEXT_MONTH_LEFTORCER
     */
    public void setExpTwoNextMonthLeftorcer(final String p) {
        this.expTwoNextMonthLeftorcer = p;
    }

    /** DIY_THIS_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String diyThisMonthLeftorcer;

    /**
     * @return DIY_THIS_MONTH_LEFTORCER
     */
    public String getDiyThisMonthLeftorcer() {
        return diyThisMonthLeftorcer;
    }

    /**
     * @param p DIY_THIS_MONTH_LEFTORCER
     */
    public void setDiyThisMonthLeftorcer(final String p) {
        this.diyThisMonthLeftorcer = p;
    }

    /** DIY_NEXT_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String diyNextMonthLeftorcer;

    /**
     * @return DIY_NEXT_MONTH_LEFTORCER
     */
    public String getDiyNextMonthLeftorcer() {
        return diyNextMonthLeftorcer;
    }

    /**
     * @param p DIY_NEXT_MONTH_LEFTORCER
     */
    public void setDiyNextMonthLeftorcer(final String p) {
        this.diyNextMonthLeftorcer = p;
    }

    /** DIY_TWO_NEXT_MONTH_LEFTORCER */
    @jakarta.validation.constraints.Size(max = 8)
    private String diyTwoNextMonthLeftorcer;

    /**
     * @return DIY_TWO_NEXT_MONTH_LEFTORCER
     */
    public String getDiyTwoNextMonthLeftorcer() {
        return diyTwoNextMonthLeftorcer;
    }

    /**
     * @param p DIY_TWO_NEXT_MONTH_LEFTORCER
     */
    public void setDiyTwoNextMonthLeftorcer(final String p) {
        this.diyTwoNextMonthLeftorcer = p;
    }

    /** NORMAL_1_WAREHOUSING_PLAN */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal1WarehousingPlan;

    /**
     * @return NORMAL_1_WAREHOUSING_PLAN
     */
    public String getNormal1WarehousingPlan() {
        return normal1WarehousingPlan;
    }

    /**
     * @param p NORMAL_1_WAREHOUSING_PLAN
     */
    public void setNormal1WarehousingPlan(final String p) {
        this.normal1WarehousingPlan = p;
    }

    /** NORMAL_2_WAREHOUSING_PLAN */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal2WarehousingPlan;

    /**
     * @return NORMAL_2_WAREHOUSING_PLAN
     */
    public String getNormal2WarehousingPlan() {
        return normal2WarehousingPlan;
    }

    /**
     * @param p NORMAL_2_WAREHOUSING_PLAN
     */
    public void setNormal2WarehousingPlan(final String p) {
        this.normal2WarehousingPlan = p;
    }

    /** NORMAL_3_WAREHOUSING_PLAN */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal3WarehousingPlan;

    /**
     * @return NORMAL_3_WAREHOUSING_PLAN
     */
    public String getNormal3WarehousingPlan() {
        return normal3WarehousingPlan;
    }

    /**
     * @param p NORMAL_3_WAREHOUSING_PLAN
     */
    public void setNormal3WarehousingPlan(final String p) {
        this.normal3WarehousingPlan = p;
    }

    /** NORMAL_4_WAREHOUSING_PLAN */
    @jakarta.validation.constraints.Size(max = 8)
    private String normal4WarehousingPlan;

    /**
     * @return NORMAL_4_WAREHOUSING_PLAN
     */
    public String getNormal4WarehousingPlan() {
        return normal4WarehousingPlan;
    }

    /**
     * @param p NORMAL_4_WAREHOUSING_PLAN
     */
    public void setNormal4WarehousingPlan(final String p) {
        this.normal4WarehousingPlan = p;
    }

    /** SAPPORO_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String sapporoStock;

    /**
     * @return SAPPORO_STOCK
     */
    public String getSapporoStock() {
        return sapporoStock;
    }

    /**
     * @param p SAPPORO_STOCK
     */
    public void setSapporoStock(final String p) {
        this.sapporoStock = p;
    }

    /** SENDAI_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String sendaiStock;

    /**
     * @return SENDAI_STOCK
     */
    public String getSendaiStock() {
        return sendaiStock;
    }

    /**
     * @param p SENDAI_STOCK
     */
    public void setSendaiStock(final String p) {
        this.sendaiStock = p;
    }

    /** TOKYO_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String tokyoStock;

    /**
     * @return TOKYO_STOCK
     */
    public String getTokyoStock() {
        return tokyoStock;
    }

    /**
     * @param p TOKYO_STOCK
     */
    public void setTokyoStock(final String p) {
        this.tokyoStock = p;
    }

    /** KANTOU_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String kantouStock;

    /**
     * @return KANTOU_STOCK
     */
    public String getKantouStock() {
        return kantouStock;
    }

    /**
     * @param p KANTOU_STOCK
     */
    public void setKantouStock(final String p) {
        this.kantouStock = p;
    }

    /** KANAZAWA_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String kanazawaStock;

    /**
     * @return KANAZAWA_STOCK
     */
    public String getKanazawaStock() {
        return kanazawaStock;
    }

    /**
     * @param p KANAZAWA_STOCK
     */
    public void setKanazawaStock(final String p) {
        this.kanazawaStock = p;
    }

    /** NAGOYA_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String nagoyaStock;

    /**
     * @return NAGOYA_STOCK
     */
    public String getNagoyaStock() {
        return nagoyaStock;
    }

    /**
     * @param p NAGOYA_STOCK
     */
    public void setNagoyaStock(final String p) {
        this.nagoyaStock = p;
    }

    /** KINKI_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String kinkiStock;

    /**
     * @return KINKI_STOCK
     */
    public String getKinkiStock() {
        return kinkiStock;
    }

    /**
     * @param p KINKI_STOCK
     */
    public void setKinkiStock(final String p) {
        this.kinkiStock = p;
    }

    /** HIROSHIMA_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String hiroshimaStock;

    /**
     * @return HIROSHIMA_STOCK
     */
    public String getHiroshimaStock() {
        return hiroshimaStock;
    }

    /**
     * @param p HIROSHIMA_STOCK
     */
    public void setHiroshimaStock(final String p) {
        this.hiroshimaStock = p;
    }

    /** HUKUOKA_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String hukuokaStock;

    /**
     * @return HUKUOKA_STOCK
     */
    public String getHukuokaStock() {
        return hukuokaStock;
    }

    /**
     * @param p HUKUOKA_STOCK
     */
    public void setHukuokaStock(final String p) {
        this.hukuokaStock = p;
    }

    /** BUSINESS_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String businessStock;

    /**
     * @return BUSINESS_STOCK
     */
    public String getBusinessStock() {
        return businessStock;
    }

    /**
     * @param p BUSINESS_STOCK
     */
    public void setBusinessStock(final String p) {
        this.businessStock = p;
    }

    /** TRADE_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String tradeStock;

    /**
     * @return TRADE_STOCK
     */
    public String getTradeStock() {
        return tradeStock;
    }

    /**
     * @param p TRADE_STOCK
     */
    public void setTradeStock(final String p) {
        this.tradeStock = p;
    }

    /** HIGH_TECH_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String highTechStock;

    /**
     * @return HIGH_TECH_STOCK
     */
    public String getHighTechStock() {
        return highTechStock;
    }

    /**
     * @param p HIGH_TECH_STOCK
     */
    public void setHighTechStock(final String p) {
        this.highTechStock = p;
    }

    /** TRADE_CONSIG_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String tradeConsigStock;

    /**
     * @return TRADE_CONSIG_STOCK
     */
    public String getTradeConsigStock() {
        return tradeConsigStock;
    }

    /**
     * @param p TRADE_CONSIG_STOCK
     */
    public void setTradeConsigStock(final String p) {
        this.tradeConsigStock = p;
    }

    /** SHANGHAI_KTC_BONDED_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String shanghaiKtcBondedStock;

    /**
     * @return SHANGHAI_KTC_BONDED_STOCK
     */
    public String getShanghaiKtcBondedStock() {
        return shanghaiKtcBondedStock;
    }

    /**
     * @param p SHANGHAI_KTC_BONDED_STOCK
     */
    public void setShanghaiKtcBondedStock(final String p) {
        this.shanghaiKtcBondedStock = p;
    }

    /** PACKAGE_MATERIAL_STOCK */
    @jakarta.validation.constraints.Size(max = 8)
    private String packageMaterialStock;

    /**
     * @return PACKAGE_MATERIAL_STOCK
     */
    public String getPackageMaterialStock() {
        return packageMaterialStock;
    }

    /**
     * @param p PACKAGE_MATERIAL_STOCK
     */
    public void setPackageMaterialStock(final String p) {
        this.packageMaterialStock = p;
    }

    /** PRODUCT_END_PLAN_DATE */
    @jakarta.validation.constraints.Size(max = 8)
    private String productEndPlanDate;

    /**
     * @return PRODUCT_END_PLAN_DATE
     */
    public String getProductEndPlanDate() {
        return productEndPlanDate;
    }

    /**
     * @param p PRODUCT_END_PLAN_DATE
     */
    public void setProductEndPlanDate(final String p) {
        this.productEndPlanDate = p;
    }

    /** PRODUCT_END_DATE */
    @jakarta.validation.constraints.Size(max = 8)
    private String productEndDate;

    /**
     * @return PRODUCT_END_DATE
     */
    public String getProductEndDate() {
        return productEndDate;
    }

    /**
     * @param p PRODUCT_END_DATE
     */
    public void setProductEndDate(final String p) {
        this.productEndDate = p;
    }

    /** ALTERNATIVE_HINBAN1 */
    @jakarta.validation.constraints.Size(max = 20)
    private String alternativeHinban1;

    /**
     * @return ALTERNATIVE_HINBAN1
     */
    public String getAlternativeHinban1() {
        return alternativeHinban1;
    }

    /**
     * @param p ALTERNATIVE_HINBAN1
     */
    public void setAlternativeHinban1(final String p) {
        this.alternativeHinban1 = p;
    }

    /** ALTERNATIVE_HINBAN2 */
    @jakarta.validation.constraints.Size(max = 20)
    private String alternativeHinban2;

    /**
     * @return ALTERNATIVE_HINBAN2
     */
    public String getAlternativeHinban2() {
        return alternativeHinban2;
    }

    /**
     * @param p ALTERNATIVE_HINBAN2
     */
    public void setAlternativeHinban2(final String p) {
        this.alternativeHinban2 = p;
    }

    /** NOUKI_ANSWER_NG_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String noukiAnswerNgKbn;

    /**
     * @return NOUKI_ANSWER_NG_KBN
     */
    public String getNoukiAnswerNgKbn() {
        return noukiAnswerNgKbn;
    }

    /**
     * @param p NOUKI_ANSWER_NG_KBN
     */
    public void setNoukiAnswerNgKbn(final String p) {
        this.noukiAnswerNgKbn = p;
    }

    /** DIRECT_DELIVERY_TARGET_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String directDeliveryTargetKbn;

    /**
     * @return DIRECT_DELIVERY_TARGET_KBN
     */
    public String getDirectDeliveryTargetKbn() {
        return directDeliveryTargetKbn;
    }

    /**
     * @param p DIRECT_DELIVERY_TARGET_KBN
     */
    public void setDirectDeliveryTargetKbn(final String p) {
        this.directDeliveryTargetKbn = p;
    }

    /** YOBI */
    @jakarta.validation.constraints.Size(max = 23)
    private String yobi;

    /**
     * @return YOBI
     */
    public String getYobi() {
        return yobi;
    }

    /**
     * @param p YOBI
     */
    public void setYobi(final String p) {
        this.yobi = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
