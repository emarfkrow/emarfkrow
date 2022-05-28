/**
 * PRD_PRE_STATUS_Mグリッド定義
 */

let PrdPreStatusMGridColumns = [
    Column.cell('YY', Messages['PrdPreStatusMGrid.yy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdPreStatusMGrid.mm'], 20, 'primaryKey', null),
    Column.text('SALES_TARGET_STATUS', Messages['PrdPreStatusMGrid.salesTargetStatus'], 10, '', null),
    Column.text('PRD_PLAN_MAKE_STATUS', Messages['PrdPreStatusMGrid.prdPlanMakeStatus'], 10, '', null),
    Column.text('PRD_PLAN_FIXED_STATUS', Messages['PrdPreStatusMGrid.prdPlanFixedStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdPreStatusMGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdPreStatusMGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdPreStatusMGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdPreStatusMGrid.userIdChange'], 100, 'metaInfo', null),
];
