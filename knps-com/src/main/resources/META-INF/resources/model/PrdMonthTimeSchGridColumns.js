/**
 * PRD_MONTH_TIME_SCHグリッド定義
 */

let PrdMonthTimeSchGridColumns = [
    Column.cell('YYYY', Messages['PrdMonthTimeSchGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMonthTimeSchGrid.mm'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['PrdMonthTimeSchGrid.wcCode'], 30, 'primaryKey', 'WC_NAME'),
    Column.text('LAYOUT_IN_TIME', Messages['PrdMonthTimeSchGrid.layoutInTime'], 60, '', null),
    Column.text('CHANGE_STAT', Messages['PrdMonthTimeSchGrid.changeStat'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMonthTimeSchGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMonthTimeSchGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMonthTimeSchGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMonthTimeSchGrid.userIdChange'], 100, 'metaInfo', null),
];
