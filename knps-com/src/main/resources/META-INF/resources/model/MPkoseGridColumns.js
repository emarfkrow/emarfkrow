/**
 * 部品構成マスタグリッド定義
 */

let MPkoseGridColumns = [
    Column.refer('HHINBAN', Messages['MPkoseGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.text('HINMEI', Messages['MPkoseGrid.hinmei'], 100, '', null),
    Column.cell('PHINBAN', Messages['MPkoseGrid.phinban'], 200, 'primaryKey', null),
    Column.text('PHINMEI', Messages['MPkoseGrid.phinmei'], 200, '', null),
    Column.date('TOUROKUBI', Messages['MPkoseGrid.tourokubi'], 80, '', null),
];
