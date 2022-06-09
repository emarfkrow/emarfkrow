/**
 * PRD_Y_PRO_PLAN_ROUTINGグリッド定義
 */

let PrdYProPlanRoutingGridColumns = [
    Column.cell('YYYY', Messages['PrdYProPlanRoutingGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdYProPlanRoutingGrid.mm'], 20, 'primaryKey', null),
    Column.refer('PRO_HINBAN', Messages['PrdYProPlanRoutingGrid.proHinban'], 250, 'primaryKey', 'PRO_HINMEI'),
    Column.cell('HINBAN', Messages['PrdYProPlanRoutingGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['PrdYProPlanRoutingGrid.routing'], 20, 'primaryKey', null),
    Column.text('OPE_DETAIL', Messages['PrdYProPlanRoutingGrid.opeDetail'], 100, '', null),
    Column.refer('WC_CODE', Messages['PrdYProPlanRoutingGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('WSCODE', Messages['PrdYProPlanRoutingGrid.wscode'], 40, '', null),
    Column.select('IN_OUT_KBN', Messages['PrdYProPlanRoutingGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('SUP_CODE', Messages['PrdYProPlanRoutingGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('NES_COUNTS', Messages['PrdYProPlanRoutingGrid.nesCounts'], 70, '', null),
    Column.select('MAC_LOAD_KBN', Messages['PrdYProPlanRoutingGrid.macLoadKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HUM_PRE_TIME', Messages['PrdYProPlanRoutingGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdYProPlanRoutingGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME', Messages['PrdYProPlanRoutingGrid.macPreTime'], 70, '', null),
    Column.text('MAC_ACT_TIME', Messages['PrdYProPlanRoutingGrid.macActTime'], 70, '', null),
    Column.text('COMMENT1', Messages['PrdYProPlanRoutingGrid.comment1'], 250, '', null),
    Column.text('COMMENT2', Messages['PrdYProPlanRoutingGrid.comment2'], 250, '', null),
    Column.text('UNIT_WEIGHT', Messages['PrdYProPlanRoutingGrid.unitWeight'], 110, '', null),
    Column.text('ORDER_UNIT_PRICE', Messages['PrdYProPlanRoutingGrid.orderUnitPrice'], 90, '', null),
    Column.text('PROC_LT', Messages['PrdYProPlanRoutingGrid.procLt'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdYProPlanRoutingGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdYProPlanRoutingGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdYProPlanRoutingGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdYProPlanRoutingGrid.userIdChange'], 100, 'metaInfo', null),
];
