/**
 * MST_HINBAN_EMPグリッド定義
 */

let MstHinbanEmpGridColumns = [
    Column.cell('HINBAN_OPE_CODE', Messages['MstHinbanEmpGrid.hinbanOpeCode'], 100, 'primaryKey', null),
    Column.text('HINBAN_OPE_NAME', Messages['MstHinbanEmpGrid.hinbanOpeName'], 300, '', null),
    Column.select('EMP_CODE', Messages['MstHinbanEmpGrid.empCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['MstHinbanEmpGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstHinbanEmpGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstHinbanEmpGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstHinbanEmpGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstHinbanEmpGrid.deleteFlag'], 10, ''),
];
