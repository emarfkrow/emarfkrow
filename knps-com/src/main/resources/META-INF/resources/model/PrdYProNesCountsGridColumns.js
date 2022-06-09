/**
 * PRD_Y_PRO_NES_COUNTSグリッド定義
 */

let PrdYProNesCountsGridColumns = [
    Column.refer('PRO_HINBAN', Messages['PrdYProNesCountsGrid.proHinban'], 250, 'primaryKey', 'PRO_HINMEI'),
    Column.cell('YYYY', Messages['PrdYProNesCountsGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdYProNesCountsGrid.mm'], 20, 'primaryKey', null),
    Column.text('PRO_NES_COUNTS', Messages['PrdYProNesCountsGrid.proNesCounts'], 70, '', null),
    Column.text('PRO_ADJ_COUNTS', Messages['PrdYProNesCountsGrid.proAdjCounts'], 80, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdYProNesCountsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdYProNesCountsGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdYProNesCountsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdYProNesCountsGrid.userIdChange'], 100, 'metaInfo', null),
];
