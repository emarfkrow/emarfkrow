/**
 * バラ展開マスタグリッド定義
 */

let MBaratenGridColumns = [
    Column.cell('OYA-HINBAN', Messages['MBaratenGrid.oyaHinban'], 200, 'primaryKey', null),
    Column.cell('KO-HINBAN', Messages['MBaratenGrid.koHinban'], 200, 'primaryKey', null),
    Column.text('OYA-HINC', Messages['MBaratenGrid.oyaHinc'], 200, '', null),
    Column.text('KO-HINC', Messages['MBaratenGrid.koHinc'], 200, '', null),
    Column.text('INZU', Messages['MBaratenGrid.inzu'], 30, '', null),
    Column.text('OYA-BAIKA', Messages['MBaratenGrid.oyaBaika'], 70, '', null),
    Column.text('OYA-GENKA', Messages['MBaratenGrid.oyaGenka'], 70, '', null),
    Column.text('KO-TANKA', Messages['MBaratenGrid.koTanka'], 70, '', null),
    Column.text('KO-GENKA', Messages['MBaratenGrid.koGenka'], 70, '', null),
    Column.text('KO-TANRITU', Messages['MBaratenGrid.koTanritu'], 30, '', null),
    Column.text('KENSAKUM', Messages['MBaratenGrid.kensakum'], 40, '', null),
    Column.text('CASEKBN', Messages['MBaratenGrid.casekbn'], 10, '', null),
    Column.text('FILLER', Messages['MBaratenGrid.filler'], 160, '', null),
];
