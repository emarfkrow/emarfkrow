/**
 * INV_INVENTORYグリッド定義
 */

let InvInventoryGridColumns = [
    Column.cell('LOCATION_CODE', Messages['InvInventoryGrid.locationCode'], 100, 'primaryKey', null),
    Column.cell('HINBAN', Messages['InvInventoryGrid.hinban'], 250, 'primaryKey', null),
    Column.text('GOOD_STOCK', Messages['InvInventoryGrid.goodStock'], 120, '', null),
    Column.text('BAD_STOCK', Messages['InvInventoryGrid.badStock'], 120, '', null),
    Column.date('LATEST_IN_DATE', Messages['InvInventoryGrid.latestInDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.date('LATEST_OUT_DATE', Messages['InvInventoryGrid.latestOutDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.select('REMAINS_KBN', Messages['InvInventoryGrid.remainsKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.refer('REASON_CODE', Messages['InvInventoryGrid.reasonCode'], 30, '', 'REASON_NAME'),
    Column.text('NOTE', Messages['InvInventoryGrid.note'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['InvInventoryGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['InvInventoryGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['InvInventoryGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['InvInventoryGrid.userIdChange'], 100, 'metaInfo', null),
];
