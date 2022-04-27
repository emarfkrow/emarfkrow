/**
 * 親グリッド定義
 */

let TOyaGridColumns = [
    Column.refer('SOSEN_ID', Messages['TOyaGrid.sosenId'], 100, 'primaryKey', 'SOSEN_MEI'),
    Column.cell('OYA_SN', Messages['TOyaGrid.oyaSn'], 100, 'primaryKey', null),
    Column.text('OYA_MEI', Messages['TOyaGrid.oyaMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TOyaGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TOyaGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TOyaGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TOyaGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TOyaGrid.deleteF'], 10, ''),
];
