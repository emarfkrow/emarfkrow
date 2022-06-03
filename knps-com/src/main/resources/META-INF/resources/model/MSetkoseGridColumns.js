/**
 * セット構成マスタグリッド定義
 */

let MSetkoseGridColumns = [
    Column.cell('SET-HINBAN', Messages['MSetkoseGrid.setHinban'], 200, 'primaryKey', null),
    Column.cell('SET-KHINBAN', Messages['MSetkoseGrid.setKhinban'], 200, 'primaryKey', null),
    Column.text('DLTFLG', Messages['MSetkoseGrid.dltflg'], 10, '', null),
    Column.text('BOTM', Messages['MSetkoseGrid.botm'], 10, '', null),
    Column.text('SETINZU', Messages['MSetkoseGrid.setinzu'], 30, '', null),
    Column.text('MUSHOKBN', Messages['MSetkoseGrid.mushokbn'], 10, '', null),
    Column.text('FILLER', Messages['MSetkoseGrid.filler'], 300, '', null),
];
