/**
 * PRD_W_PRO_NES_COUNTSグリッド定義
 */

let PrdWProNesCountsGridColumns = [
    Column.cell('PRD_W_PRO_NES_COUNTS_KEY', Messages['PrdWProNesCountsGrid.prdWProNesCountsKey'], 100, 'primaryKey', null),
    Column.text('PRO_HINBAN', Messages['PrdWProNesCountsGrid.proHinban'], 200, '', null),
    Column.date('SCHEDULED_DATE', Messages['PrdWProNesCountsGrid.scheduledDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PRO_NES_COUNTS', Messages['PrdWProNesCountsGrid.proNesCounts'], 60, '', null),
    Column.text('PRO_NES_COMMENT', Messages['PrdWProNesCountsGrid.proNesComment'], 300, '', null),
    Column.check('DELETE_FLAG', Messages['PrdWProNesCountsGrid.deleteFlag'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdWProNesCountsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdWProNesCountsGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdWProNesCountsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdWProNesCountsGrid.userIdChange'], 100, 'metaInfo', null),
    Column.refer('EMP_CODE', Messages['PrdWProNesCountsGrid.empCode'], 100, '', 'EMP_NAME'),
];
