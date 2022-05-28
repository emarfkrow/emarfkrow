/**
 * PRD_MATE_NES_COUNTS_BKグリッド定義
 */

let PrdMateNesCountsBkGridColumns = [
    Column.text('YYYY', Messages['PrdMateNesCountsBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdMateNesCountsBkGrid.mm'], 20, '', null),
    Column.text('HINBAN', Messages['PrdMateNesCountsBkGrid.hinban'], 250, '', null),
    Column.text('ORDER_COUNTS', Messages['PrdMateNesCountsBkGrid.orderCounts'], 110, '', null),
    Column.refer('SUP_CODE', Messages['PrdMateNesCountsBkGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.text('ORDER_UNIT', Messages['PrdMateNesCountsBkGrid.orderUnit'], 90, '', null),
    Column.text('ORDER_AMOUNT', Messages['PrdMateNesCountsBkGrid.orderAmount'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMateNesCountsBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMateNesCountsBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMateNesCountsBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMateNesCountsBkGrid.userIdChange'], 100, 'metaInfo', null),
];
