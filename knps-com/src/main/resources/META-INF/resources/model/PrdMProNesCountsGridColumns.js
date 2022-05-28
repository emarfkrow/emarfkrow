/**
 * PRD_M_PRO_NES_COUNTSグリッド定義
 */

let PrdMProNesCountsGridColumns = [
    Column.cell('PRO_HINBAN', Messages['PrdMProNesCountsGrid.proHinban'], 250, 'primaryKey', null),
    Column.cell('YYYY', Messages['PrdMProNesCountsGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMProNesCountsGrid.mm'], 20, 'primaryKey', null),
    Column.text('PRO_NES_COUNTS', Messages['PrdMProNesCountsGrid.proNesCounts'], 70, '', null),
    Column.text('PRO_ADJ_COUNTS', Messages['PrdMProNesCountsGrid.proAdjCounts'], 80, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMProNesCountsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMProNesCountsGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMProNesCountsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMProNesCountsGrid.userIdChange'], 100, 'metaInfo', null),
];
