/**
 * MST_SUP_UNITPRICE_BKグリッド定義
 */

let MstSupUnitpriceBkGridColumns = [
    Column.cell('YY', Messages['MstSupUnitpriceBkGrid.yy'], 40, 'primaryKey', null),
    Column.cell('HINBAN', Messages['MstSupUnitpriceBkGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUP_CODE', Messages['MstSupUnitpriceBkGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.select('SUBINV_CODE', Messages['MstSupUnitpriceBkGrid.subinvCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PROCURE_LT', Messages['MstSupUnitpriceBkGrid.procureLt'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupUnitpriceBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupUnitpriceBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupUnitpriceBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupUnitpriceBkGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupUnitpriceBkGrid.deleteFlag'], 10, ''),
    Column.check('MUSHO_HACCHU_F', Messages['MstSupUnitpriceBkGrid.mushoHacchuF'], 10, ''),
];
