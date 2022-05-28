/**
 * PRD_MONTH_TIME_SCH_BKグリッド定義
 */

let PrdMonthTimeSchBkGridColumns = [
    Column.text('YYYY', Messages['PrdMonthTimeSchBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdMonthTimeSchBkGrid.mm'], 20, '', null),
    Column.refer('WC_CODE', Messages['PrdMonthTimeSchBkGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('LAYOUT_IN_TIME', Messages['PrdMonthTimeSchBkGrid.layoutInTime'], 60, '', null),
    Column.text('CHANGE_STAT', Messages['PrdMonthTimeSchBkGrid.changeStat'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMonthTimeSchBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMonthTimeSchBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMonthTimeSchBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMonthTimeSchBkGrid.userIdChange'], 100, 'metaInfo', null),
];
