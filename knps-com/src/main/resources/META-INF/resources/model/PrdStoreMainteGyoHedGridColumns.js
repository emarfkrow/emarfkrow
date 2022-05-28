/**
 * PRD_STORE_MAINTE_GYO_HEDグリッド定義
 */

let PrdStoreMainteGyoHedGridColumns = [
    Column.cell('GYO_NO', Messages['PrdStoreMainteGyoHedGrid.gyoNo'], 30, 'primaryKey', null),
    Column.text('GYO_NAME', Messages['PrdStoreMainteGyoHedGrid.gyoName'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdStoreMainteGyoHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdStoreMainteGyoHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdStoreMainteGyoHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdStoreMainteGyoHedGrid.userIdChange'], 100, 'metaInfo', null),
];
