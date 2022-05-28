/**
 * MST_GAMEN_PERMISSIONグリッド定義
 */

let MstGamenPermissionGridColumns = [
    Column.cell('COMP_CODE', Messages['MstGamenPermissionGrid.compCode'], 20, 'primaryKey', null),
    Column.cell('BUSINESS_NO', Messages['MstGamenPermissionGrid.businessNo'], 10, 'primaryKey', null),
    Column.cell('GAMEN_ID', Messages['MstGamenPermissionGrid.gamenId'], 300, 'primaryKey', null),
    Column.text('PERMISSION', Messages['MstGamenPermissionGrid.permission'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstGamenPermissionGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstGamenPermissionGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstGamenPermissionGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstGamenPermissionGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstGamenPermissionGrid.deleteFlag'], 10, ''),
];
