/**
 * PRD_SALES_TARGET_MONTHグリッド定義
 */

let PrdSalesTargetMonthGridColumns = [
    Column.cell('YYYY', Messages['PrdSalesTargetMonthGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdSalesTargetMonthGrid.mm'], 20, 'primaryKey', null),
    Column.cell('FILE_ID', Messages['PrdSalesTargetMonthGrid.fileId'], 10, 'primaryKey', null),
    Column.cell('SALES_HINBAN', Messages['PrdSalesTargetMonthGrid.salesHinban'], 200, 'primaryKey', null),
    Column.text('SALES_TARGET_COUNTS', Messages['PrdSalesTargetMonthGrid.salesTargetCounts'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdSalesTargetMonthGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdSalesTargetMonthGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdSalesTargetMonthGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdSalesTargetMonthGrid.userIdChange'], 100, 'metaInfo', null),
];
