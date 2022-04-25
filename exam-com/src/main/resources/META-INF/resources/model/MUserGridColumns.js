var MUserGridColumns = [
    Column.cell('USER_ID', Messages['MUserGrid.userId'], 100, 'primaryKey', null),
    Column.text('USER_SEI', Messages['MUserGrid.userSei'], 300, '', null),
    Column.text('USER_MEI', Messages['MUserGrid.userMei'], 300, '', null),
    Column.text('EMAIL', Messages['MUserGrid.email'], 300, '', null),
    Column.text('PASSWORD', Messages['MUserGrid.password'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MUserGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MUserGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MUserGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MUserGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MUserGrid.deleteF'], 10, ''),
];
