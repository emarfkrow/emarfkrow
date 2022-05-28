/**
 * PRD_STORE_MAINTE_RETSU_HEDグリッド定義
 */

let PrdStoreMainteRetsuHedGridColumns = [
    Column.cell('RETSU_NO', Messages['PrdStoreMainteRetsuHedGrid.retsuNo'], 30, 'primaryKey', null),
    Column.text('RETSU_NAME', Messages['PrdStoreMainteRetsuHedGrid.retsuName'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdStoreMainteRetsuHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdStoreMainteRetsuHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdStoreMainteRetsuHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdStoreMainteRetsuHedGrid.userIdChange'], 100, 'metaInfo', null),
];
