/**
 * MST_REASONグリッド定義
 */

let MstReasonGridColumns = [
    Column.cell('REASON_CODE', Messages['MstReasonGrid.reasonCode'], 30, 'primaryKey', null),
    Column.text('REASON_NAME', Messages['MstReasonGrid.reasonName'], 300, '', null),
    Column.select('REASON_KBN', Messages['MstReasonGrid.reasonKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.cell('TIME_STAMP_CREATE', Messages['MstReasonGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstReasonGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstReasonGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstReasonGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstReasonGrid.deleteFlag'], 10, ''),
];
