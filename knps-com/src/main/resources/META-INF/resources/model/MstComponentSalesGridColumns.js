/**
 * MST_COMPONENT_SALESグリッド定義
 */

let MstComponentSalesGridColumns = [
    Column.cell('COMP_HINBAN_PARENT', Messages['MstComponentSalesGrid.compHinbanParent'], 200, 'primaryKey', null),
    Column.cell('COMP_HINBAN_CHILD', Messages['MstComponentSalesGrid.compHinbanChild'], 200, 'primaryKey', null),
    Column.text('SET_NUMBER', Messages['MstComponentSalesGrid.setNumber'], 30, '', null),
    Column.check('BOTTOM_FLAG', Messages['MstComponentSalesGrid.bottomFlag'], 10, ''),
    Column.select('PROVISIONS_KBN', Messages['MstComponentSalesGrid.provisionsKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['MstComponentSalesGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstComponentSalesGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstComponentSalesGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstComponentSalesGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstComponentSalesGrid.deleteFlag'], 10, ''),
];
