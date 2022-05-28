/**
 * PCH_PROD_TOTAL_INFグリッド定義
 */

let PchProdTotalInfGridColumns = [
    Column.cell('CLOSE_DATE', Messages['PchProdTotalInfGrid.closeDate'], 40, 'primaryKey', null),
    Column.cell('ROUTING_GROUP', Messages['PchProdTotalInfGrid.routingGroup'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PchProdTotalInfGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['PchProdTotalInfGrid.routing'], 20, 'primaryKey', null),
    Column.text('TOTAL_COUNTS', Messages['PchProdTotalInfGrid.totalCounts'], 110, '', null),
    Column.text('TOTAL_AMOUNT', Messages['PchProdTotalInfGrid.totalAmount'], 130, '', null),
    Column.text('SUM_SUPPLY', Messages['PchProdTotalInfGrid.sumSupply'], 130, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PchProdTotalInfGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchProdTotalInfGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchProdTotalInfGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchProdTotalInfGrid.userIdChange'], 100, 'metaInfo', null),
];
