/**
 * MST_SUP_UNITPRICEグリッド定義
 */

let MstSupUnitpriceGridColumns = [
    Column.cell('HINBAN', Messages['MstSupUnitpriceGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUP_CODE', Messages['MstSupUnitpriceGrid.supCode'], 60, 'primaryKey', 'SUP_NAME'),
    Column.select('SUBINV_CODE', Messages['MstSupUnitpriceGrid.subinvCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PROCURE_LT', Messages['MstSupUnitpriceGrid.procureLt'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupUnitpriceGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupUnitpriceGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupUnitpriceGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupUnitpriceGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupUnitpriceGrid.deleteFlag'], 10, ''),
    Column.check('MUSHO_HACCHU_F', Messages['MstSupUnitpriceGrid.mushoHacchuF'], 10, ''),
];
