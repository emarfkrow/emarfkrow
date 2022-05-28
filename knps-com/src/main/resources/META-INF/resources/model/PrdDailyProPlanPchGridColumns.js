/**
 * PRD_DAILY_PRO_PLAN_PCHグリッド定義
 */

let PrdDailyProPlanPchGridColumns = [
    Column.cell('PCH_ORDER_NO', Messages['PrdDailyProPlanPchGrid.pchOrderNo'], 140, 'primaryKey', null),
    Column.text('CHILD_PLAN_NO', Messages['PrdDailyProPlanPchGrid.childPlanNo'], 120, '', null),
    Column.text('HINBAN', Messages['PrdDailyProPlanPchGrid.hinban'], 250, '', null),
    Column.text('NES_COUNTS', Messages['PrdDailyProPlanPchGrid.nesCounts'], 110, '', null),
    Column.refer('SUP_CODE', Messages['PrdDailyProPlanPchGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('ORDER_COUNTS', Messages['PrdDailyProPlanPchGrid.orderCounts'], 110, '', null),
    Column.date('ORDER_LIMIT_DATE', Messages['PrdDailyProPlanPchGrid.orderLimitDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PERIOD', Messages['PrdDailyProPlanPchGrid.period'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PCH_ORDER_STATUS', Messages['PrdDailyProPlanPchGrid.pchOrderStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdDailyProPlanPchGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdDailyProPlanPchGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdDailyProPlanPchGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdDailyProPlanPchGrid.userIdChange'], 100, 'metaInfo', null),
];
