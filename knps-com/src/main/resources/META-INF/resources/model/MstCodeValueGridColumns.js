/**
 * MST_CODE_VALUEグリッド定義
 */

let MstCodeValueGridColumns = [
    Column.refer('CODE_NM', Messages['MstCodeValueGrid.codeNm'], 300, 'primaryKey', 'CODE_MEI'),
    Column.cell('CODE_VALUE', Messages['MstCodeValueGrid.codeValue'], 20, 'primaryKey', null),
    Column.text('CODE_VALUE_MEI', Messages['MstCodeValueGrid.codeValueMei'], 300, '', null),
    Column.text('HYOJI_JUN', Messages['MstCodeValueGrid.hyojiJun'], 100, '', null),
    Column.text('CRITERIA', Messages['MstCodeValueGrid.criteria'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstCodeValueGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstCodeValueGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstCodeValueGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstCodeValueGrid.userIdChange'], 100, 'metaInfo', null),
];
