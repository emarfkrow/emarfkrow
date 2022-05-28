/**
 * INV_STOCK_MANAGEMENT_INV_DETグリッド定義
 */

let InvStockManagementInvDetGridColumns = [
    Column.cell('INV_PHASE', Messages['InvStockManagementInvDetGrid.invPhase'], 30, 'primaryKey', null),
    Column.cell('INV_PHASE_MONTH', Messages['InvStockManagementInvDetGrid.invPhaseMonth'], 20, 'primaryKey', null),
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvStockManagementInvDetGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockManagementInvDetGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvStockManagementInvDetGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.cell('INV_BRANCH_NO', Messages['InvStockManagementInvDetGrid.invBranchNo'], 20, 'primaryKey', null),
    Column.text('SLIP_NO', Messages['InvStockManagementInvDetGrid.slipNo'], 50, '', null),
    Column.select('STOCK_CODE', Messages['InvStockManagementInvDetGrid.stockCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('INV_STOCK', Messages['InvStockManagementInvDetGrid.invStock'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockManagementInvDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockManagementInvDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockManagementInvDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockManagementInvDetGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['InvStockManagementInvDetGrid.deleteFlag'], 10, ''),
];
