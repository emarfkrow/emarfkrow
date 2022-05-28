/**
 * MST_COMPANYグリッド定義
 */

let MstCompanyGridColumns = [
    Column.cell('COMPANY_CODE', Messages['MstCompanyGrid.companyCode'], 100, 'primaryKey', null),
    Column.text('COMPANY_NAME', Messages['MstCompanyGrid.companyName'], 300, '', null),
    Column.select('ADMIN_CODE', Messages['MstCompanyGrid.adminCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['MstCompanyGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstCompanyGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstCompanyGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstCompanyGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstCompanyGrid.deleteFlag'], 10, ''),
];
