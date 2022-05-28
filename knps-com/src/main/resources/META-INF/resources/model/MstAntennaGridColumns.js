/**
 * MST_ANTENNAグリッド定義
 */

let MstAntennaGridColumns = [
    Column.cell('READER_NO', Messages['MstAntennaGrid.readerNo'], 100, 'primaryKey', null),
    Column.cell('ANTENNA_NO', Messages['MstAntennaGrid.antennaNo'], 100, 'primaryKey', null),
    Column.refer('STORE_MAN_ID', Messages['MstAntennaGrid.storeManId'], 100, '', 'STORE_MAN_MEI'),
    Column.cell('TIME_STAMP_CREATE', Messages['MstAntennaGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstAntennaGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstAntennaGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstAntennaGrid.userIdChange'], 100, 'metaInfo', null),
];
