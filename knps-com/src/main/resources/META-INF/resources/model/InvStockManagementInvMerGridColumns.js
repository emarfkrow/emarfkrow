/**
 * INV_STOCK_MANAGEMENT_INV_MERグリッド定義
 */

let InvStockManagementInvMerGridColumns = [
    Column.cell('INV_PHASE', Messages['InvStockManagementInvMerGrid.invPhase'], 30, 'primaryKey', null),
    Column.cell('INV_PHASE_MONTH', Messages['InvStockManagementInvMerGrid.invPhaseMonth'], 20, 'primaryKey', null),
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvStockManagementInvMerGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockManagementInvMerGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvStockManagementInvMerGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.text('INV_STOCK', Messages['InvStockManagementInvMerGrid.invStock'], 110, '', null),
    Column.text('STOCK', Messages['InvStockManagementInvMerGrid.stock'], 110, '', null),
    Column.text('UNIT_COST', Messages['InvStockManagementInvMerGrid.unitCost'], 90, '', null),
    Column.date('LAST_IN_OUT_DATE', Messages['InvStockManagementInvMerGrid.lastInOutDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockManagementInvMerGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockManagementInvMerGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockManagementInvMerGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockManagementInvMerGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['InvStockManagementInvMerGrid.deleteFlag'], 10, ''),
];
