/**
 * MFG_RATE_BKグリッド定義
 */

let MfgRateBkGridColumns = [
    Column.cell('YY', Messages['MfgRateBkGrid.yy'], 40, 'primaryKey', null),
    Column.cell('RATE_CODE', Messages['MfgRateBkGrid.rateCode'], 100, 'primaryKey', null),
    Column.select('IN_OUT_KBN', Messages['MfgRateBkGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('RATE_KBN', Messages['MfgRateBkGrid.rateKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HUM_LABOR_COST_FIRST', Messages['MfgRateBkGrid.humLaborCostFirst'], 90, '', null),
    Column.text('HUM_EXPENSES_FIRST', Messages['MfgRateBkGrid.humExpensesFirst'], 90, '', null),
    Column.text('HUM_LABOR_COST_SECOND', Messages['MfgRateBkGrid.humLaborCostSecond'], 90, '', null),
    Column.text('HUM_EXPENSES_SECOND', Messages['MfgRateBkGrid.humExpensesSecond'], 90, '', null),
    Column.text('MAC_LABOR_COST_FIRST', Messages['MfgRateBkGrid.macLaborCostFirst'], 90, '', null),
    Column.text('MAC_EXPENSES_FIRST', Messages['MfgRateBkGrid.macExpensesFirst'], 90, '', null),
    Column.text('MAC_LABOR_COST_SECOND', Messages['MfgRateBkGrid.macLaborCostSecond'], 90, '', null),
    Column.text('MAC_EXPENSES_SECOND', Messages['MfgRateBkGrid.macExpensesSecond'], 90, '', null),
    Column.text('OUT_COST_SECOND', Messages['MfgRateBkGrid.outCostSecond'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgRateBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgRateBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgRateBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgRateBkGrid.userIdChange'], 100, 'metaInfo', null),
];
