var MSansho2GridColumns = [
    Column.cell('SANSHO2_ID', Messages['MSansho2Grid.sansho2Id'], 100, 'primaryKey', null),
    Column.text('SANSHO2_MEI', Messages['MSansho2Grid.sansho2Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MSansho2Grid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MSansho2Grid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MSansho2Grid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MSansho2Grid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MSansho2Grid.deleteF'], 10, ''),
];
