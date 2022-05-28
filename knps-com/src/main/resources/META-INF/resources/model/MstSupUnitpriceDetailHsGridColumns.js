/**
 * MST_SUP_UNITPRICE_DETAIL_HSグリッド定義
 */

let MstSupUnitpriceDetailHsGridColumns = [
    Column.cell('HINBAN', Messages['MstSupUnitpriceDetailHsGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUP_CODE', Messages['MstSupUnitpriceDetailHsGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.cell('MIN_ORDER', Messages['MstSupUnitpriceDetailHsGrid.minOrder'], 110, 'primaryKey', null),
    Column.text('STAN_COUNTS', Messages['MstSupUnitpriceDetailHsGrid.stanCounts'], 110, '', null),
    Column.text('ORDER_UNIT', Messages['MstSupUnitpriceDetailHsGrid.orderUnit'], 90, '', null),
    Column.check('STANDARD_UNITPRICE_FLAG', Messages['MstSupUnitpriceDetailHsGrid.standardUnitpriceFlag'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupUnitpriceDetailHsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupUnitpriceDetailHsGrid.timeStampChange'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupUnitpriceDetailHsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupUnitpriceDetailHsGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupUnitpriceDetailHsGrid.deleteFlag'], 10, ''),
    Column.select('GAIKA_KB', Messages['MstSupUnitpriceDetailHsGrid.gaikaKb'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('GAIKA_TK', Messages['MstSupUnitpriceDetailHsGrid.gaikaTk'], 100, '', null),
];
