/**
 * MST_BUS_PERMISSIONグリッド定義
 */

let MstBusPermissionGridColumns = [
    Column.cell('COMP_CODE', Messages['MstBusPermissionGrid.compCode'], 20, 'primaryKey', null),
    Column.cell('BUSINESS_NO', Messages['MstBusPermissionGrid.businessNo'], 10, 'primaryKey', null),
    Column.text('PERMISSION', Messages['MstBusPermissionGrid.permission'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstBusPermissionGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstBusPermissionGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstBusPermissionGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstBusPermissionGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstBusPermissionGrid.deleteFlag'], 10, ''),
];
