/**
 * バーコードマスタグリッド定義
 */

let MBarcdGridColumns = [
    Column.cell('HHINBAN', Messages['MBarcdGrid.hhinban'], 200, 'primaryKey', null),
    Column.text('HINMEI', Messages['MBarcdGrid.hinmei'], 100, '', null),
    Column.text('BARCODE', Messages['MBarcdGrid.barcode'], 130, '', null),
    Column.text('FREE1', Messages['MBarcdGrid.free1'], 150, '', null),
    Column.text('FREE2', Messages['MBarcdGrid.free2'], 100, '', null),
    Column.text('FREE3', Messages['MBarcdGrid.free3'], 100, '', null),
];
