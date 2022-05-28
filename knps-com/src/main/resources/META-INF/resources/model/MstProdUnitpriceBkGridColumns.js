/**
 * MST_PROD_UNITPRICE_BKグリッド定義
 */

let MstProdUnitpriceBkGridColumns = [
    Column.cell('YY', Messages['MstProdUnitpriceBkGrid.yy'], 40, 'primaryKey', null),
    Column.cell('ROUTING_GROUP', Messages['MstProdUnitpriceBkGrid.routingGroup'], 20, 'primaryKey', null),
    Column.cell('MAN_HINBAN', Messages['MstProdUnitpriceBkGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['MstProdUnitpriceBkGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['MstProdUnitpriceBkGrid.wcCode'], 30, 'primaryKey', 'WC_NAME'),
    Column.cell('MIN_ORDER', Messages['MstProdUnitpriceBkGrid.minOrder'], 110, 'primaryKey', null),
    Column.text('STAN_COUNTS', Messages['MstProdUnitpriceBkGrid.stanCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['MstProdUnitpriceBkGrid.orderUnit'], 90, '', null),
    Column.check('STANDARD_UNITPRICE_FLAG', Messages['MstProdUnitpriceBkGrid.standardUnitpriceFlag'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MstProdUnitpriceBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstProdUnitpriceBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstProdUnitpriceBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstProdUnitpriceBkGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstProdUnitpriceBkGrid.deleteFlag'], 10, ''),
    Column.select('GAIKA_KB', Messages['MstProdUnitpriceBkGrid.gaikaKb'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('GAIKA_TK', Messages['MstProdUnitpriceBkGrid.gaikaTk'], 100, '', null),
    Column.check('ISSHIKI_UNIT_F', Messages['MstProdUnitpriceBkGrid.isshikiUnitF'], 10, ''),
    Column.text('MIN_ORDER_AMOUNT', Messages['MstProdUnitpriceBkGrid.minOrderAmount'], 110, '', null),
];
