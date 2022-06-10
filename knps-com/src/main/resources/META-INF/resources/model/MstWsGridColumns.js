/**
 * MST_WSグリッド定義
 */

let MstWsGridColumns = [
    Column.cell('WS_CODE', Messages['MstWsGrid.wsCode'], 40, 'primaryKey', null),
    Column.text('WS_NAME', Messages['MstWsGrid.wsName'], 300, '', null),
    Column.select('IN_OUT_KBN', Messages['MstWsGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('HUM_NORM_ABILITY', Messages['MstWsGrid.humNormAbility'], 70, '', null),
    Column.text('HUM_MAX_ABILITY', Messages['MstWsGrid.humMaxAbility'], 70, '', null),
    Column.text('NORM_MEMBER', Messages['MstWsGrid.normMember'], 70, '', null),
    Column.select('ADMIN_CODE', Messages['MstWsGrid.adminCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('TEAM_CODE', Messages['MstWsGrid.teamCode'], 100, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SUP_CODE', Messages['MstWsGrid.supCode'], 60, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['MstWsGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstWsGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstWsGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstWsGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstWsGrid.deleteFlag'], 10, ''),
];
