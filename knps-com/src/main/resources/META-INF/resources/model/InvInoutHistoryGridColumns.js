/**
 * INV_INOUT_HISTORYグリッド定義
 */

let InvInoutHistoryGridColumns = [
    Column.cell('ACTION_DATE', Messages['InvInoutHistoryGrid.actionDate'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.cell('HINBAN', Messages['InvInoutHistoryGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('IN_OUT_COUNTS', Messages['InvInoutHistoryGrid.inOutCounts'], 120, 'primaryKey', null),
    Column.cell('IN_OUT_KBN', Messages['InvInoutHistoryGrid.inOutKbn'], 10, 'primaryKey', null),
    Column.text('FROM_PAY', Messages['InvInoutHistoryGrid.fromPay'], 100, '', null),
    Column.text('TO_PAY', Messages['InvInoutHistoryGrid.toPay'], 100, '', null),
    Column.text('REQ_NAME', Messages['InvInoutHistoryGrid.reqName'], 160, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvInoutHistoryGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvInoutHistoryGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvInoutHistoryGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvInoutHistoryGrid.userIdChange'], 100, 'metaInfo', null),
];
