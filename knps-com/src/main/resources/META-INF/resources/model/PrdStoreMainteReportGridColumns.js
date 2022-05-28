/**
 * PRD_STORE_MAINTE_REPORTグリッド定義
 */

let PrdStoreMainteReportGridColumns = [
    Column.refer('REP_GROUP_CODE', Messages['PrdStoreMainteReportGrid.repGroupCode'], 20, 'primaryKey', 'REP_GROUP_NAME'),
    Column.text('GROUP_NAME', Messages['PrdStoreMainteReportGrid.groupName'], 200, '', null),
    Column.text('RETSU_NO', Messages['PrdStoreMainteReportGrid.retsuNo'], 30, '', null),
    Column.text('GYO_NO', Messages['PrdStoreMainteReportGrid.gyoNo'], 30, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdStoreMainteReportGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdStoreMainteReportGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdStoreMainteReportGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdStoreMainteReportGrid.userIdChange'], 100, 'metaInfo', null),
];
