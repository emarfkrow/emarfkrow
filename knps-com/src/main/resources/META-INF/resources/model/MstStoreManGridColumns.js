/**
 * MST_STORE_MANグリッド定義
 */

let MstStoreManGridColumns = [
    Column.cell('STORE_MAN_ID', Messages['MstStoreManGrid.storeManId'], 100, 'primaryKey', null),
    Column.text('STORE_MAN_MEI', Messages['MstStoreManGrid.storeManMei'], 300, '', null),
    Column.longText('MEMO', Messages['MstStoreManGrid.memo'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstStoreManGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstStoreManGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstStoreManGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstStoreManGrid.userIdChange'], 100, 'metaInfo', null),
];
