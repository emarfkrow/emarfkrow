/**
 * PRD_PRE_STATUS_Yグリッド定義
 */

let PrdPreStatusYGridColumns = [
    Column.cell('YY', Messages['PrdPreStatusYGrid.yy'], 40, 'primaryKey', null),
    Column.text('SALES_TARGET_STATUS', Messages['PrdPreStatusYGrid.salesTargetStatus'], 10, '', null),
    Column.text('PRD_PLAN_MAKE_STATUS', Messages['PrdPreStatusYGrid.prdPlanMakeStatus'], 10, '', null),
    Column.text('PRD_PLAN_FIXED_STATUS', Messages['PrdPreStatusYGrid.prdPlanFixedStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdPreStatusYGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdPreStatusYGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdPreStatusYGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdPreStatusYGrid.userIdChange'], 100, 'metaInfo', null),
];
