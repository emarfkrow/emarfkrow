/**
 * PRD_M_SUP_BUDGET_OUT_BKグリッド定義
 */

let PrdMSupBudgetOutBkGridColumns = [
    Column.text('YYYY', Messages['PrdMSupBudgetOutBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdMSupBudgetOutBkGrid.mm'], 20, '', null),
    Column.text('HINBAN', Messages['PrdMSupBudgetOutBkGrid.hinban'], 250, '', null),
    Column.text('ROUTING', Messages['PrdMSupBudgetOutBkGrid.routing'], 20, '', null),
    Column.refer('WC_CODE', Messages['PrdMSupBudgetOutBkGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('OPE_DETAIL', Messages['PrdMSupBudgetOutBkGrid.opeDetail'], 100, '', null),
    Column.refer('SUP_CODE', Messages['PrdMSupBudgetOutBkGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('ORDER_COUNTS', Messages['PrdMSupBudgetOutBkGrid.orderCounts'], 70, '', null),
    Column.text('ORDER_UNIT', Messages['PrdMSupBudgetOutBkGrid.orderUnit'], 90, '', null),
    Column.text('ORDER_AMOUNT', Messages['PrdMSupBudgetOutBkGrid.orderAmount'], 110, '', null),
    Column.select('ITEM_KBN', Messages['PrdMSupBudgetOutBkGrid.itemKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMSupBudgetOutBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMSupBudgetOutBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMSupBudgetOutBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMSupBudgetOutBkGrid.userIdChange'], 100, 'metaInfo', null),
];
