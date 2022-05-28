/**
 * PRD_M_SUP_BUDGET_PUR_BKグリッド定義
 */

let PrdMSupBudgetPurBkGridColumns = [
    Column.text('YYYY', Messages['PrdMSupBudgetPurBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdMSupBudgetPurBkGrid.mm'], 20, '', null),
    Column.text('HINBAN', Messages['PrdMSupBudgetPurBkGrid.hinban'], 250, '', null),
    Column.refer('SUP_CODE', Messages['PrdMSupBudgetPurBkGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('ORDER_COUNTS', Messages['PrdMSupBudgetPurBkGrid.orderCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['PrdMSupBudgetPurBkGrid.orderUnit'], 90, '', null),
    Column.text('ORDER_AMOUNT', Messages['PrdMSupBudgetPurBkGrid.orderAmount'], 110, '', null),
    Column.select('ITEM_KBN', Messages['PrdMSupBudgetPurBkGrid.itemKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMSupBudgetPurBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMSupBudgetPurBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMSupBudgetPurBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMSupBudgetPurBkGrid.userIdChange'], 100, 'metaInfo', null),
];
