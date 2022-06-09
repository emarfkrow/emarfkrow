/**
 * PRD_W_NES_KANBAN_OLDグリッド定義
 */

let PrdWNesKanbanOldGridColumns = [
    Column.refer('PRO_HINBAN', Messages['PrdWNesKanbanOldGrid.proHinban'], 250, 'primaryKey', 'PRO_HINMEI'),
    Column.text('STORE_WC', Messages['PrdWNesKanbanOldGrid.storeWc'], 30, '', null),
    Column.cell('ROUTING', Messages['PrdWNesKanbanOldGrid.routing'], 20, 'primaryKey', null),
    Column.cell('ROUTING_DEF_GROUP', Messages['PrdWNesKanbanOldGrid.routingDefGroup'], 20, 'primaryKey', null),
    Column.text('STORE_OPE_DETAIL', Messages['PrdWNesKanbanOldGrid.storeOpeDetail'], 100, '', null),
    Column.text('PRO_NES_COUNTS', Messages['PrdWNesKanbanOldGrid.proNesCounts'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdWNesKanbanOldGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdWNesKanbanOldGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdWNesKanbanOldGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdWNesKanbanOldGrid.userIdChange'], 100, 'metaInfo', null),
];
