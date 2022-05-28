/**
 * PRD_Y_PRO_PLAN_CONDITIONグリッド定義
 */

let PrdYProPlanConditionGridColumns = [
    Column.cell('YYYY', Messages['PrdYProPlanConditionGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdYProPlanConditionGrid.mm'], 20, 'primaryKey', null),
    Column.text('OPE_DAYS', Messages['PrdYProPlanConditionGrid.opeDays'], 20, '', null),
    Column.text('FIXED_STATUS', Messages['PrdYProPlanConditionGrid.fixedStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdYProPlanConditionGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdYProPlanConditionGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdYProPlanConditionGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdYProPlanConditionGrid.userIdChange'], 100, 'metaInfo', null),
];
