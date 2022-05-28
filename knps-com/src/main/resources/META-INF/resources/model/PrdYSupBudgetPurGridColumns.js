/**
 * PRD_Y_SUP_BUDGET_PURグリッド定義
 */

let PrdYSupBudgetPurGridColumns = [
    Column.cell('YYYY', Messages['PrdYSupBudgetPurGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdYSupBudgetPurGrid.mm'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PrdYSupBudgetPurGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUP_CODE', Messages['PrdYSupBudgetPurGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.text('ORDER_COUNTS', Messages['PrdYSupBudgetPurGrid.orderCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['PrdYSupBudgetPurGrid.orderUnit'], 90, '', null),
    Column.text('ORDER_AMOUNT', Messages['PrdYSupBudgetPurGrid.orderAmount'], 110, '', null),
    Column.select('ITEM_KBN', Messages['PrdYSupBudgetPurGrid.itemKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdYSupBudgetPurGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdYSupBudgetPurGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdYSupBudgetPurGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdYSupBudgetPurGrid.userIdChange'], 100, 'metaInfo', null),
];
