/**
 * INV_STOCK_TOOL_MNG_HEDグリッド定義
 */

let InvStockToolMngHedGridColumns = [
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvStockToolMngHedGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockToolMngHedGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvStockToolMngHedGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.text('STOCK', Messages['InvStockToolMngHedGrid.stock'], 110, '', null),
    Column.date('LAST_IN_OUT_DATE', Messages['InvStockToolMngHedGrid.lastInOutDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockToolMngHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockToolMngHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockToolMngHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockToolMngHedGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['InvStockToolMngHedGrid.deleteFlag'], 10, ''),
];
