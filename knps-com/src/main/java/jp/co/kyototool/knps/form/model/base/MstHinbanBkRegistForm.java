package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_HINBAN_BK登録フォーム
 *
 * @author emarfkrow
 */
public class MstHinbanBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstHinbanBkRegistForm.class);

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

    /** HINBAN_CODE */
    @jakarta.validation.constraints.Size(max = 10)
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
    @jakarta.validation.constraints.Size(max = 60)
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

    /** ITEM_KBN */
    @jakarta.validation.constraints.Size(max = 2)
    private String itemKbn;

    /**
     * @return ITEM_KBN
     */
    public String getItemKbn() {
        return itemKbn;
    }

    /**
     * @param p ITEM_KBN
     */
    public void setItemKbn(final String p) {
        this.itemKbn = p;
    }

    /** SHIKAKE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String shikakeKbn;

    /**
     * @return SHIKAKE_KBN
     */
    public String getShikakeKbn() {
        return shikakeKbn;
    }

    /**
     * @param p SHIKAKE_KBN
     */
    public void setShikakeKbn(final String p) {
        this.shikakeKbn = p;
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

    /** COUNTS */
    @jakarta.validation.constraints.Size(max = 6)
    private String counts;

    /**
     * @return COUNTS
     */
    public String getCounts() {
        return counts;
    }

    /**
     * @param p COUNTS
     */
    public void setCounts(final String p) {
        this.counts = p;
    }

    /** UNIT_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * @param p UNIT_CODE
     */
    public void setUnitCode(final String p) {
        this.unitCode = p;
    }

    /** ACCOUNT_CODE */
    @jakarta.validation.constraints.Size(max = 5)
    private String accountCode;

    /**
     * @return ACCOUNT_CODE
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * @param p ACCOUNT_CODE
     */
    public void setAccountCode(final String p) {
        this.accountCode = p;
    }

    /** SUPPLY_CHANGE */
    @jakarta.validation.constraints.Size(max = 1)
    private String supplyChange;

    /**
     * @return SUPPLY_CHANGE
     */
    public String getSupplyChange() {
        return supplyChange;
    }

    /**
     * @param p SUPPLY_CHANGE
     */
    public void setSupplyChange(final String p) {
        this.supplyChange = p;
    }

    /** SUPPLY_PERMISSION */
    @jakarta.validation.constraints.Size(max = 1)
    private String supplyPermission;

    /**
     * @return SUPPLY_PERMISSION
     */
    public String getSupplyPermission() {
        return supplyPermission;
    }

    /**
     * @param p SUPPLY_PERMISSION
     */
    public void setSupplyPermission(final String p) {
        this.supplyPermission = p;
    }

    /** OFF_POST_NO */
    @jakarta.validation.constraints.Size(max = 3)
    private String offPostNo;

    /**
     * @return OFF_POST_NO
     */
    public String getOffPostNo() {
        return offPostNo;
    }

    /**
     * @param p OFF_POST_NO
     */
    public void setOffPostNo(final String p) {
        this.offPostNo = p;
    }

    /** ISUUE_POST_NO */
    @jakarta.validation.constraints.Size(max = 4)
    private String isuuePostNo;

    /**
     * @return ISUUE_POST_NO
     */
    public String getIsuuePostNo() {
        return isuuePostNo;
    }

    /**
     * @param p ISUUE_POST_NO
     */
    public void setIsuuePostNo(final String p) {
        this.isuuePostNo = p;
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

    /** STOCKS_KIND_KBN */
    @jakarta.validation.constraints.Size(max = 2)
    private String stocksKindKbn;

    /**
     * @return STOCKS_KIND_KBN
     */
    public String getStocksKindKbn() {
        return stocksKindKbn;
    }

    /**
     * @param p STOCKS_KIND_KBN
     */
    public void setStocksKindKbn(final String p) {
        this.stocksKindKbn = p;
    }

    /** HINGUN_KBN */
    @jakarta.validation.constraints.Size(max = 3)
    private String hingunKbn;

    /**
     * @return HINGUN_KBN
     */
    public String getHingunKbn() {
        return hingunKbn;
    }

    /**
     * @param p HINGUN_KBN
     */
    public void setHingunKbn(final String p) {
        this.hingunKbn = p;
    }

    /** ELEC_INV_CONTROL */
    @jakarta.validation.constraints.Size(max = 1)
    private String elecInvControl;

    /**
     * @return ELEC_INV_CONTROL
     */
    public String getElecInvControl() {
        return elecInvControl;
    }

    /**
     * @param p ELEC_INV_CONTROL
     */
    public void setElecInvControl(final String p) {
        this.elecInvControl = p;
    }

    /** REST_ARTICLE_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String restArticleKbn;

    /**
     * @return REST_ARTICLE_KBN
     */
    public String getRestArticleKbn() {
        return restArticleKbn;
    }

    /**
     * @param p REST_ARTICLE_KBN
     */
    public void setRestArticleKbn(final String p) {
        this.restArticleKbn = p;
    }

    /** REST_ARTICLE_MAX */
    @jakarta.validation.constraints.Size(max = 11)
    private String restArticleMax;

    /**
     * @return REST_ARTICLE_MAX
     */
    public String getRestArticleMax() {
        return restArticleMax;
    }

    /**
     * @param p REST_ARTICLE_MAX
     */
    public void setRestArticleMax(final String p) {
        this.restArticleMax = p;
    }

    /** COST_AMOUNT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String costAmountKbn;

    /**
     * @return COST_AMOUNT_KBN
     */
    public String getCostAmountKbn() {
        return costAmountKbn;
    }

    /**
     * @param p COST_AMOUNT_KBN
     */
    public void setCostAmountKbn(final String p) {
        this.costAmountKbn = p;
    }

    /** F_COST_AMOUNT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String fCostAmountKbn;

    /**
     * @return F_COST_AMOUNT_KBN
     */
    public String getFCostAmountKbn() {
        return fCostAmountKbn;
    }

    /**
     * @param p F_COST_AMOUNT_KBN
     */
    public void setFCostAmountKbn(final String p) {
        this.fCostAmountKbn = p;
    }

    /** S_COST_AMOUNT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String sCostAmountKbn;

    /**
     * @return S_COST_AMOUNT_KBN
     */
    public String getSCostAmountKbn() {
        return sCostAmountKbn;
    }

    /**
     * @param p S_COST_AMOUNT_KBN
     */
    public void setSCostAmountKbn(final String p) {
        this.sCostAmountKbn = p;
    }

    /** HINBAN_OPE_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String hinbanOpeCode;

    /**
     * @return HINBAN_OPE_CODE
     */
    public String getHinbanOpeCode() {
        return hinbanOpeCode;
    }

    /**
     * @param p HINBAN_OPE_CODE
     */
    public void setHinbanOpeCode(final String p) {
        this.hinbanOpeCode = p;
    }

    /** PERMISSION_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String permissionFlag;

    /**
     * @return PERMISSION_FLAG
     */
    public String getPermissionFlag() {
        return permissionFlag;
    }

    /**
     * @param p PERMISSION_FLAG
     */
    public void setPermissionFlag(final String p) {
        this.permissionFlag = p;
    }

    /** VERSION */
    @jakarta.validation.constraints.Size(max = 5)
    private String version;

    /**
     * @return VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param p VERSION
     */
    public void setVersion(final String p) {
        this.version = p;
    }

    /** PLAN_CODE */
    @jakarta.validation.constraints.Size(max = 40)
    private String planCode;

    /**
     * @return PLAN_CODE
     */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * @param p PLAN_CODE
     */
    public void setPlanCode(final String p) {
        this.planCode = p;
    }

    /** POISON_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String poisonKbn;

    /**
     * @return POISON_KBN
     */
    public String getPoisonKbn() {
        return poisonKbn;
    }

    /**
     * @param p POISON_KBN
     */
    public void setPoisonKbn(final String p) {
        this.poisonKbn = p;
    }

    /** MATERIAL */
    @jakarta.validation.constraints.Size(max = 5)
    private String material;

    /**
     * @return MATERIAL
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param p MATERIAL
     */
    public void setMaterial(final String p) {
        this.material = p;
    }

    /** MATERIAL_SIZE */
    @jakarta.validation.constraints.Size(max = 30)
    private String materialSize;

    /**
     * @return MATERIAL_SIZE
     */
    public String getMaterialSize() {
        return materialSize;
    }

    /**
     * @param p MATERIAL_SIZE
     */
    public void setMaterialSize(final String p) {
        this.materialSize = p;
    }

    /** MAKER */
    @jakarta.validation.constraints.Size(max = 30)
    private String maker;

    /**
     * @return MAKER
     */
    public String getMaker() {
        return maker;
    }

    /**
     * @param p MAKER
     */
    public void setMaker(final String p) {
        this.maker = p;
    }

    /** MATERIAL_RECYCLE */
    @jakarta.validation.constraints.Size(max = 5)
    private String materialRecycle;

    /**
     * @return MATERIAL_RECYCLE
     */
    public String getMaterialRecycle() {
        return materialRecycle;
    }

    /**
     * @param p MATERIAL_RECYCLE
     */
    public void setMaterialRecycle(final String p) {
        this.materialRecycle = p;
    }

    /** MAKER_SIMUKE */
    @jakarta.validation.constraints.Size(max = 3)
    private String makerSimuke;

    /**
     * @return MAKER_SIMUKE
     */
    public String getMakerSimuke() {
        return makerSimuke;
    }

    /**
     * @param p MAKER_SIMUKE
     */
    public void setMakerSimuke(final String p) {
        this.makerSimuke = p;
    }

    /** MAKER_WEIGHT */
    @jakarta.validation.constraints.Size(max = 7)
    private String makerWeight;

    /**
     * @return MAKER_WEIGHT
     */
    public String getMakerWeight() {
        return makerWeight;
    }

    /**
     * @param p MAKER_WEIGHT
     */
    public void setMakerWeight(final String p) {
        this.makerWeight = p;
    }

    /** ACT_INV_FIRST */
    @jakarta.validation.constraints.Size(max = 1)
    private String actInvFirst;

    /**
     * @return ACT_INV_FIRST
     */
    public String getActInvFirst() {
        return actInvFirst;
    }

    /**
     * @param p ACT_INV_FIRST
     */
    public void setActInvFirst(final String p) {
        this.actInvFirst = p;
    }

    /** ACT_INV_LAST */
    @jakarta.validation.constraints.Size(max = 1)
    private String actInvLast;

    /**
     * @return ACT_INV_LAST
     */
    public String getActInvLast() {
        return actInvLast;
    }

    /**
     * @param p ACT_INV_LAST
     */
    public void setActInvLast(final String p) {
        this.actInvLast = p;
    }

    /** SUP_UNIT */
    @jakarta.validation.constraints.Size(max = 9)
    private String supUnit;

    /**
     * @return SUP_UNIT
     */
    public String getSupUnit() {
        return supUnit;
    }

    /**
     * @param p SUP_UNIT
     */
    public void setSupUnit(final String p) {
        this.supUnit = p;
    }

    /** ROUTING_DEF_GROUP */
    @jakarta.validation.constraints.Size(max = 2)
    private String routingDefGroup;

    /**
     * @return ROUTING_DEF_GROUP
     */
    public String getRoutingDefGroup() {
        return routingDefGroup;
    }

    /**
     * @param p ROUTING_DEF_GROUP
     */
    public void setRoutingDefGroup(final String p) {
        this.routingDefGroup = p;
    }

    /** COST_CALCULATE_GROUP */
    @jakarta.validation.constraints.Size(max = 2)
    private String costCalculateGroup;

    /**
     * @return COST_CALCULATE_GROUP
     */
    public String getCostCalculateGroup() {
        return costCalculateGroup;
    }

    /**
     * @param p COST_CALCULATE_GROUP
     */
    public void setCostCalculateGroup(final String p) {
        this.costCalculateGroup = p;
    }

    /** KBN1 */
    @jakarta.validation.constraints.Size(max = 5)
    private String kbn1;

    /**
     * @return KBN1
     */
    public String getKbn1() {
        return kbn1;
    }

    /**
     * @param p KBN1
     */
    public void setKbn1(final String p) {
        this.kbn1 = p;
    }

    /** KBN2 */
    @jakarta.validation.constraints.Size(max = 4)
    private String kbn2;

    /**
     * @return KBN2
     */
    public String getKbn2() {
        return kbn2;
    }

    /**
     * @param p KBN2
     */
    public void setKbn2(final String p) {
        this.kbn2 = p;
    }

    /** KBN3 */
    @jakarta.validation.constraints.Size(max = 5)
    private String kbn3;

    /**
     * @return KBN3
     */
    public String getKbn3() {
        return kbn3;
    }

    /**
     * @param p KBN3
     */
    public void setKbn3(final String p) {
        this.kbn3 = p;
    }

    /** STOCK_STATUS */
    @jakarta.validation.constraints.Size(max = 1)
    private String stockStatus;

    /**
     * @return STOCK_STATUS
     */
    public String getStockStatus() {
        return stockStatus;
    }

    /**
     * @param p STOCK_STATUS
     */
    public void setStockStatus(final String p) {
        this.stockStatus = p;
    }

    /** STOCK_STATUS_DATE */
    @jakarta.validation.constraints.Size(max = 8)
    private String stockStatusDate;

    /**
     * @return STOCK_STATUS_DATE
     */
    public String getStockStatusDate() {
        return stockStatusDate;
    }

    /**
     * @param p STOCK_STATUS_DATE
     */
    public void setStockStatusDate(final String p) {
        this.stockStatusDate = p;
    }

    /** PRINT_STRUCTURE_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String printStructureFlg;

    /**
     * @return PRINT_STRUCTURE_FLG
     */
    public String getPrintStructureFlg() {
        return printStructureFlg;
    }

    /**
     * @param p PRINT_STRUCTURE_FLG
     */
    public void setPrintStructureFlg(final String p) {
        this.printStructureFlg = p;
    }

    /** PRINT_WORK_FLOW_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String printWorkFlowFlg;

    /**
     * @return PRINT_WORK_FLOW_FLG
     */
    public String getPrintWorkFlowFlg() {
        return printWorkFlowFlg;
    }

    /**
     * @param p PRINT_WORK_FLOW_FLG
     */
    public void setPrintWorkFlowFlg(final String p) {
        this.printWorkFlowFlg = p;
    }

    /** PRINT_WORK_RESULT_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String printWorkResultFlg;

    /**
     * @return PRINT_WORK_RESULT_FLG
     */
    public String getPrintWorkResultFlg() {
        return printWorkResultFlg;
    }

    /**
     * @param p PRINT_WORK_RESULT_FLG
     */
    public void setPrintWorkResultFlg(final String p) {
        this.printWorkResultFlg = p;
    }

    /** PRINT_SHIP_SHEET_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String printShipSheetFlg;

    /**
     * @return PRINT_SHIP_SHEET_FLG
     */
    public String getPrintShipSheetFlg() {
        return printShipSheetFlg;
    }

    /**
     * @param p PRINT_SHIP_SHEET_FLG
     */
    public void setPrintShipSheetFlg(final String p) {
        this.printShipSheetFlg = p;
    }

    /** PRINT_INSPECT_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String printInspectFlg;

    /**
     * @return PRINT_INSPECT_FLG
     */
    public String getPrintInspectFlg() {
        return printInspectFlg;
    }

    /**
     * @param p PRINT_INSPECT_FLG
     */
    public void setPrintInspectFlg(final String p) {
        this.printInspectFlg = p;
    }

    /** PRINT_PRODUCT_BOX_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String printProductBoxFlg;

    /**
     * @return PRINT_PRODUCT_BOX_FLG
     */
    public String getPrintProductBoxFlg() {
        return printProductBoxFlg;
    }

    /**
     * @param p PRINT_PRODUCT_BOX_FLG
     */
    public void setPrintProductBoxFlg(final String p) {
        this.printProductBoxFlg = p;
    }

    /** PRINT_HINBAN_STRUCT_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String printHinbanStructFlg;

    /**
     * @return PRINT_HINBAN_STRUCT_FLG
     */
    public String getPrintHinbanStructFlg() {
        return printHinbanStructFlg;
    }

    /**
     * @param p PRINT_HINBAN_STRUCT_FLG
     */
    public void setPrintHinbanStructFlg(final String p) {
        this.printHinbanStructFlg = p;
    }

    /** SEMI_PRODUCT_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String semiProductFlg;

    /**
     * @return SEMI_PRODUCT_FLG
     */
    public String getSemiProductFlg() {
        return semiProductFlg;
    }

    /**
     * @param p SEMI_PRODUCT_FLG
     */
    public void setSemiProductFlg(final String p) {
        this.semiProductFlg = p;
    }

    /** STOCK_MANAGEMENT_SECTION */
    @jakarta.validation.constraints.Size(max = 1)
    private String stockManagementSection;

    /**
     * @return STOCK_MANAGEMENT_SECTION
     */
    public String getStockManagementSection() {
        return stockManagementSection;
    }

    /**
     * @param p STOCK_MANAGEMENT_SECTION
     */
    public void setStockManagementSection(final String p) {
        this.stockManagementSection = p;
    }

    /** TOTAL_LT */
    @jakarta.validation.constraints.Size(max = 7)
    private String totalLt;

    /**
     * @return TOTAL_LT
     */
    public String getTotalLt() {
        return totalLt;
    }

    /**
     * @param p TOTAL_LT
     */
    public void setTotalLt(final String p) {
        this.totalLt = p;
    }

    /** COMPANY_DIV_CODE */
    @jakarta.validation.constraints.Size(max = 1)
    private String companyDivCode;

    /**
     * @return COMPANY_DIV_CODE
     */
    public String getCompanyDivCode() {
        return companyDivCode;
    }

    /**
     * @param p COMPANY_DIV_CODE
     */
    public void setCompanyDivCode(final String p) {
        this.companyDivCode = p;
    }

    /** KBN4 */
    @jakarta.validation.constraints.Size(max = 10)
    private String kbn4;

    /**
     * @return KBN4
     */
    public String getKbn4() {
        return kbn4;
    }

    /**
     * @param p KBN4
     */
    public void setKbn4(final String p) {
        this.kbn4 = p;
    }

    /** KBN5 */
    @jakarta.validation.constraints.Size(max = 10)
    private String kbn5;

    /**
     * @return KBN5
     */
    public String getKbn5() {
        return kbn5;
    }

    /**
     * @param p KBN5
     */
    public void setKbn5(final String p) {
        this.kbn5 = p;
    }

    /** KBN6 */
    @jakarta.validation.constraints.Size(max = 10)
    private String kbn6;

    /**
     * @return KBN6
     */
    public String getKbn6() {
        return kbn6;
    }

    /**
     * @param p KBN6
     */
    public void setKbn6(final String p) {
        this.kbn6 = p;
    }

    /** ROHS */
    @jakarta.validation.constraints.Size(max = 1)
    private String rohs;

    /**
     * @return ROHS
     */
    public String getRohs() {
        return rohs;
    }

    /**
     * @param p ROHS
     */
    public void setRohs(final String p) {
        this.rohs = p;
    }

    /** TANTAI_LT */
    @jakarta.validation.constraints.Size(max = 7)
    private String tantaiLt;

    /**
     * @return TANTAI_LT
     */
    public String getTantaiLt() {
        return tantaiLt;
    }

    /**
     * @param p TANTAI_LT
     */
    public void setTantaiLt(final String p) {
        this.tantaiLt = p;
    }

    /** TSUKESU */
    @jakarta.validation.constraints.Size(max = 3)
    private String tsukesu;

    /**
     * @return TSUKESU
     */
    public String getTsukesu() {
        return tsukesu;
    }

    /**
     * @param p TSUKESU
     */
    public void setTsukesu(final String p) {
        this.tsukesu = p;
    }

    /** EX_TAX_RATE */
    @jakarta.validation.constraints.Size(max = 2)
    private String exTaxRate;

    /**
     * @return EX_TAX_RATE
     */
    public String getExTaxRate() {
        return exTaxRate;
    }

    /**
     * @param p EX_TAX_RATE
     */
    public void setExTaxRate(final String p) {
        this.exTaxRate = p;
    }

    /** MEMO */
    @jakarta.validation.constraints.Size(max = 60)
    private String memo;

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param p MEMO
     */
    public void setMemo(final String p) {
        this.memo = p;
    }

    /** HAIBAN_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String haibanKbn;

    /**
     * @return HAIBAN_KBN
     */
    public String getHaibanKbn() {
        return haibanKbn;
    }

    /**
     * @param p HAIBAN_KBN
     */
    public void setHaibanKbn(final String p) {
        this.haibanKbn = p;
    }

    /** HAIBAN_YM */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2})?")
    private String haibanYm;

    /**
     * @return HAIBAN_YM
     */
    public String getHaibanYm() {
        return haibanYm;
    }

    /**
     * @param p HAIBAN_YM
     */
    public void setHaibanYm(final String p) {
        this.haibanYm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
