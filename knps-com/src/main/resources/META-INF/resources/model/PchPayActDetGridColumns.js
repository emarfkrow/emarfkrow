/**
 * PCH_PAY_ACT_DETグリッド定義
 */

let PchPayActDetGridColumns = [
    Column.cell('PAY_NO', Messages['PchPayActDetGrid.payNo'], 100, 'primaryKey', null),
    Column.cell('PAY_BRANCH_NO', Messages['PchPayActDetGrid.payBranchNo'], 20, 'primaryKey', null),
    Column.text('PAY_COUNTS', Messages['PchPayActDetGrid.payCounts'], 110, '', null),
    Column.text('UNIT_PRICE', Messages['PchPayActDetGrid.unitPrice'], 90, '', null),
    Column.text('AMOUNT', Messages['PchPayActDetGrid.amount'], 110, '', null),
    Column.text('TAX_AMOUNT', Messages['PchPayActDetGrid.taxAmount'], 110, '', null),
    Column.text('MEMO', Messages['PchPayActDetGrid.memo'], 300, '', null),
    Column.date('CLOSE_DATE', Messages['PchPayActDetGrid.closeDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['PchPayActDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchPayActDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchPayActDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchPayActDetGrid.userIdChange'], 100, 'metaInfo', null),
];
