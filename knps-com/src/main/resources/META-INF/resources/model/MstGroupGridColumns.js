/**
 * MST_GROUPグリッド定義
 */

let MstGroupGridColumns = [
    Column.cell('GROUP_CODE', Messages['MstGroupGrid.groupCode'], 100, 'primaryKey', null),
    Column.text('GROUP_NAME', Messages['MstGroupGrid.groupName'], 300, '', null),
    Column.select('ADMIN_CODE', Messages['MstGroupGrid.adminCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('DIVISION_CODE', Messages['MstGroupGrid.divisionCode'], 100, '', 'DIVISION_NAME'),
    Column.text('INDIVIDUAL_COUNTS', Messages['MstGroupGrid.individualCounts'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstGroupGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstGroupGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstGroupGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstGroupGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstGroupGrid.deleteFlag'], 10, ''),
];
