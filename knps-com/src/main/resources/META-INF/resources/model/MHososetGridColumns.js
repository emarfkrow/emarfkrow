/**
 * 包装材構成マスタグリッド定義
 */

let MHososetGridColumns = [
    Column.refer('HHINBAN', Messages['MHososetGrid.hhinban'], 200, 'primaryKey', 'HITEM'),
    Column.cell('HOSO-HINBAN', Messages['MHososetGrid.hosoHinban'], 250, 'primaryKey', null),
    Column.text('INZU', Messages['MHososetGrid.inzu'], 30, '', null),
    Column.text('FILLER', Messages['MHososetGrid.filler'], 220, '', null),
];
