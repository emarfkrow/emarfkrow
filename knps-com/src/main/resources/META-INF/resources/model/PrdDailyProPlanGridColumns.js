/**
 * PRD_DAILY_PRO_PLANグリッド定義
 */

let PrdDailyProPlanGridColumns = [
    Column.cell('PLAN_NO', Messages['PrdDailyProPlanGrid.planNo'], 100, 'primaryKey', null),
    Column.select('ARRANGE_KBN', Messages['PrdDailyProPlanGrid.arrangeKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HINBAN', Messages['PrdDailyProPlanGrid.hinban'], 250, '', null),
    Column.text('DETAIL_PLAN_COUNTS', Messages['PrdDailyProPlanGrid.detailPlanCounts'], 20, '', null),
    Column.text('PLAN_COMMENT', Messages['PrdDailyProPlanGrid.planComment'], 300, '', null),
    Column.text('PLAN_STATUS', Messages['PrdDailyProPlanGrid.planStatus'], 10, '', null),
    Column.text('PERIOD', Messages['PrdDailyProPlanGrid.period'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PERIOD_CHG', Messages['PrdDailyProPlanGrid.periodChg'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PERIOD_CHG_COUNTS', Messages['PrdDailyProPlanGrid.periodChgCounts'], 20, '', null),
    Column.text('PLAN_DATE_APPOINT', Messages['PrdDailyProPlanGrid.planDateAppoint'], 10, '', null),
    Column.date('BEG_DATE', Messages['PrdDailyProPlanGrid.begDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('END_DATE', Messages['PrdDailyProPlanGrid.endDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('START_DATE', Messages['PrdDailyProPlanGrid.startDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('COMP_DATE', Messages['PrdDailyProPlanGrid.compDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('SHORT_NO', Messages['PrdDailyProPlanGrid.shortNo'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdDailyProPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdDailyProPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdDailyProPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdDailyProPlanGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['PrdDailyProPlanGrid.deleteFlag'], 10, ''),
];
