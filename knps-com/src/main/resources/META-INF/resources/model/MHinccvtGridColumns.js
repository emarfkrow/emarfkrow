/**
 * 品番変換マスタグリッド定義
 */

let MHinccvtGridColumns = [
    Column.cell('CVTHINBAN', Messages['MHinccvtGrid.cvthinban'], 200, 'primaryKey', null),
    Column.refer('HHINBAN', Messages['MHinccvtGrid.hhinban'], 200, '', 'HHINMEI'),
    Column.cell('CHOKUHINKBN', Messages['MHinccvtGrid.chokuhinkbn'], 10, 'primaryKey', null),
];
