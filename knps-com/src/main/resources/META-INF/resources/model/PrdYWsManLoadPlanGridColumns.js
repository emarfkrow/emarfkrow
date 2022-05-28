/**
 * PRD_Y_WS_MAN_LOAD_PLANグリッド定義
 */

let PrdYWsManLoadPlanGridColumns = [
    Column.cell('YYYY', Messages['PrdYWsManLoadPlanGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdYWsManLoadPlanGrid.mm'], 20, 'primaryKey', null),
    Column.cell('MAN_HINBAN', Messages['PrdYWsManLoadPlanGrid.manHinban'], 250, 'primaryKey', null),
    Column.refer('WS_CODE', Messages['PrdYWsManLoadPlanGrid.wsCode'], 40, 'primaryKey', 'WS_NAME'),
    Column.text('PRO_NES_COUNTS', Messages['PrdYWsManLoadPlanGrid.proNesCounts'], 70, '', null),
    Column.text('HUM_PRE_TIME', Messages['PrdYWsManLoadPlanGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdYWsManLoadPlanGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME_IN', Messages['PrdYWsManLoadPlanGrid.macPreTimeIn'], 70, '', null),
    Column.text('MAC_ACT_TIME_IN', Messages['PrdYWsManLoadPlanGrid.macActTimeIn'], 70, '', null),
    Column.text('MAC_PRE_TIME_OUT', Messages['PrdYWsManLoadPlanGrid.macPreTimeOut'], 70, '', null),
    Column.text('MAC_ACT_TIME_OUT', Messages['PrdYWsManLoadPlanGrid.macActTimeOut'], 70, '', null),
    Column.text('MAC_PRE_TIME_KANBAN', Messages['PrdYWsManLoadPlanGrid.macPreTimeKanban'], 70, '', null),
    Column.text('MAC_ACT_TIME_KANBAN', Messages['PrdYWsManLoadPlanGrid.macActTimeKanban'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdYWsManLoadPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdYWsManLoadPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdYWsManLoadPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdYWsManLoadPlanGrid.userIdChange'], 100, 'metaInfo', null),
];
