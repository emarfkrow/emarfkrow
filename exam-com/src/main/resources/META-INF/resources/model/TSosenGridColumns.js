var TSosenGridColumns = [
    Column.cell('SOSEN_ID', Messages['TSosenGrid.sosenId'], 100, 'primaryKey', null),
    Column.text('SOSEN_MEI', Messages['TSosenGrid.sosenMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TSosenGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TSosenGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TSosenGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TSosenGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TSosenGrid.deleteF'], 10, ''),
];
