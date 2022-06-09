/**
 * MST_ROUTING_DEF_BKグリッド定義
 */

let MstRoutingDefBkGridColumns = [
    Column.cell('YY', Messages['MstRoutingDefBkGrid.yy'], 40, 'primaryKey', null),
    Column.refer('MAN_HINBAN', Messages['MstRoutingDefBkGrid.manHinban'], 250, 'primaryKey', 'MAN_HINMEI'),
    Column.cell('ROUTING_GROUP', Messages['MstRoutingDefBkGrid.routingGroup'], 20, 'primaryKey', null),
    Column.check('PERMISSION_FLAG', Messages['MstRoutingDefBkGrid.permissionFlag'], 10, ''),
    Column.check('USABLE_FLAG', Messages['MstRoutingDefBkGrid.usableFlag'], 10, ''),
    Column.text('MAX_ROUTING', Messages['MstRoutingDefBkGrid.maxRouting'], 20, '', null),
    Column.text('COPY_SOURCE_GROUP', Messages['MstRoutingDefBkGrid.copySourceGroup'], 20, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstRoutingDefBkGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstRoutingDefBkGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstRoutingDefBkGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstRoutingDefBkGrid.userIdChange'], 100, 'metaInfo', null),
];
