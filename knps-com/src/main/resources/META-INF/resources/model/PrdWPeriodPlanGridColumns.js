/**
 * PRD_W_PERIOD_PLANグリッド定義
 */

let PrdWPeriodPlanGridColumns = [
    Column.cell('W_PLAN_ID', Messages['PrdWPeriodPlanGrid.wPlanId'], 60, 'primaryKey', null),
    Column.text('DATE_OF_PROC', Messages['PrdWPeriodPlanGrid.dateOfProc'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('BEG_DATE', Messages['PrdWPeriodPlanGrid.begDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('END_DATE', Messages['PrdWPeriodPlanGrid.endDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PROC_STATUS', Messages['PrdWPeriodPlanGrid.procStatus'], 10, '', null),
    Column.text('RESULT_PROC_STATUS', Messages['PrdWPeriodPlanGrid.resultProcStatus'], 10, '', null),
    Column.text('PLAN_COMMENT', Messages['PrdWPeriodPlanGrid.planComment'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdWPeriodPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdWPeriodPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdWPeriodPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdWPeriodPlanGrid.userIdChange'], 100, 'metaInfo', null),
];
