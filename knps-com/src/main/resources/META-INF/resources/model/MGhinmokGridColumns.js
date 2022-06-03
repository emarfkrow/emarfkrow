/**
 * 原価用品目マスタグリッド定義
 */

let MGhinmokGridColumns = [
    Column.cell('HINBAN', Messages['MGhinmokGrid.hinban'], 250, 'primaryKey', null),
    Column.text('HINCD', Messages['MGhinmokGrid.hincd'], 200, '', null),
    Column.text('HINGENKA', Messages['MGhinmokGrid.hingenka'], 70, '', null),
    Column.text('RENKEIBI', Messages['MGhinmokGrid.renkeibi'], 80, '', null),
    Column.text('SHORIFLG', Messages['MGhinmokGrid.shoriflg'], 10, '', null),
    Column.text('FILLER', Messages['MGhinmokGrid.filler'], 210, '', null),
];
