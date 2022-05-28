/**
 * PRD_PRE_STATUS_HEADグリッド定義
 */

let PrdPreStatusHeadGridColumns = [
    Column.cell('REC_NO', Messages['PrdPreStatusHeadGrid.recNo'], 30, 'primaryKey', null),
    Column.text('CURRENT_YEAR_Y', Messages['PrdPreStatusHeadGrid.currentYearY'], 40, '', null),
    Column.text('CURRENT_YEAR_M', Messages['PrdPreStatusHeadGrid.currentYearM'], 40, '', null),
    Column.text('CURRENT_MONTH_M', Messages['PrdPreStatusHeadGrid.currentMonthM'], 20, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdPreStatusHeadGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdPreStatusHeadGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdPreStatusHeadGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdPreStatusHeadGrid.userIdChange'], 100, 'metaInfo', null),
];
