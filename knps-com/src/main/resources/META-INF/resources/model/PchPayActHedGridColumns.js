/**
 * PCH_PAY_ACT_HEDグリッド定義
 */

let PchPayActHedGridColumns = [
    Column.cell('PAY_NO', Messages['PchPayActHedGrid.payNo'], 100, 'primaryKey', null),
    Column.text('HINBAN', Messages['PchPayActHedGrid.hinban'], 250, '', null),
    Column.text('ITEM', Messages['PchPayActHedGrid.item'], 300, '', null),
    Column.select('SUPPLY_KBN', Messages['PchPayActHedGrid.supplyKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('FROM_PAY', Messages['PchPayActHedGrid.fromPay'], 100, '', null),
    Column.text('TO_PAY', Messages['PchPayActHedGrid.toPay'], 100, '', null),
    Column.refer('UNIT_CODE', Messages['PchPayActHedGrid.unitCode'], 20, '', 'UNIT_NAME'),
    Column.refer('TAX_CODE', Messages['PchPayActHedGrid.taxCode'], 20, '', 'TAX_NAME'),
    Column.select('TAX_CAL_CODE', Messages['PchPayActHedGrid.taxCalCode'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('ACCOUNT_CODE', Messages['PchPayActHedGrid.accountCode'], 50, '', 'ACCOUNT_NAME'),
    Column.text('SUPPLY_NO', Messages['PchPayActHedGrid.supplyNo'], 120, '', null),
    Column.text('SHIP_ORDER_NO', Messages['PchPayActHedGrid.shipOrderNo'], 100, '', null),
    Column.date('PAY_DATE', Messages['PchPayActHedGrid.payDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['PchPayActHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchPayActHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchPayActHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchPayActHedGrid.userIdChange'], 100, 'metaInfo', null),
];
