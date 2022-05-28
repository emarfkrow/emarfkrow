/**
 * MFG_PRO_ACT_DETグリッド定義
 */

let MfgProActDetGridColumns = [
    Column.cell('PRO_NO', Messages['MfgProActDetGrid.proNo'], 140, 'primaryKey', null),
    Column.cell('PRO_ROUTING_BRANCH', Messages['MfgProActDetGrid.proRoutingBranch'], 20, 'primaryKey', null),
    Column.cell('PRO_ACT_BRANCH_NO', Messages['MfgProActDetGrid.proActBranchNo'], 20, 'primaryKey', null),
    Column.text('ACT_ITEM', Messages['MfgProActDetGrid.actItem'], 10, '', null),
    Column.date('ACT_DATE', Messages['MfgProActDetGrid.actDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.select('CAUSE_CODE', Messages['MfgProActDetGrid.causeCode'], 30, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('OPERATOR', Messages['MfgProActDetGrid.operator'], 100, '', null),
    Column.text('LAST_ROUTING', Messages['MfgProActDetGrid.lastRouting'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgProActDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgProActDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgProActDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgProActDetGrid.userIdChange'], 100, 'metaInfo', null),
];
