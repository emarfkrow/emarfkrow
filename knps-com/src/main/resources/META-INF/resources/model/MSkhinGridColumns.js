/**
 * ＳＫ品番マスタグリッド定義
 */

let MSkhinGridColumns = [
    Column.refer('HHINBAN', Messages['MSkhinGrid.hhinban'], 200, 'primaryKey', 'HHINMEI'),
    Column.select('SKKBN', Messages['MSkhinGrid.skkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
];
