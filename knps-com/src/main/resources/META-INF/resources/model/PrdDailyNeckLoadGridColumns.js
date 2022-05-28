/**
 * PRD_DAILY_NECK_LOADグリッド定義
 */

let PrdDailyNeckLoadGridColumns = [
    Column.cell('PRO_NO', Messages['PrdDailyNeckLoadGrid.proNo'], 140, 'primaryKey', null),
    Column.cell('BRANCH_NO', Messages['PrdDailyNeckLoadGrid.branchNo'], 20, 'primaryKey', null),
    Column.date('LOAD_DATE', Messages['PrdDailyNeckLoadGrid.loadDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('LOAD_TIME', Messages['PrdDailyNeckLoadGrid.loadTime'], 70, '', null),
    Column.text('LOAD_OVER_TIME', Messages['PrdDailyNeckLoadGrid.loadOverTime'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdDailyNeckLoadGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdDailyNeckLoadGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdDailyNeckLoadGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdDailyNeckLoadGrid.userIdChange'], 100, 'metaInfo', null),
    Column.refer('WC_CODE', Messages['PrdDailyNeckLoadGrid.wcCode'], 30, '', 'WC_NAME'),
];
