/**
 * SYS_REQ_LOCK_STATUSグリッド定義
 */

let SysReqLockStatusGridColumns = [
    Column.cell('GAMEN_ID', Messages['SysReqLockStatusGrid.gamenId'], 300, 'primaryKey', null),
    Column.text('USER_ID', Messages['SysReqLockStatusGrid.userId'], 100, '', null),
    Column.date('LOCK_DATE', Messages['SysReqLockStatusGrid.lockDate'], 70, '', Slick.Formatters.Extends.DateTime),
];
