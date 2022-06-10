/**
 * MST_DIVISIONグリッド定義
 */

let MstDivisionGridColumns = [
    Column.cell('DIVISION_CODE', Messages['MstDivisionGrid.divisionCode'], 100, 'primaryKey', null),
    Column.text('DIVISION_NAME', Messages['MstDivisionGrid.divisionName'], 300, '', null),
    Column.select('ADMIN_CODE', Messages['MstDivisionGrid.adminCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('COMPANY_CODE', Messages['MstDivisionGrid.companyCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['MstDivisionGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstDivisionGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstDivisionGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstDivisionGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstDivisionGrid.deleteFlag'], 10, ''),
];
