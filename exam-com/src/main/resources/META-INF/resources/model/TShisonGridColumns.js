var TShisonGridColumns = [
    Column.refer('SOSEN_ID', Messages['TShisonGrid.sosenId'], 100, 'primaryKey', '_id', '_mei'),
    Column.cell('OYA_SN', Messages['TShisonGrid.oyaSn'], 100, 'primaryKey', null),
    Column.cell('ENTITY_SN', Messages['TShisonGrid.entitySn'], 100, 'primaryKey', null),
    Column.cell('KO_SN', Messages['TShisonGrid.koSn'], 100, 'primaryKey', null),
    Column.cell('SHISON_SN', Messages['TShisonGrid.shisonSn'], 100, 'primaryKey', null),
    Column.text('SHISON_MEI', Messages['TShisonGrid.shisonMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TShisonGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TShisonGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TShisonGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TShisonGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TShisonGrid.deleteF'], 10, ''),
];
