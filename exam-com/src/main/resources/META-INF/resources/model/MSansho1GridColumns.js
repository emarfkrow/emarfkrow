var MSansho1GridColumns = [
    Column.cell('SANSHO1_ID', Messages['MSansho1Grid.sansho1Id'], 100, 'primaryKey', null),
    Column.text('SANSHO1_MEI', Messages['MSansho1Grid.sansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MSansho1Grid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MSansho1Grid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MSansho1Grid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MSansho1Grid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MSansho1Grid.deleteF'], 10, ''),
];
