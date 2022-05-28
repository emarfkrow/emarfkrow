/**
 * PRD_DAILY_TIME_SCHグリッド定義
 */

let PrdDailyTimeSchGridColumns = [
    Column.cell('LAYOUT_DATE', Messages['PrdDailyTimeSchGrid.layoutDate'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.refer('WC_CODE', Messages['PrdDailyTimeSchGrid.wcCode'], 30, 'primaryKey', 'WC_NAME'),
    Column.text('LAYOUT_IN_TIME', Messages['PrdDailyTimeSchGrid.layoutInTime'], 60, '', null),
    Column.text('CHANGE_STAT', Messages['PrdDailyTimeSchGrid.changeStat'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdDailyTimeSchGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdDailyTimeSchGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdDailyTimeSchGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdDailyTimeSchGrid.userIdChange'], 100, 'metaInfo', null),
];
