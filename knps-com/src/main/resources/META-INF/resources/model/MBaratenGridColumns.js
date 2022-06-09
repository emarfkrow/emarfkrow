/**
 * バラ展開マスタグリッド定義
 */

let MBaratenGridColumns = [
    Column.refer('OYA-HINBAN', Messages['MBaratenGrid.oyaHinban'], 200, 'primaryKey', 'OYA_HINMEI'),
    Column.refer('KO-HINBAN', Messages['MBaratenGrid.koHinban'], 200, 'primaryKey', 'KO_HINMEI'),
    Column.text('OYA-HINC', Messages['MBaratenGrid.oyaHinc'], 200, '', null),
    Column.text('KO-HINC', Messages['MBaratenGrid.koHinc'], 200, '', null),
    Column.text('INZU', Messages['MBaratenGrid.inzu'], 30, '', null),
    Column.text('OYA-BAIKA', Messages['MBaratenGrid.oyaBaika'], 70, '', null),
    Column.text('OYA-GENKA', Messages['MBaratenGrid.oyaGenka'], 70, '', null),
    Column.text('KO-TANKA', Messages['MBaratenGrid.koTanka'], 70, '', null),
    Column.text('KO-GENKA', Messages['MBaratenGrid.koGenka'], 70, '', null),
    Column.text('KO-TANRITU', Messages['MBaratenGrid.koTanritu'], 30, '', null),
    Column.text('KENSAKUM', Messages['MBaratenGrid.kensakum'], 40, '', null),
    Column.select('CASEKBN', Messages['MBaratenGrid.casekbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('FILLER', Messages['MBaratenGrid.filler'], 160, '', null),
];
