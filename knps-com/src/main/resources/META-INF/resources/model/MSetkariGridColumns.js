/**
 * 仮セット構成マスタグリッド定義
 */

let MSetkariGridColumns = [
    Column.cell('SET-HINBAN', Messages['MSetkariGrid.setHinban'], 200, 'primaryKey', null),
    Column.cell('SET-KHINBAN', Messages['MSetkariGrid.setKhinban'], 200, 'primaryKey', null),
    Column.text('TOKUCD', Messages['MSetkariGrid.tokucd'], 80, '', null),
    Column.text('HINMEI', Messages['MSetkariGrid.hinmei'], 100, '', null),
    Column.text('KO-HINMEI', Messages['MSetkariGrid.koHinmei'], 100, '', null),
    Column.text('SETKBN', Messages['MSetkariGrid.setkbn'], 10, '', null),
    Column.text('SETINZU', Messages['MSetkariGrid.setinzu'], 30, '', null),
    Column.text('KO-TANKA', Messages['MSetkariGrid.koTanka'], 70, '', null),
    Column.text('MUSHOKBN', Messages['MSetkariGrid.mushokbn'], 10, '', null),
    Column.text('RTOKUMEI', Messages['MSetkariGrid.rtokumei'], 200, '', null),
];
