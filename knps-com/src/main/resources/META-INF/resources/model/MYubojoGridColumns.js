/**
 * 有力店ボーナス条件グリッド定義
 */

let MYubojoGridColumns = [
    Column.cell('YURYOKUKBN', Messages['MYubojoGrid.yuryokukbn'], 10, 'primaryKey', null),
    Column.cell('YURYOCD', Messages['MYubojoGrid.yuryocd'], 80, 'primaryKey', null),
    Column.text('RYURYOKUMEI', Messages['MYubojoGrid.ryuryokumei'], 200, '', null),
    Column.text('KONYU-MIN', Messages['MYubojoGrid.konyuMin'], 90, '', null),
    Column.text('KONYU-MAX', Messages['MYubojoGrid.konyuMax'], 90, '', null),
    Column.text('YUBORITU', Messages['MYubojoGrid.yuboritu'], 20, '', null),
    Column.text('UPDDATE', Messages['MYubojoGrid.upddate'], 80, '', null),
];
