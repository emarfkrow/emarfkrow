/**
 * MST_SUP_UNITPRICE_HSグリッド定義
 */

let MstSupUnitpriceHsGridColumns = [
    Column.cell('HINBAN', Messages['MstSupUnitpriceHsGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUP_CODE', Messages['MstSupUnitpriceHsGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.select('SUBINV_CODE', Messages['MstSupUnitpriceHsGrid.subinvCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PROCURE_LT', Messages['MstSupUnitpriceHsGrid.procureLt'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupUnitpriceHsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupUnitpriceHsGrid.timeStampChange'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupUnitpriceHsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupUnitpriceHsGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupUnitpriceHsGrid.deleteFlag'], 10, ''),
    Column.check('MUSHO_HACCHU_F', Messages['MstSupUnitpriceHsGrid.mushoHacchuF'], 10, ''),
];
