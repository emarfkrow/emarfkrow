/**
 * MFG_SHIP_ORDERグリッド定義
 */

let MfgShipOrderGridColumns = [
    Column.cell('SHIP_ORDER_NO', Messages['MfgShipOrderGrid.shipOrderNo'], 120, 'primaryKey', null),
    Column.text('CHILD_PLAN_NO', Messages['MfgShipOrderGrid.childPlanNo'], 120, '', null),
    Column.text('HINBAN', Messages['MfgShipOrderGrid.hinban'], 250, '', null),
    Column.text('SHIP_DIRECT_COUNTS', Messages['MfgShipOrderGrid.shipDirectCounts'], 110, '', null),
    Column.text('SHIP_STATUS', Messages['MfgShipOrderGrid.shipStatus'], 10, '', null),
    Column.text('SHIP_COUNTS', Messages['MfgShipOrderGrid.shipCounts'], 110, '', null),
    Column.date('SHIP_DATE', Messages['MfgShipOrderGrid.shipDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgShipOrderGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgShipOrderGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgShipOrderGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgShipOrderGrid.userIdChange'], 100, 'metaInfo', null),
];
