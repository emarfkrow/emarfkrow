/**
 * MST_STRUCTUREグリッド定義
 */

let MstStructureGridColumns = [
    Column.cell('MAN_HINBAN', Messages['MstStructureGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('HINBAN', Messages['MstStructureGrid.hinban'], 250, 'primaryKey', null),
    Column.text('COUNTS', Messages['MstStructureGrid.counts'], 110, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstStructureGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstStructureGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstStructureGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstStructureGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstStructureGrid.deleteFlag'], 10, ''),
    Column.check('BOZAI_F', Messages['MstStructureGrid.bozaiF'], 10, ''),
];
