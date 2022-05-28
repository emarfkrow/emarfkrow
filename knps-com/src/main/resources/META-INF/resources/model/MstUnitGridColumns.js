/**
 * MST_UNITグリッド定義
 */

let MstUnitGridColumns = [
    Column.cell('UNIT_CODE', Messages['MstUnitGrid.unitCode'], 20, 'primaryKey', null),
    Column.text('UNIT_NAME', Messages['MstUnitGrid.unitName'], 100, '', null),
    Column.select('STAN_UNIT_KBN', Messages['MstUnitGrid.stanUnitKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('STAN_UNIT_CODE', Messages['MstUnitGrid.stanUnitCode'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('EXCHANGE_RATE', Messages['MstUnitGrid.exchangeRate'], 160, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstUnitGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstUnitGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstUnitGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstUnitGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstUnitGrid.deleteFlag'], 10, ''),
];
