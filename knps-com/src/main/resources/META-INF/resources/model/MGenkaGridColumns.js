/**
 * 原価マスタグリッド定義
 */

let MGenkaGridColumns = [
    Column.refer('HHINBAN', Messages['MGenkaGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.text('HINCD', Messages['MGenkaGrid.hincd'], 200, '', null),
    Column.select('SETKBN', Messages['MGenkaGrid.setkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('GENKA', Messages['MGenkaGrid.genka'], 70, '', null),
    Column.text('SEIHIN-GENKA', Messages['MGenkaGrid.seihinGenka'], 70, '', null),
    Column.text('SHOHIN-GENKA', Messages['MGenkaGrid.shohinGenka'], 70, '', null),
    Column.text('BAIKA', Messages['MGenkaGrid.baika'], 70, '', null),
    Column.text('SEIHIN-BAIKA', Messages['MGenkaGrid.seihinBaika'], 70, '', null),
    Column.text('SHOHIN-BAIKA', Messages['MGenkaGrid.shohinBaika'], 70, '', null),
    Column.text('FILLER', Messages['MGenkaGrid.filler'], 90, '', null),
];
