/**
 * INV_STOCK_STORE_BK_YMグリッド定義
 */

let InvStockStoreBkYmGridColumns = [
    Column.cell('YY', Messages['InvStockStoreBkYmGrid.yy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['InvStockStoreBkYmGrid.mm'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockStoreBkYmGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('STORE_NO', Messages['InvStockStoreBkYmGrid.storeNo'], 100, 'primaryKey', null),
    Column.text('COUNTS', Messages['InvStockStoreBkYmGrid.counts'], 60, '', null),
    Column.text('HAKO_SU', Messages['InvStockStoreBkYmGrid.hakoSu'], 30, '', null),
    Column.text('STOCK', Messages['InvStockStoreBkYmGrid.stock'], 90, '', null),
    Column.text('TOTAL_SUM_COST', Messages['InvStockStoreBkYmGrid.totalSumCost'], 90, '', null),
    Column.text('AMOUNT', Messages['InvStockStoreBkYmGrid.amount'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockStoreBkYmGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockStoreBkYmGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockStoreBkYmGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockStoreBkYmGrid.userIdChange'], 100, 'metaInfo', null),
];
