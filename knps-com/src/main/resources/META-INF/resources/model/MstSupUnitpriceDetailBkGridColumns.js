/**
 * MST_SUP_UNITPRICE_DETAIL_BKグリッド定義
 */

let MstSupUnitpriceDetailBkGridColumns = [
    Column.cell('YY', Messages['MstSupUnitpriceDetailBkGrid.yy'], 40, 'primaryKey', null),
    Column.cell('HINBAN', Messages['MstSupUnitpriceDetailBkGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUP_CODE', Messages['MstSupUnitpriceDetailBkGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.cell('MIN_ORDER', Messages['MstSupUnitpriceDetailBkGrid.minOrder'], 110, 'primaryKey', null),
    Column.text('STAN_COUNTS', Messages['MstSupUnitpriceDetailBkGrid.stanCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['MstSupUnitpriceDetailBkGrid.orderUnit'], 90, '', null),
    Column.check('STANDARD_UNITPRICE_FLAG', Messages['MstSupUnitpriceDetailBkGrid.standardUnitpriceFlag'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupUnitpriceDetailBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupUnitpriceDetailBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupUnitpriceDetailBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupUnitpriceDetailBkGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupUnitpriceDetailBkGrid.deleteFlag'], 10, ''),
    Column.select('GAIKA_KB', Messages['MstSupUnitpriceDetailBkGrid.gaikaKb'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('GAIKA_TK', Messages['MstSupUnitpriceDetailBkGrid.gaikaTk'], 100, '', null),
];
