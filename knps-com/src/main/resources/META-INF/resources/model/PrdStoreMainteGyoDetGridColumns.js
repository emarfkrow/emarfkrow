/**
 * PRD_STORE_MAINTE_GYO_DETグリッド定義
 */

let PrdStoreMainteGyoDetGridColumns = [
    Column.cell('GYO_NO', Messages['PrdStoreMainteGyoDetGrid.gyoNo'], 30, 'primaryKey', null),
    Column.cell('GYO_POS', Messages['PrdStoreMainteGyoDetGrid.gyoPos'], 40, 'primaryKey', null),
    Column.text('HINBAN', Messages['PrdStoreMainteGyoDetGrid.hinban'], 250, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdStoreMainteGyoDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdStoreMainteGyoDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdStoreMainteGyoDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdStoreMainteGyoDetGrid.userIdChange'], 100, 'metaInfo', null),
];
