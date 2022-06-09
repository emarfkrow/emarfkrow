/**
 * 製品原価マスタグリッド定義
 */

let MSgenkaGridColumns = [
    Column.refer('HHINBAN', Messages['MSgenkaGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.text('HINCD', Messages['MSgenkaGrid.hincd'], 200, '', null),
    Column.select('SETKBN', Messages['MSgenkaGrid.setkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('GENKA', Messages['MSgenkaGrid.genka'], 70, '', null),
    Column.text('SEIHIN-GENKA', Messages['MSgenkaGrid.seihinGenka'], 70, '', null),
    Column.text('SHOHIN-GENKA', Messages['MSgenkaGrid.shohinGenka'], 70, '', null),
    Column.text('BAIKA', Messages['MSgenkaGrid.baika'], 70, '', null),
    Column.text('SEIHIN-BAIKA', Messages['MSgenkaGrid.seihinBaika'], 70, '', null),
    Column.text('SHOHIN-BAIKA', Messages['MSgenkaGrid.shohinBaika'], 70, '', null),
    Column.text('FILLER', Messages['MSgenkaGrid.filler'], 90, '', null),
];
