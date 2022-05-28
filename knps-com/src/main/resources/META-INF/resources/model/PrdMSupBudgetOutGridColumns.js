/**
 * PRD_M_SUP_BUDGET_OUTグリッド定義
 */

let PrdMSupBudgetOutGridColumns = [
    Column.cell('YYYY', Messages['PrdMSupBudgetOutGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMSupBudgetOutGrid.mm'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PrdMSupBudgetOutGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['PrdMSupBudgetOutGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['PrdMSupBudgetOutGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('OPE_DETAIL', Messages['PrdMSupBudgetOutGrid.opeDetail'], 100, '', null),
    Column.refer('SUP_CODE', Messages['PrdMSupBudgetOutGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('ORDER_COUNTS', Messages['PrdMSupBudgetOutGrid.orderCounts'], 70, '', null),
    Column.text('ORDER_UNIT', Messages['PrdMSupBudgetOutGrid.orderUnit'], 90, '', null),
    Column.text('ORDER_AMOUNT', Messages['PrdMSupBudgetOutGrid.orderAmount'], 110, '', null),
    Column.select('ITEM_KBN', Messages['PrdMSupBudgetOutGrid.itemKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMSupBudgetOutGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMSupBudgetOutGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMSupBudgetOutGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMSupBudgetOutGrid.userIdChange'], 100, 'metaInfo', null),
];
