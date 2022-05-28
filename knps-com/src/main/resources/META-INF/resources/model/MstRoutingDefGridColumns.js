/**
 * MST_ROUTING_DEFグリッド定義
 */

let MstRoutingDefGridColumns = [
    Column.cell('MAN_HINBAN', Messages['MstRoutingDefGrid.manHinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING_GROUP', Messages['MstRoutingDefGrid.routingGroup'], 20, 'primaryKey', null),
    Column.check('PERMISSION_FLAG', Messages['MstRoutingDefGrid.permissionFlag'], 10, ''),
    Column.check('USABLE_FLAG', Messages['MstRoutingDefGrid.usableFlag'], 10, ''),
    Column.text('MAX_ROUTING', Messages['MstRoutingDefGrid.maxRouting'], 20, '', null),
    Column.text('COPY_SOURCE_GROUP', Messages['MstRoutingDefGrid.copySourceGroup'], 20, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstRoutingDefGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstRoutingDefGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstRoutingDefGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstRoutingDefGrid.userIdChange'], 100, 'metaInfo', null),
];
