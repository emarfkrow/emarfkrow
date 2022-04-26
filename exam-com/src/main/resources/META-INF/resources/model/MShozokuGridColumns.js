var MShozokuGridColumns = [
    Column.refer('BUSHO_ID', Messages['MShozokuGrid.bushoId'], 100, 'primaryKey', '_id', '_mei'),
    Column.refer('SHOKUI_ID', Messages['MShozokuGrid.shokuiId'], 100, 'primaryKey', '_id', '_mei'),
    Column.refer('USER_ID', Messages['MShozokuGrid.userId'], 100, 'primaryKey', '_id', '_mei'),
    Column.date('KAISHI_YMD', Messages['MShozokuGrid.kaishiYmd'], 100, '', null),
    Column.date('SHURYO_YMD', Messages['MShozokuGrid.shuryoYmd'], 100, '', null),
    Column.cell('INSERT_DT', Messages['MShozokuGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MShozokuGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MShozokuGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MShozokuGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MShozokuGrid.deleteF'], 10, ''),
];
