var MShokuiGridColumns = [
    Column.cell('SHOKUI_ID', Messages['MShokuiGrid.shokuiId'], 100, 'primaryKey', null),
    Column.text('SHOKUI_MEI', Messages['MShokuiGrid.shokuiMei'], 300, '', null),
    Column.text('ORDER_ID', Messages['MShokuiGrid.orderId'], 100, '', null),
    Column.date('KAISHI_YMD', Messages['MShokuiGrid.kaishiYmd'], 100, '', null),
    Column.date('SHURYO_YMD', Messages['MShokuiGrid.shuryoYmd'], 100, '', null),
    Column.cell('INSERT_DT', Messages['MShokuiGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MShokuiGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MShokuiGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MShokuiGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MShokuiGrid.deleteF'], 10, ''),
];
