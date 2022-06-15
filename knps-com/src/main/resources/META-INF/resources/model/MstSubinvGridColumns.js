/**
 * MST_SUBINVグリッド定義
 */

let MstSubinvGridColumns = [
    Column.cell('SUB_INV_CODE', Messages['MstSubinvGrid.subInvCode'], 100, 'primaryKey', null),
    Column.text('SUB_INV_NAME', Messages['MstSubinvGrid.subInvName'], 300, '', null),
    Column.select('MANAGE_KBN', Messages['MstSubinvGrid.manageKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('IN_OUT_KBN', Messages['MstSubinvGrid.inOutKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('SUP_CODE', Messages['MstSubinvGrid.supCode'], 60, '', 'SUP_NAME'),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSubinvGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSubinvGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSubinvGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSubinvGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSubinvGrid.deleteFlag'], 10, ''),
];
