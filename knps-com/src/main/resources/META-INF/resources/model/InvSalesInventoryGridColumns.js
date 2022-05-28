/**
 * INV_SALES_INVENTORYグリッド定義
 */

let InvSalesInventoryGridColumns = [
    Column.cell('SALES_HINBAN', Messages['InvSalesInventoryGrid.salesHinban'], 200, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvSalesInventoryGrid.hinban'], 250, 'primaryKey', null),
    Column.text('INVENTORY', Messages['InvSalesInventoryGrid.inventory'], 110, '', null),
    Column.refer('LOCATION_CODE', Messages['InvSalesInventoryGrid.locationCode'], 100, '', 'LOCATION_NAME'),
    Column.date('LAST_DOWNLOAD_DATE', Messages['InvSalesInventoryGrid.lastDownloadDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['InvSalesInventoryGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvSalesInventoryGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvSalesInventoryGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvSalesInventoryGrid.userIdChange'], 100, 'metaInfo', null),
];
