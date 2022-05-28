/**
 * INV_STOCK_PROCESS_DETグリッド定義
 */

let InvStockProcessDetGridColumns = [
    Column.refer('LOCATION_CODE', Messages['InvStockProcessDetGrid.locationCode'], 100, 'primaryKey', 'LOCATION_NAME'),
    Column.cell('HINBAN', Messages['InvStockProcessDetGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('IN_OUT_YMD', Messages['InvStockProcessDetGrid.inOutYmd'], 100, 'primaryKey', null),
    Column.cell('IN_OUT_SEQ', Messages['InvStockProcessDetGrid.inOutSeq'], 100, 'primaryKey', null),
    Column.text('ROUTING_GROUP', Messages['InvStockProcessDetGrid.routingGroup'], 20, '', null),
    Column.text('OPE_DETAIL', Messages['InvStockProcessDetGrid.opeDetail'], 100, '', null),
    Column.select('IN_OUT_KB', Messages['InvStockProcessDetGrid.inOutKb'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('IN_OUT_QT', Messages['InvStockProcessDetGrid.inOutQt'], 110, '', null),
    Column.text('INV_CMT', Messages['InvStockProcessDetGrid.invCmt'], 250, '', null),
    Column.text('CHILD_PLAN_NO', Messages['InvStockProcessDetGrid.childPlanNo'], 120, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvStockProcessDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvStockProcessDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvStockProcessDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvStockProcessDetGrid.userIdChange'], 100, 'metaInfo', null),
];
