var MShozokuGridColumns = [
    Column.cell('BUSHO_ID', Messages['MShozokuGrid.bushoId'], 100, 'primaryKey', null),
    Column.cell('SHOKUI_ID', Messages['MShozokuGrid.shokuiId'], 100, 'primaryKey', null),
    Column.cell('USER_ID', Messages['MShozokuGrid.userId'], 100, 'primaryKey', null),
    Column.date('KAISHI_YMD', Messages['MShozokuGrid.kaishiYmd'], 100, '', null),
    Column.date('SHURYO_YMD', Messages['MShozokuGrid.shuryoYmd'], 100, '', null),
    Column.cell('INSERT_DT', Messages['MShozokuGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MShozokuGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MShozokuGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MShozokuGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MShozokuGrid.deleteF'], 10, ''),
];
