/**
 * INV_STOCK_STOREグリッド定義
 */

let InvStockStoreGridColumns = [
    Column.cell('HINBAN', Messages['InvStockStoreGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('STORE_NO', Messages['InvStockStoreGrid.storeNo'], 100, 'primaryKey', null),
    Column.text('COUNTS', Messages['InvStockStoreGrid.counts'], 60, '', null),
    Column.text('HAKO_SU', Messages['InvStockStoreGrid.hakoSu'], 30, '', null),
    Column.text('STOCK', Messages['InvStockStoreGrid.stock'], 90, '', null),
    Column.text('TOTAL_SUM_COST', Messages['InvStockStoreGrid.totalSumCost'], 90, '', null),
    Column.text('AMOUNT', Messages['InvStockStoreGrid.amount'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockStoreGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockStoreGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockStoreGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockStoreGrid.userIdChange'], 100, 'metaInfo', null),
];
