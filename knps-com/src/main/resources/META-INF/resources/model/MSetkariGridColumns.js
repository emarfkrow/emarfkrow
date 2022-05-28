/**
 * M_SETKARIグリッド定義
 */

let MSetkariGridColumns = [
    Column.cell('SET-HINBAN', Messages['MSetkariGrid.setHinban'], 200, 'primaryKey', null),
    Column.cell('SET-KHINBAN', Messages['MSetkariGrid.setKhinban'], 200, 'primaryKey', null),
    Column.text('SETINZU', Messages['MSetkariGrid.setinzu'], 30, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MSetkariGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MSetkariGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MSetkariGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MSetkariGrid.userIdChange'], 100, 'metaInfo', null),
];
