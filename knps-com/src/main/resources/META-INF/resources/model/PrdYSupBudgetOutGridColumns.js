/**
 * PRD_Y_SUP_BUDGET_OUTグリッド定義
 */

let PrdYSupBudgetOutGridColumns = [
    Column.cell('YYYY', Messages['PrdYSupBudgetOutGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdYSupBudgetOutGrid.mm'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PrdYSupBudgetOutGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['PrdYSupBudgetOutGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['PrdYSupBudgetOutGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('OPE_DETAIL', Messages['PrdYSupBudgetOutGrid.opeDetail'], 100, '', null),
    Column.refer('SUP_CODE', Messages['PrdYSupBudgetOutGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('ORDER_COUNTS', Messages['PrdYSupBudgetOutGrid.orderCounts'], 70, '', null),
    Column.text('ORDER_UNIT', Messages['PrdYSupBudgetOutGrid.orderUnit'], 90, '', null),
    Column.text('ORDER_AMOUNT', Messages['PrdYSupBudgetOutGrid.orderAmount'], 110, '', null),
    Column.select('ITEM_KBN', Messages['PrdYSupBudgetOutGrid.itemKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdYSupBudgetOutGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdYSupBudgetOutGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdYSupBudgetOutGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdYSupBudgetOutGrid.userIdChange'], 100, 'metaInfo', null),
];
