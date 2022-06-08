/**
 * セール品目マスタグリッド定義
 */

let MSalehinGridColumns = [
    Column.cell('SALEKBN', Messages['MSalehinGrid.salekbn'], 20, 'primaryKey', null),
    Column.text('SALEMEI', Messages['MSalehinGrid.salemei'], 200, '', null),
    Column.refer('HHINBAN', Messages['MSalehinGrid.hhinban'], 200, 'primaryKey', 'HITEM'),
    Column.cell('KAISI-YY', Messages['MSalehinGrid.kaisiYy'], 40, 'primaryKey', null),
    Column.cell('KAISI-MM', Messages['MSalehinGrid.kaisiMm'], 20, 'primaryKey', null),
    Column.cell('KAISI-DD', Messages['MSalehinGrid.kaisiDd'], 20, 'primaryKey', null),
    Column.cell('SHURYO-YY', Messages['MSalehinGrid.shuryoYy'], 40, 'primaryKey', null),
    Column.cell('SHURYO-MM', Messages['MSalehinGrid.shuryoMm'], 20, 'primaryKey', null),
    Column.cell('SHURYO-DD', Messages['MSalehinGrid.shuryoDd'], 20, 'primaryKey', null),
    Column.text('FILLER', Messages['MSalehinGrid.filler'], 300, '', null),
];
