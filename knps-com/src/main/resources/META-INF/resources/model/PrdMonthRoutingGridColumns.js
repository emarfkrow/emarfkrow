/**
 * PRD_MONTH_ROUTINGグリッド定義
 */

let PrdMonthRoutingGridColumns = [
    Column.cell('HINBAN', Messages['PrdMonthRoutingGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('YYYY', Messages['PrdMonthRoutingGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdMonthRoutingGrid.mm'], 20, 'primaryKey', null),
    Column.text('ROUTING_GROUP', Messages['PrdMonthRoutingGrid.routingGroup'], 20, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdMonthRoutingGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdMonthRoutingGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdMonthRoutingGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdMonthRoutingGrid.userIdChange'], 100, 'metaInfo', null),
];
