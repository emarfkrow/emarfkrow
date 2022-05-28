/**
 * M_SETKOSEグリッド定義
 */

let MSetkoseGridColumns = [
    Column.cell('SET-HINBAN', Messages['MSetkoseGrid.setHinban'], 200, 'primaryKey', null),
    Column.cell('SET-KHINBAN', Messages['MSetkoseGrid.setKhinban'], 200, 'primaryKey', null),
    Column.text('DLTFLG', Messages['MSetkoseGrid.dltflg'], 10, '', null),
    Column.text('SETINZU', Messages['MSetkoseGrid.setinzu'], 30, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MSetkoseGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MSetkoseGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MSetkoseGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MSetkoseGrid.userIdChange'], 100, 'metaInfo', null),
];
