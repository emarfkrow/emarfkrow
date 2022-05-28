/**
 * PRD_M_PRO_PLAN_CONDITIONグリッド定義
 */

let PrdMProPlanConditionGridColumns = [
    Column.cell('YYYY', Messages['PrdMProPlanConditionGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMProPlanConditionGrid.mm'], 20, 'primaryKey', null),
    Column.text('OPE_DAYS', Messages['PrdMProPlanConditionGrid.opeDays'], 20, '', null),
    Column.text('FIXED_STATUS', Messages['PrdMProPlanConditionGrid.fixedStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMProPlanConditionGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMProPlanConditionGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMProPlanConditionGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMProPlanConditionGrid.userIdChange'], 100, 'metaInfo', null),
];
