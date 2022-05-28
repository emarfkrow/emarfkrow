/**
 * PCH_TEMP_ORDER_DETグリッド定義
 */

let PchTempOrderDetGridColumns = [
    Column.cell('TEMP_ORDER_NO', Messages['PchTempOrderDetGrid.tempOrderNo'], 100, 'primaryKey', null),
    Column.cell('TEMP_ORDER_SEQ', Messages['PchTempOrderDetGrid.tempOrderSeq'], 100, 'primaryKey', null),
    Column.text('ORDER_NO', Messages['PchTempOrderDetGrid.orderNo'], 100, '', null),
    Column.text('KBN2', Messages['PchTempOrderDetGrid.kbn2'], 40, '', null),
    Column.text('ITEM', Messages['PchTempOrderDetGrid.item'], 300, '', null),
    Column.text('MATERIAL', Messages['PchTempOrderDetGrid.material'], 300, '', null),
    Column.text('ORDER_COUNTS_1', Messages['PchTempOrderDetGrid.orderCounts1'], 110, '', null),
    Column.text('UNIT_NAME', Messages['PchTempOrderDetGrid.unitName'], 100, '', null),
    Column.text('ORDER_COUNTS_2', Messages['PchTempOrderDetGrid.orderCounts2'], 110, '', null),
    Column.text('UNIT_NAME_2', Messages['PchTempOrderDetGrid.unitName2'], 100, '', null),
    Column.check('ISSHIKI_F', Messages['PchTempOrderDetGrid.isshikiF'], 10, ''),
    Column.check('FUTAI_F', Messages['PchTempOrderDetGrid.futaiF'], 10, ''),
    Column.text('IKKATSU_ORDER_NO', Messages['PchTempOrderDetGrid.ikkatsuOrderNo'], 100, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PchTempOrderDetGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PchTempOrderDetGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PchTempOrderDetGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PchTempOrderDetGrid.userIdChange'], 100, 'metaInfo', null),
];
