/**
 * INV_Y_STK_PROD_AMOUNT_PRODグリッド定義
 */

let InvYStkProdAmountProdGridColumns = [
    Column.refer('PRO_HINBAN', Messages['InvYStkProdAmountProdGrid.proHinban'], 250, 'primaryKey', 'PRO_HINMEI'),
    Column.cell('YYYY', Messages['InvYStkProdAmountProdGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['InvYStkProdAmountProdGrid.mm'], 20, 'primaryKey', null),
    Column.text('NES_COUNTS', Messages['InvYStkProdAmountProdGrid.nesCounts'], 70, '', null),
    Column.text('STAN_COSTS', Messages['InvYStkProdAmountProdGrid.stanCosts'], 90, '', null),
    Column.select('SHIKAKE_KBN', Messages['InvYStkProdAmountProdGrid.shikakeKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PRO_LT', Messages['InvYStkProdAmountProdGrid.proLt'], 60, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvYStkProdAmountProdGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvYStkProdAmountProdGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvYStkProdAmountProdGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvYStkProdAmountProdGrid.userIdChange'], 100, 'metaInfo', null),
];
