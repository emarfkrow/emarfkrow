/**
 * PRD_SALES_TARGET_YEARグリッド定義
 */

let PrdSalesTargetYearGridColumns = [
    Column.cell('YYYY', Messages['PrdSalesTargetYearGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdSalesTargetYearGrid.mm'], 20, 'primaryKey', null),
    Column.cell('FILE_ID', Messages['PrdSalesTargetYearGrid.fileId'], 10, 'primaryKey', null),
    Column.refer('SALES_HINBAN', Messages['PrdSalesTargetYearGrid.salesHinban'], 200, 'primaryKey', 'SALES_HINMEI'),
    Column.text('SALES_TARGET_COUNTS', Messages['PrdSalesTargetYearGrid.salesTargetCounts'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdSalesTargetYearGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdSalesTargetYearGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdSalesTargetYearGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdSalesTargetYearGrid.userIdChange'], 100, 'metaInfo', null),
];
