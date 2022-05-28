/**
 * MST_SUP_EMPグリッド定義
 */

let MstSupEmpGridColumns = [
    Column.cell('SUPPLIER_OPE_CODE', Messages['MstSupEmpGrid.supplierOpeCode'], 100, 'primaryKey', null),
    Column.text('SUPPLIER_OPE_NAME', Messages['MstSupEmpGrid.supplierOpeName'], 300, '', null),
    Column.refer('EMP_CODE', Messages['MstSupEmpGrid.empCode'], 100, '', 'EMP_NAME'),
    Column.cell('TIME_STAMP_CREATE', Messages['MstSupEmpGrid.timeStampCreate'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('TIME_STAMP_CHANGE', Messages['MstSupEmpGrid.timeStampChange'], 70, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('USER_ID_CREATE', Messages['MstSupEmpGrid.userIdCreate'], 100, 'metaInfo', null),
    Column.cell('USER_ID_CHANGE', Messages['MstSupEmpGrid.userIdChange'], 100, 'metaInfo', null),
    Column.check('DELETE_FLAG', Messages['MstSupEmpGrid.deleteFlag'], 10, ''),
];
