var MCodeGridColumns = [
    Column.cell('CODE_NM', Messages['MCodeGrid.codeNm'], 200, 'primaryKey', null),
    Column.text('CODE_MEI', Messages['MCodeGrid.codeMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MCodeGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MCodeGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MCodeGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MCodeGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MCodeGrid.deleteF'], 10, ''),
];
