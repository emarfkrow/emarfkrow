/**
 * MST_PROD_UNITPRICE_HSグリッド定義
 */

let MstProdUnitpriceHsGridColumns = [
    Column.cell('MAN_HINBAN', Messages['MstProdUnitpriceHsGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING_GROUP', Messages['MstProdUnitpriceHsGrid.routingGroup'], 20, 'primaryKey', null),
    Column.cell('ROUTING', Messages['MstProdUnitpriceHsGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['MstProdUnitpriceHsGrid.wcCode'], 30, 'primaryKey', 'WC_NAME'),
    Column.cell('MIN_ORDER', Messages['MstProdUnitpriceHsGrid.minOrder'], 110, 'primaryKey', null),
    Column.text('STAN_COUNTS', Messages['MstProdUnitpriceHsGrid.stanCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['MstProdUnitpriceHsGrid.orderUnit'], 90, '', null),
    Column.check('STANDARD_UNITPRICE_FLAG', Messages['MstProdUnitpriceHsGrid.standardUnitpriceFlag'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MstProdUnitpriceHsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstProdUnitpriceHsGrid.timeStampChange'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstProdUnitpriceHsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstProdUnitpriceHsGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstProdUnitpriceHsGrid.deleteFlag'], 10, ''),
    Column.select('GAIKA_KB', Messages['MstProdUnitpriceHsGrid.gaikaKb'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('GAIKA_TK', Messages['MstProdUnitpriceHsGrid.gaikaTk'], 100, '', null),
    Column.check('ISSHIKI_UNIT_F', Messages['MstProdUnitpriceHsGrid.isshikiUnitF'], 10, ''),
    Column.text('MIN_ORDER_AMOUNT', Messages['MstProdUnitpriceHsGrid.minOrderAmount'], 110, '', null),
];
