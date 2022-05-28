/**
 * MFG_MOD_ACT_DETグリッド定義
 */

let MfgModActDetGridColumns = [
    Column.cell('MOD_ACT_NO', Messages['MfgModActDetGrid.modActNo'], 120, 'primaryKey', null),
    Column.cell('MOD_ACT_BRANCH_NO', Messages['MfgModActDetGrid.modActBranchNo'], 20, 'primaryKey', null),
    Column.text('MOD_ACT_ITEM', Messages['MfgModActDetGrid.modActItem'], 10, '', null),
    Column.date('ACT_DATE', Messages['MfgModActDetGrid.actDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('OPERATOR', Messages['MfgModActDetGrid.operator'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgModActDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgModActDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgModActDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgModActDetGrid.userIdChange'], 100, 'metaInfo', null),
];
