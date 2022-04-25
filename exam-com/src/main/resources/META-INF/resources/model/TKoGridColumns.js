var TKoGridColumns = [
    Column.cell('SOSEN_ID', Messages['TKoGrid.sosenId'], 100, 'primaryKey', null),
    Column.cell('OYA_SN', Messages['TKoGrid.oyaSn'], 100, 'primaryKey', null),
    Column.cell('ENTITY_SN', Messages['TKoGrid.entitySn'], 100, 'primaryKey', null),
    Column.cell('KO_SN', Messages['TKoGrid.koSn'], 100, 'primaryKey', null),
    Column.text('KO_MEI', Messages['TKoGrid.koMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TKoGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TKoGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TKoGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TKoGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TKoGrid.deleteF'], 10, ''),
];
