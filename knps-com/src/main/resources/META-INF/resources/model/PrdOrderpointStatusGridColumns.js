/**
 * PRD_ORDERPOINT_STATUSグリッド定義
 */

let PrdOrderpointStatusGridColumns = [
    Column.cell('HINBAN', Messages['PrdOrderpointStatusGrid.hinban'], 250, 'primaryKey', null),
    Column.text('PUBLISHED_COUNTS', Messages['PrdOrderpointStatusGrid.publishedCounts'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdOrderpointStatusGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdOrderpointStatusGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdOrderpointStatusGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdOrderpointStatusGrid.userIdChange'], 100, 'metaInfo', null),
];
