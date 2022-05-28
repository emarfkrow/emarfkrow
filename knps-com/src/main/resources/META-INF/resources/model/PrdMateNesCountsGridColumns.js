/**
 * PRD_MATE_NES_COUNTSグリッド定義
 */

let PrdMateNesCountsGridColumns = [
    Column.cell('YYYY', Messages['PrdMateNesCountsGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMateNesCountsGrid.mm'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PrdMateNesCountsGrid.hinban'], 250, 'primaryKey', null),
    Column.text('ORDER_COUNTS', Messages['PrdMateNesCountsGrid.orderCounts'], 110, '', null),
    Column.refer('SUP_CODE', Messages['PrdMateNesCountsGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('ORDER_UNIT', Messages['PrdMateNesCountsGrid.orderUnit'], 90, '', null),
    Column.text('ORDER_AMOUNT', Messages['PrdMateNesCountsGrid.orderAmount'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMateNesCountsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMateNesCountsGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMateNesCountsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMateNesCountsGrid.userIdChange'], 100, 'metaInfo', null),
];
