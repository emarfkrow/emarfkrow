/**
 * INV_Y_STK_AMOUNT_COMMグリッド定義
 */

let InvYStkAmountCommGridColumns = [
    Column.refer('PRO_HINBAN', Messages['InvYStkAmountCommGrid.proHinban'], 250, 'primaryKey', 'PRO_HINMEI'),
    Column.cell('YYYY', Messages['InvYStkAmountCommGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['InvYStkAmountCommGrid.mm'], 20, 'primaryKey', null),
    Column.text('NES_COUNTS', Messages['InvYStkAmountCommGrid.nesCounts'], 70, '', null),
    Column.text('STAN_COSTS', Messages['InvYStkAmountCommGrid.stanCosts'], 90, '', null),
    Column.text('PROCURE_LT', Messages['InvYStkAmountCommGrid.procureLt'], 40, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvYStkAmountCommGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvYStkAmountCommGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvYStkAmountCommGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvYStkAmountCommGrid.userIdChange'], 100, 'metaInfo', null),
];
