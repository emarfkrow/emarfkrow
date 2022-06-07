/**
 * 包装材構成マスタグリッド定義
 */

let MHososetGridColumns = [
    Column.refer('HHINBAN', Messages['MHososetGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.refer('HOSO-HINBAN', Messages['MHososetGrid.hosoHinban'], 250, 'primaryKey', 'HOSO_HINMEI'),
    Column.text('INZU', Messages['MHososetGrid.inzu'], 30, '', null),
    Column.text('FILLER', Messages['MHososetGrid.filler'], 220, '', null),
];
