/**
 * PRD_M_PRO_PLAN_CONDITION_BKグリッド定義
 */

let PrdMProPlanConditionBkGridColumns = [
    Column.text('YYYY', Messages['PrdMProPlanConditionBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdMProPlanConditionBkGrid.mm'], 20, '', null),
    Column.text('OPE_DAYS', Messages['PrdMProPlanConditionBkGrid.opeDays'], 20, '', null),
    Column.text('FIXED_STATUS', Messages['PrdMProPlanConditionBkGrid.fixedStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMProPlanConditionBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMProPlanConditionBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMProPlanConditionBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMProPlanConditionBkGrid.userIdChange'], 100, 'metaInfo', null),
];
