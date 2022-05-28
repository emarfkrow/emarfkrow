/**
 * MST_TAXグリッド定義
 */

let MstTaxGridColumns = [
    Column.cell('TAX_CODE', Messages['MstTaxGrid.taxCode'], 20, 'primaryKey', null),
    Column.text('TAX_NAME', Messages['MstTaxGrid.taxName'], 200, '', null),
    Column.text('TAX_RATE', Messages['MstTaxGrid.taxRate'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstTaxGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstTaxGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstTaxGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstTaxGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstTaxGrid.deleteFlag'], 10, ''),
];
