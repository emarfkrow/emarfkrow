/**
 * MST_PROCグリッド定義
 */

let MstProcGridColumns = [
    Column.cell('ROUTING_CODE', Messages['MstProcGrid.routingCode'], 100, 'primaryKey', null),
    Column.text('ROUTING_NAME', Messages['MstProcGrid.routingName'], 300, '', null),
    Column.text('ROUTING_NAME_SHT', Messages['MstProcGrid.routingNameSht'], 160, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstProcGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstProcGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstProcGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstProcGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstProcGrid.deleteFlag'], 10, ''),
    Column.text('EXCEL_COLOR_INDEX', Messages['MstProcGrid.excelColorIndex'], 20, '', null),
];
