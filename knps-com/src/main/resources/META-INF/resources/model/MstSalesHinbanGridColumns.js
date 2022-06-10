/**
 * MST_SALES_HINBANグリッド定義
 */

let MstSalesHinbanGridColumns = [
    Column.cell('SALES_HINBAN', Messages['MstSalesHinbanGrid.salesHinban'], 200, 'primaryKey', null),
    Column.select('COMP_KBN', Messages['MstSalesHinbanGrid.compKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSalesHinbanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSalesHinbanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSalesHinbanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSalesHinbanGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSalesHinbanGrid.deleteFlag'], 10, ''),
];
