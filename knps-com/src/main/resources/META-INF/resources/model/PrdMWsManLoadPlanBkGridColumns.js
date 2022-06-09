/**
 * PRD_M_WS_MAN_LOAD_PLAN_BKグリッド定義
 */

let PrdMWsManLoadPlanBkGridColumns = [
    Column.text('YYYY', Messages['PrdMWsManLoadPlanBkGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdMWsManLoadPlanBkGrid.mm'], 20, '', null),
    Column.refer('MAN_HINBAN', Messages['PrdMWsManLoadPlanBkGrid.manHinban'], 250, '', 'MAN_HINMEI'),
    Column.refer('WS_CODE', Messages['PrdMWsManLoadPlanBkGrid.wsCode'], 40, '', 'WS_NAME'),
    Column.text('PRO_NES_COUNTS', Messages['PrdMWsManLoadPlanBkGrid.proNesCounts'], 70, '', null),
    Column.text('HUM_PRE_TIME', Messages['PrdMWsManLoadPlanBkGrid.humPreTime'], 70, '', null),
    Column.text('HUM_ACT_TIME', Messages['PrdMWsManLoadPlanBkGrid.humActTime'], 70, '', null),
    Column.text('MAC_PRE_TIME_IN', Messages['PrdMWsManLoadPlanBkGrid.macPreTimeIn'], 70, '', null),
    Column.text('MAC_ACT_TIME_IN', Messages['PrdMWsManLoadPlanBkGrid.macActTimeIn'], 70, '', null),
    Column.text('MAC_PRE_TIME_OUT', Messages['PrdMWsManLoadPlanBkGrid.macPreTimeOut'], 70, '', null),
    Column.text('MAC_ACT_TIME_OUT', Messages['PrdMWsManLoadPlanBkGrid.macActTimeOut'], 70, '', null),
    Column.text('MAC_PRE_TIME_KANBAN', Messages['PrdMWsManLoadPlanBkGrid.macPreTimeKanban'], 70, '', null),
    Column.text('MAC_ACT_TIME_KANBAN', Messages['PrdMWsManLoadPlanBkGrid.macActTimeKanban'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMWsManLoadPlanBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMWsManLoadPlanBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMWsManLoadPlanBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMWsManLoadPlanBkGrid.userIdChange'], 100, 'metaInfo', null),
];
