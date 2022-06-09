/**
 * MST_STRUCTURE_BK_YMグリッド定義
 */

let MstStructureBkYmGridColumns = [
    Column.cell('YY', Messages['MstStructureBkYmGrid.yy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['MstStructureBkYmGrid.mm'], 20, 'primaryKey', null),
    Column.refer('MAN_HINBAN', Messages['MstStructureBkYmGrid.manHinban'], 250, 'primaryKey', 'MAN_HINMEI'),
    Column.cell('HINBAN', Messages['MstStructureBkYmGrid.hinban'], 250, 'primaryKey', null),
    Column.text('COUNTS', Messages['MstStructureBkYmGrid.counts'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstStructureBkYmGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstStructureBkYmGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstStructureBkYmGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstStructureBkYmGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstStructureBkYmGrid.deleteFlag'], 10, ''),
];
