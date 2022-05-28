/**
 * MST_MATERIALグリッド定義
 */

let MstMaterialGridColumns = [
    Column.cell('MATERIAL', Messages['MstMaterialGrid.material'], 50, 'primaryKey', null),
    Column.text('MATERIAL_NAME', Messages['MstMaterialGrid.materialName'], 300, '', null),
    Column.cell('TIME_STAMP_CREATE', Messages['MstMaterialGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstMaterialGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstMaterialGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstMaterialGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstMaterialGrid.deleteFlag'], 10, ''),
];
