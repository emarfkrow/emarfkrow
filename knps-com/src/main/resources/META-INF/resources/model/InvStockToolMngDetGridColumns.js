/**
 * INV_STOCK_TOOL_MNG_DETグリッド定義
 */

let InvStockToolMngDetGridColumns = [
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvStockToolMngDetGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockToolMngDetGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvStockToolMngDetGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.cell('IN_OUT_DATE', Messages['InvStockToolMngDetGrid.inOutDate'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.cell('STOCK_BRANCH_NUMBER', Messages['InvStockToolMngDetGrid.stockBranchNumber'], 50, 'primaryKey', null),
    Column.text('IN_OUT_STATUS', Messages['InvStockToolMngDetGrid.inOutStatus'], 10, '', null),
    Column.refer('RECEIPT_SUP_CODE', Messages['InvStockToolMngDetGrid.receiptSupCode'], 60, '', 'RECEIPT_SUP_NAME'),
    Column.text('STOCK', Messages['InvStockToolMngDetGrid.stock'], 110, '', null),
    Column.text('INV_COMMENT', Messages['InvStockToolMngDetGrid.invComment'], 250, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockToolMngDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockToolMngDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockToolMngDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockToolMngDetGrid.userIdChange'], 100, 'metaInfo', null),
];
