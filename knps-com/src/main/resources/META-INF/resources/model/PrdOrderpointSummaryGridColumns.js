/**
 * PRD_ORDERPOINT_SUMMARYグリッド定義
 */

let PrdOrderpointSummaryGridColumns = [
    Column.cell('HINBAN', Messages['PrdOrderpointSummaryGrid.hinban'], 250, 'primaryKey', null),
    Column.text('PRO_NES_COUNTS', Messages['PrdOrderpointSummaryGrid.proNesCounts'], 70, '', null),
    Column.text('ISSUE_NES_COUNTS', Messages['PrdOrderpointSummaryGrid.issueNesCounts'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdOrderpointSummaryGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdOrderpointSummaryGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdOrderpointSummaryGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdOrderpointSummaryGrid.userIdChange'], 100, 'metaInfo', null),
];
