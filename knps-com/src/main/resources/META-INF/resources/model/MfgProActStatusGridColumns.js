/**
 * MFG_PRO_ACT_STATUSグリッド定義
 */

let MfgProActStatusGridColumns = [
    Column.cell('CHILD_PLAN_NO', Messages['MfgProActStatusGrid.childPlanNo'], 120, 'primaryKey', null),
    Column.text('PRO_NO', Messages['MfgProActStatusGrid.proNo'], 140, '', null),
    Column.text('ACT_STATUS', Messages['MfgProActStatusGrid.actStatus'], 10, '', null),
    Column.text('USER_ID', Messages['MfgProActStatusGrid.userId'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgProActStatusGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
];
