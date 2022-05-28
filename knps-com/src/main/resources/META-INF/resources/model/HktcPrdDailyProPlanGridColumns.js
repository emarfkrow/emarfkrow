/**
 * HKTC_PRD_DAILY_PRO_PLANグリッド定義
 */

let HktcPrdDailyProPlanGridColumns = [
    Column.cell('PLAN_NO', Messages['HktcPrdDailyProPlanGrid.planNo'], 100, 'primaryKey', null),
    Column.select('ARRANGE_KBN', Messages['HktcPrdDailyProPlanGrid.arrangeKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HINBAN', Messages['HktcPrdDailyProPlanGrid.hinban'], 250, '', null),
    Column.text('DETAIL_PLAN_COUNTS', Messages['HktcPrdDailyProPlanGrid.detailPlanCounts'], 20, '', null),
    Column.text('PLAN_COMMENT', Messages['HktcPrdDailyProPlanGrid.planComment'], 300, '', null),
    Column.text('PLAN_STATUS', Messages['HktcPrdDailyProPlanGrid.planStatus'], 10, '', null),
    Column.text('PERIOD', Messages['HktcPrdDailyProPlanGrid.period'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PERIOD_CHG', Messages['HktcPrdDailyProPlanGrid.periodChg'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PERIOD_CHG_COUNTS', Messages['HktcPrdDailyProPlanGrid.periodChgCounts'], 20, '', null),
    Column.text('PLAN_DATE_APPOINT', Messages['HktcPrdDailyProPlanGrid.planDateAppoint'], 10, '', null),
    Column.date('BEG_DATE', Messages['HktcPrdDailyProPlanGrid.begDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('END_DATE', Messages['HktcPrdDailyProPlanGrid.endDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('START_DATE', Messages['HktcPrdDailyProPlanGrid.startDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('COMP_DATE', Messages['HktcPrdDailyProPlanGrid.compDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('SHORT_NO', Messages['HktcPrdDailyProPlanGrid.shortNo'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['HktcPrdDailyProPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['HktcPrdDailyProPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['HktcPrdDailyProPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['HktcPrdDailyProPlanGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['HktcPrdDailyProPlanGrid.deleteFlag'], 10, ''),
    Column.text('ITEM', Messages['HktcPrdDailyProPlanGrid.item'], 300, '', null),
    Column.date('UPDATE_DATE', Messages['HktcPrdDailyProPlanGrid.updateDate'], 70, '', Slick.Formatters.Extends.DateTime),
];
