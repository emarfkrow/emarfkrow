/**
 * MST_EMPグリッド定義
 */

let MstEmpGridColumns = [
    Column.cell('EMP_CODE', Messages['MstEmpGrid.empCode'], 100, 'primaryKey', null),
    Column.text('EMP_NAME', Messages['MstEmpGrid.empName'], 300, '', null),
    Column.select('POSITION', Messages['MstEmpGrid.position'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('COMP_CODE', Messages['MstEmpGrid.compCode'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('PASSWORD', Messages['MstEmpGrid.password'], 100, '', null),
    Column.text('TEL_NO', Messages['MstEmpGrid.telNo'], 140, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstEmpGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstEmpGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstEmpGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstEmpGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstEmpGrid.deleteFlag'], 10, ''),
    Column.text('MAIL_ADDRESS', Messages['MstEmpGrid.mailAddress'], 300, '', null),
    Column.refer('DIVISION_CODE', Messages['MstEmpGrid.divisionCode'], 100, '', 'DIVISION_NAME'),
];
