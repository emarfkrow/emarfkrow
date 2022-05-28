/**
 * MST_ACCOUNT_CODEグリッド定義
 */

let MstAccountCodeGridColumns = [
    Column.cell('ACCOUNT_CODE', Messages['MstAccountCodeGrid.accountCode'], 50, 'primaryKey', null),
    Column.text('ACCOUNT_NAME', Messages['MstAccountCodeGrid.accountName'], 300, '', null),
    Column.text('EXPENSE_KBN1', Messages['MstAccountCodeGrid.expenseKbn1'], 10, '', null),
    Column.text('EXPENSE_KBN2', Messages['MstAccountCodeGrid.expenseKbn2'], 10, '', null),
    Column.text('EXPENSE_KBN3', Messages['MstAccountCodeGrid.expenseKbn3'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstAccountCodeGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstAccountCodeGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstAccountCodeGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstAccountCodeGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstAccountCodeGrid.deleteFlag'], 10, ''),
];
