/**
 * セット構成マスタグリッド定義
 */

let MSetkoseGridColumns = [
    Column.refer('SET-HINBAN', Messages['MSetkoseGrid.setHinban'], 200, 'primaryKey', 'SET_HINMEI'),
    Column.refer('SET-KHINBAN', Messages['MSetkoseGrid.setKhinban'], 200, 'primaryKey', 'SET_KHINMEI'),
    Column.check('DLTFLG', Messages['MSetkoseGrid.dltflg'], 10, ''),
    Column.text('BOTM', Messages['MSetkoseGrid.botm'], 10, '', null),
    Column.text('SETINZU', Messages['MSetkoseGrid.setinzu'], 30, '', null),
    Column.select('MUSHOKBN', Messages['MSetkoseGrid.mushokbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
];
