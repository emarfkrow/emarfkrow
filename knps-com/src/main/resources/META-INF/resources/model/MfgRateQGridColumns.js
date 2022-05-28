/**
 * MFG_RATE_Qグリッド定義
 */

let MfgRateQGridColumns = [
    Column.cell('RATE_CODE', Messages['MfgRateQGrid.rateCode'], 100, 'primaryKey', null),
    Column.select('IN_OUT_KBN', Messages['MfgRateQGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('RATE_KBN', Messages['MfgRateQGrid.rateKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HUM_LABOR_COST_FIRST', Messages['MfgRateQGrid.humLaborCostFirst'], 90, '', null),
    Column.text('HUM_EXPENSES_FIRST', Messages['MfgRateQGrid.humExpensesFirst'], 90, '', null),
    Column.text('HUM_LABOR_COST_SECOND', Messages['MfgRateQGrid.humLaborCostSecond'], 90, '', null),
    Column.text('HUM_EXPENSES_SECOND', Messages['MfgRateQGrid.humExpensesSecond'], 90, '', null),
    Column.text('MAC_LABOR_COST_FIRST', Messages['MfgRateQGrid.macLaborCostFirst'], 90, '', null),
    Column.text('MAC_EXPENSES_FIRST', Messages['MfgRateQGrid.macExpensesFirst'], 90, '', null),
    Column.text('MAC_LABOR_COST_SECOND', Messages['MfgRateQGrid.macLaborCostSecond'], 90, '', null),
    Column.text('MAC_EXPENSES_SECOND', Messages['MfgRateQGrid.macExpensesSecond'], 90, '', null),
    Column.text('OUT_COST_SECOND', Messages['MfgRateQGrid.outCostSecond'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgRateQGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgRateQGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgRateQGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgRateQGrid.userIdChange'], 100, 'metaInfo', null),
];
