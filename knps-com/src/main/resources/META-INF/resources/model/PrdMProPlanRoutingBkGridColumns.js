/**
 * PRD_M_PRO_PLAN_ROUTING_BKグリッド定義
 */

let PrdMProPlanRoutingBkGridColumns = [
    Column.text('YYYY', Messages['PrdMProPlanRoutingBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdMProPlanRoutingBkGrid.mm'], 20, '', null),
    Column.refer('PRO_HINBAN', Messages['PrdMProPlanRoutingBkGrid.proHinban'], 250, '', 'PRO_HINMEI'),
    Column.text('HINBAN', Messages['PrdMProPlanRoutingBkGrid.hinban'], 250, '', null),
    Column.text('ROUTING_GROUP', Messages['PrdMProPlanRoutingBkGrid.routingGroup'], 20, '', null),
    Column.text('ROUTING', Messages['PrdMProPlanRoutingBkGrid.routing'], 20, '', null),
    Column.text('OPE_DETAIL', Messages['PrdMProPlanRoutingBkGrid.opeDetail'], 100, '', null),
    Column.refer('WC_CODE', Messages['PrdMProPlanRoutingBkGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('WSCODE', Messages['PrdMProPlanRoutingBkGrid.wscode'], 40, '', null),
    Column.select('IN_OUT_KBN', Messages['PrdMProPlanRoutingBkGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('SUP_CODE', Messages['PrdMProPlanRoutingBkGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('NES_COUNTS', Messages['PrdMProPlanRoutingBkGrid.nesCounts'], 70, '', null),
    Column.select('MAC_LOAD_KBN', Messages['PrdMProPlanRoutingBkGrid.macLoadKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HUM_PRE_TIME', Messages['PrdMProPlanRoutingBkGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdMProPlanRoutingBkGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME', Messages['PrdMProPlanRoutingBkGrid.macPreTime'], 70, '', null),
    Column.text('MAC_ACT_TIME', Messages['PrdMProPlanRoutingBkGrid.macActTime'], 70, '', null),
    Column.text('COMMENT1', Messages['PrdMProPlanRoutingBkGrid.comment1'], 250, '', null),
    Column.text('COMMENT2', Messages['PrdMProPlanRoutingBkGrid.comment2'], 250, '', null),
    Column.text('UNIT_WEIGHT', Messages['PrdMProPlanRoutingBkGrid.unitWeight'], 110, '', null),
    Column.text('ORDER_UNIT_PRICE', Messages['PrdMProPlanRoutingBkGrid.orderUnitPrice'], 90, '', null),
    Column.text('PROC_LT', Messages['PrdMProPlanRoutingBkGrid.procLt'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMProPlanRoutingBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMProPlanRoutingBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMProPlanRoutingBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMProPlanRoutingBkGrid.userIdChange'], 100, 'metaInfo', null),
];
