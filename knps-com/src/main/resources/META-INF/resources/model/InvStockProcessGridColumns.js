/**
 * INV_STOCK_PROCESSグリッド定義
 */

let InvStockProcessGridColumns = [
    Column.cell('LOCATION_CODE', Messages['InvStockProcessGrid.locationCode'], 100, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockProcessGrid.hinban'], 250, 'primaryKey', null),
    Column.text('STOCK', Messages['InvStockProcessGrid.stock'], 110, '', null),
    Column.date('LAST_IN_OUT_DATE', Messages['InvStockProcessGrid.lastInOutDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockProcessGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockProcessGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockProcessGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockProcessGrid.userIdChange'], 100, 'metaInfo', null),
];
