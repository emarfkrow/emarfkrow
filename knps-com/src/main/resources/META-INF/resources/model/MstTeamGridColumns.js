/**
 * MST_TEAMグリッド定義
 */

let MstTeamGridColumns = [
    Column.cell('TEAM_CODE', Messages['MstTeamGrid.teamCode'], 100, 'primaryKey', null),
    Column.text('TEAM_NAME', Messages['MstTeamGrid.teamName'], 300, '', null),
    Column.select('ADMIN_CODE', Messages['MstTeamGrid.adminCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('GROUP_CODE', Messages['MstTeamGrid.groupCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('INDIVIDUAL_COUNTS', Messages['MstTeamGrid.individualCounts'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstTeamGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstTeamGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstTeamGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstTeamGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstTeamGrid.deleteFlag'], 10, ''),
];
