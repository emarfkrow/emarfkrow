/**
 * INV_STOCK_PROCESS_SUPPLYグリッド定義
 */

let InvStockProcessSupplyGridColumns = [
    Column.refer('SUP_CODE', Messages['InvStockProcessSupplyGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.cell('HINBAN', Messages['InvStockProcessSupplyGrid.hinban'], 250, 'primaryKey', null),
    Column.text('SHIKYU_QT', Messages['InvStockProcessSupplyGrid.shikyuQt'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockProcessSupplyGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockProcessSupplyGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockProcessSupplyGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockProcessSupplyGrid.userIdChange'], 100, 'metaInfo', null),
];
