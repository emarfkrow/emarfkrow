/**
 * MST_STRUCTURE_BKグリッド定義
 */

let MstStructureBkGridColumns = [
    Column.cell('YY', Messages['MstStructureBkGrid.yy'], 40, 'primaryKey', null),
    Column.cell('MAN_HINBAN', Messages['MstStructureBkGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('HINBAN', Messages['MstStructureBkGrid.hinban'], 250, 'primaryKey', null),
    Column.text('COUNTS', Messages['MstStructureBkGrid.counts'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstStructureBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstStructureBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstStructureBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstStructureBkGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstStructureBkGrid.deleteFlag'], 10, ''),
    Column.check('BOZAI_F', Messages['MstStructureBkGrid.bozaiF'], 10, ''),
];
