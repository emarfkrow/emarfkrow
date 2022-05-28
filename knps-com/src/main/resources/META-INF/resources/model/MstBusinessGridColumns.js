/**
 * MST_BUSINESSグリッド定義
 */

let MstBusinessGridColumns = [
    Column.cell('BUSINESS_ID', Messages['MstBusinessGrid.businessId'], 10, 'primaryKey', null),
    Column.text('BUSINESS_NAME', Messages['MstBusinessGrid.businessName'], 200, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstBusinessGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstBusinessGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstBusinessGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstBusinessGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstBusinessGrid.deleteFlag'], 10, ''),
];
