/**
 * MFG_KANBAN_HEDグリッド定義
 */

let MfgKanbanHedGridColumns = [
    Column.cell('ROUTING_GROUP', Messages['MfgKanbanHedGrid.routingGroup'], 20, 'primaryKey', null),
    Column.cell('MAN_HINBAN', Messages['MfgKanbanHedGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['MfgKanbanHedGrid.routing'], 20, 'primaryKey', null),
    Column.text('KANBAN_ID_CURRENT', Messages['MfgKanbanHedGrid.kanbanIdCurrent'], 90, '', null),
    Column.text('KANBAN_ID_NEXT', Messages['MfgKanbanHedGrid.kanbanIdNext'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgKanbanHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgKanbanHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgKanbanHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgKanbanHedGrid.userIdChange'], 100, 'metaInfo', null),
    Column.text('FOR_ROUTING', Messages['MfgKanbanHedGrid.forRouting'], 20, '', null),
];
