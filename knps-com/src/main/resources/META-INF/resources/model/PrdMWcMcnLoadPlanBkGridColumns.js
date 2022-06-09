/**
 * PRD_M_WC_MCN_LOAD_PLAN_BKグリッド定義
 */

let PrdMWcMcnLoadPlanBkGridColumns = [
    Column.text('YYYY', Messages['PrdMWcMcnLoadPlanBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdMWcMcnLoadPlanBkGrid.mm'], 20, '', null),
    Column.refer('MAN_HINBAN', Messages['PrdMWcMcnLoadPlanBkGrid.manHinban'], 250, '', 'MAN_HINMEI'),
    Column.refer('WC_CODE', Messages['PrdMWcMcnLoadPlanBkGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('PRO_NES_COUNTS', Messages['PrdMWcMcnLoadPlanBkGrid.proNesCounts'], 70, '', null),
    Column.text('HUM_PRE_TIME', Messages['PrdMWcMcnLoadPlanBkGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdMWcMcnLoadPlanBkGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME_IN', Messages['PrdMWcMcnLoadPlanBkGrid.macPreTimeIn'], 70, '', null),
    Column.text('MAC_ACT_TIME_IN', Messages['PrdMWcMcnLoadPlanBkGrid.macActTimeIn'], 70, '', null),
    Column.text('MAC_PRE_TIME_OUT', Messages['PrdMWcMcnLoadPlanBkGrid.macPreTimeOut'], 70, '', null),
    Column.text('MAC_ACT_TIME_OUT', Messages['PrdMWcMcnLoadPlanBkGrid.macActTimeOut'], 70, '', null),
    Column.text('MAC_PRE_TIME_KANBAN', Messages['PrdMWcMcnLoadPlanBkGrid.macPreTimeKanban'], 70, '', null),
    Column.text('MAC_ACT_TIME_KANBAN', Messages['PrdMWcMcnLoadPlanBkGrid.macActTimeKanban'], 70, '', null),
    Column.text('COMMENT1', Messages['PrdMWcMcnLoadPlanBkGrid.comment1'], 250, '', null),
    Column.text('COMMENT2', Messages['PrdMWcMcnLoadPlanBkGrid.comment2'], 250, '', null),
    Column.text('UNIT_WEIGHT', Messages['PrdMWcMcnLoadPlanBkGrid.unitWeight'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMWcMcnLoadPlanBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMWcMcnLoadPlanBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMWcMcnLoadPlanBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMWcMcnLoadPlanBkGrid.userIdChange'], 100, 'metaInfo', null),
];
