/**
 * MST_GAMENグリッド定義
 */

let MstGamenGridColumns = [
    Column.text('BUSINESS_ID', Messages['MstGamenGrid.businessId'], 10, '', null),
    Column.cell('GAMEN_ID', Messages['MstGamenGrid.gamenId'], 300, 'primaryKey', null),
    Column.text('GAMEN_NAME', Messages['MstGamenGrid.gamenName'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstGamenGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstGamenGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstGamenGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstGamenGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstGamenGrid.deleteFlag'], 10, ''),
];
