/**
 * PRD_Y_PRO_PLAN_HINBANグリッド定義
 */

let PrdYProPlanHinbanGridColumns = [
    Column.cell('YYYY', Messages['PrdYProPlanHinbanGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdYProPlanHinbanGrid.mm'], 20, 'primaryKey', null),
    Column.cell('PRO_HINBAN', Messages['PrdYProPlanHinbanGrid.proHinban'], 250, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PrdYProPlanHinbanGrid.hinban'], 250, 'primaryKey', null),
    Column.select('ITEM_KBN', Messages['PrdYProPlanHinbanGrid.itemKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SHIKAKE_KBN', Messages['PrdYProPlanHinbanGrid.shikakeKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('NES_COUNTS', Messages['PrdYProPlanHinbanGrid.nesCounts'], 100, '', null),
    Column.text('PARENT_HINBAN', Messages['PrdYProPlanHinbanGrid.parentHinban'], 250, '', null),
    Column.text('PRO_LT', Messages['PrdYProPlanHinbanGrid.proLt'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdYProPlanHinbanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdYProPlanHinbanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdYProPlanHinbanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdYProPlanHinbanGrid.userIdChange'], 100, 'metaInfo', null),
];
