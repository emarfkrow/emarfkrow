/**
 * MST_RESERVE_LOCグリッド定義
 */

let MstReserveLocGridColumns = [
    Column.cell('HINBAN', Messages['MstReserveLocGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('OPE_DETAIL', Messages['MstReserveLocGrid.opeDetail'], 100, 'primaryKey', null),
    Column.cell('RESERVE_LOC_SEQ', Messages['MstReserveLocGrid.reserveLocSeq'], 100, 'primaryKey', null),
    Column.refer('LOCATION_CODE', Messages['MstReserveLocGrid.locationCode'], 100, '', 'LOCATION_NAME'),
    Column.cell('TIME_STAMP_CREATE', Messages['MstReserveLocGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstReserveLocGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstReserveLocGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstReserveLocGrid.userIdChange'], 100, 'metaInfo', null),
];
