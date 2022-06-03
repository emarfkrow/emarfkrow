/**
 * 包装材構成マスタグリッド定義
 */

let MHososetGridColumns = [
    Column.cell('HHINBAN', Messages['MHososetGrid.hhinban'], 200, 'primaryKey', null),
    Column.cell('HOSO-HINBAN', Messages['MHososetGrid.hosoHinban'], 250, 'primaryKey', null),
    Column.text('INZU', Messages['MHososetGrid.inzu'], 30, '', null),
    Column.text('FILLER', Messages['MHososetGrid.filler'], 220, '', null),
];
