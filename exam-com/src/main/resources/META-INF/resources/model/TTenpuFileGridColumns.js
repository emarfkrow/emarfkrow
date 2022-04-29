/**
 * 添付ファイルグリッド定義
 */

let TTenpuFileGridColumns = [
    Column.refer('SOSEN_ID', Messages['TTenpuFileGrid.sosenId'], 100, 'primaryKey', 'SOSEN_MEI'),
    Column.cell('OYA_SN', Messages['TTenpuFileGrid.oyaSn'], 100, 'primaryKey', null),
    Column.cell('ENTITY_SN', Messages['TTenpuFileGrid.entitySn'], 100, 'primaryKey', null),
    Column.cell('TENPU_FILE_SN', Messages['TTenpuFileGrid.tenpuFileSn'], 100, 'primaryKey', null),
    Column.text('TENPU_FILE', Messages['TTenpuFileGrid.tenpuFile'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TTenpuFileGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TTenpuFileGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TTenpuFileGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TTenpuFileGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TTenpuFileGrid.deleteF'], 10, ''),
];
