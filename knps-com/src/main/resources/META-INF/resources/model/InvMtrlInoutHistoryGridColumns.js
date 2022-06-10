/**
 * INV_MTRL_INOUT_HISTORYグリッド定義
 */

let InvMtrlInoutHistoryGridColumns = [
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvMtrlInoutHistoryGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvMtrlInoutHistoryGrid.hinban'], 250, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvMtrlInoutHistoryGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.cell('IN_OUT_DATE', Messages['InvMtrlInoutHistoryGrid.inOutDate'], 70, 'primaryKey', Slick.Formatters.Extends.DateTime),
    Column.cell('STOCK_BRANCH_NUMBER', Messages['InvMtrlInoutHistoryGrid.stockBranchNumber'], 50, 'primaryKey', null),
    Column.text('ACT_NO', Messages['InvMtrlInoutHistoryGrid.actNo'], 100, '', null),
    Column.text('ACT_BRANCH_NO', Messages['InvMtrlInoutHistoryGrid.actBranchNo'], 20, '', null),
    Column.text('ORDER_NO', Messages['InvMtrlInoutHistoryGrid.orderNo'], 100, '', null),
    Column.text('PRO_NO', Messages['InvMtrlInoutHistoryGrid.proNo'], 140, '', null),
    Column.text('IN_OUT_STATUS', Messages['InvMtrlInoutHistoryGrid.inOutStatus'], 10, '', null),
    Column.select('RECEIPT_SUP_CODE', Messages['InvMtrlInoutHistoryGrid.receiptSupCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('ISSUE_HINBAN', Messages['InvMtrlInoutHistoryGrid.issueHinban'], 250, '', 'ISSUE_HINMEI'),
    Column.text('STOCK', Messages['InvMtrlInoutHistoryGrid.stock'], 110, '', null),
    Column.text('GOOD_COUNTS', Messages['InvMtrlInoutHistoryGrid.goodCounts'], 110, '', null),
    Column.text('MASTER_COUNTS', Messages['InvMtrlInoutHistoryGrid.masterCounts'], 120, '', null),
    Column.text('AMOUNT_USED_PHI', Messages['InvMtrlInoutHistoryGrid.amountUsedPhi'], 50, '', null),
    Column.text('AMOUNT_USED_LENGTH', Messages['InvMtrlInoutHistoryGrid.amountUsedLength'], 50, '', null),
    Column.text('INV_COMMENT', Messages['InvMtrlInoutHistoryGrid.invComment'], 250, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvMtrlInoutHistoryGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvMtrlInoutHistoryGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvMtrlInoutHistoryGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvMtrlInoutHistoryGrid.userIdChange'], 100, 'metaInfo', null),
];
