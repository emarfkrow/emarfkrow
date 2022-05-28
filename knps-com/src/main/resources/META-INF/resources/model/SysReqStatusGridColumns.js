/**
 * SYS_REQ_STATUSグリッド定義
 */

let SysReqStatusGridColumns = [
    Column.cell('REQ_ID', Messages['SysReqStatusGrid.reqId'], 110, 'primaryKey', null),
    Column.text('REQ_PRG_NAME', Messages['SysReqStatusGrid.reqPrgName'], 300, '', null),
    Column.refer('REQ_EMP_CODE', Messages['SysReqStatusGrid.reqEmpCode'], 100, '', 'REQ_EMP_NAME'),
    Column.date('REQ_DATE', Messages['SysReqStatusGrid.reqDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('REQ_EXEC_DATE', Messages['SysReqStatusGrid.reqExecDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('REQ_COMP_DATE', Messages['SysReqStatusGrid.reqCompDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('EXEC_PHASE', Messages['SysReqStatusGrid.execPhase'], 10, '', null),
    Column.text('EXEC_STATUS', Messages['SysReqStatusGrid.execStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['SysReqStatusGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['SysReqStatusGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['SysReqStatusGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['SysReqStatusGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('PARAMS', Messages['SysReqStatusGrid.params'], 300, '', null),
];
