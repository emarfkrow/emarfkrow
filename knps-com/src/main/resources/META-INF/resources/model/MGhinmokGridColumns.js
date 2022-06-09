/**
 * 原価用品目マスタグリッド定義
 */

let MGhinmokGridColumns = [
    Column.cell('HINBAN', Messages['MGhinmokGrid.hinban'], 250, 'primaryKey', null),
    Column.text('HINCD', Messages['MGhinmokGrid.hincd'], 200, '', null),
    Column.text('HINGENKA', Messages['MGhinmokGrid.hingenka'], 70, '', null),
    Column.date('RENKEIBI', Messages['MGhinmokGrid.renkeibi'], 80, '', null),
    Column.select('SHORIFLG', Messages['MGhinmokGrid.shoriflg'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('FILLER', Messages['MGhinmokGrid.filler'], 210, '', null),
];
