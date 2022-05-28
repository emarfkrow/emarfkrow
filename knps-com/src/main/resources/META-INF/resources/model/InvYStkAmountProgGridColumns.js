/**
 * INV_Y_STK_AMOUNT_PROGグリッド定義
 */

let InvYStkAmountProgGridColumns = [
    Column.cell('YYYY', Messages['InvYStkAmountProgGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['InvYStkAmountProgGrid.mm'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvYStkAmountProgGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['InvYStkAmountProgGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['InvYStkAmountProgGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.text('OPE_DETAIL', Messages['InvYStkAmountProgGrid.opeDetail'], 100, '', null),
    Column.text('NES_COUNTS', Messages['InvYStkAmountProgGrid.nesCounts'], 70, '', null),
    Column.text('ROU_AMOUNT', Messages['InvYStkAmountProgGrid.rouAmount'], 90, '', null),
    Column.text('ROU_LT', Messages['InvYStkAmountProgGrid.rouLt'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvYStkAmountProgGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvYStkAmountProgGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvYStkAmountProgGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvYStkAmountProgGrid.userIdChange'], 100, 'metaInfo', null),
];
