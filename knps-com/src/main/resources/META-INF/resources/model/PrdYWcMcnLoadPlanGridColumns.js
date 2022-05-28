/**
 * PRD_Y_WC_MCN_LOAD_PLANグリッド定義
 */

let PrdYWcMcnLoadPlanGridColumns = [
    Column.cell('YYYY', Messages['PrdYWcMcnLoadPlanGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdYWcMcnLoadPlanGrid.mm'], 20, 'primaryKey', null),
    Column.cell('MAN_HINBAN', Messages['PrdYWcMcnLoadPlanGrid.manHinban'], 250, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['PrdYWcMcnLoadPlanGrid.wcCode'], 30, 'primaryKey', 'WC_NAME'),
    Column.text('PRO_NES_COUNTS', Messages['PrdYWcMcnLoadPlanGrid.proNesCounts'], 70, '', null),
    Column.text('HUM_PRE_TIME', Messages['PrdYWcMcnLoadPlanGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdYWcMcnLoadPlanGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME_IN', Messages['PrdYWcMcnLoadPlanGrid.macPreTimeIn'], 70, '', null),
    Column.text('MAC_ACT_TIME_IN', Messages['PrdYWcMcnLoadPlanGrid.macActTimeIn'], 70, '', null),
    Column.text('MAC_PRE_TIME_OUT', Messages['PrdYWcMcnLoadPlanGrid.macPreTimeOut'], 70, '', null),
    Column.text('MAC_ACT_TIME_OUT', Messages['PrdYWcMcnLoadPlanGrid.macActTimeOut'], 70, '', null),
    Column.text('MAC_PRE_TIME_KANBAN', Messages['PrdYWcMcnLoadPlanGrid.macPreTimeKanban'], 70, '', null),
    Column.text('MAC_ACT_TIME_KANBAN', Messages['PrdYWcMcnLoadPlanGrid.macActTimeKanban'], 70, '', null),
    Column.text('COMMENT1', Messages['PrdYWcMcnLoadPlanGrid.comment1'], 250, '', null),
    Column.text('COMMENT2', Messages['PrdYWcMcnLoadPlanGrid.comment2'], 250, '', null),
    Column.text('UNIT_WEIGHT', Messages['PrdYWcMcnLoadPlanGrid.unitWeight'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdYWcMcnLoadPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdYWcMcnLoadPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdYWcMcnLoadPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdYWcMcnLoadPlanGrid.userIdChange'], 100, 'metaInfo', null),
];
