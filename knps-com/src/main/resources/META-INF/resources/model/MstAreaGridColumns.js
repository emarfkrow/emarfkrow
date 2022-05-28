/**
 * MST_AREAグリッド定義
 */

let MstAreaGridColumns = [
    Column.cell('AREA_CD', Messages['MstAreaGrid.areaCd'], 100, 'primaryKey', null),
    Column.text('AREA_MEI', Messages['MstAreaGrid.areaMei'], 300, '', null),
    Column.refer('SUB_INV_CODE', Messages['MstAreaGrid.subInvCode'], 100, '', 'SUB_INV_NAME'),
    Column.check('DELETE_F', Messages['MstAreaGrid.deleteF'], 10, ''),
    Column.cell('TIME_STAMP_CREATE', Messages['MstAreaGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstAreaGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstAreaGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstAreaGrid.userIdChange'], 100, 'metaInfo', null),
];
