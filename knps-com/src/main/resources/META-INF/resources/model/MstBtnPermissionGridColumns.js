/**
 * MST_BTN_PERMISSIONグリッド定義
 */

let MstBtnPermissionGridColumns = [
    Column.cell('COMP_CODE', Messages['MstBtnPermissionGrid.compCode'], 20, 'primaryKey', null),
    Column.cell('GAMEN_ID', Messages['MstBtnPermissionGrid.gamenId'], 300, 'primaryKey', null),
    Column.cell('BUTTON_ID', Messages['MstBtnPermissionGrid.buttonId'], 300, 'primaryKey', null),
    Column.text('PERMISSION', Messages['MstBtnPermissionGrid.permission'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstBtnPermissionGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstBtnPermissionGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstBtnPermissionGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstBtnPermissionGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstBtnPermissionGrid.deleteFlag'], 10, ''),
];
