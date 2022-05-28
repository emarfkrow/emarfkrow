/**
 * PRD_KANBAN_MENTE_HISTORYグリッド定義
 */

let PrdKanbanMenteHistoryGridColumns = [
    Column.cell('KANBAN_ID', Messages['PrdKanbanMenteHistoryGrid.kanbanId'], 90, 'primaryKey', null),
    Column.cell('SERIAL_NO', Messages['PrdKanbanMenteHistoryGrid.serialNo'], 40, 'primaryKey', null),
    Column.date('PRINT_OUT_DATE', Messages['PrdKanbanMenteHistoryGrid.printOutDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('PRINT_OUT_OPERATOR', Messages['PrdKanbanMenteHistoryGrid.printOutOperator'], 100, '', null),
    Column.date('SCRAP_DATE', Messages['PrdKanbanMenteHistoryGrid.scrapDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('SCRAP_OPERATOR', Messages['PrdKanbanMenteHistoryGrid.scrapOperator'], 100, '', null),
    Column.date('LOST_DATE', Messages['PrdKanbanMenteHistoryGrid.lostDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('LOST_OPERATOR', Messages['PrdKanbanMenteHistoryGrid.lostOperator'], 100, '', null),
    Column.text('LOST_REQ', Messages['PrdKanbanMenteHistoryGrid.lostReq'], 100, '', null),
    Column.text('LOST_REASON', Messages['PrdKanbanMenteHistoryGrid.lostReason'], 100, '', null),
    Column.date('LOSS_SCRAP_DATE', Messages['PrdKanbanMenteHistoryGrid.lossScrapDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('LOSS_SCRAP_OPERATOR', Messages['PrdKanbanMenteHistoryGrid.lossScrapOperator'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdKanbanMenteHistoryGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdKanbanMenteHistoryGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdKanbanMenteHistoryGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdKanbanMenteHistoryGrid.userIdChange'], 100, 'metaInfo', null),
];
