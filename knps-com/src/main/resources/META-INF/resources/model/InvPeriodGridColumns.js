/**
 * INV_PERIODグリッド定義
 */

let InvPeriodGridColumns = [
    Column.cell('STOCK_MANAGEMENT_SECTION', Messages['InvPeriodGrid.stockManagementSection'], 10, 'primaryKey', null),
    Column.cell('INV_PHASE', Messages['InvPeriodGrid.invPhase'], 30, 'primaryKey', null),
    Column.cell('INV_PHASE_MONTH', Messages['InvPeriodGrid.invPhaseMonth'], 20, 'primaryKey', null),
    Column.refer('SUB_INV_CODE', Messages['InvPeriodGrid.subInvCode'], 100, 'primaryKey', 'SUB_INV_NAME'),
    Column.text('INV_DATE_FROM', Messages['InvPeriodGrid.invDateFrom'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('INV_DATE_TO', Messages['InvPeriodGrid.invDateTo'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('INV_STATUS', Messages['InvPeriodGrid.invStatus'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvPeriodGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvPeriodGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvPeriodGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvPeriodGrid.userIdChange'], 100, 'metaInfo', null),
];
