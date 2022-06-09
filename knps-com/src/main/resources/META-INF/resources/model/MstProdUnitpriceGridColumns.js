/**
 * MST_PROD_UNITPRICEグリッド定義
 */

let MstProdUnitpriceGridColumns = [
    Column.cell('ROUTING_GROUP', Messages['MstProdUnitpriceGrid.routingGroup'], 20, 'primaryKey', null),
    Column.refer('MAN_HINBAN', Messages['MstProdUnitpriceGrid.manHinban'], 250, 'primaryKey', 'MAN_HINMEI'),
    Column.cell('ROUTING', Messages['MstProdUnitpriceGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['MstProdUnitpriceGrid.wcCode'], 30, 'primaryKey', 'WC_NAME'),
    Column.cell('MIN_ORDER', Messages['MstProdUnitpriceGrid.minOrder'], 110, 'primaryKey', null),
    Column.text('STAN_COUNTS', Messages['MstProdUnitpriceGrid.stanCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['MstProdUnitpriceGrid.orderUnit'], 90, '', null),
    Column.check('STANDARD_UNITPRICE_FLAG', Messages['MstProdUnitpriceGrid.standardUnitpriceFlag'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MstProdUnitpriceGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstProdUnitpriceGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstProdUnitpriceGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstProdUnitpriceGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstProdUnitpriceGrid.deleteFlag'], 10, ''),
    Column.select('GAIKA_KB', Messages['MstProdUnitpriceGrid.gaikaKb'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('GAIKA_TK', Messages['MstProdUnitpriceGrid.gaikaTk'], 100, '', null),
    Column.check('ISSHIKI_UNIT_F', Messages['MstProdUnitpriceGrid.isshikiUnitF'], 10, ''),
    Column.text('MIN_ORDER_AMOUNT', Messages['MstProdUnitpriceGrid.minOrderAmount'], 110, '', null),
];
