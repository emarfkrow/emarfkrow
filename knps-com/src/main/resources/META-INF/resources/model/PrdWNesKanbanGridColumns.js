/**
 * PRD_W_NES_KANBANグリッド定義
 */

let PrdWNesKanbanGridColumns = [
    Column.refer('PRO_HINBAN', Messages['PrdWNesKanbanGrid.proHinban'], 250, 'primaryKey', 'PRO_HINMEI'),
    Column.text('STORE_WC', Messages['PrdWNesKanbanGrid.storeWc'], 30, '', null),
    Column.cell('ROUTING', Messages['PrdWNesKanbanGrid.routing'], 20, 'primaryKey', null),
    Column.cell('ROUTING_DEF_GROUP', Messages['PrdWNesKanbanGrid.routingDefGroup'], 20, 'primaryKey', null),
    Column.text('STORE_OPE_DETAIL', Messages['PrdWNesKanbanGrid.storeOpeDetail'], 100, '', null),
    Column.text('PRO_NES_COUNTS', Messages['PrdWNesKanbanGrid.proNesCounts'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdWNesKanbanGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdWNesKanbanGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdWNesKanbanGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdWNesKanbanGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('LOT_SIZE', Messages['PrdWNesKanbanGrid.lotSize'], 60, '', null),
    Column.text('ACC_COUNTS', Messages['PrdWNesKanbanGrid.accCounts'], 60, '', null),
    Column.text('COUNTS', Messages['PrdWNesKanbanGrid.counts'], 60, '', null),
];
