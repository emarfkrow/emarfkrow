/**
 * INV_STOCK_MANAGEMENT_INV_DET_Mグリッド定義
 */

let InvStockManagementInvDetMGridColumns = [
    Column.cell('INV_PHASE', Messages['InvStockManagementInvDetMGrid.invPhase'], 30, 'primaryKey', null),
    Column.cell('INV_PHASE_MONTH', Messages['InvStockManagementInvDetMGrid.invPhaseMonth'], 20, 'primaryKey', null),
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvStockManagementInvDetMGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockManagementInvDetMGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvStockManagementInvDetMGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.cell('INV_BRANCH_NO', Messages['InvStockManagementInvDetMGrid.invBranchNo'], 20, 'primaryKey', null),
    Column.text('SLIP_NO', Messages['InvStockManagementInvDetMGrid.slipNo'], 50, '', null),
    Column.select('STOCK_CODE', Messages['InvStockManagementInvDetMGrid.stockCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('INV_STOCK', Messages['InvStockManagementInvDetMGrid.invStock'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockManagementInvDetMGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockManagementInvDetMGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockManagementInvDetMGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockManagementInvDetMGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['InvStockManagementInvDetMGrid.deleteFlag'], 10, ''),
];
