/**
 * MFG_ORDER_HINBAN_DEPLOYグリッド定義
 */

let MfgOrderHinbanDeployGridColumns = [
    Column.cell('REQID', Messages['MfgOrderHinbanDeployGrid.reqid'], 120, 'primaryKey', null),
    Column.cell('HINBAN', Messages['MfgOrderHinbanDeployGrid.hinban'], 250, 'primaryKey', null),
    Column.cell('DELIVERY_DATE', Messages['MfgOrderHinbanDeployGrid.deliveryDate'], 100, 'primaryKey', null),
    Column.refer('UNIT_CODE', Messages['MfgOrderHinbanDeployGrid.unitCode'], 20, '', 'UNIT_NAME'),
    Column.text('COUNTS', Messages['MfgOrderHinbanDeployGrid.counts'], 70, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MfgOrderHinbanDeployGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MfgOrderHinbanDeployGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MfgOrderHinbanDeployGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MfgOrderHinbanDeployGrid.userIdChange'], 100, 'metaInfo', null),
];
