/**
 * INV_STOCK_PROCESS_WKグリッド定義
 */

let InvStockProcessWkGridColumns = [
    Column.text('HINBAN', Messages['InvStockProcessWkGrid.hinban'], 250, '', null),
    Column.text('ITEM', Messages['InvStockProcessWkGrid.item'], 300, '', null),
    Column.select('ITEM_KBN', Messages['InvStockProcessWkGrid.itemKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('HINBAN_OPE_CODE', Messages['InvStockProcessWkGrid.hinbanOpeCode'], 100, '', 'HINBAN_OPE_NAME'),
    Column.text('ROUTING_GROUP', Messages['InvStockProcessWkGrid.routingGroup'], 20, '', null),
    Column.select('WC_CODE', Messages['InvStockProcessWkGrid.wcCode'], 30, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('WC_NAME', Messages['InvStockProcessWkGrid.wcName'], 300, '', null),
    Column.text('OPE_DETAIL', Messages['InvStockProcessWkGrid.opeDetail'], 100, '', null),
    Column.date('LAST_IN_OUT_DATE', Messages['InvStockProcessWkGrid.lastInOutDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('STOCK', Messages['InvStockProcessWkGrid.stock'], 110, '', null),
    Column.text('PRO_NO', Messages['InvStockProcessWkGrid.proNo'], 140, '', null),
    Column.text('NEXT_ROUTING', Messages['InvStockProcessWkGrid.nextRouting'], 300, '', null),
    Column.text('NEXT_WC', Messages['InvStockProcessWkGrid.nextWc'], 30, '', null),
    Column.text('NEXT_DETAIL', Messages['InvStockProcessWkGrid.nextDetail'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockProcessWkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockProcessWkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockProcessWkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockProcessWkGrid.userIdChange'], 100, 'metaInfo', null),
];
