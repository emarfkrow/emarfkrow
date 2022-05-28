/**
 * PRD_STORE_MAINTEグリッド定義
 */

let PrdStoreMainteGridColumns = [
    Column.cell('YYYY', Messages['PrdStoreMainteGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdStoreMainteGrid.mm'], 20, 'primaryKey', null),
    Column.cell('HINBAN', Messages['PrdStoreMainteGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('ROUTING', Messages['PrdStoreMainteGrid.routing'], 20, 'primaryKey', null),
    Column.refer('WC_CODE', Messages['PrdStoreMainteGrid.wcCode'], 30, '', 'WC_NAME'),
    Column.refer('LOCATION_CODE', Messages['PrdStoreMainteGrid.locationCode'], 100, '', 'LOCATION_NAME'),
    Column.text('LOT_SIZE', Messages['PrdStoreMainteGrid.lotSize'], 60, '', null),
    Column.text('KANBAN_ACC_COUNTS', Messages['PrdStoreMainteGrid.kanbanAccCounts'], 60, '', null),
    Column.text('PL_COUNTS', Messages['PrdStoreMainteGrid.plCounts'], 60, '', null),
    Column.text('KANBAN_COUNTS', Messages['PrdStoreMainteGrid.kanbanCounts'], 40, '', null),
    Column.text('FIT_POS', Messages['PrdStoreMainteGrid.fitPos'], 20, '', null),
    Column.text('KANBAN_ID', Messages['PrdStoreMainteGrid.kanbanId'], 90, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdStoreMainteGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdStoreMainteGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdStoreMainteGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdStoreMainteGrid.userIdChange'], 100, 'metaInfo', null),
];
