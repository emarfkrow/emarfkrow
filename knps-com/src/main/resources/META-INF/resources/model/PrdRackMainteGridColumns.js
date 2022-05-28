/**
 * PRD_RACK_MAINTEグリッド定義
 */

let PrdRackMainteGridColumns = [
    Column.cell('YYYY', Messages['PrdRackMainteGrid.yyyy'], 40, 'primaryKey', null),
    Column.cell('MM', Messages['PrdRackMainteGrid.mm'], 20, 'primaryKey', null),
    Column.cell('RACK_NAME', Messages['PrdRackMainteGrid.rackName'], 300, 'primaryKey', null),
    Column.text('RACK_NES_COUNTS', Messages['PrdRackMainteGrid.rackNesCounts'], 30, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['PrdRackMainteGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['PrdRackMainteGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['PrdRackMainteGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['PrdRackMainteGrid.userIdChange'], 100, 'metaInfo', null),
];
