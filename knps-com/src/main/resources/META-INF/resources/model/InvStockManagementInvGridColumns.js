/**
 * INV_STOCK_MANAGEMENT_INVグリッド定義
 */

let InvStockManagementInvGridColumns = [
    Column.cell('INV_PHASE', Messages['InvStockManagementInvGrid.invPhase'], 30, 'primaryKey', null),
    Column.cell('INV_PHASE_MONTH', Messages['InvStockManagementInvGrid.invPhaseMonth'], 20, 'primaryKey', null),
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvStockManagementInvGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockManagementInvGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvStockManagementInvGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.text('INV_STOCK', Messages['InvStockManagementInvGrid.invStock'], 110, '', null),
    Column.text('STOCK', Messages['InvStockManagementInvGrid.stock'], 110, '', null),
    Column.text('UNIT_COST', Messages['InvStockManagementInvGrid.unitCost'], 90, '', null),
    Column.date('LAST_IN_OUT_DATE', Messages['InvStockManagementInvGrid.lastInOutDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockManagementInvGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockManagementInvGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockManagementInvGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockManagementInvGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['InvStockManagementInvGrid.deleteFlag'], 10, ''),
    Column.text('STORE_NO', Messages['InvStockManagementInvGrid.storeNo'], 100, '', null),
];
