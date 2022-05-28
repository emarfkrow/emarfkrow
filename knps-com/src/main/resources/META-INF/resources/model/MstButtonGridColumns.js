/**
 * MST_BUTTONグリッド定義
 */

let MstButtonGridColumns = [
    Column.text('GAMEN_ID', Messages['MstButtonGrid.gamenId'], 300, '', null),
    Column.cell('BTN_ID', Messages['MstButtonGrid.btnId'], 300, 'primaryKey', null),
    Column.text('BTN_NAME', Messages['MstButtonGrid.btnName'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstButtonGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstButtonGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstButtonGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstButtonGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstButtonGrid.deleteFlag'], 10, ''),
];
