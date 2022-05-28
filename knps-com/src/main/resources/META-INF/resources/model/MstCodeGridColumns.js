/**
 * MST_CODEグリッド定義
 */

let MstCodeGridColumns = [
    Column.cell('CODE_NM', Messages['MstCodeGrid.codeNm'], 300, 'primaryKey', null),
    Column.text('CODE_MEI', Messages['MstCodeGrid.codeMei'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstCodeGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstCodeGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstCodeGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstCodeGrid.userIdChange'], 100, 'metaInfo', null),
];
