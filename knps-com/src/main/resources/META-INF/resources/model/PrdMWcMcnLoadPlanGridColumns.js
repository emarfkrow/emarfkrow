/**
 * PRD_M_WC_MCN_LOAD_PLANグリッド定義
 */

let PrdMWcMcnLoadPlanGridColumns = [
    Column.cell('YYYY', Messages['PrdMWcMcnLoadPlanGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMWcMcnLoadPlanGrid.mm'], 20, 'primaryKey', null),
    Column.refer('MAN_HINBAN', Messages['PrdMWcMcnLoadPlanGrid.manHinban'], 250, 'primaryKey', 'MAN_HINMEI'),
    Column.refer('WC_CODE', Messages['PrdMWcMcnLoadPlanGrid.wcCode'], 30, 'primaryKey', 'WC_NAME'),
    Column.text('PRO_NES_COUNTS', Messages['PrdMWcMcnLoadPlanGrid.proNesCounts'], 70, '', null),
    Column.text('HUM_PRE_TIME', Messages['PrdMWcMcnLoadPlanGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdMWcMcnLoadPlanGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME_IN', Messages['PrdMWcMcnLoadPlanGrid.macPreTimeIn'], 70, '', null),
    Column.text('MAC_ACT_TIME_IN', Messages['PrdMWcMcnLoadPlanGrid.macActTimeIn'], 70, '', null),
    Column.text('MAC_PRE_TIME_OUT', Messages['PrdMWcMcnLoadPlanGrid.macPreTimeOut'], 70, '', null),
    Column.text('MAC_ACT_TIME_OUT', Messages['PrdMWcMcnLoadPlanGrid.macActTimeOut'], 70, '', null),
    Column.text('MAC_PRE_TIME_KANBAN', Messages['PrdMWcMcnLoadPlanGrid.macPreTimeKanban'], 70, '', null),
    Column.text('MAC_ACT_TIME_KANBAN', Messages['PrdMWcMcnLoadPlanGrid.macActTimeKanban'], 70, '', null),
    Column.text('COMMENT1', Messages['PrdMWcMcnLoadPlanGrid.comment1'], 250, '', null),
    Column.text('COMMENT2', Messages['PrdMWcMcnLoadPlanGrid.comment2'], 250, '', null),
    Column.text('UNIT_WEIGHT', Messages['PrdMWcMcnLoadPlanGrid.unitWeight'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMWcMcnLoadPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMWcMcnLoadPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMWcMcnLoadPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMWcMcnLoadPlanGrid.userIdChange'], 100, 'metaInfo', null),
];
