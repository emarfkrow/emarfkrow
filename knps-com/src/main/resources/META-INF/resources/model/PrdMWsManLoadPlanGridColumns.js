/**
 * PRD_M_WS_MAN_LOAD_PLANグリッド定義
 */

let PrdMWsManLoadPlanGridColumns = [
    Column.cell('YYYY', Messages['PrdMWsManLoadPlanGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMWsManLoadPlanGrid.mm'], 20, 'primaryKey', null),
    Column.refer('MAN_HINBAN', Messages['PrdMWsManLoadPlanGrid.manHinban'], 250, 'primaryKey', 'MAN_HINMEI'),
    Column.refer('WS_CODE', Messages['PrdMWsManLoadPlanGrid.wsCode'], 40, 'primaryKey', 'WS_NAME'),
    Column.text('PRO_NES_COUNTS', Messages['PrdMWsManLoadPlanGrid.proNesCounts'], 70, '', null),
    Column.text('HUM_PRE_TIME', Messages['PrdMWsManLoadPlanGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdMWsManLoadPlanGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME_IN', Messages['PrdMWsManLoadPlanGrid.macPreTimeIn'], 70, '', null),
    Column.text('MAC_ACT_TIME_IN', Messages['PrdMWsManLoadPlanGrid.macActTimeIn'], 70, '', null),
    Column.text('MAC_PRE_TIME_OUT', Messages['PrdMWsManLoadPlanGrid.macPreTimeOut'], 70, '', null),
    Column.text('MAC_ACT_TIME_OUT', Messages['PrdMWsManLoadPlanGrid.macActTimeOut'], 70, '', null),
    Column.text('MAC_PRE_TIME_KANBAN', Messages['PrdMWsManLoadPlanGrid.macPreTimeKanban'], 70, '', null),
    Column.text('MAC_ACT_TIME_KANBAN', Messages['PrdMWsManLoadPlanGrid.macActTimeKanban'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMWsManLoadPlanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMWsManLoadPlanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMWsManLoadPlanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMWsManLoadPlanGrid.userIdChange'], 100, 'metaInfo', null),
];
