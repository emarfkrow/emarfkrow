/**
 * MFG_RATEグリッド定義
 */

let MfgRateGridColumns = [
    Column.cell('RATE_CODE', Messages['MfgRateGrid.rateCode'], 100, 'primaryKey', null),
    Column.select('IN_OUT_KBN', Messages['MfgRateGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('RATE_KBN', Messages['MfgRateGrid.rateKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HUM_LABOR_COST_FIRST', Messages['MfgRateGrid.humLaborCostFirst'], 90, '', null),
    Column.text('HUM_EXPENSES_FIRST', Messages['MfgRateGrid.humExpensesFirst'], 90, '', null),
    Column.text('HUM_LABOR_COST_SECOND', Messages['MfgRateGrid.humLaborCostSecond'], 90, '', null),
    Column.text('HUM_EXPENSES_SECOND', Messages['MfgRateGrid.humExpensesSecond'], 90, '', null),
    Column.text('MAC_LABOR_COST_FIRST', Messages['MfgRateGrid.macLaborCostFirst'], 90, '', null),
    Column.text('MAC_EXPENSES_FIRST', Messages['MfgRateGrid.macExpensesFirst'], 90, '', null),
    Column.text('MAC_LABOR_COST_SECOND', Messages['MfgRateGrid.macLaborCostSecond'], 90, '', null),
    Column.text('MAC_EXPENSES_SECOND', Messages['MfgRateGrid.macExpensesSecond'], 90, '', null),
    Column.text('OUT_COST_SECOND', Messages['MfgRateGrid.outCostSecond'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgRateGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgRateGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgRateGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgRateGrid.userIdChange'], 100, 'metaInfo', null),
];
