/**
 * MFG_TOTAL_COST_REG_LINE_Mグリッド定義
 */

let MfgTotalCostRegLineMGridColumns = [
    Column.cell('YY', Messages['MfgTotalCostRegLineMGrid.yy'], 40, 'primaryKey', null),
    Column.cell('PRO_GROUP_NO', Messages['MfgTotalCostRegLineMGrid.proGroupNo'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['MfgTotalCostRegLineMGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['MfgTotalCostRegLineMGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['MfgTotalCostRegLineMGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.refer('SUP_CODE', Messages['MfgTotalCostRegLineMGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('OPE_DETAIL', Messages['MfgTotalCostRegLineMGrid.opeDetail'], 100, '', null),
    Column.cell('MM', Messages['MfgTotalCostRegLineMGrid.mm'], 20, 'primaryKey', null),
    Column.select('LAST_ROUTING_KBN', Messages['MfgTotalCostRegLineMGrid.lastRoutingKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.check('TOTAL_COST_TARGET_FLAG', Messages['MfgTotalCostRegLineMGrid.totalCostTargetFlag'], 10, ''),
    Column.select('COST_RATE_KBN', Messages['MfgTotalCostRegLineMGrid.costRateKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('UNIT_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.unitCostFirst'], 90, '', null),
    Column.text('UNIT_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.unitCostSecond'], 90, '', null),
    Column.text('TOTAL_UNIT_COST', Messages['MfgTotalCostRegLineMGrid.totalUnitCost'], 90, '', null),
    Column.text('SUM_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.sumCostFirst'], 90, '', null),
    Column.text('SUM_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.sumCostSecond'], 90, '', null),
    Column.text('TOTAL_SUM_COST', Messages['MfgTotalCostRegLineMGrid.totalSumCost'], 90, '', null),
    Column.text('OPE_COUNTS', Messages['MfgTotalCostRegLineMGrid.opeCounts'], 50, '', null),
    Column.text('OPE_AMOUNTS', Messages['MfgTotalCostRegLineMGrid.opeAmounts'], 120, '', null),
    Column.text('UNIT_WEIGHT', Messages['MfgTotalCostRegLineMGrid.unitWeight'], 110, '', null),
    Column.text('OPE_TIME', Messages['MfgTotalCostRegLineMGrid.opeTime'], 90, '', null),
    Column.text('HUM_PRE_TIME', Messages['MfgTotalCostRegLineMGrid.humPreTime'], 90, '', null),
    Column.text('HUM_ACT_TIME', Messages['MfgTotalCostRegLineMGrid.humActTime'], 90, '', null),
    Column.text('MAC_PRE_TIME', Messages['MfgTotalCostRegLineMGrid.macPreTime'], 90, '', null),
    Column.text('MAC_ACT_TIME', Messages['MfgTotalCostRegLineMGrid.macActTime'], 90, '', null),
    Column.text('SUM_UNIT_SUPPLY', Messages['MfgTotalCostRegLineMGrid.sumUnitSupply'], 100, '', null),
    Column.text('MATERIALS_COST', Messages['MfgTotalCostRegLineMGrid.materialsCost'], 90, '', null),
    Column.text('HUM_LABOR_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.humLaborCostFirst'], 90, '', null),
    Column.text('HUM_EXPENSES_FIRST', Messages['MfgTotalCostRegLineMGrid.humExpensesFirst'], 90, '', null),
    Column.text('HUM_LABOR_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.humLaborCostSecond'], 90, '', null),
    Column.text('HUM_EXPENSES_SECOND', Messages['MfgTotalCostRegLineMGrid.humExpensesSecond'], 90, '', null),
    Column.text('MAC_LABOR_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.macLaborCostFirst'], 90, '', null),
    Column.text('MAC_EXPENSES_FIRST', Messages['MfgTotalCostRegLineMGrid.macExpensesFirst'], 90, '', null),
    Column.text('MAC_LABOR_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.macLaborCostSecond'], 90, '', null),
    Column.text('MAC_EXPENSES_SECOND', Messages['MfgTotalCostRegLineMGrid.macExpensesSecond'], 90, '', null),
    Column.select('DATA_SOURCE_KBN', Messages['MfgTotalCostRegLineMGrid.dataSourceKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('T_UNIT_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.tUnitCostFirst'], 90, '', null),
    Column.text('T_UNIT_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.tUnitCostSecond'], 90, '', null),
    Column.text('T_TOTAL_UNIT_COST', Messages['MfgTotalCostRegLineMGrid.tTotalUnitCost'], 90, '', null),
    Column.text('T_SUM_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.tSumCostFirst'], 90, '', null),
    Column.text('T_SUM_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.tSumCostSecond'], 90, '', null),
    Column.text('T_TOTAL_SUM_COST', Messages['MfgTotalCostRegLineMGrid.tTotalSumCost'], 90, '', null),
    Column.text('T_OPE_COUNTS', Messages['MfgTotalCostRegLineMGrid.tOpeCounts'], 30, '', null),
    Column.text('T_OPE_AMOUNTS', Messages['MfgTotalCostRegLineMGrid.tOpeAmounts'], 110, '', null),
    Column.text('T_UNIT_WEIGHT', Messages['MfgTotalCostRegLineMGrid.tUnitWeight'], 110, '', null),
    Column.text('T_OPE_TIME', Messages['MfgTotalCostRegLineMGrid.tOpeTime'], 70, '', null),
    Column.text('T_HUM_PRE_TIME', Messages['MfgTotalCostRegLineMGrid.tHumPreTime'], 70, '', null),
    Column.text('T_HUM_ACT_TIME', Messages['MfgTotalCostRegLineMGrid.tHumActTime'], 70, '', null),
    Column.text('T_MAC_PRE_TIME', Messages['MfgTotalCostRegLineMGrid.tMacPreTime'], 70, '', null),
    Column.text('T_MAC_ACT_TIME', Messages['MfgTotalCostRegLineMGrid.tMacActTime'], 70, '', null),
    Column.text('T_SUM_UNIT_SUPPLY', Messages['MfgTotalCostRegLineMGrid.tSumUnitSupply'], 100, '', null),
    Column.text('T_MATERIALS_COST', Messages['MfgTotalCostRegLineMGrid.tMaterialsCost'], 90, '', null),
    Column.text('T_HUM_LABOR_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.tHumLaborCostFirst'], 90, '', null),
    Column.text('T_HUM_EXPENSES_FIRST', Messages['MfgTotalCostRegLineMGrid.tHumExpensesFirst'], 90, '', null),
    Column.text('T_HUM_LABOR_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.tHumLaborCostSecond'], 90, '', null),
    Column.text('T_HUM_EXPENSES_SECOND', Messages['MfgTotalCostRegLineMGrid.tHumExpensesSecond'], 90, '', null),
    Column.text('T_MAC_LABOR_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.tMacLaborCostFirst'], 90, '', null),
    Column.text('T_MAC_EXPENSES_FIRST', Messages['MfgTotalCostRegLineMGrid.tMacExpensesFirst'], 90, '', null),
    Column.text('T_MAC_LABOR_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.tMacLaborCostSecond'], 90, '', null),
    Column.text('T_MAC_EXPENSES_SECOND', Messages['MfgTotalCostRegLineMGrid.tMacExpensesSecond'], 90, '', null),
    Column.select('T_DATA_SOURCE_KBN', Messages['MfgTotalCostRegLineMGrid.tDataSourceKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgTotalCostRegLineMGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgTotalCostRegLineMGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgTotalCostRegLineMGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgTotalCostRegLineMGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('GROSS_SUM_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.grossSumCostFirst'], 90, '', null),
    Column.text('GROSS_SUM_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.grossSumCostSecond'], 90, '', null),
    Column.text('TOTAL_GROSS_SUM_COST', Messages['MfgTotalCostRegLineMGrid.totalGrossSumCost'], 90, '', null),
    Column.text('GROSS_SUM_UNIT_SUPPLY', Messages['MfgTotalCostRegLineMGrid.grossSumUnitSupply'], 100, '', null),
    Column.text('T_GROSS_SUM_COST_FIRST', Messages['MfgTotalCostRegLineMGrid.tGrossSumCostFirst'], 90, '', null),
    Column.text('T_GROSS_SUM_COST_SECOND', Messages['MfgTotalCostRegLineMGrid.tGrossSumCostSecond'], 90, '', null),
    Column.text('T_TOTAL_GROSS_SUM_COST', Messages['MfgTotalCostRegLineMGrid.tTotalGrossSumCost'], 90, '', null),
    Column.text('T_GROSS_SUM_UNIT_SUPPLY', Messages['MfgTotalCostRegLineMGrid.tGrossSumUnitSupply'], 100, '', null),
];
