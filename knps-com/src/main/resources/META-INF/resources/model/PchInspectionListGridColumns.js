/**
 * PCH_INSPECTION_LISTグリッド定義
 */

let PchInspectionListGridColumns = [
    Column.cell('TARGET_DATE', Messages['PchInspectionListGrid.targetDate'], 60, 'primaryKey', null),
    Column.cell('SUP_CODE', Messages['PchInspectionListGrid.supCode'], 60, 'primaryKey', null),
    Column.text('SUP_NAME', Messages['PchInspectionListGrid.supName'], 300, '', null),
    Column.cell('ORDER_NO', Messages['PchInspectionListGrid.orderNo'], 100, 'primaryKey', null),
    Column.text('HINBAN', Messages['PchInspectionListGrid.hinban'], 250, '', null),
    Column.text('ITEM', Messages['PchInspectionListGrid.item'], 300, '', null),
    Column.text('OPE_DETAIL', Messages['PchInspectionListGrid.opeDetail'], 100, '', null),
    Column.text('MEMO', Messages['PchInspectionListGrid.memo'], 300, '', null),
    Column.text('SUM_INSPECT_COUNTS', Messages['PchInspectionListGrid.sumInspectCounts'], 110, '', null),
    Column.text('INSPECT_UNIT', Messages['PchInspectionListGrid.inspectUnit'], 90, '', null),
    Column.date('ACCEPT_DATE', Messages['PchInspectionListGrid.acceptDate'], 70, '', Slick.Formatters.Extends.DateTime),
    Column.text('SUM_INSPECT_AMOUNT', Messages['PchInspectionListGrid.sumInspectAmount'], 110, '', null),
    Column.text('SUM_TAX_AMOUNT', Messages['PchInspectionListGrid.sumTaxAmount'], 110, '', null),
    Column.text('SUM_AMOUNT', Messages['PchInspectionListGrid.sumAmount'], 110, '', null),
    Column.text('SEND_INSPECT_LIST', Messages['PchInspectionListGrid.sendInspectList'], 10, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PchInspectionListGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchInspectionListGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchInspectionListGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchInspectionListGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('ISSHIKI_UNIT_F', Messages['PchInspectionListGrid.isshikiUnitF'], 10, ''),
];
