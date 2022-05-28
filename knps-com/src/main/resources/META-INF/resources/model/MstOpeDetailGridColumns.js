/**
 * MST_OPE_DETAILグリッド定義
 */

let MstOpeDetailGridColumns = [
    Column.cell('OPE_DETAIL', Messages['MstOpeDetailGrid.opeDetail'], 100, 'primaryKey', null),
    Column.text('OPE_DETAIL_NAME', Messages['MstOpeDetailGrid.opeDetailName'], 200, '', null),
    Column.text('OPE_DETAIL_COMMENT', Messages['MstOpeDetailGrid.opeDetailComment'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstOpeDetailGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstOpeDetailGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstOpeDetailGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstOpeDetailGrid.userIdChange'], 100, 'metaInfo', null),
];
