/**
 * PRD_M_SUP_BUDGET_PURグリッド定義
 */

let PrdMSupBudgetPurGridColumns = [
    Column.cell('YYYY', Messages['PrdMSupBudgetPurGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMSupBudgetPurGrid.mm'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PrdMSupBudgetPurGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUP_CODE', Messages['PrdMSupBudgetPurGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.text('ORDER_COUNTS', Messages['PrdMSupBudgetPurGrid.orderCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['PrdMSupBudgetPurGrid.orderUnit'], 90, '', null),
    Column.text('ORDER_AMOUNT', Messages['PrdMSupBudgetPurGrid.orderAmount'], 110, '', null),
    Column.select('ITEM_KBN', Messages['PrdMSupBudgetPurGrid.itemKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMSupBudgetPurGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMSupBudgetPurGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMSupBudgetPurGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMSupBudgetPurGrid.userIdChange'], 100, 'metaInfo', null),
];
