/**
 * MST_SALES_HINBAN_MASTERグリッド定義
 */

let MstSalesHinbanMasterGridColumns = [
    Column.cell('SALES_HINBAN', Messages['MstSalesHinbanMasterGrid.salesHinban'], 200, 'primaryKey', null),
    Column.select('LOW_LEVEL_CODE', Messages['MstSalesHinbanMasterGrid.lowLevelCode'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.check('DELETE_FLAG', Messages['MstSalesHinbanMasterGrid.deleteFlag'], 10, ''),
    Column.select('HINBAN_CODE', Messages['MstSalesHinbanMasterGrid.hinbanCode'], 200, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('ITEM', Messages['MstSalesHinbanMasterGrid.item'], 100, '', null),
    Column.select('SET_KBN', Messages['MstSalesHinbanMasterGrid.setKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('STRATEGY_PRO_KBN', Messages['MstSalesHinbanMasterGrid.strategyProKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('ORDER_BAN_KBN', Messages['MstSalesHinbanMasterGrid.orderBanKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('RESALE_BAN_KBN', Messages['MstSalesHinbanMasterGrid.resaleBanKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('WAREHOUSING_BAN_KBN', Messages['MstSalesHinbanMasterGrid.warehousingBanKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PRODUCT_KBN', Messages['MstSalesHinbanMasterGrid.productKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SHIP_INSTRUCTIONS_KBN', Messages['MstSalesHinbanMasterGrid.shipInstructionsKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PRODUCT_CLASS', Messages['MstSalesHinbanMasterGrid.productClass'], 20, '', null),
    Column.text('STANDARD_STOCK', Messages['MstSalesHinbanMasterGrid.standardStock'], 80, '', null),
    Column.text('PRODUCT_WEIGHT', Messages['MstSalesHinbanMasterGrid.productWeight'], 70, '', null),
    Column.text('LOCATION_NO', Messages['MstSalesHinbanMasterGrid.locationNo'], 100, '', null),
    Column.select('PACKAGE_CODE', Messages['MstSalesHinbanMasterGrid.packageCode'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PACKAGE_UNIT', Messages['MstSalesHinbanMasterGrid.packageUnit'], 70, '', null),
    Column.select('PACKAGE_SHORTAGE_KBN', Messages['MstSalesHinbanMasterGrid.packageShortageKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PACKING_KBN', Messages['MstSalesHinbanMasterGrid.packingKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('KNBAN_LOT_KBN', Messages['MstSalesHinbanMasterGrid.knbanLotKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('JIS_KBN', Messages['MstSalesHinbanMasterGrid.jisKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('SET_STANDARD_TIME', Messages['MstSalesHinbanMasterGrid.setStandardTime'], 40, '', null),
    Column.text('END_PERIOD_COST', Messages['MstSalesHinbanMasterGrid.endPeriodCost'], 90, '', null),
    Column.text('STANDARD_COST', Messages['MstSalesHinbanMasterGrid.standardCost'], 90, '', null),
    Column.text('SECOND_EVAL_COST', Messages['MstSalesHinbanMasterGrid.secondEvalCost'], 90, '', null),
    Column.text('STANDARD_PRICE', Messages['MstSalesHinbanMasterGrid.standardPrice'], 90, '', null),
    Column.date('MASTER_REGIST_DATE', Messages['MstSalesHinbanMasterGrid.masterRegistDate'], 80, '', null),
    Column.date('PRODUCT_SALE_DATE', Messages['MstSalesHinbanMasterGrid.productSaleDate'], 80, '', null),
    Column.select('SHIP_TARGET_KBN', Messages['MstSalesHinbanMasterGrid.shipTargetKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('NEW_PRODUCT_CLASS', Messages['MstSalesHinbanMasterGrid.newProductClass'], 20, '', null),
    Column.select('DIY_CLASSIC_KBN', Messages['MstSalesHinbanMasterGrid.diyClassicKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('STOCK_ORDER_KBN', Messages['MstSalesHinbanMasterGrid.stockOrderKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PRODUCT_OPE_CODE', Messages['MstSalesHinbanMasterGrid.productOpeCode'], 30, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('DIRECT_DELIVERY_CANCEL_NG_KBN', Messages['MstSalesHinbanMasterGrid.directDeliveryCancelNgKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PRODUCTION_STOP_KBN', Messages['MstSalesHinbanMasterGrid.productionStopKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('VARIETY_CLASS4', Messages['MstSalesHinbanMasterGrid.varietyClass4'], 20, '', null),
    Column.text('YOBI2', Messages['MstSalesHinbanMasterGrid.yobi2'], 10, '', null),
    Column.text('BARCODE', Messages['MstSalesHinbanMasterGrid.barcode'], 130, '', null),
    Column.select('DATA_SEND_KBN', Messages['MstSalesHinbanMasterGrid.dataSendKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('YOBI3', Messages['MstSalesHinbanMasterGrid.yobi3'], 60, '', null),
    Column.select('UPC_CODE', Messages['MstSalesHinbanMasterGrid.upcCode'], 120, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('NORMAL_1_STOCK', Messages['MstSalesHinbanMasterGrid.normal1Stock'], 80, '', null),
    Column.text('NORMAL_2_STOCK', Messages['MstSalesHinbanMasterGrid.normal2Stock'], 80, '', null),
    Column.text('NORMAL_3_STOCK', Messages['MstSalesHinbanMasterGrid.normal3Stock'], 80, '', null),
    Column.text('NORMAL_4_STOCK', Messages['MstSalesHinbanMasterGrid.normal4Stock'], 80, '', null),
    Column.text('NORMAL_5_STOCK', Messages['MstSalesHinbanMasterGrid.normal5Stock'], 80, '', null),
    Column.text('NORMAL_1_INSTRUCTIONS', Messages['MstSalesHinbanMasterGrid.normal1Instructions'], 80, '', null),
    Column.text('NORMAL_2_INSTRUCTIONS', Messages['MstSalesHinbanMasterGrid.normal2Instructions'], 80, '', null),
    Column.text('NORMAL_3_INSTRUCTIONS', Messages['MstSalesHinbanMasterGrid.normal3Instructions'], 80, '', null),
    Column.text('NORMAL_4_INSTRUCTIONS', Messages['MstSalesHinbanMasterGrid.normal4Instructions'], 80, '', null),
    Column.text('NORMAL_1_PROVISION', Messages['MstSalesHinbanMasterGrid.normal1Provision'], 80, '', null),
    Column.text('NORMAL_2_PROVISION', Messages['MstSalesHinbanMasterGrid.normal2Provision'], 80, '', null),
    Column.text('NORMAL_3_PROVISION', Messages['MstSalesHinbanMasterGrid.normal3Provision'], 80, '', null),
    Column.text('NORMAL_4_PROVISION', Messages['MstSalesHinbanMasterGrid.normal4Provision'], 80, '', null),
    Column.text('COMM_THIS_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.commThisMonthLeftorcer'], 80, '', null),
    Column.text('COMM_NEXT_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.commNextMonthLeftorcer'], 80, '', null),
    Column.text('COMM_TWO_NEXT_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.commTwoNextMonthLeftorcer'], 80, '', null),
    Column.text('EXP_THIS_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.expThisMonthLeftorcer'], 80, '', null),
    Column.text('EXP_NEXT_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.expNextMonthLeftorcer'], 80, '', null),
    Column.text('EXP_TWO_NEXT_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.expTwoNextMonthLeftorcer'], 80, '', null),
    Column.text('DIY_THIS_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.diyThisMonthLeftorcer'], 80, '', null),
    Column.text('DIY_NEXT_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.diyNextMonthLeftorcer'], 80, '', null),
    Column.text('DIY_TWO_NEXT_MONTH_LEFTORCER', Messages['MstSalesHinbanMasterGrid.diyTwoNextMonthLeftorcer'], 80, '', null),
    Column.text('NORMAL_1_WAREHOUSING_PLAN', Messages['MstSalesHinbanMasterGrid.normal1WarehousingPlan'], 80, '', null),
    Column.text('NORMAL_2_WAREHOUSING_PLAN', Messages['MstSalesHinbanMasterGrid.normal2WarehousingPlan'], 80, '', null),
    Column.text('NORMAL_3_WAREHOUSING_PLAN', Messages['MstSalesHinbanMasterGrid.normal3WarehousingPlan'], 80, '', null),
    Column.text('NORMAL_4_WAREHOUSING_PLAN', Messages['MstSalesHinbanMasterGrid.normal4WarehousingPlan'], 80, '', null),
    Column.text('SAPPORO_STOCK', Messages['MstSalesHinbanMasterGrid.sapporoStock'], 80, '', null),
    Column.text('SENDAI_STOCK', Messages['MstSalesHinbanMasterGrid.sendaiStock'], 80, '', null),
    Column.text('TOKYO_STOCK', Messages['MstSalesHinbanMasterGrid.tokyoStock'], 80, '', null),
    Column.text('KANTOU_STOCK', Messages['MstSalesHinbanMasterGrid.kantouStock'], 80, '', null),
    Column.text('KANAZAWA_STOCK', Messages['MstSalesHinbanMasterGrid.kanazawaStock'], 80, '', null),
    Column.text('NAGOYA_STOCK', Messages['MstSalesHinbanMasterGrid.nagoyaStock'], 80, '', null),
    Column.text('KINKI_STOCK', Messages['MstSalesHinbanMasterGrid.kinkiStock'], 80, '', null),
    Column.text('HIROSHIMA_STOCK', Messages['MstSalesHinbanMasterGrid.hiroshimaStock'], 80, '', null),
    Column.text('HUKUOKA_STOCK', Messages['MstSalesHinbanMasterGrid.hukuokaStock'], 80, '', null),
    Column.text('BUSINESS_STOCK', Messages['MstSalesHinbanMasterGrid.businessStock'], 80, '', null),
    Column.text('TRADE_STOCK', Messages['MstSalesHinbanMasterGrid.tradeStock'], 80, '', null),
    Column.text('HIGH_TECH_STOCK', Messages['MstSalesHinbanMasterGrid.highTechStock'], 80, '', null),
    Column.text('TRADE_CONSIG_STOCK', Messages['MstSalesHinbanMasterGrid.tradeConsigStock'], 80, '', null),
    Column.text('SHANGHAI_KTC_BONDED_STOCK', Messages['MstSalesHinbanMasterGrid.shanghaiKtcBondedStock'], 80, '', null),
    Column.text('PACKAGE_MATERIAL_STOCK', Messages['MstSalesHinbanMasterGrid.packageMaterialStock'], 80, '', null),
    Column.date('PRODUCT_END_PLAN_DATE', Messages['MstSalesHinbanMasterGrid.productEndPlanDate'], 80, '', null),
    Column.date('PRODUCT_END_DATE', Messages['MstSalesHinbanMasterGrid.productEndDate'], 80, '', null),
    Column.text('ALTERNATIVE_HINBAN1', Messages['MstSalesHinbanMasterGrid.alternativeHinban1'], 200, '', null),
    Column.text('ALTERNATIVE_HINBAN2', Messages['MstSalesHinbanMasterGrid.alternativeHinban2'], 200, '', null),
    Column.select('NOUKI_ANSWER_NG_KBN', Messages['MstSalesHinbanMasterGrid.noukiAnswerNgKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('DIRECT_DELIVERY_TARGET_KBN', Messages['MstSalesHinbanMasterGrid.directDeliveryTargetKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.date('YOBI', Messages['MstSalesHinbanMasterGrid.yobi'], 230, '', null),
];
