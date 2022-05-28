/**
 * MFG_KANBAN_STATUSグリッド定義
 */

let MfgKanbanStatusGridColumns = [
    Column.cell('KANBAN_ID', Messages['MfgKanbanStatusGrid.kanbanId'], 90, 'primaryKey', null),
    Column.cell('SERIAL_NO', Messages['MfgKanbanStatusGrid.serialNo'], 40, 'primaryKey', null),
    Column.text('KANBAN_PRINT_STATUS', Messages['MfgKanbanStatusGrid.kanbanPrintStatus'], 10, '', null),
    Column.text('KANBAN_STATUS', Messages['MfgKanbanStatusGrid.kanbanStatus'], 10, '', null),
    Column.text('RE_ISSUE_COUNTS', Messages['MfgKanbanStatusGrid.reIssueCounts'], 20, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgKanbanStatusGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgKanbanStatusGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgKanbanStatusGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgKanbanStatusGrid.userIdChange'], 100, 'metaInfo', null),
];
