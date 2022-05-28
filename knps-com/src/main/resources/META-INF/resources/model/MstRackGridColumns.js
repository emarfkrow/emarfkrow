/**
 * MST_RACKグリッド定義
 */

let MstRackGridColumns = [
    Column.cell('MAN_HINBAN', Messages['MstRackGrid.manHinban'], 250, 'primaryKey', null),
    Column.text('RACK_NAME', Messages['MstRackGrid.rackName'], 300, '', null),
    Column.text('KAKESU', Messages['MstRackGrid.kakesu'], 30, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstRackGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstRackGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstRackGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstRackGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstRackGrid.deleteFlag'], 10, ''),
];
