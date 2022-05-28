/**
 * PRD_STORE_MAINTE_RETSU_DETグリッド定義
 */

let PrdStoreMainteRetsuDetGridColumns = [
    Column.cell('RETSU_NO', Messages['PrdStoreMainteRetsuDetGrid.retsuNo'], 30, 'primaryKey', null),
    Column.cell('RETSU_POS', Messages['PrdStoreMainteRetsuDetGrid.retsuPos'], 40, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['PrdStoreMainteRetsuDetGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('OPE_DETAIL', Messages['PrdStoreMainteRetsuDetGrid.opeDetail'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdStoreMainteRetsuDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdStoreMainteRetsuDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdStoreMainteRetsuDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdStoreMainteRetsuDetGrid.userIdChange'], 100, 'metaInfo', null),
];
