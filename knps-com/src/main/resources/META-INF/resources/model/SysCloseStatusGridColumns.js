/**
 * SYS_CLOSE_STATUSグリッド定義
 */

let SysCloseStatusGridColumns = [
    Column.cell('REC_NO', Messages['SysCloseStatusGrid.recNo'], 30, 'primaryKey', null),
    Column.date('DAIRY_CLOSE_TARGET_DATE', Messages['SysCloseStatusGrid.dairyCloseTargetDate'], 80, '', null),
    Column.text('DAIRY_CLOSE_STATUS', Messages['SysCloseStatusGrid.dairyCloseStatus'], 10, '', null),
    Column.date('DAIRY_CLOSE_DATE', Messages['SysCloseStatusGrid.dairyCloseDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('MONTHRY_CLOSE_TARGET_DATE', Messages['SysCloseStatusGrid.monthryCloseTargetDate'], 60, '', null),
    Column.text('MONTHRY_CLOSE_STATUS', Messages['SysCloseStatusGrid.monthryCloseStatus'], 10, '', null),
    Column.date('MONTHRY_CLOSE_DATE', Messages['SysCloseStatusGrid.monthryCloseDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('MONTHRY_SETTLE_TARGET_DATE', Messages['SysCloseStatusGrid.monthrySettleTargetDate'], 60, '', null),
    Column.text('MONTHRY_SETTLE_STATUS', Messages['SysCloseStatusGrid.monthrySettleStatus'], 10, '', null),
    Column.date('MONTHRY_SETTLE_DATE', Messages['SysCloseStatusGrid.monthrySettleDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('MONTHRY_SETTLE_COST_FIXED', Messages['SysCloseStatusGrid.monthrySettleCostFixed'], 10, '', null),
    Column.date('ANNUAL_SETTLE_TARGET_DATE', Messages['SysCloseStatusGrid.annualSettleTargetDate'], 40, '', null),
    Column.text('ANNUAL_SETTLE_STATUS', Messages['SysCloseStatusGrid.annualSettleStatus'], 10, '', null),
    Column.date('ANNUAL_SETTLE_DATE', Messages['SysCloseStatusGrid.annualSettleDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('ANNUAL_SETTLE_COST_FIXED', Messages['SysCloseStatusGrid.annualSettleCostFixed'], 10, '', null),
    Column.check('MASTER_COPY_FLAG', Messages['SysCloseStatusGrid.masterCopyFlag'], 10, ''),
    Column.date('MASTER_COPY_DATE', Messages['SysCloseStatusGrid.masterCopyDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['SysCloseStatusGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['SysCloseStatusGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['SysCloseStatusGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['SysCloseStatusGrid.userIdChange'], 100, 'metaInfo', null),
    Column.date('QUARTER_SETTLE_TARGET_DATE', Messages['SysCloseStatusGrid.quarterSettleTargetDate'], 60, '', null),
    Column.text('QUARTER_SETTLE_STATUS', Messages['SysCloseStatusGrid.quarterSettleStatus'], 10, '', null),
    Column.date('QUARTER_SETTLE_DATE', Messages['SysCloseStatusGrid.quarterSettleDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('QUARTER_SETTLE_COST_FIXED', Messages['SysCloseStatusGrid.quarterSettleCostFixed'], 10, '', null),
];
