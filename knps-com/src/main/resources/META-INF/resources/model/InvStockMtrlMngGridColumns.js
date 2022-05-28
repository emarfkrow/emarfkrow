/**
 * INV_STOCK_MTRL_MNGグリッド定義
 */

let InvStockMtrlMngGridColumns = [
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvStockMtrlMngGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvStockMtrlMngGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvStockMtrlMngGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.text('STOCK', Messages['InvStockMtrlMngGrid.stock'], 110, '', null),
    Column.select('MAIN_STOCK_CODE', Messages['InvStockMtrlMngGrid.mainStockCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.date('LAST_IN_OUT_DATE', Messages['InvStockMtrlMngGrid.lastInOutDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockMtrlMngGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockMtrlMngGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockMtrlMngGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockMtrlMngGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['InvStockMtrlMngGrid.deleteFlag'], 10, ''),
];
