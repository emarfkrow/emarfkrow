/**
 * PRD_DAILY_PRO_PLAN_DETAILグリッド定義
 */

let PrdDailyProPlanDetailGridColumns = [
    Column.cell('CHILD_PLAN_NO', Messages['PrdDailyProPlanDetailGrid.childPlanNo'], 120, 'primaryKey', null),
    Column.text('PARENT_PLAN_NO', Messages['PrdDailyProPlanDetailGrid.parentPlanNo'], 120, '', null),
    Column.text('PLAN_NO', Messages['PrdDailyProPlanDetailGrid.planNo'], 100, '', null),
    Column.text('HINBAN', Messages['PrdDailyProPlanDetailGrid.hinban'], 250, '', null),
    Column.text('LOT_SIZE', Messages['PrdDailyProPlanDetailGrid.lotSize'], 60, '', null),
    Column.text('LOT_SIZE_CHANGE', Messages['PrdDailyProPlanDetailGrid.lotSizeChange'], 60, '', null),
    Column.text('KANBAN_ID', Messages['PrdDailyProPlanDetailGrid.kanbanId'], 90, '', null),
    Column.text('SERIAL_NO', Messages['PrdDailyProPlanDetailGrid.serialNo'], 40, '', null),
    Column.text('ROUTING_COUNTS', Messages['PrdDailyProPlanDetailGrid.routingCounts'], 20, '', null),
    Column.text('PLAN_STATUS', Messages['PrdDailyProPlanDetailGrid.planStatus'], 10, '', null),
    Column.text('PRO_GROUP_NO', Messages['PrdDailyProPlanDetailGrid.proGroupNo'], 20, '', null),
    Column.text('OUT_PLAN_TRANS', Messages['PrdDailyProPlanDetailGrid.outPlanTrans'], 10, '', null),
    Column.date('BEG_DATE', Messages['PrdDailyProPlanDetailGrid.begDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('END_DATE', Messages['PrdDailyProPlanDetailGrid.endDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('START_DATE', Messages['PrdDailyProPlanDetailGrid.startDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('COMP_DATE', Messages['PrdDailyProPlanDetailGrid.compDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.check('PCH_FLAG', Messages['PrdDailyProPlanDetailGrid.pchFlag'], 10, ''),
    Column.text('PRINT_ORDER', Messages['PrdDailyProPlanDetailGrid.printOrder'], 30, '', null),
    Column.text('SHORT_NO', Messages['PrdDailyProPlanDetailGrid.shortNo'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdDailyProPlanDetailGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdDailyProPlanDetailGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdDailyProPlanDetailGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdDailyProPlanDetailGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['PrdDailyProPlanDetailGrid.deleteFlag'], 10, ''),
];
