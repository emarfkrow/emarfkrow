/**
 * MST_SUP_UNITPRICE_DETAILグリッド定義
 */

let MstSupUnitpriceDetailGridColumns = [
    Column.cell('HINBAN', Messages['MstSupUnitpriceDetailGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUP_CODE', Messages['MstSupUnitpriceDetailGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.cell('MIN_ORDER', Messages['MstSupUnitpriceDetailGrid.minOrder'], 110, 'primaryKey', null),
    Column.text('STAN_COUNTS', Messages['MstSupUnitpriceDetailGrid.stanCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['MstSupUnitpriceDetailGrid.orderUnit'], 90, '', null),
    Column.check('STANDARD_UNITPRICE_FLAG', Messages['MstSupUnitpriceDetailGrid.standardUnitpriceFlag'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupUnitpriceDetailGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupUnitpriceDetailGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupUnitpriceDetailGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupUnitpriceDetailGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupUnitpriceDetailGrid.deleteFlag'], 10, ''),
    Column.select('GAIKA_KB', Messages['MstSupUnitpriceDetailGrid.gaikaKb'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('GAIKA_TK', Messages['MstSupUnitpriceDetailGrid.gaikaTk'], 100, '', null),
];
