/**
 * MFG_KANBAN_ACTグリッド定義
 */

let MfgKanbanActGridColumns = [
    Column.cell('ACT_NO', Messages['MfgKanbanActGrid.actNo'], 120, 'primaryKey', null),
    Column.text('KANBAN_ID', Messages['MfgKanbanActGrid.kanbanId'], 90, '', null),
    Column.text('SERIAL_NO', Messages['MfgKanbanActGrid.serialNo'], 40, '', null),
    Column.refer('WC_CODE', Messages['MfgKanbanActGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.date('ACT_DATE', Messages['MfgKanbanActGrid.actDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgKanbanActGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgKanbanActGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgKanbanActGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgKanbanActGrid.userIdChange'], 100, 'metaInfo', null),
];
