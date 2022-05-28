/**
 * INV_WORK_MNTH_STOCKグリッド定義
 */

let InvWorkMnthStockGridColumns = [
    Column.cell('DATA_ID', Messages['InvWorkMnthStockGrid.dataId'], 300, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvWorkMnthStockGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING_GROUP', Messages['InvWorkMnthStockGrid.routingGroup'], 20, 'primaryKey', null),
    Column.cell('ROUTING', Messages['InvWorkMnthStockGrid.routing'], 20, 'primaryKey', null),
    Column.text('SUM_LOT_SIZE', Messages['InvWorkMnthStockGrid.sumLotSize'], 100, '', null),
];
