/**
 * MST_IDグリッド定義
 */

let MstIdGridColumns = [
    Column.cell('ID_TYPE', Messages['MstIdGrid.idType'], 0, 'primaryKey', null),
    Column.text('ID', Messages['MstIdGrid.id'], 0, '', null),
    Column.text('ID_MAX', Messages['MstIdGrid.idMax'], 0, '', null),
    Column.text('ID_MIN', Messages['MstIdGrid.idMin'], 0, '', null),
    Column.text('ID_COMMENT', Messages['MstIdGrid.idComment'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstIdGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstIdGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
];
