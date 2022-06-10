/**
 * PCH_ACCEPT_ACT_HEDグリッド定義
 */

let PchAcceptActHedGridColumns = [
    Column.cell('ACT_NO', Messages['PchAcceptActHedGrid.actNo'], 100, 'primaryKey', null),
    Column.select('SUP_CODE', Messages['PchAcceptActHedGrid.supCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('ORDER_NO', Messages['PchAcceptActHedGrid.orderNo'], 100, '', null),
    Column.text('HINBAN', Messages['PchAcceptActHedGrid.hinban'], 250, '', null),
    Column.text('ITEM', Messages['PchAcceptActHedGrid.item'], 300, '', null),
    Column.date('ACCEPT_DATE', Messages['PchAcceptActHedGrid.acceptDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.refer('UNIT_CODE', Messages['PchAcceptActHedGrid.unitCode'], 20, '', 'UNIT_NAME'),
    Column.refer('TAX_CODE', Messages['PchAcceptActHedGrid.taxCode'], 20, '', 'TAX_NAME'),
    Column.select('TAX_CAL_CODE', Messages['PchAcceptActHedGrid.taxCalCode'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SUBINV_CODE', Messages['PchAcceptActHedGrid.subinvCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('ACCOUNT_CODE', Messages['PchAcceptActHedGrid.accountCode'], 50, '', 'ACCOUNT_NAME'),
    Column.cell('TIME_STAMP_CREATE', Messages['PchAcceptActHedGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchAcceptActHedGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchAcceptActHedGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchAcceptActHedGrid.userIdChange'], 100, 'metaInfo', null),
];
