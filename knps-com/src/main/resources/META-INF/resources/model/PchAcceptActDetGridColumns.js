/**
 * PCH_ACCEPT_ACT_DETグリッド定義
 */

let PchAcceptActDetGridColumns = [
    Column.cell('ACT_NO', Messages['PchAcceptActDetGrid.actNo'], 100, 'primaryKey', null),
    Column.cell('ACT_BRANCH_NO', Messages['PchAcceptActDetGrid.actBranchNo'], 20, 'primaryKey', null),
    Column.text('INSPECT_COUNTS', Messages['PchAcceptActDetGrid.inspectCounts'], 110, '', null),
    Column.text('INSPECT_UNIT', Messages['PchAcceptActDetGrid.inspectUnit'], 90, '', null),
    Column.text('AMOUNT', Messages['PchAcceptActDetGrid.amount'], 110, '', null),
    Column.text('TAX_AMOUNT', Messages['PchAcceptActDetGrid.taxAmount'], 110, '', null),
    Column.date('CHECK_ISSUE_DATE', Messages['PchAcceptActDetGrid.checkIssueDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('CHECK_LIST_NO', Messages['PchAcceptActDetGrid.checkListNo'], 80, '', null),
    Column.text('CHECK_ISSUE_OPE', Messages['PchAcceptActDetGrid.checkIssueOpe'], 100, '', null),
    Column.check('CHECK_FLG', Messages['PchAcceptActDetGrid.checkFlg'], 10, ''),
    Column.date('CHECK_COMP_DATE', Messages['PchAcceptActDetGrid.checkCompDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('CHECK_COMP_OPE', Messages['PchAcceptActDetGrid.checkCompOpe'], 100, '', null),
    Column.date('CLOSE_DATE', Messages['PchAcceptActDetGrid.closeDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['PchAcceptActDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchAcceptActDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchAcceptActDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchAcceptActDetGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('INSPECT_ISSHIKI_UNIT_F', Messages['PchAcceptActDetGrid.inspectIsshikiUnitF'], 10, ''),
    Column.text('INSPECT_ISSHIKI_COUNTS', Messages['PchAcceptActDetGrid.inspectIsshikiCounts'], 110, '', null),
    Column.text('INSPECT_ISSHIKI_UNIT', Messages['PchAcceptActDetGrid.inspectIsshikiUnit'], 90, '', null),
];
