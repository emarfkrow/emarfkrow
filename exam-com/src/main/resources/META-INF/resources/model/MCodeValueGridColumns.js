var MCodeValueGridColumns = [
    Column.cell('CODE_NM', Messages['MCodeValueGrid.codeNm'], 200, 'primaryKey', null),
    Column.cell('CODE_VALUE', Messages['MCodeValueGrid.codeValue'], 20, 'primaryKey', null),
    Column.text('CODE_VALUE_MEI', Messages['MCodeValueGrid.codeValueMei'], 300, '', null),
    Column.text('HYOJI_JUN', Messages['MCodeValueGrid.hyojiJun'], 100, '', null),
    Column.text('CRITERIA', Messages['MCodeValueGrid.criteria'], 300, '', null),
    Column.cell('INSERT_DT', Messages['MCodeValueGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MCodeValueGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MCodeValueGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MCodeValueGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MCodeValueGrid.deleteF'], 10, ''),
];
