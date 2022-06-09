/**
 * 品番変換マスタグリッド定義
 */

let MHinccvtGridColumns = [
    Column.refer('CVTHINBAN', Messages['MHinccvtGrid.cvthinban'], 200, 'primaryKey', 'CVTHINMEI'),
    Column.refer('HHINBAN', Messages['MHinccvtGrid.hhinban'], 200, '', 'HHINMEI'),
    Column.cell('CHOKUHINKBN', Messages['MHinccvtGrid.chokuhinkbn'], 10, 'primaryKey', null),
    Column.text('FILLER', Messages['MHinccvtGrid.filler'], 90, '', null),
];
