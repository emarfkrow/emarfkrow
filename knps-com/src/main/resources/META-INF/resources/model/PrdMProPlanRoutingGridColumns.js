/**
 * PRD_M_PRO_PLAN_ROUTINGグリッド定義
 */

let PrdMProPlanRoutingGridColumns = [
    Column.cell('YYYY', Messages['PrdMProPlanRoutingGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMProPlanRoutingGrid.mm'], 20, 'primaryKey', null),
    Column.refer('PRO_HINBAN', Messages['PrdMProPlanRoutingGrid.proHinban'], 250, 'primaryKey', 'PRO_HINMEI'),
    Column.cell('HINBAN', Messages['PrdMProPlanRoutingGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING_GROUP', Messages['PrdMProPlanRoutingGrid.routingGroup'], 20, 'primaryKey', null),
    Column.cell('ROUTING', Messages['PrdMProPlanRoutingGrid.routing'], 20, 'primaryKey', null),
    Column.text('OPE_DETAIL', Messages['PrdMProPlanRoutingGrid.opeDetail'], 100, '', null),
    Column.refer('WC_CODE', Messages['PrdMProPlanRoutingGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('WSCODE', Messages['PrdMProPlanRoutingGrid.wscode'], 40, '', null),
    Column.select('IN_OUT_KBN', Messages['PrdMProPlanRoutingGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('SUP_CODE', Messages['PrdMProPlanRoutingGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('NES_COUNTS', Messages['PrdMProPlanRoutingGrid.nesCounts'], 70, '', null),
    Column.select('MAC_LOAD_KBN', Messages['PrdMProPlanRoutingGrid.macLoadKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HUM_PRE_TIME', Messages['PrdMProPlanRoutingGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdMProPlanRoutingGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME', Messages['PrdMProPlanRoutingGrid.macPreTime'], 70, '', null),
    Column.text('MAC_ACT_TIME', Messages['PrdMProPlanRoutingGrid.macActTime'], 70, '', null),
    Column.text('COMMENT1', Messages['PrdMProPlanRoutingGrid.comment1'], 250, '', null),
    Column.text('COMMENT2', Messages['PrdMProPlanRoutingGrid.comment2'], 250, '', null),
    Column.text('UNIT_WEIGHT', Messages['PrdMProPlanRoutingGrid.unitWeight'], 110, '', null),
    Column.text('ORDER_UNIT_PRICE', Messages['PrdMProPlanRoutingGrid.orderUnitPrice'], 90, '', null),
    Column.text('PROC_LT', Messages['PrdMProPlanRoutingGrid.procLt'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMProPlanRoutingGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMProPlanRoutingGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMProPlanRoutingGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMProPlanRoutingGrid.userIdChange'], 100, 'metaInfo', null),
];
