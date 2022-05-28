/**
 * PRD_ORDERPOINT_CONDITIONグリッド定義
 */

let PrdOrderpointConditionGridColumns = [
    Column.cell('REC_NO', Messages['PrdOrderpointConditionGrid.recNo'], 30, 'primaryKey', null),
    Column.text('YYYY', Messages['PrdOrderpointConditionGrid.yyyy'], 40, '', null),
    Column.text('MM', Messages['PrdOrderpointConditionGrid.mm'], 20, '', null),
    Column.text('OPE_DAYS', Messages['PrdOrderpointConditionGrid.opeDays'], 20, '', null),
    Column.date('LAST_PROCESS_DATE', Messages['PrdOrderpointConditionGrid.lastProcessDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdOrderpointConditionGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdOrderpointConditionGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdOrderpointConditionGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdOrderpointConditionGrid.userIdChange'], 100, 'metaInfo', null),
];
