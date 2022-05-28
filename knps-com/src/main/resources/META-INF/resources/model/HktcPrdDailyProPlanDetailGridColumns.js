/**
 * HKTC_PRD_DAILY_PRO_PLAN_DETAILグリッド定義
 */

let HktcPrdDailyProPlanDetailGridColumns = [
    Column.cell('CHILD_PLAN_NO', Messages['HktcPrdDailyProPlanDetailGrid.childPlanNo'], 120, 'primaryKey', null),
    Column.text('PARENT_PLAN_NO', Messages['HktcPrdDailyProPlanDetailGrid.parentPlanNo'], 120, '', null),
    Column.text('PLAN_NO', Messages['HktcPrdDailyProPlanDetailGrid.planNo'], 100, '', null),
    Column.text('HINBAN', Messages['HktcPrdDailyProPlanDetailGrid.hinban'], 250, '', null),
    Column.text('LOT_SIZE', Messages['HktcPrdDailyProPlanDetailGrid.lotSize'], 60, '', null),
    Column.text('LOT_SIZE_CHANGE', Messages['HktcPrdDailyProPlanDetailGrid.lotSizeChange'], 60, '', null),
    Column.text('KANBAN_ID', Messages['HktcPrdDailyProPlanDetailGrid.kanbanId'], 90, '', null),
    Column.text('SERIAL_NO', Messages['HktcPrdDailyProPlanDetailGrid.serialNo'], 40, '', null),
    Column.text('ROUTING_COUNTS', Messages['HktcPrdDailyProPlanDetailGrid.routingCounts'], 20, '', null),
    Column.text('PLAN_STATUS', Messages['HktcPrdDailyProPlanDetailGrid.planStatus'], 10, '', null),
    Column.text('PRO_GROUP_NO', Messages['HktcPrdDailyProPlanDetailGrid.proGroupNo'], 20, '', null),
    Column.text('OUT_PLAN_TRANS', Messages['HktcPrdDailyProPlanDetailGrid.outPlanTrans'], 10, '', null),
    Column.date('BEG_DATE', Messages['HktcPrdDailyProPlanDetailGrid.begDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('END_DATE', Messages['HktcPrdDailyProPlanDetailGrid.endDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('START_DATE', Messages['HktcPrdDailyProPlanDetailGrid.startDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('COMP_DATE', Messages['HktcPrdDailyProPlanDetailGrid.compDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.check('PCH_FLAG', Messages['HktcPrdDailyProPlanDetailGrid.pchFlag'], 10, ''),
    Column.text('PRINT_ORDER', Messages['HktcPrdDailyProPlanDetailGrid.printOrder'], 30, '', null),
    Column.text('SHORT_NO', Messages['HktcPrdDailyProPlanDetailGrid.shortNo'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['HktcPrdDailyProPlanDetailGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['HktcPrdDailyProPlanDetailGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['HktcPrdDailyProPlanDetailGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['HktcPrdDailyProPlanDetailGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['HktcPrdDailyProPlanDetailGrid.deleteFlag'], 10, ''),
];
